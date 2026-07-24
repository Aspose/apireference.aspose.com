---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature विधि"
linktitle: "VerifySignature"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature मेथड. C++ में डेटा पर हस्ताक्षर को सत्यापित करता है।"
type: docs
weight: 300
url: /hi/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


डेटा पर हस्ताक्षर की जाँच करता है।

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) **rgbSignature** के साथ हस्ताक्षरित। |
| rgbSignature | System::ArrayPtr\<uint8_t\> | डेटा के लिए सत्यापित किया जाने वाला हस्ताक्षर। |

### ReturnValue

यदि हस्ताक्षर जांच सफल हो तो True, अन्यथा false।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


डेटा पर हस्ताक्षर की जाँच करता है। लागू नहीं किया गया।

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| हैश | System::SharedPtr\<HashAlgorithm\> | हैशिंग के लिए उपयोग किया जाने वाला एल्गोरिद्म। |
| rgbSignature | System::ArrayPtr\<uint8_t\> | डेटा के लिए सत्यापित किया जाने वाला हस्ताक्षर। |

### ReturnValue

यदि हस्ताक्षर जांच सफल हो तो True, अन्यथा false।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
