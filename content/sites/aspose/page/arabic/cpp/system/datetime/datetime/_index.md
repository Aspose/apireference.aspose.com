---
title: "منشئ System::DateTime::DateTime"
linktitle: "DateTime"
second_title: "Aspose.Page لـ C++"
description: "منشئ System::DateTime::DateTime. يُنشئ مثيلاً يمثل أصغر قيمة ممكنة للتاريخ والوقت مساوية لـ MinValue في C++."
type: docs
weight: 100
url: /ar/cpp/system/datetime/datetime/
---
## DateTime::DateTime() constructor


ينشئ نسخة تمثّل أصغر قيمة تاريخ ووقت ممكنة تساوي MinValue.

```cpp
System::DateTime::DateTime()
```

## انظر أيضًا

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(const DateTime\&) constructor


ينسخ كائنًا عند الإنشاء.

```cpp
System::DateTime::DateTime(const DateTime &dt)=default
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| dt | const DateTime\& | مثيل من فئة [DateTime](../) لنسخ قيمة التاريخ والوقت الممثلة منه |

## انظر أيضًا

* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int) constructor


ينشئ نسخة تمثّل قيمة تاريخ ووقت محددة كسنة وشهر ويوم معينين.

```cpp
System::DateTime::DateTime(int year, int month, int day)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| شهر | int | الشهر من **year** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| يوم | int | اليوم من **month** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |

## انظر أيضًا

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


ينشئ نسخة تمثّل قيمة تاريخ ووقت محددة كسنة وشهر ويوم معينين في التقويم المحدد.

```cpp
System::DateTime::DateTime(int year, int month, int day, const SharedPtr<Globalization::Calendar> &calendar)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| شهر | int | الشهر من **year** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| يوم | int | اليوم من **month** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| تقويم | const SharedPtr\<Globalization::Calendar\>\& | التقويم المستخدم لتفسير **year**، **month** و **day** المحددة. |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int) constructor


ينشئ كائنًا يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| شهر | int | الشهر من **year** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| يوم | int | اليوم من **month** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| ساعة | int | الساعة من **day** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| دقيقة | int | الدقيقة من **hour** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| ثانية | int | الثانية من **minute** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |

## انظر أيضًا

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


ينشئ كائنًا يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة في التقويم المحدد.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, const SharedPtr<Globalization::Calendar> &calendar)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| شهر | int | الشهر من **year** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| يوم | int | اليوم من **month** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| ساعة | int | الساعة من **day** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| دقيقة | int | الدقيقة من **hour** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| ثانية | int | الثانية من **minute** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| تقويم | const SharedPtr\<Globalization::Calendar\>\& | التقويم المستخدم لتفسير **year**، **month** و **day** المحددة. |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, DateTimeKind) constructor


ينشئ كائنًا يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| شهر | int | الشهر من **year** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| يوم | int | اليوم من **month** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| ساعة | int | الساعة من **day** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| دقيقة | int | الدقيقة من **hour** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| ثانية | int | الثانية من **minute** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| نوع | DateTimeKind | القيمة التي تُشير إلى ما إذا كانت معلمات التاريخ والوقت المقدمة تحدد وقتًا محليًا أو توقيت UTC أو لا شيء. |

## انظر أيضًا

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) constructor


ينشئ كائنًا يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية وملي ثانية معينة في التقويم المحدد.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| شهر | int | الشهر من **year** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| يوم | int | اليوم من **month** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| ساعة | int | الساعة من **day** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| دقيقة | int | الدقيقة من **hour** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| ثانية | int | الثانية من **minute** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| مللي ثانية | int | الميليثانية من **second** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| نوع | const SharedPtr\<Globalization::Calendar\>\& | القيمة التي تُشير إلى ما إذا كانت معلمات التاريخ والوقت المقدمة تحدد وقتًا محليًا أو توقيت UTC أو لا شيء. |
| تقويم | DateTimeKind | التقويم المستخدم لتفسير **year**، **month** و **day** المحددة. |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, DateTimeKind) constructor


ينشئ كائنًا يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية وملي ثانية معينة.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| السنة | int | السنة التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| شهر | int | الشهر من **year** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| يوم | int | اليوم من **month** الذي سيتم تمثيله بواسطة المثيل الجاري إنشاؤه. |
| ساعة | int | الساعة من **day** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| دقيقة | int | الدقيقة من **hour** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| ثانية | int | الثانية من **minute** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| مللي ثانية | int | الميليثانية من **second** التي سيتم تمثيلها بواسطة المثيل الجاري إنشاؤه. |
| نوع | DateTimeKind | القيمة التي تُشير إلى ما إذا كانت معلمات التاريخ والوقت المقدمة تحدد وقتًا محليًا أو توقيت UTC أو لا شيء. |

## انظر أيضًا

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind, bool) constructor


أنشئ كائنًا يمثل قيمة تاريخ ووقت محددة كعدد من النبضات. للاستخدام الداخلي.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind, bool is_ambiguous_local_dst)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| نقرات | int64_t | عدد فواصل 100 نانوثانية التي مرت منذ 1 يناير 0001 00:00:00.000 في التقويم الجورجي. |
| نوع | DateTimeKind | القيمة التي تُشير إلى ما إذا كان معامل **ticks** يحدد وقتًا محليًا أو توقيت UTC أو لا شيء. |
| is_ambiguous_local_dst | bool | صحيح إذا كان التاريخ والوقت المحددان غير واضحين ويمكن ربطهما بالعديد من أوقات UTC. |

## انظر أيضًا

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind) constructor


أنشئ كائنًا يمثل قيمة تاريخ ووقت محددة كعدد من النبضات.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| نقرات | int64_t | عدد فواصل 100 نانوثانية التي مرت منذ 1 يناير 0001 00:00:00.000 في التقويم الجورجي. |
| نوع | DateTimeKind | القيمة التي تُشير إلى ما إذا كان معامل **ticks** يحدد وقتًا محليًا أو توقيت UTC أو لا شيء. |

## انظر أيضًا

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
