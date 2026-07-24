---
title: "JobErrorSheet"
second_title: "Aspose.Page for Java API संदर्भ"
description: "एरर शीट आउटपुट का वर्णन करता है।"
type: docs
weight: 53
url: /hi/java/com.aspose.xps.metadata/joberrorsheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobErrorSheet extends Feature implements IJobPrintTicketItem
```

त्रुटि शीट आउटपुट का वर्णन करता है। पूरे कार्य में एक ही त्रुटि शीट होगी। त्रुटि शीट को डिफ़ॉल्ट PageMediaSize पर और डिफ़ॉल्ट PageMediaType का उपयोग करके आउटपुट किया जाना चाहिए। त्रुटि शीट को कार्य के शेष भाग से अलग रखा जाना चाहिए। इसका मतलब है कि कोई भी फिनिशिंग या प्रोसेसिंग विकल्प (जैसे JobDuplex, JobStaple, या JobBinding) त्रुटि शीट को शामिल नहीं करने चाहिए। त्रुटि शीट कार्य की अंतिम शीट के रूप में होनी चाहिए। https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items)](#JobErrorSheet-com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem...-) | एक नया इंस्टेंस बनाता है। |
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
### JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items) {#JobErrorSheet-com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem...-}
```
public JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IJobErrorSheetItem\[\]](../../com.aspose.xps.metadata/ijoberrorsheetitem) | विशेषता के लिए विशिष्ट आइटमों की एक एरे। |

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

