---
title: "XpsImageBrush"
second_title: "Aspose.Page for Java API संदर्भ"
description: "ImageBrush प्रॉपर्टी तत्व सुविधाओं को सम्मिलित करने वाला वर्ग।"
type: docs
weight: 33
url: /hi/java/com.aspose.xps/xpsimagebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsImageBrush extends XpsTilingBrush
```

ImageBrush प्रॉपर्टी एलिमेंट फीचर्स को समाहित करने वाली क्लास। इस एलिमेंट का उपयोग एक छवि के साथ क्षेत्र को भरने के लिए किया जाता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [deepClone()](#deepClone--) | इस इमेज ब्रश को क्लोन करता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getImage()](#getImage--) | ब्रश के लिए उपयोग किए गए इमेज रिसोर्स को लौटाता है। |
| [getImageSource()](#getImageSource--) | एक इमेज रिसोर्स का URI लौटाता है। |
| [getOpacity()](#getOpacity--) | ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान लौटाता है। |
| [getTileMode()](#getTileMode--) | भरे हुए ज्यामिति में टाइलिंग कैसे की जाती है, यह निर्दिष्ट करने वाला मान लौटाता है। |
| [getTransform()](#getTransform--) | ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन को लौटाता है। |
| [getViewbox()](#getViewbox--) | ब्रश की स्रोत सामग्री का वह क्षेत्र लौटाता है जिसे व्यूपोर्ट पर मैप किया जाना है। |
| [getViewport()](#getViewport--) | पहले ब्रश टाइल की स्थिति और आयाम लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | ब्रश फ़िल की समान पारदर्शिता को परिभाषित करने वाला मान सेट करता है। |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | भरे हुए ज्यामिति में टाइलिंग कैसे की जाती है, यह निर्दिष्ट करने वाला मान सेट करता है। |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | ब्रश के निर्देशांक स्थान पर लागू मैट्रिक्स ट्रांसफ़ॉर्मेशन को सेट करता है। |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | ब्रश की स्रोत सामग्री का वह क्षेत्र सेट करता है जिसे व्यूपोर्ट पर मैप किया जाना है। |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | पहले ब्रश टाइल की स्थिति और आयाम सेट करता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsImageBrush deepClone()
```


इस इमेज ब्रश को क्लोन करता है।

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - Clone of this image brush.
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
### getImage() {#getImage--}
```
public XpsImage getImage()
```


ब्रश के लिए उपयोग किए गए इमेज रिसोर्स को लौटाता है।

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - Image resource used to for the brush.
### getImageSource() {#getImageSource--}
```
public String getImageSource()
```


एक इमेज रिसोर्स का URI लौटाता है।

**Returns:**
java.lang.String - एक इमेज रिसोर्स का URI।
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

