---
title: "JobPrimaryCoverBack.CoverBackOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "JobPrimaryCoverBack फीचर विकल्पों का वर्णन करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.xps.metadata/jobprimarycoverback.coverbackoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobPrimaryCoverBack.CoverBackOption extends Option
```

JobPrimaryCoverBack फीचर विकल्पों का वर्णन करता है।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [BlankCover](#BlankCover) | निर्दिष्ट करता है कि एक खाली कवर शीट प्रिंट की जानी चाहिए। |
| [NoCover](#NoCover) | निर्दिष्ट करता है कि कोई कवर आउटपुट नहीं होगा। |
| [PrintBack](#PrintBack) | निर्दिष्ट करता है कि "CoverBackSource" द्वारा संकेतित कवर को कवर शीट की बैक साइड पर प्रिंट किया जाना चाहिए। |
| [PrintBoth](#PrintBoth) | निर्दिष्ट करता है कि "CoverBackSource" द्वारा संकेतित कवर को कवर शीट की किसी भी साइड पर प्रिंट किया जा सकता है। |
| [PrintFront](#PrintFront) | निर्दिष्ट करता है कि "CoverBackSource" द्वारा संकेतित कवर को कवर शीट की फ्रंट साइड पर प्रिंट किया जाना चाहिए। |
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
### BlankCover {#BlankCover}
```
public static final JobPrimaryCoverBack.CoverBackOption BlankCover
```


निर्दिष्ट करता है कि एक खाली कवर शीट प्रिंट की जानी चाहिए।

### NoCover {#NoCover}
```
public static final JobPrimaryCoverBack.CoverBackOption NoCover
```


निर्दिष्ट करता है कि कोई कवर आउटपुट नहीं होगा।

### PrintBack {#PrintBack}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBack
```


निर्दिष्ट करता है कि "CoverBackSource" द्वारा संकेतित कवर को कवर शीट की बैक साइड पर प्रिंट किया जाना चाहिए। यदि JobPrimaryCoverBackSource ParameterInit तत्व निर्दिष्ट नहीं किया गया है, तो इस Option को अनदेखा किया जाना चाहिए।

### PrintBoth {#PrintBoth}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBoth
```


निर्दिष्ट करता है कि "CoverBackSource" द्वारा संकेतित कवर को कवर शीट की किसी भी साइड पर प्रिंट किया जा सकता है। यदि JobPrimaryCoverBackSource ParameterInit तत्व निर्दिष्ट नहीं किया गया है, तो इस Option को अनदेखा किया जाना चाहिए।

### PrintFront {#PrintFront}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintFront
```


निर्दिष्ट करता है कि "CoverBackSource" द्वारा संकेतित कवर को कवर शीट की फ्रंट साइड पर प्रिंट किया जाना चाहिए। यदि JobPrimaryCoverBackSource ParameterInit तत्व निर्दिष्ट नहीं किया गया है, तो इस Option को अनदेखा किया जाना चाहिए।

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

