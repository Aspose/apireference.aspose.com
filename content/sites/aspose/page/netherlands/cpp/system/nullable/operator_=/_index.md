---
title: "System::Nullable::operator<= methode"
linktitle: "operator<="
second_title: "Aspose.Page voor C++"
description: "System::Nullable::operator<= methode. Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd kleiner of gelijk is aan de waarde die door het opgegeven Nullable-object wordt vertegenwoordigd door operator<=() toe te passen op deze waarden in C++."
type: docs
weight: 1700
url: /nl/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd kleiner of gelijk is aan de waarde die door het opgegeven [Nullable](../) object wordt vertegenwoordigd door [operator<=()](./) toe te passen op deze waarden.

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het onderliggende type van het [Nullable](../) object om mee te vergelijken |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Een constante referentie naar het [Nullable](../) object om mee te vergelijken |

### ReturnValue

True als de waarde die door het huidige object wordt vertegenwoordigd kleiner of gelijk is aan de waarde die door het opgegeven [Nullable](../) object wordt vertegenwoordigd, anders - false

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(const T1\&) const method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd kleiner of gelijk is aan de opgegeven waarde door [operator<=()](./) toe te passen op deze waarden.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het type van de waarde om mee te vergelijken |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | const T1\& | Een constante referentie naar de waarde om mee te vergelijken |

### ReturnValue

True als de waarde die door het huidige object wordt vertegenwoordigd kleiner of gelijk is aan de opgegeven waarde, anders - false

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


Geeft altijd false terug.

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
titel: System::Nullable::operator>= methode
linktitel: operator>=
tweede_titel: Aspose.Page voor C++
description: 'System::Nullable::operator>= methode. Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd groter of gelijk is aan de waarde die door het opgegeven Nullable-object wordt vertegenwoordigd door operator>=() toe te passen op deze waarden in C++.'
type: docs
gewicht: 2100
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd groter of gelijk is aan de waarde die door het opgegeven [Nullable](../) object wordt vertegenwoordigd door [operator>=()](./) toe te passen op deze waarden.

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het onderliggende type van het [Nullable](../) object om mee te vergelijken |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Een constante referentie naar het [Nullable](../) object om mee te vergelijken |

### ReturnValue

True als de waarde die door het huidige object wordt vertegenwoordigd groter of gelijk is aan de waarde die door het opgegeven [Nullable](../) object wordt vertegenwoordigd, anders - false

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(const T1\&) const method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd groter of gelijk is aan de waarde die door het opgegeven object wordt vertegenwoordigd door [operator>=()](./) toe te passen op deze waarden.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het onderliggende type van de waarde om de waarde die door het huidige object wordt vertegenwoordigd mee te vergelijken |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | const T1\& | Een constante referentie naar een object om het huidige object mee te vergelijken |

### ReturnValue

True als de waarde die door het huidige object wordt vertegenwoordigd groter of gelijk is aan de waarde die door het opgegeven object wordt vertegenwoordigd, anders - false

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


Geeft altijd false terug.

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

Altijd - false

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
titel: System::Nullable::operator|= methode
linktitel: operator|=
tweede_titel: Aspose.Page voor C++
description: 'System::Nullable::operator|= methode. Past operator|=() toe op de waarde die door het huidige object wordt vertegenwoordigd met de opgegeven waarde als rechterargument in C++.'
type: docs
gewicht: 2200
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


Past [operator|=()](./) toe op de waarde die door het huidige object wordt vertegenwoordigd met de opgegeven waarde als rechterargument.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | De templateparameter om SFINAE te laten werken. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | bool | Een booleaanse waarde die wordt gebruikt als rechterwaarde van de [operator | =()](./) toegepast op de waarde die door het huidige object wordt vertegenwoordigd. |

### ReturnValue

Een referentie naar zichzelf.

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
