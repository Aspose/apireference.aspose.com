---
title: "PageOutputColor.PageOutputColorOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PageOutputColor फीचर विकल्पों का वर्णन करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.xps.metadata/pageoutputcolor.pageoutputcoloroption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageOutputColor.IPageOutputColorItem](../../com.aspose.xps.metadata/ipageoutputcoloritem)
```
public static final class PageOutputColor.PageOutputColorOption extends Option implements PageOutputColor.IPageOutputColorItem
```

PageOutputColor फीचर विकल्पों का वर्णन करता है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)](#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | एक नया इंस्टेंस बनाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [Color(int deviceBitsPerPixel, int driverBitsPerPixel)](#Color-int-int-) | निर्दिष्ट करता है कि आउटपुट रंग में होना चाहिए। |
| [Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)](#Grayscale-int-int-) | निर्दिष्ट करता है कि आउटपुट ग्रेस्केल में होना चाहिए। |
| [Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)](#Monochrome-int-int-) | निर्दिष्ट करता है कि आउटपुट मोनोक्रोम (काला) में होना चाहिए। |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। |
| [add(PageOutputColor.IPageOutputColorOptionItem[] items)](#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | विकल्प में  IPageOutputColorOptionItem  इंस्टेंसेस की एक एरे जोड़ता है। |
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
### PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items) {#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| optionName | java.lang.String | एक विकल्प का नाम। |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | IPageOutputColorOptionItem इंस्टेंसेस की एक मनमानी एरे। |

### Color(int deviceBitsPerPixel, int driverBitsPerPixel) {#Color-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Color(int deviceBitsPerPixel, int driverBitsPerPixel)
```


निर्दिष्ट करता है कि आउटपुट रंग में होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| deviceBitsPerPixel | int | एक  DeviceBitsPerPixel  स्कोर किया गया प्रॉपर्टी वैल्यू जो प्रिंटर द्वारा समर्थित रंग डेटा के प्रति पिक्सेल बिट्स की संख्या दर्शाता है। |
| driverBitsPerPixel | int | एक  DriverBitsPerPixel  स्कोर किया गया प्रॉपर्टी वैल्यू जो दर्शाता है कि कोर ड्राइवर को अपने बिटमैप रेंडरिंग बफ़र के लिए प्रति पिक्सेल कितने बिट्स का उपयोग करना चाहिए। |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel) {#Grayscale-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)
```


निर्दिष्ट करता है कि आउटपुट ग्रेस्केल में होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| deviceBitsPerPixel | int | एक  DeviceBitsPerPixel  स्कोर किया गया प्रॉपर्टी वैल्यू जो प्रिंटर द्वारा समर्थित रंग डेटा के प्रति पिक्सेल बिट्स की संख्या दर्शाता है। |
| driverBitsPerPixel | int | एक  DriverBitsPerPixel  स्कोर किया गया प्रॉपर्टी वैल्यू जो दर्शाता है कि कोर ड्राइवर को अपने बिटमैप रेंडरिंग बफ़र के लिए प्रति पिक्सेल कितने बिट्स का उपयोग करना चाहिए। |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel) {#Monochrome-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)
```


निर्दिष्ट करता है कि आउटपुट मोनोक्रोम (काला) में होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| deviceBitsPerPixel | int | एक  DeviceBitsPerPixel  स्कोर किया गया प्रॉपर्टी वैल्यू जो प्रिंटर द्वारा समर्थित रंग डेटा के प्रति पिक्सेल बिट्स की संख्या दर्शाता है। |
| driverBitsPerPixel | int | एक  DriverBitsPerPixel  स्कोर किया गया प्रॉपर्टी वैल्यू जो दर्शाता है कि कोर ड्राइवर को अपने बिटमैप रेंडरिंग बफ़र के लिए प्रति पिक्सेल कितने बिट्स का उपयोग करना चाहिए। |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। प्रत्येक को  ScoredProperty  या  Property  इंस्टेंस होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | जोड़ने के लिए आइटमों की सूची। |

### add(PageOutputColor.IPageOutputColorOptionItem[] items) {#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColor.PageOutputColorOption add(PageOutputColor.IPageOutputColorOptionItem[] items)
```


विकल्प में  IPageOutputColorOptionItem  इंस्टेंसेस की एक एरे जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | IPageOutputColorOptionItem इंस्टेंसेस की एक मनमानी एरे। |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - This options instance.
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

