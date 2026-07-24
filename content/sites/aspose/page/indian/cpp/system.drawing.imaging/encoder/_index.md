---
title: "System::Drawing::Imaging::Encoder class"
linktitle: "Encoder"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Imaging::Encoder क्लास। एक GUID का प्रतिनिधित्व करता है जो छवि एन्कोडर पैरामीटरों के सेट से जुड़ा है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 500
url: /hi/cpp/system.drawing.imaging/encoder/
---
## Encoder class


एक GUID का प्रतिनिधित्व करता है जो छवि एन्कोडर पैरामीटरों के सेट से जुड़ा है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Encoder : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Encoder](./encoder/)(const Guid\&) | एक नया इंस्टेंस बनाता है [Encoder](./) क्लास का। |
| [get_Guid](./get_guid/)() const | एक GUID लौटाता है जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए छवि एन्कोडर पैरामीटरों के सेट को निर्दिष्ट करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [ChrominanceTable](./chrominancetable/) | [Encoder](./) क्लास का एक इंस्टेंस जो क्रोमिनेंस टेबल पैरामीटर श्रेणी का प्रतिनिधित्व करता है। |
| static [ColorDepth](./colordepth/) | एक उदाहरण [Encoder](./) क्लास का जो रंग गहराई पैरामीटर श्रेणी का प्रतिनिधित्व करता है। |
| static [Compression](./compression/) | एक उदाहरण [Encoder](./) क्लास का जो संपीड़न पैरामीटर श्रेणी का प्रतिनिधित्व करता है। |
| static [LuminanceTable](./luminancetable/) | एक उदाहरण [Encoder](./) क्लास का जो चमक तालिका पैरामीटर श्रेणी का प्रतिनिधित्व करता है। |
| static [Quality](./quality/) | एक उदाहरण [Encoder](./) क्लास का जो गुणवत्ता पैरामीटर श्रेणी का प्रतिनिधित्व करता है। |
| static [RenderMethod](./rendermethod/) | एक उदाहरण [Encoder](./) क्लास का जो रेंडर विधि पैरामीटर श्रेणी का प्रतिनिधित्व करता है। |
| static [SaveFlag](./saveflag/) | एक उदाहरण [Encoder](./) क्लास का जो सहेजने का फ़्लैग पैरामीटर श्रेणी का प्रतिनिधित्व करता है। |
| static [ScanMethod](./scanmethod/) | एक उदाहरण [Encoder](./) क्लास का जो स्कैन विधि पैरामीटर श्रेणी का प्रतिनिधित्व करता है। |
| static [Transformation](./transformation/) | एक उदाहरण [Encoder](./) क्लास का जो रूपांतरण पैरामीटर श्रेणी का प्रतिनिधित्व करता है। |
| static [Version](./version/) | एक उदाहरण [Encoder](./) क्लास का जो संस्करण पैरामीटर श्रेणी का प्रतिनिधित्व करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
