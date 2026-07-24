---
title: "JobDuplexAllDocumentsContiguously"
second_title: "Aspose.Page for Java API संदर्भ"
description: "आउटपुट की डुप्लेक्स विशेषताओं का वर्णन करता है।"
type: docs
weight: 52
url: /hi/java/com.aspose.xps.metadata/jobduplexalldocumentscontiguously/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Duplex](../../com.aspose.xps.metadata/duplex)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobDuplexAllDocumentsContiguously extends Duplex implements IJobPrintTicketItem
```

आउटपुट की डुप्लेक्स विशेषताओं का वर्णन करता है। डुप्लेक्स सुविधा मीडिया के दोनों पक्षों पर प्रिंटिंग की अनुमति देती है। जॉब में सभी दस्तावेज़ एक साथ क्रमिक रूप से डुप्लेक्स किए जाते हैं।  JobDuplexAllDocumentsContiguously  और  DocumentDuplex  परस्पर अनन्य हैं। इन कुंजीशब्दों के बीच प्रतिबंध संभालना ड्राइवर पर निर्भर करता है। https://docs.microsoft.com/en-us/windows/win32/printdocs/jobduplexalldocumentscontiguously
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [JobDuplexAllDocumentsContiguously(Duplex.DuplexOption[] options)](#JobDuplexAllDocumentsContiguously-com.aspose.xps.metadata.Duplex.DuplexOption...-) | एक नया इंस्टेंस बनाता है। |
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
### JobDuplexAllDocumentsContiguously(Duplex.DuplexOption[] options) {#JobDuplexAllDocumentsContiguously-com.aspose.xps.metadata.Duplex.DuplexOption...-}
```
public JobDuplexAllDocumentsContiguously(Duplex.DuplexOption[] options)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [DuplexOption\[\]](../../com.aspose.xps.metadata/duplexoption) | फ़ीचर के लिए विशिष्ट विकल्पों की एक सरणी। |

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

