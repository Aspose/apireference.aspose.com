---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature 方法"
linktitle: "VerifySignature"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature 方法。验证 C++ 中数据的签名。"
type: docs
weight: 300
url: /zh/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


验证数据上的签名。

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) 使用 **rgbSignature** 签名。 |
| rgbSignature | System::ArrayPtr\<uint8_t\> | 用于验证数据的签名。 |

### ReturnValue

如果签名检查成功则为 true，否则为 false。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


验证数据上的签名。未实现。

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 哈希 | System::SharedPtr\<HashAlgorithm\> | 用于哈希的算法。 |
| rgbSignature | System::ArrayPtr\<uint8_t\> | 用于验证数据的签名。 |

### ReturnValue

如果签名检查成功则为 true，否则为 false。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
