---
title: "منشئ System::DateTime::DateTime"
linktitle: "DateTime"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::DateTime::DateTime. يُنشئ مثيلة تمثل أصغر قيمة ممكنة للتاريخ والوقت مساوية لـ MinValue في C++."
type: docs
weight: 100
url: /ar/cpp/system/datetime/datetime/
---
## DateTime::DateTime() constructor


ينشئ نسخة تمثل أصغر قيمة تاريخ ووقت ممكنة مساوية لـ MinValue.

```cpp
System::DateTime::DateTime()
```

## انظر أيضًا

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(const DateTime\&) constructor


ينشئ نسخة من مثيل.

```cpp
System::DateTime::DateTime(const DateTime &dt)=default
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| dt | const DateTime\& | مثيل من فئة [DateTime](../) لنسخ قيمة التاريخ والوقت الممثلة منه |

## انظر أيضًا

* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int) constructor


ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم معينين.

```cpp
System::DateTime::DateTime(int year, int month, int day)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي ستمثلها المثيلة التي يتم إنشاؤها. |
| الشهر | int | الشهر من **year** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| اليوم | int | اليوم من **month** الذي ستمثلها المثيلة التي يتم إنشاؤها. |

## انظر أيضًا

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم معينين في التقويم المحدد.

```cpp
System::DateTime::DateTime(int year, int month, int day, const SharedPtr<Globalization::Calendar> &calendar)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي ستمثلها المثيلة التي يتم إنشاؤها. |
| الشهر | int | الشهر من **year** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| اليوم | int | اليوم من **month** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| التقويم | const SharedPtr\<Globalization::Calendar\>\& | التقويم المستخدم لتفسير **year**, **month** و **day** المحددة. |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int) constructor


ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي ستمثلها المثيلة التي يتم إنشاؤها. |
| الشهر | int | الشهر من **year** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| اليوم | int | اليوم من **month** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| ساعة | int | الساعة من **day** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| دقيقة | int | الدقيقة من **hour** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| ثانية | int | الثانية من **minute** التي ستمثلها المثيلة التي يتم إنشاؤها. |

## انظر أيضًا

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة في التقويم المحدد.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, const SharedPtr<Globalization::Calendar> &calendar)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي ستمثلها المثيلة التي يتم إنشاؤها. |
| الشهر | int | الشهر من **year** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| اليوم | int | اليوم من **month** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| ساعة | int | الساعة من **day** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| دقيقة | int | الدقيقة من **hour** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| ثانية | int | الثانية من **minute** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| التقويم | const SharedPtr\<Globalization::Calendar\>\& | التقويم المستخدم لتفسير **year**, **month** و **day** المحددة. |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, DateTimeKind) constructor


ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي ستمثلها المثيلة التي يتم إنشاؤها. |
| الشهر | int | الشهر من **year** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| اليوم | int | اليوم من **month** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| ساعة | int | الساعة من **day** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| دقيقة | int | الدقيقة من **hour** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| ثانية | int | الثانية من **minute** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| النوع | DateTimeKind | القيمة التي تشير إلى ما إذا كانت معلمات التاريخ والوقت المقدمة تحدد وقتًا محليًا أو توقيت UTC أو لا شيء. |

## انظر أيضًا

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) constructor


ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية وملي ثانية معينة في التقويم المحدد.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, DateTimeKind kind=DateTimeKind::Unspecified)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي ستمثلها المثيلة التي يتم إنشاؤها. |
| الشهر | int | الشهر من **year** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| اليوم | int | اليوم من **month** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| ساعة | int | الساعة من **day** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| دقيقة | int | الدقيقة من **hour** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| ثانية | int | الثانية من **minute** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| مللي ثانية | int | الميليثانية من **second** التي ستمثلها المثيل الجاري إنشاؤه. |
| النوع | const SharedPtr\<Globalization::Calendar\>\& | القيمة التي تشير إلى ما إذا كانت معلمات التاريخ والوقت المقدمة تحدد وقتًا محليًا أو توقيت UTC أو لا شيء. |
| التقويم | DateTimeKind | التقويم المستخدم لتفسير **year**, **month** و **day** المحددة. |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, DateTimeKind) constructor


ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية وملي ثانية معينة.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind=DateTimeKind::Unspecified)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي ستمثلها المثيلة التي يتم إنشاؤها. |
| الشهر | int | الشهر من **year** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| اليوم | int | اليوم من **month** الذي ستمثلها المثيلة التي يتم إنشاؤها. |
| ساعة | int | الساعة من **day** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| دقيقة | int | الدقيقة من **hour** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| ثانية | int | الثانية من **minute** التي ستمثلها المثيلة التي يتم إنشاؤها. |
| مللي ثانية | int | الميليثانية من **second** التي ستمثلها المثيل الجاري إنشاؤه. |
| النوع | DateTimeKind | القيمة التي تشير إلى ما إذا كانت معلمات التاريخ والوقت المقدمة تحدد وقتًا محليًا أو توقيت UTC أو لا شيء. |

## انظر أيضًا

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind, bool) constructor


أنشئ مثيلاً يمثل قيمة تاريخ ووقت محددة كعدد من النبضات. للاستخدام الداخلي.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind, bool is_ambiguous_local_dst)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نقرات | int64_t | عدد فواصل 100 نانوثانية التي مرت منذ 1 يناير 0001 00:00:00.000 في التقويم الجورجي. |
| النوع | DateTimeKind | القيمة التي تشير إلى ما إذا كان معامل **ticks** يحدد وقتًا محليًا أو توقيت UTC أو لا شيء. |
| is_ambiguous_local_dst | bool | صحيح إذا كان التاريخ والوقت المحددان غامضين ويمكن ربطهما بالعديد من أوقات UTC. |

## انظر أيضًا

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind) constructor


أنشئ مثيلاً يمثل قيمة تاريخ ووقت محددة كعدد من النبضات.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind=DateTimeKind::Unspecified)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نقرات | int64_t | عدد فواصل 100 نانوثانية التي مرت منذ 1 يناير 0001 00:00:00.000 في التقويم الجورجي. |
| النوع | DateTimeKind | القيمة التي تشير إلى ما إذا كان معامل **ticks** يحدد وقتًا محليًا أو توقيت UTC أو لا شيء. |

## انظر أيضًا

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
