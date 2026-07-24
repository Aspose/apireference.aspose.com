---
title: "System::Nullable::operator+=-methode"
linktitle: "operator+="
second_title: "Aspose.Page voor C++"
description: "System::Nullable::operator+=-methode. Past operator+=() toe op de waarde die door het huidige object wordt vertegenwoordigd, waarbij de waarde die door het opgegeven Nullable-object wordt vertegenwoordigd als rechterargument wordt gebruikt in C++."
type: docs
weight: 1300
url: /nl/cpp/system/nullable/operator+=/
---
## Nullable::operator+=(const Nullable\<T1\>\&) method


Past [operator+=()](./) toe op de waarde die door het huidige object wordt vertegenwoordigd, waarbij de waarde die door het opgegeven [Nullable](../)-object wordt vertegenwoordigd als rechterargument wordt gebruikt.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator+=(const Nullable<T1> &other)
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het onderliggende type van een [Nullable](../)-object waarvan de vertegenwoordigde waarde wordt gebruikt als rechterargument van [operator+=()](./). |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Een constante referentie naar een [Nullable](../)-object waarvan de vertegenwoordigde waarde wordt gebruikt als rechterargument van de [operator+=()](./) die wordt toegepast op de waarde die door het huidige object wordt vertegenwoordigd. |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(const T1\&) method


Past [operator+=()](./) toe op de waarde die door het huidige object wordt vertegenwoordigd, waarbij de opgegeven waarde als rechterargument wordt gebruikt.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator+=(const T1 &other)
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het type van de waarde die wordt gebruikt als rechterwaarde van [operator+=()](./). |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | const T1\& | Een constante referentie naar de waarde die wordt gebruikt als rechterwaarde van de [operator+=()](./) die wordt toegepast op de waarde die door het huidige object wordt vertegenwoordigd. |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(std::nullptr_t) method


Reset het huidige object zodat het een null-waarde vertegenwoordigt.

```cpp
Nullable<T> System::Nullable<T>::operator+=(std::nullptr_t)
```


### ReturnValue

Een kopie van zichzelf

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
