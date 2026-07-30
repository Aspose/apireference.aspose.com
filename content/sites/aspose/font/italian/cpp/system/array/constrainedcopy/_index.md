---
title: "Metodo System::Array::ConstrainedCopy"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Font per C++"
description: "Metodo System::Array::ConstrainedCopy. Copia un intervallo di elementi da un System.Array a partire dalla sorgente specificata in C++."
type: docs
weight: 4700
url: /it/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


Copia un intervallo di elementi da un [System.Array](../) a partire dalla sorgente specificata.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametro | Descrizione |
| --- | --- |
| SrcType | Tipo degli elementi nell'array di origine |
| DstType | Tipo degli elementi nell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Array di origine |
| srcIndex | int64_t | Indice nell'array di origine che indica l'inizio dell'intervallo di elementi da copiare |
| dstArray | const ArrayPtr\<DstType\>\& | Array di destinazione |
| dstIndex | int64_t | Indice nell'array di destinazione dove iniziare a inserire gli elementi copiati |
| count | int64_t | Il numero di elementi da copiare |
## Osservazioni


IMPLEMENTAZIONE RAW TEMPORANEA SENZA NESSUNA ANNULLAZIONE!
## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
