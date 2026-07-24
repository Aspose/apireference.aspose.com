---
title: "PageAPI"
second_title: "Aspose.Page for Java API संदर्भ"
description: "यह Page तत्व संशोधन API।"
type: docs
weight: 12
url: /hi/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

The **Page** तत्व संशोधन API।
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | एक सामग्री तत्व (Canvas, Path, या Glyphs) जोड़ता है |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | पृष्ठ पर एक तत्व (Canvas, Path, या Glyphs) को इंडेक्स स्थिति पर सम्मिलित करता है। |
| [<T>remove(T element)](#-T-remove-T-) | पृष्ठ से एक तत्व हटाता है। |
| [addCanvas()](#addCanvas--) | पृष्ठ में एक नया canvas जोड़ता है। |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | पृष्ठ में नए glyphs जोड़ता है। |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | पृष्ठ में नए glyphs जोड़ता है। |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | दस्तावेज़ में एक रूपरेखा प्रविष्टि जोड़ता है। |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | पृष्ठ में एक नया path जोड़ता है। |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | एक नया stroked elliptical arc खंड बनाता है। |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | एक नया elliptical arc खंड बनाता है। |
| [createCanvas()](#createCanvas--) | एक नया canvas बनाता है। |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | ICC-आधारित रंग स्थान में एक नया रंग बनाता है। |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | scRGB रंग स्थान में एक नया रंग बनाता है। |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | scRGB रंग स्थान में एक नया रंग बनाता है। |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | sRGB रंग स्थान में एक नया रंग बनाता है। |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | sRGB रंग स्थान में एक नया रंग बनाता है। |
| [createColor(Color color)](#createColor-java.awt.Color-) | एक नया रंग बनाता है। |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | ICC-आधारित रंग स्थान में एक नया रंग बनाता है। |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | नए glyphs बनाता है। |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | नए glyphs बनाता है। |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | एक नया gradient stop बनाता है। |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | एक नया gradient stop बनाता है। |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | एक नया image brush बनाता है। |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | एक नया image brush बनाता है। |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | एक नया linear gradient brush बनाता है। |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | एक नया linear gradient brush बनाता है। |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | एक नया affine transformation matrix बनाता है। |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | एक नया path बनाता है। |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | एक नया open path figure बनाता है। |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | एक नया path figure बनाता है। |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | एक नया open path figure बनाता है। |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | एक नया path figure बनाता है। |
| [createPathGeometry()](#createPathGeometry--) | एक नया path geometry बनाता है। |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | संक्षिप्त रूप में निर्दिष्ट नई पाथ ज्योमेट्री बनाता है। |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | निर्दिष्ट पाथ फ़िगर्स की सूची के साथ नई पाथ ज्योमेट्री बनाता है। |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | स्ट्रोक्ड क्यूबिक बीज़ियर कर्व्स का नया सेट बनाता है। |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | क्यूबिक बीज़ियर कर्व्स का नया सेट बनाता है। |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | एक मनमाने संख्या के व्यक्तिगत वर्टिसेज़ वाला नया स्ट्रोक्ड पॉलीगोनल ड्रॉइंग बनाता है। |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | एक मनमाने संख्या के व्यक्तिगत वर्टिसेज़ वाला नया पॉलीगोनल ड्रॉइंग बनाता है। |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | पाथ फ़िगर में पिछले बिंदु से वर्टिसेज़ के सेट के माध्यम से, निर्दिष्ट कंट्रोल पॉइंट्स का उपयोग करके, स्ट्रोक्ड क्वाड्रेटिक बीज़ियर कर्व्स का नया सेट बनाता है। |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | पाथ फ़िगर में पिछले बिंदु से वर्टिसेज़ के सेट के माध्यम से, निर्दिष्ट कंट्रोल पॉइंट्स का उपयोग करके, क्वाड्रेटिक बीज़ियर कर्व्स का नया सेट बनाता है। |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | नया रेडियल ग्रेडिएंट ब्रश बनाता है। |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | नया रेडियल ग्रेडिएंट ब्रश बनाता है। |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | नया सॉलिड कलर ब्रश बनाता है। |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | नया सॉलिड कलर ब्रश बनाता है। |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | नया विज़ुअल ब्रश बनाता है। |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | पेज की ऊँचाई लौटाता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है। |
| [getPageCount()](#getPageCount--) | सक्रिय दस्तावेज़ में पृष्ठों की संख्या लौटाता है। |
| [getTotalPageCount()](#getTotalPageCount--) | XPS दस्तावेज़ के भीतर सभी दस्तावेज़ों में पृष्ठों की कुल संख्या लौटाता है। |
| [getUtils()](#getUtils--) | वह ऑब्जेक्ट प्राप्त करता है जो औपचारिक XPS मैनिपुलेशन API से परे उपयोगिताएँ प्रदान करता है। |
| [getWidth()](#getWidth--) | पेज की चौड़ाई लौटाता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है। |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | पेज में नई कैनवास को  index  स्थिति पर सम्मिलित करता है। |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | पेज में नए ग्लिफ़्स को  index  स्थिति पर सम्मिलित करता है। |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | पेज में नए ग्लिफ़्स को  index  स्थिति पर सम्मिलित करता है। |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | पेज में नया पाथ को  index  स्थिति पर सम्मिलित करता है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | पेज से  index  स्थिति पर तत्व को हटाता है। |
| [setHeight(float value)](#setHeight-float-) | पेज की ऊँचाई सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है। |
| [setWidth(float value)](#setWidth-float-) | पेज की चौड़ाई सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


एक सामग्री तत्व (Canvas, Path, या Glyphs) जोड़ता है

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


पृष्ठ पर एक तत्व (Canvas, Path, या Glyphs) को इंडेक्स स्थिति पर सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति पर एक तत्व सम्मिलित किया जाना चाहिए। |
| तत्व | T | सम्मिलित करने के लिए तत्व। |

**Returns:**
T - सम्मिलित किया गया तत्व।
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


पृष्ठ से एक तत्व हटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| तत्व | T | हटाने के लिए तत्व। |

**Returns:**
T - हटाया गया तत्व।
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


पृष्ठ में एक नया canvas जोड़ता है।

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


पृष्ठ में नए glyphs जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | फ़ॉन्ट संसाधन। |
| fontRenderingEmSize | float | फ़ॉन्ट आकार। |
| originX | float | ग्लिफ़ का मूल X निर्देशांक। |
| originY | float | ग्लिफ़ का मूल Y निर्देशांक। |
| unicodeString | java.lang.String | प्रिंट करने के लिए स्ट्रिंग। |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


पृष्ठ में नए glyphs जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fontFamily | java.lang.String | फ़ॉन्ट परिवार। |
| fontRenderingEmSize | float | फ़ॉन्ट आकार। |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | फ़ॉन्ट शैली। |
| originX | float | ग्लिफ़ का मूल X निर्देशांक। |
| originY | float | ग्लिफ़ का मूल Y निर्देशांक। |
| unicodeString | java.lang.String | प्रिंट करने के लिए स्ट्रिंग। |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


दस्तावेज़ में एक रूपरेखा प्रविष्टि जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| विवरण | java.lang.String | एंट्री का विवरण। |
| outlineLevel | int | आउटलाइन स्तर। |
| targetPageNumber | int | लक्षित पृष्ठ संख्या। |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


पृष्ठ में एक नया path जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | पथ की ज्यामिति। |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


एक नया stroked elliptical arc खंड बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बिंदु | java.awt.geom.Point2D | दीर्घवृत्तीय चाप का अंतिम बिंदु। |
| आकार | java.awt.geom.Dimension2D | दीर्घवृत्तीय चाप की x और y त्रिज्या को x,y जोड़े के रूप में। |
| rotationAngle | float | यह दर्शाता है कि वर्तमान निर्देशांक प्रणाली के सापेक्ष दीर्घवृत्त कैसे घुमाया गया है। |
| isLargeArc | boolean | निर्धारित करता है कि क्या चाप 180 डिग्री या अधिक के स्वेप के साथ खींचा गया है। |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | चाप जिस दिशा में खींचा जाता है। |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


एक नया elliptical arc खंड बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बिंदु | java.awt.geom.Point2D | दीर्घवृत्तीय चाप का अंतिम बिंदु। |
| आकार | java.awt.geom.Dimension2D | दीर्घवृत्तीय चाप की x और y त्रिज्या को x,y जोड़े के रूप में। |
| rotationAngle | float | यह दर्शाता है कि वर्तमान निर्देशांक प्रणाली के सापेक्ष दीर्घवृत्त कैसे घुमाया गया है। |
| isLargeArc | boolean | निर्धारित करता है कि क्या चाप 180 डिग्री या अधिक के स्वेप के साथ खींचा गया है। |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | चाप जिस दिशा में खींचा जाता है। |
| isStroked | boolean | निर्दिष्ट करता है कि पथ के इस खंड के लिए स्ट्रोक खींचा गया है या नहीं। |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


एक नया canvas बनाता है।

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


ICC-आधारित रंग स्थान में एक नया रंग बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | ICC प्रोफ़ाइल संसाधन। |
| components | float[] | रंग घटक। |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


scRGB रंग स्थान में एक नया रंग बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| r | float | लाल रंग घटक। |
| g | float | हरा रंग घटक। |
| b | float | नीला रंग घटक। |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


scRGB रंग स्थान में एक नया रंग बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| a | float | अल्फा रंग घटक। |
| r | float | लाल रंग घटक। |
| g | float | हरा रंग घटक। |
| b | float | नीला रंग घटक। |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


sRGB रंग स्थान में एक नया रंग बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| r | int | लाल रंग घटक। |
| g | int | हरा रंग घटक। |
| b | int | नीला रंग घटक। |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


sRGB रंग स्थान में एक नया रंग बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| a | int | अल्फा रंग घटक। |
| r | int | लाल रंग घटक। |
| g | int | हरा रंग घटक। |
| b | int | नीला रंग घटक। |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


एक नया रंग बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| color | java.awt.Color | RGB रंग के लिए एक मूल रंग उदाहरण। |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


ICC-आधारित रंग स्थान में एक नया रंग बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | java.lang.String | ICC प्रोफ़ाइल का पथ। |
| components | float[] | रंग घटक। |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


नए glyphs बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | फ़ॉन्ट संसाधन। |
| fontRenderingEmSize | float | फ़ॉन्ट आकार। |
| originX | float | ग्लिफ़ का मूल X निर्देशांक। |
| originY | float | ग्लिफ़ का मूल Y निर्देशांक। |
| unicodeString | java.lang.String | प्रिंट करने के लिए स्ट्रिंग। |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


नए glyphs बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fontFamily | java.lang.String | फ़ॉन्ट परिवार। |
| fontRenderingEmSize | float | फ़ॉन्ट आकार। |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | फ़ॉन्ट शैली। |
| originX | float | ग्लिफ़ का मूल X निर्देशांक। |
| originY | float | ग्लिफ़ का मूल Y निर्देशांक। |
| unicodeString | java.lang.String | प्रिंट करने के लिए स्ट्रिंग। |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


एक नया gradient stop बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | ग्रेडिएंट स्टॉप रंग। |
| ऑफ़सेट | float | ग्रेडिएंट ऑफ़सेट। |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


एक नया gradient stop बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| color | java.awt.Color | ग्रेडिएंट स्टॉप रंग। |
| ऑफ़सेट | float | ग्रेडिएंट ऑफ़सेट। |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


एक नया image brush बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | एक छवि संसाधन। |
| व्यूबॉक्स | java.awt.geom.Rectangle2D | ब्रश के स्रोत सामग्री की स्थिति और आयाम। |
| व्यूपोर्ट | java.awt.geom.Rectangle2D | प्राइम ब्रश टाइल के समावेशी निर्देशांक स्थान में वह क्षेत्र जो (संभवतः बार‑बार) लागू किया जाता है ताकि उस क्षेत्र को भर सके जहाँ ब्रश लागू किया गया है। |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


एक नया image brush बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| imagePath | java.lang.String | ब्रश टाइल के रूप में उपयोग करने के लिए इमेज का पथ। |
| व्यूबॉक्स | java.awt.geom.Rectangle2D | ब्रश के स्रोत सामग्री की स्थिति और आयाम। |
| व्यूपोर्ट | java.awt.geom.Rectangle2D | प्राइम ब्रश टाइल के समावेशी निर्देशांक स्थान में वह क्षेत्र जो (संभवतः बार‑बार) लागू किया जाता है ताकि उस क्षेत्र को भर सके जहाँ ब्रश लागू किया गया है। |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


एक नया linear gradient brush बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्टार्टपॉइंट | java.awt.geom.Point2D | रैखिक ग्रेडिएंट का प्रारंभिक बिंदु। |
| एंडपॉइंट | java.awt.geom.Point2D | रैखिक ग्रेडिएंट का अंतिम बिंदु। |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


एक नया linear gradient brush बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ग्रेडिएंटस्टॉप्स | java.util.List<com.aspose.xps.XpsGradientStop> | ग्रेडिएंट स्टॉप्स की सूची। |
| स्टार्टपॉइंट | java.awt.geom.Point2D | रैखिक ग्रेडिएंट का प्रारंभिक बिंदु। |
| एंडपॉइंट | java.awt.geom.Point2D | रैखिक ग्रेडिएंट का अंतिम बिंदु। |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


एक नया affine transformation matrix बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| m11 | float | तत्व 11। |
| m12 | float | तत्व 12। |
| m21 | float | तत्व 21। |
| m22 | float | तत्व 22। |
| m31 | float | Element 31. |
| m32 | float | Element 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


एक नया path बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | पथ की ज्यामिति। |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


एक नया open path figure बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्टार्टपॉइंट | java.awt.geom.Point2D | पाथ फ़िगर के पहले सेगमेंट के लिए प्रारंभिक बिंदु। |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


एक नया path figure बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्टार्टपॉइंट | java.awt.geom.Point2D | पाथ फ़िगर के पहले सेगमेंट के लिए प्रारंभिक बिंदु। |
| isClosed | boolean | निर्दिष्ट करता है कि पाथ बंद है या नहीं। यदि true पर सेट किया जाता है, तो स्ट्रोक \"closed\" रूप में खींचा जाता है, अर्थात पाथ फ़िगर के अंतिम सेगमेंट में अंतिम बिंदु StartPoint एट्रिब्यूट में निर्दिष्ट बिंदु से जुड़ा होता है; अन्यथा स्ट्रोक \"open\" रूप में खींचा जाता है, और अंतिम बिंदु प्रारंभ बिंदु से जुड़ा नहीं होता। यह केवल तब लागू होता है जब पाथ फ़िगर को ऐसे Path एलिमेंट में उपयोग किया जाता है जो स्ट्रोक निर्दिष्ट करता है। |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


एक नया open path figure बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्टार्टपॉइंट | java.awt.geom.Point2D | पाथ फ़िगर के पहले सेगमेंट के लिए प्रारंभिक बिंदु। |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | पाथ सेगमेंट्स की सूची। |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


एक नया path figure बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्टार्टपॉइंट | java.awt.geom.Point2D | पाथ फ़िगर के पहले सेगमेंट के लिए प्रारंभिक बिंदु। |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | पाथ सेगमेंट्स की सूची। |
| isClosed | boolean | निर्दिष्ट करता है कि पाथ बंद है या नहीं। यदि true पर सेट किया जाता है, तो स्ट्रोक \"closed\" रूप में खींचा जाता है, अर्थात पाथ फ़िगर के अंतिम सेगमेंट में अंतिम बिंदु StartPoint एट्रिब्यूट में निर्दिष्ट बिंदु से जुड़ा होता है; अन्यथा स्ट्रोक \"open\" रूप में खींचा जाता है, और अंतिम बिंदु प्रारंभ बिंदु से जुड़ा नहीं होता। यह केवल तब लागू होता है जब पाथ फ़िगर को ऐसे Path एलिमेंट में उपयोग किया जाता है जो स्ट्रोक निर्दिष्ट करता है। |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


एक नया path geometry बनाता है।

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


संक्षिप्त रूप में निर्दिष्ट नई पाथ ज्योमेट्री बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | पाथ ज्योमेट्री का संक्षिप्त रूप। |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


निर्दिष्ट पाथ फ़िगर्स की सूची के साथ नई पाथ ज्योमेट्री बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | पाथ फ़िगर्स की सूची। |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


स्ट्रोक्ड क्यूबिक बीज़ियर कर्व्स का नया सेट बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | कई B?bezier सेगमेंट्स के लिए नियंत्रण बिंदु। |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


क्यूबिक बीज़ियर कर्व्स का नया सेट बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | कई B?bezier सेगमेंट्स के लिए नियंत्रण बिंदु। |
| isStroked | boolean | निर्दिष्ट करता है कि पथ के इस खंड के लिए स्ट्रोक खींचा गया है या नहीं। |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


एक मनमाने संख्या के व्यक्तिगत वर्टिसेज़ वाला नया स्ट्रोक्ड पॉलीगोनल ड्रॉइंग बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | बहु सेगमेंट्स जो पॉली लाइन सेगमेंट को परिभाषित करते हैं, उनके लिए निर्देशांक का सेट। |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


एक मनमाने संख्या के व्यक्तिगत वर्टिसेज़ वाला नया पॉलीगोनल ड्रॉइंग बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | बहु सेगमेंट्स जो पॉली लाइन सेगमेंट को परिभाषित करते हैं, उनके लिए निर्देशांक का सेट। |
| isStroked | boolean | निर्दिष्ट करता है कि पथ के इस खंड के लिए स्ट्रोक खींचा गया है या नहीं। |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


पाथ फ़िगर में पिछले बिंदु से वर्टिसेज़ के सेट के माध्यम से, निर्दिष्ट कंट्रोल पॉइंट्स का उपयोग करके, स्ट्रोक्ड क्वाड्रेटिक बीज़ियर कर्व्स का नया सेट बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | कई क्वाड्रेटिक B?bezier सेगमेंट्स के लिए नियंत्रण बिंदु। |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


पाथ फ़िगर में पिछले बिंदु से वर्टिसेज़ के सेट के माध्यम से, निर्दिष्ट कंट्रोल पॉइंट्स का उपयोग करके, क्वाड्रेटिक बीज़ियर कर्व्स का नया सेट बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | कई क्वाड्रेटिक B?bezier सेगमेंट्स के लिए नियंत्रण बिंदु। |
| isStroked | boolean | निर्दिष्ट करता है कि पथ के इस खंड के लिए स्ट्रोक खींचा गया है या नहीं। |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


नया रेडियल ग्रेडिएंट ब्रश बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| center | java.awt.geom.Point2D | रेडियल ग्रेडिएंट का केंद्र बिंदु (अर्थात, दीर्घवृत्त का केंद्र)। |
| gradientOrigin | java.awt.geom.Point2D | रेडियल ग्रेडिएंट का मूल बिंदु। |
| radiusX | float | एलिप्स के x आयाम में त्रिज्या जो रेडियल ग्रेडिएंट को परिभाषित करती है। |
| radiusY | float | एलिप्स के y आयाम में त्रिज्या जो रेडियल ग्रेडिएंट को परिभाषित करती है। |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


नया रेडियल ग्रेडिएंट ब्रश बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ग्रेडिएंटस्टॉप्स | java.util.List<com.aspose.xps.XpsGradientStop> | ग्रेडिएंट स्टॉप्स की सूची। |
| center | java.awt.geom.Point2D | रेडियल ग्रेडिएंट का केंद्र बिंदु (अर्थात, दीर्घवृत्त का केंद्र)। |
| gradientOrigin | java.awt.geom.Point2D | रेडियल ग्रेडिएंट का मूल बिंदु। |
| radiusX | float | एलिप्स के x आयाम में त्रिज्या जो रेडियल ग्रेडिएंट को परिभाषित करती है। |
| radiusY | float | एलिप्स के y आयाम में त्रिज्या जो रेडियल ग्रेडिएंट को परिभाषित करती है। |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


नया सॉलिड कलर ब्रश बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | भरे हुए तत्वों के लिए रंग। |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


नया सॉलिड कलर ब्रश बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| color | java.awt.Color | भरे हुए तत्वों के लिए रंग। |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


नया विज़ुअल ब्रश बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Visual प्रॉपर्टी के लिए XPS element (Canvas, Path, या Glyphs) विज़ुअल ब्रश का। |
| व्यूबॉक्स | java.awt.geom.Rectangle2D | ब्रश के स्रोत सामग्री की स्थिति और आयाम। |
| व्यूपोर्ट | java.awt.geom.Rectangle2D | प्राइम ब्रश टाइल के समावेशी निर्देशांक स्थान में वह क्षेत्र जो (संभवतः बार‑बार) लागू किया जाता है ताकि उस क्षेत्र को भर सके जहाँ ब्रश लागू किया गया है। |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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
### getHeight() {#getHeight--}
```
public float getHeight()
```


पेज की ऊँचाई लौटाता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है।

**Returns:**
float - पृष्ठ की ऊँचाई।
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


सक्रिय दस्तावेज़ में पृष्ठों की संख्या लौटाता है।

**Returns:**
int - सक्रिय दस्तावेज़ में पृष्ठों की संख्या।
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


XPS दस्तावेज़ के भीतर सभी दस्तावेज़ों में पृष्ठों की कुल संख्या लौटाता है।

**Returns:**
int - XPS दस्तावेज़ के भीतर सभी दस्तावेज़ों में कुल पृष्ठों की संख्या।
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


वह ऑब्जेक्ट प्राप्त करता है जो औपचारिक XPS मैनिपुलेशन API से परे उपयोगिताएँ प्रदान करता है।

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


पेज की चौड़ाई लौटाता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है।

**Returns:**
float - पृष्ठ की चौड़ाई।
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


पेज में नई कैनवास को  index  स्थिति पर सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | नया कैनवास जहाँ सम्मिलित किया जाना चाहिए, उसकी स्थिति। |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


पेज में नए ग्लिफ़्स को  index  स्थिति पर सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | नए glyphs जहाँ सम्मिलित किए जाने चाहिए, उसकी स्थिति। |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | फ़ॉन्ट संसाधन। |
| fontSize | float | फ़ॉन्ट आकार। |
| originX | float | ग्लिफ़ का मूल X निर्देशांक। |
| originY | float | ग्लिफ़ का मूल Y निर्देशांक। |
| unicodeString | java.lang.String | प्रिंट करने के लिए स्ट्रिंग। |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


पेज में नए ग्लिफ़्स को  index  स्थिति पर सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | नए glyphs जहाँ सम्मिलित किए जाने चाहिए, उसकी स्थिति। |
| fontFamily | java.lang.String | फ़ॉन्ट परिवार। |
| fontSize | float | फ़ॉन्ट आकार। |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | फ़ॉन्ट शैली। |
| originX | float | ग्लिफ़ का मूल X निर्देशांक। |
| originY | float | ग्लिफ़ का मूल Y निर्देशांक। |
| unicodeString | java.lang.String | प्रिंट करने के लिए स्ट्रिंग। |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


पेज में नया पाथ को  index  स्थिति पर सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | नया पथ जहाँ सम्मिलित किया जाना चाहिए, उसकी स्थिति। |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | पथ की ज्यामिति। |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeAt(int index) {#removeAt-int-}
```
public XpsContentElement removeAt(int index)
```


पेज से  index  स्थिति पर तत्व को हटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | तत्व जहाँ हटाया जाना चाहिए, उसकी स्थिति। |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


पेज की ऊँचाई सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | पृष्ठ की ऊँचाई। |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


पेज की चौड़ाई सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की गई है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | float | पृष्ठ की चौड़ाई। |

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

