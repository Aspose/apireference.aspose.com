---
title: "System::Security::Cryptography::X509Certificates::X509KeyStorageFlags 枚举"
linktitle: "X509KeyStorageFlags"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyStorageFlags 枚举。定义在 C++ 中如何存储密钥。"
type: docs
weight: 2100
url: /zh/cpp/system.security.cryptography.x509certificates/x509keystorageflags/
---
## X509KeyStorageFlags enum


定义密钥的存储方式。

```cpp
enum class X509KeyStorageFlags : int32_t
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| DefaultKeySet | 0 | 使用默认密钥集。 |
| UserKeySet | 1 | 使用用户关联的存储，而不是机器本地的存储。 |
| MachineKeySet | 2 | 使用本地机器存储，而不是用户存储。 |
| Exportable | 4 | 将导入的密钥标记为可导出。 |
| UserProtected | 8 | 通知用户密钥正在被使用。 |
| PersistKeySet | 16 | 导入证书时，密钥会被持久化。 |

## 另见

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
