---
title: "kelas System::Net::WebRequest"
linktitle: "WebRequest"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::WebRequest. Mewakili permintaan web. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3800
url: /id/cpp/system.net/webrequest/
---
## WebRequest class


Mewakili permintaan web. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class WebRequest : public virtual System::Object
```

## Nested classes

* Class [HttpRequestCreator](./httprequestcreator/)
* Class [WebRequestPrefixElement](./webrequestprefixelement/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Abort](./abort/)() | Membatalkan permintaan saat ini. |
| virtual [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi asinkron untuk mendapatkan aliran untuk menulis data ke sumber daya. |
| virtual [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) | Memulai permintaan asinkron untuk sumber daya. |
| static [Create](./create/)(String) | Membuat instance baru dari kelas [WebRequest](./) menggunakan URI yang ditentukan. |
| static [Create](./create/)(System::SharedPtr\<Uri\>) | Membuat instance baru dari kelas [WebRequest](./) menggunakan URI yang ditentukan. |
| static [CreateDefault](./createdefault/)(System::SharedPtr\<Uri\>) | Membuat turunan [WebRequest](./) untuk skema URI yang ditentukan. |
| static [CreateHttp](./createhttp/)(String) | Membuat instance baru dari kelas [WebRequest](./) menggunakan URI yang ditentukan. |
| static [CreateHttp](./createhttp/)(System::SharedPtr\<Uri\>) | Membuat instance baru dari kelas [WebRequest](./) menggunakan URI yang ditentukan. |
| virtual [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga operasi asinkron yang ditentukan untuk mendapatkan aliran selesai. |
| virtual [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga permintaan asinkron yang ditentukan untuk sumber daya selesai. |
| virtual [get_CachePolicy](./get_cachepolicy/)() | Mendapatkan kebijakan cache. |
| virtual [get_ConnectionGroupName](./get_connectiongroupname/)() | Mendapatkan nama grup koneksi. |
| virtual [get_ContentLength](./get_contentlength/)() | Mendapatkan jumlah byte data permintaan yang akan dikirim. |
| virtual [get_ContentType](./get_contenttype/)() | Mendapatkan tipe MIME dari permintaan. |
| virtual [get_Credentials](./get_credentials/)() | Mendapatkan informasi autentikasi yang terkait dengan permintaan saat ini. |
| static [get_DefaultWebProxy](./get_defaultwebproxy/)() | Mendapatkan proxy HTTP global. |
| virtual [get_Headers](./get_headers/)() | Mendapatkan koleksi header HTTP. |
| virtual [get_Method](./get_method/)() | Mendapatkan metode HTTP. |
| virtual [get_PreAuthenticate](./get_preauthenticate/)() | Mendapatkan nilai yang menunjukkan apakah permintaan harus pra-autentikasi. |
| static [get_PrefixList](./get_prefixlist/)() | Mendapatkan daftar prefiks. |
| virtual [get_Proxy](./get_proxy/)() | Mendapatkan proxy HTTP. |
| virtual [get_RequestUri](./get_requesturi/)() | Mengembalikan URI permintaan. |
| virtual [get_Timeout](./get_timeout/)() | Mendapatkan jumlah waktu dalam milidetik setelah mana permintaan akan kedaluwarsa. |
| virtual [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | Mendapatkan nilai yang menunjukkan apakah properti 'Credential' sama dengan properti 'DefaultCredentials'. |
| virtual [GetRequestStream](./getrequeststream/)() | Mengembalikan aliran untuk menulis data ke sumber daya. |
| virtual [GetResponse](./getresponse/)() | Mengembalikan respons web yang terkait dengan permintaan web saat ini. |
| static [RegisterPrefix](./registerprefix/)(String, System::SharedPtr\<IWebRequestCreate\>) | Mendaftarkan turunan [WebRequest](./) untuk URI yang ditentukan. |
| virtual [set_CachePolicy](./set_cachepolicy/)(System::SharedPtr\<System::Net::Cache::RequestCachePolicy\>) | Mengatur kebijakan cache. |
| virtual [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) | Mengatur nama grup koneksi. |
| virtual [set_ContentLength](./set_contentlength/)(int64_t) | Mengatur jumlah byte data permintaan yang akan dikirim. |
| virtual [set_ContentType](./set_contenttype/)(String) | Mengatur tipe MIME permintaan. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | Mengatur informasi autentikasi yang terkait dengan permintaan saat ini. |
| static [set_DefaultWebProxy](./set_defaultwebproxy/)(System::SharedPtr\<IWebProxy\>) | Mengatur proxy HTTP global. |
| virtual [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) | Mengatur kumpulan header HTTP. |
| virtual [set_Method](./set_method/)(String) | Mengatur metode HTTP. |
| virtual [set_PreAuthenticate](./set_preauthenticate/)(bool) | Mengatur nilai yang menunjukkan apakah permintaan harus dipra-autentikasi. |
| static [set_PrefixList](./set_prefixlist/)(System::SharedPtr\<Collections::Generic::List\<System::SharedPtr\<WebRequest::WebRequestPrefixElement\>\>\>) | Mengatur daftar prefiks. |
| virtual [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | Mengatur proxy HTTP. |
| virtual [set_Timeout](./set_timeout/)(int32_t) | Menetapkan jumlah waktu dalam milidetik setelah itu permintaan akan kedaluwarsa. |
| virtual [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | Menetapkan nilai yang menunjukkan apakah properti 'Credential' sama dengan properti 'DefaultCredentials'. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
