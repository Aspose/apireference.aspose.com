---
title: "Kelas System::Net::WebResponse"
linktitle: "WebResponse"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::WebResponse. Mewakili respons web. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen di C++."
type: docs
weight: 4000
url: /id/cpp/system.net/webresponse/
---
## WebResponse class


Mewakili respons web. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class WebResponse : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Close](./close/)() | Tutup aliran respons. |
| [Dispose](./dispose/)() override | Tidak melakukan apa-apa. |
| virtual [get_ContentLength](./get_contentlength/)() | Informasi RTTI. |
| virtual [get_ContentType](./get_contenttype/)() | Mengembalikan tipe MIME dari sumber daya. |
| virtual [get_Headers](./get_headers/)() | Mengembalikan koleksi header yang terkait dengan respons saat ini. |
| virtual [get_ResponseUri](./get_responseuri/)() | Mengembalikan URI sumber daya. |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | Mengembalikan nilai yang menunjukkan apakah respons saat ini mendukung header. |
| virtual [GetResponseStream](./getresponsestream/)() | Mengembalikan aliran respons. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
