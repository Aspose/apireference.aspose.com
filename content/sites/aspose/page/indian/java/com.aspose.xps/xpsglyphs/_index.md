---
title: "XpsGlyphs"
second_title: "Aspose.Page for Java API संदर्भ"
description: "Glyphs तत्व सुविधाओं को सम्मिलित करने वाला वर्ग।"
type: docs
weight: 25
url: /hi/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

क्लास जो Glyphs तत्व की विशेषताओं को समाहित करती है। यह तत्व एक ही फ़ॉन्ट से समान रूप से स्वरूपित पाठ की श्रृंखला का प्रतिनिधित्व करता है। यह सटीक रेंडरिंग के लिए आवश्यक जानकारी प्रदान करता है और दृश्य उपभोक्ताओं में खोज और चयन सुविधाओं का समर्थन करता है।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [deepClone()](#deepClone--) | इस glyphs को क्लोन करें। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | इंडेक्स i द्वारा तत्व के बच्चों तक पहुँच प्रदान करता है। |
| [getBidiLevel()](#getBidiLevel--) | Unicode एल्गोरिदम द्विदिश नेस्टिंग स्तर को निर्दिष्ट करने वाला मान लौटाता है। |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री लौटाता है। |
| [getFill()](#getFill--) | रेंडर किए गए glyphs के आकार को भरने के लिए उपयोग किए गए ब्रश को लौटाता है। |
| [getFont()](#getFont--) | टाइपसेट किए गए तत्वों के पाठ के लिए उपयोग किए गए TrueType फ़ॉन्ट का फ़ॉन्ट रिसोर्स लौटाता है। |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | ड्राइंग सतह इकाइयों में फ़ॉन्ट आकार लौटाता है, जिसे प्रभावी निर्देशांक स्थान की इकाइयों में फ़्लोट के रूप में व्यक्त किया गया है। |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | हाइपरलिंक लक्ष्य वस्तु लौटाता है। |
| [getOpacity()](#getOpacity--) | तत्व की समान पारदर्शिता को परिभाषित करने वाला मान लौटाता है। |
| [getOpacityMask()](#getOpacityMask--) | तत्व पर Opacity गुण की तरह ही लागू होने वाला अल्फा मानों का मास्क निर्दिष्ट करने वाला ब्रश लौटाता है, लेकिन तत्व के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा मानों की अनुमति देता है। |
| [getOriginX()](#getOriginX--) | रन में पहले glyph का x निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में लौटाता है। |
| [getOriginY()](#getOriginY--) | रन में पहले glyph का y निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में लौटाता है। |
| [getRenderTransform()](#getRenderTransform--) | तत्व और उसके सभी बाल तत्वों (यदि कोई हों) के सभी गुणों के लिए नया निर्देशांक फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स लौटाता है। |
| [getStyleSimulations()](#getStyleSimulations--) | स्टाइल सिमुलेशन को निर्दिष्ट करने वाला मान लौटाता है। |
| [getUnicodeString()](#getUnicodeString--) | Glyphs तत्व द्वारा रेंडर किए गए पाठ की स्ट्रिंग लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | एक glyph को उसके पक्ष पर घुमाए जाने को दर्शाने वाला मान लौटाता है, जहाँ मूल बिंदु को अनघुमाए गए glyph के शीर्ष केंद्र के रूप में परिभाषित किया गया है। |
| [iterator()](#iterator--) | Iterable इंटरफ़ेस का कार्यान्वयन। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Unicode एल्गोरिदम द्विदिश नेस्टिंग स्तर को निर्दिष्ट करने वाला मान सेट करता है। |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री सेट करता है। |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | रेंडर किए गए glyphs के आकार को भरने के लिए उपयोग किए जाने वाले ब्रश को सेट करता है। |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | ड्राइंग सतह इकाइयों में फ़ॉन्ट आकार सेट करता है, जिसे प्रभावी निर्देशांक स्थान की इकाइयों में फ़्लोट के रूप में व्यक्त किया गया है। |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | हाइपरलिंक लक्ष्य ऑब्जेक्ट सेट करता है। |
| [setOpacity(float value)](#setOpacity-float-) | तत्व की समान पारदर्शिता को परिभाषित करने वाला मान सेट करता है। |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | ब्रश को सेट करता है जो अल्फा मानों का मास्क निर्दिष्ट करता है, जिसे तत्व पर Opacity एट्रिब्यूट की तरह लागू किया जाता है, लेकिन तत्व के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा मानों की अनुमति देता है। |
| [setOriginX(float value)](#setOriginX-float-) | रन में पहले glyph का x निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में सेट करता है। |
| [setOriginY(float value)](#setOriginY-float-) | रन में पहले glyph का y निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में सेट करता है। |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | तत्व के सभी एट्रिब्यूट्स और सभी चाइल्ड एलिमेंट्स (यदि कोई हों) के लिए नया कोऑर्डिनेट फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स सेट करता है। |
| [setSideways(boolean value)](#setSideways-boolean-) | एक glyph को उसके पक्ष पर घुमाए जाने को दर्शाने वाला मान सेट करता है, जहाँ मूल बिंदु को अनघुमाए गए glyph के शीर्ष केंद्र के रूप में परिभाषित किया गया है। |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | स्टाइल सिमुलेशन को निर्दिष्ट करने वाला मान सेट करता है। |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Glyphs तत्व द्वारा रेंडर किए गए पाठ की स्ट्रिंग सेट करता है। |
| [size()](#size--) | चाइल्ड एलिमेंट्स की संख्या लौटाता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


इस glyphs को क्लोन करें।

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Unicode एल्गोरिदम द्विदिश नेस्टिंग स्तर को निर्दिष्ट करने वाला मान लौटाता है। सम मान बाएँ-से-दाएँ लेआउट को दर्शाते हैं, विषम मान दाएँ-से-बाएँ लेआउट को दर्शाते हैं। दाएँ-से-बाएँ लेआउट रन मूल बिंदु को पहले glyph के दाएँ पक्ष पर रखता है, जहाँ सकारात्मक एडवांस चौड़ाइयाँ (बाएँ की ओर अग्रसर) अगले glyph को पिछले glyph के बाएँ स्थित करती हैं।

**Returns:**
int - Unicode एल्गोरिदम द्विदिश नेस्टिंग स्तर को निर्दिष्ट करने वाला मान।
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


रेंडर किए गए glyphs के आकार को भरने के लिए उपयोग किए गए ब्रश को लौटाता है।

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


टाइपसेट किए गए तत्वों के पाठ के लिए उपयोग किए गए TrueType फ़ॉन्ट का फ़ॉन्ट रिसोर्स लौटाता है।

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


ड्राइंग सतह इकाइयों में फ़ॉन्ट आकार लौटाता है, जिसे प्रभावी निर्देशांक स्थान की इकाइयों में फ़्लोट के रूप में व्यक्त किया गया है।

**Returns:**
float - फ़ॉन्ट आकार।
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


रन में पहले glyph का x निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में लौटाता है।

**Returns:**
float - रन में पहले ग्लिफ़ का x निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में।
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


रन में पहले glyph का y निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में लौटाता है।

**Returns:**
float - रन में पहले ग्लिफ़ का y निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में।
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


तत्व और उसके सभी बाल तत्वों (यदि कोई हों) के सभी गुणों के लिए नया निर्देशांक फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स लौटाता है।

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


स्टाइल सिमुलेशन को निर्दिष्ट करने वाला मान लौटाता है।

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Glyphs तत्व द्वारा रेंडर किए गए पाठ की स्ट्रिंग लौटाता है। पाठ को यूनिकोड कोड पॉइंट्स के रूप में निर्दिष्ट किया गया है।

**Returns:**
java.lang.String - Glyphs तत्व द्वारा रेंडर किए गए पाठ की स्ट्रिंग।
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


एक glyph को उसके पक्ष पर घुमाए जाने को दर्शाने वाला मान लौटाता है, जहाँ मूल बिंदु को अनघुमाए गए glyph के शीर्ष केंद्र के रूप में परिभाषित किया गया है।

**Returns:**
boolean - वह मान जो दर्शाता है कि एक ग्लिफ़ अपनी साइड पर घुमाया गया है।
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Unicode एल्गोरिदम द्विदिश नेस्टिंग स्तर को निर्दिष्ट करने वाला मान सेट करता है। सम मान बाएँ‑से‑दाएँ लेआउट को दर्शाते हैं, विषम मान दाएँ‑से‑बाएँ लेआउट को दर्शाते हैं। दाएँ‑से‑बाएँ लेआउट रन की उत्पत्ति को पहले ग्लिफ़ के दाएँ पक्ष पर रखता है, जहाँ सकारात्मक एडवांस चौड़ाइयाँ (बाएँ की ओर बढ़ते हुए) अगले ग्लिफ़ को पिछले ग्लिफ़ के बाएँ रखती हैं।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int | Unicode एल्गोरिदम द्विदिश नेस्टिंग स्तर को निर्दिष्ट करने वाला मान। |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री। |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


रेंडर किए गए glyphs के आकार को भरने के लिए उपयोग किए जाने वाले ब्रश को सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | रेंडर किए गए ग्लिफ़ के आकार को भरने के लिए उपयोग किया जाने वाला ब्रश। |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


ड्राइंग सतह इकाइयों में फ़ॉन्ट आकार सेट करता है, जिसे प्रभावी निर्देशांक स्थान की इकाइयों में फ़्लोट के रूप में व्यक्त किया गया है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | फ़ॉन्ट आकार। |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


रन में पहले glyph का x निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | रन में पहले ग्लिफ़ का x निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में। |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


रन में पहले glyph का y निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | रन में पहले ग्लिफ़ का y निर्देशांक, प्रभावी निर्देशांक स्थान की इकाइयों में। |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


तत्व के सभी एट्रिब्यूट्स और सभी चाइल्ड एलिमेंट्स (यदि कोई हों) के लिए नया कोऑर्डिनेट फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | अफ़ाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स। |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


एक glyph को उसके पक्ष पर घुमाए जाने को दर्शाने वाला मान सेट करता है, जहाँ मूल बिंदु को अनघुमाए गए glyph के शीर्ष केंद्र के रूप में परिभाषित किया गया है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | boolean | एक ग्लिफ़ की अपनी साइड पर घुमाए जाने को दर्शाने वाला मान। |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


स्टाइल सिमुलेशन को निर्दिष्ट करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | एक शैली सिमुलेशन को निर्दिष्ट करने वाला मान। |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Glyphs तत्व द्वारा रेंडर किए गए पाठ की स्ट्रिंग सेट करता है। पाठ को यूनिकोड कोड पॉइंट्स के रूप में निर्दिष्ट किया गया है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | java.lang.String | Glyphs तत्व द्वारा रेंडर किए गए पाठ की स्ट्रिंग। |

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

