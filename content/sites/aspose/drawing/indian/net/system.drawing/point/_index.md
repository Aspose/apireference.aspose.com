---
title: Struct Point
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Point struct. पूर्णंक x और yनर्देशंकं क एक आदेशत जड़ क प्रतनधत्व करत है ज द्वआयम वमन में एक बंदु क परभषत करत है
type: docs
weight: 930
url: /hi/net/system.drawing/point/
---
## Point structure

पूर्णांक x- और y-निर्देशांकों की एक आदेशित जोड़ी का प्रतिनिधित्व करता है जो द्वि-आयामी विमान में एक बिंदु को परिभाषित करता है।

```csharp
public struct Point : IEquatable<Point>
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Point](point/#constructor)(int) | का एक नया उदाहरण प्रारंभ करता है`Point` एक पूर्णांक मान द्वारा निर्दिष्ट निर्देशांक का उपयोग कर संरचना। |
| [Point](point/#constructor_2)(Size) | का एक नया उदाहरण प्रारंभ करता है`Point` ए से संरचना[`Size`](../size/) . |
| [Point](point/#constructor_1)(int, int) | का एक नया उदाहरण प्रारंभ करता है`Point` निर्दिष्ट निर्देशांक के साथ संरचना. |

## गुण

| नाम | विवरण |
| --- | --- |
| [IsEmpty](../../system.drawing/point/isempty/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि यह यह है या नहींPoint खाली है. |
| [X](../../system.drawing/point/x/) { get; set; } | इस बिंदु का x-निर्देशांक प्राप्त या सेट करता है। |
| [Y](../../system.drawing/point/y/) { get; set; } | इस बिंदु का y-निर्देशांक प्राप्त या सेट करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| static [Add](../../system.drawing/point/add/)(Point, Size) | निर्दिष्ट जोड़ता हैSize निर्दिष्ट करने के लिएPoint . |
| static [Ceiling](../../system.drawing/point/ceiling/)(PointF) | परिवर्तित करता है a[`PointF`](../pointf/) एक के लिए`Point` सभी निर्देशांकों पर सीलिंग ऑपरेशन करके। |
| static [Round](../../system.drawing/point/round/)(PointF) | निर्दिष्ट को परिवर्तित करता हैPointF गोल करके एक बिंदु वस्तु के लिएPoint निकटतम पूर्णांक के मान. |
| static [Subtract](../../system.drawing/point/subtract/)(Point, Size) | अनुवाद करता है`Point` किसी दिए गए के नकारात्मक द्वारा[`Size`](../size/) . |
| static [Truncate](../../system.drawing/point/truncate/)(PointF) | सभी निर्देशांकों पर एक ट्रंकेट ऑपरेशन करके एक प्वाइंटएफ को एक प्वाइंट में परिवर्तित करता है। |
| override [Equals](../../system.drawing/point/equals/#equals_1)(object) | निर्दिष्ट करता है कि क्या यहPoint निर्दिष्ट के समान निर्देशांक शामिल हैंObject . |
| [Equals](../../system.drawing/point/equals/#equals)(Point) | परीक्षण करता है कि क्या अन्य`Point` संरचना का यही स्थान है`Point` संरचना. |
| override [GetHashCode](../../system.drawing/point/gethashcode/)() | इसके लिए हैश कोड लौटाता हैPoint . |
| [Offset](../../system.drawing/point/offset/#offset_1)(Point) | इसका अनुवाद करता हैPoint निर्दिष्ट द्वाराPoint . |
| [Offset](../../system.drawing/point/offset/#offset)(int, int) | इसका अनुवाद करता हैPoint निर्दिष्ट राशि से. |
| override [ToString](../../system.drawing/point/tostring/)() | इसकी विशेषताओं को परिवर्तित करता है`Point` एक मानव पठनीय स्ट्रिंग के लिए. |
| [operator +](../../system.drawing/point/op_addition/) | अनुवाद करता है`Point` एक दिए गए द्वारा[`Size`](../size/) . |
| [operator ==](../../system.drawing/point/op_equality/) | दो की तुलना करता हैPoint objects. परिणाम निर्दिष्ट करता है कि क्या के मानX औरY गुण दोनों में सेPoint वस्तुएं बराबर हैं। |
| [explicit operator](../../system.drawing/point/op_explicit/) | एक बनाता है[`Size`](../size/)निर्दिष्ट के निर्देशांक के साथ`Point` . |
| [implicit operator](../../system.drawing/point/op_implicit/) | निर्दिष्ट को परिवर्तित करता हैPoint ए के लिए संरचनाPointF संरचना. |
| [operator !=](../../system.drawing/point/op_inequality/) | दो की तुलना करता हैPoint objects. परिणाम निर्दिष्ट करता है कि क्या के मानX याY गुण दोनों में सेPoint वस्तुएं असमान हैं। |
| [operator -](../../system.drawing/point/op_subtraction/) | अनुवाद करता है`Point` किसी दिए गए के नकारात्मक द्वारा[`Size`](../size/) . |

## खेत

| नाम | विवरण |
| --- | --- |
| static readonly [Empty](../../system.drawing/point/empty/) | एक का प्रतिनिधित्व करता हैPoint कि हैX औरY मान शून्य पर सेट. |

### यह सभी देखें

* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


