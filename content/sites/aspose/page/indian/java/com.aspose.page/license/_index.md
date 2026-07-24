---
title: "लाइसेंस"
second_title: "Aspose.Page for Java API संदर्भ"
description: "घटक को लाइसेंस करने के लिए विधियाँ प्रदान करता है।"
type: docs
weight: 14
url: /hi/java/com.aspose.page/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

घटक को लाइसेंस करने के लिए विधियाँ प्रदान करता है।

इस उदाहरण में, घटक को शामिल करने वाले फ़ोल्डर में, कॉलिंग असेंबली को शामिल करने वाले फ़ोल्डर में, एंट्री असेंबली के फ़ोल्डर में, और फिर कॉलिंग असेंबली के एम्बेडेड संसाधनों में MyLicense.lic नाम वाली लाइसेंस फ़ाइल को खोजने का प्रयास किया जाएगा।

License license = new License();
license.setLicense(\"MyLicense.lic\");
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [License()](#License--) | इस क्लास का नया उदाहरण आरंभ करता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isInternalFIPSSecurity()](#isInternalFIPSSecurity--) | डिफ़ॉल्ट रूप से हम डिफ़ॉल्ट jdk सुरक्षा का उपयोग कर रहे हैं। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setInternalFIPSSecurity(boolean internalFIPSSecurity)](#setInternalFIPSSecurity-boolean-) | डिफ़ॉल्ट रूप से हम डिफ़ॉल्ट jre सुरक्षा का उपयोग कर रहे हैं। |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | घटक को लाइसेंस करता है। |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | घटक को लाइसेंस करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


इस क्लास का नया उदाहरण आरंभ करता है।

इस उदाहरण में, घटक को शामिल करने वाले फ़ोल्डर में, कॉलिंग असेंबली को शामिल करने वाले फ़ोल्डर में, एंट्री असेंबली के फ़ोल्डर में, और फिर कॉलिंग असेंबली के एम्बेडेड संसाधनों में MyLicense.lic नाम वाली लाइसेंस फ़ाइल को खोजने का प्रयास किया जाएगा।

License license = new License();
license.setLicense(\"MyLicense.lic\");

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isInternalFIPSSecurity() {#isInternalFIPSSecurity--}
```
public static boolean isInternalFIPSSecurity()
```


डिफ़ॉल्ट रूप से हम डिफ़ॉल्ट jdk सुरक्षा का उपयोग कर रहे हैं। डिफ़ॉल्ट मान == false। कुछ मामलों में अनुकूलित जावा वातावरण आवश्यक एल्गोरिदम का समर्थन नहीं कर सकता, इसलिए हम आंतरिक निर्मित FIPS सुरक्षा का उपयोग करने का सुझाव दे सकते हैं।

**Returns:**
boolean - बूलियन मान
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setInternalFIPSSecurity(boolean internalFIPSSecurity) {#setInternalFIPSSecurity-boolean-}
```
public static void setInternalFIPSSecurity(boolean internalFIPSSecurity)
```


डिफ़ॉल्ट रूप से हम डिफ़ॉल्ट jre सुरक्षा का उपयोग कर रहे हैं। डिफ़ॉल्ट मान == false। कुछ मामलों में अनुकूलित जावा वातावरण आवश्यक एल्गोरिदम का समर्थन नहीं कर सकता, इसलिए हम आंतरिक निर्मित FIPS सुरक्षा का उपयोग करने का सुझाव दे सकते हैं।

ध्यान दें: कुछ ऑपरेटिंग सिस्टम पर JVM SecureRandom एल्गोरिदम के अनुसार /dev/random को परिणाम लौटाने से पहले होस्ट मशीन पर एक निश्चित मात्रा में \"शोर\" उत्पन्न होने की प्रतीक्षा करनी पड़ती है। Oracle के JVM में रैंडम नंबर जेनरेशन के लिए उपयोग की जाने वाली लाइब्रेरी UNIX प्लेटफ़ॉर्म पर डिफ़ॉल्ट रूप से /dev/random पर निर्भर करती है। हालांकि /dev/random अधिक सुरक्षित है, यदि डिफ़ॉल्ट JVM कॉन्फ़िगरेशन में देरी हो तो /dev/urandom का उपयोग करने की सिफ़ारिश की जाती है, या /dev/random के लिए एंट्रॉपी उत्पन्न करने वाले उपकरण जोड़ें।

निम्नलिखित जावा विकल्प देरी से बचने और securerandom.source सेटिंग को ओवरराइड करने में मदद कर सकता है। -Djava.security.egd=file:/dev/./urandom

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| internalFIPSSecurity | boolean | boolean मान |

### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


घटक को लाइसेंस करता है।

एक स्ट्रीम जिसमें लाइसेंस शामिल है।

एक स्ट्रीम से लाइसेंस लोड करने के लिए इस मेथड का उपयोग करें।

License license = new License();
license.setLicense(myStream);

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | java.io.InputStream | license स्ट्रीम |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


घटक को लाइसेंस करता है।

निम्नलिखित स्थानों में लाइसेंस खोजने का प्रयास करता है:

1. स्पष्ट पथ।

2. घटक jar फ़ाइल का फ़ोल्डर।

इस उदाहरण में, घटक को शामिल करने वाले फ़ोल्डर में, कॉलिंग असेंबली को शामिल करने वाले फ़ोल्डर में, एंट्री असेंबली के फ़ोल्डर में, और फिर कॉलिंग असेंबली के एम्बेडेड संसाधनों में MyLicense.lic नाम वाली लाइसेंस फ़ाइल को खोजने का प्रयास किया जाएगा।

License license = new License();
license.setLicense(\"MyLicense.lic\");

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| licenseName | java.lang.String | पूरा या छोटा फ़ाइल नाम या एम्बेडेड रिसोर्स का नाम हो सकता है। मूल्यांकन मोड में स्विच करने के लिए खाली स्ट्रिंग का उपयोग करें। |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

