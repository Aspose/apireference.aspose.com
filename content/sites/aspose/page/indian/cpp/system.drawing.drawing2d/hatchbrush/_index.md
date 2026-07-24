---
title: "System::Drawing::Drawing2D::HatchBrush क्लास"
linktitle: "HatchBrush"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Drawing2D::HatchBrush क्लास। एक आयताकार ब्रश को दर्शाता है जिसमें हैच शैली, एक अग्रभूमि रंग, और एक पृष्ठभूमि रंग होता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 800
url: /hi/cpp/system.drawing.drawing2d/hatchbrush/
---
## HatchBrush class


एक आयताकार ब्रश को दर्शाता है जिसमें हैच शैली, एक अग्रभूमि रंग, और एक पृष्ठभूमि रंग होता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HatchBrush : public System::Drawing::Brush
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | वर्तमान वस्तु की एक सटीक प्रति बनाता है। |
| [get_BackgroundColor](./get_backgroundcolor/)() const | इस ब्रश के पृष्ठभूमि रंग को दर्शाने वाला मान लौटाता है। |
| [get_ForegroundColor](./get_foregroundcolor/)() const | इस ब्रश के अग्रभूमि रंग को दर्शाने वाला मान लौटाता है। |
| [get_HatchStyle](./get_hatchstyle/)() const | इस ब्रश की हैच शैली को दर्शाने वाला मान लौटाता है। |
| [HatchBrush](./hatchbrush/)(HatchStyle, Color, Color) | RTTI जानकारी। |
## संबंधित देखें

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
