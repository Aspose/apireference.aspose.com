---
title: "System::Array::Exists Methode"
linktitle: "Exists"
second_title: "Aspose.Font für C++"
description: "System::Array::Exists Methode. Bestimmt, ob das angegebene Array-Objekt ein Element enthält, das die Anforderungen des angegebenen Prädikats in C++ erfüllt."
type: docs
weight: 5000
url: /de/cpp/system/array/exists/
---
## Array::Exists method


Bestimmt, ob das angegebene [Array](../)-Objekt ein Element enthält, das die Anforderungen des angegebenen Prädikats erfüllt.

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Das Array, in dem nach dem Element gesucht wird |
| Übereinstimmung | std::function\<bool(T)> | Funktionsobjekt, das Anforderungen definiert und prüft, ob ein Element diese erfüllt |

### ReturnValue

Wahr, wenn **arr** ein Element enthält, das die durch **match** definierten Anforderungen erfüllt

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
