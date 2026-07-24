---
title: "XpsRadialGradientBrush"
second_title: "Aspose.Page for Java API संदर्भ"
description: "RadialGradientBrush प्रॉपर्टी एलिमेंट फीचर्स को संलग्न करने वाली क्लास।"
type: docs
weight: 48
url: /hi/java/com.aspose.xps/xpsradialgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsRadialGradientBrush extends XpsGradientBrush
```

RadialGradientBrush प्रॉपर्टी एलिमेंट फीचर्स को समाहित करने वाली क्लास। यह एलिमेंट रेडियल ग्रेडिएंट ब्रश को निर्दिष्ट करने के लिए उपयोग किया जाता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [deepClone()](#deepClone--) | इस रेडियल ग्रेडिएंट ब्रश की क्लोन बनाता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCenter()](#getCenter--) | रेडियल ग्रेडिएंट का केंद्र बिंदु लौटाता है (अर्थात, एलिप्स का केंद्र)। |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | रंग इंटरपोलेशन के लिए गामा फ़ंक्शन निर्दिष्ट करने वाला मान लौटाता है। |
| [getGradientOrigin()](#getGradientOrigin--) | रेडियल ग्रेडिएंट का मूल बिंदु लौटाता है। |
| [getGradientStops()](#getGradientStops--) | ग्रेडिएंट बनाते हुए ग्रेडिएंट स्टॉप्स की सूची लौटाता है। |
| [getOpacity()](#getOpacity--) | ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान लौटाता है। |
| [getRadiusX()](#getRadiusX--) | रेडियल ग्रेडिएंट को परिभाषित करने वाले एलिप्स की x दिशा में त्रिज्या लौटाता है। |
| [getRadiusY()](#getRadiusY--) | रेडियल ग्रेडिएंट को परिभाषित करने वाले एलिप्स की y दिशा में त्रिज्या लौटाता है। |
| [getSpreadMethod()](#getSpreadMethod--) | ब्रश को प्राथमिक, प्रारंभिक ग्रेडिएंट क्षेत्र के बाहर कंटेंट एरिया को कैसे भरना चाहिए, यह वर्णन करने वाला मान लौटाता है। |
| [getTransform()](#getTransform--) | ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन को लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCenter(Point2D value)](#setCenter-java.awt.geom.Point2D-) | रेडियल ग्रेडिएंट का केंद्र बिंदु सेट करता है (अर्थात, एलिप्स का केंद्र)। |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | रंग इंटरपोलेशन के लिए गामा फ़ंक्शन निर्दिष्ट करने वाला मान सेट करता है। |
| [setGradientOrigin(Point2D value)](#setGradientOrigin-java.awt.geom.Point2D-) | रेडियल ग्रेडिएंट का मूल बिंदु सेट करता है। |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | ग्रेडिएंट बनाते हुए ग्रेडिएंट स्टॉप्स की सूची सेट करता है। |
| [setOpacity(float value)](#setOpacity-float-) | ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान सेट करता है। |
| [setRadiusX(float value)](#setRadiusX-float-) | रेडियल ग्रेडिएंट को परिभाषित करने वाले एलिप्स की x दिशा में त्रिज्या सेट करता है। |
| [setRadiusY(float value)](#setRadiusY-float-) | रेडियल ग्रेडिएंट को परिभाषित करने वाले एलिप्स की y दिशा में त्रिज्या सेट करता है। |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | ब्रश को प्राथमिक, प्रारंभिक ग्रेडिएंट क्षेत्र के बाहर कंटेंट एरिया को कैसे भरना चाहिए, यह वर्णन करने वाला मान सेट करता है। |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन को सेट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsRadialGradientBrush deepClone()
```


इस रेडियल ग्रेडिएंट ब्रश की क्लोन बनाता है।

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - Clone of this radial gradient brush.
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
### getCenter() {#getCenter--}
```
public Point2D getCenter()
```


रेडियल ग्रेडिएंट का केंद्र बिंदु लौटाता है (अर्थात, एलिप्स का केंद्र)।

**Returns:**
java.awt.geom.Point2D - रेडियल ग्रेडिएंट का केंद्र बिंदु।
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


रंग इंटरपोलेशन के लिए गामा फ़ंक्शन निर्दिष्ट करने वाला मान लौटाता है। यदि निर्दिष्ट किया गया हो तो गामा समायोजन अल्फा घटक पर लागू नहीं होना चाहिए।

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getGradientOrigin() {#getGradientOrigin--}
```
public Point2D getGradientOrigin()
```


रेडियल ग्रेडिएंट का मूल बिंदु लौटाता है।

**Returns:**
java.awt.geom.Point2D - रेडियल ग्रेडिएंट का मूल बिंदु।
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


ग्रेडिएंट बनाते हुए ग्रेडिएंट स्टॉप्स की सूची लौटाता है।

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - ग्रेडिएंट बनाते हुए ग्रेडिएंट स्टॉप्स की सूची।
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान लौटाता है।

**Returns:**
float - ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान।
### getRadiusX() {#getRadiusX--}
```
public float getRadiusX()
```


रेडियल ग्रेडिएंट को परिभाषित करने वाले एलिप्स की x दिशा में त्रिज्या लौटाता है।

**Returns:**
float - रेडियल ग्रेडिएंट को परिभाषित करने वाले एलिप्स की x दिशा में त्रिज्या।
### getRadiusY() {#getRadiusY--}
```
public float getRadiusY()
```


रेडियल ग्रेडिएंट को परिभाषित करने वाले एलिप्स की y दिशा में त्रिज्या लौटाता है।

**Returns:**
float - रेडियल ग्रेडिएंट को परिभाषित करने वाले एलिप्स की y दिशा में त्रिज्या।
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


ब्रश को प्राथमिक, प्रारंभिक ग्रेडिएंट क्षेत्र के बाहर कंटेंट एरिया को कैसे भरना चाहिए, यह वर्णन करने वाला मान लौटाता है।

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन को लौटाता है। Transform प्रॉपर्टी को वर्तमान प्रभावी रेंडर ट्रांसफ़ॉर्म के साथ जोड़कर ब्रश के लिए स्थानीय प्रभावी रेंडर ट्रांसफ़ॉर्म प्राप्त किया जाता है। ब्रश के व्यूपोर्ट को स्थानीय प्रभावी रेंडर ट्रांसफ़ॉर्म का उपयोग करके ट्रांसफ़ॉर्म किया जाता है।

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setCenter(Point2D value) {#setCenter-java.awt.geom.Point2D-}
```
public void setCenter(Point2D value)
```


रेडियल ग्रेडिएंट का केंद्र बिंदु सेट करता है (अर्थात, एलिप्स का केंद्र)।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.awt.geom.Point2D | रेडियल ग्रेडिएंट का केंद्र बिंदु। |

### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


रंग इंटरपोलेशन के लिए गामा फ़ंक्शन निर्दिष्ट करने वाला मान सेट करता है। यदि निर्दिष्ट किया गया हो तो गामा समायोजन अल्फा घटक पर लागू नहीं होना चाहिए।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | रंग इंटरपोलेशन के लिए गामा फ़ंक्शन निर्दिष्ट करने वाला मान। |

### setGradientOrigin(Point2D value) {#setGradientOrigin-java.awt.geom.Point2D-}
```
public void setGradientOrigin(Point2D value)
```


रेडियल ग्रेडिएंट का मूल बिंदु सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.awt.geom.Point2D | रेडियल ग्रेडिएंट का मूल बिंदु। |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


ग्रेडिएंट बनाते हुए ग्रेडिएंट स्टॉप्स की सूची सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.util.List<com.aspose.xps.XpsGradientStop> | ग्रेडिएंट बनाते हुए ग्रेडिएंट स्टॉप्स की सूची। |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान। |

### setRadiusX(float value) {#setRadiusX-float-}
```
public void setRadiusX(float value)
```


रेडियल ग्रेडिएंट को परिभाषित करने वाले एलिप्स की x दिशा में त्रिज्या सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | एलिप्स के x आयाम में त्रिज्या जो रेडियल ग्रेडिएंट को परिभाषित करती है। |

### setRadiusY(float value) {#setRadiusY-float-}
```
public void setRadiusY(float value)
```


रेडियल ग्रेडिएंट को परिभाषित करने वाले एलिप्स की y दिशा में त्रिज्या सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | एलिप्स के y आयाम में त्रिज्या जो रेडियल ग्रेडिएंट को परिभाषित करती है। |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


ब्रश को प्राथमिक, प्रारंभिक ग्रेडिएंट क्षेत्र के बाहर कंटेंट एरिया को कैसे भरना चाहिए, यह वर्णन करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | ब्रश को प्राथमिक, प्रारंभिक ग्रेडिएंट क्षेत्र के बाहर सामग्री क्षेत्र को कैसे भरना चाहिए, इसका वर्णन करने वाला मान। |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन को सेट करता है। Transform प्रॉपर्टी को वर्तमान प्रभावी रेंडर ट्रांसफ़ॉर्म के साथ जोड़कर ब्रश के लिए स्थानीय प्रभावी रेंडर ट्रांसफ़ॉर्म प्राप्त किया जाता है। ब्रश के व्यूपोर्ट को स्थानीय प्रभावी रेंडर ट्रांसफ़ॉर्म का उपयोग करके ट्रांसफ़ॉर्म किया जाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन। |

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

