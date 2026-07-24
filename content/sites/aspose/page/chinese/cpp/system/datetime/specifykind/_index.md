---
title: "System::DateTime::SpecifyKind 方法"
linktitle: "SpecifyKind"
second_title: "Aspose.Page 适用于 C++"
description: "System::DateTime::SpecifyKind 方法。构造一个新的 DateTime 对象，该对象表示与指定 DateTime 对象相同的刻度数，并根据参数 **kind** 的指定表示本地时间、UTC 时间或两者皆非（C++）。"
type: docs
weight: 6800
url: /zh/cpp/system/datetime/specifykind/
---
## DateTime::SpecifyKind method


构造一个新的 [DateTime](../) 对象，该对象表示与指定的 [DateTime](../) 对象相同的刻度数，并根据参数 **kind** 的指定表示本地时间、UTC 时间或两者皆非。

```cpp
static DateTime System::DateTime::SpecifyKind(DateTime value, DateTimeKind kind)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | DateTime | 要从中复制刻度数的 [DateTime](../) 对象 |
| 种类 | DateTimeKind | 指定新对象应表示本地时间、UTC 时间或两者皆非。 |

### ReturnValue

一个新的 [DateTime](../) 对象，表示与 **value** 相同的刻度数，并且其 [DateTimeKind](../../datetimekind/) 值由 **kind** 指定。

## 另见

* Class [DateTime](../)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
