---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData मेथड"
linktitle: "VerifyData"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData मेथड। C++ में डेटा हस्ताक्षर की जाँच करता है।"
type: docs
weight: 1700
url: /hi/cpp/system.security.cryptography/dsacryptoserviceprovider/verifydata/
---
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


डेटा हस्ताक्षर जाँचता है।

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const ByteArrayPtr &signature)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) के लिए हस्ताक्षर जाँचने हेतु। |
| हस्ताक्षर | const ByteArrayPtr\& | प्राप्त जैसा हस्ताक्षर। |

### ReturnValue

यदि हस्ताक्षर वैध है तो true, अन्यथा false।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है।

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| डेटा | const ByteArrayPtr\& | हस्ताक्षरित डेटा। |
| हस्ताक्षर | const ByteArrayPtr\& | हस्ताक्षर डेटा। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। यदि हस्ताक्षर वैध है तो true लौटाता है, अन्यथा - false। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


जाँचता है कि निर्दिष्ट डेटा का हस्ताक्षर वैध है।

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| डेटा | const ByteArrayPtr\& | हस्ताक्षरित डेटा। |
| offset | int32_t | **data** में ऑफसेट। |
| count | int32_t | हैश करने के लिए बाइट्स की संख्या। |
| हस्ताक्षर | const ByteArrayPtr\& | हस्ताक्षर डेटा। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। यदि हस्ताक्षर वैध है तो true लौटाता है, अन्यथा - false। |

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


जाँचता है कि निर्दिष्ट बाइनरी स्ट्रीम का हस्ताक्षर वैध है।

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | const StreamPtr\& | हस्ताक्षरित डेटा। |
| हस्ताक्षर | const ByteArrayPtr\& | हस्ताक्षर डेटा। |
| hash_algorithm | const HashAlgorithmName\& | हैश एल्गोरिदम। यदि हस्ताक्षर वैध है तो true लौटाता है, अन्यथा - false। |

## संबंधित देखें

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
