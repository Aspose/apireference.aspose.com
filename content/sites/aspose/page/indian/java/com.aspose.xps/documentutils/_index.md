---
title: "DocumentUtils"
second_title: "Aspose.Page for Java API संदर्भ"
description: "यह वर्ग औपचारिक XPS हेरफेर API से परे उपयोगिताएँ प्रदान करता है।"
type: docs
weight: 10
url: /hi/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

यह वर्ग औपचारिक XPS हेरफेर API से परे उपयोगिताएँ प्रदान करता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | एक वृत्त का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है। |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | दो कोणों के बीच एक वृत्तीय खंड का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है। |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | एक दीर्घवृत्त का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है। |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | एक आयताकार पाथ बनाता है जो एक छवि से भरा होता है। |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | एक आयताकार पाथ बनाता है जो एक छवि से भरा होता है। |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | दो रेडियल किरणों के बीच एक वृत्त स्लाइस का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है। |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | एक आयत का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है। |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | एक वृत्त के चारों ओर वर्णित नियमित n-गॉन का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है। |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | एक वृत्त में अंतःस्थापित नियमित n-गॉन का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### createCircle(Point2D center, float radius) {#createCircle-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createCircle(Point2D center, float radius)
```


एक वृत्त का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| center | java.awt.geom.Point2D | वृत्त का केंद्र बिंदु। |
| त्रिज्या | float | वृत्त की त्रिज्या। |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


दो कोणों के बीच एक वृत्तीय खंड का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| center | java.awt.geom.Point2D | वृत्त का केंद्र। |
| त्रिज्या | float | वृत्त की त्रिज्या। |
| startAngle | float | शुरुआती किरण का कोण (डिग्री) |
| endAngle | float | समाप्ति किरण का कोण (डिग्री) |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


एक दीर्घवृत्त का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| center | java.awt.geom.Point2D | अण्डाकार का केंद्र बिंदु। |
| radiusX | float | अण्डाकार की क्षैतिज त्रिज्या। |
| radiusY | float | अण्डाकार की लंबवत त्रिज्या। |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


एक आयताकार पाथ बनाता है जो एक छवि से भरा होता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fileName | java.lang.String | छवि फ़ाइल का नाम। |
| imageBox | java.awt.geom.Rectangle2D | छवि से भरने के लिए इमेज बॉक्स। |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


एक आयताकार पाथ बनाता है जो एक छवि से भरा होता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fileName | java.lang.String | छवि फ़ाइल का नाम। |
| imageBox | java.awt.geom.Rectangle2D | छवि से भरने के लिए इमेज बॉक्स। |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | छवि फिट मोड। |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


दो रेडियल किरणों के बीच एक वृत्त स्लाइस का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| center | java.awt.geom.Point2D | वृत्त का केंद्र। |
| त्रिज्या | float | वृत्त की त्रिज्या। |
| startAngle | float | शुरुआती किरण का कोण (डिग्री) |
| endAngle | float | समाप्ति किरण का कोण (डिग्री) |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


एक आयत का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | आयत। |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


एक वृत्त के चारों ओर वर्णित नियमित n-गॉन का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| n | int | शिखरों की संख्या। |
| center | java.awt.geom.Point2D | वृत्त का केंद्र। |
| त्रिज्या | float | वृत्त की त्रिज्या। |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


एक वृत्त में अंतःस्थापित नियमित n-गॉन का प्रतिनिधित्व करने वाली पाथ ज्योमेट्री बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| n | int | शिखरों की संख्या। |
| center | java.awt.geom.Point2D | वृत्त का केंद्र। |
| त्रिज्या | float | वृत्त की त्रिज्या। |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
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

