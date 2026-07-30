---
title: "System::Net::Http::Headers::HttpHeaders::TryGetValues method"
linktitle: "TryGetValues"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::HttpHeaders::TryGetValues method. Prova a ottenere i valori corrispondenti con il nome specificato in C++."
type: docs
weight: 1900
url: /it/cpp/system.net.http.headers/httpheaders/trygetvalues/
---
## HttpHeaders::TryGetValues method


Tenta di ottenere i valori corrispondenti per il nome specificato.

```cpp
bool System::Net::Http::Headers::HttpHeaders::TryGetValues(String name, System::SharedPtr<Collections::Generic::IEnumerable<String>> &values)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Il nome dell'intestazione. |
| valori | System::SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Un'istanza in cui verranno assegnati i valori corrispondenti. |

### ReturnValue

True quando i valori dell'intestazione sono trovati con il nome specificato, altrimenti false.

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [HttpHeaders](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
