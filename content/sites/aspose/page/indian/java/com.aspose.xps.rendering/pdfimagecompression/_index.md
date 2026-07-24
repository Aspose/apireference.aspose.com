---
title: "PdfImageCompression"
second_title: "Aspose.Page for Java API संदर्भ"
description: "PDF फ़ाइल में इमेज पर लागू किए जाने वाले संपीड़न प्रकार को निर्दिष्ट करता है।"
type: docs
weight: 22
url: /hi/java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

PDF फ़ाइल में इमेज पर लागू किए जाने वाले संपीड़न प्रकार को निर्दिष्ट करता है।
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| [Auto](#Auto) | प्रत्येक छवि के लिए सबसे उपयुक्त संपीड़न को स्वचालित रूप से चुनता है। |
| [Flate](#Flate) | Flate संपीड़न। |
| [Jpeg](#Jpeg) | JPEG संपीड़न। |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | प्रेडिक्टर चयन को प्रक्रिया को तेज करने के लिए PNG Paeth प्रेडिक्टर तक सीमित किया गया है। |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | प्रेडिक्टर चयन अधिक जटिल है और इससे छोटी छवि आकार मिलनी चाहिए लेकिन अधिक समय लगेगा। |
| [None](#None) | कच्चे छवि बाइट्स को सहेजता है जिससे PDF फ़ाइल आकार बड़ा हो जाता है। |
| [Rle](#Rle) | Run Length संपीड़न। |
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
### Auto {#Auto}
```
public static final PdfImageCompression Auto
```


प्रत्येक छवि के लिए सबसे उपयुक्त संपीड़न को स्वचालित रूप से चुनता है।

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Flate संपीड़न।

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


JPEG संपीड़न। पारदर्शिता का समर्थन नहीं करता।

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


प्रेडिक्टर चयन को प्रक्रिया को तेज करने के लिए PNG Paeth प्रेडिक्टर तक सीमित किया गया है। व्यवहार में यह आश्चर्यजनक रूप से अच्छा प्रदर्शन करता है। LzwOptimizedPredictor से बेहतर।

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


प्रेडिक्टर चयन अधिक जटिल है और इससे छोटी छवि आकार मिलनी चाहिए लेकिन अधिक समय लगेगा।

### None {#None}
```
public static final PdfImageCompression None
```


कच्चे छवि बाइट्स को सहेजता है जिससे PDF फ़ाइल आकार बड़ा हो जाता है।

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


Run Length संपीड़न।

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
public static PdfImageCompression valueOf(String name)
```




**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | java.lang.String |  |

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression)
### values() {#values--}
```
public static PdfImageCompression[] values()
```




**Returns:**
com.aspose.xps.rendering.PdfImageCompression[]
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

