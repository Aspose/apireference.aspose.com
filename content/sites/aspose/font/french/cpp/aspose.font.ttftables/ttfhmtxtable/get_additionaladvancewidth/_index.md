---
title: "Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth méthode"
linktitle: "get_AdditionalAdvanceWidth"
second_title: "Aspose.Font pour C++"
description: "Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth méthode. Dans la table hmtx, il peut y avoir des cas où le nombre total de glyphes n'est pas égal à hhea.numberOfHMetrics. Pour ces cas, la table hmtx contient un tableau supplémentaire ''leftSideBearing'' qui correspond à la propriété LeftSidebearings. Mais les glyphes avec des index de hhea.numOfLongHorMetrics à maxp.numGlyphs ont également des largeurs. Et ces largeurs, conformément à la spécification de la table hmtx, ont les valeurs suivantes : \"Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above\" en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.font.ttftables/ttfhmtxtable/get_additionaladvancewidth/
---
## TtfHmtxTable::get_AdditionalAdvanceWidth method


Dans la table hmtx il peut y avoir des cas où le nombre total de glyphes n’est pas égal à hhea.numberOfHMetrics. Pour ces cas, la table hmtx contient un tableau supplémentaire 'leftSideBearing' qui correspond à la propriété [LeftSidebearings](../). Mais les glyphes avec des index de hhea.numOfLongHorMetrics à maxp.numGlyphs ont également des largeurs. Et ces largeurs, conformément à la spécification de la table hmtx, ont les valeurs suivantes : "Here the advanceWidth is assumed to be the same as the advanceWidth for the last entry above".

```cpp
uint16_t Aspose::Font::TtfTables::TtfHmtxTable::get_AdditionalAdvanceWidth()
```

## Voir aussi

* Class [TtfHmtxTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
