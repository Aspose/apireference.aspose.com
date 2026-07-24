---
title: "InputBin.InputBinOption"
second_title: "Aspose.Page for Java API संदर्भ"
description: "JobInputBin, DocumentInputBin और PageInputBin सुविधाओं के विकल्पों का वर्णन करता है।"
type: docs
weight: 14
url: /hi/java/com.aspose.xps.metadata/inputbin.inputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.InputBin.IInputBinItem](../../com.aspose.xps.metadata/iinputbinitem)
```
public static final class InputBin.InputBinOption extends Option implements InputBin.IInputBinItem
```

JobInputBin, DocumentInputBin और PageInputBin फीचर विकल्पों का वर्णन करता है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)](#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | एक नया इंस्टेंस बनाता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [AutoSelect](#AutoSelect) | डिवाइस कॉन्फ़िगरेशन के आधार पर स्वचालित रूप से सबसे अच्छा विकल्प चुनेगा। |
| [AutoSheetFeeder](#AutoSheetFeeder) | इंकजेट प्रिंटरों के लिए डिवाइस इनपुट ट्रे। |
| [Cassette](#Cassette) | निर्देश देता है कि फीड बिन एक कैसिट है। |
| [Manual](#Manual) | डिफ़ॉल्ट मैनुअल फीड बिन को निर्दिष्ट करता है। |
| [Tractor](#Tractor) | निर्देश देता है कि फीड बिन एक ट्रैक्टर है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। |
| [add(InputBin.IInputBinOptionItem[] items)](#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | विकल्प में  IInputBinOptionItem  इंस्टेंस की एक एरे जोड़ता है। |
| [clone()](#clone--) | इस विकल्प इंस्टेंस को क्लोन करता है। |
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
### InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items) {#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)
```


एक नया इंस्टेंस बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| optionName | java.lang.String | एक विकल्प का नाम। |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | IInputBinOptionItem  इंस्टेंस की एक मनमानी एरे। |

### AutoSelect {#AutoSelect}
```
public static final InputBin.InputBinOption AutoSelect
```


डिवाइस कॉन्फ़िगरेशन के आधार पर स्वचालित रूप से सबसे अच्छा विकल्प चुनेगा।

### AutoSheetFeeder {#AutoSheetFeeder}
```
public static final InputBin.InputBinOption AutoSheetFeeder
```


इंकजेट प्रिंटरों के लिए डिवाइस इनपुट ट्रे।

### Cassette {#Cassette}
```
public static final InputBin.InputBinOption Cassette
```


निर्देश देता है कि फीड बिन एक कैसिट है।

### Manual {#Manual}
```
public static final InputBin.InputBinOption Manual
```


डिफ़ॉल्ट मैनुअल फीड बिन को निर्दिष्ट करता है।

### Tractor {#Tractor}
```
public static final InputBin.InputBinOption Tractor
```


निर्देश देता है कि फीड बिन एक ट्रैक्टर है।

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


इस विकल्प की आइटम सूची के अंत में आइटमों की एक सूची जोड़ता है। प्रत्येक को  ScoredProperty  या  Property  इंस्टेंस होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | जोड़ने के लिए आइटमों की सूची। |

### add(InputBin.IInputBinOptionItem[] items) {#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBin.InputBinOption add(InputBin.IInputBinOptionItem[] items)
```


विकल्प में  IInputBinOptionItem  इंस्टेंस की एक एरे जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | IInputBinOptionItem  इंस्टेंस की एक मनमानी एरे। |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This options instance.
### clone() {#clone--}
```
public InputBin.InputBinOption clone()
```


इस विकल्प इंस्टेंस को क्लोन करता है।

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - The clone of this option instance.
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

