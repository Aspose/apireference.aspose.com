---
title: "XpsElement"
second_title: "Aspose.Page for Java API संदर्भ"
description: "सामान्य XPS तत्व सुविधाओं को सम्मिलित करने वाला वर्ग।"
type: docs
weight: 20
url: /hi/java/com.aspose.xps/xpselement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class XpsElement extends XpsObject implements Iterable<XpsContentElement>
```

सामान्य XPS तत्व सुविधाओं को सम्मिलित करने वाला वर्ग।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | इंडेक्स i द्वारा तत्व के बच्चों तक पहुँच प्रदान करता है। |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable इंटरफ़ेस का कार्यान्वयन। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [size()](#size--) | चाइल्ड एलिमेंट्स की संख्या लौटाता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


इंडेक्स i द्वारा तत्व के बच्चों तक पहुँच प्रदान करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| i | int | चाइल्ड एलिमेंट का इंडेक्स। |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Iterable इंटरफ़ेस का कार्यान्वयन।

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - सूची के लिए एन्यूमरेटर लौटाता है।
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### size() {#size--}
```
public int size()
```


चाइल्ड एलिमेंट्स की संख्या लौटाता है।

**Returns:**
int - चाइल्ड एलिमेंट्स की संख्या।
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

