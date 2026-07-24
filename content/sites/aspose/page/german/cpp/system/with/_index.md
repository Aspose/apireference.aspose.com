---
title: "System::With Methode"
linktitle: "Mit"
second_title: "Aspose.Page für C++"
description: "System::With Methode. Klont das Referenz-Record und wendet darauf den Initialisierungs-Functor in C++ an."
type: docs
weight: 40100
url: /de/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Klont das Referenz-Record und wendet darauf den Initialisierungs-Functor an.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Record-Typ zum Klonen. |
| A | Typ des Initialisierungs-Functors. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| record | const SharedPtr\<T\>\& | Gemeinsamer Zeiger auf das zu klonende und zu initialisierende Objekt. |
| Initialisierer | const A\& | Auf das geklonte Record angewendeter Initialisierungs-Functor. |

### ReturnValue

Gemeinsamer Zeiger auf geklonten Datensatz.

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


Kopiert Strukturdatensatz und wendet den Initialisierer-Funktor darauf an.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Datensatztyp zum Kopieren. |
| A | Typ des Initialisierungs-Functors. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| record | const T\& | Datensatz zum Kopieren und Initialisieren. |
| Initialisierer | const A\& | Initialisierungs-Funktor wird auf die Kopie des Datensatzes angewendet. |

### ReturnValue

Kopierter Datensatz.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
