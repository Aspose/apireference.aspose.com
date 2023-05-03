---
title: Class LinearGradientBrush
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Drawing2D.LinearGradientBrush कक्ष. एनकैप्सुलेट करत हैBrush एक रेखय ढल के सथ इस वर्ग क इनहेरट नहं कय ज सकत.
type: docs
weight: 340
url: /hi/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

एनकैप्सुलेट करता हैBrush एक रेखीय ढाल के साथ। इस वर्ग को इनहेरिट नहीं किया जा सकता.

```csharp
public sealed class LinearGradientBrush : Brush
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush/#constructor)(Point, Point, Color, Color) | का एक नया उदाहरण प्रारंभ करता है`LinearGradientBrush` वर्ग निर्दिष्ट बिंदुओं और रंगों के साथ। |
| [LinearGradientBrush](lineargradientbrush/#constructor_1)(PointF, PointF, Color, Color) | का एक नया उदाहरण प्रारंभ करता है`LinearGradientBrush` वर्ग निर्दिष्ट बिंदुओं और रंगों के साथ। |
| [LinearGradientBrush](lineargradientbrush/#constructor_2)(Rectangle, Color, Color, float) | का एक नया उदाहरण प्रारंभ करता है`LinearGradientBrush`एक आयत के आधार पर वर्ग, शुरू और समाप्त रंग, और एक ओरिएंटेशन कोण। |
| [LinearGradientBrush](lineargradientbrush/#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | का एक नया उदाहरण प्रारंभ करता है`LinearGradientBrush` वर्ग एक आयत के आधार पर, प्रारंभ और समाप्त रंग, और अभिविन्यास। |
| [LinearGradientBrush](lineargradientbrush/#constructor_5)(RectangleF, Color, Color, float) | का एक नया उदाहरण प्रारंभ करता है`LinearGradientBrush`एक आयत के आधार पर वर्ग, शुरू और समाप्त रंग, और एक ओरिएंटेशन कोण। |
| [LinearGradientBrush](lineargradientbrush/#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | का एक नया उदाहरण प्रारंभ करता है`LinearGradientBrush` एक आयत पर आधारित वर्ग, शुरू और समाप्त होने वाले रंग, और एक ओरिएंटेशन मोड। |
| [LinearGradientBrush](lineargradientbrush/#constructor_3)(Rectangle, Color, Color, float, bool) | का एक नया उदाहरण प्रारंभ करता है`LinearGradientBrush`एक आयत के आधार पर वर्ग, शुरू और समाप्त रंग, और एक ओरिएंटेशन कोण। |
| [LinearGradientBrush](lineargradientbrush/#constructor_6)(RectangleF, Color, Color, float, bool) | का एक नया उदाहरण प्रारंभ करता है`LinearGradientBrush`एक आयत के आधार पर वर्ग, शुरू और समाप्त रंग, और एक ओरिएंटेशन कोण। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend/) { get; set; } | हो जाता है या सेट करता हैBlend जो ग्रेडिएंट के लिए Custom फ़ॉलऑफ़ को परिभाषित करने वाले पदों और कारकों को निर्दिष्ट करता है |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection/) { get; set; } | एक मान प्राप्त या सेट करता है जो दर्शाता है कि इसके लिए गामा सुधार सक्षम है या नहींLinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors/) { get; set; } | हो जाता है या सेट करता हैColorBlendजो एक बहुरंगा रैखिक ढाल को परिभाषित करता है। |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors/) { get; set; } | ग्रेडिएंट के शुरुआती और अंतिम रंगों को प्राप्त या सेट करता है। |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle/) { get; } | एक आयताकार क्षेत्र प्राप्त करता है जो ग्रेडिएंट के प्रारंभ और समाप्ति बिंदुओं को परिभाषित करता है। |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform/) { get; set; } | कॉपी प्राप्त या सेट करता हैMatrix जो इसके लिए एक स्थानीय ज्यामितीय ट्रांसफ़ॉर्म को परिभाषित करता हैLinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode/) { get; set; } | हो जाता है या सेट करता हैWrapMode एन्यूमरेशन जो इसके लिए रैप मोड को इंगित करता हैLinearGradientBrush . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone/)() | इसकी सटीक प्रति बनाता हैLinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose/)() | इस ब्रश ऑब्जेक्ट द्वारा उपयोग किए जाने वाले सभी संसाधनों को रिलीज़ करता है। |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform)(Matrix) | गुणा करता हैMatrix जो इसके स्थानीय ज्यामितीय रूपांतर का प्रतिनिधित्व करता हैLinearGradientBrush निर्दिष्ट द्वाराMatrix निर्दिष्ट prepending द्वाराMatrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | गुणा करता हैMatrix जो इसके स्थानीय ज्यामितीय रूपांतर का प्रतिनिधित्व करता हैLinearGradientBrush निर्दिष्ट द्वाराMatrix निर्दिष्ट क्रम में. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform/)() | रीसेट करता हैTransform पहचान के लिए संपत्ति। |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform)(float) | निर्दिष्ट राशि द्वारा स्थानीय ज्यामितीय परिवर्तन को घुमाता है। यह विधि रोटेशन को परिवर्तन के लिए पूर्ववत करती है। |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट राशि द्वारा स्थानीय ज्यामितीय परिवर्तन को घुमाता है। |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform)(float, float) | निर्दिष्ट राशियों द्वारा स्थानीय ज्यामितीय परिवर्तन को मापता है। यह विधि स्केलिंग मैट्रिक्स को परिवर्तन के लिए तैयार करती है। |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट मात्रा द्वारा स्थानीय ज्यामितीय परिवर्तन को स्केल करता है। |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | बीच के रंग के साथ एक रेखीय ग्रेडिएंट बनाता है और दोनों सिरों पर एक ही रंग के लिए एक रैखिक फॉलऑफ़ बनाता है। |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | बीच के रंग के साथ एक रेखीय ग्रेडिएंट बनाता है और दोनों सिरों पर एक ही रंग के लिए एक रैखिक फॉलऑफ़ बनाता है। |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape)(float) | घंटी के आकार के वक्र के आधार पर ग्रेडिएंट फ़ॉलऑफ़ बनाता है। |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | घंटी के आकार के वक्र के आधार पर ग्रेडिएंट फ़ॉलऑफ़ बनाता है। |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform)(float, float) | निर्दिष्ट आयामों द्वारा स्थानीय ज्यामितीय परिवर्तन का अनुवाद करता है। यह विधि अनुवाद को परिवर्तन से पहले करती है। |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट आयामों द्वारा स्थानीय ज्यामितीय परिवर्तन का अनुवाद करता है। |

### यह सभी देखें

* class [Brush](../../system.drawing/brush/)
* नाम स्थान [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* सभा [Aspose.Drawing](../../)


