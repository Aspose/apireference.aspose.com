---
title: "System::Globalization::CompareOptions enum"
linktitle: "CompareOptions"
second_title: "Aspose.Font для C++"
description: "System::Globalization::CompareOptions enum. Параметры сравнения строк в C++."
type: docs
weight: 3300
url: /ru/cpp/system.globalization/compareoptions/
---
## CompareOptions enum


[String](../../system/string/) comparison options.

```cpp
enum class CompareOptions : int32_t
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Нет | 0 | Нет специальных параметров. |
| IgnoreCase | 1 | Игнорировать регистр. |
| IgnoreNonSpace | 2 | Игнорировать несочетающие объединяющие символы, например диакритические знаки. |
| IgnoreSymbols | 4 | Включать пробелы, знаки пунктуации и т.д. |
| IgnoreKanaType | 8 | Игнорировать тип каны (японский). |
| IgnoreWidth | 16 | Игнорировать ширину символов при сравнении строк. |
| OrdinalIgnoreCase | 268435456 | Порядковое сравнение с игнорированием различий регистра. |
| StringSort | 536870912 | Использовать алгоритм сортировки строк для сравнения символов. |
| Ordinal | 1073741824 | Сравнивать коды UTF напрямую при первом сравнении. |

## См. также

* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
