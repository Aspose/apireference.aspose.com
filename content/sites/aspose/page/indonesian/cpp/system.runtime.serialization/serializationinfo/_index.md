---
title: "Kelas System::Runtime::Serialization::SerializationInfo"
linktitle: "SerializationInfo"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Runtime::Serialization::SerializationInfo. Menyimpan sekumpulan bidang bernama yang mewakili objek yang diserialisasi. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


Menyimpan sekumpulan bidang bernama yang mewakili objek yang diserialisasi. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class SerializationInfo : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | Menetapkan nilai float. Tidak diimplementasikan. |
| [AddValue](./addvalue/)(const System::String\&, short) | Menetapkan nilai short. Tidak diimplementasikan. |
| [AddValue](./addvalue/)(const System::String\&, bool) | Menetapkan nilai boolean. Tidak diimplementasikan. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Menetapkan nilai objek. Tidak diimplementasikan. |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Menetapkan nilai objek dengan tipe yang ditentukan. Tidak diimplementasikan. |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | Mengambil nilai dari penyimpanan [SerializationInfo](./). Tidak diimplementasikan. |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | Informasi RTTI. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
