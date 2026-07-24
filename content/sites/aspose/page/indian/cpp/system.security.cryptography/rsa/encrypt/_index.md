---
title: "System::Security::Cryptography::RSA::Encrypt method"
linktitle: "Encrypt"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSA::Encrypt method. इनपुट डेटा को निर्दिष्ट पैडिंग मोड का उपयोग करके C++ में एन्क्रिप्ट करता है।"
type: docs
weight: 300
url: /hi/cpp/system.security.cryptography/rsa/encrypt/
---
## RSA::Encrypt method


निर्दिष्ट पैडिंग मोड का उपयोग करके इनपुट डेटा को एन्क्रिप्ट करता है।

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
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
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
