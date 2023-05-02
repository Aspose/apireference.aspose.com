---
title: Class Pen
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Pen कक्ष. रेखएं और वक्र बनने के लए उपयग क जने वल वस्तु क परभषत करत है
type: docs
weight: 910
url: /hi/net/system.drawing/pen/
---
## Pen class

रेखाएं और वक्र बनाने के लिए उपयोग की जाने वाली वस्तु को परिभाषित करता है।

```csharp
public class Pen : IDisposable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Pen](pen/#constructor)(Brush) | का एक नया उदाहरण प्रारंभ करता है`Pen` निर्दिष्ट के साथ वर्गBrush . |
| [Pen](pen/#constructor_2)(Color) | का एक नया उदाहरण प्रारंभ करता है`Pen` निर्दिष्ट के साथ वर्गColor . |
| [Pen](pen/#constructor_1)(Brush, float) | निर्दिष्ट ब्रश और चौड़ाई के साथ पेन वर्ग का एक नया उदाहरण आरंभ करता है। |
| [Pen](pen/#constructor_3)(Color, float) | निर्दिष्ट रंग और चौड़ाई गुणों के साथ पेन वर्ग का एक नया उदाहरण प्रारंभ करता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment/) { get; set; } | इसके लिए संरेखण प्राप्त या सेट करता हैPen . |
| [Brush](../../system.drawing/pen/brush/) { get; set; } | ब्रश प्राप्त करता है या सेट करता है जो इसकी विशेषताओं को निर्धारित करता हैPen . |
| [Color](../../system.drawing/pen/color/) { get; set; } | इसका रंग प्राप्त या सेट करता हैPen . |
| [CompoundArray](../../system.drawing/pen/compoundarray/) { get; set; } | एक कंपाउंड पेन निर्दिष्ट करने वाले मानों की एक सरणी प्राप्त या सेट करता है। एक मिश्रित कलम एक मिश्रित रेखा खींचती है जो समानांतर रेखाओं और रिक्त स्थानों से बनी होती है। |
| [CustomEndCap](../../system.drawing/pen/customendcap/) { get; set; } | इसके साथ खींची गई रेखाओं के अंत में उपयोग करने के लिए कस्टम कैप प्राप्त करता है या सेट करता हैPen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap/) { get; set; } | इसके साथ खींची गई रेखाओं की शुरुआत में उपयोग करने के लिए कस्टम कैप प्राप्त करता है या सेट करता हैPen . |
| [DashCap](../../system.drawing/pen/dashcap/) { get; set; } | इस के साथ खींची गई धराशायी रेखाओं को बनाने वाले डैश के अंत में उपयोग की जाने वाली कैप शैली को प्राप्त या सेट करता हैPen . |
| [DashOffset](../../system.drawing/pen/dashoffset/) { get; set; } | रेखा के प्रारंभ से लेकर डैश पैटर्न के प्रारंभ तक की दूरी प्राप्त करता है या सेट करता है. |
| [DashPattern](../../system.drawing/pen/dashpattern/) { get; set; } | कस्टम डैश और स्पेस की एक सरणी प्राप्त या सेट करता है। |
| [DashStyle](../../system.drawing/pen/dashstyle/) { get; set; } | इसके साथ खींची गई धराशायी रेखाओं के लिए उपयोग की जाने वाली शैली को प्राप्त या सेट करता हैPen . |
| [EndCap](../../system.drawing/pen/endcap/) { get; set; } | इस पेन से खींची गई रेखाओं के अंत में उपयोग की जाने वाली कैप शैली को प्राप्त या सेट करता है। |
| [LineJoin](../../system.drawing/pen/linejoin/) { get; set; } | इस पेन से खींची गई लगातार दो पंक्तियों के सिरों के लिए ज्वाइन स्टाइल प्राप्त या सेट करता है। |
| [MiterLimit](../../system.drawing/pen/miterlimit/) { get; set; } | मिटे हुए कोने पर जुड़ने की मोटाई की सीमा प्राप्त या सेट करता है। |
| [PenType](../../system.drawing/pen/pentype/) { get; } | इस पेन से बनाई गई रेखाओं की शैली प्राप्त करता है. |
| [StartCap](../../system.drawing/pen/startcap/) { get; set; } | इस पेन से खींची गई रेखाओं की शुरुआत में उपयोग की जाने वाली कैप शैली को प्राप्त या सेट करता है। |
| [Transform](../../system.drawing/pen/transform/) { get; set; } | इसके लिए ज्यामितीय परिवर्तन की एक प्रति प्राप्त या सेट करता हैPen . |
| [Width](../../system.drawing/pen/width/) { get; set; } | ड्राइंग के लिए उपयोग की जाने वाली ग्राफ़िक्स ऑब्जेक्ट की इकाइयों में इस पेन की चौड़ाई प्राप्त या सेट करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clone](../../system.drawing/pen/clone/)() | इसकी सटीक प्रति बनाता हैPen . |
| [Dispose](../../system.drawing/pen/dispose/)() | इस पेन द्वारा उपयोग किए गए सभी संसाधनों को जारी करता है। |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform/#multiplytransform)(Matrix) | इसके लिए रूपांतरण मैट्रिक्स को गुणा करता हैPen निर्दिष्ट द्वाराMatrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | इसके लिए रूपांतरण मैट्रिक्स को गुणा करता हैPen निर्दिष्ट द्वाराMatrix निर्दिष्ट क्रम में. |
| [ResetTransform](../../system.drawing/pen/resettransform/)() | इसके लिए ज्यामितीय परिवर्तन मैट्रिक्स को रीसेट करता हैPen पहचान के लिए. |
| [RotateTransform](../../system.drawing/pen/rotatetransform/#rotatetransform)(float) | निर्दिष्ट कोण द्वारा स्थानीय ज्यामितीय परिवर्तन को घुमाता है। यह विधि रोटेशन को परिवर्तन से पहले जोड़ती है। |
| [RotateTransform](../../system.drawing/pen/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट कोण द्वारा स्थानीय ज्यामितीय परिवर्तन को घुमाता है। |
| [ScaleTransform](../../system.drawing/pen/scaletransform/#scaletransform)(float, float) | निर्दिष्ट कारकों द्वारा स्थानीय ज्यामितीय परिवर्तन को मापता है। यह विधि स्केलिंग मैट्रिक्स को परिवर्तन के लिए तैयार करती है। |
| [ScaleTransform](../../system.drawing/pen/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट कारकों द्वारा स्थानीय ज्यामितीय परिवर्तन को स्केल करता है। |
| [SetLineCap](../../system.drawing/pen/setlinecap/)(LineCap, LineCap, DashCap) | उन मानों को सेट करता है जो इसके द्वारा खींची गई रेखाओं को समाप्त करने के लिए उपयोग की जाने वाली कैप की शैली को निर्धारित करते हैं`Pen` . |
| [TranslateTransform](../../system.drawing/pen/translatetransform/#translatetransform)(float, float) | निर्दिष्ट आयामों द्वारा स्थानीय ज्यामितीय परिवर्तन का अनुवाद करता है। यह विधि रूपांतरण के लिए अनुवाद को आगे बढ़ाती है। |
| [TranslateTransform](../../system.drawing/pen/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट आयामों द्वारा स्थानीय ज्यामितीय परिवर्तन का अनुवाद करता है। |

### यह सभी देखें

* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


