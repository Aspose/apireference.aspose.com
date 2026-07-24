---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PageDeviceColorSpaceUsage फीचर विकल्पों का वर्णन करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

वर्णन करता है  PageDeviceColorSpaceUsage  सुविधा विकल्पों को।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | यदि डिवाइस निर्धारित करता है कि PageDeviceColorSpaceProfileURI पैरामीटर द्वारा निर्दिष्ट प्रोफ़ाइल को डिवाइस कलर स्पेस प्रोफ़ाइल के रूप में उपयोग किया जा सकता है, तो उसी प्रोफ़ाइल का उपयोग करने वाले सभी तत्वों को पहले से ही डिवाइस कलर स्पेस में निर्दिष्ट माना जाता है। |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | यदि PageDeviceColorSpaceProfileURI पैरामीटर द्वारा निर्दिष्ट प्रोफ़ाइल में चैनलों की संख्या डिवाइस के प्राथमिक रंगों की संख्या से मेल खाती है, तो इसे सभी तत्वों के लिए डिवाइस के आंतरिक कलर मैनेजमेंट के बजाय उपयोग किया जाना चाहिए। |
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
### MatchToDefault {#MatchToDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption MatchToDefault
```


यदि डिवाइस निर्धारित करता है कि PageDeviceColorSpaceProfileURI पैरामीटर द्वारा निर्दिष्ट प्रोफ़ाइल को डिवाइस कलर स्पेस प्रोफ़ाइल के रूप में उपयोग किया जा सकता है, तो उसी प्रोफ़ाइल का उपयोग करने वाले सभी तत्वों को पहले से ही डिवाइस कलर स्पेस में निर्दिष्ट माना जाता है। अन्य सभी तत्वों को उस तत्व के लिए निर्दिष्ट प्रोफ़ाइल का उपयोग **अवश्य** करना चाहिए। यदि प्रोफ़ाइल को डिवाइस कलर स्पेस प्रोफ़ाइल के रूप में उपयोग नहीं किया जा सकता, तो प्रोफ़ाइल का उपयोग करने वाले तत्वों को किसी अन्य तत्व की तरह ही कलर प्रोफ़ाइल के अनुसार **अवश्य** प्रबंधित किया जाना चाहिए।

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


यदि PageDeviceColorSpaceProfileURI पैरामीटर द्वारा निर्दिष्ट प्रोफ़ाइल में चैनलों की संख्या डिवाइस के प्राइमरी की संख्या से मेल खाती है, तो इसे डिवाइस के आंतरिक कलर मैनेजमेंट के बजाय सभी तत्वों के लिए उपयोग किया जाना **चाहिए**। इस प्रोफ़ाइल का उपयोग करने वाले तत्वों को डिवाइस कलर स्पेस में माना जाता है और आगे कोई कलर मैनेजमेंट नहीं किया जाएगा।

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

