---
title: "Méthode System::ObjectType::GetType"
linktitle: "GetType"
second_title: "Aspose.Font pour C++"
description: "Méthode System::ObjectType::GetType. Implémente la traduction de typeof(). Surcharge pour les types primitifs en C++."
type: docs
weight: 100
url: /fr/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour les types primitifs.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Paramètre | Description |
| --- | --- |
| T | Type primitif. |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant le type spécifié.

## Voir aussi

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour les types d'énumération.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Paramètre | Description |
| --- | --- |
| T | Type primitif. |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant le type spécifié.

## Voir aussi

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour les structures et les pointeurs.

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Paramètre | Description |
| --- | --- |
| T | Type primitif. |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant le strcture spécifié.

## Voir aussi

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Paramètre | Description |
| --- | --- |
| T | type [Nullable](../../nullable/). |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant le strcture spécifié.

## Voir aussi

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour MutlicastDelegate.

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Paramètre | Description |
| --- | --- |
| T | Type MutlicastDelegate. |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant le strcture spécifié.

## Voir aussi

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour les structures et les pointeurs.

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Paramètre | Description |
| --- | --- |
| T | Type primitif. |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant le strcture spécifié ou le type pointé si appelé pour [SmartPtr](../../smartptr/).

## Voir aussi

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour uint8_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Voir aussi

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour char16_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Voir aussi

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour int32_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Voir aussi

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour int64_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Voir aussi

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour bool.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Voir aussi

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


Implémente la traduction de typeof(). Surcharge pour [Void](../../void/).

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Voir aussi

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const String\&) method


Implémente la traduction de typeof(). Surcharge pour le type string.

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type primitif. |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant le type [String](../../string/).

## Voir aussi

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


Implémente la traduction de typeof(). Surcharge pour les pointeurs intelligents.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type d'objet pointeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) pour obtenir le [TypeInfo](../../typeinfo/). |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant la classe finale de l'objet passé.

## Voir aussi

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


Implémente la traduction de typeof(). Surcharge pour les structures.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | type de structure. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) pour obtenir le [TypeInfo](../../typeinfo/). |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant la classe finale de l'objet passé.

## Voir aussi

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


Implémente la traduction de typeof(). Surcharge pour les exceptions.

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type [Exception](../../exception/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) pour obtenir le [TypeInfo](../../typeinfo/). |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant la classe finale de l'objet passé.

## Voir aussi

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


Implémente la traduction de typeof(). Surcharge pour les types primitifs.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type primitif. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant le type de l'objet passé.

## Voir aussi

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


Implémente la traduction de typeof(). Surcharge pour les types [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Paramètre | Description |
| --- | --- |
| T | type [Nullable](../../nullable/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Référence constante à la structure [TypeInfo](../../typeinfo/) décrivant le type de l'objet passé.

## Voir aussi

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
