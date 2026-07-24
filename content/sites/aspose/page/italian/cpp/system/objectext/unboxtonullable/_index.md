---
title: "metodo System::ObjectExt::UnboxToNullable"
linktitle: "UnboxToNullable"
second_title: "Aspose.Page per C++"
description: "metodo System::ObjectExt::UnboxToNullable. Decompatta l'object a un tipo nullable in C++."
type: docs
weight: 1600
url: /it/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Deincapsula l'oggetto in tipo nullable.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di destinazione. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) da unboxare. |
| sicuro | bool | Se true, restituisce nullptr in caso di errore, altrimenti genera InvalidCastException. |

### ReturnValue

Valore nullable decompattato (può essere null).

## Vedi anche

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
