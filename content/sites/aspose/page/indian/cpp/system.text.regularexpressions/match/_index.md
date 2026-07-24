---
title: "System::Text::RegularExpressions::Match क्लास"
linktitle: "Match"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::RegularExpressions::Match क्लास। स्ट्रिंग पर रेगेक्स का एकल मैच। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 600
url: /hi/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | मैच में कैप्चर जोड़ता है। |
| [AddGroup](./addgroup/)(const GroupPtr\&) | मैच में समूह जोड़ता है। |
| static [get_Empty](./get_empty/)() | खाली मैच एक्सेसर। |
| [get_Groups](./get_groups/)() | समूह सूची प्राप्त करता है। |
| [Match](./match/)(const UStringPtr\&, int, int) | निर्माता। |
| [NextMatch](./nextmatch/)() | मैचों पर पुनरावृत्ति। |
| virtual [Result](./result/)(const String\&) | सबमैच संदर्भों को उनके मानों से बदलकर स्ट्रिंग को स्वरूपित करता है। |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## संबंधित देखें

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
