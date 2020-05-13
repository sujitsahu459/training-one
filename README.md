# Dependency Injection in Kotlin 

Dependency Injection in build upon the concept of Inversion of Control. Which says that a class should get its dependencies from outside.In simple words, no class should instantiate another class but should get the instances from a configuration class.

The most important advantage is that it increases the possibility of reusing the class and to be able to test them independent of other classes.

# Mode of injections & Order 
1. Constrctory 
2. Field 
3. Method 

## Dagger Gradle Dependecies 
```sh
    implementation 'com.google.dagger:dagger-android:2.23.2'
    kapt 'com.google.dagger:dagger-android-processor:2.23.2'
    kapt 'com.google.dagger:dagger-compiler:2.25.3'
    implementation "com.google.dagger:dagger:2.25.3"
    
    Note: Dont forge to add 
    
    apply plugin: 'kotlin-kapt'
```

