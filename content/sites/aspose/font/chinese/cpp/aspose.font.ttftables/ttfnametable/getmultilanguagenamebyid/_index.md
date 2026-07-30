---
title: "Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById 方法"
linktitle: "GetMultiLanguageNameById"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById 方法。返回 C++ 中通过 nameId 获取的名称。"
type: docs
weight: 700
url: /zh/cpp/aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/
---
## TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId) method


根据 nameId 返回名称。

```cpp
System::SharedPtr<MultiLanguageString> Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId nameId)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | 名称 Id。 |

### ReturnValue

名称。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
## TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId, TtfNameTable::PlatformId) method


使用传入的平台标识符，根据 nameId 返回名称。

```cpp
System::SharedPtr<MultiLanguageString> Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | 名称 Id。 |
| platformId | TtfNameTable::PlatformId | 平台 ID。 |

### ReturnValue

名称。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
## TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId, TtfNameTable::PlatformId, uint16_t) method


返回一个类型为 [MultiLanguageString](../../../aspose.font/multilanguagestring/) 的名称对象。方法收集所有与传入参数 nameId、platformId 和 platformSpecificId 相匹配的 [NameRecord](../namerecord/) 结构，然后基于这些结构列表构建结果对象。

```cpp
System::SharedPtr<MultiLanguageString> Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId, uint16_t platformSpecificId)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | 名称 Id。 |
| platformId | TtfNameTable::PlatformId | 平台 ID。 |
| platformSpecificId | uint16_t | 平台特定 Id。 |

### ReturnValue

名称。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
