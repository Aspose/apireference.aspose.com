---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature 方法"
linktitle: "CreateSignature"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature 方法。C++ 中的 RTTI 信息。"
type: docs
weight: 100
url: /zh/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


RTTI 信息。

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) 用于计算哈希。 |

### ReturnValue

已计算的签名，以字节数组形式。
## 备注


为指定的数据创建签名。
## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


为指定的哈希值创建签名。

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 哈希 | System::SharedPtr\<HashAlgorithm\> | 创建签名时使用的哈希算法。 |

### ReturnValue

已计算的签名，以字节数组形式。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
