---
title: "System::operator* methode"
linktitle: "operator*"
second_title: "Aspose.Page voor C++"
description: "System::operator* methode. Retourneert een nieuwe instantie van de Decimal klasse die een waarde vertegenwoordigt die het resultaat is van de vermenigvuldiging van de opgegeven waarde en de waarde die wordt vertegenwoordigd door het opgegeven Decimal-object in C++."
type: docs
weight: 27400
url: /nl/cpp/system/operator_/
---
## System::operator* method


Retourneert een nieuwe instantie van de [Decimal](../decimal/) klasse die een waarde vertegenwoordigt die het resultaat is van de vermenigvuldiging van de opgegeven waarde en de waarde die wordt vertegenwoordigd door het opgegeven [Decimal](../decimal/) object.

```cpp
template<typename T,typename _> Decimal System::operator*(const T &x, const Decimal &d)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | const T\& | De eerste vermenigvuldiger |
| d | const Decimal\& | Het [Decimal](../decimal/) object dat de tweede vermenigvuldiger vertegenwoordigt |

### ReturnValue

Een nieuwe instantie van de [Decimal](../decimal/) klasse die een waarde vertegenwoordigt die het resultaat is van de vermenigvuldiging van **x** en de waarde die wordt vertegenwoordigd door **d**.

## Zie ook

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
titel: System::operator< methode
linktitel: operator<
tweede_titel: Aspose.Page voor C++
beschrijving: 'System::operator< methode. Bepaalt of de opgegeven waarde kleiner is dan de waarde die wordt vertegenwoordigd door het opgegeven Nullable-object door operator<() toe te passen op deze waarden in C++.'
type: docs
gewicht: 28600
url: /cpp/system/operator_/
---
## System::operator<(const T1\&, const Nullable\<T2\>\&) method


Bepaalt of de opgegeven waarde kleiner is dan de waarde die wordt vertegenwoordigd door het opgegeven [Nullable](../nullable/) object door [operator<()](./) toe te passen op deze waarden.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het type van de eerste vergelijkingswaarde |
| T2 | Het onderliggende type van het [Nullable](../nullable/) object dat de tweede vergelijkingswaarde vertegenwoordigt |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| enkele | const T1\& | Een constante referentie naar de waarde die als eerste vergelijkingswaarde moet worden gebruikt. |
| other | const Nullable\<T2\>\& | Een constante referentie naar het [Nullable](../nullable/) object waarvan de vertegenwoordigde waarde als tweede vergelijkingswaarde moet worden gebruikt. |

### ReturnValue

Waar als de eerste vergelijkende kleiner is dan de tweede vergelijkende, anders - onwaar

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<(std::nullptr_t, const DateTimeOffset &)
```

## Zie ook

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const Nullable\<T\>\&) method


Geeft altijd false terug.

```cpp
template<typename T> bool System::operator<(std::nullptr_t, const Nullable<T> &)
```

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, DateTime) method




```cpp
bool System::operator<(std::nullptr_t, DateTime)
```

## Zie ook

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<(std::nullptr_t, TimeSpan)
```

## Zie ook

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
titel: System::operator> methode
linktitle: operator>
tweede_titel: Aspose.Page voor C++
beschrijving: 'System::operator> methode. Bepaalt of de opgegeven waarde groter is dan de waarde die wordt vertegenwoordigd door het opgegeven Nullable-object door operator>() toe te passen op deze waarden in C++.'
type: docs
gewicht: 34100
url: /cpp/system/operator_/
---
## System::operator>(const T1\&, const Nullable\<T2\>\&) method


Bepaalt of de opgegeven waarde groter is dan de waarde die wordt vertegenwoordigd door het opgegeven [Nullable](../nullable/) object door [operator>()](./) toe te passen op deze waarden.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het type van de eerste vergelijkingswaarde |
| T2 | Het onderliggende type van het [Nullable](../nullable/) object dat de tweede vergelijkingswaarde vertegenwoordigt |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| enkele | const T1\& | Een constante referentie naar de waarde die als eerste vergelijkingswaarde moet worden gebruikt. |
| other | const Nullable\<T2\>\& | Een constante referentie naar het [Nullable](../nullable/) object waarvan de vertegenwoordigde waarde als tweede vergelijkingswaarde moet worden gebruikt. |

### ReturnValue

Waar als de eerste vergelijkende groter is dan de tweede vergelijkende, anders - onwaar

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>(std::nullptr_t, const DateTimeOffset &)
```

## Zie ook

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const Nullable\<T\>\&) method


Geeft altijd false terug.

```cpp
template<typename T> bool System::operator>(std::nullptr_t, const Nullable<T> &)
```

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, DateTime) method




```cpp
bool System::operator>(std::nullptr_t, DateTime)
```

## Zie ook

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>(std::nullptr_t, TimeSpan)
```

## Zie ook

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
