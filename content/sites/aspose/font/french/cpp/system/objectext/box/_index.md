---
title: "System::ObjectExt::Box method"
linktitle: "Box"
second_title: "Aspose.Font pour C++"
description: "System::ObjectExt::Box method. Emballe les valeurs de chaîne en C++."
type: docs
weight: 200
url: /fr/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


Encapsule les valeurs de chaîne.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const String\& | Valeur à encapsuler. |

### ReturnValue

Valeur encapsulée ou null, si la chaîne source est null.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


Encapsule les types valeur pour les convertir en [Object](../../object/). Implémentation pour les types enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Paramètre | Description |
| --- | --- |
| T | type [Enum](../../enum/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const T\& | [Enum](../../enum/) valeur à emballer. |

### ReturnValue

Pointeur intelligent vers un objet conservant la valeur encapsulée.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


Encapsule les types valeur pour les convertir en [Object](../../object/). Implémentation pour les types non enum.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Paramètre | Description |
| --- | --- |
| T | Type valeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const T\& | Valeur à encapsuler. |

### ReturnValue

Pointeur intelligent vers un objet conservant la valeur encapsulée.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


Encapsule les types [Nullable](../../nullable/) pour les convertir en [Object](../../object/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Paramètre | Description |
| --- | --- |
| T | Type valeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | const T\& | Valeur à encapsuler. |

### ReturnValue

Pointeur intelligent vers un objet conservant la valeur encapsulée.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
