---
title: "System::Security::Cryptography::ECDsa::SignData विधि"
linktitle: "SignData"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::ECDsa::SignData विधि. निर्दिष्ट डेटा एरे का हैश मान निर्दिष्ट हैश एल्गोरिदम का उपयोग करके गणना करता है, और C++ में परिणाम पर हस्ताक्षर करता है।"
type: docs
weight: 700
url: /hi/cpp/system.security.cryptography/ecdsa/signdata/
---
## ECDsa::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है।

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| डेटा | const ByteArrayPtr\& | इनपुट डेटा एरे। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। इनपुट डेटा के लिए ECDSA हस्ताक्षर लौटाता है। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है।

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| डेटा | const ByteArrayPtr\& | इनपुट डेटा एरे। |
| offset | int32_t | **data** में ऑफसेट। |
| count | int32_t | इनपुट डेटा के रूप में उपयोग करने के लिए बाइट्स की संख्या। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। इनपुट डेटा के लिए ECDSA हस्ताक्षर लौटाता है। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट बाइनरी स्ट्रीम का हैश मान गणना करता है, और परिणाम पर हस्ताक्षर करता है।

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const StreamPtr\& | बाइनरी स्ट्रीम। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। इनपुट डेटा के लिए ECDSA हस्ताक्षर लौटाता है। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
