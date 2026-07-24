---
title: "JobPrimaryCoverBack"
second_title: "Aspose.Page for Java API संदर्भ"
description: "पिछले अंत कवर शीट का वर्णन करता है।"
type: docs
weight: 66
url: /hi/java/com.aspose.xps.metadata/jobprimarycoverback/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobPrimaryCoverBack extends Feature implements IJobPrintTicketItem
```

पिछले (अंत) कवर शीट का वर्णन करता है। प्रत्येक कार्य में एक अलग प्राथमिक शीट होगी। कवर शीट को कार्य के अंतिम पृष्ठ के लिए उपयोग किए गए  PageMediaSize  और  PageMediaType  पर मुद्रित किया जाना चाहिए। कवर शीट को प्रोसेसिंग विकल्पों (जैसे  JobDuplexAllDocumentsContiguously ,  JobNUpAllDocumentsContiguously ) में एकीकृत किया जाना चाहिए जैसा कि निर्दिष्ट विकल्प द्वारा संकेतित है। https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverback
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [JobPrimaryCoverBack(JobPrimaryCoverBack.CoverBackOption[] options)](#JobPrimaryCoverBack-com.aspose.xps.metadata.JobPrimaryCoverBack.CoverBackOption...-) | एक नया इंस्टेंस बनाता है। |
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
### JobPrimaryCoverBack(JobPrimaryCoverBack.CoverBackOption[] options) {#JobPrimaryCoverBack-com.aspose.xps.metadata.JobPrimaryCoverBack.CoverBackOption...-}
```
public JobPrimaryCoverBack(JobPrimaryCoverBack.CoverBackOption[] options)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [CoverBackOption\[\]](../../com.aspose.xps.metadata/coverbackoption) | फ़ीचर के लिए विशिष्ट विकल्पों की एक सरणी। |

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

