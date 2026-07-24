---
title: "PagePoster"
second_title: "Aspose.Page for Java API संदर्भ"
description: "एकल पृष्ठ के आउटपुट को कई भौतिक मीडिया शीट्स के रूप में वर्णन करता है।"
type: docs
weight: 118
url: /hi/java/com.aspose.xps.metadata/pageposter/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PagePoster extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

एकल पृष्ठ के आउटपुट को कई भौतिक मीडिया शीट्स में वर्णित करता है। https://docs.microsoft.com/en-us/windows/win32/printdocs/pageposter
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PagePoster()](#PagePoster--) | एक नया इंस्टेंस बनाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | इस फीचर की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | एक  PagesPerSheet  स्कोर्ड प्रॉपर्टी वैल्यू के साथ एक विकल्प जोड़ता है। |
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
### PagePoster() {#PagePoster--}
```
public PagePoster()
```


एक नया इंस्टेंस बनाता है।

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


इस फ़ीचर की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। प्रत्येक को एक  Feature , एक  Option , या एक  Property  इंस्टेंस होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | जोड़ने के लिए आइटमों की सूची। |

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public PagePoster addPagesPerSheetOption(int value)
```


एक  PagesPerSheet  स्कोर किए गए प्रॉपर्टी मान के साथ विकल्प जोड़ता है। लॉजिकल पृष्ठ प्रति भौतिक शीटों की संख्या निर्धारित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | एक  PagesPerSheet  स्कोर किया गया प्रॉपर्टी मान। |

**Returns:**
[PagePoster](../../com.aspose.xps.metadata/pageposter) - This feature instance.
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

