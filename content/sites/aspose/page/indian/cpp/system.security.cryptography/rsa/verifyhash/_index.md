---
title: "System::Security::Cryptography::RSA::VerifyHash method"
linktitle: "VerifyHash"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSA::VerifyHash method. C++ में निर्दिष्ट हैश के हस्ताक्षर की वैधता की जाँच करता है।"
type: docs
weight: 1400
url: /hi/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


जांचता है कि निर्दिष्ट हैश का सिग्नेचर वैध है या नहीं।

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| हैश | ByteArrayPtr | हस्ताक्षरित डेटा का हैश मान। |
| हस्ताक्षर | ByteArrayPtr | हस्ताक्षर डेटा। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। |
| पैडिंग | SharedPtr\<RSASignaturePadding\> | पैडिंग मोड। यदि हस्ताक्षर वैध है तो true लौटाएँ, अन्यथा - false। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
