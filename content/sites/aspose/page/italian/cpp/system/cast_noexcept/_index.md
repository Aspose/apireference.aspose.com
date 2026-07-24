---
title: "Metodo System::Cast_noexcept"
linktitle: "Cast_noexcept"
second_title: "Aspose.Page per C++"
description: "Metodo System::Cast_noexcept. Esegue il cast sugli oggetti SmartPtr in C++."
type: docs
weight: 15400
url: /it/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


Esegue il cast su oggetti [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo dell'oggetto puntato di destinazione. |
| TFrom | Tipo dell'oggetto puntato di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito, altrimenti nullptr.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
