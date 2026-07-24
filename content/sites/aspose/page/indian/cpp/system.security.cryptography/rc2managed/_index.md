---
title: "System::Security::Cryptography::RC2Managed class"
linktitle: "RC2Managed"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RC2Managed class. प्रबंधित RC2 एल्गोरिद्म। केवल ECB, CFB और CBC सिफर मोड समर्थित हैं। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2800
url: /hi/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


प्रबंधित [RC2](../rc2/) एल्गोरिद्म। केवल ECB, CFB और CBC सिफर मोड समर्थित हैं। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
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

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
