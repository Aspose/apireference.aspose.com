---
title: "PageForceFrontSide"
second_title: "Aspose.Page for Java API संदर्भ"
description: "आउटपुट को मीडिया शीट के सामने दिखाने के लिए बाध्य करता है।"
type: docs
weight: 97
url: /hi/java/com.aspose.xps.metadata/pageforcefrontside/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageForceFrontSide extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

आउटपुट को मीडिया शीट के फ्रंट पर दिखाने के लिए बाध्य करता है। यह उन मीडिया शीट्स के लिए प्रासंगिक है जिनकी प्रत्येक साइड पर अलग सतह होती है। उन मामलों में जहाँ यह फीचर प्रोसेसिंग विकल्पों (जैसे DocumentDuplex) के साथ टकराता है, PageForceFrontSide उस विशिष्ट पृष्ठ के लिए प्राथमिकता लेता है जिस पर यह फीचर लागू होता है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PageForceFrontSide(PageForceFrontSide.PageForceFrontSideOption[] options)](#PageForceFrontSide-com.aspose.xps.metadata.PageForceFrontSide.PageForceFrontSideOption...-) | एक नया इंस्टेंस बनाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | इस फीचर की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। |
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
### PageForceFrontSide(PageForceFrontSide.PageForceFrontSideOption[] options) {#PageForceFrontSide-com.aspose.xps.metadata.PageForceFrontSide.PageForceFrontSideOption...-}
```
public PageForceFrontSide(PageForceFrontSide.PageForceFrontSideOption[] options)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [PageForceFrontSideOption\[\]](../../com.aspose.xps.metadata/pageforcefrontsideoption) | फ़ीचर के लिए विशिष्ट विकल्पों की एक सरणी। |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


इस फ़ीचर की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। प्रत्येक को एक  Feature , एक  Option , या एक  Property  इंस्टेंस होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | जोड़ने के लिए आइटमों की सूची। |

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

