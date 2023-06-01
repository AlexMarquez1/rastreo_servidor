package com.rastreo.servicioRastreo.service;

import java.io.IOException;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.*;
import com.google.firebase.messaging.AndroidConfig.Priority;

@Service
public class FirebaseMessagingService {
	

	private FirebaseApp firebaseApp;
	
	  
	  @PostConstruct
	  void initialize() throws IOException {
			try {
				FirebaseOptions options = new FirebaseOptions.Builder()
	                    .setCredentials(GoogleCredentials.fromStream(new ClassPathResource("firebase-service-account.json").getInputStream())).build();

	            if (FirebaseApp.getApps().isEmpty()) {
	                this.firebaseApp = FirebaseApp.initializeApp(options);
	            } else {
	                this.firebaseApp = FirebaseApp.getInstance();
	            }

			    
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}

		}
	 

    public String sendNotification(Map<String,String> information, Map<String, String>  data, String token) throws FirebaseMessagingException {

        Notification notification = Notification
                .builder()
                .setTitle(information.get("title"))
                .setBody(information.get("body"))
                .setImage(information.get("image"))
                .build();
        
        AndroidNotification androidNotification = AndroidNotification
        		.builder()
        		.setChannelId("notificacion_viaje")
        		.setClickAction("")
        		.setSound("notification.mpeg")
        		.setImage("https://firebasestorage.googleapis.com/v0/b/isae-de6da.appspot.com/o/Imagenes%2FMarcadores%2FMark-Truck.png?alt=media&token=69964d8f-4669-4bbd-a3e2-39f742441f7c")
        		.build();
        
        AndroidConfig androidConfig = AndroidConfig
        		.builder()
        		.setNotification(androidNotification)
        		.build();

//        Message message = Message
//                .builder()
//                .setToken(token)
//                .setNotification(notification)
//                .putAllData(data)
//                .build();
        
        Message message = Message
                .builder()
                .setToken(token)
                .setNotification(notification)
                .setAndroidConfig(androidConfig)
                .putAllData(data)
                .build();
        
        
        String respuesta = "";
        
        try {
        	respuesta = FirebaseMessaging.getInstance().send(message);
        	return respuesta;
		} catch (Exception e) {
			return e.toString();
		}

    }

}
