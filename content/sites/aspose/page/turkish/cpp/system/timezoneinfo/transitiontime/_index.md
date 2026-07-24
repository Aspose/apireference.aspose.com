---
title: "System::TimeZoneInfo::TransitionTime sınıfı"
linktitle: "TransitionTime"
second_title: "Aspose.Page için C++"
description: "System::TimeZoneInfo::TransitionTime sınıfı. C++'ta RTTI bilgisi."
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
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | [TransitionTime](./) sınıfının sabit tarih kuralını (belirli bir ayın belirli bir gününde gerçekleşen zaman değişikliği) temsil eden bir örneğini oluşturur. |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | [TransitionTime](./) sınıfının kayan tarih kuralını (belirli bir ayın belirli bir haftasının belirli bir gününde gerçekleşen zaman değişikliği) temsil eden bir örneğini oluşturur. |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | [TransitionTime](./) sınıfının belirtilen parametrelerle tanımlanan bir zaman değişikliğini temsil eden bir örneğini oluşturur. |
| [get_Day](./get_day/)() const | Zaman değişikliğinin gerçekleştiği haftanın gününün sıra numarasını döndürür. |
| [get_DayOfWeek](./get_dayofweek/)() const | Zaman değişikliğinin gerçekleştiği haftanın gününü temsil eden değeri döndürür. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | Zaman değişikliğinin sabit bir tarih ve saatte mi yoksa kayan bir tarih ve saatte mi gerçekleştiğini gösteren değeri döndürür. |
| [get_Month](./get_month/)() const | Zaman değişikliğinin gerçekleştiği yılın ayının sıra numarasını döndürür. |
| [get_TimeOfDay](./get_timeofday/)() const | Zaman değişikliğinin gerçekleştiği belirli zamanı temsil eden bir [DateTime](../../datetime/) nesnesi döndürür. |
| [get_Week](./get_week/)() const | Zaman değişikliğinin gerçekleştiği ayın haftasının sıra numarasını döndürür. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | Varsayılan kurucu. DAHİLİ KULLANIM İÇİN. |
## Açıklamalar


Bir zaman dilimindeki zaman değişikliği hakkında bilgi sağlar.
## Ayrıca Bakınız

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
