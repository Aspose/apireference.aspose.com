---
title: Struct Size
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Size struct. पूर्णंकं क एक क्रमत जड़ संग्रहत करत है आमतर पर एक आयत क चड़ई और ऊंचई
type: docs
weight: 1080
url: /hi/net/system.drawing/size/
---
## Size structure

पूर्णांकों की एक क्रमित जोड़ी संग्रहीत करता है, आमतौर पर एक आयत की चौड़ाई और ऊंचाई।

```csharp
public struct Size : IEquatable<Size>
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Size](size/#constructor_1)(Point) | का एक नया उदाहरण प्रारंभ करता है`Size` निर्दिष्ट से संरचनाPoint . |
| [Size](size/#constructor)(int, int) | का एक नया उदाहरण प्रारंभ करता है`Size` निर्दिष्ट आयामों से संरचना। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Height](../../system.drawing/size/height/) { get; set; } | इसके लंबवत घटक को प्राप्त या सेट करता हैSize . |
| [IsEmpty](../../system.drawing/size/isempty/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यहSize चौड़ाई और ऊंचाई 0. है |
| [Width](../../system.drawing/size/width/) { get; set; } | इसके क्षैतिज घटक को प्राप्त या सेट करता हैSize . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [Add](../../system.drawing/size/add/)(Size, Size) | एक की चौड़ाई और ऊंचाई जोड़ता हैSize चौड़ाई और ऊंचाई के लिए संरचना अन्यSize संरचना. |
| static [Ceiling](../../system.drawing/size/ceiling/)(SizeF) | निर्दिष्ट को परिवर्तित करता हैSizeF ए के लिए संरचनाSize के मानों को गोल करके संरचनाSize अगले उच्च पूर्णांक मानों की संरचना। |
| static [Round](../../system.drawing/size/round/)(SizeF) | निर्दिष्ट को परिवर्तित करता हैSizeF ए के लिए संरचनाSizestructure के मानों को गोल करकेSizeF निकटतम पूर्णांक मानों की संरचना। |
| static [Subtract](../../system.drawing/size/subtract/)(Size, Size) | एक की चौड़ाई और ऊंचाई घटाता हैSize चौड़ाई और ऊंचाई से संरचना अन्यSize संरचना. |
| static [Truncate](../../system.drawing/size/truncate/)(SizeF) | निर्दिष्ट को परिवर्तित करता हैSizeF ए के लिए संरचनाSize structure के मानों को छोटा करकेSizeF अगले निचले पूर्णांक मानों की संरचना। |
| override [Equals](../../system.drawing/size/equals/#equals_1)(object) | यह देखने के लिए परीक्षण करता है कि निर्दिष्ट वस्तु a है या नहींSize इसके समान आयाम के साथSize . |
| [Equals](../../system.drawing/size/equals/#equals)(Size) | परीक्षण करता है कि क्या अन्य`Size` संरचना का इसका आकार समान है`Size` संरचना. |
| override [GetHashCode](../../system.drawing/size/gethashcode/)() | इसके लिए हैश कोड लौटाता हैSize संरचना. |
| override [ToString](../../system.drawing/size/tostring/)() | इसकी विशेषताओं को परिवर्तित करता है`Size` एक मानव पठनीय स्ट्रिंग के लिए. |
| [operator +](../../system.drawing/size/op_addition/) | एक की चौड़ाई और ऊंचाई जोड़ता हैSize चौड़ाई और ऊंचाई के लिए संरचना अन्यSize संरचना. |
| [operator /](../../system.drawing/size/op_division/#op_division) | विभाजित करता है`Size` एक के द्वाराInt32 , उत्पादन`Size` . (2 operators) |
| [operator ==](../../system.drawing/size/op_equality/) | परीक्षण करता है कि क्या दो हैंSize संरचनाएं बराबर हैं. |
| [explicit operator](../../system.drawing/size/op_explicit/) | निर्दिष्ट को परिवर्तित करता हैSize एक के लिएPoint . |
| [implicit operator](../../system.drawing/size/op_implicit/) | निर्दिष्ट को परिवर्तित करता हैSize एक के लिएSizeF . |
| [operator !=](../../system.drawing/size/op_inequality/) | परीक्षण करता है कि क्या दो हैंSize संरचनाएं भिन्न हैं. |
| [operator *](../../system.drawing/size/op_multiply/#op_multiply) | गुणा ए`Size` एक के द्वाराInt32 , उत्पादन`Size` . (4 operators) |
| [operator -](../../system.drawing/size/op_subtraction/) | एक की चौड़ाई और ऊंचाई घटाता हैSize चौड़ाई और ऊंचाई से संरचना अन्यSize संरचना. |

## खेत

| नाम | विवरण |
| --- | --- |
| static readonly [Empty](../../system.drawing/size/empty/) | हो जाता हैSize संरचना जिसमें ए हैHeight औरWidth 0. का मान |

### यह सभी देखें

* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


