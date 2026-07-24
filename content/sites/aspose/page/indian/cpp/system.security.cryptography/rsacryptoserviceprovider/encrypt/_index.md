---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt method"
linktitle: "Encrypt"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt method. निर्दिष्ट पैडिंग मोड का उपयोग करके इनपुट डेटा को C++ में एन्क्रिप्ट करता है।"
type: docs
weight: 400
url: /hi/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


निर्दिष्ट पैडिंग मोड का उपयोग करके इनपुट डेटा को एन्क्रिप्ट करता है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) एन्क्रिप्ट करने के लिए एरे। |
| पैडिंग | SharedPtr\<RSAEncryptionPadding\> | पैडिंग मोड। |

### ReturnValue

बाइट एरे प्रारूप में एन्क्रिप्टेड डेटा।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


संदेश को एन्क्रिप्ट करता है। लागू नहीं किया गया है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) एन्क्रिप्ट करने के लिए। |
| use_oaep | bool | OAEP पैडिंग का उपयोग करने के लिए True, PKCS#1 v1.5 पैडिंग का उपयोग करने के लिए false। |

### ReturnValue

एन्क्रिप्ट किया गया डेटा एरे।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
