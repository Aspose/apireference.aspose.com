---
title: "System::Security::Cryptography::ECDsa::VerifyHash 方法"
linktitle: "VerifyHash"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::ECDsa::VerifyHash 方法。检查 C++ 中的数据签名。"
type: docs
weight: 1000
url: /zh/cpp/system.security.cryptography/ecdsa/verifyhash/
---
## ECDsa::VerifyHash method


检查数据签名。

```cpp
virtual bool System::Security::Cryptography::ECDsa::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 哈希 | ByteArrayPtr | 为接收的数据计算的哈希。 |
| 签名 | ByteArrayPtr | 接收到的签名。 |

### ReturnValue

如果签名有效则为 True，否则为 false。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
