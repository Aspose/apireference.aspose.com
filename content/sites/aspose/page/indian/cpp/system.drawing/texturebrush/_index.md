---
title: "System::Drawing::TextureBrush क्लास"
linktitle: "TextureBrush"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::TextureBrush क्लास। एक ब्रश का प्रतिनिधित्व करता है जो किसी आकार के अंदरूनी भाग को भरने के लिए छवि का उपयोग करता है। इस क्लास के ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2800
url: /hi/cpp/system.drawing/texturebrush/
---
## TextureBrush class


एक ब्रश का प्रतिनिधित्व करता है जो किसी आकार के अंदरूनी भाग को भरने के लिए छवि का उपयोग करता है। इस क्लास के ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

```cpp
class TextureBrush : public System::Drawing::Brush
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | वर्तमान वस्तु की एक प्रति बनाता है। |
| [get_Image](./get_image/)() | वर्तमान [TextureBrush](./) ऑब्जेक्ट द्वारा उपयोग की गई छवि लौटाता है। |
| [get_Transform](./get_transform/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ब्रश के लिए ज्यामितीय रूपांतरण निर्दिष्ट करने वाले Matrix ऑब्जेक्ट की एक कॉपी लौटाता है। |
| [get_WrapMode](./get_wrapmode/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ब्रश के टाइलिंग तरीके को निर्दिष्ट करने वाला मान लौटाता है। |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | वर्तमान ऑब्जेक्ट के ट्रांसफ़ॉर्म मैट्रिक्स को निर्दिष्ट मैट्रिक्स से गुणा करता है। |
| [ResetTransform](./resettransform/)() | वर्तमान ऑब्जेक्ट के ट्रांसफ़ॉर्म मैट्रिक्स को रीसेट करता है ताकि वह पहचान (identity) मैट्रिक्स बन जाए। |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट कोण द्वारा स्थानीय ज्यामितीय रूपांतरण को घुमाता है। |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट गुणकों द्वारा स्थानीय ज्यामितीय रूपांतरण को स्केल करता है। |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ब्रश के लिए ज्यामितीय रूपांतरण निर्दिष्ट करने वाला Matrix ऑब्जेक्ट सेट करता है। |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ब्रश के टाइलिंग तरीके को निर्दिष्ट करने वाला मान सेट करता है। |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | निर्दिष्ट छवि का उपयोग करने वाले [TextureBrush](./) क्लास का एक नया इंस्टेंस बनाता है। |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | निर्दिष्ट छवि का उपयोग करने वाले [TextureBrush](./) क्लास का एक नया इंस्टेंस बनाता है। |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | निर्दिष्ट छवि का उपयोग करने वाले [TextureBrush](./) क्लास का एक नया इंस्टेंस बनाता है। |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | निर्दिष्ट छवि का उपयोग करने वाले [TextureBrush](./) क्लास का एक नया इंस्टेंस बनाता है। |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | निर्दिष्ट छवि का उपयोग करने वाले [TextureBrush](./) क्लास का एक नया इंस्टेंस बनाता है। |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट आयामों द्वारा स्थानीय ज्यामितीय रूपांतरण को अनुवादित (ट्रांसलेट) करता है। |
| virtual [~TextureBrush](./~texturebrush/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
