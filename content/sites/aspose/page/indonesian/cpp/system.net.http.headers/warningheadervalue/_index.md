---
title: "System::Net::Http::Headers::WarningHeaderValue kelas"
linktitle: "WarningHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::WarningHeaderValue kelas. Mewakili nilai dari header ''Warning''. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance dari tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2700
url: /id/cpp/system.net.http.headers/warningheadervalue/
---
## WarningHeaderValue class


Mewakili nilai dari header 'Warning'. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance dari tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class WarningHeaderValue : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| [get_Agent](./get_agent/)() | Mengembalikan host yang terlampir pada peringatan. |
| [get_Code](./get_code/)() | Informasi RTTI. |
| [get_Date](./get_date/)() | Mengembalikan tanggal-waktu dari peringatan. |
| [get_Text](./get_text/)() | Mengembalikan teks peringatan. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [GetWarningLength](./getwarninglength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Mengonversi string yang diberikan dari indeks yang ditentukan menjadi sebuah instance dari kelas [WarningHeaderValue](./). |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi sebuah instance dari kelas [WarningHeaderValue](./). |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<WarningHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi sebuah instance dari kelas [WarningHeaderValue](./). |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String) | Membuat instance baru. |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String, DateTimeOffset) | Membuat instance baru. |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
