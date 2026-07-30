---
title: "Constructeur System::DateTime::DateTime"
linktitle: "DateTime"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::DateTime::DateTime. Construit une instance qui représente la plus petite valeur possible de date et d'heure égale à MinValue en C++."
type: docs
weight: 100
url: /fr/cpp/system/datetime/datetime/
---
## DateTime::DateTime() constructor


Construit une instance qui représente la plus petite valeur possible de date et d'heure, égale à MinValue.

```cpp
System::DateTime::DateTime()
```

## Voir aussi

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(const DateTime\&) constructor


Copie-constructeur d'une instance.

```cpp
System::DateTime::DateTime(const DateTime &dt)=default
```


| Paramètre | Type | Description |
| --- | --- | --- |
| dt | const DateTime\& | Une instance de la classe [DateTime](../) pour copier la valeur de date et d'heure représentée depuis |

## Voir aussi

* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int) constructor


Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois et un jour particuliers.

```cpp
System::DateTime::DateTime(int year, int month, int day)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| année | int | L'année à représenter par l'instance en cours de construction. |
| mois | int | Le mois de l'**year** à représenter par l'instance en cours de construction. |
| jour | int | Le jour du **month** à représenter par l'instance en cours de construction. |

## Voir aussi

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois et un jour particuliers dans le calendrier spécifié.

```cpp
System::DateTime::DateTime(int year, int month, int day, const SharedPtr<Globalization::Calendar> &calendar)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| année | int | L'année à représenter par l'instance en cours de construction. |
| mois | int | Le mois de l'**year** à représenter par l'instance en cours de construction. |
| jour | int | Le jour du **month** à représenter par l'instance en cours de construction. |
| calendrier | const SharedPtr\<Globalization::Calendar\>\& | Le calendrier utilisé pour interpréter le **year**, le **month** et le **day** spécifiés. |

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int) constructor


Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois, un jour, une heure, une minute et une seconde particuliers.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| année | int | L'année à représenter par l'instance en cours de construction. |
| mois | int | Le mois de l'**year** à représenter par l'instance en cours de construction. |
| jour | int | Le jour du **month** à représenter par l'instance en cours de construction. |
| heure | int | L'heure du **day** à représenter par l'instance en cours de construction. |
| minute | int | La minute de l'**hour** à représenter par l'instance en cours de construction. |
| seconde | int | La seconde du **minute** à représenter par l'instance en cours de construction. |

## Voir aussi

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois, un jour, une heure, une minute et une seconde particuliers dans le calendrier spécifié.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, const SharedPtr<Globalization::Calendar> &calendar)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| année | int | L'année à représenter par l'instance en cours de construction. |
| mois | int | Le mois de l'**year** à représenter par l'instance en cours de construction. |
| jour | int | Le jour du **month** à représenter par l'instance en cours de construction. |
| heure | int | L'heure du **day** à représenter par l'instance en cours de construction. |
| minute | int | La minute de l'**hour** à représenter par l'instance en cours de construction. |
| seconde | int | La seconde du **minute** à représenter par l'instance en cours de construction. |
| calendrier | const SharedPtr\<Globalization::Calendar\>\& | Le calendrier utilisé pour interpréter le **year**, le **month** et le **day** spécifiés. |

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, DateTimeKind) constructor


Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois, un jour, une heure, une minute et une seconde particuliers.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| année | int | L'année à représenter par l'instance en cours de construction. |
| mois | int | Le mois de l'**year** à représenter par l'instance en cours de construction. |
| jour | int | Le jour du **month** à représenter par l'instance en cours de construction. |
| heure | int | L'heure du **day** à représenter par l'instance en cours de construction. |
| minute | int | La minute de l'**hour** à représenter par l'instance en cours de construction. |
| seconde | int | La seconde du **minute** à représenter par l'instance en cours de construction. |
| type | DateTimeKind | La valeur qui indique si les paramètres de date et d'heure fournis spécifient une heure locale, une heure UTC ou aucune des deux. |

## Voir aussi

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) constructor


Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois, un jour, une heure, une minute, une seconde et une milliseconde particuliers dans le calendrier spécifié.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| année | int | L'année à représenter par l'instance en cours de construction. |
| mois | int | Le mois de l'**year** à représenter par l'instance en cours de construction. |
| jour | int | Le jour du **month** à représenter par l'instance en cours de construction. |
| heure | int | L'heure du **day** à représenter par l'instance en cours de construction. |
| minute | int | La minute de l'**hour** à représenter par l'instance en cours de construction. |
| seconde | int | La seconde du **minute** à représenter par l'instance en cours de construction. |
| milliseconde | int | La milliseconde de la **second** à représenter par l'instance en cours de construction. |
| type | const SharedPtr\<Globalization::Calendar\>\& | La valeur qui indique si les paramètres de date et d'heure fournis spécifient une heure locale, une heure UTC ou aucune des deux. |
| calendrier | DateTimeKind | Le calendrier utilisé pour interpréter le **year**, le **month** et le **day** spécifiés. |

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, DateTimeKind) constructor


Construit une instance qui représente une valeur de date et d'heure spécifiée par une année, un mois, un jour, une heure, une minute, une seconde et une milliseconde particuliers.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| année | int | L'année à représenter par l'instance en cours de construction. |
| mois | int | Le mois de l'**year** à représenter par l'instance en cours de construction. |
| jour | int | Le jour du **month** à représenter par l'instance en cours de construction. |
| heure | int | L'heure du **day** à représenter par l'instance en cours de construction. |
| minute | int | La minute de l'**hour** à représenter par l'instance en cours de construction. |
| seconde | int | La seconde du **minute** à représenter par l'instance en cours de construction. |
| milliseconde | int | La milliseconde de la **second** à représenter par l'instance en cours de construction. |
| type | DateTimeKind | La valeur qui indique si les paramètres de date et d'heure fournis spécifient une heure locale, une heure UTC ou aucune des deux. |

## Voir aussi

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind, bool) constructor


Construit une instance qui représente une valeur de date et d'heure spécifiée par un nombre de ticks. POUR USAGE INTERNE.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind, bool is_ambiguous_local_dst)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ticks | int64_t | Le nombre d'intervalles de 100 ns écoulés depuis le 1er janvier 0001 00:00:00.000 dans le calendrier géorgien. |
| type | DateTimeKind | La valeur qui indique si le paramètre **ticks** spécifie une heure locale, une heure UTC ou aucune des deux. |
| is_ambiguous_local_dst | bool | Vrai si la date et l'heure spécifiées sont ambiguës et peuvent être mappées à de nombreuses heures UTC. |

## Voir aussi

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind) constructor


Construit une instance qui représente une valeur de date et d'heure spécifiée par un nombre de ticks.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ticks | int64_t | Le nombre d'intervalles de 100 ns écoulés depuis le 1er janvier 0001 00:00:00.000 dans le calendrier géorgien. |
| type | DateTimeKind | La valeur qui indique si le paramètre **ticks** spécifie une heure locale, une heure UTC ou aucune des deux. |

## Voir aussi

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
