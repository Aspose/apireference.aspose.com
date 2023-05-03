---
title: Struct RectangleF
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.RectangleF struct. चर फ़्लटंगपइंट नंबरं क एक सेट संग्रहत करत है ज एक आयत के स्थन और आकर क प्रतनधत्व करत है अधक उन्नत क्षेत्र कर्यं के लए एक क्षेत्र वस्तु क उपयग करें
type: docs
weight: 1050
url: /hi/net/system.drawing/rectanglef/
---
## RectangleF structure

चार फ़्लोटिंग-पॉइंट नंबरों का एक सेट संग्रहीत करता है जो एक आयत के स्थान और आकार का प्रतिनिधित्व करता है। अधिक उन्नत क्षेत्र कार्यों के लिए, एक क्षेत्र वस्तु का उपयोग करें।

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [RectangleF](rectanglef/#constructor_1)(PointF, SizeF) | निर्दिष्ट स्थान और आकार के साथ आयतएफ संरचना का एक नया उदाहरण प्रारंभ करता है। |
| [RectangleF](rectanglef/#constructor)(float, float, float, float) | निर्दिष्ट स्थान और आकार के साथ आयतएफ संरचना का एक नया उदाहरण प्रारंभ करता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom/) { get; } | वाई-निर्देशांक प्राप्त करता है जो इस आयतएफ संरचना की वाई और ऊंचाई का योग है। |
| [Height](../../system.drawing/rectanglef/height/) { get; set; } | इस आयतएफ संरचना की ऊंचाई प्राप्त या सेट करता है। |
| [IsEmpty](../../system.drawing/rectanglef/isempty/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्याWidth याHeight इस की संपत्ति RectangleF शून्य. का मान है |
| [Left](../../system.drawing/rectanglef/left/) { get; } | इस आयतएफ संरचना के बाएं किनारे का एक्स-निर्देशांक प्राप्त करता है। |
| [Location](../../system.drawing/rectanglef/location/) { get; set; } | इसके ऊपरी-बाएँ कोने के निर्देशांक प्राप्त या सेट करता हैRectangleF संरचना. |
| [Right](../../system.drawing/rectanglef/right/) { get; } | एक्स-निर्देशांक प्राप्त करता है जो इस आयतएफ संरचना की एक्स और चौड़ाई का योग है। |
| [Size](../../system.drawing/rectanglef/size/) { get; set; } | इसका आकार प्राप्त या सेट करता हैRectangleF . |
| [Top](../../system.drawing/rectanglef/top/) { get; } | इस आयतएफ संरचना के शीर्ष किनारे का वाई-निर्देशांक प्राप्त करता है। |
| [Width](../../system.drawing/rectanglef/width/) { get; set; } | इस आयतएफ संरचना की चौड़ाई प्राप्त या सेट करता है। |
| [X](../../system.drawing/rectanglef/x/) { get; set; } | इस आयतएफ संरचना के ऊपरी-बाएँ कोने का x-निर्देशांक प्राप्त या सेट करता है। |
| [Y](../../system.drawing/rectanglef/y/) { get; set; } | इस आयतएफ संरचना के ऊपरी-बाएँ कोने का x-निर्देशांक प्राप्त या सेट करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb/)(float, float, float, float) | निर्दिष्ट स्थानों पर ऊपरी-बाएं कोने और निचले-दाएं कोने के साथ एक आयतएफ संरचना बनाता है। |
| static [Inflate](../../system.drawing/rectanglef/inflate/)(RectangleF, float, float) | निर्दिष्ट की एक बढ़ी हुई प्रति बनाता है और लौटाता हैRectangleF structure. प्रति निर्दिष्ट राशि से फुलाया जाता है। मूल आयत अपरिवर्तित रहता है। |
| static [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF, RectangleF) | रिटर्न एRectangleF संरचना जो दो आयतों के प्रतिच्छेदन का प्रतिनिधित्व करती है। यदि कोई चौराहा नहीं है, और खाली हैRectangleF वापस आ गया है। |
| static [Union](../../system.drawing/rectanglef/union/)(RectangleF, RectangleF) | सबसे छोटा संभव तीसरा आयत बनाता है जिसमें संघ बनाने वाले दोनों आयत शामिल हो सकते हैं। |
| [Contains](../../system.drawing/rectanglef/contains/#contains_1)(PointF) | निर्धारित करता है कि निर्दिष्ट बिंदु इसमें शामिल है या नहींRectangleF संरचना. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_2)(RectangleF) | निर्धारित करता है कि क्या आयताकार क्षेत्र द्वारा दर्शाया गया है*rect* इसी में पूर्णतया निहित हैRectangleF संरचना. |
| [Contains](../../system.drawing/rectanglef/contains/#contains)(float, float) | निर्धारित करता है कि निर्दिष्ट बिंदु इसमें शामिल है या नहींRectangleF संरचना. |
| override [Equals](../../system.drawing/rectanglef/equals/#equals_1)(object) | निर्धारित करता है कि निर्दिष्ट किया गया है या नहींObject , इस उदाहरण के बराबर है। |
| [Equals](../../system.drawing/rectanglef/equals/#equals)(RectangleF) | परीक्षण करता है कि क्या अन्य`RectangleF` संरचना में इसका स्थान और आकार समान है`RectangleF` संरचना. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode/)() | इस उदाहरण के लिए एक हैश कोड लौटाता है। |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate_1)(SizeF) | इसे फुलाता हैRectangleF निर्दिष्ट राशि से. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate)(float, float) | इसे फुलाता हैRectangleF निर्दिष्ट राशि द्वारा संरचना। |
| [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF) | इसे बदलता हैRectangleF खुद के प्रतिच्छेदन और निर्दिष्ट के साथ संरचनाRectangleF संरचना. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith/)(RectangleF) | निर्धारित करता है कि क्या यह आयत किसके साथ प्रतिच्छेद करती है*rect* . |
| [Offset](../../system.drawing/rectanglef/offset/#offset_1)(PointF) | इस आयत के स्थान को निर्दिष्ट राशि से समायोजित करता है। |
| [Offset](../../system.drawing/rectanglef/offset/#offset)(float, float) | इस आयत के स्थान को निर्दिष्ट राशि से समायोजित करता है। |
| override [ToString](../../system.drawing/rectanglef/tostring/)() | इसकी विशेषताओं को परिवर्तित करता है[`Rectangle`](../rectangle/) एक मानव पठनीय स्ट्रिंग के लिए. |
| [operator ==](../../system.drawing/rectanglef/op_equality/) | परीक्षण करता है कि क्या दो हैंRectangleF संरचनाओं का स्थान और आकार समान होता है. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit/) | निर्दिष्ट आयत संरचना को आयतएफ संरचना में परिवर्तित करता है। |
| [operator !=](../../system.drawing/rectanglef/op_inequality/) | परीक्षण करता है कि क्या दो हैंRectangleF संरचनाएं स्थान या आकार में भिन्न होती हैं। |

## खेत

| नाम | विवरण |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty/) | के एक उदाहरण का प्रतिनिधित्व करता हैRectangleFअपने सदस्यों के साथ कक्षा अप्रारंभीकृत. |

### यह सभी देखें

* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


