---
title: Class Region
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Region कक्ष. आयतं और रस्तं से बने ग्रफ़क आकर के आंतरक भग क वर्णन करत है इस वर्ग क इनहेरट नहं कय ज सकत.
type: docs
weight: 1060
url: /hi/net/system.drawing/region/
---
## Region class

आयतों और रास्तों से बने ग्राफ़िक आकार के आंतरिक भाग का वर्णन करता है। इस वर्ग को इनहेरिट नहीं किया जा सकता.

```csharp
public sealed class Region : IDisposable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Region](region/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`Region` वर्ग. |
| [Region](region/#constructor_1)(GraphicsPath) | का एक नया उदाहरण प्रारंभ करता है`Region` निर्दिष्ट के साथ वर्गGraphicsPath . |
| [Region](region/#constructor_3)(Rectangle) | का एक नया उदाहरण प्रारंभ करता है`Region` निर्दिष्ट से वर्गRectangle संरचना. |
| [Region](region/#constructor_4)(RectangleF) | का एक नया उदाहरण प्रारंभ करता है`Region` निर्दिष्ट से वर्गRectangleF संरचना. |
| [Region](region/#constructor_2)(RegionData) | का एक नया उदाहरण प्रारंभ करता है`Region` निर्दिष्ट डेटा से वर्ग। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clone](../../system.drawing/region/clone/)() | इसकी सटीक प्रति बनाता हैRegion . |
| [Complement](../../system.drawing/region/complement/#complement)(GraphicsPath) | इसे अपडेट करता हैRegion निर्दिष्ट के हिस्से को शामिल करने के लिएGraphicsPath जो इसके साथ प्रतिच्छेद नहीं करता हैRegion . |
| [Complement](../../system.drawing/region/complement/#complement_1)(Rectangle) | इसे अपडेट करता हैRegion निर्दिष्ट के हिस्से को शामिल करने के लिएRectangle structure जो इसके साथ प्रतिच्छेद नहीं करता हैRegion . |
| [Complement](../../system.drawing/region/complement/#complement_2)(RectangleF) | इसे अपडेट करता हैRegion निर्दिष्ट के हिस्से को शामिल करने के लिएRectangleF structure जो इसके साथ प्रतिच्छेद नहीं करता हैRegion . |
| [Complement](../../system.drawing/region/complement/#complement_3)(Region) | इसे अपडेट करता हैRegion निर्दिष्ट के हिस्से को शामिल करने के लिएRegionजो इससे नहीं प्रतिच्छेद नहीं करता हैRegion . |
| [Dispose](../../system.drawing/region/dispose/)() | इसके द्वारा उपयोग किए गए सभी संसाधनों को जारी करता हैRegion . |
| [Equals](../../system.drawing/region/equals/#equals)(Region, Graphics) | परीक्षण करता है कि निर्दिष्ट किया गया है या नहींRegion इसके समान हैRegion निर्दिष्ट आरेखण सतह पर. |
| [Exclude](../../system.drawing/region/exclude/#exclude)(GraphicsPath) | इसे अपडेट करता हैRegion इसके इंटीरियर का केवल वह हिस्सा शामिल करने के लिए जो निर्दिष्ट के साथ प्रतिच्छेद नहीं करता हैGraphicsPath . |
| [Exclude](../../system.drawing/region/exclude/#exclude_1)(Rectangle) | इसे अपडेट करता हैRegion इसके आंतरिक भाग का केवल वह भाग शामिल करने के लिए जो निर्दिष्ट के साथ को प्रतिच्छेद नहीं करता हैRectangle संरचना. |
| [Exclude](../../system.drawing/region/exclude/#exclude_2)(RectangleF) | इसे अपडेट करता हैRegion इसके इंटीरियर का केवल वह हिस्सा शामिल करने के लिए जो निर्दिष्ट के साथ प्रतिच्छेद नहीं करता हैRectangleF संरचना. |
| [Exclude](../../system.drawing/region/exclude/#exclude_3)(Region) | इसे अपडेट करता हैRegion इसके आंतरिक भाग का केवल वह भाग शामिल करने के लिए जो निर्दिष्ट के साथ को प्रतिच्छेद नहीं करता हैRegion . |
| [GetBounds](../../system.drawing/region/getbounds/)(Graphics) | हो जाता हैRectangleF संरचना जो एक आयत का प्रतिनिधित्व करती है जो इसे सीमित करती हैRegion की ड्राइंग सतह परGraphics वस्तु. |
| [GetRegionData](../../system.drawing/region/getregiondata/)() | रिटर्न एRegionData जो इसका वर्णन करने वाली जानकारी का प्रतिनिधित्व करता हैRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans/)(Matrix) | की एक सरणी देता हैRectangleF संरचनाएं जो इसका अनुमान लगाती हैंRegion निर्दिष्ट मैट्रिक्स परिवर्तन लागू होने के बाद। |
| [Intersect](../../system.drawing/region/intersect/#intersect)(GraphicsPath) | इसे अपडेट करता हैRegion निर्दिष्ट के साथ खुद के चौराहे परGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect/#intersect_1)(Rectangle) | इसे अपडेट करता हैRegion निर्दिष्ट के साथ खुद के चौराहे परRectangle संरचना. |
| [Intersect](../../system.drawing/region/intersect/#intersect_2)(RectangleF) | इसे अपडेट करता हैRegion निर्दिष्ट के साथ स्वयं के प्रतिच्छेदन परRectangleF संरचना. |
| [Intersect](../../system.drawing/region/intersect/#intersect_3)(Region) | इसे अपडेट करता हैRegion निर्दिष्ट के साथ खुद के चौराहे परRegion . |
| [IsEmpty](../../system.drawing/region/isempty/)(Graphics) | परीक्षण करता है कि क्या यहRegion निर्दिष्ट ड्राइंग सतह पर एक खाली इंटीरियर है। |
| [IsInfinite](../../system.drawing/region/isinfinite/)(Graphics) | परीक्षण करता है कि क्या यहRegion निर्दिष्ट ड्राइंग सतह पर एक अनंत इंटीरियर है. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_7)(Point) | परीक्षण करता है कि निर्दिष्ट किया गया है या नहींPoint संरचना इसी में निहित हैRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_9)(PointF) | परीक्षण करता है कि निर्दिष्ट किया गया है या नहींPointF संरचना इसी में निहित हैRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_11)(Rectangle) | परीक्षण करता है कि निर्दिष्ट का कोई भाग है या नहींRectangle संरचना इस के भीतर निहित हैRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_13)(RectangleF) | परीक्षण करता है कि निर्दिष्ट का कोई भाग है या नहींRectangleF संरचना इस के भीतर समाहित हैRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_3)(float, float) | परीक्षण करता है कि निर्दिष्ट बिंदु इसमें निहित है या नहींRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_8)(Point, Graphics) | परीक्षण करता है कि निर्दिष्ट किया गया है या नहींPoint संरचना इसी में निहित हैRegion जब निर्दिष्ट का उपयोग करके खींचा जाता हैGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_10)(PointF, Graphics) | परीक्षण करता है कि निर्दिष्ट किया गया है या नहींPointF संरचना इसी में निहित हैRegion जब निर्दिष्ट का उपयोग करके खींचा जाता हैGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_12)(Rectangle, Graphics) | परीक्षण करता है कि निर्दिष्ट का कोई भाग है या नहींRectangle संरचना इस के भीतर समाहित हैRegion निर्दिष्ट का उपयोग करते समय तैयार किया गयाGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_14)(RectangleF, Graphics) | परीक्षण करता है कि निर्दिष्ट का कोई भाग है या नहींRectangleF संरचना इस के भीतर समाहित हैRegion निर्दिष्ट का उपयोग करते समय तैयार किया गयाGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_6)(float, float, Graphics) | परीक्षण करता है कि निर्दिष्ट बिंदु इसमें निहित है या नहींRegion निर्दिष्ट का उपयोग करते समय तैयार किया गयाGraphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_2)(int, int, Graphics) | परीक्षण करता है कि निर्दिष्ट बिंदु इसमें निहित है या नहींRegion ऑब्जेक्ट जब निर्दिष्ट का उपयोग करके खींचा जाता हैGraphics वस्तु. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_4)(float, float, float, float) | परीक्षण करता है कि निर्दिष्ट आयत का कोई भाग इसमें समाहित है या नहींRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible)(int, int, int, int) | परीक्षण करता है कि निर्दिष्ट आयत का कोई भाग इसमें समाहित है या नहींRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_5)(float, float, float, float, Graphics) | परीक्षण करता है कि निर्दिष्ट आयत का कोई भाग इसमें समाहित है या नहींRegion जब निर्दिष्ट का उपयोग करके खींचा जाता हैGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_1)(int, int, int, int, Graphics) | परीक्षण करता है कि निर्दिष्ट आयत का कोई भाग इसमें समाहित है या नहींRegion जब draw निर्दिष्ट का उपयोग करGraphics . |
| [MakeEmpty](../../system.drawing/region/makeempty/)() | इसे आरंभ करता हैRegion एक खाली इंटीरियर के लिए. |
| [MakeInfinite](../../system.drawing/region/makeinfinite/)() | इसे आरंभ करता हैRegion एक अनंत इंटीरियर के लिए वस्तु. |
| [Transform](../../system.drawing/region/transform/)(Matrix) | इसे बदल देता हैRegion निर्दिष्ट द्वाराMatrix . |
| [Translate](../../system.drawing/region/translate/#translate_1)(float, float) | इसके निर्देशांक को ऑफ़सेट करता हैRegion निर्दिष्ट राशि से. |
| [Translate](../../system.drawing/region/translate/#translate)(int, int) | इसके निर्देशांक को ऑफ़सेट करता हैRegion निर्दिष्ट राशि से. |
| [Union](../../system.drawing/region/union/#union)(GraphicsPath) | इसे अपडेट करता हैRegion स्वयं और निर्दिष्ट के संघ के लिएGraphicsPath . |
| [Union](../../system.drawing/region/union/#union_1)(Rectangle) | इसे अपडेट करता हैRegion स्वयं और निर्दिष्ट के संघ के लिएRectangle संरचना. |
| [Union](../../system.drawing/region/union/#union_2)(RectangleF) | इसे अपडेट करता हैRegion स्वयं और निर्दिष्ट के संघ के लिएRectangleF संरचना. |
| [Union](../../system.drawing/region/union/#union_3)(Region) | इसे अपडेट करता हैRegion स्वयं और निर्दिष्ट के संघ के लिएRegion . |
| [Xor](../../system.drawing/region/xor/#xor)(GraphicsPath) | इसे अपडेट करता हैRegion निर्दिष्ट किए गए के साथ स्वयं के प्रतिच्छेदन को संघ से घटाकरGraphicsPath . |
| [Xor](../../system.drawing/region/xor/#xor_1)(Rectangle) | इसे अपडेट करता हैRegion निर्दिष्ट किए गए के साथ स्वयं के प्रतिच्छेदन को संघ से घटाकरRectangle संरचना. |
| [Xor](../../system.drawing/region/xor/#xor_2)(RectangleF) | इसे अपडेट करता हैRegion निर्दिष्ट किए गए with के स्वयं के प्रतिच्छेदन को संघ से घटाकरRectangleF संरचना. |
| [Xor](../../system.drawing/region/xor/#xor_3)(Region) | इसे अपडेट करता हैRegion निर्दिष्ट किए गए के साथ स्वयं के प्रतिच्छेदन को संघ से घटाकरRegion . |

### यह सभी देखें

* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


