---
title: "System::Net::WebProxy class"
linktitle: "WebProxy"
second_title: "Aspose.Page untuk C++"
description: "System::Net::WebProxy class. Mewakili server web-proxy http. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3700
url: /id/cpp/system.net/webproxy/
---
## WebProxy class


Mewakili server web-proxy http. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class WebProxy : public System::Net::IWebProxy
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Address](./get_address/)() | Mendapatkan alamat server proxy saat ini. |
| [get_BypassList](./get_bypasslist/)() | Mendapatkan daftar alamat yang tidak menggunakan server proxy. |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | Mendapatkan nilai yang menunjukkan apakah server proxy harus digunakan untuk alamat lokal. |
| virtual [get_Credentials](./get_credentials/)() | Mendapatkan kredensial yang dikirim ke server proxy untuk otentikasi. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Mendapatkan nilai yang menunjukkan apakah kredensial default harus dikirim bersama permintaan. |
| static [GetDefaultProxy](./getdefaultproxy/)() | Mengembalikan proxy yang menggunakan pengaturan non-dinamis Internet Explorer. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Mengembalikan URI yang diproksi untuk permintaan web. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | Memeriksa apakah server proxy tidak digunakan untuk URI yang ditentukan. |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | Mengatur alamat server proxy saat ini. |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | Mengatur daftar alamat yang tidak menggunakan server proxy. |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | Mengatur nilai yang menunjukkan apakah server proxy harus digunakan untuk alamat lokal. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Mengatur kredensial yang dikirim ke server proxy untuk otentikasi. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Mengatur nilai yang menunjukkan apakah kredensial default harus dikirim bersama permintaan. |
| [WebProxy](./webproxy/)() | Membuat instance baru. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | Membuat instance baru. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | Membuat instance baru. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | Membuat instance baru. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Membuat instance baru. |
| [WebProxy](./webproxy/)(String, int32_t) | Membuat instance baru. |
| [WebProxy](./webproxy/)(String) | Membuat instance baru. |
| [WebProxy](./webproxy/)(String, bool) | Membuat instance baru. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | Membuat instance baru. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | Membuat instance baru. |
## Lihat Juga

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
