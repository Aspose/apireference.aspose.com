---
title: "Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth Methode"
linktitle: "get_AdditionalAdvanceWidth"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth Methode. In der hmtx‑Tabelle kann es Fälle geben, in denen die Gesamtzahl der Glyphen nicht gleich hhea.numberOfHMetrics ist. Für diese Fälle enthält die hmtx‑Tabelle das zusätzliche Array ''leftSideBearing'', das der Eigenschaft LeftSidebearings entspricht. Aber Glyphen mit Indizes von hhea.numOfLongHorMetrics bis maxp.numGlyphs besitzen ebenfalls Breiten. Und diese Breiten haben gemäß der Spezifikation für die hmtx‑Tabelle folgende Werte: \"Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above\" in C++."
type: docs
weight: 200
url: /de/cpp/aspose.font.ttftables/ttfhmtxtable/get_additionaladvancewidth/
---
## TtfHmtxTable::get_AdditionalAdvanceWidth method


In der hmtx‑Tabelle können Fälle auftreten, in denen die Gesamtzahl der Glyphen nicht gleich hhea.numberOfHMetrics ist. Für diese Fälle enthält die hmtx‑Tabelle ein zusätzliches Array 'leftSideBearing', das der Eigenschaft [LeftSidebearings](../) entspricht. Aber Glyphen mit Indizes von hhea.numOfLongHorMetrics bis maxp.numGlyphs haben ebenfalls Breiten. Und diese Breiten haben gemäß der Spezifikation für die hmtx‑Tabelle folgende Werte: "Hier wird angenommen, dass die advanceWidth dieselbe ist wie die advanceWidth für den letzten Eintrag oben".

```cpp
uint16_t Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth()
```

## Siehe auch

* Class [TtfHmtxTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
