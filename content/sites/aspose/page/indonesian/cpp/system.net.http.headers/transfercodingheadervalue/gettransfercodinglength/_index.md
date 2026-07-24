---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength method"
linktitle: "GetTransferCodingLength"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength method. Mengonversi string yang diberikan dari indeks yang ditentukan menjadi instance dari kelas TransferCodingHeaderValue dalam C++."
type: docs
weight: 700
url: /id/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


Mengonversi string yang diberikan dari indeks yang ditentukan menjadi instance dari kelas [TransferCodingHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | String | String untuk diparse. |
| startIndex | int32_t | Posisi awal untuk parsing. |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | Sebuah instance dimana objek yang diurai akan ditempatkan. |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | Delegasi yang digunakan untuk membuat instance dari kelas [TransferCodingHeaderValue](../). |

### ReturnValue

Mengembalikan panjang substring yang diurai, jika tidak 0.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
