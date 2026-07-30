---
title: "System::Net::Security::EncryptionPolicy 枚举"
linktitle: "EncryptionPolicy"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Security::EncryptionPolicy 枚举。枚举 C++ 中的加密策略。"
type: docs
weight: 400
url: /zh/cpp/system.net.security/encryptionpolicy/
---
## EncryptionPolicy enum


枚举加密策略。

```cpp
enum class EncryptionPolicy
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| RequireEncryption | 0 | 要求加密并且永不允许使用 'Null' 密码。 |
| AllowNoEncryption | 1 | 倾向使用完整加密，但如果服务器同意，可以使用 'Null' 密码。 |
| NoEncryption | 2 | 允许不加密，并请求在对端能够处理 'Null' 密码时使用 'Null' 密码。 |

## 另见

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
