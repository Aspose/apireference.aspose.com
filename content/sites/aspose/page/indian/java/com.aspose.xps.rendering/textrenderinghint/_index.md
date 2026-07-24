---
title: "TextRenderingHint"
second_title: "Aspose.Page for Java API संदर्भ"
description: "टेक्स्ट रेंडरिंग की गुणवत्ता को निर्दिष्ट करता है।"
type: docs
weight: 25
url: /hi/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

टेक्स्ट रेंडरिंग की गुणवत्ता को निर्दिष्ट करता है।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [AntiAlias](#AntiAlias) | प्रत्येक अक्षर को उसके एंटीएलियास्ड ग्लिफ़ बिटमैप का उपयोग करके बिना हिंटिंग के खींचा जाता है। |
| [AntiAliasGridFit](#AntiAliasGridFit) | प्रत्येक अक्षर को उसके एंटीएलियास्ड ग्लिफ़ बिटमैप का उपयोग करके हिंटिंग के साथ खींचा जाता है। |
| [ClearTypeGridFit](#ClearTypeGridFit) | प्रत्येक अक्षर को उसके ग्लिफ़ क्लियरटाइप बिटमैप का उपयोग करके हिंटिंग के साथ खींचा जाता है। |
| [SingleBitPerPixel](#SingleBitPerPixel) | प्रत्येक अक्षर को उसके ग्लिफ़ बिटमैप का उपयोग करके खींचा जाता है। |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | प्रत्येक अक्षर को उसके ग्लिफ़ बिटमैप का उपयोग करके खींचा जाता है। |
| [SystemDefault](#SystemDefault) | प्रत्येक अक्षर को उसके ग्लिफ़ बिटमैप का उपयोग करके, सिस्टम डिफ़ॉल्ट रेंडरिंग हिंट के साथ खींचा जाता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AntiAlias {#AntiAlias}
```
public static final TextRenderingHint AntiAlias
```


प्रत्येक अक्षर को उसके एंटीएलियास्ड ग्लिफ़ बिटमैप का उपयोग करके बिना हिंटिंग के खींचा जाता है। एंटीएलियासिंग के कारण बेहतर गुणवत्ता। चूँकि हिंटिंग बंद है, स्टेम चौड़ाई में अंतर दिखाई दे सकता है।

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


प्रत्येक अक्षर को उसके एंटीएलियास्ड ग्लिफ़ बिटमैप का उपयोग करके हिंटिंग के साथ खींचा जाता है। एंटीएलियासिंग के कारण बहुत बेहतर गुणवत्ता, लेकिन उच्च प्रदर्शन लागत के साथ।

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


प्रत्येक अक्षर को उसके ग्लिफ़ क्लियरटाइप बिटमैप का उपयोग करके हिंटिंग के साथ खींचा जाता है। सबसे उच्च गुणवत्ता सेटिंग। क्लियरटाइप फ़ॉन्ट सुविधाओं का लाभ उठाने के लिए उपयोग किया जाता है।

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


प्रत्येक अक्षर को उसके ग्लिफ़ बिटमैप का उपयोग करके खींचा जाता है। हिंटिंग का उपयोग नहीं किया गया है।

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


प्रत्येक अक्षर को उसके ग्लिफ़ बिटमैप का उपयोग करके खींचा जाता है। स्टेम और वक्रता पर अक्षर की उपस्थिति सुधारने के लिए हिंटिंग का उपयोग किया जाता है।

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


प्रत्येक अक्षर को उसके ग्लिफ़ बिटमैप का उपयोग करके, सिस्टम डिफ़ॉल्ट रेंडरिंग हिंट के साथ खींचा जाता है। टेक्स्ट को उपयोगकर्ता द्वारा सिस्टम के लिए चुनी गई किसी भी फ़ॉन्ट-स्मूथिंग सेटिंग का उपयोग करके खींचा जाएगा।

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static TextRenderingHint valueOf(String name)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | java.lang.String |  |

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint)
### values() {#values--}
```
public static TextRenderingHint[] values()
```




**Returns:**
com.aspose.xps.rendering.TextRenderingHint[]
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

