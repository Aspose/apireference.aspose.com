---
title: "PageDestinationColorProfileURI"
second_title: "Aspose.Page for Java API संदर्भ"
description: "एक सापेक्ष URI संदर्भ निर्दिष्ट करता है ICC प्रोफ़ाइल का जो XPS दस्तावेज़ में सम्मिलित है।"
type: docs
weight: 93
url: /hi/java/com.aspose.xps.metadata/pagedestinationcolorprofileuri/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit), [com.aspose.xps.metadata.StringParameterInit](../../com.aspose.xps.metadata/stringparameterinit)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageDestinationColorProfileURI extends StringParameterInit implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

XPS दस्तावेज़ में सम्मिलित ICC प्रोफ़ाइल के लिए एक सापेक्ष URI संदर्भ निर्दिष्ट करता है। इस विकल्प की प्रोसेसिंग PageDeviceColorSpaceUsage फीचर की सेटिंग पर निर्भर करती है। इस प्रोफ़ाइल का उपयोग करने वाले सभी तत्व पहले से ही उपयुक्त डिवाइस कलर स्पेस में माने जाते हैं, और ड्राइवर या डिवाइस में रंग प्रबंधन नहीं किया जाएगा। https://docs.microsoft.com/en-us/windows/win32/printdocs/pagedestinationcolorprofileuri
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PageDestinationColorProfileURI(String value)](#PageDestinationColorProfileURI-java.lang.String-) | एक नया इंस्टेंस बनाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxLength()](#getMaxLength--) | स्ट्रिंग मानों के लिए, सबसे छोटी और सबसे लंबी स्ट्रिंग को परिभाषित करता है। |
| [getMinLength()](#getMinLength--) | स्ट्रिंग मानों के लिए, अनुमत सबसे छोटी स्ट्रिंग को परिभाषित करता है। |
| [getName()](#getName--) | एलिमेंट का नाम प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageDestinationColorProfileURI(String value) {#PageDestinationColorProfileURI-java.lang.String-}
```
public PageDestinationColorProfileURI(String value)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.lang.String | पैरामीटर का मान। |

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
### getMaxLength() {#getMaxLength--}
```
public int getMaxLength()
```


स्ट्रिंग मानों के लिए, सबसे छोटी और सबसे लंबी स्ट्रिंग को परिभाषित करता है।

**Returns:**
int - सबसे लंबी अनुमत स्ट्रिंग।
### getMinLength() {#getMinLength--}
```
public int getMinLength()
```


स्ट्रिंग मानों के लिए, अनुमत सबसे छोटी स्ट्रिंग को परिभाषित करता है।

**Returns:**
int - सबसे छोटी अनुमत स्ट्रिंग।
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

