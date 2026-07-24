---
title: "System::ObjectExt::Unbox méthode"
linktitle: "Déballer"
second_title: "Aspose.Page pour C++"
description: "System::ObjectExt::Unbox méthode. Déballe les types valeur après les avoir convertis en Object. Implémentation pour les types enum en C++."
type: docs
weight: 1400
url: /fr/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Déballe les types valeur après les avoir convertis en [Object](../../object/). Implémentation pour les types enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | [Enum](../../enum/) type. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) à déballer. |

### ReturnValue

[Enum](../../enum/) value.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Déballe les types valeur après les avoir convertis en [Object](../../object/). Implémentation pour les types non‑enum et non‑nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type valeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) à déballer. |

### ReturnValue

Valeur déballée.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Déballe les types valeur après les avoir convertis en [Object](../../object/). Implémentation pour les types non‑enum et non‑nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type valeur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) à déballer. |

### ReturnValue

Valeur déballée.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Déboxe les valeurs chaîne.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) à déballer |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## Voir aussi

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Déboxe les types enum en entier.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| Paramètre | Description |
| --- | --- |
| T | Type entier de destination. |
| E | Type enum source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| e | E | Valeur à désencapsuler. |

### ReturnValue

Représentation entière de l'énumération.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Convertit les types enum.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| Paramètre | Description |
| --- | --- |
| T | Type d'énumération de destination. |
| E | Type enum source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| e | E | Valeur à désencapsuler. |

### ReturnValue

Valeur d'énumération convertie.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
