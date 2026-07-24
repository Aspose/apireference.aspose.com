---
title: "kelas System::Web::Services::Protocols::HttpWebClientProtocol"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Web::Services::Protocols::HttpWebClientProtocol. Kelas dasar ini digunakan dalam semua proksi klien layanan XML Web yang menggunakan HTTP. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


Kelas dasar ini digunakan dalam semua proksi klien layanan XML [Web](../../system.web/) yang menggunakan HTTP. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | Menambahkan cookie dari permintaan yang ditentukan ke dalam kontainer cookie internal. |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | Mendapatkan nilai yang menunjukkan apakah klien mengikuti pengalihan server. |
| [get_ClientCertificates](./get_clientcertificates/)() | Mengembalikan koleksi sertifikat klien. |
| [get_CookieContainer](./get_cookiecontainer/)() | Mendapatkan kontainer yang digunakan untuk menyimpan cookie. |
| [get_EnableDecompression](./get_enabledecompression/)() | Mendapatkan nilai yang menunjukkan apakah dekompresi diaktifkan. |
| [get_Proxy](./get_proxy/)() | Mendapatkan informasi proxy. |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | Mendapatkan nilai yang menunjukkan apakah berbagi koneksi diaktifkan ketika klien menggunakan autentikasi NTLM. |
| [get_UserAgent](./get_useragent/)() | Mendapatkan nilai dari header 'User-Agent'. |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Mengatur nilai yang menunjukkan apakah klien mengikuti pengalihan server. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Mengatur kontainer yang digunakan untuk menyimpan cookie. |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | Mengatur nilai yang menunjukkan apakah dekompresi diaktifkan. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | Mengatur informasi proxy. |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | Mengatur nilai yang menunjukkan apakah berbagi koneksi diaktifkan ketika klien menggunakan autentikasi NTLM. |
| [set_UserAgent](./set_useragent/)(String) | Menetapkan nilai dari header 'User-Agent'. |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## Lihat Juga

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
