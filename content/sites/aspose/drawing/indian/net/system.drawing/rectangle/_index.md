---
title: Struct Rectangle
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Rectangle struct. चर पूर्णंकं क एक सेट संग्रहत करत है ज एक आयत के स्थन और आकर क प्रतनधत्व करत है
type: docs
weight: 1040
url: /hi/net/system.drawing/rectangle/
---
## Rectangle structure

चार पूर्णांकों का एक सेट संग्रहीत करता है जो एक आयत के स्थान और आकार का प्रतिनिधित्व करता है।

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Rectangle](rectangle/#constructor_1)(Point, Size) | का एक नया उदाहरण प्रारंभ करता है`Rectangle` निर्दिष्ट स्थान और आकार के साथ संरचना। |
| [Rectangle](rectangle/#constructor)(int, int, int, int) | निर्दिष्ट स्थान और आकार के साथ आयत संरचना का एक नया उदाहरण आरंभ करता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom/) { get; } | y-निर्देशांक प्राप्त करता है जो इस आयत संरचना के Y और ऊँचाई गुण मानों का योग है। |
| [Height](../../system.drawing/rectangle/height/) { get; set; } | इस आयत संरचना की ऊंचाई प्राप्त या सेट करता है। |
| [IsEmpty](../../system.drawing/rectangle/isempty/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या इसके सभी संख्यात्मक गुण हैं`Rectangle` शून्य के मान हैं। |
| [Left](../../system.drawing/rectangle/left/) { get; } | इस आयत संरचना के बाएँ किनारे का x-निर्देशांक प्राप्त करता है। |
| [Location](../../system.drawing/rectangle/location/) { get; set; } | इसके ऊपरी-बाएँ कोने के निर्देशांक प्राप्त या सेट करता हैRectangle संरचना. |
| [Right](../../system.drawing/rectangle/right/) { get; } | x-निर्देशांक प्राप्त करता है जो इस आयत संरचना के X और चौड़ाई गुण मानों का योग है। |
| [Size](../../system.drawing/rectangle/size/) { get; set; } | इसका आकार प्राप्त या सेट करता हैRectangle . |
| [Top](../../system.drawing/rectangle/top/) { get; } | इस आयत संरचना के शीर्ष किनारे का y-निर्देशांक प्राप्त करता है। |
| [Width](../../system.drawing/rectangle/width/) { get; set; } | इस आयत संरचना की चौड़ाई प्राप्त या सेट करता है। |
| [X](../../system.drawing/rectangle/x/) { get; set; } | इस आयत संरचना के ऊपरी-बाएँ कोने का x-निर्देशांक प्राप्त या सेट करता है। |
| [Y](../../system.drawing/rectangle/y/) { get; set; } | इस आयत संरचना के ऊपरी-बाएँ कोने का y-निर्देशांक प्राप्त या सेट करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling/)(RectangleF) | निर्दिष्ट को परिवर्तित करता हैRectangleF ए के लिए संरचनाRectangle गोल करके संरचनाRectangleF अगले उच्च पूर्णांक मानों के लिए मान. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb/)(int, int, int, int) | एक बनाता हैRectangle निर्दिष्ट बढ़त स्थानों के साथ संरचना. |
| static [Inflate](../../system.drawing/rectangle/inflate/)(Rectangle, int, int) | एक बनाता है`Rectangle` जो निर्दिष्ट राशि से बढ़ा हुआ है. |
| static [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle, Rectangle) | एक तिहाई लौटाता हैRectangle संरचना जो दो अन्य के प्रतिच्छेदन का प्रतिनिधित्व करती हैRectangle संरचनाएं। यदि कोई चौराहा नहीं है, तो एक खालीRectangle वापस आ गया है। |
| static [Round](../../system.drawing/rectangle/round/)(RectangleF) | निर्दिष्ट को परिवर्तित करता हैRectangleF एक के लिएRectangle राउंडिंग द्वाराRectangleF मानों को निकटतम पूर्णांक मान. |
| static [Truncate](../../system.drawing/rectangle/truncate/)(RectangleF) | निर्दिष्ट को परिवर्तित करता हैRectangleF एक के लिएRectangle काट करRectangleF मान. |
| static [Union](../../system.drawing/rectangle/union/)(Rectangle, Rectangle) | हो जाता हैRectangle संरचना जिसमें दो का मिलन होता हैRectangle संरचनाएं. |
| [Contains](../../system.drawing/rectangle/contains/#contains_1)(Point) | निर्धारित करता है कि निर्दिष्ट बिंदु इसमें शामिल है या नहींRectangle संरचना. |
| [Contains](../../system.drawing/rectangle/contains/#contains_2)(Rectangle) | निर्धारित करता है कि क्या आयताकार क्षेत्र द्वारा दर्शाया गया है*rect* इसके द्वारा दर्शाए गए आयताकार क्षेत्र के भीतर पूरी तरह से समाहित है`Rectangle` . |
| [Contains](../../system.drawing/rectangle/contains/#contains)(int, int) | निर्धारित करता है कि निर्दिष्ट बिंदु इसमें शामिल है या नहींRectangle संरचना. |
| override [Equals](../../system.drawing/rectangle/equals/#equals_1)(object) | परीक्षण करता है कि ओबीजे एक है या नहींRectangleइस के समान स्थान और आकार के साथ संरचनाRectangle संरचना. |
| [Equals](../../system.drawing/rectangle/equals/#equals)(Rectangle) | परीक्षण करता है कि क्या अन्य`Rectangle` संरचना में इसका स्थान और आकार समान है`Rectangle` संरचना. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode/)() | इसके लिए हैश कोड लौटाता हैRectangle संरचना। हैश कोड के उपयोग के बारे में जानकारी के लिए GetHashCode . देखें |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate_1)(Size) | इसे बढ़ाता हैRectangle निर्दिष्ट राशि से. |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate)(int, int) | इसे बढ़ाता हैRectangle निर्दिष्ट राशि से. |
| [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle) | इसे बदलता हैRectangle स्वयं और निर्दिष्ट के प्रतिच्छेदन के साथRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith/)(Rectangle) | निर्धारित करता है कि क्या यह आयत किसके साथ प्रतिच्छेद करती है*rect* . |
| [Offset](../../system.drawing/rectangle/offset/#offset_1)(Point) | इस आयत के स्थान को निर्दिष्ट राशि से समायोजित करता है। |
| [Offset](../../system.drawing/rectangle/offset/#offset)(int, int) | इस आयत के स्थान को निर्दिष्ट राशि से समायोजित करता है। |
| override [ToString](../../system.drawing/rectangle/tostring/)() | इसकी विशेषताओं को परिवर्तित करता है`Rectangle` एक मानव पठनीय स्ट्रिंग के लिए. |
| [operator ==](../../system.drawing/rectangle/op_equality/) | परीक्षण करता है कि क्या दो हैंRectangle संरचनाओं का स्थान और आकार समान होता है. |
| [operator !=](../../system.drawing/rectangle/op_inequality/) | परीक्षण करता है कि क्या दो हैंRectangle संरचनाएं स्थान या आकार में भिन्न होती हैं। |

## खेत

| नाम | विवरण |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty/) | एक का प्रतिनिधित्व करता हैRectangle इसकी संपत्तियों के साथ संरचना को छोड़ दिया गया। |

### यह सभी देखें

* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


