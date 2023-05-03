---
title: Class Image
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Image कक्ष. एक सर आधर वर्ग ज बटमैप और मेटफ़इल अवरह वर्गं के लए कर्यक्षमत प्रदन करत है
type: docs
weight: 580
url: /hi/net/system.drawing/image/
---
## Image class

एक सार आधार वर्ग जो बिटमैप और मेटाफ़ाइल अवरोही वर्गों के लिए कार्यक्षमता प्रदान करता है।

```csharp
public abstract class Image : IDisposable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Image](image/)() | का एक नया उदाहरण प्रारंभ करता है`Image` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | बिटवाइज़ संयोजन का प्रतिनिधित्व करने वाला पूर्णांक प्राप्त करता है[`ImageFlags`](../../system.drawing.imaging/imageflags/) इस छवि के लिए. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist/) { get; } | GUID की एक सरणी प्राप्त करता है जो इसके भीतर फ्रेम के आयामों का प्रतिनिधित्व करता हैImage . |
| abstract [Height](../../system.drawing/image/height/) { get; } | इसकी ऊंचाई पिक्सेल में प्राप्त करता हैImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | इसका हॉरिजॉन्टल रिजॉल्यूशन पिक्सल प्रति इंच में मिलता हैImage . |
| abstract [Palette](../../system.drawing/image/palette/) { get; set; } | इसके लिए उपयोग किए जाने वाले रंग पैलेट को प्राप्त या सेट करता हैImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | इस छवि की चौड़ाई और ऊंचाई प्राप्त करता है। |
| abstract [PixelFormat](../../system.drawing/image/pixelformat/) { get; } | इसके लिए पिक्सेल प्रारूप प्राप्त करता हैImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist/) { get; } | इसमें संग्रहीत संपत्ति वस्तुओं की आईडी प्राप्त करता हैImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems/) { get; } | इसमें संग्रहीत सभी संपत्ति आइटम (मेटाडेटा के टुकड़े) प्राप्त करता हैImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat/) { get; } | इसका फ़ाइल स्वरूप प्राप्त करता हैImage . |
| [Size](../../system.drawing/image/size/) { get; } | इस इमेज की चौड़ाई और ऊंचाई पिक्सेल में प्राप्त करता है. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | किसी वस्तु को प्राप्त या सेट करता है जो छवि के बारे में अतिरिक्त डेटा प्रदान करता है। |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | इसमें से पिक्सेल प्रति इंच में लंबवत रिज़ॉल्यूशन प्राप्त करता हैImage . |
| abstract [Width](../../system.drawing/image/width/) { get; } | पिक्सल में इसकी चौड़ाई प्राप्त करता हैImage . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile/)(string) | एक बनाता हैImage निर्दिष्ट फ़ाइल से. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream)(Stream) | एक बनाता हैImageनिर्दिष्ट डेटा स्ट्रीम से. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream_1)(Stream, bool) | एक बनाता हैImage निर्दिष्ट डेटा स्ट्रीम से, वैकल्पिक रूप से उस स्ट्रीम में एम्बेडेड रंग प्रबंधन जानकारी का उपयोग कर रहा है। |
| [Clone](../../system.drawing/image/clone/)() | इसकी सटीक प्रति बनाता हैImage . |
| virtual [Dispose](../../system.drawing/image/dispose/)() | इस छवि द्वारा उपयोग किए गए सभी संसाधनों को रिलीज़ करता है। |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | निर्दिष्ट इकाई में छवि की सीमा प्राप्त करता है। |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | निर्दिष्ट आयाम के फ्रेम की संख्या देता है। |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem/)(int) | इससे निर्दिष्ट संपत्ति आइटम प्राप्त करता हैImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | इसके लिए एक थंबनेल लौटाता हैImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem/)(int) | इसमें से निर्दिष्ट संपत्ति आइटम को हटाता हैImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip/)(RotateFlipType) | यह विधि घूमती है, फ़्लिप करती है, या घुमाती है और फ़्लिप करती हैImage . |
| [Save](../../system.drawing/image/save/#save_2)(string) | इसे सहेजता हैImageनिर्दिष्ट फ़ाइल या स्ट्रीम के लिए. |
| [Save](../../system.drawing/image/save/#save_1)(Stream, ImageFormat) | इस छवि को निर्दिष्ट प्रारूप में निर्दिष्ट स्ट्रीम में सहेजता है। |
| [Save](../../system.drawing/image/save/#save_4)(string, ImageFormat) | इसे सहेजता हैImage निर्दिष्ट प्रारूप में निर्दिष्ट फ़ाइल के लिए। |
| [Save](../../system.drawing/image/save/#save)(Stream, ImageCodecInfo, EncoderParameters) | इस छवि को निर्दिष्ट एन्कोडर और छवि एन्कोडर पैरामीटर के साथ निर्दिष्ट स्ट्रीम में सहेजता है। |
| [Save](../../system.drawing/image/save/#save_3)(string, ImageCodecInfo, EncoderParameters) | इसे सहेजता हैImage निर्दिष्ट फ़ाइल के लिए, निर्दिष्ट एन्कोडर और छवि-एनकोडर पैरामीटर के साथ. |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd_1)(EncoderParameters) | छवि में से किसी एक को पिछली कॉल में निर्दिष्ट फ़ाइल या स्ट्रीम में एक फ्रेम जोड़ता है। (...) विधियों को सहेजें। |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd)(Image, EncoderParameters) | इमेज.सेव(...) विधियों में से किसी एक के पिछले कॉल में निर्दिष्ट फ़ाइल या स्ट्रीम में एक फ्रेम जोड़ता है। |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | आयाम और अनुक्रमणिका द्वारा निर्दिष्ट फ्रेम का चयन करता है। |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem/)(PropertyItem) | इसमें एक प्रॉपर्टी आइटम (मेटाडेटा का टुकड़ा) स्टोर करता हैImage . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap/)(IntPtr) | एक बनाता हैBitmap एक हैंडल से GDI बिटमैप तक. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize/)(PixelFormat) | रंग की गहराई लौटाता है, निर्दिष्ट पिक्सेल प्रारूप में बिट प्रति पिक्सेल की संख्या में. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat/)(PixelFormat) | एक मान लौटाता है जो इंगित करता है कि इसके लिए पिक्सेल प्रारूप है या नहींImage अल्फा जानकारी शामिल है। |

## अन्य सदस्य

| नाम | विवरण |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort/) | यह निर्धारित करने के लिए कॉलबैक विधि प्रदान करता है कि कब[`GetThumbnailImage`](./getthumbnailimage/) विधि समय से पहले निष्पादन को रद्द कर देना चाहिए। |

### यह सभी देखें

* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


