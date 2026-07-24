---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength method"
linktitle: "GetTransferCodingLength"
second_title: "Aspose.Page için C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength method. Belirtilen indeksden geçirilen bir dizeyi C++'de TransferCodingHeaderValue sınıfının bir örneğine dönüştürür."
type: docs
weight: 700
url: /tr/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


Belirtilen indeksden geçirilen bir dizeyi [TransferCodingHeaderValue](../) sınıfının bir örneğine dönüştürür.

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| girdi | String | Ayrıştırılacak bir dize. |
| startIndex | int32_t | Ayrıştırma için başlangıç konumu. |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | Ayrıştırılmış bir nesnenin atanacağı bir örnek. |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | Örnekleri oluşturmak için kullanılan [TransferCodingHeaderValue](../) sınıfının temsilcisi. |

### ReturnValue

Ayrıştırılmış bir alt dize uzunluğunu döndürür, aksi takdirde 0.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
