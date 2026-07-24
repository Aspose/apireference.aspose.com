---
title: "System::Net::Http::HttpMessageInvoker kelas"
linktitle: "HttpMessageInvoker"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::HttpMessageInvoker kelas. Memungkinkan aplikasi memanggil metode Send pada rantai penangan HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


Memungkinkan aplikasi memanggil metode Send pada rantai penangan HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Dispose](./dispose/)() override | Membuang instance saat ini. Metode ini juga membuang handler jika diperlukan. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | Informasi RTTI. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Membuat instance baru. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | Mengirim permintaan yang ditentukan. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
