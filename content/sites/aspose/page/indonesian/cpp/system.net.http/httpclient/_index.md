---
title: "Kelas System::Net::Http::HttpClient"
linktitle: "HttpClient"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::Http::HttpClient. Mewakili kelas dasar dari klien HTTP untuk mengirim permintaan dan menerima respons. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.net.http/httpclient/
---
## HttpClient class


Mewakili kelas dasar dari klien HTTP untuk mengirim permintaan dan menerima respons. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | Membatalkan semua permintaan yang tertunda. |
| [get_BaseAddress](./get_baseaddress/)() | Mendapatkan alamat dasar sumber daya yang digunakan untuk mengirim permintaan. |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | Informasi RTTI. |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | Mendapatkan jumlah maksimum byte dari konten respons. |
| [get_Timeout](./get_timeout/)() | Mendapatkan rentang waktu yang harus ditunggu sebelum permintaan kedaluwarsa. |
| [HttpClient](./httpclient/)() | Membuat instance baru. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | Membuat instance baru. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Membuat instance baru. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | Mengirim permintaan HTTP yang ditentukan. |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | Mengatur alamat dasar sumber daya yang digunakan untuk mengirim permintaan. |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | Mengatur jumlah maksimum byte dari konten respons. |
| [set_Timeout](./set_timeout/)(TimeSpan) | Mengatur rentang waktu yang harus ditunggu sebelum permintaan kedaluwarsa. |
## Lihat Juga

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
