---
title: "XpsCanvas"
second_title: "Aspose.Page for Java API संदर्भ"
description: "Canvas तत्व सुविधाओं को सम्मिलित करने वाला वर्ग।"
type: docs
weight: 16
url: /hi/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Canvas तत्व की विशेषताओं को समाहित करने वाला वर्ग। यह तत्व तत्वों को एक साथ समूहित करता है। उदाहरण के लिए, Glyphs और Path तत्वों को एक कैनवास में समूहित किया जा सकता है ताकि उन्हें एक इकाई (हाइपरलिंक गंतव्य) के रूप में पहचाना जा सके या प्रत्येक चाइल्ड और पूर्वज तत्व पर संयुक्त प्रॉपर्टी मान लागू किया जा सके।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | इस कैनवास की चाइल्ड सूची में एक तत्व जोड़ता है। |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | इस कैनवास की चाइल्ड सूची में निर्दिष्ट इंडेक्स स्थिति पर एक तत्व सम्मिलित करता है। |
| [addCanvas()](#addCanvas--) | इस कैनवास की चाइल्ड सूची में एक नया कैनवास जोड़ता है। |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | इस कैनवास की चाइल्ड सूची में नए glyphs जोड़ता है। |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | इस कैनवास की चाइल्ड सूची में एक नया पाथ जोड़ता है। |
| [deepClone()](#deepClone--) | इस कैनवास की प्रतिलिपि बनाता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | इंडेक्स i द्वारा तत्व के बच्चों तक पहुँच प्रदान करता है। |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री लौटाता है। |
| [getEdgeMode()](#getEdgeMode--) | कैनवास के भीतर पाथ के किनारों के रेंडरिंग को नियंत्रित करने वाला मान लौटाता है। |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | हाइपरलिंक लक्ष्य वस्तु लौटाता है। |
| [getOpacity()](#getOpacity--) | तत्व की समान पारदर्शिता को परिभाषित करने वाला मान लौटाता है। |
| [getOpacityMask()](#getOpacityMask--) | तत्व पर Opacity गुण की तरह ही लागू होने वाला अल्फा मानों का मास्क निर्दिष्ट करने वाला ब्रश लौटाता है, लेकिन तत्व के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा मानों की अनुमति देता है। |
| [getRenderTransform()](#getRenderTransform--) | तत्व और उसके सभी बाल तत्वों (यदि कोई हों) के सभी गुणों के लिए नया निर्देशांक फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स लौटाता है। |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | इस कैनवास की चाइल्ड सूची में निर्दिष्ट इंडेक्स स्थिति पर एक नया कैनवास सम्मिलित करता है। |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | इस कैनवास की चाइल्ड सूची में निर्दिष्ट इंडेक्स स्थिति पर नए glyphs सम्मिलित करता है। |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | इस कैनवास की चाइल्ड सूची में निर्दिष्ट इंडेक्स स्थिति पर एक नया पाथ सम्मिलित करता है। |
| [iterator()](#iterator--) | Iterable इंटरफ़ेस का कार्यान्वयन। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | तत्व के रेंडर किए गए क्षेत्र को सीमित करने वाली पाथ ज्योमेट्री सेट करता है। |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | कैनवास के भीतर पाथ के किनारों के रेंडरिंग को नियंत्रित करने वाला मान सेट करता है। |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | हाइपरलिंक लक्ष्य ऑब्जेक्ट सेट करता है। |
| [setOpacity(float value)](#setOpacity-float-) | तत्व की समान पारदर्शिता को परिभाषित करने वाला मान सेट करता है। |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | ब्रश को सेट करता है जो अल्फा मानों का मास्क निर्दिष्ट करता है, जिसे तत्व पर Opacity एट्रिब्यूट की तरह लागू किया जाता है, लेकिन तत्व के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा मानों की अनुमति देता है। |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | तत्व के सभी एट्रिब्यूट्स और सभी चाइल्ड एलिमेंट्स (यदि कोई हों) के लिए नया कोऑर्डिनेट फ्रेम स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स सेट करता है। |
| [size()](#size--) | चाइल्ड एलिमेंट्स की संख्या लौटाता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


इस कैनवास की चाइल्ड सूची में एक तत्व जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| तत्व | T | जोड़ने के लिए तत्व। |

**Returns:**
T - जोड़ा गया तत्व।
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


इस कैनवास की चाइल्ड सूची में निर्दिष्ट इंडेक्स स्थिति पर एक तत्व सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | वह स्थिति जहाँ तत्व को सम्मिलित किया जाना चाहिए। |
| तत्व | T | सम्मिलित करने के लिए तत्व। |

**Returns:**
T - सम्मिलित किया गया तत्व।
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


इस कैनवास की चाइल्ड सूची में एक नया कैनवास जोड़ता है।

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


इस कैनवास की चाइल्ड सूची में नए glyphs जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fontFamily | java.lang.String | फ़ॉन्ट परिवार। |
| fontSize | float | फ़ॉन्ट आकार। |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | फ़ॉन्ट शैली। |
| originX | float | ग्लिफ़ का मूल X निर्देशांक। |
| originY | float | Glyphs का मूल T निर्देशांक। |
| unicodeString | java.lang.String | प्रिंट करने के लिए स्ट्रिंग। |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


इस कैनवास की चाइल्ड सूची में एक नया पाथ जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | पथ की ज्यामिति। |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


इस कैनवास की प्रतिलिपि बनाता है।

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


कैनवास के भीतर पाथ के किनारों के रेंडरिंग को नियंत्रित करने वाला मान लौटाता है।

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


इस कैनवास की चाइल्ड सूची में निर्दिष्ट इंडेक्स स्थिति पर एक नया कैनवास सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | नया कैनवास जहाँ सम्मिलित किया जाना चाहिए, उसकी स्थिति। |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


इस कैनवास की चाइल्ड सूची में निर्दिष्ट इंडेक्स स्थिति पर नए glyphs सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | नए glyphs जहाँ सम्मिलित किए जाने चाहिए, उसकी स्थिति। |
| fontFamily | java.lang.String | फ़ॉन्ट परिवार। |
| fontSize | float | फ़ॉन्ट आकार। |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | फ़ॉन्ट शैली। |
| originX | float | ग्लिफ़ का मूल X निर्देशांक। |
| originY | float | Glyphs का मूल T निर्देशांक। |
| unicodeString | java.lang.String | प्रिंट करने के लिए स्ट्रिंग। |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


इस कैनवास की चाइल्ड सूची में निर्दिष्ट इंडेक्स स्थिति पर एक नया पाथ सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | नया पथ जहाँ सम्मिलित किया जाना चाहिए, उसकी स्थिति। |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | पथ की ज्यामिति। |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


कैनवास के भीतर पाथ के किनारों के रेंडरिंग को नियंत्रित करने वाला मान सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | किनारा रेंडरिंग मोड। |

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

