---
title: "System::Security::Cryptography::ECDsaBotan::HashData विधि"
linktitle: "HashData"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::ECDsaBotan::HashData विधि। C++ में निर्दिष्ट हैश एल्गोरिदम का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है।"
type: docs
weight: 700
url: /hi/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट डेटा एरे का हैश मान गणना करता है।

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| data | ByteArrayPtr | [Data](../../../system.data/) को हैश करने के लिए। |
| offset | int32_t | **data** में ऑफसेट। |
| count | int32_t | हैश करने के लिए बाइट्स की संख्या। |
| hash_algorithm | HashAlgorithmName | हैश एल्गोरिदम। |

### ReturnValue

हैश किया गया डेटा।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


निर्दिष्ट हैश एल्गोरिद्म का उपयोग करके निर्दिष्ट बाइनरी स्ट्रीम का हैश मान गणना करता है।

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्ट्रीम | StreamPtr | हैश करने के लिए बाइनरी स्ट्रीम। |
| hash_algorithm | HashAlgorithmName | हैश एल्गोरिदम। |

### ReturnValue

हैश किया गया डेटा।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
