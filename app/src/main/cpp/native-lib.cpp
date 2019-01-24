#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_liubao_cv_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jobject JNICALL
Java_com_liubao_cv_CVNativeLib_nativeProcess(
        JNIEnv *env,
        jobject obj,
        jobject sharedImageData
        ) {
    jclass imageData = env->GetObjectClass(sharedImageData);

}