---
title: "System::Text::ICUEncoding क्लास"
linktitle: "ICUEncoding"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::ICUEncoding क्लास। ICU-आधारित एन्कोडिंग कार्यान्वयन। आंतरिक उपयोग के लिए। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को C++ में तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2200
url: /hi/cpp/system.text/icuencoding/
---
## ICUEncoding class


ICU-आधारित एन्कोडिंग कार्यान्वयन। आंतरिक उपयोग के लिए। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ICUEncoding : public System::Text::Encoding
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | एक कैरेक्टर बफ़र को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI। |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI। |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI। |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI। |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI। |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(const String\&) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | एक बाइट बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | एक बाइट बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | एक बाइट बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| [GetDecoder](./getdecoder/)() override | एक डिकोडर प्राप्त करें जो अनुरोधों को इस वस्तु की ओर अग्रसर करता है। |
| [GetEncoder](./getencoder/)() override | एक एन्कोडर प्राप्त करें जो अनुरोधों को इस वस्तु की ओर अग्रसर करता है। |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | निर्दिष्ट संख्या में अक्षरों को एन्कोड करने के लिए आवश्यक अधिकतम बाइट्स की संख्या प्राप्त करें। |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | निर्दिष्ट बाइट्स की संख्या को डिकोड करने के लिए आवश्यक अधिकतम अक्षरों की संख्या प्राप्त करें। |
| [GetPreamble](./getpreamble/)() override | एन्कोडिंग को दर्शाने वाला बाइट्स का अनुक्रम लौटाता है (उदा. BOM)। |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | निर्माता। |
| [operator==](./operator==/)(const ICUEncoding\&) const | कोडपेजों का उपयोग करके एन्कोडिंग की तुलना करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | डिफ़ॉल्ट कोडपेज मान। |
## संबंधित देखें

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
