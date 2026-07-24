---
title: "System::Security::Cryptography::RijndaelManaged::CreateDecryptor मेथड"
linktitle: "CreateDecryptor"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RijndaelManaged::CreateDecryptor method. एल्गोरिद्म ऑब्जेक्ट द्वारा परिभाषित पैरामीटरों के साथ डिक्रिप्टर ऑब्जेक्ट बनाता है C++ में।"
type: docs
weight: 100
url: /hi/cpp/system.security.cryptography/rijndaelmanaged/createdecryptor/
---
## RijndaelManaged::CreateDecryptor() method


एल्गोरिदम ऑब्जेक्ट द्वारा परिभाषित पैरामीटरों के साथ डिक्रिप्टर ऑब्जेक्ट बनाता है।

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RijndaelManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


स्पष्ट पैरामीटरों के साथ डिक्रिप्टर ऑब्जेक्ट बनाता है।

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
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
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
