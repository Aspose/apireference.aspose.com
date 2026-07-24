---
title: "System::With methode"
linktitle: "With"
second_title: "Aspose.Page voor C++"
description: "System::With methode. Kloont referentierecord en past de initializer-functor toe in C++."
type: docs
weight: 40100
url: /nl/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Kloont referentierecord en past de initializer-functor toe.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Recordtype om te klonen. |
| A | Initialisatie-functortype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| record | const SharedPtr\<T\>\& | Gedeelde pointer naar het object om te klonen en te initialiseren. |
| initializer | const A\& | Initialisatie-functor die wordt toegepast op gekloond record. |

### ReturnValue

Gedeelde pointer naar gekloond record.

## Zie ook

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


Kopieert structrecord en past de initializer-functor toe.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Recordtype om te kopiëren. |
| A | Initialisatie-functortype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| record | const T\& | Record om te kopiëren en te initialiseren. |
| initializer | const A\& | Initialisatie-functor die wordt toegepast op gekopieerd record. |

### ReturnValue

Gekopieerd record.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
