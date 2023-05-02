---
title: Class GraphicsPath
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Drawing2D.GraphicsPath कक्ष. जुड़ हुई रेखओं और वक्रं क एक श्रृंखल क प्रतनधत्व करत है
type: docs
weight: 260
url: /hi/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

जुड़ी हुई रेखाओं और वक्रों की एक श्रृंखला का प्रतिनिधित्व करता है।

```csharp
public class GraphicsPath : IDisposable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [GraphicsPath](graphicspath/#constructor)() | ग्राफ़िक्सपाथ क्लास के एक नए इंस्टेंस को वैकल्पिक के फ़िलमोड मान के साथ आरंभ करता है। |
| [GraphicsPath](graphicspath/#constructor_1)(FillMode) | का एक नया उदाहरण प्रारंभ करता है`GraphicsPath`निर्दिष्ट के साथ वर्गFillMode गणना. |
| [GraphicsPath](graphicspath/#constructor_2)(PointF[], byte[]) | का एक नया उदाहरण प्रारंभ करता है`GraphicsPath` निर्दिष्ट के साथ वर्ग[`PathPointType`](../pathpointtype/) औरPointF सरणियाँ। |
| [GraphicsPath](graphicspath/#constructor_4)(Point[], byte[]) | का एक नया उदाहरण प्रारंभ करता है`GraphicsPath` निर्दिष्ट के साथ वर्ग[`PathPointType`](../pathpointtype/) औरPoint सरणियाँ। |
| [GraphicsPath](graphicspath/#constructor_3)(PointF[], byte[], FillMode) | का एक नया उदाहरण प्रारंभ करता है`GraphicsPath` निर्दिष्ट के साथ वर्गPathPointType औरPointF सरणियों और निर्दिष्ट के साथFillMode गणना तत्व.. |
| [GraphicsPath](graphicspath/#constructor_5)(Point[], byte[], FillMode) | का एक नया उदाहरण प्रारंभ करता है`GraphicsPath` निर्दिष्ट के साथ वर्गPathPointType औरPoint सरणियों और निर्दिष्ट के साथFillMode गणना तत्व.. |

## गुण

| नाम | विवरण |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode/) { get; set; } | एक फिलमोड गणना प्राप्त या सेट करता है जो यह निर्धारित करता है कि इस ग्राफ़िक्सपाथ में आकृतियों के अंदरूनी भाग कैसे भरे जाते हैं। |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata/) { get; } | हो जाता हैPathData जो इसके लिए बिंदुओं और प्रकारों की सरणियों को समाहित करता हैGraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints/) { get; } | पथ में अंक प्राप्त करता है। |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes/) { get; } | में संबंधित बिंदुओं के प्रकार प्राप्त करता हैPathPoints सरणी. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount/) { get; } | में तत्वों की संख्या प्राप्त करता हैPathPoints याPathTypes सरणी. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc_1)(RectangleF, float, float) | वर्तमान आकृति में एक अण्डाकार चाप जोड़ता है। |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc)(float, float, float, float, float, float) | वर्तमान आकृति में एक अण्डाकार चाप जोड़ता है। |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier_1)(PointF, PointF, PointF, PointF) | वर्तमान आकृति में घन बेज़ियर वक्र जोड़ता है. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier)(float, float, float, float, float, float, float, float) | वर्तमान आकृति में घन बेज़ियर वक्र जोड़ता है. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers)(PointF[]) | मौजूदा आकृति में कनेक्टेड क्यूबिक बेज़ियर कर्व्स का एक क्रम जोड़ता है। |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers_1)(Point[]) | मौजूदा आकृति में कनेक्टेड क्यूबिक बेज़ियर कर्व्स का एक क्रम जोड़ता है। |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve)(PointF[]) | इस पथ में एक बंद वक्र जोड़ता है। एक कार्डिनल स्पलाइन वक्र का उपयोग किया जाता है क्योंकि वक्र सरणी में प्रत्येक बिंदु के माध्यम से यात्रा करता है। |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve_1)(PointF[], float) | इस पथ में एक बंद वक्र जोड़ता है। एक कार्डिनल स्पलाइन वक्र का उपयोग किया जाता है क्योंकि वक्र सरणी में प्रत्येक बिंदु के माध्यम से यात्रा करता है। |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve)(PointF[]) | वर्तमान आकृति में एक तख़्ता वक्र जोड़ता है। एक कार्डिनल स्पलाइन वक्र का उपयोग किया जाता है क्योंकि वक्र सरणी में प्रत्येक बिंदु के माध्यम से यात्रा करता है। |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_3)(Point[]) | वर्तमान आकृति में एक तख़्ता वक्र जोड़ता है। एक कार्डिनल स्पलाइन वक्र का उपयोग किया जाता है क्योंकि वक्र सरणी में प्रत्येक बिंदु के माध्यम से यात्रा करता है। |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_2)(PointF[], float) | वर्तमान आकृति में एक तख़्ता वक्र जोड़ता है। |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_1)(PointF[], int, int, float) | वर्तमान आकृति में एक तख़्ता वक्र जोड़ता है। |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse_1)(RectangleF) | वर्तमान पथ में दीर्घवृत्त जोड़ता है। |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse)(float, float, float, float) | वर्तमान पथ में दीर्घवृत्त जोड़ता है। |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline_1)(PointF, PointF) | इस ग्राफ़िक्सपाथ में एक लाइन सेगमेंट जोड़ता है. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline)(float, float, float, float) | इस ग्राफ़िक्सपाथ में एक लाइन सेगमेंट जोड़ता है. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines)(PointF[]) | इसके अंत में कनेक्टेड लाइन सेगमेंट की एक श्रृंखला जोड़ता हैGraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines_1)(Point[]) | इसके अंत में कनेक्टेड लाइन सेगमेंट की एक श्रृंखला जोड़ता हैGraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath/)(GraphicsPath, bool) | निर्दिष्ट ग्राफ़िक्सपाथ को इस पथ में जोड़ता है। |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie_1)(Rectangle, float, float) | इस पथ में पाई आकार की रूपरेखा जोड़ता है. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie)(float, float, float, float, float, float) | इस पथ में पाई आकार की रूपरेखा जोड़ता है. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon)(PointF[]) | इस पथ में एक बहुभुज जोड़ता है. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon_1)(Point[]) | इस पथ में एक बहुभुज जोड़ता है. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle)(Rectangle) | इस पथ में एक आयत जोड़ता है। |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle_1)(RectangleF) | इस पथ में एक आयत जोड़ता है। |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles)(RectangleF[]) | इस पथ में आयतों की एक श्रृंखला जोड़ता है। |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles_1)(Rectangle[]) | इस पथ में आयतों की एक श्रृंखला जोड़ता है। |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring)(string, FontFamily, int, float, Point, StringFormat) | इस पथ में एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | इस पथ में एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | इस पथ में एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | इस पथ में एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone/)() | वर्तमान पाथ ऑब्जेक्ट की प्रतिलिपि बनाएँ। |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures/)() | इस पथ में सभी खुले आंकड़े बंद करता है और एक नया आंकड़ा शुरू करता है। यह प्रत्येक खुली आकृति को उसके अंतिम बिंदु से उसके प्रारंभिक बिंदु तक एक रेखा जोड़कर बंद कर देता है। |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure/)() | मौजूदा आंकड़े को बंद करता है और एक नया आंकड़ा शुरू करता है। यदि वर्तमान आकृति में जुड़ी हुई रेखाओं और वक्रों का एक क्रम है, तो विधि समापन बिंदु से प्रारंभिक बिंदु तक एक रेखा को जोड़कर लूप को बंद कर देती है। |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose/)() | इस ग्राफ़िक्सपाथ द्वारा उपयोग किए जाने वाले सभी संसाधनों को रिलीज़ करता है। |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten)() | इस पथ में प्रत्येक वक्र को कनेक्टेड लाइन सेगमेंट के अनुक्रम में परिवर्तित करता है। |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_1)(Matrix) | निर्दिष्ट परिवर्तन लागू करता है और फिर इसमें प्रत्येक वक्र को परिवर्तित करता हैGraphicsPath . |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_2)(Matrix, float) | इसमें प्रत्येक वक्र को परिवर्तित करता हैGraphicsPath कनेक्टेड लाइन सेगमेंट के अनुक्रम में। |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds)() | एक आयत लौटाता है जो इसे सीमित करता हैGraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_1)(Matrix) | एक आयत लौटाता है जो इसे सीमित करता हैGraphicsPath जब यह पथ is निर्दिष्ट द्वारा परिवर्तित हो जाता हैMatrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_2)(Matrix, Pen) | एक आयत लौटाता है जो इसे सीमित करता हैGraphicsPath जब वर्तमान पथ is निर्दिष्ट द्वारा रूपांतरित होMatrix और निर्दिष्ट के साथ खींचाPen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint/)() | इसके पाथपॉइंट्स सरणी में अंतिम बिंदु प्राप्त करता है`GraphicsPath` . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible/)(PointF, Pen) | इंगित करता है कि निर्दिष्ट बिंदु इस की रूपरेखा के भीतर (नीचे) निहित है या नहींGraphicsPath जब निर्दिष्ट के साथ खींचा गयाPen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/)(PointF) | इंगित करता है कि निर्दिष्ट बिंदु इसमें शामिल है या नहींGraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset/)() | खाली करता है[`PathPoints`](./pathpoints/) और[`PathTypes`](./pathtypes/) arrays और सेट करता है[`FillMode`](../fillmode/) कोAlternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse/)() | में बिंदुओं के क्रम को उलट देता है[`PathPoints`](./pathpoints/)इस की सरणी`GraphicsPath` . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers/)() | इस पर मार्कर सेट करता है`GraphicsPath` . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure/)() | मौजूदा आंकड़े को बंद किए बिना एक नया आंकड़ा शुरू करता है। पथ में जोड़े गए सभी बाद के बिंदु इस नए आंकड़े में जोड़े जाते हैं। |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform/)(Matrix) | इस ग्राफ़िक्सपाथ पर ट्रांसफ़ॉर्म मैट्रिक्स लागू करता है। |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp)(PointF[], RectangleF) | इसके लिए एक आयत और एक समांतर चतुर्भुज द्वारा परिभाषित एक ताना परिवर्तन लागू करता है`GraphicsPath` . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_1)(PointF[], RectangleF, Matrix) | इसमें एक आयत और एक समांतर चतुर्भुज द्वारा परिभाषित एक ताना परिवर्तन लागू होता है`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | इसमें एक आयत और एक समांतर चतुर्भुज द्वारा परिभाषित एक ताना परिवर्तन लागू होता है`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | इसमें एक आयत और एक समांतर चतुर्भुज द्वारा परिभाषित एक ताना परिवर्तन लागू होता है`GraphicsPath`. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen)(Pen) | पथ में एक अतिरिक्त रूपरेखा जोड़ता है। |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_1)(Pen, Matrix) | में एक अतिरिक्त रूपरेखा जोड़ता हैGraphicsPath . |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_2)(Pen, Matrix, float) | इसे बदलता हैGraphicsPath वक्र के साथ जो उस क्षेत्र को घेरता है जो निर्दिष्ट पेन द्वारा इस पथ को खींचे जाने पर भर जाता है। |

### यह सभी देखें

* नाम स्थान [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* सभा [Aspose.Drawing](../../)


