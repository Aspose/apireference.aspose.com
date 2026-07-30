---
title: "System::TimeZoneInfo::TransitionTime класс"
linktitle: "TransitionTime"
second_title: "Aspose.Font для C++"
description: "System::TimeZoneInfo::TransitionTime класс. Информация RTTI в C++."
type: docs
weight: 3400
url: /ru/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


Информация RTTI.

```cpp
class TransitionTime
```

## Методы

| Метод | Описание |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | Создаёт экземпляр класса [TransitionTime](./), представляющего правило фиксированной даты (изменение времени, происходящее в определённый день конкретного месяца). |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | Создаёт экземпляр класса [TransitionTime](./), представляющего правило плавающей даты (изменение времени, происходящее в определённый день конкретной недели конкретного месяца). |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | Создаёт экземпляр класса [TransitionTime](./), представляющего изменение времени, описанное заданными параметрами. |
| [get_Day](./get_day/)() const | Возвращает порядковый номер дня недели, в который происходит изменение времени. |
| [get_DayOfWeek](./get_dayofweek/)() const | Возвращает значение, представляющее день недели, в который происходит изменение времени. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | Возвращает значение, указывающее, происходит ли изменение времени в фиксированную дату и время или в плавающую дату и время. |
| [get_Month](./get_month/)() const | Возвращает порядковый номер месяца года, в который происходит изменение времени. |
| [get_TimeOfDay](./get_timeofday/)() const | Возвращает объект [DateTime](../../datetime/), представляющий конкретное время, в которое происходит изменение времени. |
| [get_Week](./get_week/)() const | Возвращает порядковый номер недели месяца, в которую происходит изменение времени. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | Конструктор по умолчанию. ДЛЯ ВНУТРЕННЕГО ИСПОЛЬЗОВАНИЯ. |
## Примечания


Предоставляет информацию об изменении времени в часовом поясе.
## См. также

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
