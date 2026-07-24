---
title: "मीटरड"
second_title: "Aspose.Page for Java API संदर्भ"
description: "मीटर की कुंजी सेट करने के लिए विधियाँ प्रदान करता है।"
type: docs
weight: 15
url: /hi/java/com.aspose.page/metered/
---
**Inheritance:**
java.lang.Object
```
public final class Metered
```

मीटर की कुंजी सेट करने के लिए विधियाँ प्रदान करता है।

--------------------

इस उदाहरण में, मीटरड सार्वजनिक और निजी कुंजी सेट करने का प्रयास किया जाएगा।

```
The component jar file:
  
 	Metered matered = new Metered();
 	matered.setMeteredKey("PublicKey", "PrivateKey");
```
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [Metered()](#Metered--) | इस क्लास का नया उदाहरण आरंभ करता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [clearMeteredLicense()](#clearMeteredLicense--) | मीटरड लाइसेंस को साफ़ करता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [flush()](#flush--) | सर्वर पर काउंट डेटा को फ्लश करता है। |
| [getClass()](#getClass--) |  |
| [getConsumptionCredit()](#getConsumptionCredit--) | उपभोग क्रेडिट प्राप्त करता है। |
| [getConsumptionQuantity()](#getConsumptionQuantity--) | उपभोग फ़ाइल आकार प्राप्त करता है |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMeteredKey(String publicKey, String privateKey)](#setMeteredKey-java.lang.String-java.lang.String-) | मीटरयुक्त सार्वजनिक और निजी कुंजी सेट करता है |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Metered() {#Metered--}
```
public Metered()
```


इस क्लास का नया उदाहरण आरंभ करता है।

### clearMeteredLicense() {#clearMeteredLicense--}
```
public static void clearMeteredLicense()
```


मीटरड लाइसेंस को साफ़ करता है।

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
### flush() {#flush--}
```
public static void flush()
```


सर्वर पर काउंट डेटा को फ़्लश करता है। केवल डिबग उद्देश्यों के लिए उपयोग किया जाता है।

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConsumptionCredit() {#getConsumptionCredit--}
```
public static double getConsumptionCredit()
```


उपभोग क्रेडिट प्राप्त करता है।

**Returns:**
डबल - उपभोग मात्रा
### getConsumptionQuantity() {#getConsumptionQuantity--}
```
public static double getConsumptionQuantity()
```


उपभोग फ़ाइल आकार प्राप्त करता है

**Returns:**
डबल - उपभोग मात्रा
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setMeteredKey(String publicKey, String privateKey) {#setMeteredKey-java.lang.String-java.lang.String-}
```
public void setMeteredKey(String publicKey, String privateKey)
```


मीटरयुक्त सार्वजनिक और निजी कुंजी सेट करता है

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| publicKey | java.lang.String | सार्वजनिक कुंजी |
| privateKey | java.lang.String | निजी कुंजी |

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

