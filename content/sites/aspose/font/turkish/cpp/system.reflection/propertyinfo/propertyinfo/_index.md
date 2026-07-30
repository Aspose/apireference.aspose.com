---
title: "System::Reflection::PropertyInfo::PropertyInfo yapıcı"
linktitle: "PropertyInfo"
second_title: "Aspose.Font için C++"
description: "System::Reflection::PropertyInfo::PropertyInfo yapıcı. Yapıcı. C++'ta yalnızca const getter içeren özellik."
type: docs
weight: 100
url: /tr/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Yapıcı. Sadece const getter içeren özellik.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parametre | Açıklama |
| --- | --- |
| PropertyType | Özelliğin türü. |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Yapıcı. Sadece non-const getter içeren özellik.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parametre | Açıklama |
| --- | --- |
| PropertyType | Özelliğin türü. |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


Const getter içeren sınıftan boolean özellik bilgisi oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| Parametre | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(bool) | Ayarlayıcı metodu. |
| get_prop_method | bool(ClassType::*)() const | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


Boolean özellik bilgisi oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| Parametre | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(bool) | Ayarlayıcı metodu. |
| get_prop_method | bool(ClassType::*)() | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


Const getter içeren sınıftan int64_t özellik bilgisi oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| Parametre | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(int64_t) | Ayarlayıcı metodu. |
| get_prop_method | int64_t(ClassType::*)() const | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


int64_t özellik bilgisi oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| Parametre | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(int64_t) | Ayarlayıcı metodu. |
| get_prop_method | int64_t(ClassType::*)() | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


Sınıftan const alıcı ile [Decimal](../../../system/decimal/) özellik bilgisi oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| Parametre | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Ayarlayıcı metodu. |
| get_prop_method | System::Decimal(ClassType::*)() const | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


[Decimal](../../../system/decimal/) özellik bilgisi oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| Parametre | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Ayarlayıcı metodu. |
| get_prop_method | System::Decimal(ClassType::*)() | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


Yapıcı. Sadece const alıcı ile [Nullable](../../../system/nullable/) özelliği.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| Parametre | Açıklama |
| --- | --- |
| PropertyType | Özelliğin türü. |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Ayarlayıcı metodu. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


Yapıcı. Ayarlayıcı ve alıcı ile [Nullable](../../../system/nullable/) özelliği.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| Parametre | Açıklama |
| --- | --- |
| PropertyType | Özelliğin türü. |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Ayarlayıcı metodu. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Yapıcı.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parametre | Açıklama |
| --- | --- |
| PropertyType | Özelliğin türü. |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Ayarlayıcı metodu. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Yapıcı. Sadece alıcı ile [Object](../../../system/object/) özelliği.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parametre | Açıklama |
| --- | --- |
| PropertyType | Özelliğin türü. |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Ayarlayıcı metodu. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


Const getter içeren sınıftan dize özellik bilgisini oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| Parametre | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::String) | Ayarlayıcı metodu. |
| get_prop_method | System::String(ClassType::*)() const | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


Dize özellik bilgisini oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| Parametre | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::String) | Ayarlayıcı metodu. |
| get_prop_method | System::String(ClassType::*)() | Alıcı metodu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
