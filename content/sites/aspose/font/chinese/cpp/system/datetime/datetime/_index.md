---
title: "System::DateTime::DateTime 构造函数"
linktitle: "DateTime"
second_title: "Aspose.Font 适用于 C++"
description: "System::DateTime::DateTime 构造函数。构造一个实例，该实例表示 C++ 中等于 MinValue 的最小可能日期和时间值。"
type: docs
weight: 100
url: /zh/cpp/system/datetime/datetime/
---
## DateTime::DateTime() constructor


构造一个实例，表示等于 MinValue 的最小可能的日期和时间值。

```cpp
System::DateTime::DateTime()
```

## 另见

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(const DateTime\&) constructor


复制构造一个实例。

```cpp
System::DateTime::DateTime(const DateTime &dt)=default
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| dt | const DateTime\& | 用于复制所表示的日期和时间值的 [DateTime](../) 类实例 |

## 另见

* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int) constructor


构造一个实例，该实例表示指定为特定年份、月份和日期的日期时间值。

```cpp
System::DateTime::DateTime(int year, int month, int day)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 年份 | int | 要由正在构造的实例表示的年份。 |
| 月份 | int | 要由正在构造的实例表示的 **year** 的月份。 |
| 天 | int | 要由正在构造的实例表示的 **month** 的天数。 |

## 另见

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


构造一个实例，该实例表示在指定日历中指定为特定年份、月份和日期的日期时间值。

```cpp
System::DateTime::DateTime(int year, int month, int day, const SharedPtr<Globalization::Calendar> &calendar)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 年份 | int | 要由正在构造的实例表示的年份。 |
| 月份 | int | 要由正在构造的实例表示的 **year** 的月份。 |
| 天 | int | 要由正在构造的实例表示的 **month** 的天数。 |
| 日历 | const SharedPtr\<Globalization::Calendar\>\& | 用于解释指定的 **year**、**month** 和 **day** 的日历。 |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int) constructor


构造一个实例，该实例表示指定为特定年份、月份、日期、小时、分钟和秒的日期时间值。

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 年份 | int | 要由正在构造的实例表示的年份。 |
| 月份 | int | 要由正在构造的实例表示的 **year** 的月份。 |
| 天 | int | 要由正在构造的实例表示的 **month** 的天数。 |
| 小时 | int | 要由正在构造的实例表示的 **day** 的小时。 |
| 分钟 | int | 要由正在构造的实例表示的 **hour** 的分钟。 |
| 秒 | int | 要由正在构造的实例表示的 **minute** 的秒数。 |

## 另见

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


构造一个实例，该实例表示在指定日历中指定为特定年份、月份、日期、小时、分钟和秒的日期时间值。

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, const SharedPtr<Globalization::Calendar> &calendar)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 年份 | int | 要由正在构造的实例表示的年份。 |
| 月份 | int | 要由正在构造的实例表示的 **year** 的月份。 |
| 天 | int | 要由正在构造的实例表示的 **month** 的天数。 |
| 小时 | int | 要由正在构造的实例表示的 **day** 的小时。 |
| 分钟 | int | 要由正在构造的实例表示的 **hour** 的分钟。 |
| 秒 | int | 要由正在构造的实例表示的 **minute** 的秒数。 |
| 日历 | const SharedPtr\<Globalization::Calendar\>\& | 用于解释指定的 **year**、**month** 和 **day** 的日历。 |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, DateTimeKind) constructor


构造一个实例，该实例表示指定为特定年份、月份、日期、小时、分钟和秒的日期时间值。

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 年份 | int | 要由正在构造的实例表示的年份。 |
| 月份 | int | 要由正在构造的实例表示的 **year** 的月份。 |
| 天 | int | 要由正在构造的实例表示的 **month** 的天数。 |
| 小时 | int | 要由正在构造的实例表示的 **day** 的小时。 |
| 分钟 | int | 要由正在构造的实例表示的 **hour** 的分钟。 |
| 秒 | int | 要由正在构造的实例表示的 **minute** 的秒数。 |
| kind | DateTimeKind | 该值指示提供的日期和时间参数是本地时间、UTC 时间还是两者皆非。 |

## 另见

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) constructor


构造一个实例，该实例表示在指定日历中指定为特定年份、月份、日期、小时、分钟、秒和毫秒的日期时间值。

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, DateTimeKind kind=DateTimeKind::Unspecified)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 年份 | int | 要由正在构造的实例表示的年份。 |
| 月份 | int | 要由正在构造的实例表示的 **year** 的月份。 |
| 天 | int | 要由正在构造的实例表示的 **month** 的天数。 |
| 小时 | int | 要由正在构造的实例表示的 **day** 的小时。 |
| 分钟 | int | 要由正在构造的实例表示的 **hour** 的分钟。 |
| 秒 | int | 要由正在构造的实例表示的 **minute** 的秒数。 |
| 毫秒 | int | 正在构造的实例所表示的 **second** 的毫秒。 |
| kind | const SharedPtr\<Globalization::Calendar\>\& | 该值指示提供的日期和时间参数是本地时间、UTC 时间还是两者皆非。 |
| 日历 | DateTimeKind | 用于解释指定的 **year**、**month** 和 **day** 的日历。 |

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, DateTimeKind) constructor


构造一个实例，该实例表示指定为特定年份、月份、日期、小时、分钟、秒和毫秒的日期时间值。

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind=DateTimeKind::Unspecified)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 年份 | int | 要由正在构造的实例表示的年份。 |
| 月份 | int | 要由正在构造的实例表示的 **year** 的月份。 |
| 天 | int | 要由正在构造的实例表示的 **month** 的天数。 |
| 小时 | int | 要由正在构造的实例表示的 **day** 的小时。 |
| 分钟 | int | 要由正在构造的实例表示的 **hour** 的分钟。 |
| 秒 | int | 要由正在构造的实例表示的 **minute** 的秒数。 |
| 毫秒 | int | 正在构造的实例所表示的 **second** 的毫秒。 |
| kind | DateTimeKind | 该值指示提供的日期和时间参数是本地时间、UTC 时间还是两者皆非。 |

## 另见

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind, bool) constructor


构造一个实例，该实例表示以滴答数指定的日期时间值。供内部使用。

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind, bool is_ambiguous_local_dst)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ticks | int64_t | 自格里高利历公元 0001 年 1 月 1 日 00:00:00.000 起已过去的 100 纳秒间隔数。 |
| kind | DateTimeKind | 该值指示 **ticks** 参数是指定本地时间、UTC 时间还是两者皆非。 |
| is_ambiguous_local_dst | bool | 如果指定的日期和时间是模糊的且可以映射到多个 UTC 时间，则为 True。 |

## 另见

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind) constructor


构造一个实例，该实例表示以滴答数指定的日期时间值。

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind=DateTimeKind::Unspecified)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ticks | int64_t | 自格里高利历公元 0001 年 1 月 1 日 00:00:00.000 起已过去的 100 纳秒间隔数。 |
| kind | DateTimeKind | 该值指示 **ticks** 参数是指定本地时间、UTC 时间还是两者皆非。 |

## 另见

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
