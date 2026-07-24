---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength metode"
linktitle: "GetNameValueLength"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength metode. Mengonversi string yang diberikan dari indeks yang ditentukan menjadi instance kelas NameValueHeaderValue dalam C++."
type: docs
weight: 900
url: /id/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelength/
---
## NameValueHeaderValue::GetNameValueLength(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) method


Mengonversi string yang diberikan dari indeks yang ditentukan menjadi sebuah instance dari kelas [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<NameValueHeaderValue>> nameValueCreator, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | String | String untuk diparse. |
| startIndex | int32_t | Posisi awal untuk parsing. |
| nameValueCreator | HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\> | Fungsi yang digunakan untuk membuat instance baru dari kelas [NameValueHeaderValue](../). |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Sebuah instance dimana objek yang diurai akan ditempatkan. |

### ReturnValue

Mengembalikan panjang substring yang diurai, jika tidak 0.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
## NameValueHeaderValue::GetNameValueLength(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) method


Mengonversi string yang diberikan dari indeks yang ditentukan menjadi sebuah instance dari kelas [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| masukan | String | String untuk diparse. |
| startIndex | int32_t | Posisi awal untuk parsing. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Sebuah instance dimana objek yang diurai akan ditempatkan. |

### ReturnValue

Mengembalikan panjang substring yang diurai, jika tidak 0.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
