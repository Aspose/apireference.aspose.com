---
title: "System::ObjectExt::Equals méthode"
linktitle: "Égal"
second_title: "Aspose.Page pour C++"
description: "System::ObjectExt::Equals méthode. Substitution des appels C# Object.Equals fonctionnant pour tout type en C++. Surcharge pour le littéral chaîne avec comparaison de chaînes en C++."
type: docs
weight: 700
url: /fr/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


Substitution des appels C# [Object.Equals](../../object/equals/) fonctionnant pour tout type en C++. Surcharge pour le littéral chaîne avec comparaison de chaînes.

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| Paramètre | Description |
| --- | --- |
| N | [String](../../string/) taille du littéral. |

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
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


Émule la comparaison en virgule flottante de style C# où deux NaN sont considérés comme égaux même si, selon IEC 60559:1989, NaN n'est égal à aucune valeur, y compris NaN.

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const double\& | Valeur à virgule flottante LHS. |
| un autre | const double\& | Valeur à virgule flottante RHS. |

### ReturnValue

Vrai si **obj** et **another** sont tous deux NaN ou égaux, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


Émule la comparaison en virgule flottante de style C# où deux NaN sont considérés comme égaux même si, selon IEC 60559:1989, NaN n'est égal à aucune valeur, y compris NaN.

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const float\& | Valeur à virgule flottante LHS. |
| un autre | const float\& | Valeur à virgule flottante RHS. |

### ReturnValue

Vrai si **obj** et **another** sont tous deux NaN ou égaux, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Substitution aux appels C# [Object.Equals](../../object/equals/) fonctionnant pour tout type en C++. Surcharge pour les types de pointeur intelligent.

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Paramètre | Description |
| --- | --- |
| T | Premier type d'objet. |
| T2 | Deuxième type d'objet. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | Premier objet. |
| un autre | const T2\& | Deuxième objet. |

### ReturnValue

Vrai si les objets sont considérés égaux, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Substitution aux appels C# [Object.Equals](../../object/equals/) fonctionnant pour tout type en C++. Surcharge pour les types scalaires.

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Paramètre | Description |
| --- | --- |
| T | Premier type d'objet. |
| T2 | Deuxième type d'objet. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | Premier objet. |
| un autre | const T2\& | Deuxième objet. |

### ReturnValue

Vrai si les objets sont considérés égaux, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


Substitution aux appels C# [Object.Equals](../../object/equals/) fonctionnant pour tout type en C++. Surcharge pour les types de structure.

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| Paramètre | Description |
| --- | --- |
| T | Premier type d'objet. |
| T2 | Deuxième type d'objet. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T | Premier objet. |
| un autre | const T2\& | Deuxième objet. |

### ReturnValue

Vrai si les objets sont considérés égaux, faux sinon.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
