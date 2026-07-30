---
title: "Aspose::Font::TtfTables::TtfStatTable Klasse"
linktitle: "TtfStatTable"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::TtfTables::TtfStatTable Klasse. Stellt die Style‑Attributes‑Table (STAT) der OpenType‑Schrift in C++ dar."
type: docs
weight: 1700
url: /de/cpp/aspose.font.ttftables/ttfstattable/
---
## TtfStatTable class


Stellt die Style Attributes Table (STAT) der OpenType-Schriftart dar.

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

| Aufzählung | Beschreibung |
| --- | --- |
| [AxisValueTableFlags](./axisvaluetableflags/) | Gibt die Flags der Achsenwerttabelle an. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddAxisRecord](./addaxisrecord/)(System::SharedPtr\<TtfStatTable::AxisRecord\>) | Fügt der Tabelle eine Axis‑Record‑Struktur hinzu. |
| [AddAxisValueTable](./addaxisvaluetable/)(System::SharedPtr\<TtfStatTable::AxisValueTableBase\>) | Fügt der Tabelle eine Axis‑Value‑Table‑Struktur hinzu. |
| [ClearAxisRecords](./clearaxisrecords/)() | Entfernt alle Achsenrecord‑Einträge aus der Tabelle. |
| [ClearAxisValueTables](./clearaxisvaluetables/)() | Entfernt alle Achsenwerttabellen aus der Tabelle. |
| [get_AxisRecords](./get_axisrecords/)() | Gibt das Array der Design‑Achsen zurück. Das Achsen‑Array ist ein Array von Strukturen des Typs Axis Record. Spec: Der Axis Record liefert Informationen über eine einzelne Design‑Achse. |
| [get_AxisValueCount](./get_axisvaluecount/)() | Gibt die Anzahl der Achsenwerttabellen zurück. |
| [get_AxisValueTables](./get_axisvaluetables/)() | Gibt ein Array von Axis‑Value‑Tables zurück. Spec: Axis‑Value‑Tables liefern Details zu einem bestimmten Stil‑Attributwert auf einer bestimmten Achse der Design‑Variation oder einer Kombination von Design‑Variations‑Achsenwerten sowie die Beziehung dieser Werte zu Bezeichnungen, die als Elemente in Subfamily‑Namen verwendet werden. |
| [get_DesignAxisCount](./get_designaxiscount/)() | Gibt die Anzahl der Axis‑Records zurück. Spec: In einer Schrift mit einer 'fvar'-Tabelle muss dieser Wert größer oder gleich dem axisCount‑Wert in der 'fvar'-Tabelle sein. In allen Schriften muss er größer als null sein, wenn axisValueCount größer als null ist. |
| [get_ElidedFallbackName](./get_elidedfallbackname/)() | Spec: Name, der als Rückfall verwendet wird, wenn die Projektion von Namen in ein bestimmtes Schriftmodell einen Subfamily‑Namen erzeugt, der nur entbehrliche Elemente enthält. |
| [get_ElidedFallbackNameId](./get_elidedfallbacknameid/)() | Spec: Namens‑ID, die als Rückfall verwendet wird, wenn die Projektion von Namen in ein bestimmtes Schriftmodell einen Subfamily‑Namen erzeugt, der nur entbehrliche Elemente enthält. |
| static [get_Tag](./get_tag/)() | Liefert das Tabellentag. |
## Siehe auch

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
