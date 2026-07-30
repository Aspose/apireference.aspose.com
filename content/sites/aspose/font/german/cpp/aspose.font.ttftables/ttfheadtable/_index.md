---
title: "Aspose::Font::TtfTables::TtfHeadTable Klasse"
linktitle: "TtfHeadTable"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfHeadTable Klasse. Stellt die \"head\"‑Tabelle der TTF‑Font‑Datei in C++ dar."
type: docs
weight: 700
url: /de/cpp/aspose.font.ttftables/ttfheadtable/
---
## TtfHeadTable class


Stellt die "head"‑Tabelle der TTF [Font](../../aspose.font/font/) Datei dar.

```cpp
class TtfHeadTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_CheckSumAdjustment](./get_checksumadjustment/)() const | Liest uint32 checkSumAdjustment. Zur Berechnung: Auf 0 setzen, die Prüfsumme für die 'head'-Tabelle berechnen und im Tabellendirectory ablegen, die gesamte Schriftart als uint32 summieren und dann B1B0AFBA – Summe speichern. Die Prüfsumme für die 'head'-Tabelle wird nicht falsch sein. Das ist in Ordnung. |
| [get_Created](./get_created/)() const | Liest longDateTime erstelltes internationales Datum. |
| [get_Flags](./get_flags/)() const | Liest uint16 flags. |
| [get_FontDirectionHint](./get_fontdirectionhint/)() const | Liest int16 fontDirectionHint. 0 Gemischte Richtungs‑Glyphen; 1 Nur stark von links nach rechts gerichtete Glyphen; 2 Wie 1, enthält aber auch neutrale Glyphen; -1 Nur stark von rechts nach links gerichtete Glyphen; -2 Wie -1, enthält aber auch neutrale Glyphen. |
| [get_FontRevision](./get_fontrevision/)() const | Liest fixed fontRevision, festgelegt vom Font‑Hersteller. |
| [get_GlyphDataFormat](./get_glyphdataformat/)() const | Liest int16 glyphDataFormat, 0 für das aktuelle Format. |
| [get_IndexToLocFormat](./get_indextolocformat/)() const | Liest int16 indexToLocFormat, 0 für kurze Offsets, 1 für lange. |
| [get_LowestRecPPEM](./get_lowestrecppem/)() const | Liest uint16 lowestRecPPEM, kleinste lesbare Größe in Pixeln. |
| [get_MacStyle](./get_macstyle/)() const | Liest uint16 macStyle. |
| [get_MagicNumber](./get_magicnumber/)() const | Liest uint32 magicNumber, gesetzt auf 0x5F0F3CF5. |
| [get_Modified](./get_modified/)() const | Liest longDateTime modifiziertes internationales Datum. |
| static [get_Tag](./get_tag/)() | Liefert das Tabellentag. |
| [get_UnitsPerEM](./get_unitsperem/)() const | Liest uint16 unitsPerEm, Bereich von 64 bis 16384. |
| [get_Version](./get_version/)() const | Feste Version 0x00010000, falls (Version 1.0). |
| [get_XMax](./get_xmax/)() const | Liest FWord xMax für alle Glyph‑Bounding‑Boxen. |
| [get_XMin](./get_xmin/)() const | Liest FWord xMin für alle Glyph‑Bounding‑Boxen. |
| [get_YMax](./get_ymax/)() const | Liest FWord yMax für alle Glyph‑Bounding‑Boxen. |
| [get_YMin](./get_ymin/)() const | Liest FWord yMin für alle Glyph‑Bounding‑Boxen. |
## Siehe auch

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
