---
title: "System::Text::UTF32Encoding वर्ग"
linktitle: "UTF32Encoding"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::UTF32Encoding वर्ग। UTF-32 एन्कोडिंग। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2600
url: /hi/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


UTF-32 एन्कोडिंग। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | एन्कोडिंग ऑब्जेक्ट को क्लोन करता है। |
| [Equals](./equals/)(SharedPtr\<Object\>) override | ऑब्जेक्ट के साथ तुलना करता है। |
| [GetHashCode](./gethashcode/)() const override | एन्कोडिंग हैश कोड प्राप्त करता है। |
| [GetPreamble](./getpreamble/)() override | कोडपेज प्रीऐम्बल प्राप्त करें। |
| [operator==](./operator==/)(const UTF32Encoding\&) const | एन्कोडिंग के पैरामीटर की तुलना करता है। |
| [UTF32Encoding](./utf32encoding/)() | निर्माता। |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | निर्माता। |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | निर्माता। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | बड़े एंडियन UTF-32 कोडपेज आईडी के लिए [Windows](../../system.windows/) द्वारा उपयोग किया गया मैजिक नंबर। |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | डिफ़ॉल्ट कोडपेज मान। |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | छोटे एंडियन UTF-32 कोडपेज आईडी के लिए [Windows](../../system.windows/) द्वारा उपयोग किया गया मैजिक नंबर। |
## संबंधित देखें

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
