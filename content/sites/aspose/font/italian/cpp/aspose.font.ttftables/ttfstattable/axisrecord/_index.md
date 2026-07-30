---
title: "Aspose::Font::TtfTables::TtfStatTable::AxisRecord classe"
linktitle: "AxisRecord"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TtfTables::TtfStatTable::AxisRecord classe. Rappresenta la struttura Axis Record. Spec: il record dell'asse fornisce informazioni su un singolo asse di design in C++."
type: docs
weight: 1300
url: /it/cpp/aspose.font.ttftables/ttfstattable/axisrecord/
---
## AxisRecord class


Rappresenta la struttura Axis Record. Spec: il record dell'asse fornisce informazioni su un singolo asse di design.

```cpp
class AxisRecord : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AxisRecord](./axisrecord/)(System::String, uint16_t, uint16_t) | Costruttore. |
| [get_AxisNameId](./get_axisnameid/)() const | Restituisce il campo axisNameID. Spec: Il campo axisNameID fornisce un ID nome che può essere usato per ottenere stringhe dalla tabella 'name' che possono essere usate per riferirsi all'asse nelle interfacce utente dell'applicazione. |
| [get_AxisOrdering](./get_axisordering/)() const | Restituisce il campo axisOrdering. Spec: Un valore che le applicazioni possono usare per determinare l'ordinamento primario dei nomi dei caratteri, o per l'ordinamento delle etichette quando si compongono nomi di famiglia o di carattere. |
| [get_Tag](./get_tag/)() const | Restituisce un tag che identifica l'asse di variazione di design. Spec: Ogni record dell'asse ha un tag che designa l'asse. I valori dei tag devono rispettare le regole per i tag degli assi descritte nel Registro dei Tag degli Assi di Variazione di Design OpenType. |
## Vedi anche

* Class [Object](../../../system/object/)
* Class [TtfStatTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
