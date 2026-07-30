---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature 方法"
linktitle: "VerifySignature"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature 方法。验证在 C++ 中数据哈希的签名。"
type: docs
weight: 400
url: /zh/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


验证数据哈希的签名。

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | 已为数据计算哈希。 |
| rgbSignature | System::ArrayPtr\<uint8_t\> | 已收到数据的签名。 |

### ReturnValue

如果签名有效则为 True，否则为 false。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
