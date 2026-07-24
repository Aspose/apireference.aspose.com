---
title: "System::Text::ASCIIEncoding वर्ग"
linktitle: "ASCIIEncoding"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::ASCIIEncoding क्लास। ASCII एन्कोडिंग का प्रतिनिधित्व करती है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 100
url: /hi/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


ASCII एन्कोडिंग का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | निर्माता। |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | ज्ञात अक्षर गिनती वाली स्ट्रिंग को रखने के लिए संभव अधिकतम बाइट गिनती प्राप्त करता है। |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | निर्दिष्ट बाइट्स की संख्या को डिकोड करने के लिए आवश्यक अधिकतम अक्षरों की संख्या प्राप्त करें। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI। |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | डिफ़ॉल्ट कोडपेज मान। |
## संबंधित देखें

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
