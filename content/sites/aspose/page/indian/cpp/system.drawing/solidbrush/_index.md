---
title: "System::Drawing::SolidBrush class"
linktitle: "SolidBrush"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::SolidBrush वर्ग। एकल‑रंग ब्रश का प्रतिनिधित्व करता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2400
url: /hi/cpp/system.drawing/solidbrush/
---
## SolidBrush class


एकल‑रंग ब्रश का प्रतिनिधित्व करता है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SolidBrush : public System::Drawing::Brush
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | वर्तमान वस्तु की एक प्रति बनाता है। |
| [get_Color](./get_color/)() const | इस ब्रश का रंग लौटाता है। |
| [set_Color](./set_color/)(Color) | इस ब्रश का रंग सेट करता है। |
| [SolidBrush](./solidbrush/)(const Color\&) | एक नया [SolidBrush](./) वस्तु बनाता है और इसे निर्दिष्ट रंग से प्रारंभ करता है। |
## संबंधित देखें

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
