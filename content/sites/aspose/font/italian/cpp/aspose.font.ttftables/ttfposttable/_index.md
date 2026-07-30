---
title: "classe Aspose::Font::TtfTables::TtfPostTable"
linktitle: "TtfPostTable"
second_title: "Aspose.Font per C++"
description: "classe Aspose::Font::TtfTables::TtfPostTable. Rappresenta la tabella \"post\" del file Font TTF in C++."
type: docs
weight: 1500
url: /it/cpp/aspose.font.ttftables/ttfposttable/
---
## TtfPostTable class


Rappresenta la tabella "post" del file [Font](../../aspose.font/font/) TTF.

```cpp
class TtfPostTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Format](./get_format/)() | Ottiene il formato fisso (versione) di questa tabella. Obsoleto, utilizzare la proprietà [TableFormat](../). |
| [get_HasNoPostScriptNames](./get_hasnopostscriptnames/)() | Indica che non è fornita alcuna informazione sul nome PostScript per i glifi in questo file di font. |
| [get_IsFixedPitch](./get_isfixedpitch/)() | Ottiene uint32 isFixedPitch. 0 se il font è a spaziatura proporzionale, diverso da zero se il font non è a spaziatura proporzionale (cioè monospazio). |
| [get_ItalicAngle](./get_italicangle/)() | Ottiene l'italicAngle fisso. Angolo italic in gradi. |
| [get_MaxMemType1](./get_maxmemtype1/)() | Ottiene uint32 maxMemType1. Massimo utilizzo di memoria quando un font TrueType è scaricato come [Font](../../aspose.font/font/) Type 1. |
| [get_MaxMemType42](./get_maxmemtype42/)() | Ottiene uint32 maxMemType42. Massimo utilizzo di memoria quando un font TrueType è scaricato come [Font](../../aspose.font/font/) Type 42. |
| [get_MinMemType1](./get_minmemtype1/)() | Ottiene uint32 minMemType1. Minimo utilizzo di memoria quando un font TrueType è scaricato come [Font](../../aspose.font/font/) Type 1. |
| [get_MinMemType42](./get_minmemtype42/)() | Ottiene uint32 minMemType42. Minimo utilizzo di memoria quando un font TrueType è scaricato come [Font](../../aspose.font/font/) Type 42. |
| [get_TableFormat](./get_tableformat/)() | Ottiene il formato fisso (versione) di questa tabella. Utilizzare le proprietà MajorNumber e MinorNUmber dell'oggetto [Version16Dot16](../) in notazione esadecimale per rilevare la versione utilizzata. |
| static [get_Tag](./get_tag/)() | Ottiene il tag della tabella. |
| [get_UnderlinePosition](./get_underlineposition/)() | Ottiene il valore FWord underlinePosition. |
| [get_UnderlineThickness](./get_underlinethickness/)() | Ottiene il valore FWord underlineThickness. |
| [GetAllGlyphIndexesForGlyphName](./getallglyphindexesforglyphname/)(System::String) | Ottiene l'array di indici dei glifi per nome del glifo. |
| [GetGlyphIndex](./getglyphindex/)(System::String) | Ottiene l'indice del glifo per nome del glifo. |
| [GetGlyphName](./getglyphname/)(uint32_t) | Ottiene il nome del glifo per indice del glifo. |
## Vedi anche

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
