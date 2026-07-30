---
title: "Metodo GetChildRows di System::Data::DataRow"
linktitle: "GetChildRows"
second_title: "Aspose.Font per C++"
description: "Metodo GetChildRows di System::Data::DataRow. Ottiene le righe considerate figlie tramite la relazione specificata in C++."
type: docs
weight: 200
url: /it/cpp/system.data/datarow/getchildrows/
---
## DataRow::GetChildRows method


Ottiene le righe considerate figlie tramite la relazione specificata.

```cpp
System::ArrayPtr<System::SharedPtr<System::Data::DataRow>> System::Data::DataRow::GetChildRows(const System::SharedPtr<System::Data::DataRelation> &relation)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| relation | const System::SharedPtr\<System::Data::DataRelation\>\& | Oggetto di relazione per specificare la relazione riga genitore - riga figlio. |

### ReturnValue

[Array](../../../system/array/) of child rows retreived.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DataRow](../)
* Class [DataRelation](../../datarelation/)
* Class [DataRow](../)
* Namespace [System::Data](../../)
* Library [Aspose.Font for C++](../../../)
