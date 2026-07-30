---
title: "Aspose::Font::TtfTables::TtfStatTable::AxisValueTableFlags enum"
linktitle: "AxisValueTableFlags"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TtfTables::TtfStatTable::AxisValueTableFlags enum. Specifica i flag della tabella dei valori dell'asse in C++."
type: docs
weight: 1200
url: /it/cpp/aspose.font.ttftables/ttfstattable/axisvaluetableflags/
---
## AxisValueTableFlags enum


Specifica i flag della tabella dei valori dell'asse.

```cpp
enum class AxisValueTableFlags : uint16_t
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| OlderSiblingFontAttribute | n/a | Se impostato, questa tabella dei valori dell'asse fornisce informazioni sui valori dell'asse applicabili ad altri caratteri all'interno della stessa famiglia di caratteri. Viene utilizzata se gli altri caratteri sono stati rilasciati in precedenza e non includevano informazioni sui valori di alcuni assi. Se le versioni più recenti degli altri caratteri includono le informazioni stesse e sono presenti, allora questa tabella viene ignorata. |
| ElidableAxisValueName | n/a | Se impostato, indica che il valore dell'asse rappresenta il valore “normale” per l'asse e può essere omesso durante la composizione delle stringhe di nome. |
| Riservato | n/a | Riservato per uso futuro. |

## Vedi anche

* Class [TtfStatTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
