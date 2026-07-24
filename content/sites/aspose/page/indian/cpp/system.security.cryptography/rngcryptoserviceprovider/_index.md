---
title: "System::Security::Cryptography::RNGCryptoServiceProvider क्लास"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RNGCryptoServiceProvider क्लास। CSP अवधारणा का पालन करने वाला रैंडम संख्या जनरेटर। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें C++ में।"
type: docs
weight: 3300
url: /hi/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


CSP अवधारणा का पालन करने वाला रैंडम संख्या जनरेटर। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | मौजूदा एरे तत्वों को रैंडम बाइट्स से भरता है। |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | मौजूदा एरे व्यू तत्वों को रैंडम बाइट्स से भरता है। |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | मौजूदा एरे तत्वों को रैंडम शून्य-रहित बाइट्स से भरता है। |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | मौजूदा एरे व्यू तत्वों को रैंडम शून्य-रहित बाइट्स से भरता है। |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | निर्माता। |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
