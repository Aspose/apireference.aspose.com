---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength méthode"
linktitle: "GetTransferCodingLength"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength méthode. Convertit une chaîne passée depuis l'index spécifié en une instance de la classe TransferCodingHeaderValue en C++."
type: docs
weight: 700
url: /fr/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


Convertit une chaîne passée depuis l'index spécifié en une instance de la classe [TransferCodingHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | String | Une chaîne à analyser. |
| startIndex | int32_t | Une position de départ pour l'analyse. |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | Une instance où un objet analysé sera assigné. |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | Le délégué utilisé pour créer des instances de la classe [TransferCodingHeaderValue](../). |

### ReturnValue

Renvoie la longueur d'une sous-chaîne analysée, sinon 0.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
