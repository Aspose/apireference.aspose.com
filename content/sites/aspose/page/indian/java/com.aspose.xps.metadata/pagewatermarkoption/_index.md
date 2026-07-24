---
title: "PageWatermark.PageWatermarkOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PageWatermark फीचर विकल्पों का वर्णन करता है।"
type: docs
weight: 12
url: /hi/java/com.aspose.xps.metadata/pagewatermark.pagewatermarkoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem](../../com.aspose.xps.metadata/ipagewatermarkitem)
```
public static final class PageWatermark.PageWatermarkOption extends Option implements PageWatermark.IPageWatermarkItem
```

PageWatermark सुविधाओं के विकल्पों का वर्णन करता है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items)](#PageWatermarkOption-java.lang.String-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-) | एक नया इंस्टेंस बनाता है। |
| [PageWatermarkOption(PageWatermark.PageWatermarkOption option)](#PageWatermarkOption-com.aspose.xps.metadata.PageWatermark.PageWatermarkOption-) | इस विकल्प इंस्टेंस को क्लोन करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [Text](#Text) | केवल पाठ वाला वॉटरमार्क निर्दिष्ट करता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। |
| [add(PageWatermark.IPageWatermarkOptionItem[] items)](#add-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-) | विकल्प में IPageWatermarkOptionItem इंस्टेंस की एक एरे जोड़ता है। |
| [clone()](#clone--) | इस विकल्प इंस्टेंस को क्लोन करता है। |
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
### PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items) {#PageWatermarkOption-java.lang.String-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-}
```
public PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| optionName | java.lang.String | एक विकल्प का नाम। |
| items | [IPageWatermarkOptionItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkoptionitem) | IPageWatermarkOptionItem इंस्टेंस की एक मनमानी एरे। |

### PageWatermarkOption(PageWatermark.PageWatermarkOption option) {#PageWatermarkOption-com.aspose.xps.metadata.PageWatermark.PageWatermarkOption-}
```
public PageWatermarkOption(PageWatermark.PageWatermarkOption option)
```


इस विकल्प इंस्टेंस को क्लोन करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| option | [PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) | क्लोन करने के लिए एक इंस्टेंस। |

### Text {#Text}
```
public static PageWatermark.PageWatermarkOption Text
```


केवल पाठ वाला वॉटरमार्क निर्दिष्ट करता है।

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। प्रत्येक को  ScoredProperty  या  Property  इंस्टेंस होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | जोड़ने के लिए आइटमों की सूची। |

### add(PageWatermark.IPageWatermarkOptionItem[] items) {#add-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-}
```
public PageWatermark.PageWatermarkOption add(PageWatermark.IPageWatermarkOptionItem[] items)
```


विकल्प में IPageWatermarkOptionItem इंस्टेंस की एक एरे जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IPageWatermarkOptionItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkoptionitem) | IPageWatermarkOptionItem इंस्टेंस की एक मनमानी एरे। |

**Returns:**
[PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) - This options instance.
### clone() {#clone--}
```
public PageWatermark.PageWatermarkOption clone()
```


इस विकल्प इंस्टेंस को क्लोन करता है। क्लोनिंग कन्स्ट्रक्टर का शॉर्टकट।

**Returns:**
[PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) - The clone of this option instance.
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

