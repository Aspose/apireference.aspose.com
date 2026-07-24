---
title: "XpsArcSegment"
second_title: "Aspose.Page for Java API संदर्भ"
description: "ArcSegment तत्व सुविधाओं को सम्मिलित करने वाला वर्ग।"
type: docs
weight: 13
url: /hi/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

ArcSegment तत्व की विशेषताओं को समाहित करने वाली क्लास। यह तत्व एक दीर्घवृत्तीय चाप का वर्णन करता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [deepClone()](#deepClone--) | इस आर्क सेगमेंट की क्लोन बनाता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | दीर्घवृत्तीय चाप के अंत बिंदु को लौटाता है। |
| [getRotationAngle()](#getRotationAngle--) | वर्तमान निर्देशांक प्रणाली के सापेक्ष दीर्घवृत्त के घूर्णन को दर्शाने वाला मान लौटाता है। |
| [getSize()](#getSize--) | दीर्घवृत्तीय चाप के x और y त्रिज्या को x,y जोड़े के रूप में लौटाता है। |
| [getSweepDirection()](#getSweepDirection--) | चाप के खींचे जाने की दिशा को निर्दिष्ट करने वाला मान लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | चाप को 180 या उससे अधिक के स्वेप के साथ खींचा गया है या नहीं, यह निर्धारित करने वाला मान लौटाता है। |
| [isStroked()](#isStroked--) | इस पाथ सेगमेंट के लिए स्ट्रोक खींचा गया है या नहीं, यह निर्दिष्ट करने वाला मान लौटाता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | वक्र को 180 या अधिक के स्वेप के साथ खींचा जाता है या नहीं, यह निर्धारित करने वाला मान सेट करता है। |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | अण्डाकार वक्र के अंत बिंदु को सेट करता है। |
| [setRotationAngle(float value)](#setRotationAngle-float-) | वर्तमान निर्देशांक प्रणाली के सापेक्ष अण्डाकार कैसे घुमाया गया है, यह दर्शाने वाला मान सेट करता है। |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | अण्डाकार वक्र के x और y त्रिज्या को x,y जोड़े के रूप में सेट करता है। |
| [setStroked(boolean value)](#setStroked-boolean-) | इस पाथ सेगमेंट के लिए स्ट्रोक खींचा गया है या नहीं, यह निर्दिष्ट करने वाला मान सेट करता है। |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | वक्र जिस दिशा में खींचा जाता है, उसे निर्दिष्ट करने वाला मान सेट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


इस आर्क सेगमेंट की क्लोन बनाता है।

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
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
### getPoint() {#getPoint--}
```
public Point2D getPoint()
```


दीर्घवृत्तीय चाप के अंत बिंदु को लौटाता है।

**Returns:**
java.awt.geom.Point2D - अण्डाकार वक्र का अंत बिंदु।
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


वर्तमान निर्देशांक प्रणाली के सापेक्ष दीर्घवृत्त के घूर्णन को दर्शाने वाला मान लौटाता है।

**Returns:**
float - वर्तमान निर्देशांक प्रणाली के सापेक्ष अण्डाकार कैसे घुमाया गया है, यह दर्शाने वाला मान।
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


दीर्घवृत्तीय चाप के x और y त्रिज्या को x,y जोड़े के रूप में लौटाता है।

**Returns:**
java.awt.geom.Dimension2D - अण्डाकार वक्र के x और y त्रिज्या को x,y जोड़े के रूप में।
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


चाप के खींचे जाने की दिशा को निर्दिष्ट करने वाला मान लौटाता है।

**Returns:**
[XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) - The value specifying the direction in which the arc is drawn.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLargeArc() {#isLargeArc--}
```
public boolean isLargeArc()
```


चाप को 180 या उससे अधिक के स्वेप के साथ खींचा गया है या नहीं, यह निर्धारित करने वाला मान लौटाता है।

**Returns:**
boolean - वक्र को 180 या अधिक के स्वेप के साथ खींचा जाता है या नहीं, यह निर्धारित करने वाला मान।
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


इस पाथ सेगमेंट के लिए स्ट्रोक खींचा गया है या नहीं, यह निर्दिष्ट करने वाला मान लौटाता है।

**Returns:**
boolean - इस पाथ सेगमेंट के लिए स्ट्रोक खींचा गया है या नहीं, यह निर्दिष्ट करने वाला मान।
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setLargeArc(boolean value) {#setLargeArc-boolean-}
```
public void setLargeArc(boolean value)
```


वक्र को 180 या अधिक के स्वेप के साथ खींचा जाता है या नहीं, यह निर्धारित करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | boolean | वक्र को 180 या अधिक के स्वेप के साथ खींचा जाता है या नहीं, यह निर्धारित करने वाला मान। |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


अण्डाकार वक्र के अंत बिंदु को सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.awt.geom.Point2D | अण्डाकार वक्र का अंत बिंदु। |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


वर्तमान निर्देशांक प्रणाली के सापेक्ष अण्डाकार कैसे घुमाया गया है, यह दर्शाने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | वर्तमान निर्देशांक प्रणाली के सापेक्ष अण्डाकार कैसे घुमाया गया है, यह दर्शाने वाला मान। |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


अण्डाकार वक्र के x और y त्रिज्या को x,y जोड़े के रूप में सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.awt.geom.Dimension2D | दीर्घवृत्तीय चाप की x और y त्रिज्या को x,y जोड़े के रूप में। |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


इस पाथ सेगमेंट के लिए स्ट्रोक खींचा गया है या नहीं, यह निर्दिष्ट करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | boolean | इस पाथ सेगमेंट के लिए स्ट्रोक खींचा गया है या नहीं, यह निर्दिष्ट करने वाला मान। |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


वक्र जिस दिशा में खींचा जाता है, उसे निर्दिष्ट करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | वक्र जिस दिशा में खींचा जाता है, उसे निर्दिष्ट करने वाला मान। |

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

