---
title: "kelas System::Net::Http::Headers::HttpContentHeaders"
linktitle: "HttpContentHeaders"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Net::Http::Headers::HttpContentHeaders. Mewakili koleksi header ''Content''. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


Mewakili koleksi header 'Content'. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Menambahkan header yang dikenal ke koleksi yang ditentukan. |
| [get_Allow](./get_allow/)() | Informasi RTTI. |
| [get_ContentDisposition](./get_contentdisposition/)() | Mendapatkan nilai dari header 'Content-Disposition'. |
| [get_ContentEncoding](./get_contentencoding/)() | Mendapatkan nilai dari header 'Content-Encoding'. |
| [get_ContentLanguage](./get_contentlanguage/)() | Mendapatkan nilai dari header 'Content-Language'. |
| [get_ContentLength](./get_contentlength/)() | Mendapatkan nilai dari header 'Content-Length'. |
| [get_ContentLocation](./get_contentlocation/)() | Mendapatkan nilai dari header 'Content-Location'. |
| [get_ContentMD5](./get_contentmd5/)() | Mendapatkan nilai dari header 'Content-MD5'. |
| [get_ContentRange](./get_contentrange/)() | Mendapatkan nilai dari header 'Content-Range'. |
| [get_ContentType](./get_contenttype/)() | Mendapatkan nilai dari header 'Content-Type'. |
| [get_Expires](./get_expires/)() | Mendapatkan nilai dari header 'Expires'. |
| [get_LastModified](./get_lastmodified/)() | Mendapatkan nilai dari header 'Last-Modified'. |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | Membuat instance baru. |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | Menetapkan nilai pada header 'Content-Disposition'. |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | Menetapkan nilai pada header 'Content-Length'. |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | Menetapkan nilai pada header 'Content-Location'. |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | Menetapkan nilai pada header 'Content-MD5'. |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | Menetapkan nilai pada header 'Content-Range'. |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | Menetapkan nilai pada header 'Content-Type'. |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | Menetapkan nilai pada header 'Expires'. |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | Menetapkan nilai pada header 'Last-Modified'. |
## Lihat Juga

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
