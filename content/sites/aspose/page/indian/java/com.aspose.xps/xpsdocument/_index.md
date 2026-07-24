---
title: "XpsDocument"
second_title: "Aspose.Page for Java API संदर्भ"
description: "XPS दस्तावेज़ की मुख्य इकाई को सम्मिलित करने वाला वर्ग, जो किसी भी XPS तत्व के लिए हेरफेर विधियाँ प्रदान करता है।"
type: docs
weight: 19
url: /hi/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

XPS दस्तावेज़ की मुख्य इकाई को सम्मिलित करने वाला वर्ग, जो किसी भी XPS तत्व के लिए हेरफेर विधियाँ प्रदान करता है।
## कंस्ट्रक्टर्स

| कंस्ट्रक्टर | विवरण |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | डिफ़ॉल्ट पेज आकार के साथ खाली XPS दस्तावेज़ बनाता है। |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | निर्दिष्ट पथ पर स्थित मौजूदा XPS दस्तावेज़ खोलता है। |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | स्ट्रीम में संग्रहीत मौजूदा दस्तावेज़ को XPS दस्तावेज़ के रूप में लोड करता है। |
## मेथड्स

| मेथड | विवरण |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | एक सामग्री तत्व (Canvas, Path, या Glyphs) जोड़ता है |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | सक्रिय पृष्ठ पर निर्दिष्ट इंडेक्स स्थिति पर एक तत्व (Canvas, Path, या Glyphs) सम्मिलित करता है। |
| [<T>remove(T element)](#-T-remove-T-) | सक्रिय पृष्ठ से एक तत्व हटाता है। |
| [addCanvas()](#addCanvas--) | सक्रिय पृष्ठ में एक नया कैनवास जोड़ता है। |
| [addDocument()](#addDocument--) | डिफ़ॉल्ट पेज आकार के साथ एक खाली दस्तावेज़ जोड़ता है और जोड़ा गया दस्तावेज़ को सक्रिय के रूप में चुनता है। |
| [addDocument(boolean activate)](#addDocument-boolean-) | डिफ़ॉल्ट पेज आकार के साथ एक खाली दस्तावेज़ जोड़ता है। |
| [addDocument(float width, float height)](#addDocument-float-float-) | पहले पृष्ठ के आयाम (चौड़ाई और ऊँचाई) के साथ एक खाली दस्तावेज़ जोड़ता है और जोड़ा गया दस्तावेज़ को सक्रिय के रूप में चुनता है। |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | पहले पृष्ठ के आयाम width और height के साथ एक खाली दस्तावेज़ जोड़ता है। |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | सक्रिय पृष्ठ में नए ग्लिफ़ जोड़ता है। |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | सक्रिय पृष्ठ में नए ग्लिफ़ जोड़ता है। |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | दस्तावेज़ में एक रूपरेखा प्रविष्टि जोड़ता है। |
| [addPage()](#addPage--) | डिफ़ॉल्ट पृष्ठ आकार के साथ दस्तावेज़ में एक खाली पृष्ठ जोड़ता है। |
| [addPage(boolean activate)](#addPage-boolean-) | डिफ़ॉल्ट पृष्ठ आकार के साथ दस्तावेज़ में एक खाली पृष्ठ जोड़ता है। |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | दस्तावेज़ में एक पृष्ठ जोड़ता है और जोड़ा गया पृष्ठ को सक्रिय के रूप में चुनता है। |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | दस्तावेज़ में एक पृष्ठ जोड़ता है। |
| [addPage(float width, float height)](#addPage-float-float-) | निर्दिष्ट width और height के साथ दस्तावेज़ में एक खाली पृष्ठ जोड़ता है। |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | निर्दिष्ट width और height के साथ दस्तावेज़ में एक खाली पृष्ठ जोड़ता है। |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | सक्रिय पृष्ठ में एक नया पथ जोड़ता है। |
| [close()](#close--) | इंस्टेंस को नष्ट करता है। |
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
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | स्ट्रीम से एक नया TrueType फ़ॉन्ट संसाधन बनाता है। |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | एक नया TrueType फ़ॉन्ट संसाधन बनाता है। |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | नए glyphs बनाता है। |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | नए glyphs बनाता है। |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | एक नया gradient stop बनाता है। |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | एक नया gradient stop बनाता है। |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | स्ट्रीम से एक नया ICC प्रोफ़ाइल संसाधन बनाता है। |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | iccProfilePath पर स्थित ICC प्रोफ़ाइल फ़ाइल से एक नया ICC प्रोफ़ाइल संसाधन बनाता है। |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | स्ट्रीम से एक नया इमेज संसाधन बनाता है। |
| [createImage(String imagePath)](#createImage-java.lang.String-) | imagePath पर स्थित इमेज फ़ाइल से एक नया इमेज संसाधन बनाता है। |
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
| [getActiveDocument()](#getActiveDocument--) | सक्रिय दस्तावेज़ संख्या लौटाता है। |
| [getActivePage()](#getActivePage--) | सक्रिय दस्तावेज़ के भीतर सक्रिय पृष्ठ संख्या लौटाता है। |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | XPS पैकेज के भीतर दस्तावेज़ों की संख्या लौटाता है। |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | documentIndex द्वारा अनुक्रमित दस्तावेज़ का प्रिंट टिकट प्राप्त करता है। |
| [getJobPrintTicket()](#getJobPrintTicket--) | दस्तावेज़ का जॉब प्रिंट टिकट लौटाता है। |
| [getPage()](#getPage--) | सक्रिय पृष्ठ के लिए XpsPage इंस्टेंस लौटाता है। |
| [getPageCount()](#getPageCount--) | सक्रिय दस्तावेज़ में पृष्ठों की संख्या लौटाता है। |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | documentIndex द्वारा अनुक्रमित दस्तावेज़ में pageIndex द्वारा अनुक्रमित पृष्ठ का प्रिंट टिकट प्राप्त करता है। |
| [getTotalPageCount()](#getTotalPageCount--) | XPS दस्तावेज़ के भीतर सभी दस्तावेज़ों में पृष्ठों की कुल संख्या लौटाता है। |
| [getUtils()](#getUtils--) | वह ऑब्जेक्ट प्राप्त करता है जो औपचारिक XPS मैनिपुलेशन API से परे उपयोगिताएँ प्रदान करता है। |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | index स्थिति पर सक्रिय पृष्ठ में एक नया कैनवास सम्मिलित करता है। |
| [insertDocument(int index)](#insertDocument-int-) | index स्थिति पर डिफ़ॉल्ट पृष्ठ आकार के साथ एक खाली दस्तावेज़ सम्मिलित करता है और सम्मिलित दस्तावेज़ को सक्रिय के रूप में चुनता है। |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | index स्थिति पर डिफ़ॉल्ट पृष्ठ आकार के साथ एक खाली दस्तावेज़ सम्मिलित करता है। |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | index स्थिति पर पहले पृष्ठ के आयाम width और height के साथ एक खाली दस्तावेज़ सम्मिलित करता है और सम्मिलित दस्तावेज़ को सक्रिय के रूप में चुनता है। |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | पहले पृष्ठ के आयाम width और height के साथ एक खाली दस्तावेज़ को index position पर सम्मिलित करता है। |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | सक्रिय पृष्ठ पर index position पर नए glyphs सम्मिलित करता है। |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | सक्रिय पृष्ठ पर index position पर नए glyphs सम्मिलित करता है। |
| [insertPage(int index)](#insertPage-int-) | डिफ़ॉल्ट पृष्ठ आकार के साथ दस्तावेज़ में index position पर एक खाली पृष्ठ सम्मिलित करता है और सम्मिलित पृष्ठ को सक्रिय चुनता है। |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | डिफ़ॉल्ट पृष्ठ आकार के साथ दस्तावेज़ में index position पर एक खाली पृष्ठ सम्मिलित करता है। |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | दस्तावेज़ में index position पर एक पृष्ठ सम्मिलित करता है और सम्मिलित पृष्ठ को सक्रिय चुनता है। |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | दस्तावेज़ में index position पर एक पृष्ठ सम्मिलित करता है। |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | निर्दिष्ट width और height के साथ दस्तावेज़ में index position पर एक खाली पृष्ठ सम्मिलित करता है और सम्मिलित पृष्ठ को सक्रिय चुनता है। |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | निर्दिष्ट width और height के साथ दस्तावेज़ में index position पर एक खाली पृष्ठ सम्मिलित करता है। |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | सक्रिय पृष्ठ पर index position पर एक नया path सम्मिलित करता है। |
| [isLicensed()](#isLicensed--) | यह दर्शाता है कि Aspose.Page for Java उत्पाद लाइसेंस एक्सेस किया गया है और वैध है या नहीं। |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | कई XPS फ़ाइलों को एक XPS दस्तावेज़ में मिलाया जा रहा है। |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | कई XPS फ़ाइलों को एक XPS दस्तावेज़ में मिलाया जा रहा है। |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | Device instance का उपयोग करके XPS दस्तावेज़ों को PDF में मिलाया जा रहा है। |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Device instance का उपयोग करके XPS दस्तावेज़ों को PDF में मिलाया जा रहा है। |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | सक्रिय पृष्ठ से index position पर एक तत्व हटाता है। |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | index position पर एक दस्तावेज़ हटाता है। |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | दस्तावेज़ से एक पृष्ठ हटाता है। |
| [removePageAt(int index)](#removePageAt-int-) | दस्तावेज़ से index position पर एक पृष्ठ हटाता है। |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Device instance का उपयोग करके दस्तावेज़ को सहेजता है। |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | XPS दस्तावेज़ को स्ट्रीम में सहेजता है। |
| [save(String path)](#save-java.lang.String-) | XPS दस्तावेज़ को path पर स्थित XPS फ़ाइल में सहेजता है। |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | दस्तावेज़ को इमेज फ़ाइल में सहेजता है। आउटपुट डायरेक्टरी और फ़ाइल नाम इनपुट XPS फ़ाइल के समान होंगे। |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | दस्तावेज़ को निर्दिष्ट डायरेक्टरी में निर्दिष्ट फ़ाइल नाम के साथ इमेज फ़ाइल में सहेजता है। |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | दस्तावेज़ को बाइट एरे के रूप में बिटमैप इमेज फ़ॉर्मेट में सहेजता है। |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | दस्तावेज़ को PDF फ़ॉर्मेट में सहेजता है। |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | दस्तावेज़ को PDF फ़ॉर्मेट में सहेजता है। |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | दस्तावेज़ को PS फ़ॉर्मेट में सहेजता है। |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | दस्तावेज़ को PostScript फ़ॉर्मेट में सहेजता है। |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | संपादन के लिए एक सक्रिय दस्तावेज़ चुनता है। |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | संपादन के लिए एक सक्रिय दस्तावेज़ पृष्ठ का चयन करता है। |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | printTicket को documentIndex द्वारा अनुक्रमित दस्तावेज़ से जोड़ता है। |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | दस्तावेज़ के जॉब प्रिंट टिकट को सेट करता है। |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | printTicket को documentIndex द्वारा अनुक्रमित दस्तावेज़ में pageIndex द्वारा अनुक्रमित पृष्ठ से जोड़ता है। |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


डिफ़ॉल्ट पेज आकार के साथ खाली XPS दस्तावेज़ बनाता है।

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


निर्दिष्ट पथ पर स्थित मौजूदा XPS दस्तावेज़ खोलता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | java.lang.String | दस्तावेज़ का स्थान। |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


स्ट्रीम में संग्रहीत मौजूदा दस्तावेज़ को XPS दस्तावेज़ के रूप में लोड करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | java.io.InputStream | दस्तावेज़ स्ट्रीम। |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | दस्तावेज़ लोडिंग विकल्प। |

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


सक्रिय पृष्ठ पर निर्दिष्ट इंडेक्स स्थिति पर एक तत्व (Canvas, Path, या Glyphs) सम्मिलित करता है।

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


सक्रिय पृष्ठ से एक तत्व हटाता है।

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


सक्रिय पृष्ठ में एक नया कैनवास जोड़ता है।

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


डिफ़ॉल्ट पेज आकार के साथ एक खाली दस्तावेज़ जोड़ता है और जोड़ा गया दस्तावेज़ को सक्रिय के रूप में चुनता है।

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


डिफ़ॉल्ट पेज आकार के साथ एक खाली दस्तावेज़ जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सक्रिय करें | boolean | फ़्लैग जो दर्शाता है कि जोड़ा गया दस्तावेज़ सक्रिय के रूप में चयनित किया जाए या नहीं। |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


पहले पृष्ठ के आयाम (चौड़ाई और ऊँचाई) के साथ एक खाली दस्तावेज़ जोड़ता है और जोड़ा गया दस्तावेज़ को सक्रिय के रूप में चुनता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| चौड़ाई | float | पहले पृष्ठ की चौड़ाई। |
| ऊँचाई | float | पहले पृष्ठ की ऊँचाई। |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


पहले पृष्ठ के आयाम width और height के साथ एक खाली दस्तावेज़ जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| चौड़ाई | float | पहले पृष्ठ की चौड़ाई। |
| ऊँचाई | float | पहले पृष्ठ की ऊँचाई। |
| सक्रिय करें | boolean | फ़्लैग जो दर्शाता है कि जोड़ा गया दस्तावेज़ सक्रिय के रूप में चयनित किया जाए या नहीं। |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


सक्रिय पृष्ठ में नए ग्लिफ़ जोड़ता है।

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


सक्रिय पृष्ठ में नए ग्लिफ़ जोड़ता है।

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
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


दस्तावेज़ में एक रूपरेखा प्रविष्टि जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| विवरण | java.lang.String | एंट्री का विवरण। |
| outlineLevel | int | आउटलाइन स्तर। |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | एंट्री लक्ष्य। |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


डिफ़ॉल्ट पृष्ठ आकार के साथ दस्तावेज़ में एक खाली पृष्ठ जोड़ता है।

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


डिफ़ॉल्ट पृष्ठ आकार के साथ दस्तावेज़ में एक खाली पृष्ठ जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सक्रिय करें | boolean | फ़्लैग जो दर्शाता है कि जोड़ा गया पृष्ठ सक्रिय के रूप में चयनित किया जाए या नहीं। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


दस्तावेज़ में एक पृष्ठ जोड़ता है और जोड़ा गया पृष्ठ को सक्रिय के रूप में चुनता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | जोड़ने के लिए पृष्ठ। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


दस्तावेज़ में एक पृष्ठ जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | जोड़ने के लिए पृष्ठ। |
| सक्रिय करें | boolean | फ़्लैग जो दर्शाता है कि जोड़ा गया पृष्ठ सक्रिय के रूप में चयनित किया जाए या नहीं। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


निर्दिष्ट width और height के साथ दस्तावेज़ में एक खाली पृष्ठ जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| चौड़ाई | float | नए पृष्ठ की चौड़ाई। |
| ऊँचाई | float | नए पृष्ठ की ऊँचाई। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


निर्दिष्ट width और height के साथ दस्तावेज़ में एक खाली पृष्ठ जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| चौड़ाई | float | नए पृष्ठ की चौड़ाई। |
| ऊँचाई | float | नए पृष्ठ की ऊँचाई। |
| सक्रिय करें | boolean | फ़्लैग जो दर्शाता है कि जोड़ा गया पृष्ठ सक्रिय के रूप में चयनित किया जाए या नहीं। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


सक्रिय पृष्ठ में एक नया पथ जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | पथ की ज्यामिति। |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


इंस्टेंस को नष्ट करता है।

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
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


स्ट्रीम से एक नया TrueType फ़ॉन्ट संसाधन बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | java.io.InputStream | संसाधन के रूप में लेने के लिए ICC प्रोफ़ाइल शामिल करने वाली स्ट्रीम। |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


एक नया TrueType फ़ॉन्ट संसाधन बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fontFamily | java.lang.String | फ़ॉन्ट परिवार। |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | फ़ॉन्ट शैली। संयोजन के लिए उपलब्ध मानों के लिए XpsFont क्लास कॉन्स्टेंट्स (जो बिट फ़्लैग हैं) देखें। |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
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
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


स्ट्रीम से एक नया ICC प्रोफ़ाइल संसाधन बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | java.io.InputStream | संसाधन के रूप में लेने के लिए ICC प्रोफ़ाइल शामिल करने वाली स्ट्रीम। |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


iccProfilePath पर स्थित ICC प्रोफ़ाइल फ़ाइल से एक नया ICC प्रोफ़ाइल संसाधन बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| iccProfilePath | java.lang.String | संसाधन के रूप में लेने के लिए ICC प्रोफ़ाइल का पथ। |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


स्ट्रीम से एक नया इमेज संसाधन बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | java.io.InputStream | संसाधन के रूप में लेने के लिए छवि शामिल करने वाली स्ट्रीम। |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


imagePath पर स्थित इमेज फ़ाइल से एक नया इमेज संसाधन बनाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| imagePath | java.lang.String | संसाधन के रूप में लेने के लिए छवि का पथ। |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
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
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Visual प्रॉपर्टी के विज़ुअल ब्रश के लिए XPS तत्व (Canvas, Path या Glyphs)। |
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
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


सक्रिय दस्तावेज़ संख्या लौटाता है।

**Returns:**
int - पूर्णांक मान।
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


सक्रिय दस्तावेज़ के भीतर सक्रिय पृष्ठ संख्या लौटाता है।

**Returns:**
int - पूर्णांक मान।
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentCount() {#getDocumentCount--}
```
public int getDocumentCount()
```


XPS पैकेज के भीतर दस्तावेज़ों की संख्या लौटाता है।

**Returns:**
int - XPS पैकेज के भीतर दस्तावेज़ों की संख्या।
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


documentIndex द्वारा अनुक्रमित दस्तावेज़ का प्रिंट टिकट प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| documentIndex | int | उस दस्तावेज़ का सूचकांक जिसका प्रिंट टिकट लौटाना है। |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


दस्तावेज़ का जॉब प्रिंट टिकट लौटाता है।

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


सक्रिय पृष्ठ के लिए XpsPage इंस्टेंस लौटाता है।

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


सक्रिय दस्तावेज़ में पृष्ठों की संख्या लौटाता है।

**Returns:**
int - सक्रिय दस्तावेज़ में पृष्ठों की संख्या।
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


documentIndex द्वारा अनुक्रमित दस्तावेज़ में pageIndex द्वारा अनुक्रमित पृष्ठ का प्रिंट टिकट प्राप्त करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| documentIndex | int | दस्तावेज़ का सूचकांक। |
| pageIndex | int | उस पृष्ठ का सूचकांक जिसका प्रिंट टिकट लौटाना है। |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
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
[DocumentUtils](../../com.aspose.xps/documentutils) - The utilities object.
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


index स्थिति पर सक्रिय पृष्ठ में एक नया कैनवास सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | नया कैनवास जहाँ सम्मिलित किया जाना चाहिए, उसकी स्थिति। |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


index स्थिति पर डिफ़ॉल्ट पृष्ठ आकार के साथ एक खाली दस्तावेज़ सम्मिलित करता है और सम्मिलित दस्तावेज़ को सक्रिय के रूप में चुनता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में दस्तावेज़ को सम्मिलित किया जाना चाहिए। |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


index स्थिति पर डिफ़ॉल्ट पृष्ठ आकार के साथ एक खाली दस्तावेज़ सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में दस्तावेज़ को सम्मिलित किया जाना चाहिए। |
| सक्रिय करें | boolean | फ़्लैग जो दर्शाता है कि सम्मिलित दस्तावेज़ को सक्रिय के रूप में चयनित किया जाए या नहीं। |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


index स्थिति पर पहले पृष्ठ के आयाम width और height के साथ एक खाली दस्तावेज़ सम्मिलित करता है और सम्मिलित दस्तावेज़ को सक्रिय के रूप में चुनता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में दस्तावेज़ को सम्मिलित किया जाना चाहिए। |
| चौड़ाई | float | पहले पृष्ठ की चौड़ाई। |
| ऊँचाई | float | पहले पृष्ठ की ऊँचाई। |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


पहले पृष्ठ के आयाम width और height के साथ एक खाली दस्तावेज़ को index position पर सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में दस्तावेज़ को सम्मिलित किया जाना चाहिए। |
| चौड़ाई | float | पहले पृष्ठ की चौड़ाई। |
| ऊँचाई | float | पहले पृष्ठ की ऊँचाई। |
| सक्रिय करें | boolean | फ़्लैग जो दर्शाता है कि सम्मिलित दस्तावेज़ को सक्रिय के रूप में चयनित किया जाए या नहीं। |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


सक्रिय पृष्ठ पर index position पर नए glyphs सम्मिलित करता है।

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


सक्रिय पृष्ठ पर index position पर नए glyphs सम्मिलित करता है।

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
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


डिफ़ॉल्ट पृष्ठ आकार के साथ दस्तावेज़ में index position पर एक खाली पृष्ठ सम्मिलित करता है और सम्मिलित पृष्ठ को सक्रिय चुनता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में पृष्ठ को सम्मिलित किया जाना चाहिए। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


डिफ़ॉल्ट पृष्ठ आकार के साथ दस्तावेज़ में index position पर एक खाली पृष्ठ सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में पृष्ठ को सम्मिलित किया जाना चाहिए। |
| सक्रिय करें | boolean | फ़्लैग जो दर्शाता है कि सम्मिलित पृष्ठ को सक्रिय के रूप में चयनित किया जाए या नहीं। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


दस्तावेज़ में index position पर एक पृष्ठ सम्मिलित करता है और सम्मिलित पृष्ठ को सक्रिय चुनता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में पृष्ठ को जोड़ा जाना चाहिए। |
| page | [XpsPage](../../com.aspose.xps/xpspage) | सम्मिलित किया जाने वाला पृष्ठ। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


दस्तावेज़ में index position पर एक पृष्ठ सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में पृष्ठ को जोड़ा जाना चाहिए। |
| page | [XpsPage](../../com.aspose.xps/xpspage) | सम्मिलित किया जाने वाला पृष्ठ। |
| सक्रिय करें | boolean | फ़्लैग जो दर्शाता है कि सम्मिलित पृष्ठ को सक्रिय के रूप में चयनित किया जाए या नहीं। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


निर्दिष्ट width और height के साथ दस्तावेज़ में index position पर एक खाली पृष्ठ सम्मिलित करता है और सम्मिलित पृष्ठ को सक्रिय चुनता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में पृष्ठ को सम्मिलित किया जाना चाहिए। |
| चौड़ाई | float | नए पृष्ठ की चौड़ाई। |
| ऊँचाई | float | नए पृष्ठ की ऊँचाई। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


निर्दिष्ट width और height के साथ दस्तावेज़ में index position पर एक खाली पृष्ठ सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में पृष्ठ को सम्मिलित किया जाना चाहिए। |
| चौड़ाई | float | नए पृष्ठ की चौड़ाई। |
| ऊँचाई | float | नए पृष्ठ की ऊँचाई। |
| सक्रिय करें | boolean | फ़्लैग जो दर्शाता है कि सम्मिलित पृष्ठ को सक्रिय के रूप में चयनित किया जाए या नहीं। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


सक्रिय पृष्ठ पर index position पर एक नया path सम्मिलित करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | नया पथ जहाँ सम्मिलित किया जाना चाहिए, उसकी स्थिति। |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | पथ की ज्यामिति। |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


यह दर्शाता है कि Aspose.Page for Java उत्पाद लाइसेंस एक्सेस किया गया है और वैध है या नहीं।

**Returns:**
boolean - बूलियन मान
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


कई XPS फ़ाइलों को एक XPS दस्तावेज़ में मिलाया जा रहा है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | इस दस्तावेज़ के साथ मिलाने के लिए XPS फ़ाइलें। |
| outStream | java.io.OutputStream | आउटपुट स्ट्रीम जहाँ मिलाए गए XPS दस्तावेज़ों को सहेजा जाएगा। |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


कई XPS फ़ाइलों को एक XPS दस्तावेज़ में मिलाया जा रहा है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | इस दस्तावेज़ के साथ मिलाने के लिए XPS फ़ाइलें। |
| outXpsFilePath | java.lang.String | आउटपुट XPS फ़ाइल पथ। |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


Device instance का उपयोग करके XPS दस्तावेज़ों को PDF में मिलाया जा रहा है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | आउटपुट PDF फ़ाइल पथ। |
| filesForMerge | java.lang.String[] | इस दस्तावेज़ को आउटपुट डिवाइस पर मिलाने के लिए XPS फ़ाइलें। |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | दस्तावेज़ सहेजने के विकल्प। |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


Device instance का उपयोग करके XPS दस्तावेज़ों को PDF में मिलाया जा रहा है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | इस दस्तावेज़ को आउटपुट डिवाइस पर मिलाने के लिए XPS फ़ाइलें। |
| pdfStream | java.io.OutputStream | परिणामी PDF को लिखने के लिए आउटपुट स्ट्रीम। |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | दस्तावेज़ सहेजने के विकल्प। |

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


सक्रिय पृष्ठ से index position पर एक तत्व हटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | तत्व जहाँ हटाया जाना चाहिए, उसकी स्थिति। |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


index position पर एक दस्तावेज़ हटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में दस्तावेज़ को हटाया जाना चाहिए। |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


दस्तावेज़ से एक पृष्ठ हटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | हटाया जाने वाला पृष्ठ। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


दस्तावेज़ से index position पर एक पृष्ठ हटाता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | जिस स्थिति में पृष्ठ को हटाया जाना चाहिए। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Device instance का उपयोग करके दस्तावेज़ को सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | यह  डिवाइस  इंस्टेंस। |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | दस्तावेज़ सहेजने के विकल्प। |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


XPS दस्तावेज़ को स्ट्रीम में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | java.io.OutputStream | स्ट्रीम XPS दस्तावेज़ को सहेजने के लिए। |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


XPS दस्तावेज़ को path पर स्थित XPS फ़ाइल में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| path | java.lang.String | दस्तावेज़ का स्थान। |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


दस्तावेज़ को इमेज फ़ाइल में सहेजता है। आउटपुट डायरेक्टरी और फ़ाइल नाम इनपुट XPS फ़ाइल के समान होंगे। फ़ाइल एक्सटेंशन "options" पैरामीटर में निर्दिष्ट इमेज फ़ॉर्मेट के अनुरूप होगा। यदि दस्तावेज़ को ऐसी स्ट्रीम से इनिशियलाइज़ किया गया है जो FileInputStream नहीं है, तो इमेज फ़ाइल वर्तमान फ़ोल्डर में डिफ़ॉल्ट फ़ाइल नाम टेम्प्लेट के साथ सहेजी जाएगी।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | बिटमैप इमेज फ़ॉर्मेट में दस्तावेज़ सहेजने के विकल्प। |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


दस्तावेज़ को निर्दिष्ट डायरेक्टरी में निर्दिष्ट फ़ाइल नाम के साथ इमेज फ़ाइल में सहेजता है। फ़ाइल एक्सटेंशन "options" पैरामीटर में इमेज फ़ॉर्मेट के अनुरूप होगा।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | बिटमैप इमेज फ़ॉर्मेट में दस्तावेज़ सहेजने के विकल्प। |
| outDir | java.lang.String | आउटपुट डायरेक्टरी जहाँ इमेज फ़ाइल सहेजी जाएगी। |
| fileNameTemplate | java.lang.String | इमेज (बिना एक्सटेंशन) के लिए फ़ाइल नाम टेम्प्लेट। यदि इनपुट XPS फ़ाइल एक पृष्ठ की है तो यह ठीक फ़ाइल नाम होगा, अन्यथा "\_[n]", जहाँ "n" - पृष्ठ संख्या 1 से शुरू, इस पर उपसर्ग जोड़ा जाएगा। फ़ाइल एक्सटेंशन "option" पैरामीटर में इमेज फ़ॉर्मेट के अनुरूप होगा। |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


दस्तावेज़ को बाइट एरे के रूप में बिटमैप इमेज फ़ॉर्मेट में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | बिटमैप इमेज फ़ॉर्मेट में दस्तावेज़ सहेजने के विकल्प। |

**Returns:**
byte[][][] - परिणामी इमेज बाइट एरेज़। पहला आयाम आंतरिक दस्तावेज़ों के लिए है और दूसरा आयाम आंतरिक दस्तावेज़ों के भीतर पृष्ठों के लिए है।
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


दस्तावेज़ को PDF फ़ॉर्मेट में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | java.io.OutputStream | आउटपुट PDF फ़ाइल लिखने के लिए स्ट्रीम। |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | PDF फ़ॉर्मेट में दस्तावेज़ सहेजने के विकल्प। |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


दस्तावेज़ को PDF फ़ॉर्मेट में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | आउटपुट PDF फ़ाइल पथ। |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | PDF फ़ॉर्मेट में दस्तावेज़ सहेजने के विकल्प। |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


दस्तावेज़ को PS फ़ॉर्मेट में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | java.io.OutputStream | आउटपुट PS फ़ाइल लिखने के लिए स्ट्रीम। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PS फ़ॉर्मेट में दस्तावेज़ सहेजने के विकल्प। |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


दस्तावेज़ को PostScript फ़ॉर्मेट में सहेजता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| outPsFilePath | java.lang.String | आउटपुट पोस्टस्क्रिप्ट फ़ाइल पथ। |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | PDF फ़ॉर्मेट में दस्तावेज़ सहेजने के विकल्प। |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


संपादन के लिए एक सक्रिय दस्तावेज़ चुनता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| documentNumber | int | एक दस्तावेज़ संख्या। |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


संपादन के लिए एक सक्रिय दस्तावेज़ पृष्ठ का चयन करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pageNumber | int | एक पृष्ठ संख्या। |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


printTicket को documentIndex द्वारा अनुक्रमित दस्तावेज़ से जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| documentIndex | int | प्रिंट टिकट को लिंक करने वाले दस्तावेज़ का इंडेक्स। |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | लिंक करने के लिए प्रिंट टिकट। |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


दस्तावेज़ के जॉब प्रिंट टिकट को सेट करता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | दस्तावेज़ का जॉब प्रिंट टिकट। |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


printTicket को documentIndex द्वारा अनुक्रमित दस्तावेज़ में pageIndex द्वारा अनुक्रमित पृष्ठ से जोड़ता है।

**Parameters:**
| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| documentIndex | int | दस्तावेज़ का सूचकांक। |
| pageIndex | int | प्रिंट टिकट को लिंक करने वाले पृष्ठ का इंडेक्स। |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | लिंक करने के लिए प्रिंट टिकट। |

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

