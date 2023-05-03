---
title: Class TextureBrush
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.TextureBrush कक्ष. टेक्सचरब्रश वर्ग क प्रत्येक संपत्त एक ब्रश वस्तु है ज एक आकृत के इंटरयर क भरने के लए एक छव क उपयग करत है इस वर्ग क वरसत में नहं लय ज सकत है
type: docs
weight: 1260
url: /hi/net/system.drawing/texturebrush/
---
## TextureBrush class

टेक्सचरब्रश वर्ग की प्रत्येक संपत्ति एक ब्रश वस्तु है जो एक आकृति के इंटीरियर को भरने के लिए एक छवि का उपयोग करती है। इस वर्ग को विरासत में नहीं लिया जा सकता है।

```csharp
public sealed class TextureBrush : Brush
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [TextureBrush](texturebrush/#constructor)(Image) | का एक नया उदाहरण प्रारंभ करता है`TextureBrush` वर्ग जो निर्दिष्ट छवि का उपयोग करता है। |
| [TextureBrush](texturebrush/#constructor_3)(Image, RectangleF) | का एक नया उदाहरण प्रारंभ करता है`TextureBrush` वह वर्ग जो निर्दिष्ट छवि और बाउंडिंग आयत का उपयोग करता है। |
| [TextureBrush](texturebrush/#constructor_1)(Image, WrapMode) | का एक नया उदाहरण प्रारंभ करता है`TextureBrush` वर्ग जो निर्दिष्ट छवि और रैप मोड का उपयोग करता है। |
| [TextureBrush](texturebrush/#constructor_4)(Image, RectangleF, ImageAttributes) | का एक नया उदाहरण प्रारंभ करता है`TextureBrush` वर्ग जो निर्दिष्ट छवि, बाउंडिंग आयत और छवि विशेषताओं का उपयोग करता है। |
| [TextureBrush](texturebrush/#constructor_2)(Image, WrapMode, RectangleF) | का एक नया उदाहरण प्रारंभ करता है`TextureBrush` वर्ग जो निर्दिष्ट छवि, रैप मोड और बाउंडिंग आयत का उपयोग करता है। |

## गुण

| नाम | विवरण |
| --- | --- |
| [Image](../../system.drawing/texturebrush/image/) { get; } | इस टेक्सचरब्रश ऑब्जेक्ट से जुड़ी छवि वस्तु प्राप्त करता है। |
| [Transform](../../system.drawing/texturebrush/transform/) { get; set; } | मैट्रिक्स ऑब्जेक्ट की एक प्रति प्राप्त या सेट करता है जो इस टेक्सचरब्रश ऑब्जेक्ट से जुड़े image के लिए एक स्थानीय ज्यामितीय परिवर्तन को परिभाषित करता है। |
| [WrapMode](../../system.drawing/texturebrush/wrapmode/) { get; set; } | एक WrapMode एन्यूमरेशन प्राप्त या सेट करता है जो इस TextureBrush ऑब्जेक्ट के लिए रैप मोड को इंगित करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| override [Clone](../../system.drawing/texturebrush/clone/)() | इसकी सटीक प्रति बनाता हैTextureBrush वस्तु. |
| [Dispose](../../system.drawing/brush/dispose/)() | इस ब्रश ऑब्जेक्ट द्वारा उपयोग किए जाने वाले सभी संसाधनों को रिलीज़ करता है। |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform)(Matrix) | गुणा करता हैMatrix वस्तु जो इसके स्थानीय ज्यामितीय परिवर्तन का प्रतिनिधित्व करती हैTextureBrush निर्दिष्ट द्वारा वस्तुMatrix निर्दिष्ट prepending द्वारा वस्तुMatrix वस्तु. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | गुणा करता हैMatrix वस्तु जो इसके स्थानीय ज्यामितीय परिवर्तन का प्रतिनिधित्व करती हैTextureBrush निर्दिष्ट द्वारा वस्तुMatrix निर्दिष्ट क्रम में वस्तु। |
| [ResetTransform](../../system.drawing/texturebrush/resettransform/)() | इसके ट्रांसफॉर्म गुण को रीसेट करता हैTextureBrush पहचान पर आपत्ति. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform)(float) | इसके स्थानीय ज्यामितीय परिवर्तन को घुमाता हैTextureBrush निर्दिष्ट राशि द्वारा वस्तु। यह विधि रोटेशन को परिवर्तन से पहले करती है। |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | इसके स्थानीय ज्यामितीय परिवर्तन को घुमाता हैTextureBrush निर्दिष्ट राशि द्वारा वस्तु निर्दिष्ट क्रम में। |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform)(float, float) | इसके स्थानीय ज्यामितीय परिवर्तन को मापता हैTextureBrush निर्दिष्ट राशियों द्वारा वस्तु। यह विधि स्केलिंग मैट्रिक्स को परिवर्तन के लिए तैयार करती है। |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | इसके स्थानीय ज्यामितीय परिवर्तन को मापता हैTextureBrush object निर्दिष्ट मात्रा में निर्दिष्ट क्रम में। |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform)(float, float) | इसके स्थानीय ज्यामितीय परिवर्तन का अनुवाद करता हैTextureBrushनिर्दिष्ट आयामों द्वारा वस्तु। यह विधि अनुवाद को परिवर्तन के लिए प्रस्तुत करती है। |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | इसके स्थानीय ज्यामितीय परिवर्तन का अनुवाद करता हैTextureBrush निर्दिष्ट आयाम द्वारा वस्तु निर्दिष्ट क्रम में। |

### यह सभी देखें

* class [Brush](../brush/)
* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


