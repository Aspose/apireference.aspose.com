---
title: "Aspose::Font::TtfTables::TtfStatTable::AxisValueTableFlags enum"
linktitle: "AxisValueTableFlags"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfStatTable::AxisValueTableFlags enum. Указывает флаги таблицы значений осей в C++."
type: docs
weight: 1200
url: /ru/cpp/aspose.font.ttftables/ttfstattable/axisvaluetableflags/
---
## AxisValueTableFlags enum


Указывает флаги таблицы значений осей.

```cpp
enum class AxisValueTableFlags : uint16_t
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| OlderSiblingFontAttribute | n/a | Если установлено, эта таблица значений оси предоставляет информацию о значениях оси, применимую к другим шрифтам в той же семье шрифтов. Это используется, если другие шрифты были выпущены ранее и не включали информацию о значениях для некоторых осей. Если более новые версии других шрифтов включают эту информацию сами и присутствуют, то эта таблица игнорируется. |
| ElidableAxisValueName | n/a | Если установлено, это указывает, что значение оси представляет «нормальное» значение для оси и может быть опущено при составлении строк названий. |
| Зарезервировано | n/a | Зарезервировано для будущего использования. |

## См. также

* Class [TtfStatTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
