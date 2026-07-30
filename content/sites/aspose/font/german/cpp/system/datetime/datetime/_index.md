---
title: "System::DateTime::DateTime-Konstruktor"
linktitle: "DateTime"
second_title: "Aspose.Font für C++"
description: "System::DateTime::DateTime-Konstruktor. Erstellt eine Instanz, die den kleinsten möglichen Datums- und Zeitwert, gleich MinValue, in C++ darstellt."
type: docs
weight: 100
url: /de/cpp/system/datetime/datetime/
---
## DateTime::DateTime() constructor


Konstruiert eine Instanz, die den kleinsten möglichen Datum‑ und Zeitwert darstellt, gleich MinValue.

```cpp
System::DateTime::DateTime()
```

## Siehe auch

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(const DateTime\&) constructor


Kopierkonstruiert eine Instanz.

```cpp
System::DateTime::DateTime(const DateTime &dt)=default
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dt | const DateTime\& | Eine Instanz der [DateTime](../)-Klasse, von der der dargestellte Datums- und Uhrzeitwert kopiert werden soll |

## Siehe auch

* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int) constructor


Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat und Tag angegeben ist.

```cpp
System::DateTime::DateTime(int year, int month, int day)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Jahr | int | Das Jahr, das von der zu erstellenden Instanz dargestellt werden soll. |
| Monat | int | Der Monat des **year**-Jahres, das von der zu erstellenden Instanz dargestellt wird. |
| Tag | int | Der Tag des **month**-Monats, das von der zu erstellenden Instanz dargestellt wird. |

## Siehe auch

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat und Tag im angegebenen Kalender angegeben ist.

```cpp
System::DateTime::DateTime(int year, int month, int day, const SharedPtr<Globalization::Calendar> &calendar)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Jahr | int | Das Jahr, das von der zu erstellenden Instanz dargestellt werden soll. |
| Monat | int | Der Monat des **year**-Jahres, das von der zu erstellenden Instanz dargestellt wird. |
| Tag | int | Der Tag des **month**-Monats, das von der zu erstellenden Instanz dargestellt wird. |
| Kalender | const SharedPtr\<Globalization::Calendar\>\& | Der Kalender, der verwendet wird, um das angegebene **year**, **month** und **day** zu interpretieren. |

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int) constructor


Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat, Tag, Stunde, Minute und Sekunde angegeben ist.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Jahr | int | Das Jahr, das von der zu erstellenden Instanz dargestellt werden soll. |
| Monat | int | Der Monat des **year**-Jahres, das von der zu erstellenden Instanz dargestellt wird. |
| Tag | int | Der Tag des **month**-Monats, das von der zu erstellenden Instanz dargestellt wird. |
| Stunde | int | Die Stunde des **day**-Tages, das von der zu erstellenden Instanz dargestellt wird. |
| Minute | int | Die Minute der **hour**-Stunde, das von der zu erstellenden Instanz dargestellt wird. |
| Sekunde | int | Die Sekunde der **minute**-Minute, die von der zu erstellenden Instanz dargestellt wird. |

## Siehe auch

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat, Tag, Stunde, Minute und Sekunde im angegebenen Kalender angegeben ist.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, const SharedPtr<Globalization::Calendar> &calendar)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Jahr | int | Das Jahr, das von der zu erstellenden Instanz dargestellt werden soll. |
| Monat | int | Der Monat des **year**-Jahres, das von der zu erstellenden Instanz dargestellt wird. |
| Tag | int | Der Tag des **month**-Monats, das von der zu erstellenden Instanz dargestellt wird. |
| Stunde | int | Die Stunde des **day**-Tages, das von der zu erstellenden Instanz dargestellt wird. |
| Minute | int | Die Minute der **hour**-Stunde, das von der zu erstellenden Instanz dargestellt wird. |
| Sekunde | int | Die Sekunde der **minute**-Minute, die von der zu erstellenden Instanz dargestellt wird. |
| Kalender | const SharedPtr\<Globalization::Calendar\>\& | Der Kalender, der verwendet wird, um das angegebene **year**, **month** und **day** zu interpretieren. |

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, DateTimeKind) constructor


Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat, Tag, Stunde, Minute und Sekunde angegeben ist.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Jahr | int | Das Jahr, das von der zu erstellenden Instanz dargestellt werden soll. |
| Monat | int | Der Monat des **year**-Jahres, das von der zu erstellenden Instanz dargestellt wird. |
| Tag | int | Der Tag des **month**-Monats, das von der zu erstellenden Instanz dargestellt wird. |
| Stunde | int | Die Stunde des **day**-Tages, das von der zu erstellenden Instanz dargestellt wird. |
| Minute | int | Die Minute der **hour**-Stunde, das von der zu erstellenden Instanz dargestellt wird. |
| Sekunde | int | Die Sekunde der **minute**-Minute, die von der zu erstellenden Instanz dargestellt wird. |
| Art | DateTimeKind | Der Wert, der angibt, ob die bereitgestellten Datums- und Zeitparameter eine lokale Zeit, UTC-Zeit oder keine von beiden angeben. |

## Siehe auch

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) constructor


Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat, Tag, Stunde, Minute, Sekunde und Millisekunde im angegebenen Kalender angegeben ist.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Jahr | int | Das Jahr, das von der zu erstellenden Instanz dargestellt werden soll. |
| Monat | int | Der Monat des **year**-Jahres, das von der zu erstellenden Instanz dargestellt wird. |
| Tag | int | Der Tag des **month**-Monats, das von der zu erstellenden Instanz dargestellt wird. |
| Stunde | int | Die Stunde des **day**-Tages, das von der zu erstellenden Instanz dargestellt wird. |
| Minute | int | Die Minute der **hour**-Stunde, das von der zu erstellenden Instanz dargestellt wird. |
| Sekunde | int | Die Sekunde der **minute**-Minute, die von der zu erstellenden Instanz dargestellt wird. |
| Millisekunde | int | Die Millisekunde der **second**, die von der zu erstellenden Instanz dargestellt wird. |
| Art | const SharedPtr\<Globalization::Calendar\>\& | Der Wert, der angibt, ob die bereitgestellten Datums- und Zeitparameter eine lokale Zeit, UTC-Zeit oder keine von beiden angeben. |
| Kalender | DateTimeKind | Der Kalender, der verwendet wird, um das angegebene **year**, **month** und **day** zu interpretieren. |

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, DateTimeKind) constructor


Konstruiert eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als bestimmtes Jahr, Monat, Tag, Stunde, Minute, Sekunde und Millisekunde angegeben ist.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Jahr | int | Das Jahr, das von der zu erstellenden Instanz dargestellt werden soll. |
| Monat | int | Der Monat des **year**-Jahres, das von der zu erstellenden Instanz dargestellt wird. |
| Tag | int | Der Tag des **month**-Monats, das von der zu erstellenden Instanz dargestellt wird. |
| Stunde | int | Die Stunde des **day**-Tages, das von der zu erstellenden Instanz dargestellt wird. |
| Minute | int | Die Minute der **hour**-Stunde, das von der zu erstellenden Instanz dargestellt wird. |
| Sekunde | int | Die Sekunde der **minute**-Minute, die von der zu erstellenden Instanz dargestellt wird. |
| Millisekunde | int | Die Millisekunde der **second**, die von der zu erstellenden Instanz dargestellt wird. |
| Art | DateTimeKind | Der Wert, der angibt, ob die bereitgestellten Datums- und Zeitparameter eine lokale Zeit, UTC-Zeit oder keine von beiden angeben. |

## Siehe auch

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind, bool) constructor


Konstruiere eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als Anzahl von Ticks angegeben ist. FÜR INTERNEN GEBRAUCH.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind, bool is_ambiguous_local_dst)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Ticks | int64_t | Die Anzahl der 100‑ns‑Intervalle, die seit dem 1. Januar 0001 00:00:00.000 im georgischen Kalender vergangen sind. |
| Art | DateTimeKind | Der Wert, der angibt, ob der **ticks**‑Parameter eine lokale Zeit, UTC‑Zeit oder keine von beiden angibt. |
| is_ambiguous_local_dst | bool | Wahr, wenn das angegebene Datum und die Uhrzeit mehrdeutig sind und auf viele UTC‑Zeiten abgebildet werden können. |

## Siehe auch

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind) constructor


Konstruiere eine Instanz, die einen Datums‑ und Uhrzeitwert darstellt, der als Anzahl von Ticks angegeben ist.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Ticks | int64_t | Die Anzahl der 100‑ns‑Intervalle, die seit dem 1. Januar 0001 00:00:00.000 im georgischen Kalender vergangen sind. |
| Art | DateTimeKind | Der Wert, der angibt, ob der **ticks**‑Parameter eine lokale Zeit, UTC‑Zeit oder keine von beiden angibt. |

## Siehe auch

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
