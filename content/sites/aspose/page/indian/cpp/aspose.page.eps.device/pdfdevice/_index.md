---
title: "Aspose::Page::EPS::Device::PdfDevice क्लास"
linktitle: "PdfDevice"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::Device::PdfDevice क्लास। यह क्लास C++ में दस्तावेज़ को PDF में रेंडर करने को संलग्न करती है।"
type: docs
weight: 300
url: /hi/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


यह क्लास दस्तावेज़ को PDF में रेंडर करने को संलग्न करती है।

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [AUTHOR](./author/)() | \"Author\" प्रॉपर्टी मान। |
| static [BACKGROUND](./background/)() | \"Background\" प्रॉपर्टी कुंजी। |
| static [BACKGROUND_COLOR](./background_color/)() | \"Background color\" प्रॉपर्टी कुंजी। |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | दिए गए आकार का उपयोग करके क्लिप करता है। यह writeClip(Rectangle), writeClip(RectangleF) या writeClip(Shape) को डिस्पैच करता है। |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | आयत को क्लिप करता है। यह clip(Rectangle2D) को कॉल करता है। |
| [ClosePage](./closepage/)() override | पृष्ठ रेंडर होने के बाद डिवाइस की आवश्यक तैयारी करता है। |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | \"Compress\" प्रॉपर्टी कुंजी। |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | इस डिवाइस की एक कॉपी बनाता है। |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | ग्राफ़िक्स कॉन्टेक्स्ट को डिस्पोज़ करता है। यदि निर्माण पर restoreOnDispose सत्य था, तो writeGraphicsRestore() को कॉल किया जाएगा। |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | एक पाथ ड्रॉ करता है। |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | निर्धारित ट्रांसफ़ॉर्म और बैकग्राउंड के साथ एक इमेज ड्रॉ करता है। |
| [DrawString](./drawstring/)(System::String, double, double) override | दिए गए बिंदु पर एक स्ट्रिंग ड्रॉ करता है। |
| static [EMBED_FONTS](./embed_fonts/)() | \"Embed font in document\" प्रॉपर्टी कुंजी। |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | \"What font type is used for embedding\" प्रॉपर्टी कुंजी। |
| static [EMIT_ERRORS](./emit_errors/)() | \"Emit errors\" प्रॉपर्टी मान। |
| static [EMIT_WARNINGS](./emit_warnings/)() | \"Emit warnings\" प्रॉपर्टी मान। |
| [EndDocument](./enddocument/)() override | दस्तावेज़ रेंडर होने के बाद डिवाइस की आवश्यक तैयारी करता है। |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | एक पाथ को भरता है। |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | \"Fit content to page\" प्रॉपर्टी कुंजी। |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | वर्तमान पृष्ठ संख्या। |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | एक स्ट्रिंग के चारों ओर फ्रेम और बैनर ड्रॉ करता है। यह मेथड उस बिंदु की गणना करता है और लौटाता है जहाँ स्ट्रिंग ड्रॉ करने से पहले टेक्स्ट कर्सर सेट किया जाना चाहिए। |
| [get_OutputStream](./get_outputstream/)() override | एक आउटपुट स्ट्रीम निर्दिष्ट करता है या लौटाता है। |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | वर्तमान ट्रांसफ़ॉर्म प्राप्त करता है। |
| [InitClip](./initclip/)() override | डिवाइस की क्लिप को प्रारंभ करता है। |
| [InitPageNumbers](./initpagenumbers/)() override | आउटपुट के लिए पृष्ठों की संख्या को प्रारंभ करता है। |
| static [KEYWORDS](./keywords/)() | \"Keywords\" प्रॉपर्टी मान। |
| [OpenPage](./openpage/)(System::String) override | पृष्ठ रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है। |
| [OpenPage](./openpage/)(float, float) override | प्रत्येक पृष्ठ रेंडरिंग से पहले डिवाइस की आवश्यक तैयारी करता है। |
| static [ORIENTATION](./orientation/)() | \"Orientation\" प्रॉपर्टी कुंजी। |
| static [PAGE_MARGINS](./page_margins/)() | \"Page margins\" प्रॉपर्टी कुंजी। |
| static [PAGE_SIZE_](./page_size_/)() | \"Page size\" प्रॉपर्टी कुंजी। |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | आउटपुट स्ट्रीम के साथ [PdfDevice](./) का नया इंस्टेंस प्रारंभ करता है। |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | आउटपुट स्ट्रीम और निर्दिष्ट पृष्ठ आकार के साथ [PdfDevice](./) का नया इंस्टेंस प्रारंभ करता है। |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | क्लोन कंस्ट्रक्टर। मौजूदा डिवाइस के साथ [PdfDevice](./) का नया इंस्टेंस प्रारंभ करता है। |
| [ReNew](./renew/)() override | पूरे दस्तावेज़ के लिए डिवाइस को प्रारंभिक स्थिति में रीसेट करता है। आउटपुट स्ट्रीम को रीसेट करने के लिए उपयोग किया जाता है। |
| [ReNewForMerge](./renewformerge/)(bool) override | कई दस्तावेज़ों को मिलाते समय पूरे दस्तावेज़ के लिए डिवाइस को प्रारंभिक स्थिति में रीसेट करता है। आउटपुट स्ट्रीम को रीसेट करने के लिए उपयोग किया जाता है। |
| [Reset](./reset/)() override | यदि पृष्ठ डिवाइस पैरामीटर सेट किए जाएंगे, तो यह मेथड लेखन स्ट्रीम को पृष्ठ की शुरुआत में वापस लौटने की अनुमति देता है। |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Z-अक्ष के चारों ओर वर्तमान ट्रांसफ़ॉर्म को घुमाएँ। writeTransform(Transform) को कॉल करता है। सकारात्मक कोण थिटा के साथ घुमाने से बिंदु सकारात्मक x अक्ष से सकारात्मक y अक्ष की ओर घुमते हैं। |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को स्केल करता है। writeTransform(Transform) को कॉल करता है। |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | वर्तमान फ़ॉन्ट निर्दिष्ट करता है। |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | एक आउटपुट स्ट्रीम निर्दिष्ट करता है या लौटाता है। |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | वर्तमान पेंट को लौटाता है या निर्दिष्ट करता है। |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | वर्तमान स्ट्रोक को लौटाता है या निर्दिष्ट करता है। |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | डिवाइस की क्लिप को निर्दिष्ट करता है। |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | वर्तमान ट्रांसफ़ॉर्म को निर्दिष्ट करता है। चूँकि अधिकांश आउटपुट फ़ॉर्मेट इस कार्यक्षमता को लागू नहीं करते हैं, वर्तमान ट्रांसफ़ॉर्म का इनवर्स ट्रांसफ़ॉर्म गणना किया जाता है और सेट किए जाने वाले ट्रांसफ़ॉर्म से गुणा किया जाता है। परिणाम फिर writeTransform(Transform) कॉल द्वारा अग्रेषित किया जाता है। |
| [Shear](./shear/)(double, double) override | वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को शीयर करता है। writeTransform(Transform) को कॉल करता है। |
| [StartDocument](./startdocument/)() override | दस्तावेज़ के रेंडरिंग शुरू होने से पहले डिवाइस की आवश्यक तैयारी करता है। |
| static [SUBJECT](./subject/)() | \"Subject\" प्रॉपर्टी मान। |
| static [TITLE](./title/)() | \"Title\" प्रॉपर्टी मान। |
| [ToString](./tostring/)() const override | डिवाइस प्रकार का नाम लौटाता है। |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को ट्रांसफ़ॉर्म करता है। writeTransform(Transform) को कॉल करता है। |
| [Translate](./translate/)(double, double) override | वर्तमान ट्रांसफ़ॉर्मेशन मैट्रिक्स को ट्रांसलेट करता है। writeTransform(Transform) को कॉल करता है। |
| static [TRANSPARENT](./transparent/)() | "Transparent" प्रॉपर्टी कुंजी। |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | अन्य मल्टी‑पेज्ड डिवाइस से पेज पैरामीटर अपडेट करता है। |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" प्रॉपर्टी कुंजी। |
| [WriteBackground](./writebackground/)() override | वर्तमान बैकग्राउंड को लिखता है। |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | स्ट्रोक के कैप को लिखता है। |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | एक टिप्पणी लिखता है। |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | स्ट्रोक के डैश को लिखता है। |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | कैटलॉग, docinfo, प्रेफ़रेंसेज़, और (क्योंकि हम केवल सिंगल पेज आउटपुट का उपयोग करते हैं, पेज ट्री) लिखता है। |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | स्ट्रोक के जॉइन को लिखता है। |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | आखिरी लिखी गई पेंट को लिखता है। यह उन मामलों में उपयोगी है जब पेंट लिखने के बाद ग्राफ़िक्स रिस्टोर ("Q") किया गया हो। |
| [WriteMiterLimit](./writemiterlimit/)(float) override | स्ट्रोक की माइटर लिमिट को लिखता है। |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | दिए गए रंग के रूप में पेंट को लिखता है। |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | दिए गए ग्रेडिएंट के रूप में पेंट को लिखता है। |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | दिए गए टेक्सचर के रूप में पेंट को लिखता है। |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | पेंट को लिखता है। |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | निर्दिष्ट फ़ॉन्ट के साथ स्ट्रिंग को लिखता है। |
| [WriteTrailer](./writetrailer/)() | PDF दस्तावेज़ के ट्रेलर को लिखता है। |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | दिए गए ट्रांसफ़ॉर्मेशन मैट्रिक्स को फ़ाइल में लिखें। |
| [WriteWarning](./writewarning/)(System::String) override | डिफ़ॉल्ट रूप से System.err पर एक चेतावनी लिखता है। |
| [WriteWidth](./writewidth/)(float) override | स्ट्रोक की चौड़ाई को लिखता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [VERSION](./version/) | "Version" प्रॉपर्टी कुंजी। |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" प्रॉपर्टी मान। |

## Deprecated
PdfDevice क्लास 24.3 से अप्रचलित है। कृपया इसके बजाय PsDocument क्लास में SaveAsPdf मेथड का उपयोग करें। 24.6 में यह क्लास पूरी तरह से छिपा दी जाएगी।

## संबंधित देखें

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
