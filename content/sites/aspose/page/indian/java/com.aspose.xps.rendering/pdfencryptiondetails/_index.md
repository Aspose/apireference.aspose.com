---
title: "PdfEncryptionDetails"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PDF एन्क्रिप्शन के विवरण शामिल हैं।"
type: docs
weight: 13
url: /hi/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

PDF एन्क्रिप्शन के विवरण शामिल हैं।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | PdfEncryptionDetailsCore क्लास की नई इंस्टेंस को प्रारंभ करता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | एन्क्रिप्शन मोड लौटाता है। |
| [getOwnerPassword()](#getOwnerPassword--) | ओनर पासवर्ड लौटाता है। |
| [getPermissions()](#getPermissions--) | अनुमतियों को लौटाता है। |
| [getUserPassword()](#getUserPassword--) | यूज़र पासवर्ड लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | एन्क्रिप्शन मोड सेट करता है। |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | ओनर पासवर्ड सेट करता है। |
| [setPermissions(int value)](#setPermissions-int-) | अनुमतियों को सेट करता है। |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | यूज़र पासवर्ड सेट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


PdfEncryptionDetailsCore क्लास की नई इंस्टेंस को प्रारंभ करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| userPassword | java.lang.String | यूज़र पासवर्ड। |
| ownerPassword | java.lang.String | ओनर पासवर्ड। |
| permissions | int | अनुमतियाँ। |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | एन्क्रिप्शन एल्गोरिदम। |

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
### getEncryptionAlgorithm() {#getEncryptionAlgorithm--}
```
public PdfEncryptionAlgorithm getEncryptionAlgorithm()
```


एन्क्रिप्शन मोड लौटाता है।

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


ओनर पासवर्ड लौटाता है।

सही ओनर पासवर्ड के साथ दस्तावेज़ खोलने से (मान लेते हैं कि यह यूज़र पासवर्ड के समान नहीं है) दस्तावेज़ तक पूर्ण (ओनर) पहुँच मिलती है। यह असीमित पहुँच दस्तावेज़\u2019s पासवर्ड और एक्सेस अनुमतियों को बदलने की क्षमता शामिल करती है।

**Returns:**
java.lang.String - मालिक पासवर्ड।
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


अनुमतियों को लौटाता है।

**Returns:**
int - अनुमतियाँ।
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


यूज़र पासवर्ड लौटाता है।

दस्तावेज़ को सही उपयोगकर्ता पासवर्ड के साथ खोलना (या ऐसे दस्तावेज़ को खोलना जिसमें उपयोगकर्ता पासवर्ड नहीं है) अतिरिक्त कार्यों को करने की अनुमति देता है, जो दस्तावेज़\\u2019s एन्क्रिप्शन शब्दकोश में निर्दिष्ट उपयोगकर्ता एक्सेस अनुमतियों के अनुसार होते हैं।

**Returns:**
java.lang.String - उपयोगकर्ता पासवर्ड।
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




### setEncryptionAlgorithm(PdfEncryptionAlgorithm value) {#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public void setEncryptionAlgorithm(PdfEncryptionAlgorithm value)
```


एन्क्रिप्शन मोड सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | एन्क्रिप्शन एल्गोरिदम। |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


ओनर पासवर्ड सेट करता है।

सही ओनर पासवर्ड के साथ दस्तावेज़ खोलने से (मान लेते हैं कि यह यूज़र पासवर्ड के समान नहीं है) दस्तावेज़ तक पूर्ण (ओनर) पहुँच मिलती है। यह असीमित पहुँच दस्तावेज़\u2019s पासवर्ड और एक्सेस अनुमतियों को बदलने की क्षमता शामिल करती है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.lang.String | ओनर पासवर्ड। |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


अनुमतियों को सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | अनुमतियाँ। |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


यूज़र पासवर्ड सेट करता है।

दस्तावेज़ को सही उपयोगकर्ता पासवर्ड के साथ खोलना (या ऐसे दस्तावेज़ को खोलना जिसमें उपयोगकर्ता पासवर्ड नहीं है) अतिरिक्त कार्यों को करने की अनुमति देता है, जो दस्तावेज़\\u2019s एन्क्रिप्शन शब्दकोश में निर्दिष्ट उपयोगकर्ता एक्सेस अनुमतियों के अनुसार होते हैं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.lang.String | यूज़र पासवर्ड। |

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

