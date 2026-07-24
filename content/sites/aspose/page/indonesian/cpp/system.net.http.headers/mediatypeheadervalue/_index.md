---
title: "Kelas System::Net::Http::Headers::MediaTypeHeaderValue"
linktitle: "MediaTypeHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::Http::Headers::MediaTypeHeaderValue. Mewakili tipe MIME dalam nilai header ''Content-Type''. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


Mewakili tipe MIME dalam nilai header 'Content-Type'. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_CharSet](./get_charset/)() | Informasi RTTI. |
| [get_MediaType](./get_mediatype/)() | Mendapatkan nilai dari header tipe media. |
| [get_Parameters](./get_parameters/)() | Mengembalikan parameter nilai dari header tipe media. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Mengonversi string yang diberikan mulai dari indeks yang ditentukan menjadi instance dari kelas [MediaTypeHeaderValue](./). |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | Membuat instance baru. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | Membuat instance baru. |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi instance dari kelas [MediaTypeHeaderValue](./). |
| [set_CharSet](./set_charset/)(String) | Mengatur set karakter. |
| [set_MediaType](./set_mediatype/)(String) | Mengatur nilai header tipe media. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi instance dari kelas [MediaTypeHeaderValue](./). |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
