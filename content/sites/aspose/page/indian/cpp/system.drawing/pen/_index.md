---
title: "System::Drawing::Pen class"
linktitle: "Pen"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Pen class. खींची जा रही रेखाओं और वक्रों के रंग, चौड़ाई आदि जैसी गुणों का प्रतिनिधित्व करता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1500
url: /hi/cpp/system.drawing/pen/
---
## Pen class


रंग, चौड़ाई आदि जैसी गुणों का प्रतिनिधित्व करता है जो खींची जा रही रेखाओं और वक्रों के हैं। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

```cpp
class Pen : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() | वर्तमान ऑब्जेक्ट की एक प्रति लौटाता है। |
| [Dispose](./dispose/)() | वर्तमान वस्तु द्वारा प्राप्त सभी संचालन संसाधनों को मुक्त करता है। |
| [get_Alignment](./get_alignment/)() const | वर्तमान [Pen](./) वस्तु की संरेखण दर्शाने वाला मान लौटाता है। |
| [get_Brush](./get_brush/)() | इस पेन का [Brush](../brush/) वस्तु लौटाता है। |
| [get_Color](./get_color/)() const | इस पेन का रंग लौटाता है। |
| [get_CompoundArray](./get_compoundarray/)() const | एक संयोजित पेन को निर्दिष्ट करने वाले मानों की एक सरणी लौटाता है। |
| [get_DashCap](./get_dashcap/)() const | डैश्ड लाइन के दोनों सिरों पर उपयोग किए जाने वाले कैप को दर्शाने वाला मान लौटाता है। |
| [get_DashOffset](./get_dashoffset/)() const | लाइन की शुरुआत से डैश पैटर्न की शुरुआत तक की दूरी लौटाता है। |
| [get_DashPattern](./get_dashpattern/)() const | डैश्ड लाइन में कस्टम डैश पैटर्न दर्शाने वाली एक सरणी लौटाता है। |
| [get_DashStyle](./get_dashstyle/)() const | वर्तमान [Pen](./) ऑब्जेक्ट की डैश शैली को दर्शाने वाला मान लौटाता है। |
| [get_EndCap](./get_endcap/)() const | वर्तमान [Pen](./) ऑब्जेक्ट के समाप्ति लाइन कैप को दर्शाने वाला मान लौटाता है। |
| [get_LineJoin](./get_linejoin/)() const | इस [Pen](./) ऑब्जेक्ट द्वारा खींची गई लाइनों के जुड़ने के तरीके को दर्शाने वाला मान लौटाता है। |
| [get_MiterLimit](./get_miterlimit/)() const | माइटर्ड कोने पर जॉइन की मोटाई की सीमा लौटाता है। |
| [get_PenType](./get_pentype/)() const | लागू नहीं किया गया। |
| [get_StartCap](./get_startcap/)() const | वर्तमान [Pen](./) ऑब्जेक्ट के प्रारंभिक लाइन कैप को दर्शाने वाला मान लौटाता है। |
| [get_Transform](./get_transform/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए पेन के लिए ज्यामितीय रूपांतरण निर्दिष्ट करने वाले मैट्रिक्स ऑब्जेक्ट की एक प्रति लौटाता है। |
| [get_Width](./get_width/)() const | वर्तमान [Pen](./) ऑब्जेक्ट की चौड़ाई लौटाता है। |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | वर्तमान ऑब्जेक्ट के ट्रांसफ़ॉर्म मैट्रिक्स को निर्दिष्ट मैट्रिक्स से गुणा करता है। |
| [Pen](./pen/)(const Color\&) | निर्दिष्ट रंग को दर्शाने वाला नया [Pen](./) ऑब्जेक्ट बनाता है। |
| [Pen](./pen/)(const Color\&, float) | निर्दिष्ट रंग और चौड़ाई को दर्शाने वाला नया [Pen](./) ऑब्जेक्ट बनाता है। |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | एक नया [Pen](./) ऑब्जेक्ट बनाता है और इसे निर्दिष्ट [Brush](../brush/) ऑब्जेक्ट से प्रारंभ करता है। |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | एक नया [Pen](./) ऑब्जेक्ट बनाता है और इसे निर्दिष्ट [Brush](../brush/) ऑब्जेक्ट से प्रारंभ करता है। |
| [ResetTransform](./resettransform/)() | वर्तमान ऑब्जेक्ट के ट्रांसफ़ॉर्म मैट्रिक्स को रीसेट करता है ताकि वह पहचान (identity) मैट्रिक्स बन जाए। |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट कोण द्वारा स्थानीय ज्यामितीय रूपांतरण को घुमाता है। |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट गुणकों द्वारा स्थानीय ज्यामितीय रूपांतरण को स्केल करता है। |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | वर्तमान [Pen](./) ऑब्जेक्ट की संरेखण सेट करता है। |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | इस पेन के [Brush](../brush/) ऑब्जेक्ट को सेट करता है। |
| [set_Color](./set_color/)(const Color\&) | इस पेन का रंग सेट करता है। |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | एक संयोजित पेन को निर्दिष्ट करने वाले मानों की सरणी सेट करता है। |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | कस्टम समाप्ति लाइन कैप सेट करता है। |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | कस्टम प्रारंभिक लाइन कैप सेट करता है। |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | डैश्ड लाइन के दोनों सिरों पर उपयोग किए जाने वाले कैप को निर्दिष्ट करने वाला मान सेट करता है। |
| [set_DashOffset](./set_dashoffset/)(float) | लाइन की शुरुआत से डैश पैटर्न की शुरुआत तक की दूरी सेट करता है। |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | डैश्ड लाइन में कस्टम डैश पैटर्न निर्दिष्ट करने वाली एक सरणी सेट करता है। यह सरणी वैकल्पिक डैश और स्पेस की लंबाई को दर्शाने वाले संख्याओं से बनी होती है। |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | वर्तमान [Pen](./) ऑब्जेक्ट की डैश शैली को निर्दिष्ट करने वाला मान सेट करता है। |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | वर्तमान [Pen](./) ऑब्जेक्ट के समाप्ति लाइन कैप को सेट करता है। |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | एक मान सेट करता है जो निर्धारित करता है कि इस [Pen](./) ऑब्जेक्ट द्वारा खींची गई रेखाएँ कैसे जुड़ी जाती हैं। |
| [set_MiterLimit](./set_miterlimit/)(float) | मिटर्ड कोने पर जॉइन की मोटाई की सीमा सेट करता है। |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | वर्तमान [Pen](./) ऑब्जेक्ट की प्रारंभिक लाइन कैप सेट करता है। |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए पेन के लिए ज्यामितीय रूपांतरण निर्दिष्ट करने वाला एक Matrix ऑब्जेक्ट सेट करता है। |
| [set_Width](./set_width/)(float) | वर्तमान [Pen](./) ऑब्जेक्ट की चौड़ाई सेट करता है। |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | लागू नहीं किया गया। |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | निर्दिष्ट क्रम में निर्दिष्ट आयामों द्वारा स्थानीय ज्यामितीय रूपांतरण को अनुवादित (ट्रांसलेट) करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
