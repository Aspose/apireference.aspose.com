---
title: "PageScaling.PageScalingOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PageScaling सुविधाओं के विकल्पों का वर्णन करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.xps.metadata/pagescaling.pagescalingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageScaling.IPageScalingItem](../../com.aspose.xps.metadata/ipagescalingitem)
```
public static final class PageScaling.PageScalingOption extends Option implements PageScaling.IPageScalingItem
```

वर्णन करता है  PageScaling  फीचर विकल्पों को।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [Custom](#Custom) | कस्टम स्केलिंग को Application Media Size पर लागू किया जाना चाहिए, यह निर्दिष्ट करता है। |
| [CustomSquare](#CustomSquare) | कस्टम वर्गाकार स्केलिंग को Application Media Size पर लागू किया जाना चाहिए, यह निर्दिष्ट करता है। |
| [FitApplicationBleedSizeToPageImageableSize](#FitApplicationBleedSizeToPageImageableSize) | एप्लिकेशन ब्लीड आकार को  PageImageableSize  तक स्केल किया जाना चाहिए, अनुपात को बनाए रखते हुए, यह निर्दिष्ट करता है। |
| [FitApplicationContentSizeToPageImageableSize](#FitApplicationContentSizeToPageImageableSize) | एप्लिकेशन कंटेंट आकार को  PageImageableSize  तक स्केल किया जाना चाहिए, अनुपात को बनाए रखते हुए, यह निर्दिष्ट करता है। |
| [FitApplicationMediaSizeToPageImageableSize](#FitApplicationMediaSizeToPageImageableSize) | एप्लिकेशन मीडिया आकार को  PageImageableSize  तक स्केल किया जाना चाहिए, अनुपात को बनाए रखते हुए, यह निर्दिष्ट करता है। |
| [FitApplicationMediaSizeToPageMediaSize](#FitApplicationMediaSizeToPageMediaSize) | एप्लिकेशन मीडिया आकार को  PageMediaSize  तक स्केल किया जाना चाहिए, अनुपात को बनाए रखते हुए, यह निर्दिष्ट करता है। |
| [None](#None) | कोई स्केलिंग लागू नहीं की जानी चाहिए, यह निर्दिष्ट करता है। |
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
### Custom {#Custom}
```
public static PageScaling.PageScalingOption Custom
```


कस्टम स्केलिंग को Application Media Size पर लागू किया जाना चाहिए, यह निर्दिष्ट करता है।

### CustomSquare {#CustomSquare}
```
public static PageScaling.PageScalingOption CustomSquare
```


कस्टम वर्गाकार स्केलिंग को Application Media Size पर लागू किया जाना चाहिए, यह निर्दिष्ट करता है।

### FitApplicationBleedSizeToPageImageableSize {#FitApplicationBleedSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationBleedSizeToPageImageableSize
```


एप्लिकेशन ब्लीड आकार को  PageImageableSize  तक स्केल किया जाना चाहिए, अनुपात को बनाए रखते हुए, यह निर्दिष्ट करता है।

### FitApplicationContentSizeToPageImageableSize {#FitApplicationContentSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationContentSizeToPageImageableSize
```


एप्लिकेशन कंटेंट आकार को  PageImageableSize  तक स्केल किया जाना चाहिए, अनुपात को बनाए रखते हुए, यह निर्दिष्ट करता है।

### FitApplicationMediaSizeToPageImageableSize {#FitApplicationMediaSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageImageableSize
```


एप्लिकेशन मीडिया आकार को  PageImageableSize  तक स्केल किया जाना चाहिए, अनुपात को बनाए रखते हुए, यह निर्दिष्ट करता है।

### FitApplicationMediaSizeToPageMediaSize {#FitApplicationMediaSizeToPageMediaSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageMediaSize
```


एप्लिकेशन मीडिया आकार को  PageMediaSize  तक स्केल किया जाना चाहिए, अनुपात को बनाए रखते हुए, यह निर्दिष्ट करता है।

### None {#None}
```
public static PageScaling.PageScalingOption None
```


कोई स्केलिंग लागू नहीं की जानी चाहिए, यह निर्दिष्ट करता है।

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

