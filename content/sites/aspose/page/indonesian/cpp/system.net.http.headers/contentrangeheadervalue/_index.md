---
title: "System::Net::Http::Headers::ContentRangeHeaderValue kelas"
linktitle: "ContentRangeHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::ContentRangeHeaderValue kelas. Mewakili nilai dari header ''Content-Range''. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


Mewakili nilai dari header 'Content-Range'. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | Membuat instance baru. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | Membuat instance baru. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | Membuat instance baru. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_From](./get_from/)() | Mendapatkan posisi di mana pengiriman data harus dimulai. |
| [get_HasLength](./get_haslength/)() const | Mendapatkan nilai yang menunjukkan apakah panjang ditentukan untuk header saat ini. |
| [get_HasRange](./get_hasrange/)() const | Mendapatkan nilai yang menunjukkan apakah rentang ditentukan untuk header saat ini. |
| [get_Length](./get_length/)() | Mendapatkan panjang badan entitas. |
| [get_To](./get_to/)() | Mendapatkan posisi di mana pengiriman data harus berhenti. |
| [get_Unit](./get_unit/)() | Informasi RTTI. |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Mengonversi string yang diberikan dari posisi yang ditentukan menjadi sebuah instance dari kelas [ContentRangeHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi sebuah instance dari kelas [ContentRangeHeaderValue](./). |
| [set_Unit](./set_unit/)(String) | Mengatur satuan yang digunakan dalam rentang. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi sebuah instance dari kelas [ContentRangeHeaderValue](./). |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
