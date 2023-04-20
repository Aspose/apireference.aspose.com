---
title: Class Color
second_title: .NET API संदर्भ के लिए Aspose.SVG
description: Aspose.Svg.Drawing.Color कक्ष. कलर क्लस आपक रंगं क रेडग्रनब्लू RGB वैल्यू ह्यूसेचुरेशनल्युमनसट HSL वैल्यू ह्यूसेचुरेशनवैल्यू HSV वैल्यू ह्यूव्हइटनेसब्लैकनेस HWB के रूप में नर्दष्ट करने देत है  मन हल्कपनAB LAB मन चमकक्रमह्यू LCH मन सयनमैजेंटपलक CMYK मन प्रकृतक रंग NCOL मन य रंग के नम के सथ . परदर्शत दर्शने के लए एक अल्फ चैनल भ उपलब्ध है
type: docs
weight: 1390
url: /hi/net/aspose.svg.drawing/color/
---
## Color class

कलर क्लास आपको रंगों को रेड-ग्रीन-ब्लू (RGB) वैल्यू, ह्यू-सेचुरेशन-ल्युमिनोसिटी (HSL) वैल्यू, ह्यू-सेचुरेशन-वैल्यू (HSV) वैल्यू, ह्यू-व्हाइटनेस-ब्लैकनेस (HWB) के रूप में निर्दिष्ट करने देता है ) मान, हल्कापन-AB (LAB) मान, चमक-क्रोमा-ह्यू (LCH) मान, सियान-मैजेंटा-पीला-की (CMYK) मान, प्राकृतिक रंग (NCOL) मान, या रंग के नाम के साथ . पारदर्शिता दर्शाने के लिए एक अल्फा चैनल भी उपलब्ध है।

```csharp
public class Color
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Color](color/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`Color` वर्ग. डिफ़ॉल्ट रंग काला है। |
| [Color](color/#constructor_1)(byte, byte, byte) | का एक नया उदाहरण प्रारंभ करता है`Color`class. सभी रंग घटक 0-255 की सीमा में होने चाहिए। |
| [Color](color/#constructor_5)(float, float, float) | का एक नया उदाहरण प्रारंभ करता है`Color` class. सभी रंग घटक 0-1. की सीमा में होने चाहिए |
| [Color](color/#constructor_3)(int, int, int) | का एक नया उदाहरण प्रारंभ करता है`Color`class. सभी रंग घटक 0-255 की सीमा में होने चाहिए। |
| [Color](color/#constructor_2)(byte, byte, byte, byte) | का एक नया उदाहरण प्रारंभ करता है`Color`class. सभी रंग घटक 0-255 की सीमा में होने चाहिए। |
| [Color](color/#constructor_6)(float, float, float, float) | का एक नया उदाहरण प्रारंभ करता है`Color` class. सभी रंग घटक 0-1. की सीमा में होने चाहिए |
| [Color](color/#constructor_4)(int, int, int, int) | का एक नया उदाहरण प्रारंभ करता है`Color`class. सभी रंग घटक 0-255 की सीमा में होने चाहिए। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Alpha](../../aspose.svg.drawing/color/alpha/) { get; } | रंग के अल्फा घटक का प्रतिनिधित्व करता है। |
| [Blue](../../aspose.svg.drawing/color/blue/) { get; } | रंग के नीले घटक का प्रतिनिधित्व करता है। |
| [Green](../../aspose.svg.drawing/color/green/) { get; } | रंग के हरे घटक का प्रतिनिधित्व करता है। |
| [Red](../../aspose.svg.drawing/color/red/) { get; } | रंग के लाल घटक का प्रतिनिधित्व करता है |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [FromCmyk](../../aspose.svg.drawing/color/fromcmyk/)(float, float, float, float) | अनुरोधित सियान, मैजेंटा, पीला, कुंजी (काला) मानों के साथ एक नया रंग लौटाता है। |
| static [FromCmyka](../../aspose.svg.drawing/color/fromcmyka/)(float, float, float, float, float) | अनुरोधित सियान, मैजेंटा, पीला, कुंजी (काला), अल्फा मानों के साथ एक नया रंग लौटाता है। |
| static [FromGray](../../aspose.svg.drawing/color/fromgray/)(float) | अनुरोधित ग्रे मान के साथ एक नया रंग लौटाता है। |
| static [FromHsl](../../aspose.svg.drawing/color/fromhsl/)(float, float, float) | अनुरोधित रंग, संतृप्ति, संतृप्ति मूल्यों के साथ एक नया रंग देता है। |
| static [FromHsla](../../aspose.svg.drawing/color/fromhsla/)(float, float, float, float) | अनुरोधित रंग, संतृप्ति, संतृप्ति, अल्फा मानों के साथ एक नया रंग लौटाता है। |
| static [FromHsv](../../aspose.svg.drawing/color/fromhsv/)(float, float, float) | अनुरोधित रंग, संतृप्ति, मान के साथ एक नया रंग लौटाता है। |
| static [FromHsva](../../aspose.svg.drawing/color/fromhsva/)(float, float, float, float) | अनुरोधित रंग, संतृप्ति, मान, अल्फा के साथ एक नया रंग लौटाता है। |
| static [FromHwb](../../aspose.svg.drawing/color/fromhwb/)(float, float, float) | अनुरोधित रंग, सफेदी, कालापन मूल्यों के साथ एक नया रंग देता है। |
| static [FromHwba](../../aspose.svg.drawing/color/fromhwba/)(float, float, float, float) | अनुरोधित रंग, सफेदी, कालापन मूल्यों के साथ एक नया रंग देता है। |
| static [FromInt](../../aspose.svg.drawing/color/fromint/)(int) | अनुरोधित ARGB मान के साथ एक नया रंग लौटाता है। |
| static [FromLab](../../aspose.svg.drawing/color/fromlab/)(float, float, float) | अनुरोधित हल्कापन, ए, बी मान के साथ एक नया रंग लौटाता है। |
| static [FromLaba](../../aspose.svg.drawing/color/fromlaba/)(float, float, float, float) | अनुरोधित हल्कापन, ए, बी, अल्फा मानों के साथ एक नया रंग लौटाता है। |
| static [FromLch](../../aspose.svg.drawing/color/fromlch/)(float, float, float) | अनुरोधित ल्यूमिनेंस, क्रोमा, ह्यू वैल्यू के साथ एक नया रंग लौटाता है। |
| static [FromLcha](../../aspose.svg.drawing/color/fromlcha/)(float, float, float, float) | अनुरोधित ल्यूमिनेंस, क्रोमा, ह्यू, अल्फा मानों के साथ एक नया रंग लौटाता है। |
| static [FromOklab](../../aspose.svg.drawing/color/fromoklab/)(float, float, float) | OKLAB मॉडल के लिए अनुरोधित हल्केपन, A, B मानों के साथ एक नया रंग लौटाता है। |
| static [FromOklaba](../../aspose.svg.drawing/color/fromoklaba/)(float, float, float, float) | OKLAB मॉडल के लिए अनुरोधित हल्केपन, A, B, अल्फा मानों के साथ एक नया रंग लौटाता है। |
| static [FromOklch](../../aspose.svg.drawing/color/fromoklch/)(float, float, float) | OKLAB मॉडल के लिए अनुरोधित ल्यूमिनेंस, क्रोमा, ह्यू वैल्यू के साथ एक नया रंग लौटाता है। |
| static [FromOklcha](../../aspose.svg.drawing/color/fromoklcha/)(float, float, float, float) | OKLAB मॉडल के लिए अनुरोधित ल्यूमिनेंस, क्रोमा, ह्यू, अल्फा मानों के साथ एक नया रंग लौटाता है। |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb)(byte, byte, byte) | अनुरोधित जीईडी, हरे, नीले मानों के साथ एक नया रंग लौटाता है। सभी रंग घटक 0-255 की सीमा में होने चाहिए। |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_2)(float, float, float) | अनुरोधित जीईडी, हरे, नीले मानों के साथ एक नया रंग लौटाता है। सभी रंग घटक 0-1 की सीमा में होने चाहिए। |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb/#fromrgb_1)(int, int, int) | अनुरोधित जीईडी, हरे, नीले मानों के साथ एक नया रंग लौटाता है। सभी रंग घटक 0-255 की सीमा में होने चाहिए। |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba)(byte, byte, byte, byte) | अनुरोधित ged, हरा, नीला, अल्फा मानों के साथ एक नया रंग लौटाता है। सभी रंग घटक 0-255 की सीमा में होने चाहिए। |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_2)(float, float, float, float) | अनुरोधित जीईडी, हरा, नीला, अल्फा मानों के साथ एक नया रंग लौटाता है। सभी रंग घटक 0-1 की सीमा में होने चाहिए। |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba/#fromrgba_1)(int, int, int, int) | अनुरोधित ged, हरा, नीला, अल्फा मानों के साथ एक नया रंग लौटाता है। सभी रंग घटक 0-255 की सीमा में होने चाहिए। |
| static [FromString](../../aspose.svg.drawing/color/fromstring/)(string) | सीएसएस रंग वाली स्ट्रिंग को पार करता है और एक नया रंग लौटाता है। |
| static [FromUint](../../aspose.svg.drawing/color/fromuint/)(uint) | अनुरोधित ARGB मान के साथ एक नया रंग लौटाता है। |
| [AddLuminosity](../../aspose.svg.drawing/color/addluminosity/)(float) | इसकी चमक और डेल्टा मान के योग के साथ रंग की प्रति बनाता है। |
| [Convert](../../aspose.svg.drawing/color/convert/)(ColorModel) | निर्दिष्ट रंग मॉडल के प्रारूप में रंग घटक लौटाता है। |
| override [Equals](../../aspose.svg.drawing/color/equals/)(object) | निर्धारित करता है कि निर्दिष्ट किया गया है या नहीं`Color` इस उदाहरण के बराबर है. |
| [GetComplementary](../../aspose.svg.drawing/color/getcomplementary/)() | एक नया रंग लौटाता है जो मूल से रंग चक्र के विपरीत दिशा में होता है। |
| override [GetHashCode](../../aspose.svg.drawing/color/gethashcode/)() | एक हैश कोड लौटाता है। |
| [GetHue](../../aspose.svg.drawing/color/gethue/)() | रंग का रंग देता है. |
| [GetLuminosity](../../aspose.svg.drawing/color/getluminosity/)() | रंग की चमक देता है. |
| [GetSaturation](../../aspose.svg.drawing/color/getsaturation/)() | रंग की संतृप्ति लौटाता है। |
| [ToInt](../../aspose.svg.drawing/color/toint/)() | रंग ARGB घटकों को int. में एन्कोड करता है |
| [ToName](../../aspose.svg.drawing/color/toname/)() | रंग का नाम लौटाता है यदि यह सीएसएस नामित रंगों की सूची में रंग से मेल खाता है, या एक खाली स्ट्रिंग है। |
| [ToNaturalColorString](../../aspose.svg.drawing/color/tonaturalcolorstring/)(int) | रंग से दूरी (प्रतिशत में) निर्दिष्ट करने के लिए एक रंग अक्षर का उपयोग करके एक प्राकृतिक रंग (NCol) निर्दिष्ट रंग लौटाता है। |
| [ToRgbaHexString](../../aspose.svg.drawing/color/torgbahexstring/)() | एक हेक्साडेसिमल रंग देता है जिसके साथ निर्दिष्ट किया गया है: #RRGGBBAA. |
| [ToRgbaString](../../aspose.svg.drawing/color/torgbastring/)() | इसके द्वारा निर्दिष्ट RGBA रंग वाली स्ट्रिंग देता है: rgba(R, G, B, A). |
| [ToRgbHexString](../../aspose.svg.drawing/color/torgbhexstring/)() | एक हेक्साडेसिमल रंग देता है जिसके साथ निर्दिष्ट किया गया है: #RRGGBB. |
| [ToRgbString](../../aspose.svg.drawing/color/torgbstring/)() | एक स्ट्रिंग देता है जिसमें आरजीबी रंग निर्दिष्ट होता है: rgb(R, G, B). |
| override [ToString](../../aspose.svg.drawing/color/tostring/)() | एक स्ट्रिंग लौटाता है जिसमें RGBA घटक मान होते हैं। |
| [ToUint](../../aspose.svg.drawing/color/touint/)() | रंग ARGB घटकों को अहस्ताक्षरित int. में एन्कोड करता है |
| [WithAlpha](../../aspose.svg.drawing/color/withalpha/)(float) | निर्दिष्ट अल्फा घटक के साथ रंग की प्रतिलिपि बनाता है। |
| [WithHue](../../aspose.svg.drawing/color/withhue/)(float) | निर्दिष्ट रंग के साथ रंग की प्रतिलिपि बनाता है. |
| [WithLuminosity](../../aspose.svg.drawing/color/withluminosity/)(float) | निर्दिष्ट चमक के साथ रंग की प्रति बनाता है। |
| [WithSaturation](../../aspose.svg.drawing/color/withsaturation/)(float) | निर्दिष्ट संतृप्ति के साथ रंग की प्रति बनाता है। |

### यह सभी देखें

* नाम स्थान [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* सभा [Aspose.SVG](../../)


