---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "Aspose.Page untuk C++"
description: "System::BoxedEnum class. Mewakili nilai enumerasi yang dibungkus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 700
url: /id/cpp/system/boxedenum/
---
## BoxedEnum class


Mewakili nilai enumerasi yang dibungkus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| Parameter | Deskripsi |
| --- | --- |
| E | Tipe nilai enumerasi |
| UT | Tipe dasar enumerasi **E** |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | Membuat sebuah instance yang mewakili nilai enumerasi yang ditentukan. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Mengonversi nilai konstanta enumerasi yang dibungkus menjadi nilai integer 64-bit. |
| [IsBoxedEnum](./isboxedenum/)() override | Menentukan apakah objek saat ini mewakili nilai yang dibungkus dari tipe enum. |
| [ToString](./tostring/)() const override | Mengonversi nilai yang dibungkus yang direpresentasikan oleh objek saat ini menjadi string. |

## Lihat Juga

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
