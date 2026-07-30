---
title: "Aspose::Font::TtfTables::TtfNameTable::UpdateName méthode"
linktitle: "UpdateName"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfNameTable::UpdateName méthode. Met à jour le nom dans les enregistrement(s) qui sont liés à la plateforme spécifiée (combinaison de platformId et platformSpecificId), catégorie (nameId) et langue (languageId) en C++."
type: docs
weight: 1000
url: /fr/cpp/aspose.font.ttftables/ttfnametable/updatename/
---
## TtfNameTable::UpdateName method


Met à jour le nom dans le(s) enregistrement(s) lié(s) à la plateforme spécifiée (combinaison de platformId et platformSpecificId), à la catégorie (nameId) et à la langue (languageId).

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateName(TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId, uint16_t languageId, System::String newName)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| idPlateforme | TtfNameTable::PlatformId | Identifiant de plateforme |
| idSpécifiquePlateforme | uint16_t | Identifiant d'encodage spécifique à la plateforme |
| nameId | TtfNameTable::NameId | Identifiant de nom, catégorie de chaîne logique, spécifiée par l'énumération [NameId](../nameid/) |
| languageId | uint16_t | Identifiant de langue |
| newName | System::String | Nouveau nom ou nouvelles données de chaîne |

## Voir aussi

* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
