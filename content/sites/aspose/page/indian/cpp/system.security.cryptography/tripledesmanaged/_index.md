---
title: "System::Security::Cryptography::TripleDESManaged क्लास"
linktitle: "TripleDESManaged"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::TripleDESManaged क्लास। प्रबंधित TripleDES कार्यान्वयन। केवल ECB और CFB मोड को None पैडिंग के साथ तथा CBC मोड को None, Zeros और PKCS7 पैडिंग के साथ समर्थन करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में आर्ग्युमेंट के रूप में पास करें C++ में।"
type: docs
weight: 5200
url: /hi/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


प्रबंधित [TripleDES](../tripledes/) कार्यान्वयन। केवल ECB और CFB मोड को None पैडिंग के साथ तथा CBC मोड को None, Zeros और PKCS7 पैडिंग के साथ समर्थन करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में आर्ग्युमेंट के रूप में पास करें।

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
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

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
