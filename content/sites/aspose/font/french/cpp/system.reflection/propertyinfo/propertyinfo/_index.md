---
title: "Constructeur System::Reflection::PropertyInfo::PropertyInfo"
linktitle: "PropertyInfo"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::Reflection::PropertyInfo::PropertyInfo. Constructeur. Propriété avec uniquement un accesseur const en C++."
type: docs
weight: 100
url: /fr/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Constructeur. Propriété avec uniquement un getter const.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Paramètre | Description |
| --- | --- |
| PropertyType | Type de la propriété. |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Constructeur. Propriété avec uniquement un getter non-const.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Paramètre | Description |
| --- | --- |
| PropertyType | Type de la propriété. |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


Construit les informations de propriété booléenne à partir d'une classe avec getter const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| Paramètre | Description |
| --- | --- |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(bool) | Méthode de définition. |
| get_prop_method | bool(ClassType::*)() const | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


Construit les informations de propriété booléenne.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| Paramètre | Description |
| --- | --- |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(bool) | Méthode de définition. |
| get_prop_method | bool(ClassType::*)() | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


Construit les informations de propriété int64_t à partir d'une classe avec getter const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| Paramètre | Description |
| --- | --- |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(int64_t) | Méthode de définition. |
| get_prop_method | int64_t(ClassType::*)() const | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


Construit les informations de propriété int64_t.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| Paramètre | Description |
| --- | --- |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(int64_t) | Méthode de définition. |
| get_prop_method | int64_t(ClassType::*)() | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


Construit les informations de propriété [Decimal](../../../system/decimal/) à partir d'une classe avec un accesseur const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| Paramètre | Description |
| --- | --- |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Méthode de définition. |
| get_prop_method | System::Decimal(ClassType::*)() const | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


Construit les informations de propriété [Decimal](../../../system/decimal/).

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| Paramètre | Description |
| --- | --- |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Méthode de définition. |
| get_prop_method | System::Decimal(ClassType::*)() | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


Constructeur. Propriété [Nullable](../../../system/nullable/) avec uniquement un accesseur const.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| Paramètre | Description |
| --- | --- |
| PropertyType | Type de la propriété. |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Méthode de définition. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


Constructeur. Propriété [Nullable](../../../system/nullable/) avec mutateur et accesseur.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| Paramètre | Description |
| --- | --- |
| PropertyType | Type de la propriété. |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Méthode de définition. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Constructeur.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Paramètre | Description |
| --- | --- |
| PropertyType | Type de la propriété. |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Méthode de définition. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Constructeur. [Object](../../../system/object/) propriété en lecture seule.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Paramètre | Description |
| --- | --- |
| PropertyType | Type de la propriété. |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Méthode de définition. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


Construit les informations de propriété de chaîne à partir d'une classe avec getter const.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| Paramètre | Description |
| --- | --- |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(System::String) | Méthode de définition. |
| get_prop_method | System::String(ClassType::*)() const | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


Construit les informations de propriété de chaîne.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| Paramètre | Description |
| --- | --- |
| ClassType | Type de la classe à laquelle appartient la propriété. |

| Paramètre | Type | Description |
| --- | --- | --- |
| nom | String | Nom de la propriété. |
| set_prop_method | void(ClassType::*)(System::String) | Méthode de définition. |
| get_prop_method | System::String(ClassType::*)() | Méthode d'accès. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Font for C++](../../../)
