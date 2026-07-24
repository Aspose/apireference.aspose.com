---
title: "Aspose::Page::EPS::PsDocument वर्ग"
linktitle: "PsDocument"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::PsDocument वर्ग। यह वर्ग C++ में PS/EPS दस्तावेज़ों को संलग्न करता है।"
type: docs
weight: 700
url: /hi/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


यह क्लास PS/EPS दस्तावेज़ों को एन्कैप्सुलेट करती है।

```cpp
class PsDocument : public Aspose::Page::Document
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | वर्तमान ग्राफ़िक्स स्थिति में क्लिप जोड़ता है। |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | वर्तमान ग्राफ़िक्स स्थिति में क्लिप जोड़ता है और फिर "newpath" ऑपरेटर लिखता है। यह इस क्लिपिंग पथ और कुछ बाद के पथों जैसे "charpath" ऑपरेटर के साथ रूपरेखा वाले glyphs के मिलन से बचने के लिए आवश्यक है। |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | वर्तमान ग्राफ़िक्स स्थिति में क्लिपिंग आयत जोड़ता है। |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | दिए गए फ़ॉन्ट में दिए गए पाठ की रूपरेखा से क्लिप जोड़ता है। |
| [ClosePage](./closepage/)() | वर्तमान पृष्ठ को पूर्ण करें। |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Type 1 फ़ॉन्ट को **TrueType** में परिवर्तित करता है। परिवर्तित TTF फ़ॉन्ट का नाम इनपुट Type 1 फ़ॉन्ट के समान होगा, जिसमें ".ttf" एक्सटेंशन होगा। TTF फ़ाइल को निर्दिष्ट आउटपुट निर्देशिका में सहेजा जाएगा। |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Type 3 फ़ॉन्ट को **TrueType** में परिवर्तित करता है। परिवर्तित TTF फ़ॉन्ट का नाम इनपुट Type 3 फ़ॉन्ट फ़ाइल के समान होगा, जिसमें ".ttf" एक्सटेंशन होगा। TTF फ़ाइल को निर्दिष्ट आउटपुट निर्देशिका में सहेजा जाएगा। |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Type 3 फ़ॉन्ट को **TrueType** स्ट्रीम में परिवर्तित करता है। |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | दिए गए [PsDocument](./) को [EPS](../) फ़ाइल के रूप में क्रॉप करता है। यह अद्यतन मौजूदा %BoundingBox के साथ प्रारंभिक [EPS](../) फ़ाइल को सहेजता है या नया बनाया जाएगा। |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | दिए गए [PsDocument](./) को [EPS](../) फ़ाइल के रूप में क्रॉप करता है। यह अद्यतन मौजूदा %BoundingBox के साथ प्रारंभिक [EPS](../) फ़ाइल को सहेजता है या नया बनाया जाएगा। |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | एक मनमाना पथ बनाएं। |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | एक चाप बनाता है। |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | मास्क्ड छवि बनाएं। |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | छवि बनाएं। |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | पृष्ठभूमि के साथ परिवर्तित छवि बनाएं। |
| [DrawLine](./drawline/)(double, double, double, double) | एक रेखा खंड बनाता है। |
| [DrawOval](./drawoval/)(double, double, double, double) | एक अंडाकार बनाता है। |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | एक बहुभुज बनाता है। |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | एक पोलिगोन बनाता है। |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | एक पॉलीलाइन बनाता है। |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | एक पॉलीलाइन बनाता है। |
| [DrawRect](./drawrect/)(double, double, double, double) | एक आयत बनाता है। |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | एक गोल किनारा वाला आयत बनाता है। |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | परिवर्तित पारदर्शी छवि को बनाता है। यदि छवि में अल्फा चैनल नहीं है तो इसे अपारदर्शी छवि के रूप में बनाया जाएगा। |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | [EPS](../) फ़ाइल पढ़ता है और %BoundingBox टिप्पणी से [EPS](../) छवि का बाउंडिंग बॉक्स निकालता है, या यदि वह मौजूद नहीं है तो डिफ़ॉल्ट पृष्ठ आकार (0, 0, 595, 842) के लिए सीमाएँ निकालता है। |
| [ExtractEpsSize](./extractepssize/)() | [EPS](../) फ़ाइल पढ़ता है और %BoundingBox टिप्पणी से [EPS](../) छवि का आकार निकालता है, या यदि वह मौजूद नहीं है तो डिफ़ॉल्ट पृष्ठ आकार (595, 842) निकालता है। |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | PS फ़ाइल से पाठ निकालता है। पाठ केवल तभी निकाला जा सकता है जब वह टाइप 42 (**TrueType**) फ़ॉन्ट या टाइप 0 फ़ॉन्ट के साथ टाइप 42 फ़ॉन्ट्स वाले वेक्टर मैप में लिखा गया हो। |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | एक मनमाना पथ भरें। |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | ग्लिफ़ के अंदर को भरकर और ग्लिफ़ कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | ग्लिफ़ के अंदर को भरकर और ग्लिफ़ कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | ग्लिफ़ के अंदर को भरकर और ग्लिफ़ कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | ग्लिफ़ के अंदर को भरकर और ग्लिफ़ कंटूर को खींचकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | एक चाप भरता है। |
| [FillOval](./filloval/)(double, double, double, double) | एक अंडाकार भरता है। |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | एक पोलिगोन भरता है। |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | एक पोलिगोन भरता है। |
| [FillRect](./fillrect/)(double, double, double, double) | एक आयत भरता है। |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | एक गोल किनारा वाला आयत भरता है। |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | ग्लिफ़ के अंदर को भरकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [get_InputStream](./get_inputstream/)() | एक स्ट्रीम और लोड विकल्पों के साथ [PsDocument](./) को प्रारंभ करता है। |
| [get_NumberOfPages](./get_numberofpages/)() const | परिणामी PDF दस्तावेज़ में पृष्ठों की संख्या लौटाता है। |
| [GetPaint](./getpaint/)() | वर्तमान ग्राफ़िक्स स्थिति का पेंट प्राप्त करता है। |
| [GetStroke](./getstroke/)() | वर्तमान ग्राफ़िक्स स्थिति में स्ट्रोक सेट करता है। |
| [GetXmpMetadata](./getxmpmetadata/)() | PS/EPS फ़ाइल पढ़ता है और XmpMetdata निकालता है यदि वह पहले से मौजूद है, या यदि नहीं है तो नया जोड़ता है। |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | PS/EPS फ़ाइलों को एक डिवाइस में मिलाता है। |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | PS/EPS फ़ाइलों को एक डिवाइस में मिलाता है। |
| [OpenPage](./openpage/)(float, float) | एक नया पृष्ठ बनाता है और उसे वर्तमान बनाता है। |
| [OpenPage](./openpage/)(System::String) | दस्तावेज़ के आकार के साथ एक नया पृष्ठ बनाता है और उसे वर्तमान बनाता है। |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | ग्लिफ़ कंटूर बनाकर एक टेक्स्ट स्ट्रिंग जोड़ता है। |
| [PsDocument](./psdocument/)() | खाली [PsDocument](./) को प्रारंभ करता है। यह कंस्ट्रक्टर केवल उन अतिरिक्त ऑपरेशनों के लिए उपयोग किया जाता है जो PostScript फ़ाइलों से संबंधित नहीं हैं, उदाहरण के लिए, फ़ॉन्ट बदलना। |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | प्रारंभिक पृष्ठ के साथ खाली [PsDocument](./) को प्रारंभ करता है। |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | प्रारंभिक पृष्ठ के साथ खाली [PsDocument](./) को प्रारंभ करता है। |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | खाली [PsDocument](./) को प्रारंभ करता है। |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | खाली [PsDocument](./) को प्रारंभ करता है। |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | जब [Postscript](../../aspose.page.eps.postscript/) दस्तावेज़ पृष्ठों की संख्या पहले से ज्ञात हो, तब खाली [PsDocument](./) को प्रारंभ करता है। |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | जब [Postscript](../../aspose.page.eps.postscript/) दस्तावेज़ पृष्ठों की संख्या पहले से ज्ञात हो, तब खाली [PsDocument](./) को प्रारंभ करता है। |
| [PsDocument](./psdocument/)(System::String) | [PsDocument](./) को इनपुट PS/EPS फ़ाइल के साथ प्रारंभ करता है। |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | [PsDocument](./) को PS/EPS फ़ाइल की स्ट्रीम के साथ प्रारंभ करता है। |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | दिए गए [PsDocument](./) को [EPS](../) फ़ाइल के रूप में आकार बदलता है। यह मेथड केवल [EPS](../) आकार निकालने के बाद उपयोग किया जाता है। यह प्रारंभिक [EPS](../) फ़ाइल को filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hThe output directory where image file will be saved.e के साथ सहेजता है, अपडेटेड मौजूदा %BoundingBox के साथ या नया बनाता है। [Page](../../aspose.page/) ट्रांसफ़ॉर्मेशन मैट्रिक्स भी सेट किया जाएगा। |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | दिए गए [PsDocument](./) को [EPS](../) फ़ाइल के रूप में आकार बदलता है। यह मेथड केवल [EPS](../) आकार निकालने के बाद उपयोग किया जाता है। यह प्रारंभिक [EPS](../) फ़ाइल को अपडेटेड मौजूदा %BoundingBox के साथ या नया बनाकर सहेजता है। [Page](../../aspose.page/) ट्रांसफ़ॉर्मेशन मैट्रिक्स भी सेट किया जाएगा। |
| [Rotate](./rotate/)(float) | मूल बिंदु के बारे में वर्तमान ग्राफ़िक्स स्थिति में प्रतिकूल घड़ी की दिशा में घूर्णन जोड़ता है (वर्तमान मैट्रिक्स को घुमाता है)। |
| [Rotate](./rotate/)(int32_t) | मूल बिंदु के बारे में वर्तमान ग्राफ़िक्स स्थिति में प्रतिकूल घड़ी की दिशा में घूर्णन जोड़ता है (वर्तमान मैट्रिक्स को घुमाता है)। |
| [Save](./save/)(System::String) | दिए गए [PsDocument](./) को [EPS](../) फ़ाइल के रूप में सहेजता है। यह मेथड केवल [XMP](../../aspose.page.eps.xmp/) मेटाडेटा को अपडेट करने के बाद उपयोग किया जाता है। यह प्रारंभिक [EPS](../) फ़ाइल को अपडेटेड मौजूदा मेटाडेटा के साथ या GetMetadata मेथड को कॉल करने पर निर्मित नया मेटाडेटा के साथ सहेजता है। अंतिम मामले में सभी आवश्यक PostScript कोड और [EPS](../) टिप्पणियाँ जोड़ी जाती हैं। |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | दिए गए [PsDocument](./) को स्ट्रीम में सहेजता है। यह मेथड केवल [XMP](../../aspose.page.eps.xmp/) मेटाडेटा को अपडेट करने के बाद उपयोग किया जाता है। यह प्रारंभिक [EPS](../) फ़ाइल को अपडेटेड मौजूदा मेटाडेटा के साथ या GetMetadata मेथड को कॉल करने पर निर्मित नया मेटाडेटा के साथ सहेजता है। अंतिम मामले में सभी आवश्यक PostScript कोड और [EPS](../) टिप्पणियाँ जोड़ी जाती हैं। |
| [Save](./save/)() | दिए गए [PsDocument](./) को PS या [EPS](../) फ़ाइल के रूप में सहेजता है। यह मेथड केवल तब उपयोग किया जाता है जब [PsDocument](./) को शुरू से बनाया गया हो। |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | PS/EPS फ़ाइल को छवि फ़ाइल में सहेजता है। आउटपुट डायरेक्टरी और फ़ाइल नाम इनपुट PS फ़ाइल के समान होंगे। फ़ाइल एक्सटेंशन "options" पैरामीटर में निर्दिष्ट छवि फ़ॉर्मेट के अनुरूप होगा। यदि दस्तावेज़ को ऐसी स्ट्रीम से प्रारंभ किया गया था जो FileStream नहीं है, तो छवि फ़ाइल वर्तमान फ़ोल्डर में डिफ़ॉल्ट फ़ाइल नाम टेम्पलेट के साथ सहेजी जाएगी। |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | PS/EPS फ़ाइल को निर्दिष्ट डायरेक्टरी में निर्दिष्ट फ़ाइल नाम के साथ छवि फ़ाइल में सहेजता है। फ़ाइल एक्सटेंशन "options" पैरामीटर में निर्दिष्ट छवि फ़ॉर्मेट के अनुरूप होगा। |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | PS/EPS फ़ाइल को छवि बाइट एरेज़ में सहेजता है। |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | PS/EPS फ़ाइल को PDF फ़ाइल में सहेजता है। |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | PS/EPS फ़ाइल को PDF स्ट्रीम में सहेजता है। |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | इनपुट स्ट्रीम से PNG/JPEG/TIFF/BMP/GIF/EMF छवि को [EPS](../) आउटपुट स्ट्रीम में सहेजता है। |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | फ़ाइल से PNG/JPEG/TIFF/BMP/GIF/EMF छवि को [EPS](../) फ़ाइल में सहेजता है। |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Bitmap ऑब्जेक्ट को [EPS](../) फ़ाइल में सहेजता है। |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Bitmap ऑब्जेक्ट को [EPS](../) आउटपुट स्ट्रीम में सहेजता है। |
| [Scale](./scale/)(float, float) | वर्तमान ग्राफ़िक्स स्थिति में स्केल जोड़ता है (वर्तमान मैट्रिक्स को स्केल करता है)। |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | एक स्ट्रीम और लोड विकल्पों के साथ [PsDocument](./) को प्रारंभ करता है। |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | पेज डिवाइस पैरामीटर सेट करता है (ऑपरेटर "setpagedevice" PostScript विशिष्टता देखें)। इनमें पेज आकार, रंग आदि शामिल हो सकते हैं। |
| [SetPageSize](./setpagesize/)(float, float) | पेज आकार सेट करता है। एक दस्तावेज़ में विभिन्न आकार के पेज बनाने के लिए इस मेथड के तुरंत बाद [SetPageDevice](./setpagedevice/) मेथड का उपयोग करें। |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | वर्तमान ग्राफ़िक्स स्थिति में पेंट सेट करता है। |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | वर्तमान ग्राफ़िक्स स्थिति में स्ट्रोक सेट करता है। |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | वर्तमान ट्रांसफ़ॉर्मेशन को इस में सेट करें। |
| [Shear](./shear/)(float, float) | वर्तमान ग्राफ़िक्स स्थिति को किसी बिंदु के चारों ओर विपरीत घड़ी की दिशा में घुमाता है। |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | वर्तमान ग्राफ़िक्स स्थिति में ट्रांसफ़ॉर्मेशन जोड़ता है (इस मैट्रिक्स को वर्तमान वाले के साथ जोड़ता है)। |
| [Translate](./translate/)(float, float) | वर्तमान ग्राफ़िक्स स्थिति में ट्रांसलेशन जोड़ता है (वर्तमान मैट्रिक्स को ट्रांसलेट करता है)। |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | वर्तमान ग्राफ़िक्स स्थिति को पुनर्स्थापित करने को लिखता है (ऑपरेटर "grestore" पर पोस्टस्क्रिप्ट विनिर्देश देखें)। |
| [WriteGraphicsSave](./writegraphicssave/)() | वर्तमान ग्राफ़िक्स स्थिति को सहेजने को लिखता है (ऑपरेटर "gsave" पर पोस्टस्क्रिप्ट विनिर्देश देखें)। |
## संबंधित देखें

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
