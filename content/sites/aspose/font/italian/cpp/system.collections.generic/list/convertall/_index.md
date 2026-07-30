---
title: "System::Collections::Generic::List::ConvertAll metodo"
linktitle: "ConvertAll"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::List::ConvertAll metodo. Crea una lista di elementi convertiti in un tipo diverso in C++."
type: docs
weight: 1300
url: /it/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


Crea una lista di elementi convertiti in un tipo diverso.

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| Parametro | Descrizione |
| --- | --- |
| OutputType | Tipo di elemento della lista di output. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) da utilizzare per la conversione degli elementi. |

### ReturnValue

Una nuova lista di elementi convertiti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
