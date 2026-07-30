---
title: "System::Net::AuthenticationSchemes 枚举"
linktitle: "AuthenticationSchemes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::AuthenticationSchemes 枚举。枚举 C++ 中的身份验证方案。"
type: docs
weight: 4100
url: /zh/cpp/system.net/authenticationschemes/
---
## AuthenticationSchemes enum


枚举身份验证方案。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
enum class AuthenticationSchemes
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 无 | 0 | 不需要身份验证。 |
| Digest | 1 | Digest 访问身份验证。 |
| Negotiate | 2 | 与客户端协商将使用哪种身份验证方案（NTML 或 Kerberos）。 |
| Ntlm | 4 | NTLM 身份验证。 |
| Basic | 8 | Basic 身份验证。 |
| Anonymous | 32768 | 匿名身份验证。 |
| IntegratedWindowsAuthentication | n/a | [Windows](../../system.windows/) 身份验证。 |

## 另见

* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
