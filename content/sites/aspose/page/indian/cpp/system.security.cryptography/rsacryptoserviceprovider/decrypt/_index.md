---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt method"
linktitle: "Decrypt"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt method. निर्दिष्ट पैडिंग मोड का उपयोग करके इनपुट डेटा को C++ में डिक्रिप्ट करता है।"
type: docs
weight: 200
url: /hi/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


निर्दिष्ट पैडिंग मोड का उपयोग करके इनपुट डेटा को डिक्रिप्ट करता है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| data | ByteArrayPtr | डिक्रिप्ट करने के लिए [Byte](../../../system/byte/) एरे। |
| पैडिंग | SharedPtr\<RSAEncryptionPadding\> | पैडिंग मोड। |

### ReturnValue

बाइट एरे फ़ॉर्मेट में डिक्रिप्टेड डेटा।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


संदेश को डिक्रिप्ट करता है। लागू नहीं किया गया है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) डिक्रिप्ट करने के लिए। |
| use_oaep | bool | OAEP पैडिंग का उपयोग करने के लिए True, PKCS#1 v1.5 पैडिंग का उपयोग करने के लिए false। |

### ReturnValue

डिक्रिप्ट किया गया डेटा एरे।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
