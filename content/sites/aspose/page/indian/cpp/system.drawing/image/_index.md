---
title: "System::Drawing::Image क्लास"
linktitle: "छवि"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Image क्लास। यह System::Drawing::Bitmap और System::Drawing::Metafile क्लासों के लिए एक बेस क्लास है जो बुनियादी कार्यक्षमता प्रदान करती है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 1200
url: /hi/cpp/system.drawing/image/
---
## Image class


एक बेस क्लास है जो [System::Drawing::Bitmap](../bitmap/) और System::Drawing::Metafile क्लासों के लिए बुनियादी कार्यक्षमता प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Image : public virtual System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Clone](./clone/)() | वर्तमान वस्तु की एक प्रति बनाता है। |
| [Dispose](./dispose/)() override | वर्तमान वस्तु द्वारा अधिग्रहीत सभी संसाधनों को मुक्त करता है। |
| static [FromFile](./fromfile/)(const String\&, bool) | निर्दिष्ट फ़ाइल से एक [Image](./) वस्तु बनाता है। |
| static [FromHbitmap](./fromhbitmap/)(IntPtr) | निर्दिष्ट GDI बिटमैप से एक [Bitmap](../bitmap/) ऑब्जेक्ट बनाता है। |
| static [FromStream](./fromstream/)(const SharedPtr\<System::IO::Stream\>\&, bool, bool) | निर्दिष्ट स्ट्रीम से एक [Image](./) ऑब्जेक्ट बनाता है। |
| virtual [get_Flags](./get_flags/)() const | छवि के गुणों को दर्शाने वाले ImageFlags एनम मानों का बिट-वार संयोजन लौटाता है। |
| [get_FrameDimensionsList](./get_framedimensionslist/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि के भीतर फ्रेमों के आयामों को दर्शाने वाले GUIDs की एक सरणी लौटाता है। |
| virtual [get_Height](./get_height/)() const | छवि की ऊँचाई पिक्सेल में लौटाता है। |
| [get_HorizontalResolution](./get_horizontalresolution/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि का क्षैतिज रिज़ॉल्यूशन पिक्सेल प्रति इंच में लौटाता है। |
| virtual [get_Palette](./get_palette/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि द्वारा उपयोग की गई रंग पैलेट लौटाता है। |
| virtual [get_PixelFormat](./get_pixelformat/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि का पिक्सेल फ़ॉर्मेट लौटाता है। |
| virtual [get_PropertyIdList](./get_propertyidlist/)() const | इस छवि में संग्रहीत प्रॉपर्टी आइटम्स के IDs प्राप्त करता है। |
| virtual [get_PropertyItems](./get_propertyitems/)() const | इस छवि में संग्रहीत सभी प्रॉपर्टी आइटम्स (मेटाडेटा के टुकड़े) प्राप्त करता है। |
| virtual [get_RawFormat](./get_rawformat/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि का फ़ाइल फ़ॉर्मेट लौटाता है। |
| [get_Size](./get_size/)() const | छवि की चौड़ाई और ऊँचाई पिक्सेल में दर्शाने वाला एक [Size](../size/) ऑब्जेक्ट लौटाता है। |
| virtual [get_Tag](./get_tag/)() const | छवि के बारे में अतिरिक्त डेटा प्रदान करने वाला एक ऑब्जेक्ट प्राप्त करता है। |
| [get_VerticalResolution](./get_verticalresolution/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि का लंबवत रिज़ॉल्यूशन पिक्सेल प्रति इंच में लौटाता है। |
| virtual [get_Width](./get_width/)() const | छवि की चौड़ाई पिक्सेल में लौटाता है। |
| [GetBounds](./getbounds/)(GraphicsUnit\&) | निर्दिष्ट माप इकाइयों में छवि की सीमाएँ लौटाता है। |
| [GetFrameCount](./getframecount/)(const Imaging::FrameDimensionPtr\&) | निर्दिष्ट फ्रेम आयाम के फ्रेमों की संख्या लौटाता है। |
| static [GetPixelFormatSize](./getpixelformatsize/)(Imaging::PixelFormat) | निर्दिष्ट पिक्सेल फ़ॉर्मेट में रंग गहराई को दर्शाने के लिए उपयोग किए गए बिट्स की संख्या लौटाता है। |
| virtual [GetSkBitmap](./getskbitmap/)() const | एक अंतर्निहित SkBitmap ऑब्जेक्ट लौटाता है। |
| [GetThumbnailImage](./getthumbnailimage/)(int, int, Image::GetThumbnailImageAbort, IntPtr) | इस [System::Drawing::Image](./) ऑब्जेक्ट के लिए एक थंबनेल प्राप्त करता है। |
| static [IsAlphaPixelFormat](./isalphapixelformat/)(Imaging::PixelFormat) | निर्दिष्ट पिक्सेल फ़ॉर्मेट में अल्फा जानकारी है या नहीं निर्धारित करता है। |
| virtual [IsMultiImage](./ismultiimage/)() const | मूल फ़ॉर्मेट मल्टी-इमेज है या नहीं लौटाता है। |
| virtual [RotateFlip](./rotateflip/)(RotateFlipType) | छवि को 90 डिग्री के गुणक तक घुमाता है और फ़्लिप करता है। |
| [Save](./save/)(const String\&) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि को PNG फ़ॉर्मेट में निर्दिष्ट फ़ाइल में सहेजता है। |
| [Save](./save/)(const String\&, const Imaging::ImageFormatPtr\&) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि को निर्दिष्ट फ़ॉर्मेट में निर्दिष्ट फ़ाइल में सहेजता है। |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि को निर्दिष्ट फ़ॉर्मेट में निर्दिष्ट स्ट्रीम पर सहेजता है। |
| [Save](./save/)(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि को निर्दिष्ट एन्कोडर और एन्कोडर पैरामीटरों का उपयोग करके निर्दिष्ट फ़ाइल में सहेजता है। |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि को निर्दिष्ट एन्कोडर और एन्कोडर पैरामीटरों का उपयोग करके निर्दिष्ट स्ट्रीम में सहेजता है। |
| [SaveAdd](./saveadd/)(const Imaging::EncoderParametersPtr\&) | पिछली कॉल में [Save()](./save/) मेथड द्वारा निर्दिष्ट फ़ाइल या स्ट्रीम में एक फ्रेम जोड़ता है। |
| [SaveAdd](./saveadd/)(const SharedPtr\<Image\>\&, const Imaging::EncoderParametersPtr\&) | पिछली कॉल में [Save()](./save/) मेथड द्वारा निर्दिष्ट फ़ाइल या स्ट्रीम में एक फ्रेम जोड़ता है। |
| [SelectActiveFrame](./selectactiveframe/)(const Imaging::FrameDimensionPtr\&, int) | निर्दिष्ट फ्रेम का चयन करता है। |
| virtual [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि द्वारा उपयोग की जाने वाली रंग पैलेट सेट करता है। |
| virtual [set_Tag](./set_tag/)(const System::SharedPtr\<System::Object\>) | छवि के बारे में अतिरिक्त डेटा प्रदान करने वाले ऑब्जेक्ट को सेट करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [GetThumbnailImageAbort](./getthumbnailimageabort/) | GetThumbnailImage निष्पादन को रद्द करने के लिए एक कॉलबैक। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
