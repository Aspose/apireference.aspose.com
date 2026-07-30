---
title: "System::DateTimeOffset::operator- 方法"
linktitle: "operator-"
second_title: "Aspose.Font 适用于 C++"
description: "System::DateTimeOffset::operator- 方法。返回一个 TimeSpan 类的实例，表示当前对象和指定对象所表示的日期时间值之间的时间间隔（在 C++ 中）。"
type: docs
weight: 3500
url: /zh/cpp/system/datetimeoffset/operator-/
---
## DateTimeOffset::operator-(const DateTimeOffset\&) const method


返回一个 [TimeSpan](../../timespan/) 类的实例，表示当前对象和指定对象所表示的日期时间值之间的时间间隔。

```cpp
TimeSpan System::DateTimeOffset::operator-(const DateTimeOffset &other) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| other | const DateTimeOffset\& | 一个 [DateTime](../../datetime/) 类的实例，标记要计算的区间的一端 |

### ReturnValue

一个 [TimeSpan](../../timespan/) 类的实例，表示当前对象和 **other** 所表示的日期时间值之间的时间间隔。

## 另见

* Class [TimeSpan](../../timespan/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::operator-(TimeSpan) const method


返回一个新的 [DateTimeOffset](../) 类实例，表示从当前对象所表示的值减去指定时间跨度后的日期时间值。

```cpp
DateTimeOffset System::DateTimeOffset::operator-(TimeSpan value) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | TimeSpan | 要减去的时间间隔 |

### ReturnValue

一个新的 [DateTimeOffset](../) 类实例，表示从当前对象所表示的值减去 **value** 后的日期时间值。

## 另见

* Class [DateTimeOffset](../)
* Class [TimeSpan](../../timespan/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
