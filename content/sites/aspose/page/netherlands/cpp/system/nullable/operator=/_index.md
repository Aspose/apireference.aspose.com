---
title: "System::Nullable::operator= methode"
linktitle: "operator="
second_title: "Aspose.Page voor C++"
description: "System::Nullable::operator= methode. Vervangt de momenteel door het object vertegenwoordigde waarde door de opgegeven waarde in C++."
type: docs
weight: 1800
url: /nl/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


Vervangt de momenteel door het object vertegenwoordigde waarde door de opgegeven waarde.

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| Parameter | Beschrijving |
| --- | --- |
| De | type van de nieuwe waarde die door het huidige object moet worden vertegenwoordigd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | De nieuwe waarde die door het huidige object moet worden vertegenwoordigd |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(const T1\&) method


Vervangt de momenteel door het object vertegenwoordigde waarde door de opgegeven waarde.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| Parameter | Beschrijving |
| --- | --- |
| De | type van de nieuwe waarde die door het huidige object moet worden vertegenwoordigd |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | const T1\& | De nieuwe waarde die door het huidige object moet worden vertegenwoordigd |

### ReturnValue

Een verwijzing naar zichzelf

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


Ken een null toe aan het huidige object.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

Een [Nullable](../) object dat een null-waarde vertegenwoordigt.

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
