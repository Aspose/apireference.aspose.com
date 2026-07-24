---
title: "System::Reflection::PropertyInfo::PropertyInfo yapıcı"
linktitle: "PropertyInfo"
second_title: "Aspose.Page için C++"
description: "System::Reflection::PropertyInfo::PropertyInfo yapıcı. Yapıcı. C++'ta yalnızca const getter içeren özellik."
type: docs
weight: 100
url: /tr/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Yapıcı. Yalnızca const alıcıya sahip özellik.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | Açıklama |
| --- | --- |
| PropertyType | Özelliğin tipi. |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Yapıcı. Yalnızca non-const alıcıya sahip özellik.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | Açıklama |
| --- | --- |
| PropertyType | Özelliğin tipi. |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


Const getter içeren sınıftan boolean özellik bilgisi oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| Parameter | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(bool) | Setter yöntemi. |
| get_prop_method | bool(ClassType::*)() const | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


Boolean özellik bilgisi oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| Parameter | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(bool) | Setter yöntemi. |
| get_prop_method | bool(ClassType::*)() | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


Const getter içeren sınıftan int64_t özellik bilgisi oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| Parameter | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(int64_t) | Setter yöntemi. |
| get_prop_method | int64_t(ClassType::*)() const | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


int64_t özellik bilgisi oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| Parameter | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(int64_t) | Setter yöntemi. |
| get_prop_method | int64_t(ClassType::*)() | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


Sınıftan const alıcıyla [Decimal](../../../system/decimal/) özellik bilgilerini oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| Parameter | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Setter yöntemi. |
| get_prop_method | System::Decimal(ClassType::*)() const | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


[Decimal](../../../system/decimal/) özellik bilgilerini oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| Parameter | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Setter yöntemi. |
| get_prop_method | System::Decimal(ClassType::*)() | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


Yapıcı. Sadece const alıcıya sahip [Nullable](../../../system/nullable/) özelliği.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| Parameter | Açıklama |
| --- | --- |
| PropertyType | Özelliğin tipi. |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Setter yöntemi. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


Yapıcı. Ayarlayıcı ve alıcıya sahip [Nullable](../../../system/nullable/) özelliği.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| Parameter | Açıklama |
| --- | --- |
| PropertyType | Özelliğin tipi. |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Setter yöntemi. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Yapıcı.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | Açıklama |
| --- | --- |
| PropertyType | Özelliğin tipi. |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Setter yöntemi. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Yapıcı. Sadece alıcıya sahip [Object](../../../system/object/) özelliği.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | Açıklama |
| --- | --- |
| PropertyType | Özelliğin tipi. |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Setter yöntemi. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


Const alıcıya sahip sınıftan dize özellik bilgilerini oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| Parameter | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::String) | Setter yöntemi. |
| get_prop_method | System::String(ClassType::*)() const | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


Dize özellik bilgilerini oluşturur.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| Parameter | Açıklama |
| --- | --- |
| ClassType | Özelliğin ait olduğu sınıfın tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özellik adı. |
| set_prop_method | void(ClassType::*)(System::String) | Setter yöntemi. |
| get_prop_method | System::String(ClassType::*)() | Getter yöntemi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
