---
title: "Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById метод"
linktitle: "GetMultiLanguageNameById"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById метод. Возвращает имя по nameId в C++."
type: docs
weight: 700
url: /ru/cpp/aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/
---
## TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId) method


Возвращает имя по nameId.

```cpp
System::SharedPtr<MultiLanguageString> Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId nameId)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Идентификатор имени. |

### ReturnValue

Имя.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
## TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId, TtfNameTable::PlatformId) method


Возвращает имя по nameId, используя переданный идентификатор платформы.

```cpp
System::SharedPtr<MultiLanguageString> Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Идентификатор имени. |
| platformId | TtfNameTable::PlatformId | Идентификатор платформы. |

### ReturnValue

Имя.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
## TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId, TtfNameTable::PlatformId, uint16_t) method


Возвращает имя в виде объекта типа [MultiLanguageString](../../../aspose.font/multilanguagestring/). Метод собирает все структуры [NameRecord](../namerecord/), которые совпадают с переданными параметрами nameId, platformId и platformSpecificId, а затем создает результирующий объект на основе этого списка структур.

```cpp
System::SharedPtr<MultiLanguageString> Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId, uint16_t platformSpecificId)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Идентификатор имени. |
| platformId | TtfNameTable::PlatformId | Идентификатор платформы. |
| platformSpecificId | uint16_t | Идентификатор, специфичный для платформы. |

### ReturnValue

Имя.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
