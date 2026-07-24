---
title: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength metode"
linktitle: "GetMediaTypeLength"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength metode. Mengonversi string yang diberikan dari indeks yang ditentukan menjadi instance dari kelas MediaTypeHeaderValue dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.net.http.headers/mediatypeheadervalue/getmediatypelength/
---
## MediaTypeHeaderValue::GetMediaTypeLength method


Mengonversi string yang diberikan dari indeks yang ditentukan menjadi instance dari kelas [MediaTypeHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<MediaTypeHeaderValue>> mediaTypeCreator, System::SharedPtr<MediaTypeHeaderValue> &parsedValue)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | String | String untuk diparse. |
| startIndex | int32_t | Posisi awal untuk parsing. |
| mediaTypeCreator | HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\> | Delegasi yang digunakan untuk membuat instance kelas [MediaTypeHeaderValue](../). |
| parsedValue | System::SharedPtr\<MediaTypeHeaderValue\>\& | Sebuah instance dimana objek yang diurai akan ditempatkan. |

### ReturnValue

Mengembalikan panjang substring yang diurai, jika tidak 0.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MediaTypeHeaderValue](../)
* Class [MediaTypeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
