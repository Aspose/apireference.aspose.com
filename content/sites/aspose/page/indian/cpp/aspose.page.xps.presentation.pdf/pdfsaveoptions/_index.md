---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions class"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions class. C++ में XPS-को-PDF के रूप में सहेजने के विकल्पों के लिए क्लास।"
type: docs
weight: 300
url: /hi/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


XPS-से-PDF सहेजने विकल्पों के लिए क्लास।

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | नोड से नोड तक पास किए जाने वाले पृष्ठों के हिस्से का आकार निर्दिष्ट करता है। |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | सहेजे जाने से ठीक पहले एक [XPS](../../aspose.page.xps/) पृष्ठ में संशोधन करने वाले इवेंट हैंडलर्स का संग्रह। |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | एन्क्रिप्शन विवरण प्राप्त करता है। यदि सेट नहीं किया गया है, तो कोई एन्क्रिप्शन नहीं किया जाएगा। |
| [get_ImageCompression](./get_imagecompression/)() const | दस्तावेज़ में सभी छवियों के लिए उपयोग किए जाने वाले संपीड़न प्रकार को निर्दिष्ट करता है। डिफ़ॉल्ट है [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | जब PDF फ़ाइल को व्यूअर में खोला जाता है, तो दस्तावेज़ रूपरेखा किस स्तर तक विस्तारित होनी चाहिए, यह निर्दिष्ट करता है। 1 - केवल प्रथम स्तर के रूपरेखा आइटम दिखाए जाते हैं, 2 - प्रथम और द्वितीय स्तर के आइटम दिखाए जाते हैं, आदि। डिफ़ॉल्ट 1 है। |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | सहेजने के लिए दस्तावेज़ रूपरेखा ट्री की ऊँचाई निर्दिष्ट करता है। 0 - रूपरेखा ट्री नहीं बदला जाएगा, 1 - केवल प्रथम स्तर के रूपरेखा आइटम बदले जाएंगे, आदि। डिफ़ॉल्ट 10 है। |
| [get_PageNumbers](./get_pagenumbers/)() override | परिवर्तित करने के लिए पृष्ठों की संख्याओं की एरे को प्राप्त/सेट करता है। |
| [get_PreserveText](./get_preservetext/)() override | [XPS](../../aspose.page.xps/) में, कुछ टेक्स्ट तत्व वैकल्पिक ग्लिफ़ रूपों के संदर्भ रख सकते हैं जो फ़ॉन्ट में किसी भी कैरेक्टर कोड से मेल नहीं खाते। यदि यह फ़्लैग true पर सेट किया जाता है, तो ऐसे [XPS](../../aspose.page.xps/) तत्वों का टेक्स्ट ग्राफ़िक आकारों में परिवर्तित हो जाता है। फिर टेक्स्ट स्वयं ऊपर पारदर्शी दिखाई देता है। इससे ऐसे तत्वों का टेक्स्ट चयन योग्य रहता है। लेकिन इसका दुष्प्रभाव यह है कि आउटपुट फ़ाइल मूल से बहुत बड़ी हो सकती है। यदि यह फ़्लैग false पर सेट किया जाता है, तो वैकल्पिक रूपों के रूप में दिखाए जाने वाले अक्षरों को कुछ अन्य अक्षरों से बदल दिया जाता है जो वैकल्पिक ग्लिफ़ रूपों से मैप हो जाते हैं। इसलिए टेक्स्ट, यद्यपि अभी भी चयन योग्य है, संशोधित हो जाएगा और संभवतः पढ़ने योग्य नहीं रहेगा। डिफ़ॉल्ट false है। |
| [get_TextCompression](./get_textcompression/)() const | दस्तावेज़ रूपरेखा में किस स्तर पर [ApsBookmark](../) ऑब्जेक्ट्स दिखाने हैं, यह निर्दिष्ट करता है। 0 - नहीं दिखाया जाता। 1 - प्रथम स्तर पर और इसी प्रकार। डिफ़ॉल्ट 0 है। |
| [PdfSaveOptions](./pdfsaveoptions/)() | विकल्पों का नया उदाहरण बनाता है। |
| [set_BatchSize](./set_batchsize/)(int32_t) override | नोड से नोड तक पास किए जाने वाले पृष्ठों के हिस्से का आकार निर्दिष्ट करता है। |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | एन्क्रिप्शन विवरण सेट करता है। यदि सेट नहीं किया गया है, तो कोई एन्क्रिप्शन नहीं किया जाएगा। |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | दस्तावेज़ में सभी छवियों के लिए उपयोग किए जाने वाले संपीड़न प्रकार को निर्दिष्ट करता है। डिफ़ॉल्ट है [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | जब PDF फ़ाइल को व्यूअर में खोला जाता है, तो दस्तावेज़ रूपरेखा किस स्तर तक विस्तारित होनी चाहिए, यह निर्दिष्ट करता है। 1 - केवल प्रथम स्तर के रूपरेखा आइटम दिखाए जाते हैं, 2 - प्रथम और द्वितीय स्तर के आइटम दिखाए जाते हैं, आदि। डिफ़ॉल्ट 1 है। |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | सहेजने के लिए दस्तावेज़ रूपरेखा ट्री की ऊँचाई निर्दिष्ट करता है। 0 - रूपरेखा ट्री नहीं बदला जाएगा, 1 - केवल प्रथम स्तर के रूपरेखा आइटम बदले जाएंगे, आदि। डिफ़ॉल्ट 10 है। |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | परिवर्तित करने के लिए पृष्ठों की संख्याओं की एरे को प्राप्त/सेट करता है। |
| [set_PreserveText](./set_preservetext/)(bool) override | [XPS](../../aspose.page.xps/) में, कुछ टेक्स्ट तत्व वैकल्पिक ग्लिफ़ रूपों के संदर्भ रख सकते हैं जो फ़ॉन्ट में किसी भी कैरेक्टर कोड से मेल नहीं खाते। यदि यह फ़्लैग true पर सेट किया जाता है, तो ऐसे [XPS](../../aspose.page.xps/) तत्वों का टेक्स्ट ग्राफ़िक आकारों में परिवर्तित हो जाता है। फिर टेक्स्ट स्वयं ऊपर पारदर्शी दिखाई देता है। इससे ऐसे तत्वों का टेक्स्ट चयन योग्य रहता है। लेकिन इसका दुष्प्रभाव यह है कि आउटपुट फ़ाइल मूल से बहुत बड़ी हो सकती है। यदि यह फ़्लैग false पर सेट किया जाता है, तो वैकल्पिक रूपों के रूप में दिखाए जाने वाले अक्षरों को कुछ अन्य अक्षरों से बदल दिया जाता है जो वैकल्पिक ग्लिफ़ रूपों से मैप हो जाते हैं। इसलिए टेक्स्ट, यद्यपि अभी भी चयन योग्य है, संशोधित हो जाएगा और संभवतः पढ़ने योग्य नहीं रहेगा। डिफ़ॉल्ट false है। |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | दस्तावेज़ रूपरेखा में किस स्तर पर [ApsBookmark](../) ऑब्जेक्ट्स दिखाने हैं, यह निर्दिष्ट करता है। 0 - नहीं दिखाया जाता। 1 - प्रथम स्तर पर और इसी प्रकार। डिफ़ॉल्ट 0 है। |
## संबंधित देखें

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
