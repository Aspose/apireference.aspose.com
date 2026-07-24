---
title: "System::Reflection::PropertyInfo::PropertyInfo κατασκευαστής"
linktitle: "PropertyInfo"
second_title: "Aspose.Page για C++"
description: "System::Reflection::PropertyInfo::PropertyInfo κατασκευαστής. Κατασκευαστής. Ιδιότητα με μόνο const getter σε C++."
type: docs
weight: 100
url: /el/cpp/system.reflection/propertyinfo/propertyinfo/
---
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Κατασκευαστής. Ιδιότητα με μόνο const getter.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | Περιγραφή |
| --- | --- |
| PropertyType | Τύπος της ιδιότητας. |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Κατασκευαστής. Ιδιότητα με μόνο non-const getter.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | Περιγραφή |
| --- | --- |
| PropertyType | Τύπος της ιδιότητας. |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)() const) constructor


Δημιουργεί πληροφορίες ιδιότητας boolean από κλάση με const getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)() const)
```


| Parameter | Περιγραφή |
| --- | --- |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(bool) | Μέθοδος setter. |
| get_prop_method | bool(ClassType::*)() const | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(bool), bool(ClassType::*)()) constructor


Δημιουργεί πληροφορίες ιδιότητας boolean.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(bool), bool(ClassType::*get_prop_method)())
```


| Parameter | Περιγραφή |
| --- | --- |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(bool) | Μέθοδος setter. |
| get_prop_method | bool(ClassType::*)() | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) constructor


Δημιουργεί πληροφορίες ιδιότητας int64_t από κλάση με const getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)() const)
```


| Parameter | Περιγραφή |
| --- | --- |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(int64_t) | Μέθοδος setter. |
| get_prop_method | int64_t(ClassType::*)() const | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) constructor


Δημιουργεί πληροφορίες ιδιότητας int64_t.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(int64_t), int64_t(ClassType::*get_prop_method)())
```


| Parameter | Περιγραφή |
| --- | --- |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(int64_t) | Μέθοδος setter. |
| get_prop_method | int64_t(ClassType::*)() | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) constructor


Δημιουργεί πληροφορίες ιδιότητας [Decimal](../../../system/decimal/) από κλάση με σταθερό getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)() const)
```


| Parameter | Περιγραφή |
| --- | --- |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Μέθοδος setter. |
| get_prop_method | System::Decimal(ClassType::*)() const | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) constructor


Δημιουργεί πληροφορίες ιδιότητας [Decimal](../../../system/decimal/).

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Decimal), System::Decimal(ClassType::*get_prop_method)())
```


| Parameter | Περιγραφή |
| --- | --- |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(System::Decimal) | Μέθοδος setter. |
| get_prop_method | System::Decimal(ClassType::*)() | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [Decimal](../../../system/decimal/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) constructor


Κατασκευαστής. ιδιότητα [Nullable](../../../system/nullable/) με μόνο σταθερό getter.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)() const)
```


| Parameter | Περιγραφή |
| --- | --- |
| PropertyType | Τύπος της ιδιότητας. |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Μέθοδος setter. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() const | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) constructor


Κατασκευαστής. ιδιότητα [Nullable](../../../system/nullable/) με setter και getter.

```cpp
template<class NullableType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::Nullable<NullableType>), System::Nullable<NullableType>(ClassType::*get_prop_method)())
```


| Parameter | Περιγραφή |
| --- | --- |
| PropertyType | Τύπος της ιδιότητας. |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(System::Nullable\<NullableType\>) | Μέθοδος setter. |
| get_prop_method | System::Nullable\<NullableType\>(ClassType::*)() | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [Nullable](../../../system/nullable/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) constructor


Κατασκευαστής.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)() const)
```


| Parameter | Περιγραφή |
| --- | --- |
| PropertyType | Τύπος της ιδιότητας. |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Μέθοδος setter. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() const | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) constructor


Κατασκευαστής. ιδιότητα [Object](../../../system/object/) μόνο με getter.

```cpp
template<class PropertyType,typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::SharedPtr<PropertyType>), System::SharedPtr<PropertyType>(ClassType::*get_prop_method)())
```


| Parameter | Περιγραφή |
| --- | --- |
| PropertyType | Τύπος της ιδιότητας. |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(System::SharedPtr\<PropertyType\>) | Μέθοδος setter. |
| get_prop_method | System::SharedPtr\<PropertyType\>(ClassType::*)() | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) constructor


Δημιουργεί πληροφορίες ιδιότητας τύπου string από κλάση με const getter.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)() const)
```


| Parameter | Περιγραφή |
| --- | --- |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(System::String) | Μέθοδος setter. |
| get_prop_method | System::String(ClassType::*)() const | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
## PropertyInfo::PropertyInfo(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) constructor


Δημιουργεί πληροφορίες ιδιότητας τύπου string.

```cpp
template<typename ClassType> System::Reflection::PropertyInfo::PropertyInfo(String name, void(ClassType::*set_prop_method)(System::String), System::String(ClassType::*get_prop_method)())
```


| Parameter | Περιγραφή |
| --- | --- |
| ClassType | Τύπος της κλάσης στην οποία ανήκει η ιδιότητα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Όνομα ιδιότητας. |
| set_prop_method | void(ClassType::*)(System::String) | Μέθοδος setter. |
| get_prop_method | System::String(ClassType::*)() | Μέθοδος getter. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [PropertyInfo](../)
* Namespace [System::Reflection](../../)
* Library [Aspose.Page for C++](../../../)
