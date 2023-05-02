---
title: Class Matrix
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Drawing2D.Matrix कक्ष. एक 3बय3 एफइन मैट्रक्स क एनकैप्सुलेट करत है ज एक ज्यमतय परवर्तन क प्रतनधत्व करत है इस वर्ग क इनहेरट नहं कय ज सकत.
type: docs
weight: 360
url: /hi/net/system.drawing.drawing2d/matrix/
---
## Matrix class

एक 3-बाय-3 एफाइन मैट्रिक्स को एनकैप्सुलेट करता है जो एक ज्यामितीय परिवर्तन का प्रतिनिधित्व करता है। इस वर्ग को इनहेरिट नहीं किया जा सकता.

```csharp
public sealed class Matrix : IDisposable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Matrix](matrix/#constructor)() | मैट्रिक्स वर्ग के एक नए उदाहरण को पहचान मैट्रिक्स के रूप में आरंभ करता है। |
| [Matrix](matrix/#constructor_2)(Rectangle, Point[]) | का एक नया उदाहरण प्रारंभ करता है`Matrix` निर्दिष्ट आयत और बिंदुओं की सरणी द्वारा परिभाषित ज्यामितीय परिवर्तन के लिए वर्ग . |
| [Matrix](matrix/#constructor_3)(RectangleF, PointF[]) | का एक नया उदाहरण प्रारंभ करता है`Matrix` निर्दिष्ट आयत और बिंदुओं की सरणी द्वारा परिभाषित ज्यामितीय परिवर्तन के लिए वर्ग . |
| [Matrix](matrix/#constructor_1)(float, float, float, float, float, float) | निर्दिष्ट तत्वों के साथ मैट्रिक्स वर्ग का एक नया उदाहरण शुरू करता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements/) { get; } | फ़्लोटिंग-पॉइंट मानों की एक सरणी प्राप्त करता है जो इस मैट्रिक्स के तत्वों का प्रतिनिधित्व करता है। |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity/) { get; } | एक मान प्राप्त करता है जो इंगित करता है कि यह मैट्रिक्स पहचान मैट्रिक्स है। |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible/) { get; } | यह इंगित करने वाला मान प्राप्त करता है कि क्या यह मैट्रिक्स उलटा है। |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx/) { get; } | इस मैट्रिक्स का एक्स ट्रांसलेशन वैल्यू (डीएक्स वैल्यू, या तीसरी पंक्ति और पहले कॉलम में तत्व) प्राप्त करता है। |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety/) { get; } | y अनुवाद मान प्राप्त करता है (the`डीवाई` इस मैट्रिक्स का मूल्य, या तीसरी पंक्ति और दूसरे कॉलम में तत्व) . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone/)() | इस मैट्रिक्स की एक सटीक प्रति बनाता है। |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose/)() | इस मैट्रिक्स द्वारा उपयोग किए जाने वाले सभी संसाधनों को रिलीज़ करता है। |
| [Invert](../../system.drawing.drawing2d/matrix/invert/)() | इस मैट्रिक्स को उलट देता है, अगर यह उलटा है। |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply)(Matrix) | इसे गुणा करता हैMatrix में निर्दिष्ट मैट्रिक्स द्वारा*matrix* पैरामीटर, निर्दिष्ट को आगे बढ़ाकरMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply_1)(Matrix, MatrixOrder) | इसे गुणा करता हैMatrix में निर्दिष्ट मैट्रिक्स द्वारा*matrix* पैरामीटर, और इसमें निर्दिष्ट क्रम में*order* पैरामीटर. |
| [Reset](../../system.drawing.drawing2d/matrix/reset/)() | इसे रीसेट करता हैMatrix पहचान मैट्रिक्स के तत्वों के लिए . |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate)(float) | इसके आगे जोड़ेंMatrix एक दक्षिणावर्त घुमाव, मूल के चारों ओर और निर्दिष्ट कोण से। |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate_1)(float, MatrixOrder) | इसके लिए मूल (शून्य x और y निर्देशांक) के आसपास कोण पैरामीटर में निर्दिष्ट राशि का दक्षिणावर्त घुमाव लागू करता हैMatrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat)(float, PointF) | इस मैट्रिक्स के लिए बिंदु पैरामीटर में निर्दिष्ट बिंदु के चारों ओर एक दक्षिणावर्त रोटेशन लागू करता है, और रोटेशन को आगे बढ़ाकर। |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat_1)(float, PointF, MatrixOrder) | निर्दिष्ट क्रम में इस मैट्रिक्स के निर्दिष्ट बिंदु के बारे में दक्षिणावर्त घुमाव लागू करता है। |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale)(float, float) | स्केल वेक्टर को आगे बढ़ाकर इस मैट्रिक्स पर निर्दिष्ट स्केल वेक्टर लागू करता है। |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale_1)(float, float, MatrixOrder) | निर्दिष्ट क्रम का उपयोग करके इस मैट्रिक्स पर निर्दिष्ट स्केल वेक्टर (स्केलएक्स और स्केलवाई) लागू करता है। |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear)(float, float) | इस मैट्रिक्स में निर्दिष्ट कतरनी वेक्टर को कतरनी परिवर्तन के आगे लागू करता है। |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear_1)(float, float, MatrixOrder) | इस मैट्रिक्स पर निर्दिष्ट क्रम में निर्दिष्ट कतरनी वेक्टर लागू करता है। |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints)(PointF[]) | इसके द्वारा दर्शाए गए ज्यामितीय परिवर्तन को लागू करता हैMatrix बिंदुओं की एक निर्दिष्ट सरणी के लिए। |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints_1)(Point[]) | इसके द्वारा दर्शाए गए ज्यामितीय परिवर्तन को लागू करता हैMatrix बिंदुओं की एक निर्दिष्ट सरणी के लिए। |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors/)(PointF[]) | सरणी में प्रत्येक वेक्टर को मैट्रिक्स से गुणा करता है। इस मैट्रिक्स (तीसरी पंक्ति) के अनुवाद तत्वों पर ध्यान नहीं दिया जाता है। |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate)(float, float) | निर्दिष्ट अनुवाद वेक्टर (ऑफ़सेटएक्स और ऑफ़सेटवाई) को इस मैट्रिक्स में अनुवाद वेक्टर को आगे बढ़ाकर लागू करता है। |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate_1)(float, float, MatrixOrder) | निर्दिष्ट अनुवाद वेक्टर को निर्दिष्ट क्रम में इस मैट्रिक्स पर लागू करता है। |

### यह सभी देखें

* नाम स्थान [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* सभा [Aspose.Drawing](../../)


