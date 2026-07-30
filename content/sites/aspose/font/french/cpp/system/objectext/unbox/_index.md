---
title: "méthode System::ObjectExt::Unbox"
linktitle: "Déballer"
second_title: "Aspose.Font pour C++"
description: "méthode System::ObjectExt::Unbox. Déballe les types valeur après les avoir convertis en Object. Implémentation pour les types enum en C++."
type: docs
weight: 1500
url: /fr/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Déballe les types valeur après les avoir convertis en [Object](../../object/). Implémentation pour les types enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | type [Enum](../../enum/). |

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
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Déballe les types valeur après les avoir convertis en [Object](../../object/). Implémentation pour les types non-enum et non-nullables.

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
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Déballe les types valeur après les avoir convertis en [Object](../../object/). Implémentation pour les types non-enum et non-nullables.

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
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Déboîte les valeurs de chaîne.

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
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


Déboîte les types enum en entier.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| Paramètre | Description |
| --- | --- |
| T | Type entier de destination. |
| E | Type enum source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| e | E | Valeur à déballer. |

### ReturnValue

Représentation entière de l’enum.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


Convertit les types enum.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| Paramètre | Description |
| --- | --- |
| T | Type enum de destination. |
| E | Type enum source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| e | E | Valeur à déballer. |

### ReturnValue

Valeur d’enum convertie.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
