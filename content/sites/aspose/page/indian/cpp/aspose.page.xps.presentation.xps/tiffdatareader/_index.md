---
title: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader क्लास"
linktitle: "TiffDataReader"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader क्लास। क्लास का उपयोग TIFF इमेज फ़ाइल डायरेक्टरी (IFD) से डेटा पढ़ने के लिए किया जाता है। यह C++ में TIFF रिज़ॉल्यूशन पढ़ने और TIFF अनुरूपता जाँचने में मदद करता है।"
type: docs
weight: 100
url: /hi/cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


क्लास का उपयोग TIFF इमेज फ़ाइल निर्देशिका (IFD) से डेटा पढ़ने के लिए किया जाता है। यह TIFF रिज़ॉल्यूशन पढ़ने और TIFF अनुरूपता की जाँच करने में मदद करता है।

```cpp
class TiffDataReader : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | Tiff इमेज की ऊँचाई लौटाता है। यदि ऊँचाई 0 है, तो डिफ़ॉल्ट मान (100) लौटाता है। |
| [get_ImageWidth](./get_imagewidth/)() | Tiff इमेज की चौड़ाई लौटाता है। यदि चौड़ाई 0 है, तो डिफ़ॉल्ट मान (100) लौटाता है। |
| [get_ImageXResolution](./get_imagexresolution/)() const | Tiff इमेज का X रिज़ॉल्यूशन लौटाता है। |
| [get_ImageYResolution](./get_imageyresolution/)() const | Tiff इमेज का Y रिज़ॉल्यूशन लौटाता है। |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | यदि TIFF इमेज [XPS](../../aspose.page.xps/) विनिर्देश के अनुरूप है और जैसा है वैसा ही [XPS](../../aspose.page.xps/) दस्तावेज़ में सम्मिलित किया जा सकता है, तो true लौटाता है। |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | फ़ॉर्मेट के लिए दस्तावेज़ Aspose.Words\\Doc में है। |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | [TiffDataReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | [TiffDataReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)
