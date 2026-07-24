---
title: "System::Reflection::PropertyInfo::PropertyInfo konstruktor"
linktitle: "PropertyInfo"
second_title: "Aspose.Page untuk C++"
description: "System::Reflection::PropertyInfo::PropertyInfo konstruktor. Konstruktor. Properti dengan hanya getter const dalam C++."
type: docs
weight: 100
url: /id/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Konstruktor. Properti dengan getter const saja.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | Deskripsi |
| --- | --- |
| PropertyType | Tipe properti. |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Konstruktor. Properti dengan getter non-const saja.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | Deskripsi |
| --- | --- |
| PropertyType | Tipe properti. |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


Menyusun informasi properti boolean dari kelas dengan getter const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| Parameter | Deskripsi |
| --- | --- |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(bool) | Metode setter. |
| get_prop_method | bool(ClassType::*)() const | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


Menyusun informasi properti boolean.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| Parameter | Deskripsi |
| --- | --- |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(bool) | Metode setter. |
| get_prop_method | bool(ClassType::*)() | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


Menyusun informasi properti int64_t dari kelas dengan getter const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| Parameter | Deskripsi |
| --- | --- |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(int64_t) | Metode setter. |
| get_prop_method | int64_t(ClassType::*)() const | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


Menyusun informasi properti int64_t.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| Parameter | Deskripsi |
| --- | --- |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(int64_t) | Metode setter. |
| get_prop_method | int64_t(ClassType::*)() | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


Membuat informasi properti [Decimal](../../../system/decimal/) dari kelas dengan getter const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| Parameter | Deskripsi |
| --- | --- |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Metode setter. |
| get_prop_method | System::Decimal(ClassType::*)() const | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


Membuat informasi properti [Decimal](../../../system/decimal/).

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| Parameter | Deskripsi |
| --- | --- |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Metode setter. |
| get_prop_method | System::Decimal(ClassType::*)() | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


Konstruktor. Properti [Nullable](../../../system/nullable/) dengan hanya getter const.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| Parameter | Deskripsi |
| --- | --- |
| PropertyType | Tipe properti. |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Metode setter. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


Konstruktor. Properti [Nullable](../../../system/nullable/) dengan setter dan getter.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| Parameter | Deskripsi |
| --- | --- |
| PropertyType | Tipe properti. |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Metode setter. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Konstruktor.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | Deskripsi |
| --- | --- |
| PropertyType | Tipe properti. |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Metode setter. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Konstruktor. Properti [Object](../../../system/object/) dengan hanya getter.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | Deskripsi |
| --- | --- |
| PropertyType | Tipe properti. |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Metode setter. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


Membuat informasi properti string dari kelas dengan getter const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| Parameter | Deskripsi |
| --- | --- |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(System::String) | Metode setter. |
| get_prop_method | System::String(ClassType::*)() const | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


Membuat informasi properti string.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| Parameter | Deskripsi |
| --- | --- |
| ClassType | Tipe kelas yang dimiliki properti. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama properti. |
| set_prop_method | void(ClassType::*)(System::String) | Metode setter. |
| get_prop_method | System::String(ClassType::*)() | Metode getter. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
