---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash मेथड"
linktitle: "SignHash"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash मेथड। निर्दिष्ट हैश मान के लिए सिग्नेचर की गणना करता है। C++ में।"
type: docs
weight: 1700
url: /hi/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


निर्दिष्ट हैश मान के लिए सिग्नेचर गणना करता है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| हैश | ByteArrayPtr | हैश मान। |
| hash_algorithm | HashAlgorithmName | हैश एल्गोरिदम। |
| padding | SharedPtr\<RSASignaturePadding\> | Padding मोड। निर्दिष्ट हैश के लिए [RSA](../../rsa/) सिग्नेचर लौटाता है। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


निर्दिष्ट इनपुट मान का हस्ताक्षर गणना करता है। लागू नहीं किया गया है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | हस्ताक्षर किए जाने वाले डेटा का हैश मान। |
| str | const String\& | हैश बनाने के लिए उपयोग किया गया हैश एल्गोरिद्म पहचानकर्ता। |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
