---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength metodu"
linktitle: "GetTransferCodingLength"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength metodu. Belirtilen indeksden geçirilen bir dizeyi C++'ta TransferCodingHeaderValue sınıfının bir örneğine dönüştürür."
type: docs
weight: 700
url: /tr/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


Belirtilen indeksden geçirilen bir dizeyi [TransferCodingHeaderValue](../) sınıfının bir örneğine dönüştürür.

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | Dize | Ayrıştırılacak bir dize. |
| startIndex | int32_t | Ayrıştırma için bir başlangıç konumu. |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | Ayrıştırılmış bir nesnenin atanacağı bir örnek. |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | [TransferCodingHeaderValue](../) sınıfının örneklerini oluşturmak için kullanılan temsilci. |

### ReturnValue

Ayrıştırılmış bir alt dizenin uzunluğunu döndürür, aksi takdirde 0.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
