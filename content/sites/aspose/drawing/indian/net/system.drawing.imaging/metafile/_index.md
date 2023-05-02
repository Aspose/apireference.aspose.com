---
title: Class Metafile
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Imaging.Metafile कक्ष. एक ग्रफक मेटफइल क परभषत करत है एक मेटफइल में रकर्ड हते हैं ज ग्रफक्स ऑपरेशंस के अनुक्रम क वर्णन करते हैं जसे रकर्ड कय ज सकत है नर्मत और प्ले बैक प्रदर्शत कय ज सकत है यह क्लस इनहेरट करने यग्य नहं है
type: docs
weight: 800
url: /hi/net/system.drawing.imaging/metafile/
---
## Metafile class

एक ग्राफिक मेटाफाइल को परिभाषित करता है। एक मेटाफाइल में रिकॉर्ड होते हैं जो ग्राफिक्स ऑपरेशंस के अनुक्रम का वर्णन करते हैं जिसे रिकॉर्ड किया जा सकता है (निर्मित) और प्ले बैक (प्रदर्शित) किया जा सकता है। यह क्लास इनहेरिट करने योग्य नहीं है।

```csharp
public sealed class Metafile : Image
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Metafile](metafile/#constructor_2)(Stream) | का एक नया उदाहरण प्रारंभ करता है`Metafile` निर्दिष्ट डेटा स्ट्रीम से वर्ग। |
| [Metafile](metafile/#constructor_6)(string) | का एक नया उदाहरण प्रारंभ करता है`Metafile` वर्ग निर्दिष्ट फ़ाइल नाम से. |
| [Metafile](metafile/#constructor)(IntPtr, bool) | का एक नया उदाहरण प्रारंभ करता है`Metafile` वर्ग निर्दिष्ट हैंडल से. |
| [Metafile](metafile/#constructor_1)(IntPtr, EmfType) | का एक नया उदाहरण प्रारंभ करता है`Metafile` क्लास निर्दिष्ट हैंडल से डिवाइस संदर्भ और aEmfTypeगणना जो के प्रारूप को निर्दिष्ट करती हैMetafile . |
| [Metafile](metafile/#constructor_3)(Stream, IntPtr) | का एक नया उदाहरण प्रारंभ करता है`Metafile` वर्ग निर्दिष्ट डेटा स्ट्रीम से और एक डिवाइस संदर्भ के लिए एक विंडोज हैंडल। /&gt;. |
| [Metafile](metafile/#constructor_7)(string, IntPtr) | का एक नया उदाहरण प्रारंभ करता है`Metafile` वर्ग निर्दिष्ट फ़ाइल नाम से. |
| [Metafile](metafile/#constructor_4)(Stream, IntPtr, EmfType) | का एक नया उदाहरण प्रारंभ करता है`Metafile` वर्ग निर्दिष्ट डेटा स्ट्रीम से, एक डिवाइस संदर्भ के लिए एक विंडोज़ हैंडल, और एकEmfType Enumeration जो के प्रारूप को निर्दिष्ट करता हैMetafile . |
| [Metafile](metafile/#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | का एक नया उदाहरण प्रारंभ करता है`Metafile` वर्ग निर्दिष्ट डेटा स्ट्रीम से, एक डिवाइस संदर्भ के लिए एक विंडोज़ हैंडल, और एकEmfType Enumeration जो के प्रारूप को निर्दिष्ट करता हैMetafile . |

## गुण

| नाम | विवरण |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | बिटवाइज़ संयोजन का प्रतिनिधित्व करने वाला पूर्णांक प्राप्त करता है[`ImageFlags`](../imageflags/) इस छवि के लिए. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist/) { get; } | GUID की एक सरणी प्राप्त करता है जो इसके भीतर फ्रेम के आयामों का प्रतिनिधित्व करता हैImage . |
| override [Height](../../system.drawing.imaging/metafile/height/) { get; } | इसकी ऊंचाई पिक्सेल में प्राप्त करता हैMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | इसका हॉरिजॉन्टल रिजॉल्यूशन पिक्सल प्रति इंच में मिलता हैImage . |
| override [Palette](../../system.drawing.imaging/metafile/palette/) { get; set; } | इसके लिए उपयोग किए जाने वाले रंग पैलेट को प्राप्त या सेट करता हैImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | इस छवि की चौड़ाई और ऊंचाई प्राप्त करता है। |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat/) { get; } | इसके लिए पिक्सेल प्रारूप प्राप्त करता हैImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist/) { get; } | इसमें संग्रहीत संपत्ति वस्तुओं की आईडी प्राप्त करता हैImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems/) { get; } | इसमें संग्रहीत सभी संपत्ति आइटम (मेटाडेटा के टुकड़े) प्राप्त करता हैImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat/) { get; } | इसका फ़ाइल स्वरूप प्राप्त करता हैImage . |
| [Size](../../system.drawing/image/size/) { get; } | इस इमेज की चौड़ाई और ऊंचाई पिक्सेल में प्राप्त करता है. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | किसी वस्तु को प्राप्त या सेट करता है जो छवि के बारे में अतिरिक्त डेटा प्रदान करता है। |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | इसमें से पिक्सेल प्रति इंच में लंबवत रिज़ॉल्यूशन प्राप्त करता हैImage . |
| override [Width](../../system.drawing.imaging/metafile/width/) { get; } | पिक्सल में इसकी चौड़ाई प्राप्त करता हैMetafile . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | इसकी सटीक प्रति बनाता हैImage . |
| virtual [Dispose](../../system.drawing/image/dispose/)() | इस छवि द्वारा उपयोग किए गए सभी संसाधनों को रिलीज़ करता है। |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | निर्दिष्ट इकाई में छवि की सीमा प्राप्त करता है। |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | निर्दिष्ट आयाम के फ्रेम की संख्या देता है। |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile/)() | उन्नत करने के लिए Windows हैंडल लौटाता हैMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/)() | लौटाता हैMetafileHeader इससे जुड़ा हुआ हैMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem/)(int) | इससे निर्दिष्ट संपत्ति आइटम प्राप्त करता हैImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | इसके लिए एक थंबनेल लौटाता हैImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord/)(EmfPlusRecordType, int, int, byte[]) | एक व्यक्तिगत मेटाफ़ाइल रिकॉर्ड चलाता है। |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem/)(int) | इसमें से निर्दिष्ट संपत्ति आइटम को हटाता हैImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip/)(RotateFlipType) | यह विधि घूमती है, फ़्लिप करती है, या घुमाती है और फ़्लिप करती हैImage . |
| [Save](../../system.drawing/image/save/)(string) | इसे सहेजता हैImageनिर्दिष्ट फ़ाइल या स्ट्रीम के लिए. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | इस छवि को निर्दिष्ट प्रारूप में निर्दिष्ट स्ट्रीम में सहेजता है। |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | इसे सहेजता हैImage निर्दिष्ट प्रारूप में निर्दिष्ट फ़ाइल के लिए। |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | इस छवि को निर्दिष्ट एन्कोडर और छवि एन्कोडर पैरामीटर के साथ निर्दिष्ट स्ट्रीम में सहेजता है। |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | इसे सहेजता हैImage निर्दिष्ट फ़ाइल के लिए, निर्दिष्ट एन्कोडर और छवि-एनकोडर पैरामीटर के साथ. |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | छवि में से किसी एक को पिछली कॉल में निर्दिष्ट फ़ाइल या स्ट्रीम में एक फ्रेम जोड़ता है। (...) विधियों को सहेजें। |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | इमेज.सेव(...) विधियों में से किसी एक के पिछले कॉल में निर्दिष्ट फ़ाइल या स्ट्रीम में एक फ्रेम जोड़ता है। |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | आयाम और अनुक्रमणिका द्वारा निर्दिष्ट फ्रेम का चयन करता है। |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem/)(PropertyItem) | इसमें एक प्रॉपर्टी आइटम (मेटाडेटा का टुकड़ा) स्टोर करता हैImage . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader)(Stream) | लौटाता हैMetafileHeader निर्दिष्ट के साथ संबद्धMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader_1)(string) | लौटाता हैMetafileHeader निर्दिष्ट के साथ संबद्धMetafile . |

### यह सभी देखें

* class [Image](../../system.drawing/image/)
* नाम स्थान [System.Drawing.Imaging](../../system.drawing.imaging/)
* सभा [Aspose.Drawing](../../)


