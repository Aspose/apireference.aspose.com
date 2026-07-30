---
title: "Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById méthode"
linktitle: "GetMultiLanguageNameById"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById method. Retourne un nom par nameId en C++."
type: docs
weight: 700
url: /fr/cpp/aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/
---
## TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId) method


Renvoie un nom par nameId.

```cpp
System::SharedPtr<MultiLanguageString> Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId nameId)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Identifiant de nom. |

### ReturnValue

Nom.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
## TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId, TtfNameTable::PlatformId) method


Renvoie un nom par nameId en utilisant l'identifiant de plateforme passé.

```cpp
System::SharedPtr<MultiLanguageString> Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Identifiant de nom. |
| idPlateforme | TtfNameTable::PlatformId | Identifiant de la plateforme. |

### ReturnValue

Nom.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
## TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId, TtfNameTable::PlatformId, uint16_t) method


Retourne un nom sous forme d'objet du type [MultiLanguageString](../../../aspose.font/multilanguagestring/). La méthode collecte toutes les structures [NameRecord](../namerecord/) qui coïncident avec les paramètres transmis nameId, platformId et platformSpecificId, puis construit l'objet résultant à partir de cette liste de structures.

```cpp
System::SharedPtr<MultiLanguageString> Aspose::Font::TtfTables::TtfNameTable::GetMultiLanguageNameById(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId, uint16_t platformSpecificId)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Identifiant de nom. |
| idPlateforme | TtfNameTable::PlatformId | Identifiant de la plateforme. |
| idSpécifiquePlateforme | uint16_t | Identifiant spécifique à la plateforme. |

### ReturnValue

Nom.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
