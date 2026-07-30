---
title: "System::Array::Find-Methode"
linktitle: "Find"
second_title: "Aspose.Font für C++"
description: "System::Array::Find-Methode. Durchsucht das angegebene Array nach dem ersten Element, das die Bedingungen des angegebenen Prädikats in C++ erfüllt."
type: docs
weight: 5100
url: /de/cpp/system/array/find/
---
## Array::Find method


Durchsucht das angegebene Array nach dem ersten Element, das die Bedingungen des angegebenen Prädikats erfüllt.

```cpp
static T System::Array<T>::Find(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) um ein Element darin zu suchen |
| Übereinstimmung | System::Predicate\<T\> | Ein Prädikat, das die Bedingungen definiert, gegen die Array-Elemente abgeglichen werden sollen. |

### ReturnValue

Kopie des ersten Elements im Array, das die durch das Prädikat definierten Bedingungen erfüllt, andernfalls der Standardwert des Typs T.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
