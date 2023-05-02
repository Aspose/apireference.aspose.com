---
title: Class Bitmap
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Bitmap कक्ष. एक बटमैप क एनकैप्सुलेट करत है जसमें एक ग्रफक्स छव और इसक वशेषतओं के लए पक्सेल डेट हत है एBitmap एक वस्तु है जसक उपयग पक्सेल डेट द्वर परभषत छवयं के सथ कम करने के लए कय जत है
type: docs
weight: 40
url: /hi/net/system.drawing/bitmap/
---
## Bitmap class

एक बिटमैप को एनकैप्सुलेट करता है, जिसमें एक ग्राफिक्स छवि और इसकी विशेषताओं के लिए पिक्सेल डेटा होता है। ए`Bitmap` एक वस्तु है जिसका उपयोग पिक्सेल डेटा द्वारा परिभाषित छवियों के साथ काम करने के लिए किया जाता है।

```csharp
public class Bitmap : Image
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Bitmap](bitmap/#constructor_3)(Image) | का एक नया उदाहरण प्रारंभ करता है`Bitmap` वर्ग निर्दिष्ट मौजूदा छवि से. |
| [Bitmap](bitmap/#constructor_6)(Stream) | का एक नया उदाहरण प्रारंभ करता है`Bitmap` निर्दिष्ट डेटा स्ट्रीम से वर्ग। |
| [Bitmap](bitmap/#constructor_8)(string) | का एक नया उदाहरण प्रारंभ करता है`Bitmap` वर्ग निर्दिष्ट फ़ाइल से. |
| [Bitmap](bitmap/#constructor_5)(Image, Size) | का एक नया उदाहरण प्रारंभ करता है`Bitmap`निर्दिष्ट मौजूदा छवि से वर्ग, निर्दिष्ट आकार तक बढ़ाया गया। |
| [Bitmap](bitmap/#constructor)(int, int) | का एक नया उदाहरण प्रारंभ करता है`Bitmap` निर्दिष्ट आकार के साथ वर्ग। |
| [Bitmap](bitmap/#constructor_7)(Stream, bool) | का एक नया उदाहरण प्रारंभ करता है`Bitmap` निर्दिष्ट डेटा स्ट्रीम से वर्ग। |
| [Bitmap](bitmap/#constructor_9)(string, bool) | का एक नया उदाहरण प्रारंभ करता है`Bitmap` वर्ग निर्दिष्ट फ़ाइल से. |
| [Bitmap](bitmap/#constructor_4)(Image, int, int) | का एक नया उदाहरण प्रारंभ करता है`Bitmap` निर्दिष्ट मौजूदा छवि से वर्ग, निर्दिष्ट आकार तक बढ़ाया गया। |
| [Bitmap](bitmap/#constructor_2)(int, int, PixelFormat) | का एक नया उदाहरण प्रारंभ करता है`Bitmap` वर्ग निर्दिष्ट आकार और प्रारूप के साथ। |
| [Bitmap](bitmap/#constructor_1)(int, int, int, PixelFormat, int[]) | का एक नया उदाहरण प्रारंभ करता है`Bitmap` वर्ग निर्दिष्ट आकार और पिक्सेल डेटा के साथ। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | बिटवाइज़ संयोजन का प्रतिनिधित्व करने वाला पूर्णांक प्राप्त करता है[`ImageFlags`](../../system.drawing.imaging/imageflags/) इस छवि के लिए. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist/) { get; } | GUID की एक सरणी प्राप्त करता है जो इसके भीतर फ्रेम के आयामों का प्रतिनिधित्व करता हैImage . |
| override [Height](../../system.drawing/bitmap/height/) { get; } | इस बिटमैप की ऊंचाई पिक्सेल में प्राप्त करता है. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | इसका हॉरिजॉन्टल रिजॉल्यूशन पिक्सल प्रति इंच में मिलता हैImage . |
| override [Palette](../../system.drawing/bitmap/palette/) { get; set; } | इसके लिए उपयोग किए जाने वाले रंग पैलेट को प्राप्त या सेट करता हैImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | इस छवि की चौड़ाई और ऊंचाई प्राप्त करता है। |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat/) { get; } | इसके लिए पिक्सेल प्रारूप प्राप्त करता हैImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist/) { get; } | इसमें संग्रहीत संपत्ति वस्तुओं की आईडी प्राप्त करता हैImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems/) { get; } | इसमें संग्रहीत सभी संपत्ति आइटम (मेटाडेटा के टुकड़े) प्राप्त करता हैImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat/) { get; } | इसका फ़ाइल स्वरूप प्राप्त करता हैImage . |
| [Size](../../system.drawing/image/size/) { get; } | इस इमेज की चौड़ाई और ऊंचाई पिक्सेल में प्राप्त करता है. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | किसी वस्तु को प्राप्त या सेट करता है जो छवि के बारे में अतिरिक्त डेटा प्रदान करता है। |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | इसमें से पिक्सेल प्रति इंच में लंबवत रिज़ॉल्यूशन प्राप्त करता हैImage . |
| override [Width](../../system.drawing/bitmap/width/) { get; } | इस बिटमैप की पिक्सेल में चौड़ाई प्राप्त करता है. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | इसकी सटीक प्रति बनाता हैImage . |
| [Clone](../../system.drawing/bitmap/clone/#clone)(Rectangle, PixelFormat) | इसके सेक्शन की कॉपी बनाता हैBitmap द्वारा परिभाषितRectangle structure और एक निर्दिष्ट के साथPixelFormat गणना. |
| [Clone](../../system.drawing/bitmap/clone/#clone_1)(RectangleF, PixelFormat) | इसके सेक्शन की कॉपी बनाता हैBitmap एक निर्दिष्ट के साथ परिभाषितPixelFormat गणना. |
| virtual [Dispose](../../system.drawing/image/dispose/)() | इस छवि द्वारा उपयोग किए गए सभी संसाधनों को रिलीज़ करता है। |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | निर्दिष्ट इकाई में छवि की सीमा प्राप्त करता है। |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | निर्दिष्ट आयाम के फ्रेम की संख्या देता है। |
| [GetPixel](../../system.drawing/bitmap/getpixel/)(int, int) | इसमें निर्दिष्ट पिक्सेल का रंग प्राप्त करता हैBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem/)(int) | इससे निर्दिष्ट संपत्ति आइटम प्राप्त करता हैImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | इसके लिए एक थंबनेल लौटाता हैImage . |
| [LockBits](../../system.drawing/bitmap/lockbits/)(Rectangle, ImageLockMode, PixelFormat) | ताले aBitmap सिस्टम मेमोरी में. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent)() | इसके लिए निर्दिष्ट रंग को पारदर्शी बनाता हैBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent_1)(Color) | इसके लिए निर्दिष्ट रंग को पारदर्शी बनाता हैBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels/)(int[]) | दिए गए सरणी में ARGB32 प्रारूप में बिटमैप पिक्सेल पढ़ता है। |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem/)(int) | इसमें से निर्दिष्ट संपत्ति आइटम को हटाता हैImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip/)(RotateFlipType) | यह विधि घूमती है, फ़्लिप करती है, या घुमाती है और फ़्लिप करती हैImage . |
| [Save](../../system.drawing/image/save/)(string) | इसे सहेजता हैImageनिर्दिष्ट फ़ाइल या स्ट्रीम के लिए. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | इस छवि को निर्दिष्ट प्रारूप में निर्दिष्ट स्ट्रीम में सहेजता है। |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | इसे सहेजता हैImage निर्दिष्ट प्रारूप में निर्दिष्ट फ़ाइल के लिए। |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | इस छवि को निर्दिष्ट एन्कोडर और छवि एन्कोडर पैरामीटर के साथ निर्दिष्ट स्ट्रीम में सहेजता है। |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | इसे सहेजता हैImage निर्दिष्ट फ़ाइल के लिए, निर्दिष्ट एन्कोडर और छवि-एनकोडर पैरामीटर के साथ. |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | छवि में से किसी एक को पिछली कॉल में निर्दिष्ट फ़ाइल या स्ट्रीम में एक फ्रेम जोड़ता है। (...) विधियों को सहेजें। |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | इमेज.सेव(...) विधियों में से किसी एक के पिछले कॉल में निर्दिष्ट फ़ाइल या स्ट्रीम में एक फ्रेम जोड़ता है। |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | आयाम और अनुक्रमणिका द्वारा निर्दिष्ट फ्रेम का चयन करता है। |
| [SetPixel](../../system.drawing/bitmap/setpixel/)(int, int, Color) | इसमें निर्दिष्ट पिक्सेल का रंग सेट करता हैBitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem/)(PropertyItem) | इसमें एक प्रॉपर्टी आइटम (मेटाडेटा का टुकड़ा) स्टोर करता हैImage . |
| [SetResolution](../../system.drawing/bitmap/setresolution/)(float, float) | इसके लिए संकल्प सेट करता हैBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits/)(BitmapData) | इसे अनलॉक करता हैBitmap सिस्टम मेमोरी से. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels/)(int[]) | पिक्सेल को बिटमैप में लिखता है। |

### यह सभी देखें

* class [Image](../image/)
* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


