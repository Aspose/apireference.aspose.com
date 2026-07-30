---
title: "Aspose::Font::TtfTables::TtfStatTable класс"
linktitle: "TtfStatTable"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfStatTable класс. Представляет таблицу атрибутов стиля (STAT) шрифта OpenType в C++."
type: docs
weight: 1700
url: /ru/cpp/aspose.font.ttftables/ttfstattable/
---
## TtfStatTable class


Представляет таблицу атрибутов стиля (STAT) шрифта OpenType.

```cpp
class TtfStatTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [AxisRecord](./axisrecord/)
* Class [AxisValue](./axisvalue/)
* Class [AxisValueTableBase](./axisvaluetablebase/)
* Class [AxisValueTableFormat1](./axisvaluetableformat1/)
* Class [AxisValueTableFormat2](./axisvaluetableformat2/)
* Class [AxisValueTableFormat3](./axisvaluetableformat3/)
* Class [AxisValueTableFormat4](./axisvaluetableformat4/)
## Enums

| Перечисление | Описание |
| --- | --- |
| [AxisValueTableFlags](./axisvaluetableflags/) | Указывает флаги таблицы значений осей. |
## Методы

| Метод | Описание |
| --- | --- |
| [AddAxisRecord](./addaxisrecord/)(System::SharedPtr\<TtfStatTable::AxisRecord\>) | Добавляет структуру Axis Record в таблицу. |
| [AddAxisValueTable](./addaxisvaluetable/)(System::SharedPtr\<TtfStatTable::AxisValueTableBase\>) | Добавляет структуру Axis Value Table в таблицу. |
| [ClearAxisRecords](./clearaxisrecords/)() | Удаляет все записи осей из таблицы. |
| [ClearAxisValueTables](./clearaxisvaluetables/)() | Удаляет все таблицы значений осей из таблицы. |
| [get_AxisRecords](./get_axisrecords/)() | Возвращает массив осей дизайна. Массив осей — это массив структур типа Axis Record. Спецификация: запись оси предоставляет информацию об одной оси дизайна. |
| [get_AxisValueCount](./get_axisvaluecount/)() | Возвращает количество таблиц значений осей. |
| [get_AxisValueTables](./get_axisvaluetables/)() | Возвращает массив таблиц Axis Value Tables. Спецификация: таблицы Axis Value Tables предоставляют детали конкретного значения атрибута стиля на определённой оси вариации дизайна, либо комбинацию значений осей вариации дизайна, а также связь этих значений с метками, используемыми в качестве элементов в названиях подсемейств. |
| [get_DesignAxisCount](./get_designaxiscount/)() | Возвращает количество записей осей. Спецификация: в шрифте с таблицей 'fvar' это значение должно быть больше или равно значению axisCount в таблице 'fvar'. Во всех шрифтах оно должно быть больше нуля, если axisValueCount больше нуля. |
| [get_ElidedFallbackName](./get_elidedfallbackname/)() | Спецификация: имя, используемое как резервное, когда проекция имён в конкретную модель шрифта приводит к названию подсемейства, содержащему только удаляемые элементы. |
| [get_ElidedFallbackNameId](./get_elidedfallbacknameid/)() | Спецификация: идентификатор имени, используемый как резервный, когда проекция имён в конкретную модель шрифта приводит к названию подсемейства, содержащему только удаляемые элементы. |
| static [get_Tag](./get_tag/)() | Получает тег таблицы. |
## См. также

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
