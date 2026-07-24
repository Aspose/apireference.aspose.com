---
title: "XpsPathGeometry"
second_title: "Aspose.Page for Java API संदर्भ"
description: "पाथजियोमेट्री प्रॉपर्टी एलिमेंट फीचर्स को संलग्न करने वाली क्लास।"
type: docs
weight: 42
url: /hi/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

PathGeometry प्रॉपर्टी एलिमेंट फीचर्स को समाहित करने वाला क्लास। यह एलिमेंट Figures एट्रिब्यूट या एक चाइल्ड PathFigure एलिमेंट के साथ निर्दिष्ट पाथ फ़िगर्स का सेट रखता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [add(T obj)](#add-T-) | एरे में एक नया ऑब्जेक्ट जोड़ता है। |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची में एक पाथ सेगमेंट जोड़ता है। |
| [deepClone()](#deepClone--) | इस पाथ जियोमेट्री की क्लोन बनाता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | इंडेक्स i द्वारा एरे के तत्व तक पहुँच प्रदान करता है। |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | ज्यामितीय आकारों के प्रतिच्छेदित क्षेत्रों को एक क्षेत्र बनाने के लिए कैसे संयोजित किया जाता है, यह निर्दिष्ट करने वाला मान लौटाता है। |
| [getPathFigures()](#getPathFigures--) | चाइल्ड पाथ फ़िगर्स की सूची लौटाता है। |
| [getTransform()](#getTransform--) | पाथ जियोमेट्री के सभी चाइल्ड और वंशज एलिमेंट्स पर भरने, क्लिपिंग या स्ट्रोकिंग से पहले लागू होने वाली स्थानीय मैट्रिक्स ट्रांसफ़ॉर्मेशन स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | निर्दिष्ट स्थिति पर एरे में एक नया ऑब्जेक्ट सम्मिलित करता है। |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची में निर्दिष्ट इंडेक्स स्थिति पर एक पाथ सेगमेंट सम्मिलित करता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | एरे से एक ऑब्जेक्ट हटाता है। |
| [removeAt(int index)](#removeAt-int-) | निर्दिष्ट स्थिति पर एरे से एक ऑब्जेक्ट हटाता है। |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची से एक पाथ सेगमेंट हटाता है। |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची से निर्दिष्ट इंडेक्स स्थिति पर एक पाथ सेगमेंट हटाता है। |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | ज्यामितीय आकारों के प्रतिच्छेदित क्षेत्रों को एक क्षेत्र बनाने के लिए कैसे संयोजित किया जाता है, यह निर्दिष्ट करने वाला मान सेट करता है। |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | पाथ जियोमेट्री के सभी चाइल्ड और वंशज एलिमेंट्स पर भरने, क्लिपिंग या स्ट्रोकिंग से पहले लागू होने वाली स्थानीय मैट्रिक्स ट्रांसफ़ॉर्मेशन स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स सेट करता है। |
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
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची में एक पाथ सेगमेंट जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | जोड़ने के लिए पाथ सेगमेंट। |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


इस पाथ जियोमेट्री की क्लोन बनाता है।

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


ज्यामितीय आकारों के प्रतिच्छेदित क्षेत्रों को एक क्षेत्र बनाने के लिए कैसे संयोजित किया जाता है, यह निर्दिष्ट करने वाला मान लौटाता है।

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


चाइल्ड पाथ फ़िगर्स की सूची लौटाता है।

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - चाइल्ड पाथ फ़िगर्स की सूची।
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


पाथ जियोमेट्री के सभी चाइल्ड और वंशज एलिमेंट्स पर भरने, क्लिपिंग या स्ट्रोकिंग से पहले लागू होने वाली स्थानीय मैट्रिक्स ट्रांसफ़ॉर्मेशन स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स लौटाता है।

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
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
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची में निर्दिष्ट इंडेक्स स्थिति पर एक पाथ सेगमेंट सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | सेगमेंट को सम्मिलित करने की स्थिति। |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | सम्मिलित करने के लिए पाथ सेगमेंट। |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
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
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची से एक पाथ सेगमेंट हटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | हटाने के लिए पाथ सेगमेंट। |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची से निर्दिष्ट इंडेक्स स्थिति पर एक पाथ सेगमेंट हटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | पाथ सेगमेंट को हटाने की स्थिति। |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


ज्यामितीय आकारों के प्रतिच्छेदित क्षेत्रों को एक क्षेत्र बनाने के लिए कैसे संयोजित किया जाता है, यह निर्दिष्ट करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | ज्यामितीय आकारों के प्रतिच्छेदित क्षेत्रों को एक क्षेत्र बनाने के लिए कैसे संयोजित किया जाता है, यह निर्दिष्ट करने वाला मान। |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


पाथ जियोमेट्री के सभी चाइल्ड और वंशज एलिमेंट्स पर भरने, क्लिपिंग या स्ट्रोकिंग से पहले लागू होने वाली स्थानीय मैट्रिक्स ट्रांसफ़ॉर्मेशन स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | अफ़ाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स। |

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

