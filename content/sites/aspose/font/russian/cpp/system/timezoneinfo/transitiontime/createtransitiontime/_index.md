---
title: "Метод System::TimeZoneInfo::TransitionTime::CreateTransitionTime"
linktitle: "CreateTransitionTime"
second_title: "Aspose.Font для C++"
description: "Метод System::TimeZoneInfo::TransitionTime::CreateTransitionTime. Создаёт экземпляр класса TransitionTime, представляющий изменение времени, описанное заданными параметрами, в C++."
type: docs
weight: 1200
url: /ru/cpp/system/timezoneinfo/transitiontime/createtransitiontime/
---
## TransitionTime::CreateTransitionTime method


Создаёт экземпляр класса [TransitionTime](../), представляющего изменение времени, описанное заданными параметрами.

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateTransitionTime(DateTime time_of_day, int month, int week, int day, DayOfWeek day_of_week, bool is_fixed_date_rule)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| time_of_day | DateTime | Конкретное время, в которое происходит изменение времени. |
| месяц | int | Месяц года, в который происходит изменение времени. |
| week | int | Неделя месяца, в которую происходит изменение времени. |
| день | int | День, в который происходит изменение времени. |
| day_of_week | DayOfWeek | День недели, в который происходит изменение времени. |
| is_fixed_date_rule | bool | Значение, указывающее, происходит ли изменение времени фиксированной даты и времени или плавающей даты и времени. |

### ReturnValue

Экземпляр класса [TransitionTime](../), представляющий описанное изменение времени.

## См. также

* Class [TransitionTime](../)
* Class [DateTime](../../../datetime/)
* Enum [DayOfWeek](../../../dayofweek/)
* Class [TransitionTime](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
