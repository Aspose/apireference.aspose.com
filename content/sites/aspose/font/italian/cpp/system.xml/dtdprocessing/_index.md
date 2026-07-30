---
title: "System::Xml::DtdProcessing enum"
linktitle: "DtdProcessing"
second_title: "Aspose.Font per C++"
description: "System::Xml::DtdProcessing enum. Specifica le opzioni per l'elaborazione dei DTD. L'enumerazione DtdProcessing è usata dalla classe XmlReaderSettings in C++."
type: docs
weight: 4700
url: /it/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


Specifica le opzioni per l'elaborazione dei DTD. L'enumerazione [DtdProcessing](./) è usata dalla classe [XmlReaderSettings](../xmlreadersettings/).

```cpp
enum class DtdProcessing
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Prohibit | 0 | Specifica che quando viene incontrato un DTD, viene generata un'[XmlException](../xmlexception/) con un messaggio che indica che i DTD sono proibiti. Questo è il comportamento predefinito. |
| Ignora | 1 | Provoca l'ignorare dell'elemento DOCTYPE. Non avviene alcuna elaborazione dei DTD e il DTD/DOCTYPE viene perso in output. |
| Analizza | 2 | Utilizzato per l'analisi dei DTD. |

## Vedi anche

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
