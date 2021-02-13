# Human Activity Recognition using Smartphone

## Introduction:-

This project senses human activity with the help of an app installed in the smartphone which uses ML to predict from the data collected from sensors present in the phone. This project is handled by the DSC ML Team of NIT Patna

## Which Sensors we use to get the data:-

1. Accelerometer

2. Gyroscope

## How it works?

Once we collect the data we will be preprocessing the data and train it using LSTM or further more advanced models. Then finally we would be predicting the activity.

## Activities It Tracks:-

1. WALKING
2. WALKING_UPSTAIRS
3. WALKING_DOWNSTAIRS
4. SITTING
5. STANDING
6. LAYING


## Tasks Involved:-

1. Firstly we need to make a android app and integrate with firebase for collecting the data
2. Then we need to preprocess the data
3. Create a ML Model
4. Need to deploy the model in Mobile
5. Make it avalaible in Playstore

# Approaches Used:-

We used 2 Different Strategies in order to achieve the accuracy. They are

1. We took each frame of the data into 128 steps and created 561 different possible calculations and passed them using machine learning algorithms like Logistic Regression ,KNN ,Decision Trees ,Random Forest ,Support Vector Machine etc.

   The below is the metrics which are resulted from above method.  

| Model Name             	| Accuracy Acheived 	|
|------------------------	|-------------------	|
| Logistic Regression    	| 98.66%            	|
| Support Vector Machine 	| 93.42%            	|
| XGBoost                	| 98.73%            	|
| Linear SVM             	| 96%               	|
| Decision Tree          	| 92.5%             	|
| Random Forest          	| 92.5%             	|
| KNN                    	| 91%               	|

2. We took each frame of data and passed it to the recurrent neural network i.e LSTM and predicted the activity it belongs to.  

   The below is the metrics which are resulted from above department.  

| Model Name   	| Accuracy 	|
|--------------	|----------	|
| Stacked LSTM 	| 91.78%   	|


## Maintainers of this Project:-

* [Sai Durga Kamesh Kota](https://github.com/ksdkamesh99)
* [Raj Kothari](https://github.com/rajkothari634)
* [Aparna Juhi](https://github.com/AparnaJuhi)
