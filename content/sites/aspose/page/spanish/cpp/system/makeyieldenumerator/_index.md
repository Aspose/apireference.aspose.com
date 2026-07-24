---
title: "System::MakeYieldEnumerator método"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Page para C++"
description: "System::MakeYieldEnumerator método. Crea un IEnumerator a partir de una función yield en C++."
type: docs
weight: 25400
url: /es/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Crea un IEnumerator a partir de una función yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de los elementos en la secuencia |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | La función yield para ejecutar |

### ReturnValue

Puntero compartido al IEnumerator

## Ver también

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
