---
title: "Aspose::Font::TtfTables::TtfNameTable::GetNameRecordsByNameId метод"
linktitle: "GetNameRecordsByNameId"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfNameTable::GetNameRecordsByNameId метод. Возвращает все структуры NameRecord, у которых поле NameId равно переданному значению nameId. Если записи не найдены, будет возвращён пустой массив в C++."
type: docs
weight: 900
url: /ru/cpp/aspose.font.ttftables/ttfnametable/getnamerecordsbynameid/
---
## TtfNameTable::GetNameRecordsByNameId method


Возвращает все структуры [NameRecord](../namerecord/) , у которых поле [NameId](../nameid/) равно переданному *nameId* значению. Если записи не найдены, будет возвращён пустой массив.

```cpp
System::ArrayPtr<System::SharedPtr<TtfNameTable::NameRecord>> Aspose::Font::TtfTables::TtfNameTable::GetNameRecordsByNameId(TtfNameTable::NameId nameId)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | идентификатор имени |

### ReturnValue

Массив структур [NameRecord](../namerecord/)

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameRecord](../namerecord/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
