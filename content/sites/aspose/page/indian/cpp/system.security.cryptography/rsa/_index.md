---
title: "System::Security::Cryptography::RSA class"
linktitle: "RSA"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSA क्लास। RSA एल्गोरिदम के कार्यान्वयन के लिए बेस क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 3400
url: /hi/cpp/system.security.cryptography/rsa/
---
## RSA class


RSA एल्गोरिदम के कार्यान्वयन के लिए बेस क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Create](./create/)() | डिफ़ॉल्ट [RSA](./) एल्गोरिदम कार्यान्वयन बनाता है। |
| static [Create](./create/)(const String\&) | डिफ़ॉल्ट [RSA](./) एल्गोरिदम कार्यान्वयन बनाता है। |
| static [Create](./create/)(int32_t) | निर्दिष्ट कुंजी आकार के साथ डिफ़ॉल्ट [RSA](./) एल्गोरिदम कार्यान्वयन बनाता है। |
| static [Create](./create/)(const RSAParameters\&) | निर्दिष्ट पैरामीटरों के साथ डिफ़ॉल्ट [RSA](./) एल्गोरिदम कार्यान्वयन बनाता है। |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | डिफ़ॉल्ट [RSA](./) एल्गोरिद्म कार्यान्वयन बनाता है जिसमें निर्दिष्ट XML-एन्कोडेड पैरामीटर होते हैं। |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | निर्दिष्ट पैडिंग मोड का उपयोग करके इनपुट डेटा को डिक्रिप्ट करता है। |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | प्राइवेट कुंजी का उपयोग करके मान को डिक्रिप्ट करता है। |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | निर्दिष्ट पैडिंग मोड का उपयोग करके इनपुट डेटा को एन्क्रिप्ट करता है। |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | प्राइवेट कुंजी का उपयोग करके मान को एन्क्रिप्ट करता है। |
| virtual [ExportParameters](./exportparameters/)(bool) | सभी पैरामीटर निर्यात करता है। |
| [FromXmlString](./fromxmlstring/)(String) override | XML-एन्कोडेड पैरामीटर का उपयोग करके ऑब्जेक्ट को इनिशियलाइज़ करता है। |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI जानकारी। |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | CSP ऑब्जेक्ट से जुड़ा सिग्नेचर एल्गोरिद्म प्राप्त करता है। |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | डेटा संरचना से सभी पैरामीटर आयात करता है। |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | निर्दिष्ट हैश एल्गोरिद्म और पैडिंग का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है और परिणाम पर साइन करता है। |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | निर्दिष्ट हैश एल्गोरिद्म और पैडिंग का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है और परिणाम पर साइन करता है। |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | निर्दिष्ट हैश एल्गोरिद्म और पैडिंग का उपयोग करके निर्दिष्ट बाइनरी स्ट्रीम का हैश मान गणना करता है और परिणाम पर साइन करता है। |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | निर्दिष्ट हैश मान के लिए सिग्नेचर गणना करता है। |
| [ToXmlString](./toxmlstring/)(bool) override | XML फ़ॉर्मेट में सभी पैरामीटर निर्यात करता है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | जाँचता है कि निर्दिष्ट बाइनरी स्ट्रीम का हस्ताक्षर वैध है। |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | जांचता है कि निर्दिष्ट हैश का सिग्नेचर वैध है या नहीं। |
## संबंधित देखें

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
