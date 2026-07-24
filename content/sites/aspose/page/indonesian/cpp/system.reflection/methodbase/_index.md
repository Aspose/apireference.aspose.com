---
title: "Kelas System::Reflection::MethodBase"
linktitle: "MethodBase"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Reflection::MethodBase. Informasi dasar tentang metode. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 800
url: /id/cpp/system.reflection/methodbase/
---
## MethodBase class


Informasi dasar tentang metode. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Menunjukkan tipe anggota - metode, konstruktor, acara, dan sebagainya. |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | Metode ini memungkinkan mendapatkan nama metode saat ini. Penerjemah secara otomatis menggantikan ASPOSE_CURRENT_FUNCTION sebagai parameter. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | Menginisialisasi instance baru dari kelas [MethodBase](./). |
## Lihat Juga

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
