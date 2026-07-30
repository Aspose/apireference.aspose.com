---
title: "System::Uri::MakeRelative 方法"
linktitle: "MakeRelative"
second_title: "Aspose.Font 适用于 C++"
description: "System::Uri::MakeRelative 方法。确定两个 [Uri](../) 实例之间的差异（C++）。"
type: docs
weight: 3000
url: /zh/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


确定两个 [Uri](../) 实例之间的差异。

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | 用于与当前 URI 比较的 URI |

### ReturnValue

如果当前对象表示的 URI 与 **toUri** 的主机名和方案相同，则此方法返回一个表示相对 [Uri](../) 的 [String](../../string/)，将其附加到当前 URI 实例后即可得到 **toUri**。如果主机名或方案不同，则此方法返回一个表示 **uri** 参数的 [String](../../string/)。

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
