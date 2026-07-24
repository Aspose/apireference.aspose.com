---
title: "System::Reflection::PropertyInfo kelas"
linktitle: "PropertyInfo"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Reflection::PropertyInfo. Mewakili informasi properti dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


Mewakili informasi properti.

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | Mendapatkan nilai [MemberTypes](../membertypes/) yang menunjukkan bahwa anggota ini adalah sebuah properti. |
| [get_PropertyType](./get_propertytype/)() | Mendapatkan tipe properti. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | Mendapatkan nilai properti dari objek tertentu. |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Mendapatkan nilai properti dari objek tertentu. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Konstruktor. Properti dengan getter const saja. |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | Konstruktor. Properti dengan getter non-const saja. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | Konstruktor. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | Konstruktor. Properti [Nullable](../../system/nullable/) dengan setter dan getter. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | Konstruktor. Properti [Nullable](../../system/nullable/) dengan getter const saja. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | Konstruktor. Properti [Object](../../system/object/) dengan getter saja. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | Membuat informasi properti string. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | Membuat informasi properti string dari kelas dengan getter const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | Menyusun informasi properti [Decimal](../../system/decimal/). |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | Menyusun informasi properti [Decimal](../../system/decimal/) dari kelas dengan getter const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | Menyusun informasi properti boolean. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | Menyusun informasi properti boolean dari kelas dengan getter const. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | Menyusun informasi properti int64_t. |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | Menyusun informasi properti int64_t dari kelas dengan getter const. |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | Menetapkan tipe properti ini. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | Mengatur nilai properti ke objek tertentu. |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Mengatur nilai properti ke objek tertentu. |
## Lihat Juga

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
