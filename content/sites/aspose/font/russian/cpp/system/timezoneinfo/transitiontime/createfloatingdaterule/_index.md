---
title: "System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule метод"
linktitle: "CreateFloatingDateRule"
second_title: "Aspose.Font для C++"
description: "Метод System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule. Создаёт экземпляр класса TransitionTime, представляющий правило плавающей даты (изменение времени, происходящее в определённый день определённой недели определённого месяца) в C++."
type: docs
weight: 1100
url: /ru/cpp/system/timezoneinfo/transitiontime/createfloatingdaterule/
---
## TransitionTime::CreateFloatingDateRule method


Создаёт экземпляр класса [TransitionTime](../), представляющий правило плавающей даты (изменение времени, происходящее в определённый день определённой недели определённого месяца).

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule(DateTime time_of_day, int month, int week, DayOfWeek day_of_week)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| time_of_day | DateTime | Конкретное время, в которое происходит изменение времени. |
| месяц | int | Месяц года, в который происходит изменение времени. |
| week | int | Неделя месяца, в которую происходит изменение времени. |
| day_of_week | DayOfWeek | День недели, в который происходит изменение времени. |

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
