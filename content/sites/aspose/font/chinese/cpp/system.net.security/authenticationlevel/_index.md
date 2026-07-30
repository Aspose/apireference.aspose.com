---
title: "System::Net::Security::AuthenticationLevel 枚举"
linktitle: "AuthenticationLevel"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Security::AuthenticationLevel 枚举。C++ 中针对 WebRequest 的特定身份验证标志。"
type: docs
weight: 300
url: /zh/cpp/system.net.security/authenticationlevel/
---
## AuthenticationLevel enum


WebRequest 特定的身份验证标志。

```cpp
enum class AuthenticationLevel
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 无 | 0 | 客户端和服务器均不需要身份验证。 |
| MutualAuthRequested | 1 | 如果服务器未通过身份验证，请求不会失败。 |
| MutualAuthRequired | 2 | 当服务器未通过身份验证时，当前应用程序将收到 'IOException'。 |

## 另见

* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
