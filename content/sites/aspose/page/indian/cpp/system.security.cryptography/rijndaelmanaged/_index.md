---
title: "System::Security::Cryptography::RijndaelManaged क्लास"
linktitle: "RijndaelManaged"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RijndaelManaged क्लास। प्रबंधित Rijndael एल्गोरिद्म। केवल ECB और CFB मोड्स को None पैडिंग के साथ तथा CBC मोड को None और Zeros पैडिंग के साथ समर्थन करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 3100
url: /hi/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


Managed [Rijndael](../rijndael/) एल्गोरिद्म। केवल ECB और CFB मोड्स को None पैडिंग के साथ तथा CBC मोड को None और Zeros पैडिंग के साथ समर्थन करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | स्पष्ट पैरामीटरों के साथ डिक्रिप्टर ऑब्जेक्ट बनाता है। |
| virtual [CreateDecryptor](./createdecryptor/)() | एल्गोरिदम ऑब्जेक्ट द्वारा परिभाषित पैरामीटरों के साथ डिक्रिप्टर ऑब्जेक्ट बनाता है। |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | स्पष्ट पैरामीटरों के साथ एन्क्रिप्टर ऑब्जेक्ट बनाता है। |
| virtual [CreateEncryptor](./createencryptor/)() | एल्गोरिदम ऑब्जेक्ट द्वारा परिभाषित पैरामीटरों के साथ एन्क्रिप्टर ऑब्जेक्ट बनाता है। |
| [GenerateIV](./generateiv/)() override | रैंडम प्रारंभिक मान बनाता है और इसे एल्गोरिदम की आंतरिक संरचना में संग्रहीत करता है। |
| [GenerateKey](./generatekey/)() override | रैंडम कुंजी बनाता है और इसे एल्गोरिदम की आंतरिक संरचना में संग्रहीत करता है। |
## संबंधित देखें

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
