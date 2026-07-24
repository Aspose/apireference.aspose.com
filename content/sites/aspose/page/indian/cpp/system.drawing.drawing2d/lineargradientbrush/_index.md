---
title: "System::Drawing::Drawing2D::LinearGradientBrush क्लास"
linktitle: "LinearGradientBrush"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Drawing2D::LinearGradientBrush क्लास. एक रैखिक ग्रेडिएंट ब्रश का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।"
type: docs
weight: 900
url: /hi/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


एक रैखिक ग्रेडिएंट ब्रश का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | वर्तमान वस्तु की एक प्रति बनाता है। |
| [get_Blend](./get_blend/)() const | इस ब्रश के लिए बेस रंगों के कारकों और स्थितियों को निर्दिष्ट करने वाला ब्लेंड लौटाता है। |
| [get_GammaCorrection](./get_gammacorrection/)() const | एक मान लौटाता है जो दर्शाता है कि इस ब्रश के लिए गामा सुधार सक्षम है। |
| [get_InterpolationColors](./get_interpolationcolors/)() const | एक [ColorBlend](../colorblend/) वस्तु लौटाता है जो बहु-रंग रैखिक ग्रेडिएंट को परिभाषित करती है। |
| [get_LinearColors](./get_linearcolors/)() const | इस ग्रेडिएंट के प्रारंभिक और समाप्ति रंग लौटाता है। |
| [get_Rectangle](./get_rectangle/)() | एक बाउंडिंग आयत लौटाता है। |
| [get_Transform](./get_transform/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए ब्रश के लिए ज्यामितीय रूपांतरण निर्दिष्ट करने वाले एक [Matrix](../matrix/) वस्तु की प्रतिलिपि लौटाता है। |
| [get_WrapMode](./get_wrapmode/)() const | रैप मोड लौटाता है। |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | RTTI जानकारी। |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | [LinearGradientBrush](./) का नया उदाहरण बनाता है। |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | [LinearGradientBrush](./) का नया उदाहरण बनाता है। |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | [LinearGradientBrush](./) का नया उदाहरण बनाता है। |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | [LinearGradientBrush](./) का नया उदाहरण बनाता है। |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | [LinearGradientBrush](./) का नया उदाहरण बनाता है। |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | वर्तमान ऑब्जेक्ट के ट्रांसफ़ॉर्म मैट्रिक्स को निर्दिष्ट मैट्रिक्स से गुणा करता है। |
| [ResetTransform](./resettransform/)() | वर्तमान वस्तु के रूपांतरण मैट्रिक्स को रीसेट करता है। |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | वर्तमान वस्तु के रूपांतरण मैट्रिक्स को घुमाता है। |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | वर्तमान वस्तु के रूपांतरण मैट्रिक्स को स्केल करता है। |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | इस ब्रश के लिए बेस रंगों के कारकों और स्थितियों को निर्दिष्ट करने वाला ब्लेंड सेट करता है। |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | इस ब्रश के लिए गामा सुधार स्थिति सेट करता है। |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | एक [ColorBlend](../colorblend/) वस्तु सेट करता है जो बहु-रंग रैखिक ग्रेडिएंट को परिभाषित करती है। |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | इस ग्रेडिएंट के प्रारंभिक और अंतिम रंग सेट करता है। |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | एक [Matrix](../matrix/) ऑब्जेक्ट सेट करता है जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ब्रश के लिए ज्यामितीय रूपांतरण निर्दिष्ट करता है। |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | रैप मोड सेट करता है। |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | लागू नहीं किया गया। |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | लागू नहीं किया गया। |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | वर्तमान ऑब्जेक्ट की ट्रांसफ़ॉर्म मैट्रिक्स को ट्रांसलेट करता है। |
## संबंधित देखें

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
