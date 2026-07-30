---
title: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames méthode"
linktitle: "AddMultiLanguageNames"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames method. Extrait toutes les chaînes multilingues de l'objet mlNames passé et crée une structure NameRecord correspondante pour chaque chaîne extraite en utilisant les paramètres passés platformId, platformSpecificId et nameId. La valeur du champ languageID est extraite de l'objet mlNames. Le nouvel enregistrement créé est ajouté à la table. Si un enregistrement qui coïncide avec le nouvel enregistrement par les champs platformID, platformSpecificID, nameID et languageId est trouvé, alors le nouvel enregistrement ne sera pas ajouté et seules les données de chaîne seront mises à jour pour l'enregistrement existant en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.ttftables/ttfnametable/addmultilanguagenames/
---
## TtfNameTable::AddMultiLanguageNames method


Extrait toutes les chaînes multilingues de l'objet *mlNames* passé et crée une structure [NameRecord](../namerecord/) correspondante pour chaque chaîne extraite en utilisant les paramètres passés *platformId*, *platformSpecificId* et *nameId*. La valeur du champ languageID est extraite de l'objet *mlNames*. Le nouvel enregistrement créé est ajouté à la table. Si un enregistrement qui coïncide avec le nouvel enregistrement par les champs platformID, platformSpecificID, nameID et languageId est trouvé, alors le nouvel enregistrement ne sera pas ajouté et seules les données de chaîne seront mises à jour pour l'enregistrement existant.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames(System::SharedPtr<MultiLanguageString> mlNames, TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| mlNames | System::SharedPtr\<MultiLanguageString\> | Chaîne multilingue |
| idPlateforme | TtfNameTable::PlatformId | Identifiant de plateforme |
| idSpécifiquePlateforme | uint16_t | Identifiant d'encodage spécifique à la plateforme |
| nameId | TtfNameTable::NameId | Identifiant de nom, catégorie de chaîne logique, spécifiée par l'énumération [NameId](../nameid/) |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
