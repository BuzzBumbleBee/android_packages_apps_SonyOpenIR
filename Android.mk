LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE_TAGS := optional

LOCAL_SRC_FILES := $(call all-subdir-java-files)

LOCAL_PACKAGE_NAME := SonyOpenIR

LOCAL_CERTIFICATE := platform

LOCAL_JNI_SHARED_LIBRARIES := libjni_sonyopenir
LOCAL_REQUIRED_MODULES := libjni_sonyopenir

include $(BUILD_PACKAGE)

include $(call all-makefiles-under, jni)
include $(call all-makefiles-under,$(LOCAL_PATH))
