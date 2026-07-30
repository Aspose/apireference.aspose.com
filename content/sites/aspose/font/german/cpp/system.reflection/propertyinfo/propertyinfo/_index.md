---
title: "System::Reflection::PropertyInfo::PropertyInfo Konstruktor"
linktitle: "PropertyInfo"
second_title: "Aspose.Font für C++"
description: "System::Reflection::PropertyInfo::PropertyInfo Konstruktor. Konstruktor. Eigenschaft mit nur const Getter in C++."
type: docs
weight: 100
url: /de/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Konstruktor. Eigenschaft mit nur const Getter.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | Beschreibung |
| --- | --- |
| PropertyType | Typ der Eigenschaft. |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Konstruktor. Eigenschaft mit nur non-const Getter.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | Beschreibung |
| --- | --- |
| PropertyType | Typ der Eigenschaft. |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


Konstruiert boolesche Property-Informationen aus einer Klasse mit const-Getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| Parameter | Beschreibung |
| --- | --- |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(bool) | Setter-Methode. |
| get_prop_method | bool(ClassType::*)() const | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


Erstellt boolesche Eigenschaftsinformationen.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| Parameter | Beschreibung |
| --- | --- |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(bool) | Setter-Methode. |
| get_prop_method | bool(ClassType::*)() | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


Konstruiert int64_t-Property-Informationen aus einer Klasse mit const-Getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| Parameter | Beschreibung |
| --- | --- |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(int64_t) | Setter-Methode. |
| get_prop_method | int64_t(ClassType::*)() const | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


Konstruiert int64_t-Property-Informationen.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| Parameter | Beschreibung |
| --- | --- |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(int64_t) | Setter-Methode. |
| get_prop_method | int64_t(ClassType::*)() | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


Erstellt die [Decimal](../../../system/decimal/)-Eigenschaftsinformationen aus der Klasse mit const-Getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| Parameter | Beschreibung |
| --- | --- |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Setter-Methode. |
| get_prop_method | System::Decimal(ClassType::*)() const | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


Erstellt die [Decimal](../../../system/decimal/)-Eigenschaftsinformationen.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| Parameter | Beschreibung |
| --- | --- |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Setter-Methode. |
| get_prop_method | System::Decimal(ClassType::*)() | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


Konstruktor. [Nullable](../../../system/nullable/)-Eigenschaft mit nur const-Getter.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| Parameter | Beschreibung |
| --- | --- |
| PropertyType | Typ der Eigenschaft. |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Setter-Methode. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


Konstruktor. [Nullable](../../../system/nullable/)-Eigenschaft mit Setter und Getter.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| Parameter | Beschreibung |
| --- | --- |
| PropertyType | Typ der Eigenschaft. |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Setter-Methode. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Konstruktor.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | Beschreibung |
| --- | --- |
| PropertyType | Typ der Eigenschaft. |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Setter-Methode. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Konstruktor. [Object](../../../system/object/)-Eigenschaft mit nur Getter.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | Beschreibung |
| --- | --- |
| PropertyType | Typ der Eigenschaft. |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Setter-Methode. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


Erstellt Informationen zur String-Eigenschaft aus einer Klasse mit const Getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| Parameter | Beschreibung |
| --- | --- |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(System::String) | Setter-Methode. |
| get_prop_method | System::String(ClassType::*)() const | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


Erstellt Informationen zur String-Eigenschaft.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| Parameter | Beschreibung |
| --- | --- |
| ClassType | Typ der Klasse, zu der die Eigenschaft gehört. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Eigenschaftsname. |
| set_prop_method | void(ClassType::*)(System::String) | Setter-Methode. |
| get_prop_method | System::String(ClassType::*)() | Getter-Methode. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
