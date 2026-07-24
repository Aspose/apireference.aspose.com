---
title: "System::Security::Cryptography::RSA::VerifyData मेथड"
linktitle: "VerifyData"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSA::VerifyData मेथड. C++ में निर्दिष्ट डेटा के सिग्नेचर की वैधता को सत्यापित करता है।"
type: docs
weight: 1300
url: /hi/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है।

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| डेटा | const ByteArrayPtr\& | हस्ताक्षरित डेटा। |
| हस्ताक्षर | const ByteArrayPtr\& | हस्ताक्षर डेटा। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। |
| पैडिंग | const SharedPtr\<RSASignaturePadding\>\& | पैडिंग मोड। यदि हस्ताक्षर वैध है तो true लौटाएँ, अन्यथा - false। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है।

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| डेटा | const ByteArrayPtr\& | हस्ताक्षरित डेटा। |
| offset | int32_t | **data** में ऑफसेट। |
| count | int32_t | हैश करने के लिए बाइट्स की संख्या। |
| हस्ताक्षर | const ByteArrayPtr\& | हस्ताक्षर डेटा। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। |
| पैडिंग | const SharedPtr\<RSASignaturePadding\>\& | पैडिंग मोड। यदि हस्ताक्षर वैध है तो true लौटाएँ, अन्यथा - false। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


जाँचता है कि निर्दिष्ट बाइनरी स्ट्रीम का हस्ताक्षर वैध है।

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const StreamPtr\& | हस्ताक्षरित डेटा। |
| हस्ताक्षर | const ByteArrayPtr\& | हस्ताक्षर डेटा। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। |
| पैडिंग | const SharedPtr\<RSASignaturePadding\>\& | पैडिंग मोड। यदि हस्ताक्षर वैध है तो true लौटाएँ, अन्यथा - false। |

## संबंधित देखें

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
