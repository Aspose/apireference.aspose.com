---
title: "Méthode System::Object::Equals"
linktitle: "Equals"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Object::Equals. Compare les objets en utilisant la sémantique C# Object.Equals en C++."
type: docs
weight: 300
url: /fr/cpp/system/object/equals/
---
## Object::Equals(ptr) method


Compare les objets en utilisant la sémantique C# [Object.Equals](./).

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| obj | ptr | [Object](../) à comparer avec l'actuel. |

### ReturnValue

Vrai si les objets sont considérés égaux et faux sinon.

## Voir aussi

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(double const\&, double const\&) method


Émule la comparaison en virgule flottante de style C# où deux NaN sont considérés égaux même si, selon IEC 60559:1989, NaN n'est égal à aucune valeur, y compris NaN.

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| objA | double const\& | Valeur flottante LHS. |
| objB | double const\& | Valeur flottante RHS. |

### ReturnValue

Vrai si **objA** et **objB** sont tous deux NaN ou égaux, sinon faux.

## Voir aussi

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(float const\&, float const\&) method


Émule la comparaison en virgule flottante de style C# où deux NaN sont considérés égaux même si, selon IEC 60559:1989, NaN n'est égal à aucune valeur, y compris NaN.

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| objA | float const\& | Valeur flottante LHS. |
| objB | float const\& | Valeur flottante RHS. |

### ReturnValue

Vrai si **objA** et **objB** sont tous deux NaN ou égaux, sinon faux.

## Voir aussi

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Compare les objets de type référence dans le style C#.

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Paramètre | Description |
| --- | --- |
| T1 | Type du premier objet à comparer. |
| T2 | Type du deuxième objet à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| objA | T1 const\& | Premier objet à comparer. |
| objB | T2 const\& | Deuxième objet à comparer. |

### ReturnValue

Vrai si les objets correspondent soit par référence, soit sémantiquement (par une comparaison similaire à [Object.Equals](./)), sinon faux.

## Voir aussi

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Compare les objets de type valeur dans le style C#.

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Paramètre | Description |
| --- | --- |
| T1 | Type du premier objet à comparer. |
| T2 | Type du deuxième objet à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| objA | T1 const\& | Premier objet à comparer. |
| objB | T2 const\& | Deuxième objet à comparer. |

### ReturnValue

Vrai si les objets sont considérés égaux par l'opérateur d'égalité disponible, sinon faux.

## Voir aussi

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
