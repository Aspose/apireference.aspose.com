---
title: Class PathGradientBrush
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Drawing2D.PathGradientBrush कक्ष. एनकैप्सुलेट करत हैBrush वस्तु ज a के आंतरक भग क भरत हैGraphicsPath एक ढल के सथ वस्तु इस वर्ग क वरसत में नहं मल ज सकत है
type: docs
weight: 400
url: /hi/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

एनकैप्सुलेट करता हैBrush वस्तु जो a के आंतरिक भाग को भरती हैGraphicsPath एक ढाल के साथ वस्तु। इस वर्ग को विरासत में नहीं मिला जा सकता है।

```csharp
public sealed class PathGradientBrush : Brush
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [PathGradientBrush](pathgradientbrush/#constructor)(GraphicsPath) | का एक नया उदाहरण प्रारंभ करता है`PathGradientBrush` वर्ग निर्दिष्ट पथ के साथ. |
| [PathGradientBrush](pathgradientbrush/#constructor_1)(PointF[]) | का एक नया उदाहरण प्रारंभ करता है`PathGradientBrush` वर्ग निर्दिष्ट अंक के साथ. |
| [PathGradientBrush](pathgradientbrush/#constructor_3)(Point[]) | का एक नया उदाहरण प्रारंभ करता है`PathGradientBrush` वर्ग निर्दिष्ट अंक के साथ. |
| [PathGradientBrush](pathgradientbrush/#constructor_2)(PointF[], WrapMode) | का एक नया उदाहरण प्रारंभ करता है`PathGradientBrush` वर्ग निर्दिष्ट अंक और रैप मोड के साथ . |
| [PathGradientBrush](pathgradientbrush/#constructor_4)(Point[], WrapMode) | का एक नया उदाहरण प्रारंभ करता है`PathGradientBrush` वर्ग निर्दिष्ट अंक और रैप मोड के साथ . |

## गुण

| नाम | विवरण |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend/) { get; set; } | हो जाता है या सेट करता हैBlend जो उन स्थितियों और कारकों को निर्दिष्ट करता है जो ग्रेडिएंट के लिए एक कस्टम फ़ॉलऑफ़ को परिभाषित करते हैं। |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor/) { get; set; } | पथ ढाल के केंद्र में रंग प्राप्त या सेट करता है। |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint/) { get; set; } | पथ ढाल का केंद्र बिंदु प्राप्त या सेट करता है। |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales/) { get; set; } | ग्रेडिएंट फ़ॉलऑफ़ के लिए फ़ोकस पॉइंट प्राप्त या सेट करता है। |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors/) { get; set; } | हो जाता है या सेट करता हैColorBlendजो एक बहुरंगा रैखिक ढाल को परिभाषित करता है। |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle/) { get; } | इसके लिए एक बाउंडिंग आयत प्राप्त करता हैPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors/) { get; set; } | पथ में बिंदुओं के अनुरूप रंगों की एक सरणी प्राप्त या सेट करता हैPathGradientBrush भरता है. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform/) { get; set; } | इसकी एक प्रति प्राप्त या सेट करता हैMatrix जो इसके लिए एक स्थानीय ज्यामितीय ट्रांसफ़ॉर्म को परिभाषित करता हैPathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode/) { get; set; } | हो जाता है या सेट करता हैWrapMode जो इसके लिए रैप मोड को इंगित करता हैPathGradientBrush . |

## तरीकों

| नाम | विवरण |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone/)() | इसकी सटीक प्रति बनाता हैPathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose/)() | इस ब्रश ऑब्जेक्ट द्वारा उपयोग किए जाने वाले सभी संसाधनों को रिलीज़ करता है। |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform)(Matrix) | ब्रश के ट्रांसफ़ॉर्मेशन मैट्रिक्स को ब्रश के ट्रांसफ़ॉर्मेशन मैट्रिक्स को दूसरे मैट्रिक्स से गुणा करके अपडेट करता है। |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | ब्रश के ट्रांसफ़ॉर्मेशन मैट्रिक्स को ब्रश के ट्रांसफ़ॉर्मेशन मैट्रिक्स को दूसरे मैट्रिक्स से गुणा करके अपडेट करता है। |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform/)() | रीसेट करता हैTransform पहचान के लिए संपत्ति। |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform)(float) | निर्दिष्ट राशि द्वारा स्थानीय ज्यामितीय परिवर्तन को घुमाता है। यह विधि रोटेशन को परिवर्तन के लिए पूर्ववत करती है। |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट राशि द्वारा स्थानीय ज्यामितीय परिवर्तन को घुमाता है। |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform)(float, float) | निर्दिष्ट राशियों द्वारा स्थानीय ज्यामितीय परिवर्तन को मापता है। यह विधि स्केलिंग मैट्रिक्स को परिवर्तन के लिए तैयार करती है। |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट मात्रा द्वारा स्थानीय ज्यामितीय परिवर्तन को स्केल करता है। |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | बीच के रंग के साथ ग्रेडिएंट बनाता है और आस-पास के रंग के लिए एक रेखीय फ़ॉलऑफ़ बनाता है. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | मध्य रंग के साथ एक ग्रेडिएंट बनाता है और प्रत्येक आसपास के रंग के लिए एक रेखीय फ़ॉलऑफ़ बनाता है। |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape)(float) | एक ग्रेडिएंट ब्रश बनाता है जो पथ के केंद्र से शुरू होकर पथ की सीमा तक रंग बदलता है। एक रंग से दूसरे रंग में संक्रमण घंटी के आकार के वक्र पर आधारित होता है। |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | एक ग्रेडिएंट ब्रश बनाता है जो पथ के केंद्र से शुरू होकर पथ की सीमा तक रंग बदलता है। एक रंग से दूसरे रंग में संक्रमण घंटी के आकार के वक्र पर आधारित होता है। |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform)(float, float) | निर्दिष्ट अनुवाद को स्थानीय ज्यामितीय रूपांतरण पर लागू करता है। यह विधि अनुवाद को रूपांतरण से पहले जोड़ देती है। |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | निर्दिष्ट अनुवाद को निर्दिष्ट क्रम में स्थानीय ज्यामितीय परिवर्तन पर लागू करता है। |

### यह सभी देखें

* class [Brush](../../system.drawing/brush/)
* नाम स्थान [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* सभा [Aspose.Drawing](../../)


