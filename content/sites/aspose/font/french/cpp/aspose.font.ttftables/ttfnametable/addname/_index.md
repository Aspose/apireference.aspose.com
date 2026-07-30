---
title: "Aspose::Font::TtfTables::TtfNameTable::AddName méthode"
linktitle: "AddName"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfNameTable::AddName méthode. Ajoute une entrée dans la table. La catégorie de données de chaîne à ajouter est spécifiée par le paramètre name en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.font.ttftables/ttfnametable/addname/
---
## TtfNameTable::AddName method


Ajoute une entrée dans la table. La catégorie de données de chaîne à ajouter est spécifiée par le paramètre *name*.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddName(TtfNameTable::NameId nameId, TtfNameTable::PlatformId platformId, int32_t platformSpecificId, int32_t languageId, System::String name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Identifiant de nom, catégorie de chaîne logique, spécifiée par l'énumération [NameId](../nameid/) |
| idPlateforme | TtfNameTable::PlatformId | Identifiant de plateforme |
| platformSpecificId | int32_t | Identifiant d'encodage spécifique à la plateforme. Veuillez utiliser une valeur provenant de l'une de ces énumérations - [UnicodePlatformSpecificId](../unicodeplatformspecificid/), [MacPlatformSpecificId](../macplatformspecificid/), [MSPlatformSpecificId](../msplatformspecificid/). L'énumération à utiliser est définie par le contexte (paramètre *platformId*). |
| languageId | int32_t | Identifiant de langue. Veuillez utiliser une valeur provenant des énumérations [MSLanguageId](../mslanguageid/) ou [MacLanguageId](../maclanguageid/) selon le contexte, défini par le paramètre *platformId*. |
| nom | System::String | Données de chaîne réelles |

## Voir aussi

* Enum [NameId](../nameid/)
* Enum [PlatformId](../platformid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
