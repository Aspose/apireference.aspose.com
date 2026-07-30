---
title: "System::DateTime::SpecifyKind 方法"
linktitle: "SpecifyKind"
second_title: "Aspose.Font 适用于 C++"
description: "System::DateTime::SpecifyKind 方法。构造一个新的 DateTime 对象，该对象的刻度数与指定的 DateTime 对象相同，并根据参数 **kind** 在 C++ 中指定为本地时间、UTC 时间或两者皆非。"
type: docs
weight: 6800
url: /zh/cpp/system/datetime/specifykind/
---
## DateTime::SpecifyKind method


构造一个新的 [DateTime](../) 对象，该对象的刻度数与指定的 [DateTime](../) 对象相同，并根据参数 **kind** 表示本地时间、UTC 时间或两者皆非。

```cpp
static DateTime System::DateTime::SpecifyKind(DateTime value, DateTimeKind kind)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | DateTime | 要从中复制刻度数的 [DateTime](../) 对象 |
| kind | DateTimeKind | 指定新对象应表示本地时间、UTC 时间或两者皆非。 |

### ReturnValue

一个新的 [DateTime](../) 对象，其刻度数与 **value** 相同，并且由 **kind** 指定的 [DateTimeKind](../../datetimekind/) 值。

## 另见

* Class [DateTime](../)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
