---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature method"
linktitle: "CreateSignature"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature method. C++ में RTTI जानकारी।"
type: docs
weight: 100
url: /hi/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


RTTI जानकारी।

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) के लिए हैश की गणना करने हेतु। |

### ReturnValue

बाइट एरे रूप में गणना किया गया हस्ताक्षर।
## टिप्पणियाँ


निर्दिष्ट डेटा के लिए हस्ताक्षर बनाता है।
## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


निर्दिष्ट हैश मान के लिए हस्ताक्षर बनाता है।

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| हैश | System::SharedPtr\<HashAlgorithm\> | हस्ताक्षर बनाते समय उपयोग करने के लिए हैश एल्गोरिदम। |

### ReturnValue

बाइट एरे रूप में गणना किया गया हस्ताक्षर।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
