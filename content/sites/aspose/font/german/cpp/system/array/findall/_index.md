---
title: "System::Array::FindAll method"
linktitle: "FindAll"
second_title: "Aspose.Font für C++"
description: "System::Array::FindAll method. Ruft alle Elemente ab, die den durch das angegebene Prädikat definierten Bedingungen entsprechen, in C++."
type: docs
weight: 5200
url: /de/cpp/system/array/findall/
---
## Array::FindAll method


Ruft alle Elemente ab, die den durch das angegebene Prädikat definierten Bedingungen entsprechen.

```cpp
static System::ArrayPtr<T> System::Array<T>::FindAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) zum Durchsuchen von Elementen |
| Übereinstimmung | System::Predicate\<T\> | Ein Prädikat, das die Bedingungen definiert, gegen die Array-Elemente abgeglichen werden sollen. |

### ReturnValue

Ein [Array](../), das alle Elemente enthält, die den durch das angegebene Prädikat definierten Bedingungen entsprechen, falls gefunden; andernfalls ein leeres [Array](../).

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
