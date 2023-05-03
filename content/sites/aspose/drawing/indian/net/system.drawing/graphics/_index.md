---
title: Class Graphics
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Graphics कक्ष. आरेखण सतह क संपुटत करत है.
type: docs
weight: 530
url: /hi/net/system.drawing/graphics/
---
## Graphics class

आरेखण सतह को संपुटित करता है.

```csharp
public class Graphics : IDisposable
```

## गुण

| नाम | विवरण |
| --- | --- |
| [Clip](../../system.drawing/graphics/clip/) { get; set; } | हो जाता है या सेट करता हैRegion जो इसके आरेखण क्षेत्र को सीमित करता हैGraphics . |
| [ClipBounds](../../system.drawing/graphics/clipbounds/) { get; } | हो जाता है[`RectangleF`](../rectanglef/) संरचना जो इस के कतरन क्षेत्र को बाध्य करती है`Graphics` . |
| [CompositingMode](../../system.drawing/graphics/compositingmode/) { get; set; } | एक मान प्राप्त करता है या सेट करता है जो यह निर्दिष्ट करता है कि इससे मिश्रित छवियां कैसे खींची जाती हैंGraphics . |
| [CompositingQuality](../../system.drawing/graphics/compositingquality/) { get; set; } | इसके लिए खींची गई कंपोज़िट इमेज की रेंडरिंग क्वालिटी प्राप्त या सेट करता हैGraphics . |
| [DpiX](../../system.drawing/graphics/dpix/) { get; } | इसका क्षैतिज रिज़ॉल्यूशन प्राप्त करता हैGraphics . |
| [DpiY](../../system.drawing/graphics/dpiy/) { get; } | इसका लंबवत रिज़ॉल्यूशन प्राप्त करता हैGraphics . |
| [InterpolationMode](../../system.drawing/graphics/interpolationmode/) { get; set; } | इस ग्राफ़िक्स से जुड़े इंटरपोलेशन मोड को प्राप्त या सेट करता है। |
| [IsClipEmpty](../../system.drawing/graphics/isclipempty/) { get; } | एक मान प्राप्त करता है जो दर्शाता है कि यह क्लिपिंग क्षेत्र है या नहींGraphics खाली है. |
| [IsVisibleClipEmpty](../../system.drawing/graphics/isvisibleclipempty/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या इसका दृश्य क्लिपिंग क्षेत्र हैGraphics खाली है. |
| [PageScale](../../system.drawing/graphics/pagescale/) { get; set; } | इसके लिए विश्व इकाइयों और पृष्ठ इकाइयों के बीच स्केलिंग प्राप्त या सेट करता हैGraphics . |
| [PageUnit](../../system.drawing/graphics/pageunit/) { get; set; } | इसमें पृष्ठ निर्देशांक के लिए उपयोग की जाने वाली माप की इकाई प्राप्त या सेट करता हैGraphics . |
| [PixelOffsetMode](../../system.drawing/graphics/pixeloffsetmode/) { get; set; } | एक मान प्राप्त या सेट करता है जो निर्दिष्ट करता है कि इसके प्रतिपादन के दौरान पिक्सेल कैसे ऑफसेट होते हैंGraphics . |
| [RenderingOrigin](../../system.drawing/graphics/renderingorigin/) { get; set; } | इसके रेंडरिंग मूल को प्राप्त या सेट करता हैGraphics डाइथरिंग और हैच ब्रश के लिए. |
| [SmoothingMode](../../system.drawing/graphics/smoothingmode/) { get; set; } | इस ग्राफ़िक्स के लिए रेंडरिंग गुणवत्ता प्राप्त या सेट करता है। |
| [TextContrast](../../system.drawing/graphics/textcontrast/) { get; set; } | पाठ प्रस्तुत करने के लिए गामा सुधार मान प्राप्त या सेट करता है। |
| [TextRenderingHint](../../system.drawing/graphics/textrenderinghint/) { get; set; } | इससे जुड़े टेक्स्ट के लिए रेंडरिंग मोड प्राप्त या सेट करता हैGraphics . |
| [Transform](../../system.drawing/graphics/transform/) { get; set; } | इसके लिए ज्यामितीय विश्व परिवर्तन की एक प्रति प्राप्त या सेट करता हैGraphics . |
| [VisibleClipBounds](../../system.drawing/graphics/visibleclipbounds/) { get; } | इसके दृश्यमान क्लिपिंग क्षेत्र का बाउंडिंग आयत प्राप्त करता हैGraphics . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [FromHwnd](../../system.drawing/graphics/fromhwnd/)(IntPtr) | एक नया बनाता हैGraphics निर्दिष्ट हैंडल से विंडो तक। |
| static [FromImage](../../system.drawing/graphics/fromimage/)(Image) | निर्दिष्ट छवि से एक नया ग्राफिक्स बनाता है। |
| [AddMetafileComment](../../system.drawing/graphics/addmetafilecomment/)(byte[]) | वर्तमान में एक टिप्पणी जोड़ता हैMetafile . |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer)() | इस की वर्तमान स्थिति के साथ एक ग्राफिक्स कंटेनर सहेजता हैGraphics और एक नया ग्राफिक्स कंटेनर खोलता है और उपयोग करता है। |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer_1)(Rectangle, Rectangle, GraphicsUnit) | इस की वर्तमान स्थिति के साथ एक ग्राफिक्स कंटेनर सहेजता हैGraphics और निर्दिष्ट पैमाने परिवर्तन के साथ एक नया ग्राफिक्स कंटेनर खोलता है और उपयोग करता है। |
| [BeginContainer](../../system.drawing/graphics/begincontainer/#begincontainer_2)(RectangleF, RectangleF, GraphicsUnit) | इस की वर्तमान स्थिति के साथ एक ग्राफिक्स कंटेनर सहेजता हैGraphics और निर्दिष्ट पैमाने परिवर्तन के साथ एक नया ग्राफिक्स कंटेनर खोलता है और उपयोग करता है। |
| [Clear](../../system.drawing/graphics/clear/)(Color) | संपूर्ण आरेखण सतह को साफ़ करता है और इसे निर्दिष्ट पृष्ठभूमि रंग से भरता है. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen_1)(Point, Point, Size) | रंग डेटा का एक बिट-ब्लॉक स्थानांतरण करता है, पिक्सेल के एक आयत के अनुरूप, स्क्रीन से ड्राइंग सतह तकGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen_2)(Point, Point, Size, CopyPixelOperation) | रंग डेटा का एक बिट-ब्लॉक स्थानांतरण करता है, पिक्सेल के एक आयत के अनुरूप, स्क्रीन से ड्राइंग सतह तकGraphics . |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen/#copyfromscreen)(int, int, int, int, Size, CopyPixelOperation) | रंग डेटा का एक बिट-ब्लॉक ट्रांसफर करता है, पिक्सेल के एक आयत के अनुरूप, स्क्रीन से ड्राइंग सतह तकGraphics . |
| [Dispose](../../system.drawing/graphics/dispose/)() | इस ग्राफ़िक्स द्वारा उपयोग किए जाने वाले सभी संसाधनों को रिलीज़ करता है। |
| [DrawArc](../../system.drawing/graphics/drawarc/#drawarc_1)(Pen, RectangleF, float, float) | आयतएफ संरचना द्वारा निर्दिष्ट अंडाकार के एक हिस्से का प्रतिनिधित्व करने वाला एक चाप खींचता है। |
| [DrawArc](../../system.drawing/graphics/drawarc/#drawarc)(Pen, float, float, float, float, float, float) | निर्देशांक, चौड़ाई और ऊंचाई की एक जोड़ी द्वारा निर्दिष्ट दीर्घवृत्त के एक हिस्से का प्रतिनिधित्व करने वाला एक चाप बनाता है। |
| [DrawBezier](../../system.drawing/graphics/drawbezier/#drawbezier_1)(Pen, PointF, PointF, PointF, PointF) | चार पॉइंटएफ संरचनाओं द्वारा परिभाषित बेज़ियर स्पलाइन बनाता है। |
| [DrawBezier](../../system.drawing/graphics/drawbezier/#drawbezier)(Pen, float, float, float, float, float, float, float, float) | बिंदुओं को दर्शाने वाले निर्देशांकों के चार क्रमित युग्मों द्वारा परिभाषित बेज़ियर स्पलाइन बनाता है। |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers/#drawbeziers)(Pen, PointF[]) | की एक सरणी से बेज़ियर स्प्लाइन की एक श्रृंखला बनाता हैPoint संरचनाएं. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers/#drawbeziers_1)(Pen, Point[]) | की एक सरणी से बेज़ियर स्प्लाइन की एक श्रृंखला बनाता हैPointF संरचनाएं. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve)(Pen, PointF[]) | एक सरणी द्वारा परिभाषित एक बंद कार्डिनल स्पलाइन बनाता हैPointF संरचनाएं. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_2)(Pen, Point[]) | एक सरणी द्वारा परिभाषित एक बंद कार्डिनल स्पलाइन बनाता हैPoint संरचनाएं. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_1)(Pen, PointF[], float, FillMode) | एक निर्दिष्ट तनाव का उपयोग करके पॉइंटएफ संरचनाओं की एक सरणी द्वारा परिभाषित एक बंद कार्डिनल स्पलाइन बनाता है। |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve/#drawclosedcurve_3)(Pen, Point[], float, FillMode) | एक सरणी द्वारा परिभाषित एक बंद कार्डिनल स्पलाइन बनाता हैPoint एक निर्दिष्ट तनाव का उपयोग कर संरचनाएं। |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve)(Pen, PointF[]) | की एक निर्दिष्ट सरणी के माध्यम से एक कार्डिनल स्पलाइन बनाता हैPointF संरचनाएं. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_4)(Pen, Point[]) | की एक निर्दिष्ट सरणी के माध्यम से एक कार्डिनल स्पलाइन बनाता हैPoint संरचनाएं. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_3)(Pen, PointF[], float) | की एक निर्दिष्ट सरणी के माध्यम से एक कार्डिनल स्पलाइन बनाता हैPointF एक निर्दिष्ट तनाव का उपयोग कर संरचनाएं। |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_6)(Pen, Point[], float) | की एक निर्दिष्ट सरणी के माध्यम से एक कार्डिनल स्पलाइन बनाता हैPoint एक निर्दिष्ट तनाव का उपयोग कर संरचनाएं। |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_1)(Pen, PointF[], int, int) | की एक निर्दिष्ट सरणी के माध्यम से एक कार्डिनल स्पलाइन बनाता हैPointF एक निर्दिष्ट तनाव का उपयोग कर संरचनाएं। आरेखण सरणी की शुरुआत से ऑफ़सेट प्रारंभ होता है. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_2)(Pen, PointF[], int, int, float) | की एक निर्दिष्ट सरणी के माध्यम से एक कार्डिनल स्पलाइन बनाता हैPointF एक निर्दिष्ट तनाव का उपयोग कर संरचनाएं। आरेखण सरणी की शुरुआत से ऑफ़सेट प्रारंभ होता है. |
| [DrawCurve](../../system.drawing/graphics/drawcurve/#drawcurve_5)(Pen, Point[], int, int, float) | की एक निर्दिष्ट सरणी के माध्यम से एक कार्डिनल स्पलाइन बनाता हैPoint एक निर्दिष्ट तनाव का उपयोग कर संरचनाएं। आरेखण सरणी की शुरुआत से ऑफ़सेट प्रारंभ होता है. |
| [DrawEllipse](../../system.drawing/graphics/drawellipse/#drawellipse_1)(Pen, RectangleF) | बाउंडिंग आयतF. द्वारा परिभाषित दीर्घवृत्त बनाता है |
| [DrawEllipse](../../system.drawing/graphics/drawellipse/#drawellipse)(Pen, float, float, float, float) | निर्देशांक, ऊंचाई और चौड़ाई की एक जोड़ी द्वारा निर्दिष्ट बाउंडिंग आयत द्वारा परिभाषित दीर्घवृत्त बनाता है। |
| [DrawIcon](../../system.drawing/graphics/drawicon/#drawicon_1)(Icon, Rectangle) | निर्दिष्ट द्वारा दर्शाई गई छवि बनाता हैIcon ए द्वारा निर्दिष्ट क्षेत्र के भीतरRectangle संरचना. |
| [DrawIcon](../../system.drawing/graphics/drawicon/#drawicon)(Icon, int, int) | निर्दिष्ट द्वारा दर्शाई गई छवि बनाता हैIcon निर्दिष्ट निर्देशांक पर. |
| [DrawIconUnstretched](../../system.drawing/graphics/drawiconunstretched/)(Icon, Rectangle) | निर्दिष्ट द्वारा दर्शाई गई छवि बनाता हैIcon छवि को स्केल किए बिना. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_6)(Image, Point) | निर्दिष्ट स्थान पर, इसके मूल भौतिक आकार का उपयोग करते हुए निर्दिष्ट छवि बनाता है। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_7)(Image, PointF) | निर्दिष्ट आरेखित करता हैImage निर्दिष्ट स्थान पर अपने मूल भौतिक आकार का उपयोग करते हुए. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_8)(Image, PointF[]) | निर्दिष्ट आरेखित करता हैImage निर्दिष्ट स्थान पर और निर्दिष्ट आकार और आकार के साथ। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_11)(Image, Point[]) | निर्दिष्ट आरेखित करता हैЕ:Image निर्दिष्ट स्थान पर और निर्दिष्ट आकार और आकार के साथ। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_14)(Image, Rectangle) | निर्दिष्ट छवि को निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ बनाता है। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_20)(Image, RectangleF) | निर्दिष्ट छवि को निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ बनाता है। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_3)(Image, float, float) | निर्दिष्ट आरेखित करता हैImage निर्दिष्ट स्थान पर अपने मूल भौतिक आकार का उपयोग करते हुए. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage)(Image, int, int) | एक निर्देशांक जोड़ी द्वारा निर्दिष्ट स्थान पर, अपने मूल भौतिक आकार का उपयोग करते हुए, निर्दिष्ट छवि बनाता है। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_9)(Image, PointF[], RectangleF, GraphicsUnit) | निर्दिष्ट छवि के निर्दिष्ट भाग को निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ बनाता है। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_12)(Image, Point[], Rectangle, GraphicsUnit) | निर्दिष्ट के निर्दिष्ट भाग को खींचता हैImage निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_19)(Image, Rectangle, Rectangle, GraphicsUnit) | निर्दिष्ट छवि के निर्दिष्ट भाग को निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ बनाता है। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_21)(Image, RectangleF, RectangleF, GraphicsUnit) | निर्दिष्ट छवि के निर्दिष्ट भाग को निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ बनाता है। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_4)(Image, float, float, float, float) | निर्दिष्ट आरेखित करता हैImage , निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ, अपने मूल भौतिक आकार का उपयोग करते हुए। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_5)(Image, float, float, RectangleF, GraphicsUnit) | एक निर्दिष्ट स्थान पर छवि का एक भाग बनाता है। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_1)(Image, int, int, int, int) | निर्दिष्ट छवि को निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ बनाता है। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_2)(Image, int, int, Rectangle, GraphicsUnit) | एक निर्दिष्ट स्थान पर छवि का एक भाग बनाता है। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_10)(Image, PointF[], RectangleF, GraphicsUnit, ImageAttributes) | निर्दिष्ट छवि के निर्दिष्ट भाग को निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ बनाता है। |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_13)(Image, Point[], Rectangle, GraphicsUnit, ImageAttributes) | निर्दिष्ट के निर्दिष्ट भाग को खींचता हैImage निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_17)(Image, Rectangle, float, float, float, float, GraphicsUnit) | निर्दिष्ट के निर्दिष्ट भाग को खींचता हैImage निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_15)(Image, Rectangle, int, int, int, int, GraphicsUnit) | निर्दिष्ट के निर्दिष्ट भाग को खींचता हैImage निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_18)(Image, Rectangle, float, float, float, float, GraphicsUnit, ImageAttributes) | निर्दिष्ट के निर्दिष्ट भाग को खींचता हैImage निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ. |
| [DrawImage](../../system.drawing/graphics/drawimage/#drawimage_16)(Image, Rectangle, int, int, int, int, GraphicsUnit, ImageAttributes) | निर्दिष्ट छवि के निर्दिष्ट भाग को निर्दिष्ट स्थान पर और निर्दिष्ट आकार के साथ बनाता है। |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_2)(Image, Point) | एक निर्दिष्ट स्थान पर अपने मूल भौतिक आकार का उपयोग करके एक निर्दिष्ट छवि बनाता है। |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_3)(Image, Rectangle) | एक निर्दिष्ट स्थान पर अपने मूल भौतिक आकार का उपयोग करके एक निर्दिष्ट छवि बनाता है। |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled)(Image, int, int) | एक निर्देशांक जोड़ी द्वारा निर्दिष्ट स्थान पर अपने मूल भौतिक आकार का उपयोग करके निर्दिष्ट छवि बनाता है। |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled/#drawimageunscaled_1)(Image, int, int, int, int) | एक निर्देशांक जोड़ी द्वारा निर्दिष्ट स्थान पर अपने मूल भौतिक आकार का उपयोग करके निर्दिष्ट छवि बनाता है। |
| [DrawImageUnscaledAndClipped](../../system.drawing/graphics/drawimageunscaledandclipped/)(Image, Rectangle) | निर्दिष्ट छवि को बिना स्केल किए बनाता है और निर्दिष्ट आयत में फिट होने के लिए, यदि आवश्यक हो, तो इसे क्लिप करता है। |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_2)(Pen, Point, Point) | दो को जोड़ने वाली एक रेखा खींचता हैPoint संरचनाएं. |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_3)(Pen, PointF, PointF) | दो पॉइंटएफ संरचनाओं को जोड़ने वाली रेखा खींचता है। |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline_1)(Pen, float, float, float, float) | निर्देशांक जोड़े द्वारा निर्दिष्ट दो बिंदुओं को जोड़ने वाली एक रेखा खींचता है। |
| [DrawLine](../../system.drawing/graphics/drawline/#drawline)(Pen, int, int, int, int) | निर्देशांक जोड़े द्वारा निर्दिष्ट दो बिंदुओं को जोड़ने वाली एक रेखा खींचता है। |
| [DrawLines](../../system.drawing/graphics/drawlines/#drawlines)(Pen, PointF[]) | एक सरणी को जोड़ने वाले रेखा खंडों की एक श्रृंखला बनाता हैPointF संरचनाएं. |
| [DrawLines](../../system.drawing/graphics/drawlines/#drawlines_1)(Pen, Point[]) | एक सरणी को जोड़ने वाले रेखा खंडों की एक श्रृंखला बनाता हैPoint संरचनाएं. |
| [DrawPath](../../system.drawing/graphics/drawpath/)(Pen, GraphicsPath) | एक ग्राफ़िक्सपाथ बनाता है. |
| [DrawPie](../../system.drawing/graphics/drawpie/#drawpie_1)(Pen, RectangleF, float, float) | आयतएफ संरचना और दो रेडियल रेखाओं द्वारा निर्दिष्ट दीर्घवृत्त द्वारा परिभाषित पाई आकार बनाता है। |
| [DrawPie](../../system.drawing/graphics/drawpie/#drawpie)(Pen, float, float, float, float, float, float) | एक समन्वय जोड़ी, चौड़ाई, ऊंचाई और दो रेडियल रेखाओं द्वारा निर्दिष्ट दीर्घवृत्त द्वारा परिभाषित एक पाई आकार बनाता है। |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon/#drawpolygon)(Pen, PointF[]) | पॉइंटएफ संरचनाओं की एक सरणी द्वारा परिभाषित बहुभुज बनाता है। |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon/#drawpolygon_1)(Pen, Point[]) | एक सरणी द्वारा परिभाषित बहुभुज बनाता हैPoint संरचनाएं. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle_2)(Pen, Rectangle) | आयत संरचना द्वारा निर्दिष्ट आयत बनाता है। |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle_1)(Pen, float, float, float, float) | एक निर्देशांक जोड़ी, एक चौड़ाई और एक ऊंचाई द्वारा निर्दिष्ट एक आयत बनाता है। |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle/#drawrectangle)(Pen, int, int, int, int) | एक निर्देशांक जोड़ी, एक चौड़ाई और एक ऊंचाई द्वारा निर्दिष्ट एक आयत बनाता है। |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles/#drawrectangles)(Pen, RectangleF[]) | निर्दिष्ट आयतों की एक श्रृंखला बनाता हैRectangleF संरचनाएं. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles/#drawrectangles_1)(Pen, Rectangle[]) | निर्दिष्ट आयतों की एक श्रृंखला बनाता हैRectangle संरचनाएं. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_2)(string, Font, Brush, PointF) | निर्दिष्ट पाठ स्ट्रिंग को निर्दिष्ट स्थान पर निर्दिष्ट के साथ आरेखित करता हैBrush औरFont वस्तुओं. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_4)(string, Font, Brush, RectangleF) | निर्दिष्ट पाठ स्ट्रिंग को निर्दिष्ट आयत में निर्दिष्ट के साथ आरेखित करता हैBrush औरFont निर्दिष्ट स्वरूपण विशेषताओं का उपयोग करके ऑब्जेक्टStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring)(string, Font, Brush, float, float) | निर्दिष्ट पाठ स्ट्रिंग को निर्दिष्ट स्थान पर निर्दिष्ट के साथ आरेखित करता हैBrush औरFont वस्तुओं. |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_3)(string, Font, Brush, PointF, StringFormat) | निर्दिष्ट पाठ स्ट्रिंग को निर्दिष्ट स्थान पर निर्दिष्ट के साथ आरेखित करता हैBrush और Font निर्दिष्ट स्वरूपण विशेषताओं का उपयोग करके ऑब्जेक्टStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_5)(string, Font, Brush, RectangleF, StringFormat) | निर्दिष्ट पाठ स्ट्रिंग को निर्दिष्ट आयत में निर्दिष्ट के साथ आरेखित करता हैBrush औरFont निर्दिष्ट स्वरूपण विशेषताओं का उपयोग करके ऑब्जेक्टStringFormat . |
| [DrawString](../../system.drawing/graphics/drawstring/#drawstring_1)(string, Font, Brush, float, float, StringFormat) | निर्दिष्ट पाठ स्ट्रिंग को निर्दिष्ट स्थान पर निर्दिष्ट के साथ आरेखित करता हैBrush और Font निर्दिष्ट स्वरूपण विशेषताओं का उपयोग करके ऑब्जेक्टStringFormat . |
| [EndContainer](../../system.drawing/graphics/endcontainer/)(GraphicsContainer) | वर्तमान ग्राफिक्स कंटेनर को बंद करता है और इसकी स्थिति को पुनर्स्थापित करता हैGraphics एक कॉल द्वारा बचाए गए राज्य के लिएBeginContainer विधि. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile)(Metafile, Point, EnumerateMetafileProc) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_6)(Metafile, PointF, EnumerateMetafileProc) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_12)(Metafile, PointF[], EnumerateMetafileProc) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_18)(Metafile, Point[], EnumerateMetafileProc) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_24)(Metafile, Rectangle, EnumerateMetafileProc) | निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_30)(Metafile, RectangleF, EnumerateMetafileProc) | निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_1)(Metafile, Point, EnumerateMetafileProc, IntPtr) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_7)(Metafile, PointF, EnumerateMetafileProc, IntPtr) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_13)(Metafile, PointF[], EnumerateMetafileProc, IntPtr) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_19)(Metafile, Point[], EnumerateMetafileProc, IntPtr) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_25)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) | निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_31)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) | निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_2)(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट बिंदु पर प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_3)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) | से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_8)(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट बिंदु पर प्रदर्शित करने के लिए कॉलबैक विधि पर एक समय में एक। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_9)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_14)(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_15)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) | एस से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_20)(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) | निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_21)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) | से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_26)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) | निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके एक निर्दिष्ट आयत में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_27)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) | से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_32)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) | निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके एक निर्दिष्ट आयत में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_33)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_4)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_10)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_16)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_22)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_28)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_34)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_5)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट बिंदु पर प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_11)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट बिंदु पर प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_17)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_23)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) , निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_29)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके एक निर्दिष्ट आयत में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक। |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile/#enumeratemetafile_35)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके एक निर्दिष्ट आयत में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक। |
| [ExcludeClip](../../system.drawing/graphics/excludeclip/#excludeclip)(Rectangle) | इसके क्लिप क्षेत्र को अपडेट करता हैGraphics ए द्वारा निर्दिष्ट क्षेत्र को बाहर करने के लिएRectangle |
| [ExcludeClip](../../system.drawing/graphics/excludeclip/#excludeclip_1)(Region) | इसके क्लिप क्षेत्र को अपडेट करता हैGraphics ए द्वारा निर्दिष्ट क्षेत्र को बाहर करने के लिएRegion . |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve)(Brush, PointF[]) | एक सरणी द्वारा परिभाषित एक बंद कार्डिनल स्पलाइन वक्र के इंटीरियर को भरता हैPointF संरचनाएं. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_3)(Brush, Point[]) | एक सरणी द्वारा परिभाषित एक बंद कार्डिनल स्पलाइन वक्र के इंटीरियर को भरता हैPoint संरचनाएं. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_1)(Brush, PointF[], FillMode) | एक सरणी द्वारा परिभाषित एक बंद कार्डिनल स्पलाइन वक्र के इंटीरियर को भरता हैPointF निर्दिष्ट भरण मोड का उपयोग कर संरचनाएं। |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_4)(Brush, Point[], FillMode) | एक सरणी द्वारा परिभाषित एक बंद कार्डिनल स्पलाइन वक्र के इंटीरियर को भरता हैPoint निर्दिष्ट भरण मोड का उपयोग कर संरचनाएं। |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_2)(Brush, PointF[], FillMode, float) | निर्दिष्ट भरण मोड और तनाव का उपयोग करके पॉइंटएफ संरचनाओं की एक सरणी द्वारा परिभाषित एक बंद कार्डिनल स्पलाइन वक्र के इंटीरियर को भरता है। |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve/#fillclosedcurve_5)(Brush, Point[], FillMode, float) | एक सरणी द्वारा परिभाषित एक बंद कार्डिनल स्पलाइन वक्र के इंटीरियर को भरता हैPoint निर्दिष्ट भरण मोड का उपयोग कर संरचनाएं। |
| [FillEllipse](../../system.drawing/graphics/fillellipse/#fillellipse_1)(Brush, RectangleF) | रेक्टेंगलएफ संरचना द्वारा निर्दिष्ट बाउंडिंग आयत द्वारा परिभाषित दीर्घवृत्त के आंतरिक भाग को भरता है। |
| [FillEllipse](../../system.drawing/graphics/fillellipse/#fillellipse)(Brush, float, float, float, float) | निर्देशांक, चौड़ाई और ऊंचाई की एक जोड़ी द्वारा निर्दिष्ट बाउंडिंग आयत द्वारा परिभाषित दीर्घवृत्त के आंतरिक भाग को भरता है। |
| [FillPath](../../system.drawing/graphics/fillpath/)(Brush, GraphicsPath) | ग्राफ़िक्सपाथ के आंतरिक भाग को भरता है. |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie_2)(Brush, Rectangle, float, float) | आयत संरचना और दो रेडियल रेखाओं द्वारा निर्दिष्ट दीर्घवृत्त द्वारा परिभाषित पाई अनुभाग के आंतरिक भाग को भरता है। |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie_1)(Brush, float, float, float, float, float, float) | निर्देशांकों की एक जोड़ी, एक चौड़ाई, एक ऊंचाई और दो रेडियल रेखाओं द्वारा निर्दिष्ट दीर्घवृत्त द्वारा परिभाषित पाई अनुभाग के आंतरिक भाग को भरता है। |
| [FillPie](../../system.drawing/graphics/fillpie/#fillpie)(Brush, int, int, int, int, int, int) | निर्देशांकों की एक जोड़ी, एक चौड़ाई, एक ऊंचाई और दो रेडियल रेखाओं द्वारा निर्दिष्ट दीर्घवृत्त द्वारा परिभाषित पाई अनुभाग के आंतरिक भाग को भरता है। |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon)(Brush, PointF[]) | द्वारा निर्दिष्ट बिंदुओं की एक सरणी द्वारा परिभाषित बहुभुज के आंतरिक भाग को भरता हैPointF संरचनाएं. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_2)(Brush, Point[]) | द्वारा निर्दिष्ट बिंदुओं की एक सरणी द्वारा परिभाषित बहुभुज के आंतरिक भाग को भरता हैPoint संरचनाएं. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_1)(Brush, PointF[], FillMode) | निर्दिष्ट भरण मोड का उपयोग करके पॉइंटएफ संरचनाओं द्वारा निर्दिष्ट बिंदुओं की एक सरणी द्वारा परिभाषित बहुभुज के आंतरिक भाग को भरता है। |
| [FillPolygon](../../system.drawing/graphics/fillpolygon/#fillpolygon_3)(Brush, Point[], FillMode) | द्वारा निर्दिष्ट बिंदुओं की एक सरणी द्वारा परिभाषित बहुभुज के आंतरिक भाग को भरता हैPoint निर्दिष्ट भरण मोड का उपयोग कर संरचनाएं। |
| [FillRectangle](../../system.drawing/graphics/fillrectangle/#fillrectangle_1)(Brush, RectangleF) | RectangleF संरचना द्वारा निर्दिष्ट आयत के आंतरिक भाग को भरता है। |
| [FillRectangle](../../system.drawing/graphics/fillrectangle/#fillrectangle)(Brush, float, float, float, float) | निर्देशांक, चौड़ाई और ऊंचाई की एक जोड़ी द्वारा निर्दिष्ट आयत के इंटीरियर को भरता है। |
| [FillRectangles](../../system.drawing/graphics/fillrectangles/#fillrectangles)(Brush, RectangleF[]) | द्वारा निर्दिष्ट आयतों की एक श्रृंखला के अंदरूनी हिस्सों को भरता हैRectangleF संरचनाएं. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles/#fillrectangles_1)(Brush, Rectangle[]) | द्वारा निर्दिष्ट आयतों की एक श्रृंखला के अंदरूनी हिस्सों को भरता हैRectangle संरचनाएं. |
| [FillRegion](../../system.drawing/graphics/fillregion/)(Brush, Region) | एक क्षेत्र के आंतरिक भाग को भरता है। |
| [Flush](../../system.drawing/graphics/flush/#flush)() | सभी लंबित ग्राफ़िक संचालनों को निष्पादित करने के लिए बाध्य करता है और संचालन समाप्त होने की प्रतीक्षा किए बिना तुरंत वापस आ जाता है। |
| [Flush](../../system.drawing/graphics/flush/#flush_1)(FlushIntention) | प्रतीक्षा या प्रतीक्षा न करने की विधि के साथ सभी लंबित ग्राफ़िक संचालनों के निष्पादन को बाध्य करता है, जैसा कि निर्दिष्ट है, संचालन समाप्त होने से पहले लौटने के लिए। |
| [GetHdc](../../system.drawing/graphics/gethdc/)() | इससे जुड़े डिवाइस कॉन्टेक्स्ट का हैंडल प्राप्त करता हैGraphics . |
| [GetNearestColor](../../system.drawing/graphics/getnearestcolor/)(Color) | निर्दिष्ट के निकटतम रंग प्राप्त करता हैColor संरचना. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip)(Rectangle) | इसके क्लिप क्षेत्र को अपडेट करता हैGraphics वर्तमान क्लिप क्षेत्र और निर्दिष्ट के चौराहे परRectangle संरचना. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip_1)(RectangleF) | इसके क्लिप क्षेत्र को अपडेट करता हैGraphics वर्तमान क्लिप क्षेत्र और निर्दिष्ट के चौराहे परRectangleF संरचना. |
| [IntersectClip](../../system.drawing/graphics/intersectclip/#intersectclip_2)(Region) | इसके क्लिप क्षेत्र को अपडेट करता हैGraphics वर्तमान क्लिप क्षेत्र और निर्दिष्ट के चौराहे परRegion . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_4)(Point) | निर्दिष्ट करता है कि निर्दिष्ट किया गया है या नहींPoint संरचना इसके दृश्य क्लिप क्षेत्र के भीतर समाहित हैGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_5)(PointF) | निर्दिष्ट करता है कि निर्दिष्ट किया गया है या नहींPointF संरचना इसके दृश्य क्लिप क्षेत्र के भीतर समाहित हैGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_6)(Rectangle) | इंगित करता है कि आयत a द्वारा निर्दिष्ट किया गया है या नहींRectangle संरचना इसके दृश्य क्लिप क्षेत्र के भीतर समाहित हैGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_7)(RectangleF) | इंगित करता है कि आयत a द्वारा निर्दिष्ट किया गया है या नहींRectangleF संरचना इसके दृश्य क्लिप क्षेत्र के भीतर समाहित हैGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_2)(float, float) | इंगित करता है कि निर्देशांक की एक जोड़ी द्वारा निर्दिष्ट बिंदु इस के दृश्य क्लिप क्षेत्र के भीतर समाहित है या नहींGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible)(int, int) | इंगित करता है कि निर्देशांक की एक जोड़ी द्वारा निर्दिष्ट बिंदु इस के दृश्य क्लिप क्षेत्र के भीतर समाहित है या नहींGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_3)(float, float, float, float) | इंगित करता है कि निर्देशांक की एक जोड़ी, चौड़ाई और ऊंचाई द्वारा निर्दिष्ट आयत इस के दृश्य क्लिप क्षेत्र के भीतर समाहित है या नहींGraphics . |
| [IsVisible](../../system.drawing/graphics/isvisible/#isvisible_1)(int, int, int, int) | इंगित करता है कि निर्देशांक की एक जोड़ी, चौड़ाई और ऊंचाई द्वारा निर्दिष्ट आयत इस के दृश्य क्लिप क्षेत्र के भीतर समाहित है या नहींGraphics . |
| [MeasureCharacterRanges](../../system.drawing/graphics/measurecharacterranges/)(string, Font, RectangleF, StringFormat) | की एक सरणी प्राप्त करता हैRegion ऑब्जेक्ट्स, जिनमें से प्रत्येक निर्दिष्ट स्ट्रिंग के भीतर वर्ण पदों की एक सीमा को सीमित करता है। |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring)(string, Font) | निर्दिष्ट के साथ खींचे जाने पर निर्दिष्ट स्ट्रिंग को मापता हैFont . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_1)(string, Font, int) | निर्दिष्ट के साथ खींचे जाने पर निर्दिष्ट स्ट्रिंग को मापता हैFont . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_4)(string, Font, SizeF) | निर्दिष्ट के साथ खींचे जाने पर निर्दिष्ट स्ट्रिंग को मापता हैFont . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_2)(string, Font, int, StringFormat) | निर्दिष्ट के साथ खींचे जाने पर निर्दिष्ट स्ट्रिंग को मापता हैFont और निर्दिष्ट के साथ स्वरूपित StringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_3)(string, Font, PointF, StringFormat) | निर्दिष्ट के साथ खींचे जाने पर निर्दिष्ट स्ट्रिंग को मापता हैFont और निर्दिष्ट के साथ स्वरूपित StringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_5)(string, Font, SizeF, StringFormat) | निर्दिष्ट के साथ खींचे जाने पर निर्दिष्ट स्ट्रिंग को मापता हैFont और निर्दिष्ट के साथ स्वरूपित StringFormat . |
| [MeasureString](../../system.drawing/graphics/measurestring/#measurestring_6)(string, Font, SizeF, StringFormat, out int, out int) | निर्दिष्ट के साथ खींचे जाने पर निर्दिष्ट स्ट्रिंग को मापता हैFont और निर्दिष्ट के साथ स्वरूपित StringFormat . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform/#multiplytransform)(Matrix) | इसके विश्व परिवर्तन को गुणा करता हैGraphics और निर्दिष्ट कियाMatrix . |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | इसके विश्व परिवर्तन को गुणा करता हैGraphics और निर्दिष्ट Matrix निर्दिष्ट क्रम में. |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc/#releasehdc)() | को को पिछली कॉल द्वारा प्राप्त डिवाइस संदर्भ हैंडल जारी करता हैGetHdc इसका तरीकाGraphics . |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc/#releasehdc_1)(IntPtr) | को पिछले कॉल द्वारा प्राप्त डिवाइस कॉन्टेक्स्ट हैंडल को रिलीज़ करता हैGetHdc इसका method Graphics . |
| [ResetClip](../../system.drawing/graphics/resetclip/)() | इसके क्लिप क्षेत्र को रीसेट करता हैGraphics एक अनंत क्षेत्र के लिए. |
| [ResetTransform](../../system.drawing/graphics/resettransform/)() | इसके विश्व परिवर्तन मैट्रिक्स को रीसेट करता हैGraphics पहचान मैट्रिक्स के लिए। |
| [Restore](../../system.drawing/graphics/restore/)(GraphicsState) | इसकी स्थिति को पुनर्स्थापित करता है`Graphics` एक द्वारा प्रतिनिधित्व राज्य के लिए[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate/) . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform/#rotatetransform)(float) | निर्दिष्ट रोटेशन को इसके रूपांतरण मैट्रिक्स पर लागू करता हैGraphics . |
| [RotateTransform](../../system.drawing/graphics/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | निर्दिष्ट रोटेशन को इसके रूपांतरण मैट्रिक्स पर लागू करता हैGraphics निर्दिष्ट क्रम में. |
| [Save](../../system.drawing/graphics/save/)() | इसकी वर्तमान स्थिति को सहेजता है`Graphics` और सहेजे गए राज्य को ए के साथ पहचानता है[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate/) . |
| [ScaleTransform](../../system.drawing/graphics/scaletransform/#scaletransform)(float, float) | निर्दिष्ट स्केलिंग ऑपरेशन को इसके परिवर्तन मैट्रिक्स पर लागू करता हैGraphics वस्तु के परिवर्तन मैट्रिक्स के लिए it को जोड़कर। |
| [ScaleTransform](../../system.drawing/graphics/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | निर्दिष्ट स्केलिंग ऑपरेशन को इसके परिवर्तन मैट्रिक्स पर लागू करता हैGraphics निर्दिष्ट क्रम में. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_2)(Graphics) | इसका क्लिपिंग क्षेत्र सेट करता है`Graphics` निर्दिष्ट की क्लिप संपत्ति के लिए`Graphics` |
| [SetClip](../../system.drawing/graphics/setclip/#setclip)(GraphicsPath) | इसका क्लिपिंग क्षेत्र सेट करता है`Graphics` निर्दिष्ट करने के लिए[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath/) . |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_4)(Rectangle) | इसका क्लिपिंग क्षेत्र सेट करता है`Graphics` वर्तमान क्लिप क्षेत्र और a द्वारा निर्दिष्ट आयत के संयोजन के निर्दिष्ट ऑपरेशन के परिणाम के लिए[`Rectangle`](../rectangle/) संरचना. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_6)(RectangleF) | इसका क्लिपिंग क्षेत्र सेट करता है`Graphics` वर्तमान क्लिप क्षेत्र और a द्वारा निर्दिष्ट आयत के संयोजन के निर्दिष्ट ऑपरेशन के परिणाम के लिए[`RectangleF`](../rectanglef/) संरचना. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_3)(Graphics, CombineMode) | इसका क्लिपिंग क्षेत्र सेट करता है`Graphics` वर्तमान क्लिप क्षेत्र के निर्दिष्ट संयोजन संचालन और निर्दिष्ट की क्लिप संपत्ति के परिणाम के लिए`Graphics` . |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_1)(GraphicsPath, CombineMode) | इसका क्लिपिंग क्षेत्र सेट करता है`Graphics` वर्तमान क्लिप क्षेत्र और निर्दिष्ट के संयोजन के निर्दिष्ट ऑपरेशन के परिणाम के लिए[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath/) . |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_5)(Rectangle, CombineMode) | इसका क्लिपिंग क्षेत्र सेट करता है`Graphics` वर्तमान क्लिप क्षेत्र और a द्वारा निर्दिष्ट आयत के संयोजन के निर्दिष्ट ऑपरेशन के परिणाम के लिए[`Rectangle`](../rectangle/) संरचना. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_7)(RectangleF, CombineMode) | इसका क्लिपिंग क्षेत्र सेट करता है`Graphics` वर्तमान क्लिप क्षेत्र और a द्वारा निर्दिष्ट आयत के संयोजन के निर्दिष्ट ऑपरेशन के परिणाम के लिए[`RectangleF`](../rectanglef/) संरचना. |
| [SetClip](../../system.drawing/graphics/setclip/#setclip_8)(Region, CombineMode) | इसका क्लिपिंग क्षेत्र सेट करता हैGraphicsनिर्दिष्ट ऑपरेशन के परिणाम के लिए संयोजन वर्तमान क्लिप क्षेत्र और निर्दिष्टRegion . |
| [TransformPoints](../../system.drawing/graphics/transformpoints/#transformpoints)(CoordinateSpace, CoordinateSpace, PointF[]) | वर्तमान दुनिया और इसके पृष्ठ परिवर्तनों का उपयोग करके एक समन्वय स्थान से दूसरे में बिंदुओं की एक सरणी को रूपांतरित करता हैGraphics . |
| [TransformPoints](../../system.drawing/graphics/transformpoints/#transformpoints_1)(CoordinateSpace, CoordinateSpace, Point[]) | वर्तमान दुनिया और इसके पृष्ठ परिवर्तनों का उपयोग करके एक समन्वय स्थान से दूसरे में बिंदुओं की एक सरणी को रूपांतरित करता हैGraphics . |
| [TranslateClip](../../system.drawing/graphics/translateclip/#translateclip_1)(float, float) | इसके क्लिपिंग क्षेत्र का अनुवाद करता हैGraphics क्षैतिज और लंबवत दिशाओं में निर्दिष्ट मात्रा द्वारा। |
| [TranslateClip](../../system.drawing/graphics/translateclip/#translateclip)(int, int) | इसके क्लिपिंग क्षेत्र का अनुवाद करता हैGraphics क्षैतिज और लंबवत दिशाओं में निर्दिष्ट मात्रा द्वारा। |
| [TranslateTransform](../../system.drawing/graphics/translatetransform/#translatetransform)(float, float) | इस के परिवर्तन मैट्रिक्स में निर्दिष्ट अनुवाद को जोड़कर समन्वय प्रणाली की उत्पत्ति को बदलता हैGraphics . |
| [TranslateTransform](../../system.drawing/graphics/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | इस के परिवर्तन मैट्रिक्स में निर्दिष्ट अनुवाद को लागू करके समन्वय प्रणाली की उत्पत्ति को बदलता हैGraphics निर्दिष्ट क्रम में. |

## अन्य सदस्य

| नाम | विवरण |
| --- | --- |
| delegate [DrawImageAbort](graphics.drawimageabort/) | कब तय करने के लिए कॉलबैक विधि प्रदान करता है[`DrawImage`](./drawimage/) विधि को समय से पहले निष्पादन रद्द कर देना चाहिए और एक छवि बनाना बंद कर देना चाहिए। |
| delegate [EnumerateMetafileProc](graphics.enumeratemetafileproc/) | के लिए एक कॉलबैक विधि प्रदान करता है[`EnumerateMetafile`](./enumeratemetafile/) तरीका। |

### यह सभी देखें

* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


