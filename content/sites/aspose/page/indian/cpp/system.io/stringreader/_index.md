---
title: "System::IO::StringReader क्लास"
linktitle: "StringReader"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::StringReader क्लास। यह एक रीडर का प्रतिनिधित्व करता है जो स्ट्रिंग से अक्षर पढ़ता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2400
url: /hi/cpp/system.io/stringreader/
---
## StringReader class


एक रीडर का प्रतिनिधित्व करता है जो स्ट्रिंग से अक्षर पढ़ता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class StringReader : public System::IO::TextReader
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() override | स्ट्रीम को बंद करता है। |
| [Dispose](./dispose/)() override | कुछ नहीं करता। |
| [Dispose](./dispose/)(bool) override | कुछ नहीं करता। |
| [Peek](./peek/)() override | स्ट्रीम की स्थिति बदले बिना स्ट्रीम से एकल अक्षर पढ़ता है। |
| [Read](./read/)() override | स्ट्रीम से एक एकल अक्षर पढ़ता है। |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | निर्दिष्ट स्थिति से शुरू होकर, निर्दिष्ट संख्या में अक्षरों को स्ट्रीम से निर्दिष्ट कैरेक्टर एरे में पढ़ता है। |
| [ReadLine](./readline/)() override | स्ट्रीम से अक्षर पढ़ता है जब तक वर्तमान पंक्ति का अंत नहीं हो जाता। |
| [ReadToEnd](./readtoend/)() override | स्ट्रीम से अक्षर पढ़ता है जब तक स्ट्रीम का अंत नहीं हो जाता। |
| [StringReader](./stringreader/)(const String\&) | निर्दिष्ट स्ट्रिंग से अक्षर पढ़ने वाली [StringReader](./) क्लास का नया इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
