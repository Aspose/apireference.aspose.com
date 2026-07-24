---
title: "PageColorManagement.PageColorManagementOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PageColorManagement सुविधा विकल्पों का वर्णन करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.xps.metadata/pagecolormanagement.pagecolormanagementoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageColorManagement.PageColorManagementOption extends Option
```

वर्णन करता है  PageColorManagement  सुविधा विकल्पों को।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [Device](#Device) | एप्लिकेशन ने रंग प्रबंधन नहीं किया है और डिवाइस रंग प्रबंधन निर्धारित करता है। |
| [Driver](#Driver) | एप्लिकेशन ने रंग प्रबंधन नहीं किया है और ड्राइवर रंग प्रबंधन निर्धारित करता है। |
| [None](#None) | एप्लिकेशन ने गंतव्य प्रोफ़ाइल के लिए रंग प्रबंधन किया है। |
| [System](#System) | रंग प्रबंधन सिस्टम द्वारा किया जाता है। |
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
### Device {#Device}
```
public static PageColorManagement.PageColorManagementOption Device
```


एप्लिकेशन ने रंग प्रबंधन नहीं किया है और डिवाइस रंग प्रबंधन निर्धारित करता है।

### Driver {#Driver}
```
public static PageColorManagement.PageColorManagementOption Driver
```


एप्लिकेशन ने रंग प्रबंधन नहीं किया है और ड्राइवर रंग प्रबंधन निर्धारित करता है।

### None {#None}
```
public static PageColorManagement.PageColorManagementOption None
```


एप्लिकेशन ने गंतव्य प्रोफ़ाइल के लिए रंग प्रबंधन किया है।

### System {#System}
```
public static PageColorManagement.PageColorManagementOption System
```


रंग प्रबंधन सिस्टम द्वारा किया जाता है। XPSDrv प्रिंट ड्राइवरों पर प्रिंट करते समय उपयोग नहीं किया जाना चाहिए।

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

