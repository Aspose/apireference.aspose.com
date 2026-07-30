---
title: "System::Cast_noexcept metodo"
linktitle: "Cast_noexcept"
second_title: "Aspose.Font per C++"
description: "System::Cast_noexcept metodo. Esegue il cast su oggetti SmartPtr in C++."
type: docs
weight: 15500
url: /it/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


Esegue il cast su oggetti [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di puntatore di destinazione. |
| TFrom | Tipo di puntatore di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito o nullptr altrimenti.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
