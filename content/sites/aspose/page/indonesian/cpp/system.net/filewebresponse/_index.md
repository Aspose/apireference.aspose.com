---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "Aspose.Page untuk C++"
description: "System::Net::FileWebResponse class. Menyediakan implementasi kelas abstrak WebResponse untuk bekerja dengan sistem berkas. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Menawarkan implementasi kelas abstrak [WebResponse](../webresponse/) untuk bekerja dengan sistem berkas. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Tutup aliran respons. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | Membuat instance baru. |
| [get_ContentLength](./get_contentlength/)() override | Informasi RTTI. |
| [get_ContentType](./get_contenttype/)() override | Mengembalikan tipe MIME dari sumber daya. |
| [get_Headers](./get_headers/)() override | Mengembalikan koleksi header yang terkait dengan respons saat ini. |
| [get_ResponseUri](./get_responseuri/)() override | Mengembalikan URI sumber daya. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Mengembalikan nilai yang menunjukkan apakah respons saat ini mendukung header. |
| [GetResponseStream](./getresponsestream/)() override | Mengembalikan aliran respons. |
## Lihat Juga

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
