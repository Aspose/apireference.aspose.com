---
title: TtfNameTable
second_title: Aspose.Font für .NET-API-Referenz
description: Repräsentiert die NameTabelle der TTFSchriftartdatei.
type: docs
weight: 900
url: /de/net/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class

Repräsentiert die „Name“-Tabelle der TTF-Schriftartdatei.

```csharp
public class TtfNameTable : TtfTableBase
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset) { get; } | Ruft Offset vom Anfang von sfnt. ab |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables) { get; } | Verweis auf TTF-Tabellen-Repository. |
| static [Tag](../../aspose.font.ttftables/ttfnametable/tag) { get; } | Ruft Tabellen-Tag ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AddMultiLanguageNames](../../aspose.font.ttftables/ttfnametable/addmultilanguagenames)(MultiLanguageString, PlatformId, ushort, NameId) | Extrahiert alle mehrsprachigen Zeichenfolgen aus übergeben*mlNames* Das Objekt and erstellt eine entsprechende NameRecord-Struktur für jede Zeichenfolge, die mithilfe der übergebenen -Parameter extrahiert wird*platformId* ,*platformSpecificId* und*nameId* . Wert für Feld languageID wird extrahiert aus*mlNames* Objekt. Der neu erstellte Datensatz wird der Tabelle hinzugefügt. Wenn ein Datensatz gefunden wird, der mit den gerade erstellten Feldern platformID, platformSpecificID, nameID und sprachId übereinstimmt, wird der neu erstellte Datensatz nicht hinzugefügt und nur die Zeichenfolgedaten für den vorhandenen Datensatz aktualisiert. |
| [AddName](../../aspose.font.ttftables/ttfnametable/addname)(NameId, PlatformId, int, int, string) | Fügt Eintrag in die Tabelle hinzu. Die hinzuzufügende String-Datenkategorie wird angegeben durch*name* parameter. |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords)(PlatformId, ushort) | Löscht alle Datensätze, die sich auf die angegebene Plattform beziehen |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_1)(PlatformId, ushort, NameId) | Löscht alle Datensätze, die sich auf übergebene Parameter beziehen |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_2)(PlatformId, ushort, NameId, ushort) | Löscht Datensätze zu angegebenen Parametern |
| [DeleteRecordsByNameId](../../aspose.font.ttftables/ttfnametable/deleterecordsbynameid)(NameId) | Löscht alle Datensätze, die sich auf den übergebenen nameId-Parameter beziehen |
| [GetAllNameRecords](../../aspose.font.ttftables/ttfnametable/getallnamerecords)() | Gibt alle zurück[`NameRecord`](../ttfnametable.namerecord) Strukturen aus table |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid)(NameId) | Gibt einen Namen nach nameId zurück. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_1)(NameId, PlatformId) | Gibt einen Namen nach nameId unter Verwendung der übergebenen Plattformkennung zurück. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_2)(NameId, PlatformId, ushort) | Gibt einen Namen als Objekt vom Typ zurück[`MultiLanguageString`](../../aspose.font/multilanguagestring) . Die Methode sammelt alle NameRecord-Strukturen, die mit den übergebenen Parametern nameId, platformId und platformSpecificId übereinstimmen, und erstellt dann das resultierende Objekt basierend auf dieser Strukturliste. |
| [GetNameById](../../aspose.font.ttftables/ttfnametable/getnamebyid)(NameId) | Gibt einen Namen nach nameId zurück, falls gefunden, ansonsten null |
| [GetNameRecordsByNameId](../../aspose.font.ttftables/ttfnametable/getnamerecordsbynameid)(NameId) | Gibt alle zurück[`NameRecord`](../ttfnametable.namerecord) Strukturen, deren NameId-Feld gleich ist, übergeben*nameId* Wert. Wenn keine Datensätze gefunden werden, wird ein leeres Array zurückgegeben. |
| [UpdateName](../../aspose.font.ttftables/ttfnametable/updatename)(PlatformId, ushort, NameId, ushort, string) | Aktualisiert den Namen in Datensätzen, die sich auf die angegebene Plattform beziehen (Kombination aus Plattform-ID und Plattformspezifischer ID), Kategorie (Namens-ID) und Sprache (Sprachen-ID). |
| [UpdateNamesByNameId](../../aspose.font.ttftables/ttfnametable/updatenamesbynameid)(NameId, string) | Wählt alle Datensätze aus, die sich auf die logische String-Kategorie beziehen, die durch den Parameter nameId angegeben ist, und aktualisiert das Namensfeld (String-Daten) in diesen Datensätzen. Felder, die sich auf die Plattform (Plattform-ID, plattformspezifische Codierungs-ID) und die Sprache (Sprach-ID) beziehen, sind von dieser Methode nicht betroffen. Nur Namenszeichenfolgendaten werden durch einen neuen Namen ersetzt. Verwenden Sie diese Methode mit Vorsicht, da sie die ursprünglichen Namen für alle Plattformen und Sprachen ersetzt, die mit nameId in Verbindung bringen. Es kann zu Konflikten kommen, wenn die ursprünglichen Namen unterschiedliche Werte hatten, da die Ersetzungsoperation alle diese Werte durch neue einzelne Werte ändert. Und dieser neue Wert kann eine logische Inkonsistenz mit einigen Plattformen und Sprachen haben. Diese Methode ist nützlich für Fälle, in denen der ursprüngliche Name eine einzige Darstellung für alle Plattformen und Sprachen hat, z. B. , wenn die Daten der Namenszeichenfolge in englischer Sprache vorliegen. |

## Andere Mitglieder

| Name | Beschreibung |
| --- | --- |
| enum [MacLanguageId](ttfnametable.maclanguageid) | Macintosh-Plattform-Sprach-ID-Aufzählung. |
| enum [MacPlatformSpecificId](ttfnametable.macplatformspecificid) | Stellt die PlatformSpecificId-Aufzählung der Macintosh-Plattform dar. |
| enum [MSLanguageId](ttfnametable.mslanguageid) | Microsoft-Plattform-Sprach-ID-Aufzählung. |
| enum [MSPlatformSpecificId](ttfnametable.msplatformspecificid) | Stellt die PlatformSpecificId-Enumeration der Microsoft-Plattform dar. |
| enum [NameId](ttfnametable.nameid) | steht für NameId. |
| class [NameRecord](ttfnametable.namerecord) | Repräsentiert die NameRecord-Struktur der 'Name'-Tabelle |
| enum [PlatformId](ttfnametable.platformid) | Stellt die PlatformId-Aufzählung dar. |
| enum [UnicodePlatformSpecificId](ttfnametable.unicodeplatformspecificid) | Stellt eine plattformspezifische Unicode-Aufzählung dar. |

### Siehe auch

* class [TtfTableBase](../ttftablebase)
* namensraum [Aspose.Font.TtfTables](../../aspose.font.ttftables)
* Montage [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
