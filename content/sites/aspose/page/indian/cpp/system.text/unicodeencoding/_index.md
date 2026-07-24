---
title: "System::Text::UnicodeEncoding क्लास"
linktitle: "UnicodeEncoding"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::UnicodeEncoding क्लास। Unicode एन्कोडिंग। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2500
url: /hi/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


Unicode एन्कोडिंग। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | एन्कोडिंग ऑब्जेक्ट को क्लोन करता है। |
| [Equals](./equals/)(SharedPtr\<Object\>) override | एन्कोडिंग्स की तुलना करता है। |
| [GetHashCode](./gethashcode/)() const override | एन्कोडिंग को हैश करता है। |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | निर्दिष्ट संख्या में अक्षरों को एन्कोड करने के लिए आवश्यक अधिकतम बाइट्स की संख्या प्राप्त करें। |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | निर्दिष्ट बाइट्स की संख्या को डिकोड करने के लिए आवश्यक अधिकतम अक्षरों की संख्या प्राप्त करें। |
| [GetPreamble](./getpreamble/)() override | एन्कोडिंग को दर्शाने वाला बाइट्स का अनुक्रम लौटाता है (उदा. BOM)। |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | कोडपेज और फ़्लैग्स द्वारा एन्कोडिंग की तुलना करता है। |
| [UnicodeEncoding](./unicodeencoding/)() | निर्माता। |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | निर्माता। |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | निर्माता। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | बिग एंडियन कोडपेज संख्या। |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | डिफ़ॉल्ट कोडपेज मान। |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | लिटिल एंडियन कोडपेज संख्या। |
## संबंधित देखें

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
