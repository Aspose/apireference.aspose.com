---
title: "System::With Methode"
linktitle: "With"
second_title: "Aspose.Font für C++"
description: "System::With Methode. Klont das Referenz‑Record und wendet darauf einen Initialisierungs‑Functor in C++ an."
type: docs
weight: 40200
url: /de/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Klont das Referenz‑Record und wendet darauf einen Initialisierungs‑Functor an.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Record‑Typ zum Klonen. |
| A | Initialisierungs‑Functor‑Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Record | const SharedPtr\<T\>\& | Gemeinsamer Zeiger auf das Objekt, das geklont und initialisiert werden soll. |
| Initialisierer | const A\& | Initialisierungs-Funktor wird auf die Klonkopie des Datensatzes angewendet. |

### ReturnValue

Shared-Pointer auf geklonten Datensatz.

## Siehe auch

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::With(const T\&, const A\&) method


Kopiert Strukturdatensatz und wendet Initialisierungs-Funktor darauf an.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Datensatztyp zum Kopieren. |
| A | Initialisierungs‑Functor‑Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Record | const T\& | Datensatz zum Kopieren und Initialisieren. |
| Initialisierer | const A\& | Initialisierungs-Funktor wird auf die Kopie des Datensatzes angewendet. |

### ReturnValue

Kopierter Datensatz.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
