---
title: "Kelas System::Attribute"
linktitle: "Attribute"
second_title: "Aspose.Page untuk C++"
description: "System::Attribute class. Kelas dasar untuk atribut khusus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system/attribute/
---
## Attribute class


Kelas dasar untuk atribut khusus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Attribute : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&, const TypeInfo\&) | Mengembalikan atribut khusus dari tipe yang ditentukan yang diterapkan pada tipe yang ditentukan. |
| static [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&) | Mengembalikan semua atribut khusus yang diterapkan pada tipe yang ditentukan. |
## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
