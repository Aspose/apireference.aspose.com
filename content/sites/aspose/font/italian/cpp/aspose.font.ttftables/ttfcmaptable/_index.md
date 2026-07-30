---
title: "Aspose::Font::TtfTables::TtfCMapTable class"
linktitle: "TtfCMapTable"
second_title: "Aspose.Font per C++"
description: "Classe Aspose::Font::TtfTables::TtfCMapTable. Rappresenta la tabella \"cmap\" del file TTF Font in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font.ttftables/ttfcmaptable/
---
## TtfCMapTable class


Rappresenta la tabella "cmap" del file TTF [Font](../../aspose.font/font/).

```cpp
class TtfCMapTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [TtfCMapSubtableDescription](./ttfcmapsubtabledescription/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [FindUnicodeTable](./findunicodetable/)() | Cerca e restituisce la CMap Unicode. Se esiste una CMap ucs-4, la restituisce per prima; altrimenti restituisce qualsiasi CMap Unicode trovata. |
| static [get_Tag](./get_tag/)() | Ottiene il tag della tabella. |
| [GetAllSubtables](./getallsubtables/)() | Restituisce tutte le sotto-tabelle dalla tabella CMap. |
| [GetPlatformTables](./getplatformtables/)(uint16_t, uint16_t) | Restituisce le sotto-tabelle CMap per planformId e platformSpecificId. |
## Vedi anche

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
