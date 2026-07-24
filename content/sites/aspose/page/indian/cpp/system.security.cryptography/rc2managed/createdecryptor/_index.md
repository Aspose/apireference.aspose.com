---
title: "System::Security::Cryptography::RC2Managed::CreateDecryptor मेथड"
linktitle: "CreateDecryptor"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RC2Managed::CreateDecryptor मेथड। डिक्रिप्टर ऑब्जेक्ट बनाता है जिसमें एल्गोरिदम ऑब्जेक्ट द्वारा परिभाषित पैरामीटर C++ में होते हैं।"
type: docs
weight: 100
url: /hi/cpp/system.security.cryptography/rc2managed/createdecryptor/
---
## RC2Managed::CreateDecryptor() method


एल्गोरिदम ऑब्जेक्ट द्वारा परिभाषित पैरामीटरों के साथ डिक्रिप्टर ऑब्जेक्ट बनाता है।

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RC2Managed::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


स्पष्ट पैरामीटरों के साथ डिक्रिप्टर ऑब्जेक्ट बनाता है।

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RC2Managed::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | बाइट एरे रूप में एन्क्रिप्शन कुंजी। |
| rgbIV | System::ArrayPtr\<uint8_t\> | बाइट एरे रूप में प्रारंभिक मान। |

### ReturnValue

नया बनाया गया डिक्रिप्टर ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
