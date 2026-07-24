---
title: "XpsContentElement"
second_title: "Aspose.Page for Java API संदर्भ"
description: "XPS सामग्री तत्वों Canvas Path और Glyphs की विशेषताओं को समाहित करता है।"
type: docs
weight: 18
url: /hi/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

XPS सामग्री तत्वों: Canvas, Path और Glyphs की सुविधाओं को सम्मिलित करता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | इंडेक्स i द्वारा तत्व के बच्चों तक पहुँच प्रदान करता है। |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री लौटाता है। |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | हाइपरलिंक लक्ष्य वस्तु लौटाता है। |
| [getOpacity()](#getOpacity--) | तत्व की समान पारदर्शिता को परिभाषित करने वाला मान लौटाता है। |
| [getOpacityMask()](#getOpacityMask--) | तत्व पर Opacity गुण की तरह ही लागू होने वाला अल्फा मानों का मास्क निर्दिष्ट करने वाला ब्रश लौटाता है, लेकिन तत्व के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा मानों की अनुमति देता है। |
| [getRenderTransform()](#getRenderTransform--) | तत्व और उसके सभी बाल तत्वों (यदि कोई हों) के सभी गुणों के लिए नया निर्देशांक फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable इंटरफ़ेस का कार्यान्वयन। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री सेट करता है। |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | हाइपरलिंक लक्ष्य ऑब्जेक्ट सेट करता है। |
| [setOpacity(float value)](#setOpacity-float-) | तत्व की समान पारदर्शिता को परिभाषित करने वाला मान सेट करता है। |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | ब्रश को सेट करता है जो अल्फा मानों का मास्क निर्दिष्ट करता है, जिसे तत्व पर Opacity एट्रिब्यूट की तरह लागू किया जाता है, लेकिन तत्व के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा मानों की अनुमति देता है। |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | तत्व के सभी एट्रिब्यूट्स और सभी चाइल्ड एलिमेंट्स (यदि कोई हों) के लिए नया कोऑर्डिनेट फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स सेट करता है। |
| [size()](#size--) | चाइल्ड एलिमेंट्स की संख्या लौटाता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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

