---
title: "Méthode System::ObjectExt::Equals"
linktitle: "Equals"
second_title: "Aspose.Font pour C++"
description: "Méthode System::ObjectExt::Equals. Substitution des appels C# Object.Equals fonctionnant pour tout type en C++. Surcharge pour le littéral chaîne avec comparaison de chaînes en C++."
type: docs
weight: 800
url: /fr/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


Substitution des appels C# [Object.Equals](../../object/equals/) fonctionnant pour tout type en C++. Surcharge pour le littéral chaîne avec comparaison de chaînes.

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| Paramètre | Description |
| --- | --- |
| N | Taille du littéral [String](../../string/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) littéral. |
| another | String | [String](../../string/). |

### ReturnValue

Vrai si les chaînes correspondent, faux sinon.

## Voir aussi

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


Émule la comparaison en virgule flottante de style C# où deux NaN sont considérés égaux même si, selon IEC 60559:1989, NaN n'est égal à aucune valeur, y compris NaN.

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const double\& | Valeur flottante LHS. |
| un autre | const double\& | Valeur flottante RHS. |

### ReturnValue

Vrai si **obj** et **another** sont tous deux NaN ou égaux, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


Émule la comparaison en virgule flottante de style C# où deux NaN sont considérés égaux même si, selon IEC 60559:1989, NaN n'est égal à aucune valeur, y compris NaN.

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const float\& | Valeur flottante LHS. |
| un autre | const float\& | Valeur flottante RHS. |

### ReturnValue

Vrai si **obj** et **another** sont tous deux NaN ou égaux, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Substitution des appels C# [Object.Equals](../../object/equals/) fonctionnant pour tout type en C++. Surcharge pour les types pointeur intelligent.

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Paramètre | Description |
| --- | --- |
| T | Type du premier objet. |
| T2 | Type du deuxième objet. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | Premier objet. |
| un autre | const T2\& | Deuxième objet. |

### ReturnValue

Vrai si les objets sont considérés égaux, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Substitution des appels C# [Object.Equals](../../object/equals/) fonctionnant pour tout type en C++. Surcharge pour les types scalaires.

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Paramètre | Description |
| --- | --- |
| T | Type du premier objet. |
| T2 | Type du deuxième objet. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | Premier objet. |
| un autre | const T2\& | Deuxième objet. |

### ReturnValue

Vrai si les objets sont considérés égaux, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


Substitution des appels C# [Object.Equals](../../object/equals/) fonctionnant pour tout type en C++. Surcharge pour les types de structure.

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| Paramètre | Description |
| --- | --- |
| T | Type du premier objet. |
| T2 | Type du deuxième objet. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T | Premier objet. |
| un autre | const T2\& | Deuxième objet. |

### ReturnValue

Vrai si les objets sont considérés égaux, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
