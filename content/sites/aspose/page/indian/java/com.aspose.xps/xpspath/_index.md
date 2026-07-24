---
title: "XpsPath"
second_title: "Aspose.Page for Java API संदर्भ"
description: "पाथ एलिमेंट फीचर्स को संलग्न करने वाली क्लास।"
type: docs
weight: 40
url: /hi/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Path तत्व की विशेषताओं को समाहित करने वाला वर्ग। यह तत्व स्थिर पृष्ठ में वेक्टर ग्राफ़िक्स और छवियों को जोड़ने का एकमात्र साधन है। यह एक पृष्ठ पर रेंडर किए जाने वाले एकल वेक्टर ग्राफ़िक को परिभाषित करता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [deepClone()](#deepClone--) | इस पथ की प्रतिलिपि बनाता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | इंडेक्स i द्वारा तत्व के बच्चों तक पहुँच प्रदान करता है। |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री लौटाता है। |
| [getData()](#getData--) | पथ की ज्यामिति लौटाता है। |
| [getFill()](#getFill--) | पथ की Data प्रॉपर्टी द्वारा निर्दिष्ट ज्यामिति को रंगने के लिए उपयोग किए जाने वाले ब्रश को लौटाता है। |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | हाइपरलिंक लक्ष्य वस्तु लौटाता है। |
| [getOpacity()](#getOpacity--) | तत्व की समान पारदर्शिता को परिभाषित करने वाला मान लौटाता है। |
| [getOpacityMask()](#getOpacityMask--) | तत्व पर Opacity गुण की तरह ही लागू होने वाला अल्फा मानों का मास्क निर्दिष्ट करने वाला ब्रश लौटाता है, लेकिन तत्व के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा मानों की अनुमति देता है। |
| [getRenderTransform()](#getRenderTransform--) | तत्व और उसके सभी बाल तत्वों (यदि कोई हों) के सभी गुणों के लिए नया निर्देशांक फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स लौटाता है। |
| [getStroke()](#getStroke--) | स्ट्रोक को ड्रॉ करने के लिए उपयोग किए जाने वाले ब्रश को लौटाता है। |
| [getStrokeDashArray()](#getStrokeDashArray--) | आउटलाइन स्ट्रोक के डैश और गैप की लंबाई निर्दिष्ट करने वाले एरे को लौटाता है। |
| [getStrokeDashCap()](#getStrokeDashCap--) | प्रत्येक डैश के अंत कैसे खींचे जाते हैं, यह निर्दिष्ट करने वाला मान लौटाता है। |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | डैश एरे पैटर्न को दोहराने के लिए प्रारंभ बिंदु लौटाता है। |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | स्ट्रोक में अंतिम डैश के अंत के आकार को परिभाषित करने वाला मान लौटाता है। |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान लौटाता है। |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | अधिकतम मिटर लंबाई और स्ट्रोक मोटाई के आधे के बीच अनुपात लौटाता है। |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान लौटाता है। |
| [getStrokeThickness()](#getStrokeThickness--) | स्ट्रोक की मोटाई लौटाता है, प्रभावी निर्देशांक स्थान की इकाइयों में (पथ के रेंडर ट्रांसफ़ॉर्म को शामिल करता है)। |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable इंटरफ़ेस का कार्यान्वयन। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री सेट करता है। |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | पथ की ज्यामिति सेट करता है। |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | पथ की Data प्रॉपर्टी द्वारा निर्दिष्ट ज्यामिति को रंगने के लिए उपयोग किए जाने वाले ब्रश को सेट करता है। |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | हाइपरलिंक लक्ष्य ऑब्जेक्ट सेट करता है। |
| [setOpacity(float value)](#setOpacity-float-) | तत्व की समान पारदर्शिता को परिभाषित करने वाला मान सेट करता है। |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | ब्रश को सेट करता है जो अल्फा मानों का मास्क निर्दिष्ट करता है, जिसे तत्व पर Opacity एट्रिब्यूट की तरह लागू किया जाता है, लेकिन तत्व के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा मानों की अनुमति देता है। |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | तत्व के सभी एट्रिब्यूट्स और सभी चाइल्ड एलिमेंट्स (यदि कोई हों) के लिए नया कोऑर्डिनेट फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स सेट करता है। |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | स्ट्रोक को ड्रॉ करने के लिए उपयोग किए जाने वाले ब्रश को सेट करता है। |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | आउटलाइन स्ट्रोक के डैश और गैप की लंबाई निर्दिष्ट करने वाले एरे को सेट करता है। |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | प्रत्येक डैश के अंत कैसे खींचे जाते हैं, यह निर्दिष्ट करने वाला मान सेट करता है। |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | डैश एरे पैटर्न को दोहराने के लिए प्रारंभ बिंदु सेट करता है। |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | स्ट्रोक में अंतिम डैश के अंत के आकार को परिभाषित करने वाला मान सेट करता है। |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान सेट करता है। |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | अधिकतम मिटर लंबाई और स्ट्रोक मोटाई के आधे के बीच अनुपात सेट करता है। |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान सेट करता है। |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | स्ट्रोक की मोटाई सेट करता है, प्रभावी निर्देशांक स्थान की इकाइयों में (पथ के रेंडर ट्रांसफ़ॉर्म को शामिल करता है)। |
| [size()](#size--) | चाइल्ड एलिमेंट्स की संख्या लौटाता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


इस पथ की प्रतिलिपि बनाता है।

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री लौटाता है।

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


पथ की ज्यामिति लौटाता है।

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


पथ की Data प्रॉपर्टी द्वारा निर्दिष्ट ज्यामिति को रंगने के लिए उपयोग किए जाने वाले ब्रश को लौटाता है।

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


हाइपरलिंक लक्ष्य वस्तु लौटाता है।

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


तत्व की समान पारदर्शिता को परिभाषित करने वाला मान लौटाता है।

**Returns:**
float - तत्व की समान पारदर्शिता को परिभाषित करने वाला मान।
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


तत्व पर Opacity गुण की तरह ही लागू होने वाला अल्फा मानों का मास्क निर्दिष्ट करने वाला ब्रश लौटाता है, लेकिन तत्व के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा मानों की अनुमति देता है।

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


तत्व और उसके सभी बाल तत्वों (यदि कोई हों) के सभी गुणों के लिए नया निर्देशांक फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स लौटाता है।

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


स्ट्रोक को ड्रॉ करने के लिए उपयोग किए जाने वाले ब्रश को लौटाता है।

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


आउटलाइन स्ट्रोक के डैश और गैप की लंबाई निर्दिष्ट करने वाले एरे को लौटाता है।

**Returns:**
float[] - आउटलाइन स्ट्रोक के डैश और गैप की लंबाई निर्दिष्ट करने वाला एरे।
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


प्रत्येक डैश के अंत कैसे खींचे जाते हैं, यह निर्दिष्ट करने वाला मान लौटाता है।

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


डैश एरे पैटर्न को दोहराने के लिए प्रारंभ बिंदु लौटाता है। यदि यह मान छोड़ा जाता है, तो डैश एरे स्ट्रोक की मूल बिंदु के साथ संरेखित हो जाता है।

**Returns:**
float - डैश एरे पैटर्न को दोहराने के लिए प्रारंभ बिंदु।
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


स्ट्रोक में अंतिम डैश के अंत के आकार को परिभाषित करने वाला मान लौटाता है।

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान लौटाता है।

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


अधिकतम मिटर लंबाई और स्ट्रोक मोटाई के आधे हिस्से के बीच अनुपात लौटाता है। यह मान केवल तब महत्वपूर्ण होता है जब StrokeLineJoin विशेषता Miter निर्दिष्ट करती है।

**Returns:**
float - अधिकतम मिटर लंबाई और स्ट्रोक मोटाई के आधे हिस्से के बीच अनुपात।
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान लौटाता है।

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


स्ट्रोक की मोटाई लौटाता है, प्रभावी निर्देशांक स्थान की इकाइयों में (पाथ के रेंडर ट्रांसफ़ॉर्म को शामिल करता है)। स्ट्रोक को Path तत्व की Data प्रॉपर्टी द्वारा निर्दिष्ट ज्योमेट्री की सीमा के ऊपर खींचा जाता है। StrokeThickness का आधा भाग Data प्रॉपर्टी द्वारा निर्दिष्ट ज्योमेट्री के बाहर विस्तारित होता है और दूसरा आधा भाग ज्योमेट्री के अंदर विस्तारित होता है।

**Returns:**
float - स्ट्रोक की मोटाई।
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




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री। |

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


पथ की ज्यामिति सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | पथ की ज्यामिति। |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


पथ की Data प्रॉपर्टी द्वारा निर्दिष्ट ज्यामिति को रंगने के लिए उपयोग किए जाने वाले ब्रश को सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | निर्दिष्ट ज्योमेट्री को पेंट करने के लिए उपयोग किया गया ब्रश |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


हाइपरलिंक लक्ष्य ऑब्जेक्ट सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | हाइपरलिंक लक्ष्य ऑब्जेक्ट। |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


तत्व की समान पारदर्शिता को परिभाषित करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | तत्व की समान पारदर्शिता को परिभाषित करने वाला मान। |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


ब्रश को सेट करता है जो अल्फा मानों का मास्क निर्दिष्ट करता है, जिसे तत्व पर Opacity एट्रिब्यूट की तरह लागू किया जाता है, लेकिन तत्व के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा मानों की अनुमति देता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | मास्क निर्दिष्ट करने वाला ब्रश। |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


तत्व के सभी एट्रिब्यूट्स और सभी चाइल्ड एलिमेंट्स (यदि कोई हों) के लिए नया कोऑर्डिनेट फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | अफ़ाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स। |

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


स्ट्रोक को ड्रॉ करने के लिए उपयोग किए जाने वाले ब्रश को सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | स्ट्रोक को ड्रॉ करने के लिए उपयोग किया गया ब्रश। |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


आउटलाइन स्ट्रोक के डैश और गैप की लंबाई निर्दिष्ट करने वाले एरे को सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float[] | आउटलाइन स्ट्रोक के डैश और गैप की लंबाई निर्दिष्ट करने वाला एरे। |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


प्रत्येक डैश के अंत कैसे खींचे जाते हैं, यह निर्दिष्ट करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | प्रत्येक डैश के अंत कैसे खींचे जाते हैं, यह निर्दिष्ट करने वाला मान। |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


डैश एरे पैटर्न को दोहराने के लिए प्रारंभ बिंदु सेट करता है। यदि यह मान छोड़ा जाता है, तो डैश एरे स्ट्रोक के मूल बिंदु के साथ संरेखित हो जाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | डैश एरे पैटर्न को दोहराने के लिए प्रारंभ बिंदु। |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


स्ट्रोक में अंतिम डैश के अंत के आकार को परिभाषित करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | स्ट्रोक में अंतिम डैश के अंत के आकार को परिभाषित करने वाला मान। |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान। |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


अधिकतम मिटर लंबाई और स्ट्रोक मोटाई के आधे हिस्से के बीच अनुपात सेट करता है। यह मान केवल तब महत्वपूर्ण होता है जब StrokeLineJoin विशेषता Miter निर्दिष्ट करती है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | अधिकतम मिटर लंबाई और स्ट्रोक मोटाई के आधे हिस्से के बीच अनुपात। |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान। |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


स्ट्रोक की मोटाई सेट करता है, प्रभावी निर्देशांक स्थान की इकाइयों में (पाथ के रेंडर ट्रांसफ़ॉर्म को शामिल करता है)। स्ट्रोक को Path तत्व की Data प्रॉपर्टी द्वारा निर्दिष्ट ज्योमेट्री की सीमा के ऊपर खींचा जाता है। StrokeThickness का आधा भाग Data प्रॉपर्टी द्वारा निर्दिष्ट ज्योमेट्री के बाहर विस्तारित होता है और दूसरा आधा भाग ज्योमेट्री के अंदर विस्तारित होता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | स्ट्रोक की मोटाई। |

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

