---
title: "Aspose::Font::TtfTables::TtfNameTable classe"
linktitle: "TtfNameTable"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfNameTable classe. Représente la table \"name\" du fichier de police TTF en C++."
type: docs
weight: 1300
url: /fr/cpp/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class


Représente la table "name" du fichier [Font](../../aspose.font/font/) TTF.

```cpp
class TtfNameTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [NameRecord](./namerecord/)
## Enums

| Énumération | Description |
| --- | --- |
| [MacLanguageId](./maclanguageid/) | Énumération des identifiants de langue de la plateforme Macintosh. |
| [MacPlatformSpecificId](./macplatformspecificid/) | Représente l'énumération Macintosh PlatformSpecificId. |
| [MSLanguageId](./mslanguageid/) | Énumération des identifiants de langue de la plateforme Microsoft. |
| [MSPlatformSpecificId](./msplatformspecificid/) | Représente l'énumération Microsoft PlatformSpecificId. |
| [NameId](./nameid/) | Représente [NameId](./nameid/). |
| [PlatformId](./platformid/) | Représente l'énumération [PlatformId](./platformid/). |
| [UnicodePlatformSpecificId](./unicodeplatformspecificid/) | Représente l'énumération unicode spécifique à la plateforme. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [AddMultiLanguageNames](./addmultilanguagenames/)(System::SharedPtr\<MultiLanguageString\>, TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Extrait toutes les chaînes multilingues de l'objet *mlNames* passé et crée la structure [NameRecord](./namerecord/) correspondante pour chaque chaîne extraite en utilisant les paramètres passés *platformId*, *platformSpecificId* et *nameId*. La valeur du champ languageID est extraite de l'objet *mlNames*. Le nouvel enregistrement créé est ajouté à la table. Si un enregistrement qui coïncide avec le nouvel enregistrement par les champs platformID, platformSpecificID, nameID et languageId est trouvé, alors le nouvel enregistrement ne sera pas ajouté et seules les données de chaîne seront mises à jour pour l'enregistrement existant. |
| [AddName](./addname/)(TtfNameTable::NameId, TtfNameTable::PlatformId, int32_t, int32_t, System::String) | Ajoute une entrée dans la table. La catégorie de données de chaîne à ajouter est spécifiée par le paramètre *name*. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Supprime tous les enregistrements liés aux paramètres passés. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t) | Supprime tous les enregistrements liés à la plateforme spécifiée. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t) | Supprime le(s) enregistrement(s) lié(s) aux paramètres spécifiés. |
| [DeleteRecordsByNameId](./deleterecordsbynameid/)(TtfNameTable::NameId) | Supprime tous les enregistrements liés au paramètre nameId passé. |
| static [get_Tag](./get_tag/)() | Obtient le tag de la table. |
| [GetAllNameRecords](./getallnamerecords/)() | Renvoie toutes les structures [NameRecord](./namerecord/) de la table. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId) | Renvoie un nom par nameId. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId) | Renvoie un nom par nameId en utilisant l'identifiant de plateforme passé. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId, uint16_t) | Renvoie un nom sous forme d'objet du type [MultiLanguageString](../../aspose.font/multilanguagestring/). La méthode collecte toutes les structures [NameRecord](./namerecord/) qui coïncident avec les paramètres passés nameId, platformId et platformSpecificId, puis construit l'objet résultant à partir de cette liste de structures. |
| [GetNameById](./getnamebyid/)(TtfNameTable::NameId) | Renvoie un nom par nameId s'il est trouvé, sinon null. |
| [GetNameRecordsByNameId](./getnamerecordsbynameid/)(TtfNameTable::NameId) | Renvoie toutes les structures [NameRecord](./namerecord/) dont le champ [NameId](./nameid/) est égal à la valeur *nameId* passée. Si aucun enregistrement n'est trouvé, un tableau vide sera renvoyé. |
| [UpdateName](./updatename/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t, System::String) | Met à jour le nom dans le(s) enregistrement(s) lié(s) à la plateforme spécifiée (combinaison de platformId et platformSpecificId), à la catégorie (nameId) et à la langue (languageId). |
| [UpdateNamesByNameId](./updatenamesbynameid/)(TtfNameTable::NameId, System::String) | Sélectionne tous les enregistrements liés à la catégorie de chaîne logique, spécifiée par le paramètre nameId, et met à jour le champ name (données de chaîne) dans ces enregistrements. Les champs liés à la plateforme (platformID, ID d’encodage spécifique à la plateforme) et à la langue (Language ID) ne sont pas affectés par cette méthode. Seules les données de chaîne du nom sont remplacées par un nouveau nom. Utilisez cette méthode avec prudence, car elle remplacera les noms originaux pour toutes les plateformes et langues liées à nameId. Elle peut créer des conflits dans les cas où les noms originaux avaient des valeurs différentes, car l’opération de remplacement change toutes ces valeurs par une seule nouvelle. Et cette nouvelle valeur peut présenter une incohérence logique avec certaines plateformes et langues. Cette méthode est utile dans les cas où le nom original a une représentation unique pour toutes les plateformes et langues, par exemple lorsque les données de chaîne du nom sont en anglais. |
## Voir aussi

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
