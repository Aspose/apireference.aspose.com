---
title: "System::Net::Cookie::VerifySetDefaults 方法"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Cookie::VerifySetDefaults 方法。验证并在 C++ 中设置默认属性的值。"
type: docs
weight: 4200
url: /zh/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


验证并设置默认属性的值。

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| variant | CookieVariant | 该 cookie 的规范。 |
| uri | System::SharedPtr\<Uri\> | 用于初始化内部字段的 Uri 类实例。 |
| isLocalDomain | bool | 指示 cookie 是否被推送到本地域的值。 |
| localDomain | String | 本地域名。 |
| setDefault | bool | 指示是否必须使用默认值初始化 cookie 属性的值。 |
| shouldThrow | bool | 指示在指定值无效时是否应抛出异常的值。 |

### ReturnValue

所有值有效时为 true，否则为 false。

## 另见

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
