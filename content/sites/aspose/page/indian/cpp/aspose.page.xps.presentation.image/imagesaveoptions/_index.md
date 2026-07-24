---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions क्लास"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions क्लास. C++ में XPS-को-इमेज के रूप में सहेजने के विकल्पों के लिए बुनियादी क्लास।"
type: docs
weight: 200
url: /hi/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


XPS-as-image सहेजने विकल्पों के लिए बेस क्लास।

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | नोड से नोड तक पास किए जाने वाले पृष्ठों के हिस्से का आकार निर्दिष्ट करता है। |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | सहेजे जाने से ठीक पहले एक [XPS](../../aspose.page.xps/) पृष्ठ में संशोधन करने वाले इवेंट हैंडलर्स का संग्रह। |
| [get_ImageSize](./get_imagesize/)() const | आउटपुट चित्रों का आकार पिक्सेल में प्राप्त/सेट करता है। |
| [get_InterpolationMode](./get_interpolationmode/)() const | इंटरपोलेशन मोड को प्राप्त/सेट करता है। |
| [get_PageNumbers](./get_pagenumbers/)() override | परिवर्तित करने के लिए पृष्ठों की संख्याओं की एरे को प्राप्त/सेट करता है। |
| [get_Resolution](./get_resolution/)() const | इमेज रिज़ॉल्यूशन प्राप्त/सेट करता है। |
| [get_SmoothingMode](./get_smoothingmode/)() const | स्मूदिंग मोड को प्राप्त/सेट करता है। |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | टेक्स्ट रेंडरिंग संकेत को प्राप्त/सेट करता है। |
| [ImageSaveOptions](./imagesaveoptions/)() | विकल्पों का नया उदाहरण बनाता है। |
| [set_BatchSize](./set_batchsize/)(int32_t) override | नोड से नोड तक पास किए जाने वाले पृष्ठों के हिस्से का आकार निर्दिष्ट करता है। |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | आउटपुट चित्रों का आकार पिक्सेल में प्राप्त/सेट करता है। |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | इंटरपोलेशन मोड को प्राप्त/सेट करता है। |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | परिवर्तित करने के लिए पृष्ठों की संख्याओं की एरे को प्राप्त/सेट करता है। |
| [set_Resolution](./set_resolution/)(float) | इमेज रिज़ॉल्यूशन प्राप्त/सेट करता है। |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | स्मूदिंग मोड को प्राप्त/सेट करता है। |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | टेक्स्ट रेंडरिंग संकेत को प्राप्त/सेट करता है। |
## संबंधित देखें

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
