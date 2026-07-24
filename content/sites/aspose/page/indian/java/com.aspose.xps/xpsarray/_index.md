---
title: "XpsArray"
second_title: "Aspose.Page for Java API संदर्भ"
description: "सामान्य XPS मॉडल एरे ऑब्जेक्ट सुविधाओं को सम्मिलित करने वाला वर्ग।"
type: docs
weight: 14
url: /hi/java/com.aspose.xps/xpsarray/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public abstract class XpsArray<T> extends XpsObject
```

सामान्य XPS मॉडल एरे ऑब्जेक्ट सुविधाओं को सम्मिलित करने वाला वर्ग।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [add(T obj)](#add-T-) | एरे में एक नया ऑब्जेक्ट जोड़ता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | इंडेक्स i द्वारा एरे के तत्व तक पहुँच प्रदान करता है। |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | निर्दिष्ट स्थिति पर एरे में एक नया ऑब्जेक्ट सम्मिलित करता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | एरे से एक ऑब्जेक्ट हटाता है। |
| [removeAt(int index)](#removeAt-int-) | निर्दिष्ट स्थिति पर एरे से एक ऑब्जेक्ट हटाता है। |
| [size()](#size--) | तत्वों की संख्या लौटाता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


एरे में एक नया ऑब्जेक्ट जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | T | जोड़ने के लिए ऑब्जेक्ट। |

**Returns:**
T - जोड़ा गया ऑब्जेक्ट।
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
public T get(int i)
```


इंडेक्स i द्वारा एरे के तत्व तक पहुँच प्रदान करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| i | int | तत्व का इंडेक्स। |

**Returns:**
T - i स्थिति पर तत्व।
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
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


निर्दिष्ट स्थिति पर एरे में एक नया ऑब्जेक्ट सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | ऑब्जेक्ट सम्मिलित करने की स्थिति। |
| obj | T | सम्मिलित करने के लिए ऑब्जेक्ट। |

**Returns:**
T - सम्मिलित ऑब्जेक्ट।
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


एरे से एक ऑब्जेक्ट हटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | T | हटाने के लिए वस्तु। |

**Returns:**
T - हटाई गई वस्तु।
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


निर्दिष्ट स्थिति पर एरे से एक ऑब्जेक्ट हटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | वस्तु को हटाने की स्थिति। |

**Returns:**
T - हटाई गई वस्तु।
### size() {#size--}
```
public int size()
```


तत्वों की संख्या लौटाता है।

**Returns:**
int - तत्वों की संख्या।
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

