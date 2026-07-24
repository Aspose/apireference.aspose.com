---
title: "System::Net::Http::HttpRequestMessage class"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::HttpRequestMessage class. Mewakili pesan permintaan HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 800
url: /id/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


Mewakili pesan permintaan HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class HttpRequestMessage : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Dispose](./dispose/)() override | Membuang instance saat ini. Metode ini juga membuang konten permintaan HTTP. |
| [get_Content](./get_content/)() | Mendapatkan konten permintaan HTTP. |
| [get_Headers](./get_headers/)() | Mengembalikan header konten HTTP. |
| [get_Method](./get_method/)() | Mendapatkan metode permintaan HTTP. |
| [get_Properties](./get_properties/)() | Mengembalikan koleksi properti permintaan HTTP. |
| [get_RequestUri](./get_requesturi/)() | Mendapatkan URI dari sumber daya yang diminta. |
| [get_Version](./get_version/)() | Informasi RTTI. |
| [HttpRequestMessage](./httprequestmessage/)() | Membuat instance baru. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | Membuat instance baru. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | Membuat instance baru. |
| [MarkAsSent](./markassent/)() | Menandai permintaan saat ini sebagai terkirim. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Mengatur konten permintaan HTTP. |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | Mengatur metode permintaan HTTP. |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | Mengatur URI dari sumber daya yang diminta. |
| [set_Version](./set_version/)(System::Version) | Mengatur versi HTTP. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
