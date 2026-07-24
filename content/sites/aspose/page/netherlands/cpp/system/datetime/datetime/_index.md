---
title: "System::DateTime::DateTime constructor"
linktitle: "DateTime"
second_title: "Aspose.Page voor C++"
description: "System::DateTime::DateTime constructor. Construeert een instantie die de kleinst mogelijke datum- en tijdwaarde vertegenwoordigt die gelijk is aan MinValue in C++."
type: docs
weight: 100
url: /nl/cpp/system/datetime/datetime/
---
## DateTime::DateTime() constructor


Construeert een exemplaar dat de kleinst mogelijke datum‑tijdwaarde vertegenwoordigt, gelijk aan MinValue.

```cpp
System::DateTime::DateTime()
```

## Zie ook

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(const DateTime\&) constructor


Kopieert een exemplaar.

```cpp
System::DateTime::DateTime(const DateTime &dt)=default
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| dt | const DateTime\& | Een instantie van de [DateTime](../) klasse om de vertegenwoordigde datum- en tijdwaarde van te kopiëren |

## Zie ook

* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int) constructor


Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand en dag.

```cpp
System::DateTime::DateTime(int year, int month, int day)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| jaar | int | Het jaar dat door de te construeren instantie wordt vertegenwoordigd. |
| maand | int | De maand van het **year** die door de te construeren instantie wordt vertegenwoordigd. |
| dag | int | De dag van de **month** die door de te construeren instantie wordt vertegenwoordigd. |

## Zie ook

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand en dag in de opgegeven kalender.

```cpp
System::DateTime::DateTime(int year, int month, int day, const SharedPtr<Globalization::Calendar> &calendar)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| jaar | int | Het jaar dat door de te construeren instantie wordt vertegenwoordigd. |
| maand | int | De maand van het **year** die door de te construeren instantie wordt vertegenwoordigd. |
| dag | int | De dag van de **month** die door de te construeren instantie wordt vertegenwoordigd. |
| kalender | const SharedPtr\<Globalization::Calendar\>\& | De kalender die wordt gebruikt om de opgegeven **year**, **month** en **day** te interpreteren. |

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int) constructor


Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand, dag, uur, minuut en seconde.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| jaar | int | Het jaar dat door de te construeren instantie wordt vertegenwoordigd. |
| maand | int | De maand van het **year** die door de te construeren instantie wordt vertegenwoordigd. |
| dag | int | De dag van de **month** die door de te construeren instantie wordt vertegenwoordigd. |
| uur | int | Het uur van de **day** dat wordt weergegeven door de instantie die wordt geconstrueerd. |
| minuut | int | De minuut van de **hour** die wordt weergegeven door de instantie die wordt geconstrueerd. |
| seconde | int | De seconde van de **minute** die wordt weergegeven door de instantie die wordt geconstrueerd. |

## Zie ook

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand, dag, uur, minuut en seconde in de opgegeven kalender.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, const SharedPtr<Globalization::Calendar> &calendar)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| jaar | int | Het jaar dat door de te construeren instantie wordt vertegenwoordigd. |
| maand | int | De maand van het **year** die door de te construeren instantie wordt vertegenwoordigd. |
| dag | int | De dag van de **month** die door de te construeren instantie wordt vertegenwoordigd. |
| uur | int | Het uur van de **day** dat wordt weergegeven door de instantie die wordt geconstrueerd. |
| minuut | int | De minuut van de **hour** die wordt weergegeven door de instantie die wordt geconstrueerd. |
| seconde | int | De seconde van de **minute** die wordt weergegeven door de instantie die wordt geconstrueerd. |
| kalender | const SharedPtr\<Globalization::Calendar\>\& | De kalender die wordt gebruikt om de opgegeven **year**, **month** en **day** te interpreteren. |

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, DateTimeKind) constructor


Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand, dag, uur, minuut en seconde.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| jaar | int | Het jaar dat door de te construeren instantie wordt vertegenwoordigd. |
| maand | int | De maand van het **year** die door de te construeren instantie wordt vertegenwoordigd. |
| dag | int | De dag van de **month** die door de te construeren instantie wordt vertegenwoordigd. |
| uur | int | Het uur van de **day** dat wordt weergegeven door de instantie die wordt geconstrueerd. |
| minuut | int | De minuut van de **hour** die wordt weergegeven door de instantie die wordt geconstrueerd. |
| seconde | int | De seconde van de **minute** die wordt weergegeven door de instantie die wordt geconstrueerd. |
| type | DateTimeKind | De waarde die aangeeft of de opgegeven datum- en tijdparameters een lokale tijd, UTC-tijd of geen van beide specificeren. |

## Zie ook

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) constructor


Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand, dag, uur, minuut, seconde en milliseconde in de opgegeven kalender.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| jaar | int | Het jaar dat door de te construeren instantie wordt vertegenwoordigd. |
| maand | int | De maand van het **year** die door de te construeren instantie wordt vertegenwoordigd. |
| dag | int | De dag van de **month** die door de te construeren instantie wordt vertegenwoordigd. |
| uur | int | Het uur van de **day** dat wordt weergegeven door de instantie die wordt geconstrueerd. |
| minuut | int | De minuut van de **hour** die wordt weergegeven door de instantie die wordt geconstrueerd. |
| seconde | int | De seconde van de **minute** die wordt weergegeven door de instantie die wordt geconstrueerd. |
| milliseconde | int | De milliseconde van de **second** die wordt weergegeven door de instantie die wordt geconstrueerd. |
| type | const SharedPtr\<Globalization::Calendar\>\& | De waarde die aangeeft of de opgegeven datum- en tijdparameters een lokale tijd, UTC-tijd of geen van beide specificeren. |
| kalender | DateTimeKind | De kalender die wordt gebruikt om de opgegeven **year**, **month** en **day** te interpreteren. |

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, DateTimeKind) constructor


Construeert een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een specifiek jaar, maand, dag, uur, minuut, seconde en milliseconde.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| jaar | int | Het jaar dat door de te construeren instantie wordt vertegenwoordigd. |
| maand | int | De maand van het **year** die door de te construeren instantie wordt vertegenwoordigd. |
| dag | int | De dag van de **month** die door de te construeren instantie wordt vertegenwoordigd. |
| uur | int | Het uur van de **day** dat wordt weergegeven door de instantie die wordt geconstrueerd. |
| minuut | int | De minuut van de **hour** die wordt weergegeven door de instantie die wordt geconstrueerd. |
| seconde | int | De seconde van de **minute** die wordt weergegeven door de instantie die wordt geconstrueerd. |
| milliseconde | int | De milliseconde van de **second** die wordt weergegeven door de instantie die wordt geconstrueerd. |
| type | DateTimeKind | De waarde die aangeeft of de opgegeven datum- en tijdparameters een lokale tijd, UTC-tijd of geen van beide specificeren. |

## Zie ook

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind, bool) constructor


Construeer een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een aantal ticks. VOOR INTERN GEBRUIK.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind, bool is_ambiguous_local_dst)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ticks | int64_t | Het aantal 100-ns intervallen dat is verstreken sinds 1 januari 0001 00:00:00.000 in de Georgische kalender. |
| type | DateTimeKind | De waarde die aangeeft of de **ticks**-parameter een lokale tijd, UTC-tijd of geen van beide specificeert. |
| is_ambiguous_local_dst | bool | Waar als de opgegeven datum en tijd ambigu zijn en naar veel UTC-tijden kunnen worden gemapt. |

## Zie ook

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind) constructor


Construeer een exemplaar dat een datum‑tijdwaarde vertegenwoordigt die is opgegeven als een aantal ticks.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ticks | int64_t | Het aantal 100-ns intervallen dat is verstreken sinds 1 januari 0001 00:00:00.000 in de Georgische kalender. |
| type | DateTimeKind | De waarde die aangeeft of de **ticks**-parameter een lokale tijd, UTC-tijd of geen van beide specificeert. |

## Zie ook

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
