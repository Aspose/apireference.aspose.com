---
title: "System::Security::Cryptography::DSA क्लास"
linktitle: "DSA"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::DSA क्लास। DSA एल्गोरिद्म के इम्प्लीमेंटेशन के लिए बेस क्लास। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर को C++ में फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करें।"
type: docs
weight: 900
url: /hi/cpp/system.security.cryptography/dsa/
---
## DSA class


[DSA](./) एल्गोरिद्म के इम्प्लीमेंटेशन के लिए बेस क्लास। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर को फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करें।

```cpp
class DSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Create](./create/)() | डिफ़ॉल्ट [DSA](./) एल्गोरिद्म कार्यान्वयन बनाता है। |
| static [Create](./create/)(const String\&) | डिफ़ॉल्ट [DSA](./) एल्गोरिद्म कार्यान्वयन बनाता है। |
| static [Create](./create/)(int32_t) | डिफ़ॉल्ट [DSA](./) एल्गोरिद्म कार्यान्वयन बनाता है जिसमें निर्दिष्ट कुंजी आकार होता है। |
| static [Create](./create/)(const DSAParameters\&) | डिफ़ॉल्ट [DSA](./) एल्गोरिद्म कार्यान्वयन बनाता है जिसमें निर्दिष्ट पैरामीटर होते हैं। |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | डिफ़ॉल्ट [DSA](./) एल्गोरिद्म कार्यान्वयन को निर्दिष्ट XML-एन्कोडेड पैरामीटरों के साथ बनाता है। |
| virtual [CreateSignature](./createsignature/)(ByteArrayPtr) | RTTI जानकारी। |
| virtual [ExportParameters](./exportparameters/)(bool) | सभी पैरामीटर निर्यात करता है। |
| [FromXmlString](./fromxmlstring/)(String) override | XML-एन्कोडेड पैरामीटर का उपयोग करके ऑब्जेक्ट को इनिशियलाइज़ करता है। |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | डेटा संरचना से सभी पैरामीटर आयात करता है। |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है। |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है। |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट बाइनरी स्ट्रीम का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है। |
| [ToXmlString](./toxmlstring/)(bool) override | XML फ़ॉर्मेट में सभी पैरामीटर निर्यात करता है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट बाइनरी स्ट्रीम का हस्ताक्षर वैध है। |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | निर्दिष्ट डेटा के लिए [DSA](./) हस्ताक्षर को सत्यापित करें। |
## संबंधित देखें

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
