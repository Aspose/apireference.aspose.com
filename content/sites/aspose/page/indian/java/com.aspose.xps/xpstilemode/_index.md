---
title: "XpsTileMode"
second_title: "Aspose.Page for Java API संदर्भ"
description: "टाइलिंग ब्रश के TileMode प्रॉपर्टी के मान्य मान।"
type: docs
weight: 66
url: /hi/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

टाइलिंग ब्रशेज़ के TileMode गुण के वैध मान।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [FlipX](#FlipX) | टाइल व्यवस्था Tile टाइल मोड के समान है, लेकिन टाइलों की वैकल्पिक कॉलम क्षैतिज रूप से उलटी होती हैं। |
| [FlipXY](#FlipXY) | टाइल व्यवस्था Tile टाइल मोड के समान है, लेकिन टाइलों की वैकल्पिक कॉलम क्षैतिज रूप से और वैकल्पिक पंक्तियाँ लंबवत रूप से उलटी होती हैं। |
| [FlipY](#FlipY) | टाइल व्यवस्था Tile टाइल मोड के समान है, लेकिन टाइलों की वैकल्पिक पंक्तियाँ लंबवत रूप से उलटी होती हैं। |
| [None](#None) | इस मोड में, केवल एकल आधार टाइल खींची जाती है। |
| [Tile](#Tile) | इस मोड में, आधार टाइल खींची जाती है और शेष क्षेत्र को आधार टाइल को दोहराकर भरा जाता है ताकि प्रत्येक टाइल का दायाँ किनारा अगले टाइल के बाएँ किनारे से जुड़ता है, और प्रत्येक टाइल का निचला किनारा अगले टाइल के ऊपर वाले किनारे से जुड़ता है। |
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
### FlipX {#FlipX}
```
public static final XpsTileMode FlipX
```


टाइल व्यवस्था Tile टाइल मोड के समान है, लेकिन टाइलों की वैकल्पिक कॉलम क्षैतिज रूप से उलटी होती हैं। आधार टाइल को व्यूपोर्ट द्वारा निर्दिष्ट अनुसार स्थित किया जाता है। इस टाइल के बाएँ और दाएँ कॉलम में स्थित टाइलें क्षैतिज रूप से उलटी होती हैं।

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


टाइल व्यवस्था Tile टाइल मोड के समान है, लेकिन टाइलों की वैकल्पिक कॉलम क्षैतिज रूप से और वैकल्पिक पंक्तियाँ लंबवत रूप से उलटी होती हैं। आधार टाइल को व्यूपोर्ट द्वारा निर्दिष्ट अनुसार स्थित किया जाता है।

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


टाइल व्यवस्था Tile टाइल मोड के समान है, लेकिन टाइलों की वैकल्पिक पंक्तियाँ लंबवत रूप से उलटी होती हैं। आधार टाइल को व्यूपोर्ट द्वारा निर्दिष्ट अनुसार स्थित किया जाता है। ऊपर और नीचे की पंक्तियाँ लंबवत रूप से उलटी होती हैं।

### None {#None}
```
public static final XpsTileMode None
```


इस मोड में, केवल एकल आधार टाइल खींची जाती है। शेष क्षेत्र को पारदर्शी छोड़ दिया जाता है।

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


इस मोड में, आधार टाइल खींची जाती है और शेष क्षेत्र को आधार टाइल को दोहराकर भरा जाता है ताकि प्रत्येक टाइल का दायाँ किनारा अगले टाइल के बाएँ किनारे से जुड़ता है, और प्रत्येक टाइल का निचला किनारा अगले टाइल के ऊपर वाले किनारे से जुड़ता है।

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
public static XpsTileMode valueOf(String name)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | java.lang.String |  |

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode)
### values() {#values--}
```
public static XpsTileMode[] values()
```




**Returns:**
com.aspose.xps.XpsTileMode[]
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

