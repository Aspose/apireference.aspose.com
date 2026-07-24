---
title: "System::Nullable::Equals methode"
linktitle: "Gelijk"
second_title: "Aspose.Page voor C++"
description: "System::Nullable::Equals methode. Bepaalt of de waarde die door het huidige object wordt weergegeven gelijk is aan de waarde die door het opgegeven Nullable-object wordt weergegeven in C++."
type: docs
weight: 200
url: /nl/cpp/system/nullable/equals/
---
## Nullable::Equals method


Bepaalt of de waarde die door het huidige object wordt vertegenwoordigd gelijk is aan de waarde die door het opgegeven [Nullable](../)-object wordt vertegenwoordigd.

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Het onderliggende type van het [Nullable](../) object om mee te vergelijken |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| other | const T1\& | Een constante referentie naar het [Nullable](../) object om mee te vergelijken |

### ReturnValue

Waar als de waarde die door het huidige object wordt vertegenwoordigd gelijk is aan de waarde die door het opgegeven [Nullable](../)-object wordt vertegenwoordigd, anders - onwaar

## Zie ook

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
