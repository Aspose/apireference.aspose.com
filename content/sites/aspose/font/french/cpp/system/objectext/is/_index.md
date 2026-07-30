---
title: "Méthode System::ObjectExt::Is"
linktitle: "Is"
second_title: "Aspose.Font pour C++"
description: "Méthode System::ObjectExt::Is. Implémente la traduction de l'opérateur ''is''. Spécialisation pour les littéraux de chaîne en C++."
type: docs
weight: 1100
url: /fr/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour le littéral chaîne.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |

| Paramètre | Type | Description |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) littéral. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types d'enveloppe d'exception.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour le type [Nullable](../../nullable/).

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |

| Paramètre | Type | Description |
| --- | --- | --- |
| value | const Nullable\<U\>\& | type [Nullable](../../nullable/). |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types valeur.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types non convertibles.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Renvoie toujours faux car les types sont non convertibles.

## Voir aussi

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types nullable.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pouvant être boxés avec l'opérateur == défini.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pouvant être boxés sans == défini.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pointeur.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types enum.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |
| U | Type de l'objet pointé. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation des types valeur boxés vers des interfaces.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |
| V | Type de l'objet pointé. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const T\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pouvant être boxés (valeur) qui sont exactement cela.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) pour tester l'opérateur 'is'. Ignoré. |

### ReturnValue

Toujours vrai

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pointeur optimisés pour les classes 'final'.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |
| U | Type testé. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types pointeur.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |
| U | Type testé. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour les types enum vs pointeurs faibles.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |
| U | Type de l'objet pointé. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) pour tester l'opérateur 'is'. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(int32_t) method


Implémente la traduction de l'opérateur 'is'. Spécialisation pour le littéral entier.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| Paramètre | Description |
| --- | --- |
| T | Type cible. |

| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int32_t | littéral entier. |

### ReturnValue

Vrai si 'is' renvoie vrai, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
