---
title: "Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId méthode"
linktitle: "UpdateNamesByNameId"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId method. Sélectionne tous les enregistrements liés à la catégorie de chaîne logique, spécifiée par le paramètre nameId, et met à jour le champ name (données de chaîne) dans ces enregistrements. Les champs liés à la plateforme (platformID, Platform-specific encoding ID) et à la langue (Language ID) ne sont pas affectés par cette méthode. Seules les données de chaîne du nom sont remplacées par un nouveau nom. Utilisez cette méthode avec prudence, car elle remplacera les noms originaux pour toutes les plateformes et langues liées à nameId. Elle peut créer des conflits dans les cas où les noms originaux avaient des valeurs différentes, car l'opération de remplacement change toutes ces valeurs en une seule nouvelle. Et cette nouvelle valeur peut présenter une incohérence logique avec certaines plateformes et langues. Cette méthode est utile dans les cas où le nom original a une représentation unique pour toutes les plateformes et langues, par exemple lorsque les données de chaîne du nom sont en anglais dans C++."
type: docs
weight: 1100
url: /fr/cpp/aspose.font.ttftables/ttfnametable/updatenamesbynameid/
---
## TtfNameTable::UpdateNamesByNameId method


Sélectionne tous les enregistrements liés à la catégorie de chaîne logique, spécifiée par le paramètre nameId, et met à jour le champ name (données de chaîne) dans ces enregistrements. Les champs liés à la plateforme (platformID, ID d’encodage spécifique à la plateforme) et à la langue (Language ID) ne sont pas affectés par cette méthode. Seules les données de chaîne du nom sont remplacées par un nouveau nom. Utilisez cette méthode avec prudence, car elle remplacera les noms originaux pour toutes les plateformes et langues liées à nameId. Elle peut créer des conflits dans les cas où les noms originaux avaient des valeurs différentes, car l’opération de remplacement change toutes ces valeurs par une seule nouvelle. Et cette nouvelle valeur peut présenter une incohérence logique avec certaines plateformes et langues. Cette méthode est utile dans les cas où le nom original a une représentation unique pour toutes les plateformes et langues, par exemple lorsque les données de chaîne du nom sont en anglais.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId(TtfNameTable::NameId nameId, System::String newName)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Identifiant de nom, catégorie de chaîne logique, spécifiée par l'énumération [NameId](../nameid/) |
| newName | System::String | Nouveau nom ou nouvelles données de chaîne |

## Voir aussi

* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
