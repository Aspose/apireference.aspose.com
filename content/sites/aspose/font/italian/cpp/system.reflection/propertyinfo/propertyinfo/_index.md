---
title: "costruttore System::Reflection::PropertyInfo::PropertyInfo"
linktitle: "PropertyInfo"
second_title: "Aspose.Font per C++"
description: "costruttore System::Reflection::PropertyInfo::PropertyInfo. Costruttore. Proprietà con solo getter const in C++."
type: docs
weight: 100
url: /it/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Costruttore. Proprietà con solo getter const.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parametro | Descrizione |
| --- | --- |
| PropertyType | Tipo della proprietà. |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Costruttore. Proprietà con solo getter non const.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parametro | Descrizione |
| --- | --- |
| PropertyType | Tipo della proprietà. |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


Costruisce informazioni sulla proprietà booleana dalla classe con getter const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| Parametro | Descrizione |
| --- | --- |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(bool) | Metodo setter. |
| get_prop_method | bool(ClassType::*)() const | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


Costruisce le informazioni sulla proprietà booleana.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| Parametro | Descrizione |
| --- | --- |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(bool) | Metodo setter. |
| get_prop_method | bool(ClassType::*)() | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


Costruisce informazioni sulla proprietà int64_t dalla classe con getter const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| Parametro | Descrizione |
| --- | --- |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(int64_t) | Metodo setter. |
| get_prop_method | int64_t(ClassType::*)() const | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


Costruisce informazioni sulla proprietà int64_t.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| Parametro | Descrizione |
| --- | --- |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(int64_t) | Metodo setter. |
| get_prop_method | int64_t(ClassType::*)() | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


Costruisce le informazioni della proprietà [Decimal](../../../system/decimal/) dalla classe con getter const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| Parametro | Descrizione |
| --- | --- |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Metodo setter. |
| get_prop_method | System::Decimal(ClassType::*)() const | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


Costruisce le informazioni della proprietà [Decimal](../../../system/decimal/).

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| Parametro | Descrizione |
| --- | --- |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Metodo setter. |
| get_prop_method | System::Decimal(ClassType::*)() | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


Costruttore. Proprietà [Nullable](../../../system/nullable/) con solo getter const.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| Parametro | Descrizione |
| --- | --- |
| PropertyType | Tipo della proprietà. |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Metodo setter. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


Costruttore. Proprietà [Nullable](../../../system/nullable/) con setter e getter.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| Parametro | Descrizione |
| --- | --- |
| PropertyType | Tipo della proprietà. |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Metodo setter. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Costruttore.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parametro | Descrizione |
| --- | --- |
| PropertyType | Tipo della proprietà. |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Metodo setter. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Costruttore. Proprietà [Object](../../../system/object/) con solo getter.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parametro | Descrizione |
| --- | --- |
| PropertyType | Tipo della proprietà. |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Metodo setter. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


Costruisce le informazioni sulla proprietà stringa da una classe con getter const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| Parametro | Descrizione |
| --- | --- |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(System::String) | Metodo setter. |
| get_prop_method | System::String(ClassType::*)() const | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


Costruisce le informazioni sulla proprietà stringa.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| Parametro | Descrizione |
| --- | --- |
| ClassType | Tipo della classe a cui appartiene la proprietà. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | Stringa | Nome della proprietà. |
| set_prop_method | void(ClassType::*)(System::String) | Metodo setter. |
| get_prop_method | System::String(ClassType::*)() | Metodo getter. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
