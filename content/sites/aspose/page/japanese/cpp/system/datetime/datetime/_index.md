---
title: "System::DateTime::DateTime コンストラクター"
linktitle: "DateTime"
second_title: "C++ 用 Aspose.Page"
description: "System::DateTime::DateTime コンストラクター。C++ で最小可能な日付時刻値（MinValue）を表すインスタンスを作成します。"
type: docs
weight: 100
url: /ja/cpp/system/datetime/datetime/
---
## DateTime::DateTime() constructor


最小可能な日時である MinValue と等しいインスタンスを構築します。

```cpp
System::DateTime::DateTime()
```

## 参照

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(const DateTime\&) constructor


インスタンスをコピー構築します。

```cpp
System::DateTime::DateTime(const DateTime &dt)=default
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| dt | const DateTime\& | 表されている日付と時刻の値をコピーするための [DateTime](../) クラスのインスタンス |

## 参照

* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int) constructor


特定の年、月、日で指定された日時を表すインスタンスを構築します。

```cpp
System::DateTime::DateTime(int year, int month, int day)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 年 | int | 構築中のインスタンスが表す年。 |
| 月 | int | 構築中のインスタンスが表す **year** の月。 |
| 日 | int | 構築中のインスタンスが表す **month** の日。 |

## 参照

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


指定されたカレンダーで特定の年、月、日で指定された日時を表すインスタンスを構築します。

```cpp
System::DateTime::DateTime(int year, int month, int day, const SharedPtr<Globalization::Calendar> &calendar)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 年 | int | 構築中のインスタンスが表す年。 |
| 月 | int | 構築中のインスタンスが表す **year** の月。 |
| 日 | int | 構築中のインスタンスが表す **month** の日。 |
| カレンダー | const SharedPtr\<Globalization::Calendar\>\& | 指定された **year**、**month**、**day** を解釈するために使用されるカレンダー。 |

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int) constructor


特定の年、月、日、時、分、秒で指定された日時値を表すインスタンスを作成します。

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 年 | int | 構築中のインスタンスが表す年。 |
| 月 | int | 構築中のインスタンスが表す **year** の月。 |
| 日 | int | 構築中のインスタンスが表す **month** の日。 |
| 時 | int | 構築中のインスタンスが表す **day** の時間。 |
| 分 | int | 構築中のインスタンスが表す **hour** の分。 |
| 秒 | int | 構築中のインスタンスが表す **minute** の秒。 |

## 参照

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


指定されたカレンダーで、特定の年、月、日、時、分、秒で指定された日時値を表すインスタンスを作成します。

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, const SharedPtr<Globalization::Calendar> &calendar)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 年 | int | 構築中のインスタンスが表す年。 |
| 月 | int | 構築中のインスタンスが表す **year** の月。 |
| 日 | int | 構築中のインスタンスが表す **month** の日。 |
| 時 | int | 構築中のインスタンスが表す **day** の時間。 |
| 分 | int | 構築中のインスタンスが表す **hour** の分。 |
| 秒 | int | 構築中のインスタンスが表す **minute** の秒。 |
| カレンダー | const SharedPtr\<Globalization::Calendar\>\& | 指定された **year**、**month**、**day** を解釈するために使用されるカレンダー。 |

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, DateTimeKind) constructor


特定の年、月、日、時、分、秒で指定された日時値を表すインスタンスを作成します。

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 年 | int | 構築中のインスタンスが表す年。 |
| 月 | int | 構築中のインスタンスが表す **year** の月。 |
| 日 | int | 構築中のインスタンスが表す **month** の日。 |
| 時 | int | 構築中のインスタンスが表す **day** の時間。 |
| 分 | int | 構築中のインスタンスが表す **hour** の分。 |
| 秒 | int | 構築中のインスタンスが表す **minute** の秒。 |
| 種類 | DateTimeKind | 提供された日付時刻パラメーターがローカル時間、UTC 時間、またはどちらでもないかを示す値。 |

## 参照

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) constructor


指定されたカレンダーで、特定の年、月、日、時、分、秒、ミリ秒で指定された日時値を表すインスタンスを作成します。

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, DateTimeKind kind=DateTimeKind::Unspecified)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 年 | int | 構築中のインスタンスが表す年。 |
| 月 | int | 構築中のインスタンスが表す **year** の月。 |
| 日 | int | 構築中のインスタンスが表す **month** の日。 |
| 時 | int | 構築中のインスタンスが表す **day** の時間。 |
| 分 | int | 構築中のインスタンスが表す **hour** の分。 |
| 秒 | int | 構築中のインスタンスが表す **minute** の秒。 |
| ミリ秒 | int | 構築中のインスタンスが表す **second** のミリ秒。 |
| 種類 | const SharedPtr\<Globalization::Calendar\>\& | 提供された日付時刻パラメーターがローカル時間、UTC 時間、またはどちらでもないかを示す値。 |
| カレンダー | DateTimeKind | 指定された **year**、**month**、**day** を解釈するために使用されるカレンダー。 |

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, DateTimeKind) constructor


特定の年、月、日、時、分、秒、ミリ秒で指定された日時値を表すインスタンスを作成します。

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind=DateTimeKind::Unspecified)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 年 | int | 構築中のインスタンスが表す年。 |
| 月 | int | 構築中のインスタンスが表す **year** の月。 |
| 日 | int | 構築中のインスタンスが表す **month** の日。 |
| 時 | int | 構築中のインスタンスが表す **day** の時間。 |
| 分 | int | 構築中のインスタンスが表す **hour** の分。 |
| 秒 | int | 構築中のインスタンスが表す **minute** の秒。 |
| ミリ秒 | int | 構築中のインスタンスが表す **second** のミリ秒。 |
| 種類 | DateTimeKind | 提供された日付時刻パラメーターがローカル時間、UTC 時間、またはどちらでもないかを示す値。 |

## 参照

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind, bool) constructor


ティック数で指定された日時値を表すインスタンスを作成します。内部使用専用。

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind, bool is_ambiguous_local_dst)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ticks | int64_t | グレゴリオ暦で 0001 年 1 月 1 日 00:00:00.000 から経過した 100 ナノ秒間隔の数。 |
| 種類 | DateTimeKind | **ticks** パラメーターがローカル時間、UTC 時間、またはどちらでもないかを示す値。 |
| is_ambiguous_local_dst | bool | 指定された日付時刻が曖昧で、複数の UTC 時間にマッピングできる場合は true。 |

## 参照

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind) constructor


ティック数で指定された日時値を表すインスタンスを作成します。

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind=DateTimeKind::Unspecified)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ticks | int64_t | グレゴリオ暦で 0001 年 1 月 1 日 00:00:00.000 から経過した 100 ナノ秒間隔の数。 |
| 種類 | DateTimeKind | **ticks** パラメーターがローカル時間、UTC 時間、またはどちらでもないかを示す値。 |

## 参照

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
