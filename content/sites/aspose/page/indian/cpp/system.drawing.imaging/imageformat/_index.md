---
title: "System::Drawing::Imaging::ImageFormat क्लास"
linktitle: "ImageFormat"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Imaging::ImageFormat क्लास। यह एक छवि के फ़ाइल फ़ॉर्मेट का प्रतिनिधित्व करता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1100
url: /hi/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


एक छवि के फ़ाइल फ़ॉर्मेट का प्रतिनिधित्व करता है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

```cpp
class ImageFormat : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | निर्धारित करता है कि वर्तमान और निर्दिष्ट वस्तुओं द्वारा प्रतिनिधित्व किए गए छवि फ़ॉर्मेट समान हैं या नहीं। |
| static [get_Bmp](./get_bmp/)() | बिटमैप छवि फ़ॉर्मेट का प्रतिनिधित्व करने वाले [ImageFormat](./) वस्तु के लिए एक साझा पॉइंटर लौटाता है। |
| static [get_Emf](./get_emf/)() | एन्हांस्ड मेटाफाइल फ़ॉर्मेट का प्रतिनिधित्व करने वाले [ImageFormat](./) वस्तु के लिए एक साझा पॉइंटर लौटाता है। |
| static [get_Exif](./get_exif/)() | एक्सचेंजेबल [Image](../../system.drawing/image/) फ़ाइल (Exif) फ़ॉर्मेट का प्रतिनिधित्व करने वाले [ImageFormat](./) वस्तु के लिए एक साझा पॉइंटर लौटाता है। |
| static [get_Gif](./get_gif/)() | [Graphics](../../system.drawing/graphics/) इंटरचेंज फ़ॉर्मेट (GIF) छवि फ़ॉर्मेट का प्रतिनिधित्व करने वाले [ImageFormat](./) वस्तु के लिए एक साझा पॉइंटर लौटाता है। |
| [get_Guid](./get_guid/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए छवि फ़ॉर्मेट से जुड़े GUID को लौटाता है। |
| static [get_Icon](./get_icon/)() | [Windows](../../system.windows/) आइकन छवि फ़ॉर्मेट का प्रतिनिधित्व करने वाले [ImageFormat](./) वस्तु के लिए एक साझा पॉइंटर लौटाता है। |
| static [get_Jpeg](./get_jpeg/)() | जॉइंट फ़ोटोग्राफ़िक एक्सपर्ट्स ग्रुप (JPEG) छवि फ़ॉर्मेट का प्रतिनिधित्व करने वाले [ImageFormat](./) वस्तु के लिए एक साझा पॉइंटर लौटाता है। |
| static [get_MemoryBmp](./get_memorybmp/)() | मेमोरी में बिटमैप के फ़ॉर्मेट का प्रतिनिधित्व करने वाले [ImageFormat](./) वस्तु के लिए एक साझा पॉइंटर लौटाता है। |
| static [get_Png](./get_png/)() | W3C पोर्टेबल नेटवर्क [Graphics](../../system.drawing/graphics/) (PNG) छवि फ़ॉर्मेट का प्रतिनिधित्व करने वाले [ImageFormat](./) वस्तु के लिए एक साझा पॉइंटर लौटाता है। |
| static [get_Tiff](./get_tiff/)() | टैग्ड [Image](../../system.drawing/image/) फ़ाइल फ़ॉर्मेट (TIFF) छवि फ़ॉर्मेट का प्रतिनिधित्व करने वाले [ImageFormat](./) वस्तु के लिए एक साझा पॉइंटर लौटाता है। |
| static [get_Wmf](./get_wmf/)() | [Windows](../../system.windows/) मेटाफाइल (WMF) छवि फ़ॉर्मेट का प्रतिनिधित्व करने वाले [ImageFormat](./) वस्तु के लिए एक साझा पॉइंटर लौटाता है। |
| [ImageFormat](./imageformat/)(const System::Guid\&) | निर्दिष्ट GUID से जुड़े छवि फ़ॉर्मेट का प्रतिनिधित्व करने वाले [ImageFormat](./) क्लास का एक इंस्टेंस बनाता है। |
| virtual [ToString](./tostring/)() const | इस [ImageFormat](./) वस्तु को मानव-पठनीय स्ट्रिंग में परिवर्तित करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
