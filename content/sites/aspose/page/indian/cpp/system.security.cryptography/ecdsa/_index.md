---
title: "System::Security::Cryptography::ECDsa क्लास"
linktitle: "ECDsa"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::ECDsa क्लास। ECDsa एल्गोरिद्म के कार्यान्वयन के लिए बेस क्लास। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 1300
url: /hi/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


[ECDsa](./) एल्गोरिद्म के कार्यान्वयन के लिए बेस क्लास। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Create](./create/)() | डिफ़ॉल्ट ECDSA एल्गोरिद्म कार्यान्वयन बनाता है। |
| static [Create](./create/)(const ECCurve\&) | निर्दिष्ट कर्व पर नवीन निर्मित कुंजी के साथ डिफ़ॉल्ट ECDSA एल्गोरिद्म कार्यान्वयन बनाता है। |
| static [Create](./create/)(const ECParameters\&) | निर्दिष्ट पैरामीटरों का उपयोग करके डिफ़ॉल्ट ECDSA एल्गोरिद्म कार्यान्वयन बनाता है। |
| static [Create](./create/)(const String\&) | निर्दिष्ट ECDSA एल्गोरिद्म कार्यान्वयन बनाता है। |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | स्पष्ट पैरामीटर निर्यात करता है। |
| virtual [ExportParameters](./exportparameters/)(bool) | नामित या स्पष्ट पैरामीटर निर्यात करता है। |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | निर्दिष्ट कर्व के लिए नई सार्वजनिक/निजी कुंजी जोड़ी उत्पन्न करता है। |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI जानकारी। |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | उपयोग के लिए हस्ताक्षर एल्गोरिदम प्राप्त करता है। |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | डेटा संरचना से सभी पैरामीटर आयात करता है। |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है। |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है। |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट बाइनरी स्ट्रीम का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है। |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट बाइनरी स्ट्रीम का हस्ताक्षर वैध है। |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | डेटा हस्ताक्षर जाँचता है। |
## संबंधित देखें

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
