---
title: "System::Net::CookieVariant 枚举"
linktitle: "CookieVariant"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::CookieVariant 枚举。枚举 C++ 中的 cookie 规范。"
type: docs
weight: 4200
url: /zh/cpp/system.net/cookievariant/
---
## CookieVariant enum


枚举 cookie 规范。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
enum class CookieVariant
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 未知 | 0 | 未知的 cookie 规范。 |
| Plain | 1 | 普通 cookie 规范。 |
| Rfc2109 | 2 | ‘RFC 2109’ cookie 规范。 |
| Rfc2965 | 3 | ‘RFC 2965’ cookie 规范。 |
| 默认 | n/a | 默认值等于 ‘Rfc2109’。 |

## 另见

* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
