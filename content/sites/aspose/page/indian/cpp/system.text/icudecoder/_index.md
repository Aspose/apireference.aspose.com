---
title: "System::Text::ICUDecoder क्लास"
linktitle: "ICUDecoder"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::ICUDecoder क्लास। डिकोडर जो डिकोडिंग के लिए ICU का उपयोग करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2000
url: /hi/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | बाइट्स को अक्षरों में परिवर्तित करता है। |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | बाइट्स को अक्षरों में परिवर्तित करता है। |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करता है। |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करता है। |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करता है। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | बफ़र को डिकोड करने से प्राप्त होने वाले अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | बफ़र को डिकोड करने से प्राप्त होने वाले अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | बफ़र को डिकोड करने से प्राप्त होने वाले अक्षर प्राप्त करें। |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | निर्माता। |
| virtual [Reset](./reset/)() | आंतरिक चर को प्रारंभिक स्थिति में सेट करता है। |
| virtual [~ICUDecoder](./~icudecoder/)() | डिस्ट्रक्टर। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Base](./base/) | [Base](./base/) प्रकार। |
## संबंधित देखें

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
