---
title: "System::Security::Cryptography::RSAPKCS1SignatureFormatter क्लास"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSAPKCS1SignatureFormatter क्लास। RSA PKCS # 1 v1.5 हस्ताक्षर के साथ डेटा पर हस्ताक्षर करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें C++ में।"
type: docs
weight: 3800
url: /hi/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


[RSA](../rsa/) PKCS # 1 v1.5 हस्ताक्षर के साथ डेटा पर हस्ताक्षर करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | डेटा पर हस्ताक्षर करता है। |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | RTTI जानकारी। |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | निर्माता। |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | उपयोग करने के लिए हैश एल्गोरिद्म सेट करता है। |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | कुंजी मान सेट करता है। लागू नहीं किया गया। |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
