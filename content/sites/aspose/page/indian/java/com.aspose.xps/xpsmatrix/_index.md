---
title: "XpsMatrix"
second_title: "Aspose.Page for Java API संदर्भ"
description: "मैट्रिक्सट्रांसफ़ॉर्म प्रॉपर्टी एलिमेंट फीचर्स को संलग्न करने वाली क्लास।"
type: docs
weight: 36
url: /hi/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

MatrixTransform प्रॉपर्टी तत्व की विशेषताओं को समाहित करने वाला वर्ग। यह तत्व तत्वों के कॉर्डिनेट सिस्टम को बदलने के लिए उपयोग किए जाने वाले मनमाने अफाइन मैट्रिक्स ट्रांसफ़ॉर्मेशन को परिभाषित करता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [deepClone()](#deepClone--) | इस ट्रांसफ़ॉर्मेशन मैट्रिक्स की प्रतिलिपि बनाता है। |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | वास्तविक कार्यान्वयन। |
| [equals(Object obj)](#equals-java.lang.Object-) | निर्धारित करता है कि निर्दिष्ट ऑब्जेक्ट इस इंस्टेंस के बराबर है या नहीं। |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | M11 तत्व प्राप्त करता है। |
| [getM12()](#getM12--) | M12 तत्व प्राप्त करता है। |
| [getM21()](#getM21--) | M21 तत्व प्राप्त करता है। |
| [getM22()](#getM22--) | M22 तत्व प्राप्त करता है। |
| [getM31()](#getM31--) | M31 तत्व को प्राप्त करता है। |
| [getM32()](#getM32--) | M32 तत्व को प्राप्त करता है। |
| [hashCode()](#hashCode--) | इस उदाहरण के लिए हैश कोड लौटाता है। |
| [isIdentity()](#isIdentity--) | एक मान प्राप्त करता है जो दर्शाता है कि यह उदाहरण पहचान मैट्रिक्स है या नहीं। |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | डिफ़ॉल्ट (Prepend) क्रम में इस मैट्रिक्स को  matrix  द्वारा निर्दिष्ट मैट्रिक्स से गुणा करता है। |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | इस मैट्रिक्स को  matrix  द्वारा निर्दिष्ट मैट्रिक्स से  matrixOrder  द्वारा निर्दिष्ट क्रम में गुणा करता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | ऑपरेटर == को लागू करता है। |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | ऑपरेटर ! को लागू करता है। |
| [reset()](#reset--) | इस मैट्रिक्स को पहचान मैट्रिक्स में रीसेट करता है। |
| [rotate(float angle)](#rotate-float-) | डिफ़ॉल्ट (Prepend) क्रम में इस मैट्रिक्स पर  angle  द्वारा घड़ी की दिशा में घुमाव लागू करता है। |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | इस मैट्रिक्स पर  angle  द्वारा घड़ी की दिशा में घुमाव को  matrixOrder  द्वारा निर्दिष्ट क्रम में लागू करता है। |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | डिफ़ॉल्ट (Prepend) क्रम में इस मैट्रिक्स पर  pivot  के चारों ओर  angle  द्वारा घड़ी की दिशा में घुमाव लागू करता है। |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | इस मैट्रिक्स पर  pivot  के चारों ओर  angle  द्वारा घड़ी की दिशा में घुमाव को  matrixOrder  द्वारा निर्दिष्ट क्रम में लागू करता है। |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | डिफ़ॉल्ट (Prepend) क्रम में इस मैट्रिक्स पर निर्दिष्ट स्केल वेक्टर (scaleX और scaleY) लागू करता है। |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | इस मैट्रिक्स पर निर्दिष्ट स्केल वेक्टर (scaleX और scaleY) को  matrixOrder  द्वारा निर्दिष्ट क्रम में लागू करता है। |
| [skew(double skewX, double skewY)](#skew-double-double-) | निर्दिष्ट स्क्यू ट्रांसफ़ॉर्मेशन को इस मैट्रिक्स पर लागू करता है। |
| [toString()](#toString--) | इस  XpsMatrix  उदाहरण का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को एक निर्दिष्ट आयत पर लागू करता है। |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को एक निर्दिष्ट बिंदु पर लागू करता है। |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को एक निर्दिष्ट बिंदुओं की सरणी पर लागू करता है। |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को बिंदुओं की सरणी के एक निर्दिष्ट भाग पर लागू करता है। |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | निर्दिष्ट ट्रांसलेशन वेक्टर को इस मैट्रिक्स पर लागू करता है। |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | निर्दिष्ट ट्रांसलेशन वेक्टर को इस मैट्रिक्स पर  matrixOrder  द्वारा निर्दिष्ट क्रम में लागू करता है। |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


इस ट्रांसफ़ॉर्मेशन मैट्रिक्स की प्रतिलिपि बनाता है।

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


वास्तविक कार्यान्वयन।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | पहला मैट्रिक्स। |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | दूसरा मैट्रिक्स। |

**Returns:**
बूलियन - यदि मैट्रिसेस बराबर हों तो [true]
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


निर्धारित करता है कि निर्दिष्ट ऑब्जेक्ट इस इंस्टेंस के बराबर है या नहीं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | java.lang.Object | इस उदाहरण के साथ तुलना करने के लिए वस्तु। |

**Returns:**
बूलियन - यदि निर्दिष्ट वस्तु इस उदाहरण के बराबर हो तो true; अन्यथा false। obj पैरामीटर null है।
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getM11() {#getM11--}
```
public float getM11()
```


M11 तत्व प्राप्त करता है।

**Returns:**
फ़्लोट - M11 तत्व।
### getM12() {#getM12--}
```
public float getM12()
```


M12 तत्व प्राप्त करता है।

**Returns:**
फ़्लोट - M12 तत्व।
### getM21() {#getM21--}
```
public float getM21()
```


M21 तत्व प्राप्त करता है।

**Returns:**
फ़्लोट - M21 तत्व।
### getM22() {#getM22--}
```
public float getM22()
```


M22 तत्व प्राप्त करता है।

**Returns:**
फ़्लोट - M22 तत्व।
### getM31() {#getM31--}
```
public float getM31()
```


M31 तत्व को प्राप्त करता है।

**Returns:**
फ़्लोट - M31 तत्व।
### getM32() {#getM32--}
```
public float getM32()
```


M32 तत्व को प्राप्त करता है।

**Returns:**
फ़्लोट - M32 तत्व।
### hashCode() {#hashCode--}
```
public int hashCode()
```


इस उदाहरण के लिए हैश कोड लौटाता है।

**Returns:**
इंट - इस उदाहरण के लिए एक हैश कोड, जो हैशिंग एल्गोरिदम और हैश टेबल जैसी डेटा संरचनाओं में उपयोग के लिए उपयुक्त है।
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


एक मान प्राप्त करता है जो दर्शाता है कि यह उदाहरण पहचान मैट्रिक्स है या नहीं।

मान: यदि यह उदाहरण पहचान मैट्रिक्स है तो True; अन्यथा false।

**Returns:**
बूलियन - यह दर्शाने वाला मान कि यह उदाहरण पहचान मैट्रिक्स है या नहीं।
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


डिफ़ॉल्ट (Prepend) क्रम में इस मैट्रिक्स को  matrix  द्वारा निर्दिष्ट मैट्रिक्स से गुणा करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | मैट्रिक्स। |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


इस मैट्रिक्स को  matrix  द्वारा निर्दिष्ट मैट्रिक्स से  matrixOrder  द्वारा निर्दिष्ट क्रम में गुणा करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | मैट्रिक्स। |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | क्रम। |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(XpsMatrix a, XpsMatrix b) {#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Equality(XpsMatrix a, XpsMatrix b)
```


ऑपरेटर == को लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | पहला मैट्रिक्स। |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | दूसरा मैट्रिक्स। |

**Returns:**
बूलियन - ऑपरेटर का परिणाम।
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


ऑपरेटर != को लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | पहला मैट्रिक्स। |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | दूसरा मैट्रिक्स। |

**Returns:**
बूलियन - ऑपरेटर का परिणाम।
### reset() {#reset--}
```
public void reset()
```


इस मैट्रिक्स को पहचान मैट्रिक्स में रीसेट करता है।

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


डिफ़ॉल्ट (Prepend) क्रम में इस मैट्रिक्स पर  angle  द्वारा घड़ी की दिशा में घुमाव लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| angle | float | कोण। |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


इस मैट्रिक्स पर  angle  द्वारा घड़ी की दिशा में घुमाव को  matrixOrder  द्वारा निर्दिष्ट क्रम में लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| angle | float | कोण। |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | क्रम। |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


डिफ़ॉल्ट (Prepend) क्रम में इस मैट्रिक्स पर  pivot  के चारों ओर  angle  द्वारा घड़ी की दिशा में घुमाव लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| angle | float | कोण। |
| पिवट | java.awt.geom.Point2D | पिवट बिंदु। |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


इस मैट्रिक्स पर  pivot  के चारों ओर  angle  द्वारा घड़ी की दिशा में घुमाव को  matrixOrder  द्वारा निर्दिष्ट क्रम में लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| angle | float | कोण। |
| पिवट | java.awt.geom.Point2D | पिवट बिंदु। |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | क्रम। |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


डिफ़ॉल्ट (Prepend) क्रम में इस मैट्रिक्स पर निर्दिष्ट स्केल वेक्टर (scaleX और scaleY) लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| scaleX | float | स्केल x। |
| scaleY | float | स्केल y। |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


इस मैट्रिक्स पर निर्दिष्ट स्केल वेक्टर (scaleX और scaleY) को  matrixOrder  द्वारा निर्दिष्ट क्रम में लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| scaleX | float | स्केल X। |
| scaleY | float | स्केल Y। |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | क्रम। |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


निर्दिष्ट स्क्यू ट्रांसफ़ॉर्मेशन को इस मैट्रिक्स पर लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| skewX | double | वक्रता x. |
| skewY | double | वक्रता y. |

### toString() {#toString--}
```
public String toString()
```


इस  XpsMatrix  उदाहरण का स्ट्रिंग प्रतिनिधित्व लौटाता है।

**Returns:**
java.lang.String - स्ट्रिंग प्रतिनिधित्व
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को एक निर्दिष्ट आयत पर लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D | आयत। |

**Returns:**
java.awt.geom.Rectangle2D - परिवर्तित आयत
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को एक निर्दिष्ट बिंदु पर लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बिंदु | java.awt.geom.Point2D | बिंदु. |

**Returns:**
java.awt.geom.Point2D - परिवर्तित बिंदु
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को एक निर्दिष्ट बिंदुओं की सरणी पर लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | बिंदु. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को बिंदुओं की सरणी के एक निर्दिष्ट भाग पर लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | बिंदु. |
| startIndex | int | प्रारंभ सूचकांक. |
| numberOfPoints | int | बिंदुओं की संख्या. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


निर्दिष्ट ट्रांसलेशन वेक्टर को इस मैट्रिक्स पर लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| offsetX | float | ऑफ़सेट X. |
| offsetY | float | ऑफ़सेट Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


निर्दिष्ट ट्रांसलेशन वेक्टर को इस मैट्रिक्स पर  matrixOrder  द्वारा निर्दिष्ट क्रम में लागू करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| offsetX | float | ऑफ़सेट X. |
| offsetY | float | ऑफ़सेट Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | क्रम। |

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

