---
title: "System::Text::Decoder क्लास"
linktitle: "Decoder"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::Decoder क्लास। बाइट अनुक्रम को अक्षर अनुक्रम में डिकोड करने को संलग्न करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 200
url: /hi/cpp/system.text/decoder/
---
## Decoder class


बाइट अनुक्रम को अक्षर अनुक्रम में डिकोड करने को संलग्न करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Decoder : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | बाइट्स को अक्षरों में परिवर्तित करता है। |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | बाइट्स को अक्षरों में परिवर्तित करता है। |
| [get_Fallback](./get_fallback/)() const | त्रुटि संभालने वाले फ़ॉलबैक को प्राप्त करता है। |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | फ़ॉलबैक बफ़र प्राप्त करता है। |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करता है। |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करता है। |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करता है। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | बफ़र को डिकोड करने से प्राप्त होने वाले अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | बफ़र को डिकोड करने से प्राप्त होने वाले अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | बफ़र को डिकोड करने से प्राप्त होने वाले अक्षर प्राप्त करें। |
| virtual [Reset](./reset/)() | डिकोडर की आंतरिक स्थिति को साफ़ करता है। |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | त्रुटि संभालने वाले फ़ॉलबैक को सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
