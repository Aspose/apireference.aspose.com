---
title: "System::Net::WebRequest::RegisterPrefix 方法"
linktitle: "RegisterPrefix"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebRequest::RegisterPrefix 方法。为指定的 URI 在 C++ 中注册 WebRequest 的派生类。"
type: docs
weight: 600
url: /zh/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


为指定的 URI 注册 [WebRequest](../) 的派生类。

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 前缀 | String | URI 或 URI 前缀。 |
| creator | System::SharedPtr\<IWebRequestCreate\> | 创建 [WebRequest](../) 类的新实例。 |

### ReturnValue

当 [WebRequest](../) 的派生类成功为指定的 URI 注册时返回 true，否则返回 false。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
