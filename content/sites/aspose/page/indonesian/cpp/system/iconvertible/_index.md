---
title: "System::IConvertible kelas"
linktitle: "IConvertible"
second_title: "Aspose.Page untuk C++"
description: "System::IConvertible class. Mendefinisikan metode yang mengonversi nilai dari referensi atau tipe nilai yang mengimplementasikan ke tipe runtime bahasa umum yang memiliki nilai setara. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3400
url: /id/cpp/system/iconvertible/
---
## IConvertible class


Mendefinisikan metode yang mengonversi nilai dari referensi atau tipe nilai yang mengimplementasikan ke tipe runtime bahasa umum yang memiliki nilai setara. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class IConvertible : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | Mengembalikan kode tipe untuk instance ini. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke nilai [Boolean](../boolean/) yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke uint32_teger 8-bit yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke karakter Unicode yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke [System::DateTime](../datetime/) yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke nomor [System::Decimal](../decimal/) yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke angka floating-point double-precision yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke integer bertanda 16-bit yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke integer bertanda 32-bit yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke integer bertanda 64-bit yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke integer bertanda 8-bit yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke angka floating-point single-precision yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke [System::String](../string/) yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToString](./tostring/)() const | Analog dari metode C# [Object.ToString()](../object/tostring/). Memungkinkan konversi objek khusus menjadi string. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke [System::Object](../object/) dari System::Type yang ditentukan yang memiliki nilai setara, menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke uint32_teger 16-bit yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke uint32_teger 32-bit yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | Mengonversi nilai instance ini ke uint32_teger 64-bit yang setara menggunakan informasi pemformatan spesifik budaya yang ditentukan. |
## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
