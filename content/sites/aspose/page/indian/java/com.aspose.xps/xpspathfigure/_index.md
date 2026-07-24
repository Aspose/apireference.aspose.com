---
title: "XpsPathFigure"
second_title: "Aspose.Page for Java API संदर्भ"
description: "पाथफ़िगर एलिमेंट फीचर्स को संलग्न करने वाली क्लास।"
type: docs
weight: 41
url: /hi/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

PathFigure तत्व की विशेषताओं को संलग्न करने वाली क्लास। यह तत्व एक या अधिक रेखा या वक्र खंडों के सेट से बना होता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [add(T obj)](#add-T-) | एरे में एक नया ऑब्जेक्ट जोड़ता है। |
| [deepClone()](#deepClone--) | इस पाथ फ़िगर को क्लोन करता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | इंडेक्स i द्वारा एरे के तत्व तक पहुँच प्रदान करता है। |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | चाइल्ड पाथ सेगमेंट्स की सूची लौटाता है। |
| [getStartPoint()](#getStartPoint--) | पाथ फ़िगर के पहले सेगमेंट के प्रारंभिक बिंदु को लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | निर्दिष्ट स्थिति पर एरे में एक नया ऑब्जेक्ट सम्मिलित करता है। |
| [isClosed()](#isClosed--) | यह दर्शाने वाला मान लौटाता है कि पाथ फ़िगर बंद है या नहीं। |
| [isFilled()](#isFilled--) | यह दर्शाने वाला मान लौटाता है कि पाथ फ़िगर को समावेशी पाथ ज्योमेट्री के क्षेत्रफल की गणना में उपयोग किया गया है या नहीं। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | एरे से एक ऑब्जेक्ट हटाता है। |
| [removeAt(int index)](#removeAt-int-) | निर्दिष्ट स्थिति पर एरे से एक ऑब्जेक्ट हटाता है। |
| [setClosed(boolean value)](#setClosed-boolean-) | पाथ फ़िगर के बंद होने को दर्शाने वाला मान सेट करता है। |
| [setFilled(boolean value)](#setFilled-boolean-) | समावेशी पाथ ज्योमेट्री के क्षेत्रफल की गणना में पाथ फ़िगर के उपयोग को दर्शाने वाला मान सेट करता है। |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | पाथ फ़िगर के पहले सेगमेंट के प्रारंभिक बिंदु को सेट करता है। |
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
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


इस पाथ फ़िगर को क्लोन करता है।

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


चाइल्ड पाथ सेगमेंट्स की सूची लौटाता है।

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - चाइल्ड पाथ सेगमेंट्स की सूची।
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


पाथ फ़िगर के पहले सेगमेंट के प्रारंभिक बिंदु को लौटाता है।

**Returns:**
java.awt.geom.Point2D - पाथ फ़िगर के पहले सेगमेंट के प्रारंभिक बिंदु।
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
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


यह दर्शाने वाला मान लौटाता है कि पाथ फ़िगर बंद है या नहीं।

**Returns:**
boolean - पथ आकृति बंद है या नहीं यह दर्शाने वाला मान।
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


यह दर्शाने वाला मान लौटाता है कि पाथ फ़िगर को समावेशी पाथ ज्योमेट्री के क्षेत्रफल की गणना में उपयोग किया गया है या नहीं।

**Returns:**
boolean - यह दर्शाने वाला मान कि पथ आकृति का उपयोग समाहित पथ ज्यामिति के क्षेत्रफल की गणना में किया जाता है या नहीं।
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
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


पाथ फ़िगर के बंद होने को दर्शाने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | boolean | पथ आकृति बंद है या नहीं यह दर्शाने वाला मान। |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


समावेशी पाथ ज्योमेट्री के क्षेत्रफल की गणना में पाथ फ़िगर के उपयोग को दर्शाने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | boolean | पथ आकृति का उपयोग समाहित पथ ज्यामिति के क्षेत्रफल की गणना में किया जाता है या नहीं यह दर्शाने वाला मान। |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


पाथ फ़िगर के पहले सेगमेंट के प्रारंभिक बिंदु को सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.awt.geom.Point2D | पाथ फ़िगर के पहले सेगमेंट के लिए प्रारंभिक बिंदु। |

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

