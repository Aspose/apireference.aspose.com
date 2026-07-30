---
title: "méthode System::operator-"
linktitle: "opérateur-"
second_title: "Aspose.Font pour C++"
description: "méthode System::operator-. Retourne une nouvelle instance de la classe Decimal qui représente une valeur résultant de la soustraction de la valeur représentée par l’objet Decimal spécifié de la valeur spécifiée en C++."
type: docs
weight: 28200
url: /fr/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


Retourne une nouvelle instance de la classe [Decimal](../decimal/) qui représente une valeur résultant de la soustraction de la valeur représentée par l’objet [Decimal](../decimal/) spécifié de la valeur spécifiée.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| x | const T\& | La valeur dont il faut soustraire |
| d | const Decimal\& | L’objet [Decimal](../decimal/) représentant la valeur soustraite |

### ReturnValue

Une nouvelle instance de la classe [Decimal](../decimal/) qui représente une valeur résultant de la soustraction de la valeur représentée par **d** de **x**.

## Voir aussi

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


Soustrait des valeurs non nullables et nullables.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
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

Résultat de la soustraction.

## Voir aussi

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


Calcule le nombre de jours entre deux jours de la semaine.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| a | JourDeLaSemaine | Le minuend |
| b | JourDeLaSemaine | Le subtrahend |

### ReturnValue

Le nombre de jours entre les jours de semaine **a** et **b** ; la valeur de retour est un nombre négatif si *goes* après ****

## Voir aussi

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Déconnecte tous les rappels dans le délégué de droite depuis la fin de la liste de rappels du délégué de gauche.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Le délégué dont les rappels seront supprimés. |
| rhv | MulticastDelegate\<T\> | Le délégué dont les rappels seront supprimés. |

### ReturnValue

Renvoie un délégué qui contient les rappels de la valeur de gauche, mais sans ceux de la valeur de droite.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
