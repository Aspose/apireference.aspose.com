---
title: "System::Uri::MakeRelativeUri 方法"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Font 适用于 C++"
description: "System::Uri::MakeRelativeUri 方法。确定当前对象和指定 Uri 对象所表示的 URI 之间的差异（C++）。"
type: docs
weight: 3100
url: /zh/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


确定当前对象和指定 [Uri](../) 对象所表示的 URI 之间的差异。

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | 比较对象 |

### ReturnValue

如果当前对象表示的 URI 与 **toUri** 的主机名和方案相同，则此方法返回一个相对的 [Uri](../)，将其附加到当前 URI 实例后即可得到 **toUri**。如果主机名或方案不同，则此方法返回一个表示 **uri** 参数的 [Uri](../) 对象。

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
