---
title: "System::Net::HttpWebRequest class"
linktitle: "HttpWebRequest"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::HttpWebRequest. Mewakili permintaan web HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2000
url: /id/cpp/system.net/httpwebrequest/
---
## HttpWebRequest class


Mewakili permintaan web HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class HttpWebRequest : public System::Net::WebRequest
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Abort](./abort/)() override | Membatalkan permintaan saat ini. |
| virtual [AddRange](./addrange/)(int32_t) | Menambahkan header 'Range' ke permintaan saat ini. |
| virtual [AddRange](./addrange/)(System::String, int32_t, int32_t) | Menambahkan header 'Range' ke permintaan saat ini. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Memulai operasi asinkron untuk mendapatkan aliran untuk menulis data ke sumber daya. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Memulai permintaan asinkron untuk sumber daya. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Menunggu hingga operasi asinkron yang ditentukan untuk mendapatkan aliran selesai. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Menunggu hingga permintaan asinkron yang ditentukan untuk sumber daya selesai. |
| [get_Accept](./get_accept/)() | Mendapatkan nilai header HTTP 'Accept'. |
| virtual [get_AllowAutoRedirect](./get_allowautoredirect/)() | Mendapatkan nilai yang menunjukkan apakah permintaan harus mengikuti pengalihan. |
| virtual [get_AllowReadStreamBuffering](./get_allowreadstreambuffering/)() | Mendapatkan nilai yang menunjukkan apakah data yang diterima dari sumber daya harus di-buffer. |
| virtual [get_AllowWriteStreamBuffering](./get_allowwritestreambuffering/)() | Mendapatkan nilai yang menunjukkan apakah buffering diaktifkan untuk mengirim data. |
| virtual [get_ClientCertificates](./get_clientcertificates/)() | Mendapatkan koleksi sertifikat yang terkait dengan permintaan saat ini. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() override | Mendapatkan nama grup koneksi. |
| [get_ContentLength](./get_contentlength/)() override | Mendapatkan jumlah byte data permintaan yang akan dikirim. |
| [get_ContentType](./get_contenttype/)() override | Mendapatkan tipe MIME dari permintaan. |
| [get_ContinueTimeout](./get_continuetimeout/)() | Mendapatkan batas waktu untuk menunggu hingga kode status 100-Continue diterima. |
| virtual [get_CookieContainer](./get_cookiecontainer/)() | Mendapatkan wadah cookie yang terkait dengan permintaan web saat ini. |
| [get_Credentials](./get_credentials/)() override | Mendapatkan informasi autentikasi yang terkait dengan permintaan saat ini. |
| virtual [get_HaveResponse](./get_haveresponse/)() | Mengembalikan nilai yang menunjukkan apakah respons diterima. |
| [get_Headers](./get_headers/)() override | Mendapatkan koleksi header HTTP. |
| virtual [get_KeepAlive](./get_keepalive/)() | Mendapatkan nilai yang menunjukkan apakah permintaan saat ini harus berisi header 'Keep-Alive'. |
| virtual [get_MaximumAutomaticRedirections](./get_maximumautomaticredirections/)() | Mendapatkan jumlah maksimum pengalihan yang diizinkan. |
| [get_Method](./get_method/)() override | Mendapatkan metode HTTP. |
| [get_PreAuthenticate](./get_preauthenticate/)() override | Mendapatkan nilai yang menunjukkan apakah permintaan harus pra-autentikasi. |
| [get_Proxy](./get_proxy/)() override | Mendapatkan proxy HTTP. |
| virtual [get_Referer](./get_referer/)() | Mendapatkan nilai header 'Referer'. |
| [get_RequestUri](./get_requesturi/)() override | Mengembalikan URI permintaan. |
| virtual [get_SendChunked](./get_sendchunked/)() | Mendapatkan nilai yang menunjukkan apakah data harus dikirim dalam segmen. |
| [get_ServicePoint](./get_servicepoint/)() | Mengembalikan titik layanan yang mewakili koneksi jaringan ke sumber daya. |
| virtual [get_SupportsCookieContainer](./get_supportscookiecontainer/)() | Mengembalikan nilai yang menunjukkan apakah permintaan saat ini dapat menggunakan kontainer cookie. |
| [get_Timeout](./get_timeout/)() override | Mendapatkan jumlah waktu dalam milidetik setelah mana permintaan akan kedaluwarsa. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() override | Mendapatkan nilai yang menunjukkan apakah properti 'Credential' sama dengan properti 'DefaultCredentials'. |
| virtual [get_UserAgent](./get_useragent/)() | Mendapatkan nilai dari header 'User-Agent'. |
| [GetRequestStream](./getrequeststream/)() override | Mengembalikan aliran untuk menulis data ke sumber daya. |
| [GetResponse](./getresponse/)() override | Mengembalikan respons web yang terkait dengan permintaan web saat ini. |
| [HttpWebRequest](./httpwebrequest/)(System::SharedPtr\<Uri\>) | Membuat instance baru. |
| [set_Accept](./set_accept/)(String) | Mengatur nilai header HTTP 'Accept'. |
| virtual [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | Mengatur nilai yang menunjukkan apakah permintaan harus mengikuti pengalihan. |
| virtual [set_AllowReadStreamBuffering](./set_allowreadstreambuffering/)(bool) | Mengatur nilai yang menunjukkan apakah data yang diterima dari sumber daya harus di-buffer. |
| virtual [set_AllowWriteStreamBuffering](./set_allowwritestreambuffering/)(bool) | Mengatur nilai yang menunjukkan apakah buffering diaktifkan untuk mengirim data. |
| virtual [set_ClientCertificates](./set_clientcertificates/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>) | Mengatur kumpulan sertifikat yang terkait dengan permintaan saat ini. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) override | Mengatur nama grup koneksi. |
| [set_ContentLength](./set_contentlength/)(int64_t) override | Mengatur jumlah byte data permintaan yang akan dikirim. |
| [set_ContentType](./set_contenttype/)(String) override | Mengatur tipe MIME permintaan. |
| [set_ContinueTimeout](./set_continuetimeout/)(int32_t) | Mengatur batas waktu untuk menunggu hingga kode status 100-Continue diterima. |
| virtual [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | Mengatur kontainer cookie yang terkait dengan permintaan web saat ini. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) override | Mengatur informasi autentikasi yang terkait dengan permintaan saat ini. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | Mengatur kumpulan header HTTP. |
| virtual [set_KeepAlive](./set_keepalive/)(bool) | Mengatur nilai yang menunjukkan apakah permintaan saat ini harus berisi header 'Keep-Alive'. |
| virtual [set_MaximumAutomaticRedirections](./set_maximumautomaticredirections/)(int) | Mengatur jumlah maksimum pengalihan yang diizinkan. |
| [set_Method](./set_method/)(String) override | Mengatur metode HTTP. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) override | Mengatur nilai yang menunjukkan apakah permintaan harus dipra-autentikasi. |
| [set_ProtocolVersion](./set_protocolversion/)(System::Version) | Informasi RTTI. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) override | Mengatur proxy HTTP. |
| virtual [set_Referer](./set_referer/)(System::String) | Menetapkan nilai dari header 'Referer'. |
| virtual [set_SendChunked](./set_sendchunked/)(bool) | Menetapkan nilai yang menunjukkan apakah data harus dikirim dalam segmen. |
| [set_Timeout](./set_timeout/)(int) override | Menetapkan jumlah waktu dalam milidetik setelah itu permintaan akan kedaluwarsa. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) override | Menetapkan nilai yang menunjukkan apakah properti 'Credential' sama dengan properti 'DefaultCredentials'. |
| virtual [set_UserAgent](./set_useragent/)(System::String) | Menetapkan nilai dari header 'User-Agent'. |
## Lihat Juga

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
