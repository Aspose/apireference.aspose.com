---
title: "Option"
second_title: "Aspose.Page for Java API संदर्भ"
description: "वह क्लास जो एक सामान्य PrintTicket  Option को लागू करता है।"
type: docs
weight: 76
url: /hi/java/com.aspose.xps.metadata/option/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Option extends CompositePrintTicketElement implements IFeatureItem
```

वह क्लास जो एक सामान्य PrintTicket  Option को लागू करता है। सभी स्कीमा-परिभाषित विकल्पों के लिए बेस क्लास। एक Option तत्व इस विकल्प से जुड़े सभी Property  और  ScoredProperty  तत्वों को समाहित करता है। https://docs.microsoft.com/en-us/windows/win32/printdocs/option
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [Option(String name, IOptionItem[] items)](#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-) | एक नया PrintTicket option इंस्टेंस बनाता है। |
| [Option(IOptionItem[] items)](#Option-com.aspose.xps.metadata.IOptionItem...-) | एक नया PrintTicket option इंस्टेंस बनाता है। |
| [Option(Option option)](#Option-com.aspose.xps.metadata.Option-) | एक क्लोन option इंस्टेंस बनाता है। |
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
### Option(String name, IOptionItem[] items) {#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(String name, IOptionItem[] items)
```


एक नया PrintTicket option इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | java.lang.String | एक मनमाना option नाम। |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | एक मनमाना IOptionItem  इंस्टेंस की सरणी। प्रत्येक को एक  ScoredProperty  या एक  Property  इंस्टेंस होना चाहिए। |

### Option(IOptionItem[] items) {#Option-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(IOptionItem[] items)
```


एक नया PrintTicket option इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | एक मनमाना IOptionItem  इंस्टेंस की सरणी। प्रत्येक को एक  ScoredProperty  या एक  Property  इंस्टेंस होना चाहिए। |

### Option(Option option) {#Option-com.aspose.xps.metadata.Option-}
```
public Option(Option option)
```


एक क्लोन option इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| option | [Option](../../com.aspose.xps.metadata/option) | क्लोन करने के लिए एक option इंस्टेंस। |

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

