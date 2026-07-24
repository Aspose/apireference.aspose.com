---
title: "System::Text::UTF7Encoding क्लास"
linktitle: "UTF7Encoding"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::UTF7Encoding क्लास। UTF-7 एन्कोडिंग। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2700
url: /hi/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


UTF-7 एन्कोडिंग। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | एन्कोडिंग ऑब्जेक्ट को क्लोन करता है। |
| [Equals](./equals/)(SharedPtr\<Object\>) override | ऑब्जेक्ट के साथ तुलना करता है। |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | एक कैरेक्टर बफ़र को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetByteCount](./getbytecount/)(const String\&) | एक स्ट्रिंग को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | एक कैरेक्टर बफ़र को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(const String\&) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | एक बाइट बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | एक बाइट बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | एक बाइट बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| [GetDecoder](./getdecoder/)() override | एक डिकोडर प्राप्त करें जो अनुरोधों को इस वस्तु की ओर अग्रसर करता है। |
| [GetEncoder](./getencoder/)() override | एक एन्कोडर प्राप्त करें जो अनुरोधों को इस वस्तु की ओर अग्रसर करता है। |
| [GetHashCode](./gethashcode/)() const override | एन्कोडिंग हैश कोड प्राप्त करता है। |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | निर्दिष्ट संख्या में अक्षरों को एन्कोड करने के लिए आवश्यक अधिकतम बाइट्स की संख्या प्राप्त करें। |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | निर्दिष्ट बाइट्स की संख्या को डिकोड करने के लिए आवश्यक अधिकतम अक्षरों की संख्या प्राप्त करें। |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| virtual [GetString](./getstring/)(uint8_t *, int) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| [operator==](./operator==/)(const UTF7Encoding\&) const | एन्कोडिंग पैरामीटरों की तुलना करता है। |
| [UTF7Encoding](./utf7encoding/)() | निर्माता। |
| [UTF7Encoding](./utf7encoding/)(bool) | निर्माता। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | डिफ़ॉल्ट कोडपेज मान। |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | UTF-7 कोडपेज आईडी के लिए [Windows](../../system.windows/) द्वारा उपयोग किया गया जादू संख्या। |
## संबंधित देखें

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
