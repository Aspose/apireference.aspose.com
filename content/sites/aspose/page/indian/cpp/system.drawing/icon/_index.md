---
title: "System::Drawing::Icon क्लास"
linktitle: "Icon"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Icon क्लास। एक Windows आइकन का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में आर्ग्युमेंट के रूप में पास करें।"
type: docs
weight: 1100
url: /hi/cpp/system.drawing/icon/
---
## Icon class


एक [Windows](../../system.windows/) आइकन का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में आर्ग्युमेंट के रूप में पास करें।

```cpp
class Icon : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Height](./get_height/)() const | आइकन की ऊँचाई लौटाता है। |
| [get_Width](./get_width/)() const | आइकन की चौड़ाई लौटाता है। |
| [Icon](./icon/)(const String\&) | निर्दिष्ट फ़ाइल से एक आइकन का प्रतिनिधित्व करने वाले [Icon](./) क्लास का नया इंस्टेंस बनाता है। |
| [ToBitmap](./tobitmap/)() | वर्तमान ऑब्जेक्ट को एक [Bitmap](../bitmap/) ऑब्जेक्ट में परिवर्तित करता है। |
| virtual [~Icon](./~icon/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
