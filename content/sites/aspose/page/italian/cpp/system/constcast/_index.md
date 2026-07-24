---
title: "Metodo System::ConstCast"
linktitle: "ConstCast"
second_title: "Aspose.Page per C++"
description: "Metodo System::ConstCast. Fine dei cast deprecati in C++."
type: docs
weight: 16100
url: /it/cpp/system/constcast/
---
## System::ConstCast method


Fine dei cast deprecati.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo dell'oggetto puntato di destinazione. |
| TFrom | Tipo dell'oggetto puntato di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito, altrimenti nullptr.
## Osservazioni


Esegue cast const su oggetti [SmartPtr](../smartptr/).
## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
