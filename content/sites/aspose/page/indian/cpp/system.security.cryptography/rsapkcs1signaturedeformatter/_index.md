---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter class"
linktitle: "RSAPKCS1SignatureDeformatter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter class. RSA PKCS #1 v1.5 हस्ताक्षर को सत्यापित करने के लिए क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 3700
url: /hi/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/
---
## RSAPKCS1SignatureDeformatter class


[RSA](../rsa/) PKCS #1 v1.5 हस्ताक्षर को सत्यापित करने के लिए क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

```cpp
class RSAPKCS1SignatureDeformatter : public System::Security::Cryptography::AsymmetricSignatureDeformatter
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)() | RTTI जानकारी। |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | निर्माता। |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | उपयोग करने के लिए हैश एल्गोरिद्म सेट करता है। |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | कुंजी मान सेट करता है। लागू नहीं किया गया। |
| [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | डेटा हैश के हस्ताक्षर को सत्यापित करता है। |
## संबंधित देखें

* Class [AsymmetricSignatureDeformatter](../asymmetricsignaturedeformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
