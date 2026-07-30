---
title: "Aspose::Font::TtfTables::TtfNameTable Klasse"
linktitle: "TtfNameTable"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfNameTable Klasse. Stellt die \"name\"-Tabelle der TTF-Schriftdatei in C++ dar."
type: docs
weight: 1300
url: /de/cpp/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class


Stellt die "name"-Tabelle der TTF [Font](../../aspose.font/font/) Datei dar.

```cpp
class TtfNameTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [NameRecord](./namerecord/)
## Enums

| Aufzählung | Beschreibung |
| --- | --- |
| [MacLanguageId](./maclanguageid/) | Macintosh-Plattform-Sprach-ID-Aufzählung. |
| [MacPlatformSpecificId](./macplatformspecificid/) | Stellt die Macintosh-Plattform PlatformSpecificId-Aufzählung dar. |
| [MSLanguageId](./mslanguageid/) | Microsoft-Plattform-Sprach-ID-Aufzählung. |
| [MSPlatformSpecificId](./msplatformspecificid/) | Stellt die Microsoft-Plattform PlatformSpecificId-Aufzählung dar. |
| [NameId](./nameid/) | Stellt [NameId](./nameid/) dar. |
| [PlatformId](./platformid/) | Stellt die [PlatformId](./platformid/) Aufzählung dar. |
| [UnicodePlatformSpecificId](./unicodeplatformspecificid/) | Stellt die unicode plattformspezifische Aufzählung dar. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddMultiLanguageNames](./addmultilanguagenames/)(System::SharedPtr\<MultiLanguageString\>, TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Extrahiert alle mehrsprachigen Zeichenketten aus dem übergebenen *mlNames*-Objekt und erstellt für jede extrahierte Zeichenkette eine entsprechende [NameRecord](./namerecord/)-Struktur unter Verwendung der übergebenen Parameter *platformId*, *platformSpecificId* und *nameId*. Der Wert für das Feld languageID wird aus dem *mlNames*-Objekt extrahiert. Der neu erstellte Datensatz wird zur Tabelle hinzugefügt. Wird ein Datensatz gefunden, der durch die Felder platformID, platformSpecificID, nameID und languageId mit dem gerade erstellten übereinstimmt, wird der neu erstellte Datensatz nicht hinzugefügt und nur die Zeichenkettendaten des bestehenden Datensatzes aktualisiert. |
| [AddName](./addname/)(TtfNameTable::NameId, TtfNameTable::PlatformId, int32_t, int32_t, System::String) | Fügt einen Eintrag in die Tabelle ein. Die Kategorie der Zeichenkettendaten, die hinzugefügt werden soll, wird durch den Parameter *name* angegeben. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Löscht alle Datensätze, die zu den übergebenen Parametern gehören. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t) | Löscht alle Datensätze, die zur angegebenen Plattform gehören. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t) | Löscht Datensatz(e), die zu den angegebenen Parametern gehören. |
| [DeleteRecordsByNameId](./deleterecordsbynameid/)(TtfNameTable::NameId) | Löscht alle Datensätze, die zum übergebenen nameId-Parameter gehören. |
| static [get_Tag](./get_tag/)() | Liefert das Tabellentag. |
| [GetAllNameRecords](./getallnamerecords/)() | Gibt alle [NameRecord](./namerecord/)-Strukturen aus der Tabelle zurück. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId) | Gibt einen Namen anhand von nameId zurück. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId) | Gibt einen Namen anhand von nameId unter Verwendung des übergebenen Plattformidentifikators zurück. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId, uint16_t) | Gibt einen Namen als Objekt des Typs [MultiLanguageString](../../aspose.font/multilanguagestring/) zurück. Die Methode sammelt alle [NameRecord](./namerecord/)-Strukturen, die mit den übergebenen Parametern nameId, platformId und platformSpecificId übereinstimmen, und erstellt anschließend ein Ergebnisobjekt basierend auf dieser Strukturliste. |
| [GetNameById](./getnamebyid/)(TtfNameTable::NameId) | Gibt einen Namen anhand von nameId zurück, falls gefunden, sonst null. |
| [GetNameRecordsByNameId](./getnamerecordsbynameid/)(TtfNameTable::NameId) | Gibt alle [NameRecord](./namerecord/)-Strukturen zurück, deren [NameId](./nameid/)-Feld dem übergebenen *nameId*-Wert entspricht. Wenn keine Datensätze gefunden werden, wird ein leeres Array zurückgegeben. |
| [UpdateName](./updatename/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t, System::String) | Aktualisiert den Namen in Datensatz(en), die zur angegebenen Plattform (Kombination aus platformId und platformSpecificId), Kategorie (nameId) und Sprache (languageId) gehören. |
| [UpdateNamesByNameId](./updatenamesbynameid/)(TtfNameTable::NameId, System::String) | Wählt alle Datensätze aus, die zur logischen Zeichenkettenkategorie gehören, angegeben durch den Parameter nameId, und aktualisiert das Namensfeld (String‑Daten) in diesen Datensätzen. Felder, die sich auf die Plattform (platformID, plattformspezifische Kodierungs‑ID) und die Sprache (Language ID) beziehen, werden von dieser Methode nicht beeinflusst. Nur die String‑Daten des Namens werden durch einen neuen Namen ersetzt. Verwenden Sie diese Methode mit Vorsicht, da sie die ursprünglichen Namen für alle Plattformen und Sprachen, die zu nameId gehören, ersetzt. Es kann zu Konflikten kommen, wenn die ursprünglichen Namen unterschiedliche Werte hatten, da der Ersetzungsvorgang all diese Werte durch einen einzigen neuen Wert ändert. Und dieser neue Wert kann eine logische Inkonsistenz mit einigen Plattformen und Sprachen aufweisen. Diese Methode ist nützlich für Fälle, in denen der ursprüngliche Name eine einheitliche Darstellung für alle Plattformen und Sprachen hat, zum Beispiel, wenn die String‑Daten des Namens in englischer Sprache vorliegen. |
## Siehe auch

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
