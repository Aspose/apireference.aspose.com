---
title: "Aspose::Font::TtfTables::TtfCMapTable class"
linktitle: "TtfCMapTable"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfCMapTable Klasse. Stellt die \"cmap\"-Tabelle der TTF‑Schriftdatei in C++ dar."
type: docs
weight: 200
url: /de/cpp/aspose.font.ttftables/ttfcmaptable/
---
## TtfCMapTable class


Stellt die "cmap"-Tabelle der TTF-[Font](../../aspose.font/font/)-Datei dar.

```cpp
class TtfCMapTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [TtfCMapSubtableDescription](./ttfcmapsubtabledescription/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [FindUnicodeTable](./findunicodetable/)() | Durchsucht und gibt die Unicode‑CMap zurück. Wenn es eine UCS‑4‑CMap gibt, wird diese zuerst zurückgegeben; andernfalls wird irgendeine gefundene Unicode‑CMap zurückgegeben. |
| static [get_Tag](./get_tag/)() | Liefert das Tabellentag. |
| [GetAllSubtables](./getallsubtables/)() | Gibt alle Untertabellen der CMap‑Tabelle zurück. |
| [GetPlatformTables](./getplatformtables/)(uint16_t, uint16_t) | Gibt CMap‑Untertabellen für planformId und platformSpecificId zurück. |
## Siehe auch

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
