---
title: "System::Globalization::DateTimeStyles перечисление"
linktitle: "DateTimeStyles"
second_title: "Aspose.Font для C++"
description: "System::Globalization::DateTimeStyles перечисление. Определяет параметры форматирования даты и времени. Битовые флаги в C++."
type: docs
weight: 3500
url: /ru/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


Определяет параметры форматирования даты и времени. Битовые флаги.

```cpp
enum class DateTimeStyles : int32_t
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Нет | 0 | По умолчанию. |
| AllowLeadingWhite | 1 | Игнорировать начальные пробелы. |
| AllowTrailingWhite | 2 | Игнорировать конечные пробелы. |
| AllowInnerWhite | 4 | Игнорировать внутренние пробелы. |
| AllowWhiteSpaces | n/a | Игнорировать все пробелы. |
| NoCurrentDateDefault | 8 | При разборе строки даты/времени, если отсутствуют год, месяц и день, установить дату по умолчанию 0001/1/1, вместо текущих года/месяца/дня. |
| AdjustToUniversal | 16 | При разборе строки даты/времени, если присутствует указатель часового пояса ("GMT","Z","+xxxx", "-xxxx"), мы скорректируем разобранное время относительно GMT. |
| AssumeLocal | 32 | Если часовой пояс не указан, используйте локальный часовой пояс. |
| AssumeUniversal | 64 | Если часовой пояс не указан, используйте UTC. |
| RoundtripKind | 128 | Попытка сохранить информацию о том, является ли ввод неопределённым, локальным или UTC. |

## См. также

* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
