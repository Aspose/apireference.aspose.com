---
title: "System::Uri::MakeRelative 方法"
linktitle: "MakeRelative"
second_title: "Aspose.Page 适用于 C++"
description: "System::Uri::MakeRelative 方法。确定 C++ 中两个 Uri 实例之间的差异。"
type: docs
weight: 3000
url: /zh/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


确定两个 [Uri](../) 实例之间的差异。

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | 用于与当前 URI 进行比较的 URI |

### ReturnValue

如果当前对象和 **toUri** 所表示的 URI 的主机名和方案相同，则此方法返回一个 [String](../../string/)，该字符串表示相对的 [Uri](../)，当附加到当前 URI 实例时，会得到 **toUri**。如果主机名或方案不同，则此方法返回一个 [String](../../string/)，该字符串表示 **uri** 参数。

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
