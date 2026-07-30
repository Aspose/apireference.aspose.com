---
title: "Classe Aspose::Font::TtfTables::TtfMaxpTable"
linktitle: "TtfMaxpTable"
second_title: "Aspose.Font per C++"
description: "Classe Aspose::Font::TtfTables::TtfMaxpTable. Rappresenta la tabella \"maxp\" del file Font TTF in C++."
type: docs
weight: 1200
url: /it/cpp/aspose.font.ttftables/ttfmaxptable/
---
## TtfMaxpTable class


Rappresenta la tabella "maxp" del file [Font](../../aspose.font/font/) TTF.

```cpp
class TtfMaxpTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_MaxComponentContours](./get_maxcomponentcontours/)() const | Ottiene uint16 maxComponentContours contorni in un glifo composto. |
| [get_MaxComponentDepth](./get_maxcomponentdepth/)() const | Ottiene uint16 maxComponentDepth livelli di ricorsione, impostato a 0 se il font contiene solo glifi semplici. |
| [get_MaxComponentElements](./get_maxcomponentelements/)() const | Ottiene uint16 maxComponentElements numero di glifi referenziati al livello superiore. |
| [get_MaxComponentPoints](./get_maxcomponentpoints/)() const | Ottiene uint16 maxComponentPoints punti in un glifo composto. |
| [get_MaxContours](./get_maxcontours/)() const | Ottiene uint16 maxContours contorni in un glifo non composto. |
| [get_MaxFunctionDefs](./get_maxfunctiondefs/)() const | Ottiene uint16 maxFunctionDefs numero di FDEF. |
| [get_MaxInstructionDefs](./get_maxinstructiondefs/)() const | Ottiene uint16 maxInstructionDefs numero di IDEF. |
| [get_MaxPoints](./get_maxpoints/)() const | Ottiene uint16 maxPoints punti in glifo non composto. |
| [get_MaxSizeOfInstructions](./get_maxsizeofinstructions/)() const | Ottiene uint16 maxSizeOfInstructions conteggio dei byte per le istruzioni del glifo. |
| [get_MaxStackElements](./get_maxstackelements/)() const | Ottiene uint16 maxStackElements profondità massima dello stack. |
| [get_MaxStorage](./get_maxstorage/)() const | Ottiene uint16 maxStorage numero di posizioni dell'Area di Memoria. |
| [get_MaxTwilightPoints](./get_maxtwilightpoints/)() const | Ottiene uint16 maxTwilightPoints punti usati nella Twilight Zone (Z0). |
| [get_MaxZones](./get_maxzones/)() const | Ottiene uint16 maxZones impostato a 2. |
| [get_NumGlyphs](./get_numglyphs/)() const | Ottiene uint16 numGlyphs il numero di glifi nel [Font](../../aspose.font/font/). |
| [get_TableVersion](./get_tableversion/)() const | Ottiene la versione del formato. Usa le proprietà MajorNumber e MinorNUmber dell'oggetto [Version16Dot16](../) in notazione esadecimale per rilevare la versione utilizzata. |
| static [get_Tag](./get_tag/)() | Ottiene il tag della tabella. |
| [get_Version](./get_version/)() const | Ottiene la versione fissa 0x00010000 se (versione 1.0). Obsoleta, usa la proprietà [TableVersion](../) invece. |
## Vedi anche

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
