---
title: "Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth metodo"
linktitle: "get_AdditionalAdvanceWidth"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth method. Nella tabella hmtx possono verificarsi casi in cui il numero totale di glifi non è uguale a hhea.numberOfHMetrics. Per questi casi la tabella hmtx contiene un array aggiuntivo ''leftSideBearing'' che corrisponde alla proprietà LeftSidebearings. Tuttavia i glifi con indici da hhea.numOfLongHorMetrics a maxp.numGlyphs hanno anche larghezze. E queste larghezze, in conformità con la specifica per la tabella hmtx, hanno i seguenti valori: \"Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above\" in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font.ttftables/ttfhmtxtable/get_additionaladvancewidth/
---
## TtfHmtxTable::get_AdditionalAdvanceWidth method


Nella tabella hmtx possono verificarsi casi in cui il numero totale di glifi non è uguale a hhea.numberOfHMetrics. Per questi casi la tabella hmtx contiene un array aggiuntivo 'leftSideBearing' che corrisponde alla proprietà [LeftSidebearings](../). Tuttavia i glifi con indici da hhea.numOfLongHorMetrics a maxp.numGlyphs hanno anche larghezze. E queste larghezze, secondo la specifica per la tabella hmtx, hanno i seguenti valori: "Qui l'advanceWidth è considerato uguale all'advanceWidth per l'ultima voce sopra".

```cpp
uint16_t Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth()
```

## Vedi anche

* Class [TtfHmtxTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
