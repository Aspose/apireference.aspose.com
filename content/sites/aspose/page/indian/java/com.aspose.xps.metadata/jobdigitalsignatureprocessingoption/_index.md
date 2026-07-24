---
title: "JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "JobDigitalSignatureProcessing फीचर विकल्पों का वर्णन करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.xps.metadata/jobdigitalsignatureprocessing.jobdigitalsignatureprocessingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption extends Option
```

JobDigitalSignatureProcessing फीचर विकल्पों का वर्णन करता है।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [PrintInvalidSignatures](#PrintInvalidSignatures) | डिजिटल हस्ताक्षरों की वैधता की परवाह किए बिना कार्य को प्रिंट करें। |
| [PrintInvalidSignaturesWithErrorReport](#PrintInvalidSignaturesWithErrorReport) | डिजिटल हस्ताक्षरों की वैधता की परवाह किए बिना कार्य को प्रिंट करें। |
| [PrintOnlyValidSignatures](#PrintOnlyValidSignatures) | केवल तभी कार्य को प्रिंट करें जब सभी डिजिटल हस्ताक्षर वैध हों। |
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
### PrintInvalidSignatures {#PrintInvalidSignatures}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignatures
```


डिजिटल हस्ताक्षरों की वैधता की परवाह किए बिना कार्य को प्रिंट करें। डिजिटल हस्ताक्षरों को अनदेखा किया जा सकता है।

### PrintInvalidSignaturesWithErrorReport {#PrintInvalidSignaturesWithErrorReport}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignaturesWithErrorReport
```


डिजिटल हस्ताक्षरों की वैधता की परवाह किए बिना कार्य को प्रिंट करें। यदि कोई अमान्य हस्ताक्षर मिलता है, तो कार्य के अंत में एक त्रुटि पृष्ठ प्रिंट होना चाहिए। डिजिटल हस्ताक्षरों को अनदेखा नहीं किया जाना चाहिए।

### PrintOnlyValidSignatures {#PrintOnlyValidSignatures}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintOnlyValidSignatures
```


केवल तभी कार्य को प्रिंट करें जब सभी डिजिटल हस्ताक्षर वैध हों। डिजिटल हस्ताक्षरों को अनदेखा नहीं किया जाना चाहिए।

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

