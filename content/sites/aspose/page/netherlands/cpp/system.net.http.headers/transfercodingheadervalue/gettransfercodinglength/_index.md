---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength methode"
linktitle: "GetTransferCodingLength"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength methode. Converteert een doorgegeven tekenreeks vanaf de opgegeven index naar een instantie van de TransferCodingHeaderValue-klasse in C++."
type: docs
weight: 700
url: /nl/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


Converteert een doorgegeven tekenreeks vanaf de opgegeven index naar een instantie van de [TransferCodingHeaderValue](../) klasse.

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| invoer | String | Een tekenreeks om te parseren. |
| startIndex | int32_t | Een startpositie voor het parseren. |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | Een instantie waar een geparseerd object aan wordt toegewezen. |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | De delegate die wordt gebruikt om instanties van de [TransferCodingHeaderValue](../) klasse te maken. |

### ReturnValue

Retourneert de lengte van een geparseerde subtekenreeks, anders 0.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
