---
title: "System::Text::Encoder क्लास"
linktitle: "Encoder"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::Encoder क्लास। अक्षर अनुक्रम को बाइट अनुक्रम में एन्कोड करने को संलग्न करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 900
url: /hi/cpp/system.text/encoder/
---
## Encoder class


अक्षर अनुक्रम को बाइट अनुक्रम में एन्कोड करने को संलग्न करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Encoder : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | अक्षरों को बाइट्स में बदलता है। |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | अक्षरों को बाइट्स में बदलता है। |
| [get_Fallback](./get_fallback/)() const | त्रुटि संभालने वाले फ़ॉलबैक को प्राप्त करता है। |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | फ़ॉलबैक बफ़र प्राप्त करता है। |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | बफ़र को एन्कोड करने के लिए आवश्यक बाइट्स की संख्या प्राप्त करता है। |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | बफ़र को एन्कोड करने के लिए आवश्यक बाइट्स की संख्या प्राप्त करता है। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [Reset](./reset/)() | एन्कोडर की आंतरिक स्थिति को साफ़ करता है। |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | त्रुटि संभालने वाले फ़ॉलबैक को सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
