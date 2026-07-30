---
title: "System::Net::IWebProxy::IsBypassed 方法"
linktitle: "IsBypassed"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::IWebProxy::IsBypassed 方法。返回一个值，指示在 C++ 中指定的主机是否不应使用代理。"
type: docs
weight: 300
url: /zh/cpp/system.net/iwebproxy/isbypassed/
---
## IWebProxy::IsBypassed method


返回一个值，指示是否不应对指定的主机使用代理。

```cpp
virtual bool System::Net::IWebProxy::IsBypassed(System::SharedPtr<Uri> host)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| host | System::SharedPtr\<Uri\> | 要检查的主机 URI。 |

### ReturnValue

如果必须不使用代理服务器则为 true，否则为 false。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [IWebProxy](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
