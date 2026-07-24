---
title: "System::Nullable::operator== methode"
linktitle: "operator=="
second_title: "Aspose.Page voor C++"
description: "System::Nullable::operator== methode. Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd gelijk is aan de waarde die door het opgegeven Nullable-object wordt vertegenwoordigd in C++."
type: docs
weight: 1900
url: /nl/cpp/system/nullable/operator==/
---
## Nullable::operator==(const Nullable\<T1\>\&) const method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd gelijk is aan de waarde die door het opgegeven [Nullable](../)-object wordt vertegenwoordigd.

```cpp
template<typename T1> bool System::Nullable<T>::operator==(const Nullable<T1> &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het onderliggende type van het [Nullable](../) object om mee te vergelijken |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Een constante referentie naar het [Nullable](../) object om mee te vergelijken |

### ReturnValue

Waar als de waarde die door het huidige object wordt vertegenwoordigd gelijk is aan de waarde die door het opgegeven [Nullable](../)-object wordt vertegenwoordigd, anders - onwaar

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator==(const T1\&) const method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd gelijk is aan de opgegeven waarde.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator==(const T1 &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het type van de waarde om mee te vergelijken |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | const T1\& | Een constante referentie naar de waarde om mee te vergelijken |

### ReturnValue

Waar als de waarde die door het huidige object wordt vertegenwoordigd gelijk is aan de opgegeven waarde, anders - onwaar

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator==(std::nullptr_t) const method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd null is.

```cpp
bool System::Nullable<T>::operator==(std::nullptr_t) const
```


### ReturnValue

Waar als de waarde die door het huidige object wordt vertegenwoordigd null is, anders - onwaar

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
