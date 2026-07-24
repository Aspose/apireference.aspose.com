---
title: "System::Drawing::Drawing2D::CustomLineCap क्लास"
linktitle: "CustomLineCap"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Drawing2D::CustomLineCap क्लास। उपयोगकर्ता-परिभाषित लाइन कैप का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।"
type: docs
weight: 400
url: /hi/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


उपयोगकर्ता-परिभाषित लाइन कैप का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class CustomLineCap : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Clone](./clone/)() | वर्तमान ऑब्जेक्ट की एक प्रति लौटाता है। |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | [CustomLineCap](./) क्लास का एक नया उदाहरण बनाता है जो निर्दिष्ट गुणों के साथ उपयोगकर्ता-परिभाषित लाइन कैप का प्रतिनिधित्व करता है। |
| [Dispose](./dispose/)() | वर्तमान ऑब्जेक्ट द्वारा प्राप्त सभी ऑपरेटिंग सिस्टम संसाधनों को रिलीज़ करता है। |
| [get_BaseCap](./get_basecap/)() const | इस कस्टम कैप को बनाने वाले बेस लाइन कैप को लौटाता है। |
| [get_BaseInset](./get_baseinset/)() const | लाइन और कैप के बीच की दूरी को लौटाता है। |
| [get_StrokeJoin](./get_strokejoin/)() const | इस कस्टम कैप की लाइनों के जुड़ने के तरीके को निर्धारित करने वाला [LineJoin](../linejoin/) मान लौटाता है। |
| [get_WidthScale](./get_widthscale/)() const | इस कस्टम कैप का स्केल लौटाता है। |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए कस्टम कैप के प्रारंभ और अंत लाइन कैप प्राप्त करता है। |
| [set_BaseCap](./set_basecap/)(LineCap) | इस कस्टम कैप के लिए बेस लाइन कैप मान सेट करता है। |
| [set_BaseInset](./set_baseinset/)(float) | लाइन और कैप के बीच की दूरी सेट करता है। |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | इस कस्टम कैप की लाइनों के जुड़ने के तरीके को निर्धारित करने वाला [LineJoin](../linejoin/) मान सेट करता है। |
| [set_WidthScale](./set_widthscale/)(float) | इस कस्टम कैप का स्केल मान सेट करता है। |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए कस्टम कैप के प्रारंभ और अंत लाइन कैप सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
