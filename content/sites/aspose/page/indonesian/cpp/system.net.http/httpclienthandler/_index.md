---
title: "System::Net::Http::HttpClientHandler class"
linktitle: "HttpClientHandler"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::HttpClientHandler class. Mewakili penangan pesan default yang digunakan oleh kelas HttpClient. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


Mewakili penangan pesan default yang digunakan oleh kelas [HttpClient](../httpclient/). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Dispose](./dispose/)() override | Tidak melakukan apa-apa. |
| [get_CookieContainer](./get_cookiecontainer/)() | Mendapatkan kontainer cookie yang digunakan untuk menyimpan cookie server. |
| [get_Credentials](./get_credentials/)() | Mendapatkan informasi autentikasi. |
| [HttpClientHandler](./httpclienthandler/)() | Informasi RTTI. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | Informasi RTTI. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Mengatur kontainer cookie yang digunakan untuk menyimpan cookie server. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Mengatur informasi autentikasi. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Mengatur informasi proxy. |
| [set_Timeout](./set_timeout/)(int32_t) | Mendapatkan jumlah waktu dalam milidetik setelah mana permintaan akan kedaluwarsa. |
| [set_UseCookies](./set_usecookies/)(bool) | Mengatur nilai yang menunjukkan apakah instance saat ini menggunakan kontainer cookie untuk menyimpan cookie server dan apakah instance menggunakan cookie server saat mengirim permintaan. |
| [set_UseProxy](./set_useproxy/)(bool) | Mengatur nilai yang menunjukkan apakah instance saat ini menggunakan proxy untuk mengirim permintaan. |
## Lihat Juga

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
