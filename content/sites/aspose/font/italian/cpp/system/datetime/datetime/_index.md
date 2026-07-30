---
title: "System::DateTime::DateTime costruttore"
linktitle: "DateTime"
second_title: "Aspose.Font per C++"
description: "System::DateTime::DateTime costruttore. Crea un'istanza che rappresenta il valore di data e ora più piccolo possibile, uguale a MinValue in C++."
type: docs
weight: 100
url: /it/cpp/system/datetime/datetime/
---
## DateTime::DateTime() constructor


Costruisce un'istanza che rappresenta il valore di data e ora più piccolo possibile, uguale a MinValue.

```cpp
System::DateTime::DateTime()
```

## Vedi anche

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(const DateTime\&) constructor


Copia costruttore di un'istanza.

```cpp
System::DateTime::DateTime(const DateTime &dt)=default
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dt | const DateTime\& | Un'istanza della classe [DateTime](../) da cui copiare il valore di data e ora rappresentato |

## Vedi anche

* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int) constructor


Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese e giorno particolari.

```cpp
System::DateTime::DateTime(int year, int month, int day)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anno | int | L'anno da rappresentare nell'istanza in fase di costruzione. |
| mese | int | Il mese dell'**year** da rappresentare nell'istanza in fase di costruzione. |
| giorno | int | Il giorno del **month** da rappresentare nell'istanza in fase di costruzione. |

## Vedi anche

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese e giorno particolari nel calendario specificato.

```cpp
System::DateTime::DateTime(int year, int month, int day, const SharedPtr<Globalization::Calendar> &calendar)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anno | int | L'anno da rappresentare nell'istanza in fase di costruzione. |
| mese | int | Il mese dell'**year** da rappresentare nell'istanza in fase di costruzione. |
| giorno | int | Il giorno del **month** da rappresentare nell'istanza in fase di costruzione. |
| calendario | const SharedPtr\<Globalization::Calendar\>\& | Il calendario usato per interpretare il **year**, **month** e **day** specificati. |

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int) constructor


Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese, giorno, ora, minuto e secondo particolari.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anno | int | L'anno da rappresentare nell'istanza in fase di costruzione. |
| mese | int | Il mese dell'**year** da rappresentare nell'istanza in fase di costruzione. |
| giorno | int | Il giorno del **month** da rappresentare nell'istanza in fase di costruzione. |
| ora | int | L'ora del **day** da rappresentare nell'istanza in fase di costruzione. |
| minuto | int | Il minuto dell'**hour** da rappresentare nell'istanza in fase di costruzione. |
| secondo | int | Il secondo del **minute** da rappresentare nell'istanza in fase di costruzione. |

## Vedi anche

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese, giorno, ora, minuto e secondo particolari nel calendario specificato.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, const SharedPtr<Globalization::Calendar> &calendar)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anno | int | L'anno da rappresentare nell'istanza in fase di costruzione. |
| mese | int | Il mese dell'**year** da rappresentare nell'istanza in fase di costruzione. |
| giorno | int | Il giorno del **month** da rappresentare nell'istanza in fase di costruzione. |
| ora | int | L'ora del **day** da rappresentare nell'istanza in fase di costruzione. |
| minuto | int | Il minuto dell'**hour** da rappresentare nell'istanza in fase di costruzione. |
| secondo | int | Il secondo del **minute** da rappresentare nell'istanza in fase di costruzione. |
| calendario | const SharedPtr\<Globalization::Calendar\>\& | Il calendario usato per interpretare il **year**, **month** e **day** specificati. |

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, DateTimeKind) constructor


Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese, giorno, ora, minuto e secondo particolari.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anno | int | L'anno da rappresentare nell'istanza in fase di costruzione. |
| mese | int | Il mese dell'**year** da rappresentare nell'istanza in fase di costruzione. |
| giorno | int | Il giorno del **month** da rappresentare nell'istanza in fase di costruzione. |
| ora | int | L'ora del **day** da rappresentare nell'istanza in fase di costruzione. |
| minuto | int | Il minuto dell'**hour** da rappresentare nell'istanza in fase di costruzione. |
| secondo | int | Il secondo del **minute** da rappresentare nell'istanza in fase di costruzione. |
| tipo | DateTimeKind | Il valore che indica se i parametri di data e ora forniti specificano un'ora locale, un'ora UTC o nessuna delle due. |

## Vedi anche

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) constructor


Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese, giorno, ora, minuto, secondo e millisecondo particolari nel calendario specificato.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anno | int | L'anno da rappresentare nell'istanza in fase di costruzione. |
| mese | int | Il mese dell'**year** da rappresentare nell'istanza in fase di costruzione. |
| giorno | int | Il giorno del **month** da rappresentare nell'istanza in fase di costruzione. |
| ora | int | L'ora del **day** da rappresentare nell'istanza in fase di costruzione. |
| minuto | int | Il minuto dell'**hour** da rappresentare nell'istanza in fase di costruzione. |
| secondo | int | Il secondo del **minute** da rappresentare nell'istanza in fase di costruzione. |
| millisecondo | int | Il millisecondo del **second** da rappresentare dall'istanza in costruzione. |
| tipo | const SharedPtr\<Globalization::Calendar\>\& | Il valore che indica se i parametri di data e ora forniti specificano un'ora locale, un'ora UTC o nessuna delle due. |
| calendario | DateTimeKind | Il calendario usato per interpretare il **year**, **month** e **day** specificati. |

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, DateTimeKind) constructor


Crea un'istanza che rappresenta un valore di data e ora specificato come un anno, mese, giorno, ora, minuto, secondo e millisecondo particolari.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anno | int | L'anno da rappresentare nell'istanza in fase di costruzione. |
| mese | int | Il mese dell'**year** da rappresentare nell'istanza in fase di costruzione. |
| giorno | int | Il giorno del **month** da rappresentare nell'istanza in fase di costruzione. |
| ora | int | L'ora del **day** da rappresentare nell'istanza in fase di costruzione. |
| minuto | int | Il minuto dell'**hour** da rappresentare nell'istanza in fase di costruzione. |
| secondo | int | Il secondo del **minute** da rappresentare nell'istanza in fase di costruzione. |
| millisecondo | int | Il millisecondo del **second** da rappresentare dall'istanza in costruzione. |
| tipo | DateTimeKind | Il valore che indica se i parametri di data e ora forniti specificano un'ora locale, un'ora UTC o nessuna delle due. |

## Vedi anche

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind, bool) constructor


Crea un'istanza che rappresenta un valore di data e ora specificato come un numero di tick. PER USO INTERNO.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind, bool is_ambiguous_local_dst)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| tick | int64_t | Il numero di intervalli di 100-ns trascorsi dal 1° gennaio 0001 00:00:00.000 nel calendario georgiano. |
| tipo | DateTimeKind | Il valore che indica se il parametro **ticks** specifica un'ora locale, un'ora UTC o nessuna delle due. |
| is_ambiguous_local_dst | bool | Vero se la data e l'ora specificate sono ambigue e possono essere mappate a molte ore UTC. |

## Vedi anche

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind) constructor


Crea un'istanza che rappresenta un valore di data e ora specificato come un numero di tick.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| tick | int64_t | Il numero di intervalli di 100-ns trascorsi dal 1° gennaio 0001 00:00:00.000 nel calendario georgiano. |
| tipo | DateTimeKind | Il valore che indica se il parametro **ticks** specifica un'ora locale, un'ora UTC o nessuna delle due. |

## Vedi anche

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
