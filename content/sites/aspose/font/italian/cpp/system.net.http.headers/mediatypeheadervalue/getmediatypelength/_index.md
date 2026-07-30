---
title: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength metodo"
linktitle: "GetMediaTypeLength"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength metodo. Converte una stringa passata dall'indice specificato in un'istanza della classe MediaTypeHeaderValue in C++."
type: docs
weight: 1000
url: /it/cpp/system.net.http.headers/mediatypeheadervalue/getmediatypelength/
---
## MediaTypeHeaderValue::GetMediaTypeLength method


Converte una stringa passata dall'indice specificato in un'istanza della classe [MediaTypeHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<MediaTypeHeaderValue>> mediaTypeCreator, System::SharedPtr<MediaTypeHeaderValue> &parsedValue)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | Stringa | Una stringa da analizzare. |
| startIndex | int32_t | Una posizione iniziale per l'analisi. |
| mediaTypeCreator | HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\> | Il delegato utilizzato per creare istanze della classe [MediaTypeHeaderValue](../). |
| parsedValue | System::SharedPtr\<MediaTypeHeaderValue\>\& | Un'istanza in cui verrà assegnato un oggetto analizzato. |

### ReturnValue

Restituisce la lunghezza di una sottostringa analizzata, altrimenti 0.

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MediaTypeHeaderValue](../)
* Class [MediaTypeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
