---
title: "System::Text::ICUEncoder क्लास"
linktitle: "ICUEncoder"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::ICUEncoder क्लास। एन्कोडर जो एन्कोडिंग के लिए ICU का उपयोग करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2100
url: /hi/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | अक्षरों को बाइट्स में बदलता है। |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | अक्षरों को बाइट्स में बदलता है। |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | बफ़र को एन्कोड करने के लिए आवश्यक बाइट्स की संख्या प्राप्त करता है। |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | बफ़र को एन्कोड करने के लिए आवश्यक बाइट्स की संख्या प्राप्त करता है। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | निर्माता। |
| virtual [Reset](./reset/)() | आंतरिक चर को प्रारंभिक स्थिति में सेट करता है। |
| [~ICUEncoder](./~icuencoder/)() | डिस्ट्रक्टर। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Base](./base/) | [Base](./base/) प्रकार। |
## संबंधित देखें

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
