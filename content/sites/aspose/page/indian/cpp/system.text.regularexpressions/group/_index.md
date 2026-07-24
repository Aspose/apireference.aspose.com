---
title: "System::Text::RegularExpressions::Group क्लास"
linktitle: "Group"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::RegularExpressions::Group क्लास। एकल कैप्चरिंग ग्रुप द्वारा किया गया मिलान परिणाम। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। कभी भी इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 300
url: /hi/cpp/system.text.regularexpressions/group/
---
## Group class


एकल कैप्चरिंग ग्रुप द्वारा किया गया मिलान परिणाम। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। कभी भी इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Group : public System::Text::RegularExpressions::Capture
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | ग्रुप में कैप्चर जोड़ता है। |
| [get_Captures](./get_captures/)() | उपलब्ध कैप्चर प्राप्त करता है। |
| [get_Success](./get_success/)() | जाँचता है कि इस ग्रुप के लिए कैप्चर सफल रहा या नहीं। |
| [Group](./group/)(const UStringPtr\&, int, int) | निर्माता। |
| [Group](./group/)() | खाली ग्रुप का कन्स्ट्रक्टर। |
## संबंधित देखें

* Class [Capture](../capture/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
