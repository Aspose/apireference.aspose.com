---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength method"
linktitle: "GetNameValueLength"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength method. Converte una stringa passata dall'indice specificato in un'istanza della classe NameValueHeaderValue in C++."
type: docs
weight: 900
url: /it/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelength/
---
## NameValueHeaderValue::GetNameValueLength(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) method


Converte una stringa passata dall'indice specificato in un'istanza della classe [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<NameValueHeaderValue>> nameValueCreator, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | Stringa | Una stringa da analizzare. |
| startIndex | int32_t | Una posizione iniziale per l'analisi. |
| nameValueCreator | HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\> | Una funzione utilizzata per creare nuove istanze della classe [NameValueHeaderValue](../). |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Un'istanza in cui verrà assegnato un oggetto analizzato. |

### ReturnValue

Restituisce la lunghezza di una sottostringa analizzata, altrimenti 0.

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
## NameValueHeaderValue::GetNameValueLength(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) method


Converte una stringa passata dall'indice specificato in un'istanza della classe [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | Stringa | Una stringa da analizzare. |
| startIndex | int32_t | Una posizione iniziale per l'analisi. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Un'istanza in cui verrà assegnato un oggetto analizzato. |

### ReturnValue

Restituisce la lunghezza di una sottostringa analizzata, altrimenti 0.

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
