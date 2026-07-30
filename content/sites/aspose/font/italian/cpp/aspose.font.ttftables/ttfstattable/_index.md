---
title: "Classe Aspose::Font::TtfTables::TtfStatTable"
linktitle: "TtfStatTable"
second_title: "Aspose.Font per C++"
description: "Classe Aspose::Font::TtfTables::TtfStatTable. Rappresenta la Style Attributes Table (STAT) del font OpenType in C++."
type: docs
weight: 1700
url: /it/cpp/aspose.font.ttftables/ttfstattable/
---
## TtfStatTable class


Rappresenta la Style Attributes Table (STAT) del font OpenType.

```cpp
class TtfStatTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [AxisRecord](./axisrecord/)
* Class [AxisValue](./axisvalue/)
* Class [AxisValueTableBase](./axisvaluetablebase/)
* Class [AxisValueTableFormat1](./axisvaluetableformat1/)
* Class [AxisValueTableFormat2](./axisvaluetableformat2/)
* Class [AxisValueTableFormat3](./axisvaluetableformat3/)
* Class [AxisValueTableFormat4](./axisvaluetableformat4/)
## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [AxisValueTableFlags](./axisvaluetableflags/) | Specifica i flag della tabella dei valori dell'asse. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddAxisRecord](./addaxisrecord/)(System::SharedPtr\<TtfStatTable::AxisRecord\>) | Aggiunge una struttura Axis Record alla tabella. |
| [AddAxisValueTable](./addaxisvaluetable/)(System::SharedPtr\<TtfStatTable::AxisValueTableBase\>) | Aggiunge una struttura Axis Value Table alla tabella. |
| [ClearAxisRecords](./clearaxisrecords/)() | Rimuove tutti i record degli assi dalla tabella. |
| [ClearAxisValueTables](./clearaxisvaluetables/)() | Rimuove tutte le tabelle dei valori degli assi dalla tabella. |
| [get_AxisRecords](./get_axisrecords/)() | Restituisce l'array degli assi di design. L'array degli assi è un array di strutture di tipo Axis Record. Specifica: il record dell'asse fornisce informazioni su un singolo asse di design. |
| [get_AxisValueCount](./get_axisvaluecount/)() | Restituisce il numero di tabelle dei valori degli assi. |
| [get_AxisValueTables](./get_axisvaluetables/)() | Restituisce un array di Axis Value Tables. Specifica: le Axis Value Tables forniscono dettagli su un valore specifico di attributo di stile su un asse specifico di variazione di design, o su una combinazione di valori di assi di variazione di design, e la relazione di tali valori con le etichette usate come elementi nei nomi di sottogruppo. |
| [get_DesignAxisCount](./get_designaxiscount/)() | Restituisce il numero di record degli assi. Specifica: in un font con una tabella 'fvar', questo valore deve essere maggiore o uguale al valore axisCount nella tabella 'fvar'. In tutti i font, deve essere maggiore di zero se axisValueCount è maggiore di zero. |
| [get_ElidedFallbackName](./get_elidedfallbackname/)() | Spec: Nome usato come fallback quando la proiezione dei nomi in un modello di font specifico produce un nome di sottogruppo contenente solo elementi elidibili. |
| [get_ElidedFallbackNameId](./get_elidedfallbacknameid/)() | Spec: ID nome usato come fallback quando la proiezione dei nomi in un modello di font specifico produce un nome di sottogruppo contenente solo elementi elidibili. |
| static [get_Tag](./get_tag/)() | Ottiene il tag della tabella. |
## Vedi anche

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
