---
title: "System::Security::Cryptography::TripleDESManaged::CreateEncryptor method"
linktitle: "CreateEncryptor"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::TripleDESManaged::CreateEncryptor method. C++ में एल्गोरिदम ऑब्जेक्ट द्वारा परिभाषित पैरामीटरों के साथ एन्क्रिप्टर ऑब्जेक्ट बनाता है।"
type: docs
weight: 200
url: /hi/cpp/system.security.cryptography/tripledesmanaged/createencryptor/
---
## TripleDESManaged::CreateEncryptor() method


एल्गोरिदम ऑब्जेक्ट द्वारा परिभाषित पैरामीटरों के साथ एन्क्रिप्टर ऑब्जेक्ट बनाता है।

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## TripleDESManaged::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


स्पष्ट पैरामीटरों के साथ एन्क्रिप्टर ऑब्जेक्ट बनाता है।

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::TripleDESManaged::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | बाइट एरे रूप में एन्क्रिप्शन कुंजी। |
| rgbIV | System::ArrayPtr\<uint8_t\> | बाइट एरे रूप में प्रारंभिक मान। |

### ReturnValue

नया बनाया गया एन्क्रिप्टर ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
