---
title: "PageOutputQuality.PageOutputQualityOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PageOutputQuality फीचर विकल्पों को परिभाषित करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.xps.metadata/pageoutputquality.pageoutputqualityoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOutputQuality.PageOutputQualityOption extends Option
```

परिभाषित करता है  PageOutputQuality  फीचर विकल्पों को।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [Automatic](#Automatic) | ऑटोमैटिक आउटपुट के इरादे को निर्दिष्ट करता है (क्लाइंट को स्वचालित रूप से सर्वोत्तम सेटिंग्स चुनने की अनुमति देता है)। |
| [Draft](#Draft) | ड्राफ्ट आउटपुट के इरादे को निर्दिष्ट करता है (ड्राफ्ट गुणवत्ता के टेक्स्ट और ग्राफिक्स के लिए संतुलित)। |
| [Fax](#Fax) | फ़ैक्स आउटपुट के इरादे को निर्दिष्ट करता है (मानक फ़ैक्स गुणवत्ता के लिए संतुलित)। |
| [High](#High) | हाई क्वालिटी आउटपुट के इरादे को निर्दिष्ट करता है (उच्च गुणवत्ता के टेक्स्ट और ग्राफिक्स के लिए संतुलित)। |
| [Normal](#Normal) | सामान्य आउटपुट के उद्देश्य को निर्दिष्ट करता है (अच्छी गुणवत्ता वाले टेक्स्ट और ग्राफ़िक्स के लिए संतुलित)। |
| [Photographic](#Photographic) | फ़ोटोग्राफ़िक आउटपुट के उद्देश्य को निर्दिष्ट करता है (छवियों को सर्वोच्च गुणवत्ता होनी चाहिए)। |
| [Text](#Text) | केवल टेक्स्ट आउटपुट के उद्देश्य को निर्दिष्ट करता है (ग्राफ़िक्स खराब या बिल्कुल नहीं आउटपुट हो सकते हैं)। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | एलिमेंट का नाम प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Automatic {#Automatic}
```
public static PageOutputQuality.PageOutputQualityOption Automatic
```


ऑटोमैटिक आउटपुट के इरादे को निर्दिष्ट करता है (क्लाइंट को स्वचालित रूप से सर्वोत्तम सेटिंग्स चुनने की अनुमति देता है)।

### Draft {#Draft}
```
public static PageOutputQuality.PageOutputQualityOption Draft
```


ड्राफ्ट आउटपुट के इरादे को निर्दिष्ट करता है (ड्राफ्ट गुणवत्ता के टेक्स्ट और ग्राफिक्स के लिए संतुलित)।

### Fax {#Fax}
```
public static PageOutputQuality.PageOutputQualityOption Fax
```


फ़ैक्स आउटपुट के इरादे को निर्दिष्ट करता है (मानक फ़ैक्स गुणवत्ता के लिए संतुलित)।

### High {#High}
```
public static PageOutputQuality.PageOutputQualityOption High
```


हाई क्वालिटी आउटपुट के इरादे को निर्दिष्ट करता है (उच्च गुणवत्ता के टेक्स्ट और ग्राफिक्स के लिए संतुलित)।

### Normal {#Normal}
```
public static PageOutputQuality.PageOutputQualityOption Normal
```


सामान्य आउटपुट के उद्देश्य को निर्दिष्ट करता है (अच्छी गुणवत्ता वाले टेक्स्ट और ग्राफ़िक्स के लिए संतुलित)।

### Photographic {#Photographic}
```
public static PageOutputQuality.PageOutputQualityOption Photographic
```


फ़ोटोग्राफ़िक आउटपुट के उद्देश्य को निर्दिष्ट करता है (छवियों को सर्वोच्च गुणवत्ता होनी चाहिए)।

### Text {#Text}
```
public static PageOutputQuality.PageOutputQualityOption Text
```


केवल टेक्स्ट आउटपुट के उद्देश्य को निर्दिष्ट करता है (ग्राफ़िक्स खराब या बिल्कुल नहीं आउटपुट हो सकते हैं)।

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। प्रत्येक को  ScoredProperty  या  Property  इंस्टेंस होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | जोड़ने के लिए आइटमों की सूची। |

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
### getName() {#getName--}
```
public String getName()
```


एलिमेंट का नाम प्राप्त करता है।

**Returns:**
java.lang.String
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

