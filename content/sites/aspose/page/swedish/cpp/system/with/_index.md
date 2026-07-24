---
title: "System::With metod"
linktitle: "With"
second_title: "Aspose.Page för C++"
description: "System::With metod. Klonar referenspost och tillämpar initialiseringsfunktor på den i C++."
type: docs
weight: 40100
url: /sv/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Klonar referenspost och tillämpar initialiseringsfunktor på den.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Posttyp att klona. |
| A | Initialiseringsfunktor-typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| record | const SharedPtr\<T\>\& | Delad pekare till objektet som ska klonas och initieras. |
| initializer | const A\& | Initialiseringsfunktor som tillämpas på postklonen. |

### ReturnValue

Delad pekare till klonad post.

## Se även

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


Kopierar strukturell post och tillämpar initieringsfunktor på den.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Posttyp att kopiera. |
| A | Initialiseringsfunktor-typ. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| record | const T\& | Post att kopiera och initiera. |
| initializer | const A\& | Initieringsfunktor som tillämpas på postkopian. |

### ReturnValue

Kopierad post.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
