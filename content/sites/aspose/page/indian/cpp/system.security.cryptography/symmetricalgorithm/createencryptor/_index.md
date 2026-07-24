---
title: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor method"
linktitle: "CreateEncryptor"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor method. C++ में एल्गोरिदम ऑब्जेक्ट से जुड़े पैरामीटरों के साथ एन्क्रिप्टर बनाता है।"
type: docs
weight: 200
url: /hi/cpp/system.security.cryptography/symmetricalgorithm/createencryptor/
---
## SymmetricAlgorithm::CreateEncryptor() method


एल्गोरिदम ऑब्जेक्ट से जुड़े पैरामीटरों के साथ एन्क्रिप्टर बनाता है।

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```


### ReturnValue

नया बनाया गया एन्क्रिप्टर ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


स्पष्ट पैरामीटरों के साथ एन्क्रिप्टर बनाता है।

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | उपयोग करने के लिए कुंजी। |
| rgbIV | System::ArrayPtr\<uint8_t\> | उपयोग करने के लिए प्रारंभिक मान। |

### ReturnValue

नया बनाया गया एन्क्रिप्टर ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
