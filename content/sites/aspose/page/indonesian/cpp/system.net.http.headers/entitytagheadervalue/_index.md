---
title: "System::Net::Http::Headers::EntityTagHeaderValue kelas"
linktitle: "EntityTagHeaderValue"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::EntityTagHeaderValue kelas. Mewakili nilai dari header ''Entity-Tag''. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 500
url: /id/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


Mewakili nilai dari header 'Entity-Tag'. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | Membuat instance baru. |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | Membuat instance baru. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Membandingkan objek menggunakan semantik C# [Object.Equals](../../system/object/equals/). |
| static [get_Any](./get_any/)() | Mendapatkan nilai dari header 'ETag'. |
| [get_IsWeak](./get_isweak/)() | Mendapatkan nilai yang menunjukkan apakah instance saat ini adalah validator lemah. |
| [get_Tag](./get_tag/)() | Informasi RTTI. |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | Mengonversi string yang diberikan dari indeks yang ditentukan menjadi sebuah instance dari kelas [EntityTagHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [Parse](./parse/)(String) | Mengonversi string yang diberikan menjadi sebuah instance dari kelas [EntityTagHeaderValue](./). |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | Mencoba mengonversi string yang diberikan menjadi sebuah instance dari kelas [EntityTagHeaderValue](./). |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
