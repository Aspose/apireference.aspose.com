---
title: Class Font
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Font कक्ष. फन्ट फेस आकर और शैल वशेषतओं सहत पठ के लए एक वशेष प्ररूप क परभषत करत है यह वर्ग वरसत में नहं मल सकत है
type: docs
weight: 500
url: /hi/net/system.drawing/font/
---
## Font class

फॉन्ट फेस, आकार और शैली विशेषताओं सहित पाठ के लिए एक विशेष प्रारूप को परिभाषित करता है। यह वर्ग विरासत में नहीं मिल सकता है।

```csharp
public sealed class Font : IDisposable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Font](font/#constructor)(Font, FontStyle) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग निर्दिष्ट मौजूदा का उपयोग करता हैFont औरFontStyle गणना .. |
| [Font](font/#constructor_1)(FontFamily, float) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग. |
| [Font](font/#constructor_7)(string, float) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग एक निर्दिष्ट आकार का उपयोग कर। |
| [Font](font/#constructor_2)(FontFamily, float, FontStyle) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग एक निर्दिष्ट आकार और शैली का उपयोग कर रहा है.. |
| [Font](font/#constructor_6)(FontFamily, float, GraphicsUnit) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग एक निर्दिष्ट आकार और इकाई का उपयोग कर। शैली को सेट करता हैRegular . |
| [Font](font/#constructor_8)(string, float, FontStyle) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग एक निर्दिष्ट आकार और शैली का उपयोग कर . |
| [Font](font/#constructor_12)(string, float, GraphicsUnit) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग एक निर्दिष्ट आकार और इकाई का उपयोग कर। शैली पर सेट हैRegular . |
| [Font](font/#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग एक निर्दिष्ट आकार, शैली, और इकाई का उपयोग कर। |
| [Font](font/#constructor_9)(string, float, FontStyle, GraphicsUnit) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग एक निर्दिष्ट आकार, शैली, और इकाई का उपयोग कर। |
| [Font](font/#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग एक निर्दिष्ट आकार, शैली, इकाई और वर्ण सेट का उपयोग कर रहा है.. |
| [Font](font/#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | का एक नया उदाहरण प्रारंभ करता है`Font`एक निर्दिष्ट आकार, शैली, इकाई और वर्ण सेट का उपयोग करते हुए वर्ग। |
| [Font](font/#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग एक निर्दिष्ट आकार, शैली, इकाई और वर्ण सेट का उपयोग कर रहा है.. |
| [Font](font/#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | का एक नया उदाहरण प्रारंभ करता है`Font` वर्ग निर्दिष्ट आकार, शैली, इकाई, और वर्ण सेट का उपयोग कर। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Bold](../../system.drawing/font/bold/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यहFont बोल्ड है. |
| [FontFamily](../../system.drawing/font/fontfamily/) { get; } | हो जाता हैFontFamily इससे जुड़ा हुआ हैFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset/) { get; } | एक बाइट मान प्राप्त करता है जो GDI वर्ण सेट को निर्दिष्ट करता है जो कि thisFont उपयोग करता है. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यहFont GDI वर्टिकल फ़ॉन्ट से लिया गया है.. |
| [Height](../../system.drawing/font/height/) { get; } | इस फॉन्ट की लाइन स्पेसिंग प्राप्त करता है। |
| [IsSystemFont](../../system.drawing/font/issystemfont/) { get; } | एक मान प्राप्त करता है जो इंगित करता है कि फ़ॉन्ट सदस्य है या नहींSystemFonts . |
| [Italic](../../system.drawing/font/italic/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यहFont इटैलिक है. |
| [Name](../../system.drawing/font/name/) { get; } | इसके चेहरे का नाम प्राप्त करता हैFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname/) { get; } | मूल रूप से निर्दिष्ट फ़ॉन्ट का नाम प्राप्त करता है। |
| [Size](../../system.drawing/font/size/) { get; } | इसका एम-साइज़ प्राप्त करता हैFont the द्वारा निर्दिष्ट इकाइयों में मापा गयाUnit संपत्ति. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints/) { get; } | इसका एम-साइज़ पॉइंट्स में प्राप्त करता हैFont . |
| [Strikeout](../../system.drawing/font/strikeout/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यहFont फ़ॉन्ट के माध्यम से एक क्षैतिज रेखा निर्दिष्ट करता है। |
| [Style](../../system.drawing/font/style/) { get; } | इसके लिए स्टाइल की जानकारी प्राप्त करता हैFont . |
| [SystemFontName](../../system.drawing/font/systemfontname/) { get; } | सिस्टम फ़ॉन्ट का नाम प्राप्त करता है यदि IsSystemFont गुण सही होता है। |
| [Underline](../../system.drawing/font/underline/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यहFont रेखांकित किया गया है। |
| [Unit](../../system.drawing/font/unit/) { get; } | इसके लिए माप की इकाई प्राप्त करता हैFont . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clone](../../system.drawing/font/clone/)() | इसकी सटीक प्रति बनाता हैFont . |
| [Dispose](../../system.drawing/font/dispose/)() | इसके द्वारा उपयोग किए गए सभी संसाधनों को जारी करता हैFont . |
| override [Equals](../../system.drawing/font/equals/)(object) | इंगित करता है कि निर्दिष्ट वस्तु एक है या नहींFont और समान हैFontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , औरUnit संपत्ति मूल्य इस प्रकार हैFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode/)() | इसके लिए हैश कोड प्राप्त करता हैFont . |
| [GetHeight](../../system.drawing/font/getheight/#getheight)() | इस फॉन्ट की पिक्सल में लाइन स्पेसिंग लौटाता है। |
| [GetHeight](../../system.drawing/font/getheight/#getheight_1)(float) | पिक्सेल में, इसकी ऊँचाई लौटाता हैFontनिर्दिष्ट लंबवत रिज़ॉल्यूशन वाले डिवाइस पर खींचा जाने पर। |
| [GetHeight](../../system.drawing/font/getheight/#getheight_2)(Graphics) | किसी निर्दिष्ट की वर्तमान इकाई में, पंक्ति रिक्ति लौटाता हैGraphics , इस फ़ॉन्ट का। |
| override [ToString](../../system.drawing/font/tostring/)() | इसका एक मानव-पठनीय स्ट्रिंग प्रतिनिधित्व देता हैFont . |

### यह सभी देखें

* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


