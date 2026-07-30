---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags 枚举"
linktitle: "X509KeyUsageFlags"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags 枚举。定义在 C++ 中证书密钥的使用方式。"
type: docs
weight: 2200
url: /zh/cpp/system.security.cryptography.x509certificates/x509keyusageflags/
---
## X509KeyUsageFlags enum


定义证书密钥的使用方式。

```cpp
enum class X509KeyUsageFlags : int32_t
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 无 | 0 | 没有密钥使用参数。 |
| EncipherOnly | 1 | 密钥只能用于加密。 |
| CrlSign | 2 | 密钥可用于签署证书吊销列表。 |
| KeyCertSign | 4 | 密钥可用于签署证书。 |
| KeyAgreement | 8 | 密钥可用于确定密钥协商。 |
| DataEncipherment | 16 | 密钥可用于数据加密。 |
| KeyEncipherment | 32 | 密钥可用于密钥加密。 |
| NonRepudiation | 64 | 密钥可用于身份验证。 |
| DigitalSignature | 128 | 密钥可用作数字签名。 |
| DecipherOnly | 32768 | 密钥只能用于解密。 |

## 另见

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
