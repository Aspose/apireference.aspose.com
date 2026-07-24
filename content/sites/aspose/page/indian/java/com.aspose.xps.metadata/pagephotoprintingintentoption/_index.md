---
title: "PagePhotoPrintingIntent.PagePhotoPrintingIntentOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PagePhotoPrintingIntent फीचर विकल्पों को परिभाषित करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.xps.metadata/pagephotoprintingintent.pagephotoprintingintentoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PagePhotoPrintingIntent.PagePhotoPrintingIntentOption extends Option
```

परिभाषित करता है  PagePhotoPrintingIntent  फीचर विकल्पों को।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [None](#None) | कोई फ़ोटोप्रिंटिंग इंटेंट नहीं (एप्लिकेशन को कोई इंटेंट रिज़ॉल्यूशन निर्दिष्ट करने की अनुमति देता है। |
| [PhotoBest](#PhotoBest) | सर्वोत्तम गुणवत्ता फ़ोटोप्रिंटिंग (मुख्यतः मार्केटिंग कारणों से प्रदान किया गया; डिवाइस की उच्चतम क्षमताओं का उपयोग करता है) |
| [PhotoDraft](#PhotoDraft) | ड्राफ्ट गुणवत्ता फ़ोटोप्रिंटिंग (प्रूफ़िंग उद्देश्यों के लिए तेज़, कम इंक वॉल्यूम प्रिंट) |
| [PhotoStandard](#PhotoStandard) | मानक गुणवत्ता फ़ोटोप्रिंटिंग (मानक फ़ोटो‑प्रिंटिंग के लिए OEM द्वारा सुझाए गए सेटिंग्स) |
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
### None {#None}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption None
```


कोई फ़ोटोप्रिंटिंग इंटेंट नहीं (एप्लिकेशन को कोई इंटेंट रिज़ॉल्यूशन निर्दिष्ट करने की अनुमति देता है। PrintTicket सेटिंग्स को नहीं बदला जाना चाहिए)

### PhotoBest {#PhotoBest}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoBest
```


सर्वोत्तम गुणवत्ता फ़ोटोप्रिंटिंग (मुख्यतः मार्केटिंग कारणों से प्रदान किया गया; डिवाइस की उच्चतम क्षमताओं का उपयोग करता है)

### PhotoDraft {#PhotoDraft}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoDraft
```


ड्राफ्ट गुणवत्ता फ़ोटोप्रिंटिंग (प्रूफ़िंग उद्देश्यों के लिए तेज़, कम इंक वॉल्यूम प्रिंट)

### PhotoStandard {#PhotoStandard}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoStandard
```


मानक गुणवत्ता फ़ोटोप्रिंटिंग (मानक फ़ोटो‑प्रिंटिंग के लिए OEM द्वारा सुझाए गए सेटिंग्स)

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

