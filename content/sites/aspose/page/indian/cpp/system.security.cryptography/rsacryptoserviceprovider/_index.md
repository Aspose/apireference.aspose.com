---
title: "System::Security::Cryptography::RSACryptoServiceProvider class"
linktitle: "RSACryptoServiceProvider"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSACryptoServiceProvider class. CSP रूप में RSA एल्गोरिद्म। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 3500
url: /hi/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | संदेश को डिक्रिप्ट करता है। लागू नहीं किया गया है। |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | निर्दिष्ट पैडिंग मोड का उपयोग करके इनपुट डेटा को डिक्रिप्ट करता है। |
| [Dispose](./dispose/)() override | ऑब्जेक्ट से जुड़ा डेटा मुक्त करता है। |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | संदेश को एन्क्रिप्ट करता है। लागू नहीं किया गया है। |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | निर्दिष्ट पैडिंग मोड का उपयोग करके इनपुट डेटा को एन्क्रिप्ट करता है। |
| [ExportCspBlob](./exportcspblob/)(bool) override | कुंजी की जानकारी के साथ ब्लॉब निर्यात करता है। लागू नहीं किया गया। |
| [ExportParameters](./exportparameters/)(bool) override | CSP पैरामीटर निर्यात करता है। |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | एक [CspKeyContainerInfo](../cspkeycontainerinfo/) ऑब्जेक्ट प्राप्त करता है। |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | ऑब्जेक्ट से जुड़े कुंजी विनिमय एल्गोरिदम की जाँच करता है। |
| [get_KeySize](./get_keysize/)() override | एल्गोरिद्म द्वारा उपयोग किए जाने वाले कुंजी आकार को प्राप्त करता है। |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | जाँचता है कि कुंजी CSP ऑब्जेक्ट में स्थायी है या नहीं। |
| [get_PublicOnly](./get_publiconly/)() const | जाँचता है कि केवल सार्वजनिक कुंजी CSP ऑब्जेक्ट में मौजूद है या नहीं। |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | CSP ऑब्जेक्ट से जुड़ा सिग्नेचर एल्गोरिद्म प्राप्त करता है। |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | जाँचता है कि कुंजी उपयोगकर्ता स्टोर के बजाय मशीन स्टोर में स्थायी है या नहीं। |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | कुंजी की जानकारी के साथ ब्लॉब आयात करता है। लागू नहीं किया गया। |
| [ImportParameters](./importparameters/)(RSAParameters) override | CSP पैरामीटर आयात करता है। |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | RTTI जानकारी। |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | कंस्ट्रक्टर। लागू नहीं किया गया। |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | निर्माता। |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | निर्माता। |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | कंस्ट्रक्टर। लागू नहीं किया गया। |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | परिभाषित करता है कि कुंजी CSP ऑब्जेक्ट में स्थायी है या नहीं। |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | परिभाषित करता है कि कुंजी उपयोगकर्ता स्टोर के बजाय मशीन स्टोर में स्थायी है या नहीं। |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है। |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है। |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है। |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | निर्दिष्ट हैश मान के लिए सिग्नेचर गणना करता है। |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है। लागू नहीं किया गया है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | डेटा हस्ताक्षर जाँचता है। |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | डेटा हस्ताक्षर जाँचता है। |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | जांचता है कि निर्दिष्ट हैश का सिग्नेचर वैध है या नहीं। |
## संबंधित देखें

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
