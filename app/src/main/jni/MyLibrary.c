#include <jni.h>
#include <stdio.h>


JNIEXPORT jstring JNICALL
Java_com_lizheng_www_ndk01_MyNdk_getString
(JNIEnv *env, jclass obj, jstring str) {
char *getstr = (*env)->GetStringUTFChars(env, str, NULL);
    int length = (*env)->GetStringUTFLength(env, str);

    char temp;
    int i ;

    for (  i = 0; i < length / 2; i ++) {


        temp = getstr[i];
        getstr[i] = getstr[length - i - 1];
        getstr[length - i - 1] = temp;


    }

    return (*env)->NewStringUTF(env, getstr);
}

