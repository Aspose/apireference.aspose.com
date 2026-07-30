---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength Methode"
linktitle: "GetTransferCodingLength"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength Methode. Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der TransferCodingHeaderValue-Klasse in C++."
type: docs
weight: 700
url: /de/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [TransferCodingHeaderValue](../)-Klasse.

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | String | Ein zu parsender String. |
| startIndex | int32_t | Eine Startposition für das Parsen. |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | Eine Instanz, in der ein geparstes Objekt zugewiesen wird. |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | Der Delegat, der verwendet wird, um Instanzen der [TransferCodingHeaderValue](../)-Klasse zu erstellen. |

### ReturnValue

Gibt die Länge eines geparsten Teilstrings zurück, andernfalls 0.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
