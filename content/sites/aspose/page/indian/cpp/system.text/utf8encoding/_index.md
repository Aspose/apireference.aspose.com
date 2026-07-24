---
title: "System::Text::UTF8Encoding क्लास"
linktitle: "UTF8Encoding"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::UTF8Encoding क्लास। UTF-8 एन्कोडिंग। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 2800
url: /hi/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


UTF-8 एन्कोडिंग। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | एन्कोडिंग ऑब्जेक्ट को क्लोन करता है। |
| [Equals](./equals/)(SharedPtr\<Object\>) override | ऑब्जेक्ट के साथ तुलना करता है। |
| [GetHashCode](./gethashcode/)() const override | एन्कोडिंग हैश कोड प्राप्त करता है। |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | निर्दिष्ट संख्या में अक्षरों को एन्कोड करने के लिए आवश्यक अधिकतम बाइट्स की संख्या प्राप्त करें। |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | निर्दिष्ट बाइट्स की संख्या को डिकोड करने के लिए आवश्यक अधिकतम अक्षरों की संख्या प्राप्त करें। |
| [GetPreamble](./getpreamble/)() override | कोडपेज प्रीऐम्बल प्राप्त करें। |
| [operator==](./operator==/)(const UTF8Encoding\&) const | एन्कोडिंग पैरामीटरों की तुलना करता है। |
| [UTF8Encoding](./utf8encoding/)() | निर्माता। |
| [UTF8Encoding](./utf8encoding/)(bool) | निर्माता। |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | निर्माता। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | डिफ़ॉल्ट कोडपेज मान। |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | RTTI जानकारी। |
## संबंधित देखें

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
