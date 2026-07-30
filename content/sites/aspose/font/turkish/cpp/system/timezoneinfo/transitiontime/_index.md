---
title: "System::TimeZoneInfo::TransitionTime sınıfı"
linktitle: "TransitionTime"
second_title: "Aspose.Font için C++"
description: "System::TimeZoneInfo::TransitionTime sınıfı. C++'da RTTI bilgisi."
type: docs
weight: 3400
url: /tr/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


RTTI bilgisi.

```cpp
class TransitionTime
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | Belirli bir ayın belirli gününde gerçekleşen sabit tarih kuralını (zaman değişimini) temsil eden [TransitionTime](./) sınıfının bir örneğini oluşturur. |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | Belirli bir ayın belirli haftasının belirli gününde gerçekleşen esnek tarih kuralını (zaman değişimini) temsil eden [TransitionTime](./) sınıfının bir örneğini oluşturur. |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | Belirtilen parametrelerle tanımlanan bir zaman değişimini temsil eden [TransitionTime](./) sınıfının bir örneğini oluşturur. |
| [get_Day](./get_day/)() const | Zaman değişiminin gerçekleştiği haftanın gününün sıra numarasını döndürür. |
| [get_DayOfWeek](./get_dayofweek/)() const | Zaman değişiminin gerçekleştiği haftanın gününü temsil eden değeri döndürür. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | Zaman değişiminin sabit bir tarih ve saatte mi yoksa esnek bir tarih ve saatte mi gerçekleştiğini gösteren değeri döndürür. |
| [get_Month](./get_month/)() const | Zaman değişiminin gerçekleştiği yılın ayının sıra numarasını döndürür. |
| [get_TimeOfDay](./get_timeofday/)() const | Zaman değişiminin gerçekleştiği belirli zamanı temsil eden bir [DateTime](../../datetime/) nesnesini döndürür. |
| [get_Week](./get_week/)() const | Zaman değişiminin gerçekleştiği ayın haftasının sıra numarasını döndürür. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | Varsayılan yapıcı. DAHİLİ KULLANIM İÇİN. |
## Açıklamalar


Bir saat dilimindeki zaman değişimi hakkında bilgi sağlar.
## Ayrıca Bakınız

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
