---
title: "InterpolationMode"
second_title: "Aspose.Page for Java API संदर्भ"
description: "जब इमेज को स्केल या घुमाया जाता है तो उपयोग होने वाले एल्गोरिद्म को निर्दिष्ट करता है।"
type: docs
weight: 20
url: /hi/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

जब इमेज को स्केल या घुमाया जाता है तो उपयोग होने वाले एल्गोरिद्म को निर्दिष्ट करता है।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [Bicubic](#Bicubic) | बाइक्यूबिक इंटरपोलेशन को निर्दिष्ट करता है। |
| [Bilinear](#Bilinear) | बिलीनियर इंटरपोलेशन को निर्दिष्ट करता है। |
| [Default](#Default) | डिफ़ॉल्ट मोड को निर्दिष्ट करता है। |
| [High](#High) | उच्च गुणवत्ता वाला इंटरपोलेशन निर्दिष्ट करता है। |
| [HighQualityBicubic](#HighQualityBicubic) | उच्च-गुणवत्ता, बाइक्यूबिक इंटरपोलेशन को निर्दिष्ट करता है। |
| [HighQualityBilinear](#HighQualityBilinear) | उच्च-गुणवत्ता, बिलीनियर इंटरपोलेशन को निर्दिष्ट करता है। |
| [Low](#Low) | निम्न गुणवत्ता वाला इंटरपोलेशन निर्दिष्ट करता है। |
| [NearestNeighbor](#NearestNeighbor) | नजदीकी पड़ोसी इंटरपोलेशन को निर्दिष्ट करता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Bicubic {#Bicubic}
```
public static final InterpolationMode Bicubic
```


बाइक्यूबिक इंटरपोलेशन को निर्दिष्ट करता है। कोई प्रीफ़िल्टरिंग नहीं की जाती। यह मोड मूल आकार के 25 प्रतिशत से नीचे छवि को छोटा करने के लिए उपयुक्त नहीं है।

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


बिलीनियर इंटरपोलेशन को निर्दिष्ट करता है। कोई प्रीफ़िल्टरिंग नहीं की जाती। यह मोड मूल आकार के 50 प्रतिशत से नीचे छवि को छोटा करने के लिए उपयुक्त नहीं है।

### Default {#Default}
```
public static final InterpolationMode Default
```


डिफ़ॉल्ट मोड को निर्दिष्ट करता है।

### High {#High}
```
public static final InterpolationMode High
```


उच्च गुणवत्ता वाला इंटरपोलेशन निर्दिष्ट करता है।

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


उच्च-गुणवत्ता, बाइक्यूबिक इंटरपोलेशन को निर्दिष्ट करता है। उच्च-गुणवत्ता वाली संकुचन सुनिश्चित करने के लिए प्रीफ़िल्टरिंग की जाती है। यह मोड सबसे उच्च गुणवत्ता वाली परिवर्तित छवियों को उत्पन्न करता है।

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


उच्च-गुणवत्ता, बिलीनियर इंटरपोलेशन को निर्दिष्ट करता है। उच्च-गुणवत्ता वाली संकुचन सुनिश्चित करने के लिए प्रीफ़िल्टरिंग की जाती है।

### Low {#Low}
```
public static final InterpolationMode Low
```


निम्न गुणवत्ता वाला इंटरपोलेशन निर्दिष्ट करता है।

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


नजदीकी पड़ोसी इंटरपोलेशन को निर्दिष्ट करता है।

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static InterpolationMode valueOf(String name)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | java.lang.String |  |

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode)
### values() {#values--}
```
public static InterpolationMode[] values()
```




**Returns:**
com.aspose.xps.rendering.InterpolationMode[]
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

