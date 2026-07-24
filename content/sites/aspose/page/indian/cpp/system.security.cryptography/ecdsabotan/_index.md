---
title: "System::Security::Cryptography::ECDsaBotan क्लास"
linktitle: "ECDsaBotan"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::ECDsaBotan क्लास। Botan रूप में ECDsa एल्गोरिद्म। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें C++ में।"
type: docs
weight: 1400
url: /hi/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | कंस्ट्रक्टर। डिफ़ॉल्ट पैरामीटरों का उपयोग करता है। |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | निर्माता। |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | निर्माता। |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | निर्माता। |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | निर्माता। |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | निर्माता। |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | स्पष्ट पैरामीटर निर्यात करता है। |
| [ExportParameters](./exportparameters/)(bool) override | नामित या स्पष्ट पैरामीटर निर्यात करता है। |
| [FromXmlString](./fromxmlstring/)(String) override | XML-एन्कोडेड पैरामीटरों का उपयोग करके वस्तु को प्रारंभ करता है। लागू नहीं किया गया। |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | XML-एन्कोडेड पैरामीटरों का उपयोग करके वस्तु को प्रारंभ करता है। लागू नहीं किया गया। |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | निर्दिष्ट कर्व के लिए नई सार्वजनिक/निजी कुंजी जोड़ी उत्पन्न करता है। |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | हैश एल्गोरिद्म प्राप्त करता है। |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है। |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट बाइनरी स्ट्रीम का हैश मान गणना करता है। |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | डेटा संरचना से सभी पैरामीटर आयात करता है। |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | हैश एल्गोरिद्म सेट करता है। |
| [set_KeySize](./set_keysize/)(int32_t) override | कुंजी आकार सेट करता है। |
| [SignData](./signdata/)(const ByteArrayPtr\&) | निर्दिष्ट डेटा एरे का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है। |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | निर्दिष्ट डेटा एरे का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है। |
| [SignData](./signdata/)(const StreamPtr\&) | निर्दिष्ट बाइनरी स्ट्रीम का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है। |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI जानकारी। |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI जानकारी। |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI जानकारी। |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है। |
| [ToXmlString](./toxmlstring/)(bool) override | सभी पैरामीटरों को XML स्वरूप में निर्यात करता है। लागू नहीं किया गया। |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | XML फ़ॉर्मेट में सभी पैरामीटर निर्यात करता है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | जाँचता है कि निर्दिष्ट बाइनरी स्ट्रीम का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट बाइनरी स्ट्रीम का हस्ताक्षर वैध है। |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | डेटा हस्ताक्षर जाँचता है। |
## संबंधित देखें

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
