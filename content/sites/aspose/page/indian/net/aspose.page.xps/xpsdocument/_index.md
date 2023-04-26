---
title: Class XpsDocument
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsDocument कक्ष. XPS दस्तवेज़ क मुख्य इकई क समहत करने वल वर्ग ज कस भ XPS तत्व के लए हेरफेर वधयँ प्रदन करत है
type: docs
weight: 480
url: /hi/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

XPS दस्तावेज़ की मुख्य इकाई को समाहित करने वाला वर्ग जो किसी भी XPS तत्व के लिए हेरफेर विधियाँ प्रदान करता है।

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | डिफ़ॉल्ट पृष्ठ आकार के साथ खाली XPS दस्तावेज़ बनाता है। |
| [XpsDocument](xpsdocument/#constructor_2)(string) | स्थित एक मौजूदा XPS दस्तावेज़ खोलता है*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | इसमें संग्रहीत मौजूदा दस्तावेज़ को लोड करता है*stream* XPS दस्तावेज़ के रूप में. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | पर स्थित एक मौजूदा दस्तावेज़ खोलता है*path* XPS दस्तावेज़ के रूप में. |

## गुण

| नाम | विवरण |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | सक्रिय दस्तावेज़ संख्या प्राप्त करता है। |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | सक्रिय दस्तावेज़ के भीतर सक्रिय पृष्ठ संख्या प्राप्त करता है। |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | XPS पैकेज के अंदर दस्तावेजों की संख्या लौटाता है। |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | दस्तावेज़ का जॉब प्रिंट टिकट लौटाता/सेट करता है |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | एक देता है[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) सक्रिय पृष्ठ के लिए उदाहरण. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | सक्रिय दस्तावेज़ में पृष्ठों की संख्या लौटाता है। |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | XPS दस्तावेज़ के अंदर सभी दस्तावेज़ों में पृष्ठों की कुल संख्या लौटाता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | एक सामग्री तत्व जोड़ता है (कैनवास, पथ या ग्लिफ़) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | सक्रिय पृष्ठ में एक नया कैनवास जोड़ता है। |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | डिफ़ॉल्ट पृष्ठ आकार के साथ एक खाली दस्तावेज़ जोड़ता है. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | प्रथम पृष्ठ आयाम के साथ एक खाली दस्तावेज़ जोड़ता है*width* और*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | सक्रिय पेज में नए ग्लिफ़ जोड़ता है. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | सक्रिय पेज में नए ग्लिफ़ जोड़ता है. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | दस्तावेज़ में एक रूपरेखा प्रविष्टि जोड़ता है। |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | दस्तावेज़ में डिफ़ॉल्ट पृष्ठ आकार के साथ एक खाली पृष्ठ जोड़ता है. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | दस्तावेज़ में एक पृष्ठ जोड़ता है। |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | निर्दिष्ट के साथ दस्तावेज़ में एक खाली पृष्ठ जोड़ता है*width* और*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | सक्रिय पृष्ठ पर एक नया पथ जोड़ता है. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | एक नया अण्डाकार चाप खंड बनाता है। |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | एक नया कैनवास बनाता है। |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | एक नया रंग बनाता है। |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | ICC आधारित कलर स्पेस में एक नया रंग बनाता है। |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | ICC आधारित कलर स्पेस में एक नया रंग बनाता है। |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | scRGB कलर स्पेस में एक नया रंग बनाता है। |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | sRGB कलर स्पेस में एक नया रंग बनाता है। |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | scRGB कलर स्पेस में एक नया रंग बनाता है। |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | sRGB कलर स्पेस में एक नया रंग बनाता है। |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | स्ट्रीम से बाहर एक नया ट्रू टाइप फ़ॉन्ट संसाधन बनाता है. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | एक नया ट्रू टाइप फ़ॉन्ट संसाधन बनाता है। |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | नए ग्लिफ बनाता है। |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | नए ग्लिफ बनाता है। |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | एक नया ग्रेडिएंट स्टॉप बनाता है। |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | एक नया ग्रेडिएंट स्टॉप बनाता है। |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | इससे एक नया ICC प्रोफ़ाइल संसाधन बनाता है*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | पर स्थित ICC प्रोफ़ाइल फ़ाइल से एक नया ICC प्रोफ़ाइल संसाधन बनाता है*iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | इससे एक नया छवि संसाधन बनाता है*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | स्थित छवि फ़ाइल से एक नया छवि संसाधन बनाता है*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | एक नया इमेज ब्रश बनाता है। |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | एक नया इमेज ब्रश बनाता है। |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | एक नया लीनियर ग्रेडिएंट ब्रश बनाता है। |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | एक नया लीनियर ग्रेडिएंट ब्रश बनाता है। |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | एक नया एफ़िन रूपांतरण मैट्रिक्स बनाता है। |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | एक नया पथ बनाता है। |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | एक नया पथ आंकड़ा बनाता है। |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | एक नया पथ आंकड़ा बनाता है। |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | एक नया पथ ज्यामिति बनाता है। |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | पथ आकृतियों की निर्दिष्ट सूची के साथ एक नया पथ ज्यामिति बनाता है। |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | संक्षिप्त रूप से निर्दिष्ट एक नया पथ ज्यामिति बनाता है। |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | क्यूबिक बेज़ियर कर्व्स का एक नया सेट बनाता है। |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | एक नया बहुभुज चित्र बनाता है जिसमें अलग-अलग शीर्षों की मनमानी संख्या होती है। |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | निर्दिष्ट नियंत्रण बिंदुओं का उपयोग करते हुए, शीर्षों के एक सेट के माध्यम से पथ आकृति में पिछले बिंदु से द्विघात बेजियर वक्र का एक नया सेट बनाता है। |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | एक नया रेडियल ग्रेडिएंट ब्रश बनाता है। |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | एक नया रेडियल ग्रेडिएंट ब्रश बनाता है। |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | एक नया ठोस रंग ब्रश बनाता है। |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | एक नया ठोस रंग ब्रश बनाता है। |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | एक नया विजुअल ब्रश बनाता है। |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | उदाहरण का निपटान करता है। |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | द्वारा अनुक्रमित दस्तावेज़ का प्रिंट टिकट लौटाता है*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | द्वारा अनुक्रमित पृष्ठ का प्रिंट टिकट लौटाता है*pageIndex* द्वारा अनुक्रमित दस्तावेज़ में*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | सक्रिय पृष्ठ पर एक तत्व (कैनवास, पथ या ग्लिफ़) सम्मिलित करता है*index* स्थिति. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | पर सक्रिय पृष्ठ पर एक नया कैनवास सम्मिलित करता है*index* स्थिति. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | डिफ़ॉल्ट पृष्ठ आकार के साथ एक खाली दस्तावेज़ सम्मिलित करता है*index* स्थिति. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | प्रथम पृष्ठ आयामों के साथ एक खाली दस्तावेज़ सम्मिलित करता है *width* और*height* पर*index* स्थिति. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | पर सक्रिय पृष्ठ में नए ग्लिफ़ सम्मिलित करता है*index* स्थिति. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | पर सक्रिय पृष्ठ में नए ग्लिफ़ सम्मिलित करता है*index* स्थिति. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | डिफ़ॉल्ट पृष्ठ आकार के साथ दस्तावेज़ में एक खाली पृष्ठ सम्मिलित करता है*index* स्थिति. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | पर दस्तावेज़ में एक पृष्ठ सम्मिलित करता है*index* स्थिति. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | निर्दिष्ट के साथ दस्तावेज़ में एक खाली पृष्ठ सम्मिलित करता है*width* और*height* पर*index* स्थिति. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | पर सक्रिय पृष्ठ के लिए एक नया पथ सम्मिलित करता है*index* स्थिति. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | कई XPS फ़ाइलों को एक XPS दस्तावेज़ में विलय करना। |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | का उपयोग करके XPS दस्तावेज़ों को PDF में मर्ज करना[`Device`](../../aspose.page/device/) उदाहरण. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | सक्रिय पृष्ठ से एक तत्व को हटाता है। |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | एक तत्व को हटाता है*index* सक्रिय पृष्ठ से स्थिति. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | पर एक दस्तावेज़ निकालता है*index* स्थिति. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | दस्तावेज़ से एक पृष्ठ निकालता है। |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | पर दस्तावेज़ से एक पृष्ठ निकालता है*index* स्थिति. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | XPS दस्तावेज़ को स्ट्रीम करने के लिए सहेजता है। |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | पर स्थित XPS फ़ाइल में XPS दस्तावेज़ सहेजता है*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | का उपयोग करके दस्तावेज़ को सहेजता है[`Device`](../../aspose.page/device/) उदाहरण. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | संपादन के लिए एक सक्रिय दस्तावेज़ का चयन करता है। |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | संपादन के लिए एक सक्रिय दस्तावेज़ पृष्ठ का चयन करता है। |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | लिंक करता है*printTicket* द्वारा अनुक्रमित दस्तावेज़ के लिए*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | लिंक करता है*printTicket* द्वारा अनुक्रमित पृष्ठ के लिए*pageIndex* द्वारा अनुक्रमित दस्तावेज़ में*documentIndex* . |

### यह सभी देखें

* class [Document](../../aspose.page/document/)
* नाम स्थान [Aspose.Page.XPS](../../aspose.page.xps/)
* सभा [Aspose.Page](../../)


