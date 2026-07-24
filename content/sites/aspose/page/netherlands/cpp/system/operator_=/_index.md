---
title: "System::operator<= methode"
linktitle: "operator<="
second_title: "Aspose.Page voor C++"
description: "System::operator<= methode. Bepaalt of de opgegeven waarde kleiner of gelijk is aan de waarde die wordt vertegenwoordigd door het opgegeven Nullable‑object door operator<=() toe te passen op deze waarden in C++."
type: docs
weight: 31900
url: /nl/cpp/system/operator_=/
---
## System::operator<=(const T1\&, const Nullable\<T2\>\&) method


Bepaalt of de opgegeven waarde kleiner of gelijk is aan de waarde die wordt vertegenwoordigd door het opgegeven [Nullable](../nullable/) object door [operator<=()](./) toe te passen op deze waarden.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<=(const T1 &some, const Nullable<T2> &other)
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

True als de eerste comparand kleiner of gelijk is aan de tweede comparand, anders - false

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<=(std::nullptr_t, const DateTimeOffset &)
```

## Zie ook

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const Nullable\<T\>\&) method


Geeft altijd false terug.

```cpp
template<typename T> bool System::operator<=(std::nullptr_t, const Nullable<T> &)
```

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, DateTime) method




```cpp
bool System::operator<=(std::nullptr_t, DateTime)
```

## Zie ook

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<=(std::nullptr_t, TimeSpan)
```

## Zie ook

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
title: System::operator>= methode
linktitel: operator>=
tweede_titel: Aspose.Page voor C++
description: 'System::operator>= methode. Bepaalt of de opgegeven waarde groter of gelijk is aan de waarde die wordt vertegenwoordigd door het opgegeven Nullable object door operator>=() toe te passen op deze waarden in C++.'
type: docs
weight: 34600
url: /cpp/system/operator_=/
---
## System::operator>=(const T1\&, const Nullable\<T2\>\&) method


Bepaalt of de opgegeven waarde groter of gelijk is aan de waarde die wordt vertegenwoordigd door het opgegeven [Nullable](../nullable/) object door [operator>=()](./) toe te passen op deze waarden.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>=(const T1 &some, const Nullable<T2> &other)
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

True als de eerste comparand groter of gelijk is aan de tweede comparand, anders - false

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>=(std::nullptr_t, const DateTimeOffset &)
```

## Zie ook

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const Nullable\<T\>\&) method


Geeft altijd false terug.

```cpp
template<typename T> bool System::operator>=(std::nullptr_t, const Nullable<T> &)
```

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, DateTime) method




```cpp
bool System::operator>=(std::nullptr_t, DateTime)
```

## Zie ook

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>=(std::nullptr_t, TimeSpan)
```

## Zie ook

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
