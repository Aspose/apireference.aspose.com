---
title: "System::Security::Cryptography::RSA::SignData मेथड"
linktitle: "SignData"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSA::SignData मेथड. निर्दिष्ट हैश एल्गोरिदम और पैडिंग का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है, और परिणाम को C++ में साइन करता है।"
type: docs
weight: 1000
url: /hi/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


निर्दिष्ट हैश एल्गोरिद्म और पैडिंग का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है और परिणाम पर साइन करता है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| डेटा | const ByteArrayPtr\& | इनपुट डेटा एरे। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। |
| padding | const SharedPtr\<RSASignaturePadding\>\& | पैडिंग मोड। इनपुट डेटा के लिए [RSA](../) सिग्नेचर लौटाता है। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


निर्दिष्ट हैश एल्गोरिद्म और पैडिंग का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है और परिणाम पर साइन करता है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| डेटा | const ByteArrayPtr\& | इनपुट डेटा एरे। |
| offset | int32_t | **data** में ऑफसेट। |
| count | int32_t | इनपुट डेटा के रूप में उपयोग करने के लिए बाइट्स की संख्या। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। |
| padding | const SharedPtr\<RSASignaturePadding\>\& | पैडिंग मोड। इनपुट डेटा के लिए [RSA](../) सिग्नेचर लौटाता है। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


निर्दिष्ट हैश एल्गोरिद्म और पैडिंग का उपयोग करके निर्दिष्ट बाइनरी स्ट्रीम का हैश मान गणना करता है और परिणाम पर साइन करता है।

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const StreamPtr\& | बाइनरी स्ट्रीम। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। |
| padding | const SharedPtr\<RSASignaturePadding\>\& | पैडिंग मोड। इनपुट डेटा के लिए [RSA](../) सिग्नेचर लौटाता है। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
