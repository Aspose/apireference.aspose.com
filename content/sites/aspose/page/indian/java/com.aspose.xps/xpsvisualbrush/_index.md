---
title: "XpsVisualBrush"
second_title: "Aspose.Page for Java API संदर्भ"
description: "VisualBrush प्रॉपर्टी एलिमेंट फीचर्स को संलग्न करने वाली क्लास।"
type: docs
weight: 54
url: /hi/java/com.aspose.xps/xpsvisualbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsVisualBrush extends XpsTilingBrush
```

VisualBrush प्रॉपर्टी तत्व की विशेषताओं को समाहित करने वाला वर्ग। यह तत्व एक चित्रण के साथ क्षेत्र को भरने के लिए उपयोग किया जाता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [deepClone()](#deepClone--) | इस विज़ुअल ब्रश की प्रतिलिपि बनाता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान लौटाता है। |
| [getTileMode()](#getTileMode--) | भरे हुए ज्यामिति में टाइलिंग कैसे की जाती है, यह निर्दिष्ट करने वाला मान लौटाता है। |
| [getTransform()](#getTransform--) | ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन को लौटाता है। |
| [getViewbox()](#getViewbox--) | ब्रश की स्रोत सामग्री का वह क्षेत्र लौटाता है जिसे व्यूपोर्ट पर मैप किया जाना है। |
| [getViewport()](#getViewport--) | पहले ब्रश टाइल की स्थिति और आयाम लौटाता है। |
| [getVisual()](#getVisual--) | ब्रश\u2019s स्रोत सामग्री को ड्रॉ करने के लिए उपयोग किए जाने वाले Path, Glyphs, या Canvas तत्व को लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान सेट करता है। |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | भरे हुए ज्यामिति में टाइलिंग कैसे की जाती है, यह निर्दिष्ट करने वाला मान सेट करता है। |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन को सेट करता है। |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | ब्रश की स्रोत सामग्री का वह क्षेत्र सेट करता है जिसे व्यूपोर्ट पर मैप किया जाना है। |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | पहले ब्रश टाइल की स्थिति और आयाम सेट करता है। |
| [setVisual(XpsContentElement visual)](#setVisual-com.aspose.xps.XpsContentElement-) | visual को visual brush के Visual तत्व के रूप में सेट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsVisualBrush deepClone()
```


इस विज़ुअल ब्रश की प्रतिलिपि बनाता है।

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - Clone of this visual brush.
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
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान लौटाता है।

**Returns:**
float - ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान।
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


भरे हुए ज्यामिति में टाइलिंग कैसे की जाती है, यह निर्दिष्ट करने वाला मान लौटाता है।

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन को लौटाता है। Transform प्रॉपर्टी को वर्तमान प्रभावी रेंडर ट्रांसफ़ॉर्म के साथ जोड़कर ब्रश के लिए स्थानीय प्रभावी रेंडर ट्रांसफ़ॉर्म प्राप्त किया जाता है। ब्रश के व्यूपोर्ट को स्थानीय प्रभावी रेंडर ट्रांसफ़ॉर्म का उपयोग करके ट्रांसफ़ॉर्म किया जाता है।

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


ब्रश की स्रोत सामग्री का वह क्षेत्र लौटाता है जिसे व्यूपोर्ट पर मैप किया जाना है।

**Returns:**
java.awt.geom.Rectangle2D - ब्रश की स्रोत सामग्री का वह क्षेत्र जिसे व्यूपोर्ट पर मैप किया जाना है।
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


पहले ब्रश टाइल की स्थिति और आयाम लौटाता है। बाद के टाइल्स इस टाइल के सापेक्ष स्थित होते हैं, जैसा कि टाइल मोड द्वारा निर्दिष्ट किया गया है।

**Returns:**
java.awt.geom.Rectangle2D - पहले ब्रश टाइल की स्थिति और आयाम।
### getVisual() {#getVisual--}
```
public XpsContentElement getVisual()
```


ब्रश\u2019s स्रोत सामग्री को ड्रॉ करने के लिए उपयोग किए जाने वाले Path, Glyphs, या Canvas तत्व को लौटाता है।

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - A Path, Glyphs, or Canvas element used to draw the brush\\u2019s source content.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान। |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


भरे हुए ज्यामिति में टाइलिंग कैसे की जाती है, यह निर्दिष्ट करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | भरे हुए ज्यामिति में टाइलिंग कैसे की जाती है, यह निर्दिष्ट करने वाला मान। |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन को सेट करता है। Transform प्रॉपर्टी को वर्तमान प्रभावी रेंडर ट्रांसफ़ॉर्म के साथ जोड़कर ब्रश के लिए स्थानीय प्रभावी रेंडर ट्रांसफ़ॉर्म प्राप्त किया जाता है। ब्रश के व्यूपोर्ट को स्थानीय प्रभावी रेंडर ट्रांसफ़ॉर्म का उपयोग करके ट्रांसफ़ॉर्म किया जाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन। |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


ब्रश की स्रोत सामग्री का वह क्षेत्र सेट करता है जिसे व्यूपोर्ट पर मैप किया जाना है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.awt.geom.Rectangle2D | ब्रश की स्रोत सामग्री का वह क्षेत्र जिसे व्यूपोर्ट पर मैप किया जाना है। |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


पहले ब्रश टाइल की स्थिति और आयाम सेट करता है। बाद के टाइल्स इस टाइल के सापेक्ष स्थित होते हैं, जैसा कि टाइल मोड द्वारा निर्दिष्ट किया गया है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.awt.geom.Rectangle2D | पहले ब्रश टाइल की स्थिति और आयाम। |

### setVisual(XpsContentElement visual) {#setVisual-com.aspose.xps.XpsContentElement-}
```
public void setVisual(XpsContentElement visual)
```


visual को visual brush के Visual तत्व के रूप में सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| visual | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | तत्व। |

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

