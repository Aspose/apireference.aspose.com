---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength μέθοδος"
linktitle: "GetTransferCodingLength"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength μέθοδος. Μετατρέπει μια δοσμένη συμβολοσειρά από το καθορισμένο δείκτη σε μια παρουσία της κλάσης TransferCodingHeaderValue σε C++."
type: docs
weight: 700
url: /el/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


Μετατρέπει μια δοσμένη συμβολοσειρά από το καθορισμένο δείκτη σε μια παρουσία της κλάσης [TransferCodingHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εισόδους | String | Μια συμβολοσειρά για ανάλυση. |
| startIndex | int32_t | Μια θέση έναρξης για ανάλυση. |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | Μια παρουσία όπου θα εκχωρηθεί ένα αναλυμένο αντικείμενο. |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | Ο εκχωρητής που χρησιμοποιείται για τη δημιουργία παρουσιών της κλάσης [TransferCodingHeaderValue](../). |

### ReturnValue

Επιστρέφει το μήκος μιας αναλυμένης υποσυμβολοσειράς, διαφορετικά 0.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
