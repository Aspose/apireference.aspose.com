---
title: "Méthode System::operator+"
linktitle: "opérateur+"
second_title: "Aspose.Font pour C++"
description: "Méthode System::operator+ . Concatenation de chaînes en C++."
type: docs
weight: 27600
url: /fr/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| gauche | const char_t | Caractère à concaténer à la chaîne. |
| right | const String\& | [String](../string/) à concaténer. |

### ReturnValue

Chaîne concaténée.

## Voir aussi

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


Renvoie une nouvelle instance de la classe [Decimal](../decimal/) qui représente une valeur qui est la somme de la valeur spécifiée et de la valeur représentée par l'objet [Decimal](../decimal/) spécifié.

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| x | const T\& | Le premier terme |
| d | const Decimal\& | La référence constante à l'objet [Decimal](../decimal/) représentant le deuxième terme |

### ReturnValue

Une nouvelle instance de la classe [Decimal](../decimal/) qui représente une valeur qui est la somme de **x** et de la valeur représentée par le **d**.

## Voir aussi

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


Additionne les valeurs non nullables et nullables.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| Paramètre | Description |
| --- | --- |
| T1 | Type d’opérande gauche. |
| T2 | Type d’opérande droite. |

| Paramètre | Type | Description |
| --- | --- | --- |
| quelques | const T1\& | Opérande gauche. |
| autre | const Nullable\<T2\>\& | Opérande droite. |

### ReturnValue

Résultat de l'addition.

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Connecte tous les rappels du délégué de droite à la fin de la liste des rappels du délégué de gauche.

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Le délégué auquel les rappels sont ajoutés. |
| rhv | MulticastDelegate\<T\> | Le délégué dont les rappels sont ajoutés. |

### ReturnValue

Renvoie un délégué qui contient les rappels de la valeur de gauche, puis ceux de droite.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Paramètre | Description |
| --- | --- |
| T | Type littéral [String](../string/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| gauche | T\& | Littéral à concaténer à la chaîne. |
| right | const String\& | [String](../string/) à concaténer. |

### ReturnValue

Chaîne concaténée.

## Voir aussi

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Paramètre | Description |
| --- | --- |
| T | type de pointeur [String](../string/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| left | T\& | Pointeur [String](../string/) à concaténer à la chaîne. |
| right | const String\& | [String](../string/) à concaténer. |

### ReturnValue

Chaîne concaténée.

## Voir aussi

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
