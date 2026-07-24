---
title: "System::Drawing::Bitmap class"
linktitle: "Bitmap"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Bitmap वर्ग। GDI+ बिटमैप छवि का प्रतिनिधित्व करता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 100
url: /hi/cpp/system.drawing/bitmap/
---
## Bitmap class


GDI+ बिटमैप छवि का प्रतिनिधित्व करता है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Bitmap : public System::Drawing::Image
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | पिक्सेल प्रोसेसिंग मोड को सक्षम करता है। |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | निर्दिष्ट मौजूदा छवि से एक नया [Bitmap](./) ऑब्जेक्ट बनाता है। |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | निर्दिष्ट स्ट्रीम से एक नया [Bitmap](./) ऑब्जेक्ट बनाता है। |
| [Bitmap](./bitmap/)(const String\&) | निर्दिष्ट फ़ाइल से एक नया [Bitmap](./) ऑब्जेक्ट बनाता है। |
| [Bitmap](./bitmap/)(const String\&, bool) | निर्दिष्ट फ़ाइल से एक नया [Bitmap](./) ऑब्जेक्ट बनाता है। |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | निर्दिष्ट चौड़ाई, ऊँचाई, पिक्सेल फ़ॉर्मेट और पिक्सेल डेटा के साथ एक बिटमैप छवि का प्रतिनिधित्व करने वाला नया [Bitmap](./) ऑब्जेक्ट बनाता है। |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | निर्दिष्ट मौजूदा छवि से, निर्दिष्ट आकार में स्केल किया हुआ, एक नया [Bitmap](./) ऑब्जेक्ट बनाता है। |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | निर्दिष्ट मौजूदा छवि से, चौड़ाई और ऊँचाई को निर्दिष्ट मानों में स्केल किया हुआ, एक नया [Bitmap](./) ऑब्जेक्ट बनाता है। |
| [Clone](./clone/)() override | वर्तमान वस्तु की एक प्रति बनाता है। |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई बिटमैप छवि के एक क्षेत्र की प्रति का प्रतिनिधित्व करने वाला एक [Bitmap](./) ऑब्जेक्ट बनाता है। |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई बिटमैप छवि के एक क्षेत्र की प्रति का प्रतिनिधित्व करने वाला एक [Bitmap](./) ऑब्जेक्ट बनाता है। |
| [ComputeHash](./computehash/)() | SHA1 हैश मान की गणना करता है। |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | निर्दिष्ट बिटमैप छवि की एक प्रति बनाता है जिसमें पिक्सेल फ़ॉर्मेट Format32bppArgb में बदल दिया गया है। |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | पिक्सेल प्रोसेसिंग मोड को अक्षम करता है। |
| [get_Height](./get_height/)() const override | छवि की ऊँचाई पिक्सेल में लौटाता है। |
| [get_Palette](./get_palette/)() const override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि द्वारा उपयोग की गई रंग पैलेट लौटाता है। |
| [get_PixelFormat](./get_pixelformat/)() const override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि का पिक्सेल फ़ॉर्मेट लौटाता है। |
| [get_RawFormat](./get_rawformat/)() const override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि का फ़ाइल फ़ॉर्मेट लौटाता है। |
| [get_Width](./get_width/)() const override | छवि की चौड़ाई पिक्सेल में लौटाता है। |
| [GetHbitmap](./gethbitmap/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए बिटमैप से एक GDI बिटमैप ऑब्जेक्ट बनाता है। |
| [GetPixel](./getpixel/)(int, int) | निर्दिष्ट पिक्सेल का रंग लौटाता है. |
| [GetSkBitmap](./getskbitmap/)() const override | अधोस्तित SkBitmap ऑब्जेक्ट के लिए एक रॉ पॉइंटर लौटाता है. |
| [IsMultiImage](./ismultiimage/)() const override | मूल फ़ॉर्मेट मल्टी-इमेज है या नहीं लौटाता है। |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | एक [Bitmap](./) को सिस्टम मेमोरी में लॉक करता है. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | एक [Bitmap](./) को सिस्टम मेमोरी में लॉक करता है. |
| [MakeTransparent](./maketransparent/)(Color) | निर्दिष्ट रंग वाले सभी पिक्सेल का रंग पारदर्शी में बदलता है. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए छवि के पिक्सेल के रंगों को प्री‑मल्टिप्लाई करता है. |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | छवि को 90 डिग्री के गुणक तक घुमाता है और फ़्लिप करता है. |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व की गई छवि द्वारा उपयोग की जाने वाली रंग पैलेट सेट करता है। |
| [SetPixel](./setpixel/)(int, int, Color) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए बिटमैप छवि में निर्दिष्ट पिक्सेल का रंग सेट करता है. |
| [SetResolution](./setresolution/)(float, float) | छवि का रिज़ॉल्यूशन सेट करता है. |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | निर्दिष्ट बिटमैप को सिस्टम मेमोरी से अनलॉक करता है. |
## संबंधित देखें

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
