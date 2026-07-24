---
title: "System::Drawing::Imaging::ColorMap वर्ग"
linktitle: "ColorMap"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Imaging::ColorMap वर्ग. यह रंगों को परिवर्तित करने के लिए एक मानचित्र दर्शाता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 200
url: /hi/cpp/system.drawing.imaging/colormap/
---
## ColorMap class


रंगों को परिवर्तित करने के लिए एक मानचित्र दर्शाता है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ColorMap : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_NewColor](./get_newcolor/)() const | नए [Color](../../system.drawing/color/) ऑब्जेक्ट को लौटाता है जो उस रंग का प्रतिनिधित्व करता है जिसमें परिवर्तित किया जाना है। |
| [get_OldColor](./get_oldcolor/)() const | पुराने [Color](../../system.drawing/color/) ऑब्जेक्ट को लौटाता है जो परिवर्तित किए जाने वाले रंग का प्रतिनिधित्व करता है। |
| [set_NewColor](./set_newcolor/)(const Color\&) | नए [Color](../../system.drawing/color/) ऑब्जेक्ट को सेट करता है जो उस रंग का प्रतिनिधित्व करता है जिसमें परिवर्तित किया जाना है। |
| [set_OldColor](./set_oldcolor/)(const Color\&) | पुराने [Color](../../system.drawing/color/) ऑब्जेक्ट को सेट करता है जो परिवर्तित किए जाने वाले रंग का प्रतिनिधित्व करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
