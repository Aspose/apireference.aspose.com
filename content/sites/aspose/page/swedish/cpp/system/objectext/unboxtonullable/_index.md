---
title: "System::ObjectExt::UnboxToNullable metod"
linktitle: "UnboxToNullable"
second_title: "Aspose.Page för C++"
description: "System::ObjectExt::UnboxToNullable metod. Avpaketerar objekt till nullable‑typ i C++."
type: docs
weight: 1600
url: /sv/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Avboxar objekt till nullable‑typ.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Parameter | Beskrivning |
| --- | --- |
| T | Destinationstyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) för att avpaketera. |
| säker | bool | Om true, returnera nullptr vid fel, annars kasta InvalidCastException. |

### ReturnValue

Avpaketerat nullable‑värde (kan vara null).

## Se även

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
