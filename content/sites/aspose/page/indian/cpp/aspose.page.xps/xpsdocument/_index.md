---
title: "Aspose::Page::XPS::XpsDocument क्लास"
linktitle: "XpsDocument"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsDocument क्लास। क्लास जो XPS दस्तावेज़ की मुख्य इकाई को समाहित करता है और C++ में किसी भी XPS तत्व के लिए हेरफेर विधियां प्रदान करता है।"
type: docs
weight: 400
url: /hi/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


क्लास जो [XPS](../) दस्तावेज़ की मुख्य इकाई को समाहित करता है और किसी भी [XPS](../) तत्व के लिए हेरफेर विधियां प्रदान करता है।

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(T) | एक सामग्री तत्व (Canvas, Path, या Glyphs) जोड़ता है। |
| [AddCanvas](./addcanvas/)() | सक्रिय पृष्ठ में एक नया कैनवास जोड़ता है। |
| [AddDocument](./adddocument/)(bool) | डिफ़ॉल्ट पृष्ठ आकार के साथ एक खाली दस्तावेज़ जोड़ता है। |
| [AddDocument](./adddocument/)(float, float, bool) | पहले पृष्ठ के आयाम *width* और *height* के साथ एक खाली दस्तावेज़ जोड़ता है। |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | सक्रिय पृष्ठ में नए ग्लिफ़ जोड़ता है। |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | सक्रिय पृष्ठ में नए ग्लिफ़ जोड़ता है। |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | दस्तावेज़ में एक रूपरेखा प्रविष्टि जोड़ता है। |
| [AddPage](./addpage/)(bool) | डिफ़ॉल्ट पृष्ठ आकार के साथ दस्तावेज़ में एक खाली पृष्ठ जोड़ता है। |
| [AddPage](./addpage/)(float, float, bool) | निर्दिष्ट *width* और *height* के साथ दस्तावेज़ में एक खाली पृष्ठ जोड़ता है। |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | दस्तावेज़ में एक पृष्ठ जोड़ता है। |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | सक्रिय पृष्ठ में एक नया पथ जोड़ता है। |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | एक नया दीर्घवृत्तीय चाप खंड बनाता है। |
| [CreateCanvas](./createcanvas/)() | एक नया कैनवास बनाता है। |
| [CreateColor](./createcolor/)(System::Drawing::Color) | एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | sRGB रंग स्थान में एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | sRGB रंग स्थान में एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(float, float, float, float) | scRGB रंग स्थान में एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(float, float, float) | scRGB रंग स्थान में एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | ICC-आधारित रंग स्थान में एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | ICC-आधारित रंग स्थान में एक नया रंग बनाता है। |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | एक नया **TrueType** फ़ॉन्ट संसाधन बनाता है। |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | स्ट्रीम से एक नया **TrueType** फ़ॉन्ट संसाधन बनाता है। |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | नए Glyphs बनाता है। |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | नए Glyphs बनाता है। |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | एक नया ग्रेडिएंट स्टॉप बनाता है। |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | एक नया ग्रेडिएंट स्टॉप बनाता है। |
| [CreateIccProfile](./createiccprofile/)(System::String) | *iccProfilePath* पर स्थित ICC प्रोफ़ाइल फ़ाइल से एक नया ICC प्रोफ़ाइल संसाधन बनाता है। |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | *stream* से एक नया ICC प्रोफ़ाइल संसाधन बनाता है। |
| [CreateImage](./createimage/)(System::String) | *imagePath* पर स्थित इमेज फ़ाइल से एक नया इमेज संसाधन बनाता है। |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | *stream* से एक नया इमेज संसाधन बनाता है। |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | एक नया इमेज ब्रश बनाता है। |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | एक नया इमेज ब्रश बनाता है। |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | एक नया लीनियर ग्रेडिएंट ब्रश बनाता है। |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | एक नया लीनियर ग्रेडिएंट ब्रश बनाता है। |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | एक नया अफ़ाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स बनाता है। |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | एक नया पाथ बनाता है। |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | एक नया पाथ फ़िगर बनाता है। |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | एक नया पाथ फ़िगर बनाता है। |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | संक्षिप्त रूप में निर्दिष्ट एक नया पाथ जियोमेट्री बनाता है। |
| [CreatePathGeometry](./createpathgeometry/)() | एक नया पाथ जियोमेट्री बनाता है। |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | निर्दिष्ट पाथ फ़िगर्स की सूची के साथ एक नया पाथ जियोमेट्री बनाता है। |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | क्यूबिक बीज़ियर कर्व्स का एक नया सेट बनाता है। |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | व्यक्तिगत वर्टिसेज़ की मनमानी संख्या वाले एक नया पॉलीगॉनल ड्राइंग बनाता है। |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | पाथ फ़िगर में पिछले बिंदु से वर्टिसेज़ के सेट के माध्यम से, निर्दिष्ट कंट्रोल पॉइंट्स का उपयोग करके, क्वाड्रेटिक बीज़ियर कर्व्स का एक नया सेट बनाता है। |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | एक नया रेडियल ग्रेडिएंट ब्रश बनाता है। |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | एक नया रेडियल ग्रेडिएंट ब्रश बनाता है। |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | एक नया सॉलिड कलर ब्रश बनाता है। |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | एक नया सॉलिड कलर ब्रश बनाता है। |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | एक नया विज़ुअल ब्रश बनाता है। |
| [Dispose](./dispose/)() override | इंस्टेंस को नष्ट करता है। |
| [get_ActiveDocument](./get_activedocument/)() | सक्रिय दस्तावेज़ संख्या प्राप्त करता है। |
| [get_ActivePage](./get_activepage/)() | सक्रिय दस्तावेज़ के भीतर सक्रिय पृष्ठ संख्या प्राप्त करता है। |
| [get_DocumentCount](./get_documentcount/)() | [XPS](../) पैकेज के भीतर दस्तावेज़ों की संख्या लौटाता है। |
| [get_JobPrintTicket](./get_jobprintticket/)() | दस्तावेज़ के जॉब प्रिंट टिकट को लौटाता/सेट करता है। |
| [get_Page](./get_page/)() | सक्रिय पृष्ठ के लिए एक [XpsPage](../) इंस्टेंस लौटाता है। |
| [get_PageCount](./get_pagecount/)() | सक्रिय दस्तावेज़ में पेजों की संख्या रिटर्न करता है। |
| [get_TotalPageCount](./get_totalpagecount/)() | [XPS](../) दस्तावेज़ के भीतर सभी दस्तावेज़ों में कुल पृष्ठों की संख्या लौटाता है। |
| [get_Utils](./get_utils/)() const | वह ऑब्जेक्ट प्राप्त करता है जो औपचारिक [XPS](../) हेरफेर API से परे उपयोगिताएँ प्रदान करता है। |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | दस्तावेज़ जिसे *documentIndex* द्वारा अनुक्रमित किया गया है, उसका प्रिंट टिकट लौटाता है। |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | दस्तावेज़ जिसे *documentIndex* द्वारा अनुक्रमित किया गया है, उसमें *pageIndex* द्वारा अनुक्रमित पृष्ठ का प्रिंट टिकट लौटाता है। |
| [Insert](./insert/)(int32_t, T) | *index* स्थिति पर सक्रिय पृष्ठ में एक तत्व (Canvas, Path, या Glyphs) सम्मिलित करता है। |
| [InsertCanvas](./insertcanvas/)(int32_t) | *index* स्थिति पर सक्रिय पृष्ठ में एक नया कैनवास सम्मिलित करता है। |
| [InsertDocument](./insertdocument/)(int32_t, bool) | *index* स्थिति पर डिफ़ॉल्ट पृष्ठ आकार के साथ एक खाली दस्तावेज़ सम्मिलित करता है। |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | *index* स्थिति पर पहली पृष्ठ की आयाम *width* और *height* के साथ एक खाली दस्तावेज़ सम्मिलित करता है। |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | *index* स्थिति पर सक्रिय पृष्ठ में नए ग्लिफ़्स सम्मिलित करता है। |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | *index* स्थिति पर सक्रिय पृष्ठ में नए ग्लिफ़्स सम्मिलित करता है। |
| [InsertPage](./insertpage/)(int32_t, bool) | *index* स्थिति पर डिफ़ॉल्ट पृष्ठ आकार के साथ दस्तावेज़ में एक खाली पृष्ठ सम्मिलित करता है। |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | *index* स्थिति पर निर्दिष्ट *width* और *height* के साथ दस्तावेज़ में एक खाली पृष्ठ सम्मिलित करता है। |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | *index* स्थिति पर दस्तावेज़ में एक पृष्ठ सम्मिलित करता है। |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | *index* स्थिति पर सक्रिय पृष्ठ में एक नया पाथ सम्मिलित करता है। |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | कई [XPS](../) फ़ाइलों को एक [XPS](../) दस्तावेज़ में मिलाया जा रहा है। |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | कई [XPS](../) फ़ाइलों को एक [XPS](../) दस्तावेज़ में मिलाया जा रहा है। |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | [Device](../) इंस्टेंस का उपयोग करके [XPS](../) दस्तावेज़ों को PDF में मिलाया जा रहा है। |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | [Device](../) इंस्टेंस का उपयोग करके [XPS](../) दस्तावेज़ों को PDF में मिलाया जा रहा है। |
| [Remove](./remove/)(T) | सक्रिय पृष्ठ से एक तत्व हटाता है। |
| [RemoveAt](./removeat/)(int32_t) | सक्रिय पृष्ठ से *index* स्थिति पर एक तत्व हटाता है। |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | *index* स्थिति पर एक दस्तावेज़ हटाता है। |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | दस्तावेज़ से एक पृष्ठ हटाता है। |
| [RemovePageAt](./removepageat/)(int32_t) | दस्तावेज़ से *index* स्थिति पर एक पृष्ठ हटाता है। |
| [Save](./save/)(System::String) | [XPS](../) दस्तावेज़ को *path* पर स्थित [XPS](../) फ़ाइल में सहेजता है। |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | [XPS](../) दस्तावेज़ को स्ट्रीम में सहेजता है। |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | दस्तावेज़ को इमेज फ़ाइल में सहेजता है। आउटपुट डायरेक्टरी और फ़ाइल नाम इनपुट [XPS](../) फ़ाइल के समान होंगे। फ़ाइल एक्सटेंशन "options" पैरामीटर में निर्दिष्ट इमेज फ़ॉर्मेट के अनुरूप होगा। यदि दस्तावेज़ को ऐसी स्ट्रीम से प्रारंभ किया गया था जो FileStream नहीं है, तो इमेज फ़ाइल वर्तमान फ़ोल्डर में डिफ़ॉल्ट फ़ाइल नाम टेम्पलेट के साथ सहेजी जाएगी। |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | दस्तावेज़ को निर्दिष्ट डायरेक्टरी में निर्दिष्ट फ़ाइल नाम के साथ इमेज फ़ाइल में सहेजता है। फ़ाइल एक्सटेंशन "options" पैरामीटर में निर्दिष्ट इमेज फ़ॉर्मेट के अनुरूप होगा। |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | दस्तावेज़ को बिटमैप इमेज फ़ॉर्मेट में बाइट्स एरे के रूप में सहेजता है। |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | दस्तावेज़ को PDF फ़ॉर्मेट में सहेजता है। |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | दस्तावेज़ को PDF फ़ॉर्मेट में सहेजता है। |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | दस्तावेज़ को PS फ़ॉर्मेट में सहेजता है। |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | दस्तावेज़ को PS फ़ॉर्मेट में सहेजता है। |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | संपादन के लिए एक सक्रिय दस्तावेज़ चुनता है। |
| [SelectActivePage](./selectactivepage/)(int32_t) | संपादन के लिए एक सक्रिय दस्तावेज़ पृष्ठ चुनता है। |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | दस्तावेज़ के जॉब प्रिंट टिकट को लौटाता/सेट करता है। |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | *printTicket* को *documentIndex* द्वारा अनुक्रमित दस्तावेज़ से लिंक करता है। |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | *printTicket* को *documentIndex* द्वारा अनुक्रमित दस्तावेज़ में *pageIndex* द्वारा अनुक्रमित पृष्ठ से लिंक करता है। |
| [XpsDocument](./xpsdocument/)() | डिफ़ॉल्ट पृष्ठ आकार के साथ खाली [XPS](../) दस्तावेज़ बनाता है। |
| [XpsDocument](./xpsdocument/)(System::String) | *path* पर स्थित मौजूदा [XPS](../) दस्तावेज़ खोलता है। |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | *path* पर स्थित मौजूदा दस्तावेज़ को [XPS](../) दस्तावेज़ के रूप में खोलता है। |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | *stream* में संग्रहीत मौजूदा दस्तावेज़ को [XPS](../) दस्तावेज़ के रूप में लोड करता है। |
## संबंधित देखें

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
