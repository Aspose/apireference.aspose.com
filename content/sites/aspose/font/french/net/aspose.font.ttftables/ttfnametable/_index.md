---
title: TtfNameTable
second_title: Référence de l'API Aspose.Font pour .NET
description: Représente la table nom du fichier de police TTF.
type: docs
weight: 900
url: /fr/net/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class

Représente la table "nom" du fichier de police TTF.

```csharp
public class TtfNameTable : TtfTableBase
```

## Propriétés

| Nom | La description |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset) { get; } | Obtient le décalage depuis le début de sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables) { get; } | Référence au référentiel de tables TTF. |
| static [Tag](../../aspose.font.ttftables/ttfnametable/tag) { get; } | Obtient la balise de table. |

## Méthodes

| Nom | La description |
| --- | --- |
| [AddMultiLanguageNames](../../aspose.font.ttftables/ttfnametable/addmultilanguagenames)(MultiLanguageString, PlatformId, ushort, NameId) | Extrait toutes les chaînes multilingues du passé*mlNames* l'objet and crée la structure NameRecord correspondante pour chaque chaîne extraite à l'aide des paramètres passés*platformId* ,*platformSpecificId* et*nameId* . La valeur du champ languageID est extraite de*mlNames* objet. Le nouvel enregistrement qui vient d'être créé est ajouté à la table. Si un enregistrement qui coïncide avec celui qui vient d'être créé par les champs platformID, platformSpecificID, nameID et langugeId est trouvé, le nouvel enregistrement créé ne sera pas ajouté et seules les données de chaîne seront mises à jour pour l'enregistrement existant. |
| [AddName](../../aspose.font.ttftables/ttfnametable/addname)(NameId, PlatformId, int, int, string) | Ajoute une entrée dans la table. La catégorie de données de chaîne à ajouter est spécifiée par*name* paramètre. |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords)(PlatformId, ushort) | Supprime tous les enregistrements liés à la plate-forme spécifiée |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_1)(PlatformId, ushort, NameId) | Supprime tous les enregistrements liés aux paramètres passés |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_2)(PlatformId, ushort, NameId, ushort) | Supprime le ou les enregistrements liés aux paramètres spécifiés |
| [DeleteRecordsByNameId](../../aspose.font.ttftables/ttfnametable/deleterecordsbynameid)(NameId) | Supprime tous les enregistrements liés au paramètre nameId passé |
| [GetAllNameRecords](../../aspose.font.ttftables/ttfnametable/getallnamerecords)() | Renvoie tout[`NameRecord`](../ttfnametable.namerecord) structures de table |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid)(NameId) | Renvoie un nom par nameId. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_1)(NameId, PlatformId) | Renvoie un nom par nameId en utilisant l'identifiant de plate-forme passé. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_2)(NameId, PlatformId, ushort) | Renvoie un nom en tant qu'objet de type[`MultiLanguageString`](../../aspose.font/multilanguagestring) . La méthode collecte toutes les structures NameRecord qui coïncident avec les paramètres passés nameId, platformId et platformSpecificId, puis construit l'objet résultant basé sur cette liste de structures. |
| [GetNameById](../../aspose.font.ttftables/ttfnametable/getnamebyid)(NameId) | Renvoie un nom par nameId si trouvé, null sinon |
| [GetNameRecordsByNameId](../../aspose.font.ttftables/ttfnametable/getnamerecordsbynameid)(NameId) | Renvoie tout[`NameRecord`](../ttfnametable.namerecord) structures dont le champ NameId est égal à passé*nameId* évaluer. Si aucun enregistrement n'est trouvé, un tableau vide sera renvoyé. |
| [UpdateName](../../aspose.font.ttftables/ttfnametable/updatename)(PlatformId, ushort, NameId, ushort, string) | Met à jour le nom dans les enregistrements liés à la plate-forme spécifiée (combinaison de platformId et platformSpecificId), catégorie (nameId) et langue (languageId). |
| [UpdateNamesByNameId](../../aspose.font.ttftables/ttfnametable/updatenamesbynameid)(NameId, string) | Sélectionne tous les enregistrements liés à la catégorie de chaîne logique, spécifiée par le paramètre nameId et met à jour le champ de nom (données de chaîne) dans ces enregistrements. Les champs liés à la plate-forme (platformID, Platform-specific encoding ID) et à la langue (Language ID) ne sont pas affectés par cette méthode. Seules les données de chaîne de nom sont remplacées par un nouveau nom. Utilisez cette méthode avec prudence, car elle remplacera les noms d'origine pour toutes les plates-formes et langues, liées à nameId. Cela peut créer des conflits dans les cas où les noms d'origine avaient des valeurs différentes, car l'opération de remplacement modifie toutes ces valeurs par une nouvelle unique. Et cette nouvelle valeur peut avoir une incohérence logique avec certaines plates-formes et certaines langues. Cette méthode est utile dans les cas où le nom d'origine a une représentation unique pour toutes les plates-formes et langues, par exemple, lorsque les données de chaîne de nom sont en anglais. |

## Autres membres

| Nom | La description |
| --- | --- |
| enum [MacLanguageId](ttfnametable.maclanguageid) | Énumération de l'ID de langue de la plate-forme Macintosh. |
| enum [MacPlatformSpecificId](ttfnametable.macplatformspecificid) | Représente l'énumération PlatformSpecificId de la plate-forme Macintosh. |
| enum [MSLanguageId](ttfnametable.mslanguageid) | Énumération de l'ID de langue de la plate-forme Microsoft. |
| enum [MSPlatformSpecificId](ttfnametable.msplatformspecificid) | Représente l'énumération PlatformSpecificId de la plate-forme Microsoft. |
| enum [NameId](ttfnametable.nameid) | Représente NameId. |
| class [NameRecord](ttfnametable.namerecord) | Représente la structure NameRecord de la table 'name' |
| enum [PlatformId](ttfnametable.platformid) | Représente l'énumération PlatformId. |
| enum [UnicodePlatformSpecificId](ttfnametable.unicodeplatformspecificid) | Représente l'énumération spécifique à la plate-forme Unicode. |

### Voir également

* class [TtfTableBase](../ttftablebase)
* espace de noms [Aspose.Font.TtfTables](../../aspose.font.ttftables)
* Assemblée [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
