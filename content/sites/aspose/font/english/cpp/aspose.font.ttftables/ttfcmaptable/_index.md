---
title: Aspose::Font::TtfTables::TtfCMapTable class
linktitle: TtfCMapTable
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfCMapTable class. Represents "cmap" table of the TTF Font file in C++.'
type: docs
weight: 200
url: /cpp/aspose.font.ttftables/ttfcmaptable/
---
## TtfCMapTable class


Represents "cmap" table of the TTF [Font](../../aspose.font/font/) file.

```cpp
class TtfCMapTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [TtfCMapSubtableDescription](./ttfcmapsubtabledescription/)
## Methods

| Method | Description |
| --- | --- |
| [FindUnicodeTable](./findunicodetable/)() | Searches and returns unicode CMap. if there is ucs-4 CMap - returns it first; otherwise - returns any unicode cmap it can find. |
| static [get_Tag](./get_tag/)() | Gets table tag. |
| [GetAllSubtables](./getallsubtables/)() | Returns all the subtables from CMap table. |
| [GetPlatformTables](./getplatformtables/)(uint16_t, uint16_t) | Returns CMap subtables for planformId and platformSpecificId. |
## See Also

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
