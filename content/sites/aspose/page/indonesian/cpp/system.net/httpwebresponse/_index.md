---
title: "System::Net::HttpWebResponse kelas"
linktitle: "HttpWebResponse"
second_title: "Aspose.Page untuk C++"
description: "System::Net::HttpWebResponse kelas. Mewakili respons web HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2100
url: /id/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


Mewakili respons web HTTP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Tutup aliran respons. |
| [get_CharacterSet](./get_characterset/)() | Tidak diimplementasikan. |
| [get_ContentLength](./get_contentlength/)() override | Informasi RTTI. |
| [get_ContentType](./get_contenttype/)() override | Mengembalikan tipe MIME dari sumber daya. |
| virtual [get_Cookies](./get_cookies/)() | Mengembalikan cookie yang terkait dengan respons web. |
| [get_Headers](./get_headers/)() override | Mengembalikan koleksi header yang terkait dengan respons saat ini. |
| virtual [get_Method](./get_method/)() | Mengembalikan metode HTTP. |
| [get_ResponseUri](./get_responseuri/)() override | Mengembalikan URI sumber daya. |
| virtual [get_StatusCode](./get_statuscode/)() | Mengembalikan kode status HTTP yang terkait dengan respons web. |
| virtual [get_StatusDescription](./get_statusdescription/)() | Mengembalikan representasi string dari kode status. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Mengembalikan nilai yang menunjukkan apakah respons saat ini mendukung header. |
| [GetResponseHeader](./getresponseheader/)(String) | Mengembalikan nilai yang sesuai untuk nama header yang ditentukan. |
| [GetResponseStream](./getresponsestream/)() override | Mengembalikan aliran respons. |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | Membuat instance baru. |
## Lihat Juga

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
