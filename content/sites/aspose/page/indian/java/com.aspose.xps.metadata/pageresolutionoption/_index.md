---
title: "PageResolution.PageResolutionOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PageResolution फीचर विकल्पों का वर्णन करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.xps.metadata/pageresolution.pageresolutionoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageResolution.IPageResolutionItem](../../com.aspose.xps.metadata/ipageresolutionitem)
```
public static final class PageResolution.PageResolutionOption extends Option implements PageResolution.IPageResolutionItem
```

वर्णन करता है  PageResolution  फीचर विकल्पों को।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items)](#PageResolutionOption-java.lang.String-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-) | एक नया इंस्टेंस बनाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। |
| [add(PageResolution.IPageResolutionOptionItem[] items)](#add-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-) | विकल्प में  IPageResolutionOptionItem  इंस्टेंस की एक एरे जोड़ता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | एलिमेंट का नाम प्राप्त करता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setResolutionX(int resolutionX)](#setResolutionX-int-) | ResolutionX स्कोर किया गया प्रॉपर्टी मान सेट करता है। |
| [setResolutionY(int resolutionY)](#setResolutionY-int-) | ResolutionY स्कोर किया गया प्रॉपर्टी मान सेट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items) {#PageResolutionOption-java.lang.String-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-}
```
public PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| optionName | java.lang.String | एक विकल्प का नाम। |
| items | [IPageResolutionOptionItem\[\]](../../com.aspose.xps.metadata/ipageresolutionoptionitem) | IPageResolutionOptionItem इंस्टैंसेज़ की एक मनमानी सरणी। |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। प्रत्येक को  ScoredProperty  या  Property  इंस्टेंस होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | जोड़ने के लिए आइटमों की सूची। |

### add(PageResolution.IPageResolutionOptionItem[] items) {#add-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-}
```
public PageResolution.PageResolutionOption add(PageResolution.IPageResolutionOptionItem[] items)
```


विकल्प में  IPageResolutionOptionItem  इंस्टेंस की एक एरे जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IPageResolutionOptionItem\[\]](../../com.aspose.xps.metadata/ipageresolutionoptionitem) | IPageResolutionOptionItem इंस्टैंसेज़ की एक मनमानी सरणी। |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This options instance.
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




### setResolutionX(int resolutionX) {#setResolutionX-int-}
```
public PageResolution.PageResolutionOption setResolutionX(int resolutionX)
```


ResolutionX स्कोर किया गया प्रॉपर्टी मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| resolutionX | int | ResolutionX स्कोर किया गया प्रॉपर्टी मान। |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This option instance.
### setResolutionY(int resolutionY) {#setResolutionY-int-}
```
public PageResolution.PageResolutionOption setResolutionY(int resolutionY)
```


ResolutionY स्कोर किया गया प्रॉपर्टी मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| resolutionY | int | ResolutionY स्कोर किया गया प्रॉपर्टी मान। |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This option instance.
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

