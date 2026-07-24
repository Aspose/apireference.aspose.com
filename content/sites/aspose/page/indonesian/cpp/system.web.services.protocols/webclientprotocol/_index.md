---
title: "System::Web::Services::Protocols::WebClientProtocol kelas"
linktitle: "WebClientProtocol"
second_title: "Aspose.Page untuk C++"
description: "System::Web::Services::Protocols::WebClientProtocol kelas. Kelas dasar ini digunakan dalam semua proxy klien layanan Web XML yang dibuat menggunakan ASP.NET. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen di C++."
type: docs
weight: 1100
url: /id/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


Kelas dasar ini digunakan dalam semua proxy klien layanan [Web](../../system.web/) XML yang dibuat menggunakan ASP.NET. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class WebClientProtocol : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Abort](./abort/)() | Membatalkan permintaan. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | Mendapatkan nama grup koneksi. |
| [get_Credentials](./get_credentials/)() | Mendapatkan informasi autentikasi. |
| [get_PreAuthenticate](./get_preauthenticate/)() | Mendapatkan nilai yang menunjukkan apakah pra-otentikasi diaktifkan. |
| [get_RequestEncoding](./get_requestencoding/)() | Mendapatkan enkoding yang digunakan untuk membuat permintaan klien. |
| [get_Timeout](./get_timeout/)() | Mendapatkan rentang waktu yang harus ditunggu sebelum permintaan kedaluwarsa. |
| [get_Uri](./get_uri/)() | Mendapatkan URI layanan XML [Web](../../system.web/). |
| [get_Url](./get_url/)() | Mendapatkan URL layanan XML [Web](../../system.web/). |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Mendapatkan nilai yang menunjukkan apakah properti 'Credential' sama dengan properti 'DefaultCredentials'. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | Mengatur nama grup koneksi. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | Mengatur informasi autentikasi. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | Mengatur nilai yang menunjukkan apakah pra-otentikasi diaktifkan. |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | Mengatur enkoding yang digunakan untuk membuat permintaan klien. |
| [set_Timeout](./set_timeout/)(int32_t) | Mengatur rentang waktu yang harus ditunggu sebelum permintaan kedaluwarsa. |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | Mengatur URI layanan XML [Web](../../system.web/). |
| [set_Url](./set_url/)(String) | Mengatur URL layanan XML [Web](../../system.web/). |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Menetapkan nilai yang menunjukkan apakah properti 'Credential' sama dengan properti 'DefaultCredentials'. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
