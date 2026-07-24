---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength method"
linktitle: "GetTransferCodingLength"
second_title: "Aspose.Page per C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength method. Converte una stringa passata dall'indice specificato in un'istanza della classe TransferCodingHeaderValue in C++."
type: docs
weight: 700
url: /it/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


Converte una stringa passata dall'indice specificato in un'istanza della classe [TransferCodingHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | String | Una stringa da analizzare. |
| startIndex | int32_t | Una posizione iniziale per l'analisi. |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | Un'istanza in cui verrà assegnato un oggetto analizzato. |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | Il delegato usato per creare istanze della classe [TransferCodingHeaderValue](../). |

### ReturnValue

Restituisce la lunghezza di una sottostringa analizzata, altrimenti 0.

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
