---
title: "System::Security::Cryptography::DSACryptoServiceProvider क्लास"
linktitle: "DSACryptoServiceProvider"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::DSACryptoServiceProvider क्लास। CSP रूप में DSA एल्गोरिदम। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1000
url: /hi/cpp/system.security.cryptography/dsacryptoserviceprovider/
---
## DSACryptoServiceProvider class


[DSA](../dsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DSACryptoServiceProvider : public System::Security::Cryptography::DSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CreateSignature](./createsignature/)(ByteArrayPtr) override | निर्दिष्ट डेटा के लिए [DSA](../dsa/) हस्ताक्षर बनाएं। |
| [Dispose](./dispose/)() override | ऑब्जेक्ट से जुड़ा डेटा मुक्त करता है। |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)() | कंस्ट्रक्टर। डिफ़ॉल्ट पैरामीटरों का उपयोग करता है। |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const DSAParameters\&) | निर्माता। |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | कंस्ट्रक्टर। लागू नहीं किया गया। |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t) | निर्माता। |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | कंस्ट्रक्टर। लागू नहीं किया गया। |
| [ExportCspBlob](./exportcspblob/)(bool) override | कुंजी की जानकारी के साथ ब्लॉब निर्यात करता है। लागू नहीं किया गया। |
| [ExportParameters](./exportparameters/)(bool) override | CSP पैरामीटर निर्यात करता है। |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | एक [CspKeyContainerInfo](../cspkeycontainerinfo/) ऑब्जेक्ट प्राप्त करता है। |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | ऑब्जेक्ट से जुड़े कुंजी विनिमय एल्गोरिदम की जाँच करता है। |
| [get_KeySize](./get_keysize/)() override | कुंजी का आकार प्राप्त करता है। |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | जाँचता है कि कुंजी CSP ऑब्जेक्ट में स्थायी है या नहीं। |
| [get_PublicOnly](./get_publiconly/)() const | जाँचता है कि केवल सार्वजनिक कुंजी CSP ऑब्जेक्ट में मौजूद है या नहीं। |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | उपयोग के लिए हस्ताक्षर एल्गोरिदम प्राप्त करता है। |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | जाँचता है कि कुंजी उपयोगकर्ता स्टोर के बजाय मशीन स्टोर में स्थायी है या नहीं। |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | कुंजी की जानकारी के साथ ब्लॉब आयात करता है। लागू नहीं किया गया। |
| [ImportParameters](./importparameters/)(DSAParameters) override | डेटा संरचना से सभी पैरामीटर आयात करता है। |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | परिभाषित करता है कि कुंजी CSP ऑब्जेक्ट में स्थायी है या नहीं। |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | परिभाषित करता है कि कुंजी उपयोगकर्ता स्टोर के बजाय मशीन स्टोर में स्थायी है या नहीं। |
| [SignData](./signdata/)(const ByteArrayPtr\&) | निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है। |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&) | निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है। |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है। |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI जानकारी। |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI जानकारी। |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI जानकारी। |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | डेटा हस्ताक्षर जाँचता है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है। |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | जाँचता है कि निर्दिष्ट बाइनरी स्ट्रीम का हस्ताक्षर वैध है। |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | डेटा हस्ताक्षर जाँचता है। |
| [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) override | निर्दिष्ट डेटा के लिए [DSA](../dsa/) हस्ताक्षर को सत्यापित करें। |
## संबंधित देखें

* Class [DSA](../dsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
