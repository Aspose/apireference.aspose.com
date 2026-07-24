---
title: "Kelas System::Net::FileWebRequest"
linktitle: "FileWebRequest"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::FileWebRequest. Menyediakan implementasi dari kelas abstrak WebRequest untuk bekerja dengan sistem berkas. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.net/filewebrequest/
---
## FileWebRequest class


Menyediakan implementasi dari kelas abstrak [WebRequest](../webrequest/) untuk bekerja dengan sistem berkas. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Abort](./abort/)() override | Membatalkan permintaan saat ini. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Memulai operasi asinkron untuk mendapatkan aliran untuk menulis data ke sumber daya. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Memulai permintaan asinkron untuk sumber daya. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Menunggu hingga operasi asinkron yang ditentukan untuk mendapatkan aliran selesai. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Menunggu hingga permintaan asinkron yang ditentukan untuk sumber daya selesai. |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | Membuat instance baru. |
| [get_ContentType](./get_contenttype/)() override | Mendapatkan tipe MIME dari permintaan. |
| [get_Headers](./get_headers/)() override | Mendapatkan koleksi header HTTP. |
| [get_Method](./get_method/)() override | Mendapatkan metode HTTP. |
| [get_RequestUri](./get_requesturi/)() override | Mengembalikan URI permintaan. |
| [GetResponse](./getresponse/)() override | Mengembalikan respons web yang terkait dengan permintaan web saat ini. |
| [set_ContentType](./set_contenttype/)(String) override | Mengatur tipe MIME permintaan. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | Mengatur kumpulan header HTTP. |
| [set_Method](./set_method/)(String) override | Mengatur metode HTTP. |
| [set_Timeout](./set_timeout/)(int) override | Informasi RTTI. |
## Lihat Juga

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
