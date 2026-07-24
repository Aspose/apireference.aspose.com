---
title: "System::Uri::Compare 方法"
linktitle: "Compare"
second_title: "Aspose.Page 适用于 C++"
description: "System::Uri::Compare 方法。使用指定的比较规则比较指定的 Uri 对象，适用于 C++。"
type: docs
weight: 3500
url: /zh/cpp/system/uri/compare/
---
## Uri::Compare method


使用指定的比较规则比较指定的 [Uri](../) 对象。

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | 第一个比较数 |
| uri2 | const SharedPtr\<Uri\>\& | 第二个比较数 |
| partsToCompare | UriComponents | 指定要比较的 **uri1** 和 **uri2** 的部分 |
| compareFormat | UriFormat | 指定在比较 URI 组件时使用的字符转义方式 |
| comparisonType | StringComparison | [StringComparison](../../stringcomparison/) 值之一 |

### ReturnValue

如果 **uri1** 小于 **uri2**，则返回负值；如果 uri1 和 uri2 相等，则返回 0；如果 **uri1** 大于 **uri2**，则返回正值

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
