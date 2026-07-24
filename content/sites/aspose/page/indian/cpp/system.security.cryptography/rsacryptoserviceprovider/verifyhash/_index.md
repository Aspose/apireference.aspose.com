---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash मेथड"
linktitle: "VerifyHash"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash मेथड। निर्दिष्ट हैश के हस्ताक्षर की वैधता को C++ में सत्यापित करता है।"
type: docs
weight: 1900
url: /hi/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


जांचता है कि निर्दिष्ट हैश का सिग्नेचर वैध है या नहीं।

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
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
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


डेटा हस्ताक्षर जाँचता है।

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | प्राप्त डेटा के लिए गणना किया गया हैश। |
| str | const String\& | उपयोग किए गए हैश एल्गोरिदम का नाम। |
| rgb_signature | const ByteArrayPtr\& | प्राप्त जैसा हस्ताक्षर। |

### ReturnValue

यदि हस्ताक्षर वैध है तो true, अन्यथा false।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
