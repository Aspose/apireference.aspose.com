---
title: "Méthode System::Object::ReferenceEquals."
linktitle: "ReferenceEquals"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Object::ReferenceEquals. Spécialisation de Object::ReferenceEquals pour le cas d'une chaîne et nullptr en C++."
type: docs
weight: 1200
url: /fr/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


Spécialisation de [Object::ReferenceEquals](./) pour le cas d'une chaîne et nullptr.

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | String const\& | [String](../../string/) à comparer à nullptr. |

### ReturnValue

vrai si la chaîne est null, faux sinon.

## Voir aussi

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


Spécialisation de [Object::ReferenceEquals](./) pour le cas de chaînes.

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str1 | String const\& | Première chaîne à comparer. |
| str2 | String const\& | Deuxième chaîne à comparer. |

### ReturnValue

vrai si les chaînes correspondent, faux sinon.

## Voir aussi

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


Compare les objets par référence.

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| objA | ptr const\& | Premier pointeur à comparer. |
| objB | ptr const\& | Deuxième pointeur à comparer. |

### ReturnValue

Vrai si les pointeurs correspondent et faux sinon.

## Voir aussi

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


Compare par référence un objet de type valeur avec nullptr.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| Paramètre | Description |
| --- | --- |
| T | Type de l'objet à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| objA | T const\& | Premier objet à comparer. |

### ReturnValue

Renvoie toujours faux car les types valeur ne peuvent pas être nuls.

## Voir aussi

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


Compare les objets par référence.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| Paramètre | Description |
| --- | --- |
| T | Type des objets à comparer. |

| Paramètre | Type | Description |
| --- | --- | --- |
| objA | T const\& | Premier objet à comparer. |
| objB | T const\& | Deuxième objet à comparer. |

### ReturnValue

Vrai si les adresses des objets correspondent et faux sinon.

## Voir aussi

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
