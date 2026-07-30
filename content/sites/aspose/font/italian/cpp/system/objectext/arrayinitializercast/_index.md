---
title: "Metodo System::ObjectExt::ArrayInitializerCast"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Font per C++"
description: "Metodo System::ObjectExt::ArrayInitializerCast. Converte i valori fondamentali di un array (che C# fa implicitamente ma C++ apparentemente no) in C++."
type: docs
weight: 100
url: /it/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


Converte i valori fondamentali degli array (che C# fa implicitamente ma C++ apparentemente no).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Parametro | Descrizione |
| --- | --- |
| To | Tipo di destinazione. |
| From | Tipi di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| argomenti | Da ... | Valori da convertire e inserire nell'array di destinazione. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
