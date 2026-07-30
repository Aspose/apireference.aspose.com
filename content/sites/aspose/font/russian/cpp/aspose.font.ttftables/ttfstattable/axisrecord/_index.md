---
title: "Aspose::Font::TtfTables::TtfStatTable::AxisRecord класс"
linktitle: "AxisRecord"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfStatTable::AxisRecord класс. Представляет структуру Axis Record. Спецификация: запись оси предоставляет информацию об одной оси дизайна в C++."
type: docs
weight: 1300
url: /ru/cpp/aspose.font.ttftables/ttfstattable/axisrecord/
---
## AxisRecord class


Представляет структуру Axis Record. Спецификация: запись оси предоставляет информацию об одной оси дизайна.

```cpp
class AxisRecord : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [AxisRecord](./axisrecord/)(System::String, uint16_t, uint16_t) | Конструктор. |
| [get_AxisNameId](./get_axisnameid/)() const | Возвращает поле axisNameID. Спецификация: Поле axisNameID предоставляет идентификатор имени, который можно использовать для получения строк из таблицы 'name', которые могут использоваться для ссылки на ось в пользовательском интерфейсе приложения. |
| [get_AxisOrdering](./get_axisordering/)() const | Возвращает поле axisOrdering. Спецификация: Значение, которое приложения могут использовать для определения первичной сортировки названий гарнитур, либо для упорядочения меток при составлении названий семейства или гарнитуры. |
| [get_Tag](./get_tag/)() const | Возвращает тег, идентифицирующий ось вариации дизайна. Спецификация: Каждая запись оси имеет тег, обозначающий ось. Значения тегов должны соответствовать правилам тегов осей, описанным в реестре тегов осей вариаций OpenType Design-Variation. |
## См. также

* Class [Object](../../../system/object/)
* Class [TtfStatTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
