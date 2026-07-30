---
title: "System::ConstCast metodo"
linktitle: "CastCostante"
second_title: "Aspose.Font per C++"
description: "Metodo System::ConstCast. Fine dei cast deprecati in C++."
type: docs
weight: 16200
url: /it/cpp/system/constcast/
---
## System::ConstCast method


Fine dei cast deprecati.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di puntatore di destinazione. |
| TFrom | Tipo di puntatore di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito o nullptr altrimenti.
## Osservazioni


Esegue il cast const su oggetti [SmartPtr](../smartptr/).
## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
