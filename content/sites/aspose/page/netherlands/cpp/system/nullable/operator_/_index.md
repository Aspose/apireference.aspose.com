---
title: "System::Nullable::operator<-methode"
linktitle: "operator<"
second_title: "Aspose.Page voor C++"
description: "System::Nullable::operator< methode. Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd kleiner is dan de waarde die door het opgegeven Nullable-object wordt vertegenwoordigd door operator<() toe te passen op deze waarden in C++."
type: docs
weight: 1600
url: /nl/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd kleiner is dan de waarde die door het opgegeven [Nullable](../)-object wordt vertegenwoordigd door [operator<()](./) toe te passen op deze waarden.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het onderliggende type van het [Nullable](../) object om mee te vergelijken |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Een constante referentie naar het [Nullable](../) object om mee te vergelijken |

### ReturnValue

Waar als de waarde die door het huidige object wordt vertegenwoordigd kleiner is dan de waarde die door het opgegeven [Nullable](../)-object wordt vertegenwoordigd, anders - onwaar

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(const T1\&) const method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd kleiner is dan de opgegeven waarde door [operator<()](./) toe te passen op deze waarden.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het type van de waarde om mee te vergelijken |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | const T1\& | Een constante referentie naar de waarde om mee te vergelijken |

### ReturnValue

Waar als de waarde die door het huidige object wordt vertegenwoordigd kleiner is dan de opgegeven waarde, anders - onwaar

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


Geeft altijd false terug.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::Nullable::operator> methode
linktitle: operator>
tweede_titel: Aspose.Page voor C++
description: 'System::Nullable::operator> methode. Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd groter is dan de waarde die door het opgegeven Nullable-object wordt vertegenwoordigd door operator>() toe te passen op deze waarden in C++.'
type: docs
weight: 2000
url: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd groter is dan de waarde die door het opgegeven [Nullable](../)-object wordt vertegenwoordigd door [operator>()](./) toe te passen op deze waarden.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het onderliggende type van het [Nullable](../) object om mee te vergelijken |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Een constante referentie naar het [Nullable](../) object om mee te vergelijken |

### ReturnValue

Waar als de waarde die door het huidige object wordt vertegenwoordigd groter is dan de waarde die door het opgegeven [Nullable](../)-object wordt vertegenwoordigd, anders - onwaar

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(const T1\&) const method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd groter is dan de opgegeven waarde door [operator>()](./) toe te passen op deze waarden.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het type van de waarde om mee te vergelijken |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | const T1\& | Een constante referentie naar de waarde om mee te vergelijken |

### ReturnValue

Waar als de waarde die door het huidige object wordt vertegenwoordigd groter is dan de opgegeven waarde, anders - onwaar

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


Geeft altijd false terug.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
