---
title: "kelas System::EnumValues"
linktitle: "EnumValues"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::EnumValues. Menyediakan informasi meta tentang konstanta enumerasi dari tipe enum E dalam C++."
type: docs
weight: 2300
url: /id/cpp/system/enumvalues/
---
## EnumValues class


Menyediakan informasi meta tentang konstanta enumerasi dari tipe enum **E**.

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| Parameter | Deskripsi |
| --- | --- |
| E | Tipe enumerasi |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [EnumValues](./enumvalues/)() | Membuat sebuah instance. |
| [GetNames](./getnames/)() const override | Mengembalikan array yang berisi semua nama enumerasi **E**. |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | Mengambil array nama-nama konstanta dalam sebuah enumerasi yang ditentukan. |
| [GetUnderlyingType](./getunderlyingtype/)() const override | Mengembalikan tipe dasar dari enumerasi yang ditentukan. |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | Mengembalikan tipe dasar dari enumerasi yang ditentukan. |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | Mengembalikan nilai yang dibungkus dari konstanta enum dengan nama yang ditentukan. |
| [GetValueOf](./getvalueof/)(long) const override | Mengembalikan nilai yang dibungkus dari konstanta enum dengan nilai yang ditentukan. |
| [GetValues](./getvalues/)() const override | Mengembalikan sebuah array yang berisi semua nilai dari enumerasi **E**. |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | Mengembalikan sebuah array yang berisi semua nilai dari tipe enumerasi yang ditentukan. |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | Mengembalikan sebuah objek yang mewakili nilai dari konstanta enumerasi tipe enumerasi yang ditentukan dengan nama yang ditentukan. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | Mengonversi nilai bilangan bulat tak bertanda 64-bit yang ditentukan menjadi anggota enumerasi. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | Mengonversi objek yang ditentukan dengan nilai bilangan bulat menjadi anggota enumerasi. |
| virtual [~EnumValues](./~enumvalues/)() | Destruktor. |

## Lihat Juga

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
