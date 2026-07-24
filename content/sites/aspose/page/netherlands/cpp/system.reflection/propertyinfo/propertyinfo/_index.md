---
title: "System::Reflection::PropertyInfo::PropertyInfo constructor"
linktitle: "PropertyInfo"
second_title: "Aspose.Page voor C++"
description: "System::Reflection::PropertyInfo::PropertyInfo constructor. Constructor. Eigenschap met alleen een const getter in C++."
type: docs
weight: 100
url: /nl/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Constructor. Eigenschap met alleen const getter.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | Beschrijving |
| --- | --- |
| PropertyType | Type van de eigenschap. |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Constructor. Eigenschap met alleen non-const getter.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | Beschrijving |
| --- | --- |
| PropertyType | Type van de eigenschap. |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


Construeert boolean‑eigenschapsinformatie van een klasse met const getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| Parameter | Beschrijving |
| --- | --- |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(bool) | Setter-methode. |
| get_prop_method | bool(ClassType::*)() const | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


Construeert boolean‑eigenschapsinformatie.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| Parameter | Beschrijving |
| --- | --- |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(bool) | Setter-methode. |
| get_prop_method | bool(ClassType::*)() | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


Construeert int64_t-eigenschapsinformatie van klasse met const-getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| Parameter | Beschrijving |
| --- | --- |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(int64_t) | Setter-methode. |
| get_prop_method | int64_t(ClassType::*)() const | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


Construeert int64_t-eigenschapsinformatie.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| Parameter | Beschrijving |
| --- | --- |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(int64_t) | Setter-methode. |
| get_prop_method | int64_t(ClassType::*)() | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


Construeert [Decimal](../../../system/decimal/) eigenschapsinformatie van de klasse met const getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| Parameter | Beschrijving |
| --- | --- |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Setter-methode. |
| get_prop_method | System::Decimal(ClassType::*)() const | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


Construeert [Decimal](../../../system/decimal/) eigenschapsinformatie.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| Parameter | Beschrijving |
| --- | --- |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Setter-methode. |
| get_prop_method | System::Decimal(ClassType::*)() | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


Constructor. [Nullable](../../../system/nullable/) eigenschap met alleen const getter.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| Parameter | Beschrijving |
| --- | --- |
| PropertyType | Type van de eigenschap. |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Setter-methode. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


Constructor. [Nullable](../../../system/nullable/) eigenschap met setter en getter.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| Parameter | Beschrijving |
| --- | --- |
| PropertyType | Type van de eigenschap. |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Setter-methode. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Constructor.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | Beschrijving |
| --- | --- |
| PropertyType | Type van de eigenschap. |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Setter-methode. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Constructor. [Object](../../../system/object/) eigenschap met alleen getter.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | Beschrijving |
| --- | --- |
| PropertyType | Type van de eigenschap. |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Setter-methode. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


Construeert string‑eigenschapsinformatie van een klasse met const getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| Parameter | Beschrijving |
| --- | --- |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(System::String) | Setter-methode. |
| get_prop_method | System::String(ClassType::*)() const | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


Construeert string‑eigenschapsinformatie.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| Parameter | Beschrijving |
| --- | --- |
| ClassType | Type van de klasse waartoe de eigenschap behoort. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | Eigenschapnaam. |
| set_prop_method | void(ClassType::*)(System::String) | Setter-methode. |
| get_prop_method | System::String(ClassType::*)() | Getter-methode. |

## Zie ook

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
