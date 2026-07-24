---
title: "System::Drawing::Drawing2D::PathGradientBrush क्लास"
linktitle: "PathGradientBrush"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Drawing2D::PathGradientBrush क्लास। यह एक ब्रश का प्रतिनिधित्व करता है जो एक GraphicsPath ऑब्जेक्ट के अंदर को ग्रेडिएंट से भरता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।"
type: docs
weight: 1200
url: /hi/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


एक ब्रश का प्रतिनिधित्व करता है जो एक [GraphicsPath](../graphicspath/) ऑब्जेक्ट के अंदर को ग्रेडिएंट से भरता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | वर्तमान वस्तु की एक प्रति बनाता है। |
| [get_Blend](./get_blend/)() const | लागू नहीं किया गया। |
| [get_CenterColor](./get_centercolor/)() const | वर्तमान ऑब्जेक्ट द्वारा भरे गए पथ के केंद्र में स्थित रंग को लौटाता है। |
| [get_CenterPoint](./get_centerpoint/)() const | ग्रेडिएंट का केंद्र बिंदु प्राप्त करता है। |
| [get_FocusScales](./get_focusscales/)() const | ग्रेडिएंट के फ़ॉलऑफ़ के लिए फोकस बिंदु प्राप्त करता है। |
| [get_InterpolationColors](./get_interpolationcolors/)() const | एक बहु‑रंग रैखिक ग्रेडिएंट को परिभाषित करने वाला मान लौटाता है। |
| [get_Rectangle](./get_rectangle/)() | लागू नहीं किया गया। |
| [get_SurroundColors](./get_surroundcolors/)() const | उस [PathGradientBrush](./) द्वारा भरे गए पथ के बिंदुओं के अनुरूप रंगों को लौटाता है। |
| [get_Transform](./get_transform/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए ब्रश के लिए ज्यामितीय रूपांतरण निर्दिष्ट करने वाले एक [Matrix](../matrix/) वस्तु की प्रतिलिपि लौटाता है। |
| [get_WrapMode](./get_wrapmode/)() const | रैप मोड लौटाता है। |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | वर्तमान ऑब्जेक्ट के ट्रांसफ़ॉर्म मैट्रिक्स को निर्दिष्ट मैट्रिक्स से गुणा करता है। |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | RTTI जानकारी। |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | [PathGradientBrush](./) क्लास का नया इंस्टेंस बनाता है। |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | [PathGradientBrush](./) क्लास का नया इंस्टेंस बनाता है। |
| [ResetTransform](./resettransform/)() | वर्तमान ऑब्जेक्ट के ट्रांसफ़ॉर्म मैट्रिक्स को रीसेट करता है ताकि वह पहचान (identity) मैट्रिक्स बन जाए। |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट कोण द्वारा स्थानीय ज्यामितीय रूपांतरण को घुमाता है। |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट गुणकों द्वारा स्थानीय ज्यामितीय रूपांतरण को स्केल करता है। |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | इस ब्रश के लिए बेस रंगों के कारकों और स्थितियों को निर्दिष्ट करने वाला ब्लेंड सेट करता है। |
| [set_CenterColor](./set_centercolor/)(Color) | वर्तमान ऑब्जेक्ट द्वारा भरे गए पथ के केंद्र में स्थित रंग सेट करता है। |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | ग्रेडिएंट का केंद्र बिंदु सेट करता है। |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | ग्रेडिएंट के फ़ॉलऑफ़ के लिए फोकस बिंदु सेट करता है। |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | एक बहु‑रंग रैखिक ग्रेडिएंट को परिभाषित करने वाला मान सेट करता है। |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | उस [PathGradientBrush](./) द्वारा भरे गए पथ के बिंदुओं के अनुरूप रंग सेट करता है। |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | एक [Matrix](../matrix/) ऑब्जेक्ट सेट करता है जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ब्रश के लिए ज्यामितीय रूपांतरण निर्दिष्ट करता है। |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | रैप मोड सेट करता है। |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | लागू नहीं किया गया। |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | लागू नहीं किया गया। |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट आयामों द्वारा स्थानीय ज्यामितीय रूपांतरण को अनुवादित (ट्रांसलेट) करता है। |
## संबंधित देखें

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
