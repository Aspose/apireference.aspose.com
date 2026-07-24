---
title: "System::Net::Http::HttpResponseMessage kelas"
linktitle: "HttpResponseMessage"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::HttpResponseMessage kelas. Mewakili pesan respons HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


Mewakili pesan respons HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class HttpResponseMessage : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Dispose](./dispose/)() override | Membuang instance saat ini. Metode ini juga membuang konten respons HTTP. |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | Memeriksa kode status. [HttpRequestException](../httprequestexception/) akan dilemparkan ketika kode status tidak termasuk dalam 2xx. |
| [get_Content](./get_content/)() const | Mendapatkan konten respons HTTP. |
| [get_Headers](./get_headers/)() const | Mengembalikan header konten HTTP. |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | Memeriksa apakah kode status menunjukkan bahwa tindakan yang diminta oleh klien telah diterima, dipahami, dan disetujui. |
| [get_ReasonPhrase](./get_reasonphrase/)() const | Mendapatkan Reason-Phrase yang dikirim oleh server bersama dengan kode status. |
| [get_RequestMessage](./get_requestmessage/)() const | Mendapatkan pesan permintaan HTTP. |
| [get_StatusCode](./get_statuscode/)() const | Mendapatkan kode status HTTP. |
| [get_Version](./get_version/)() const | Informasi RTTI. |
| [HttpResponseMessage](./httpresponsemessage/)() | Membuat instance baru. |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | Membuat instance baru. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Mengatur konten respons HTTP. |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | Mengatur Reason-Phrase yang dikirim oleh server bersama dengan kode status. |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | Mengatur pesan permintaan HTTP. |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | Mengatur kode status HTTP. |
| [set_Version](./set_version/)(System::Version) | Mengatur versi HTTP. |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
