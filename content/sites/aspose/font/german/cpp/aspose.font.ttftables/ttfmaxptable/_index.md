---
title: "Aspose::Font::TtfTables::TtfMaxpTable Klasse"
linktitle: "TtfMaxpTable"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfMaxpTable Klasse. Stellt die \"maxp\"-Tabelle der TTF-Schriftdatei in C++ dar."
type: docs
weight: 1200
url: /de/cpp/aspose.font.ttftables/ttfmaxptable/
---
## TtfMaxpTable class


Stellt die "maxp"-Tabelle der TTF [Font](../../aspose.font/font/) Datei dar.

```cpp
class TtfMaxpTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_MaxComponentContours](./get_maxcomponentcontours/)() const | Liefert uint16 maxComponentContours Konturen im zusammengesetzten Glyph. |
| [get_MaxComponentDepth](./get_maxcomponentdepth/)() const | Liefert uint16 maxComponentDepth Ebenen der Rekursion, auf 0 gesetzt, wenn die Schrift nur einfache Glyphen enthält. |
| [get_MaxComponentElements](./get_maxcomponentelements/)() const | Liefert uint16 maxComponentElements Anzahl der Glyphen, die auf oberster Ebene referenziert werden. |
| [get_MaxComponentPoints](./get_maxcomponentpoints/)() const | Liefert uint16 maxComponentPoints Punkte im zusammengesetzten Glyph. |
| [get_MaxContours](./get_maxcontours/)() const | Liefert uint16 maxContours Konturen im nicht zusammengesetzten Glyph. |
| [get_MaxFunctionDefs](./get_maxfunctiondefs/)() const | Liefert uint16 maxFunctionDefs Anzahl der FDEFs. |
| [get_MaxInstructionDefs](./get_maxinstructiondefs/)() const | Ermittelt uint16 maxInstructionDefs Anzahl der IDEFs. |
| [get_MaxPoints](./get_maxpoints/)() const | Ermittelt uint16 maxPoints Punkte in nicht zusammengesetzten Glyphen. |
| [get_MaxSizeOfInstructions](./get_maxsizeofinstructions/)() const | Ermittelt uint16 maxSizeOfInstructions Byteanzahl für Glyphen‑Anweisungen. |
| [get_MaxStackElements](./get_maxstackelements/)() const | Ermittelt uint16 maxStackElements maximale Stapeltiefe. |
| [get_MaxStorage](./get_maxstorage/)() const | Ermittelt uint16 maxStorage Anzahl der Speicherbereichspositionen. |
| [get_MaxTwilightPoints](./get_maxtwilightpoints/)() const | Ermittelt uint16 maxTwilightPoints Punkte, die in der Twilight Zone (Z0) verwendet werden. |
| [get_MaxZones](./get_maxzones/)() const | Ermittelt uint16 maxZones, gesetzt auf 2. |
| [get_NumGlyphs](./get_numglyphs/)() const | Ermittelt uint16 numGlyphs die Anzahl der Glyphen im [Font](../../aspose.font/font/). |
| [get_TableVersion](./get_tableversion/)() const | Ermittelt die Formatversion. Verwenden Sie die Eigenschaften MajorNumber und MinorNUmber des Objekts [Version16Dot16](../) in hexadezimaler Schreibweise, um die verwendete Version zu erkennen. |
| static [get_Tag](./get_tag/)() | Liefert das Tabellentag. |
| [get_Version](./get_version/)() const | Ermittelt die feste Version 0x00010000, falls (Version 1.0). Veraltet, verwenden Sie stattdessen die Eigenschaft [TableVersion](../). |
## Siehe auch

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
