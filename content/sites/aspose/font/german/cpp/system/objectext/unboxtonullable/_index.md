---
title: "System::ObjectExt::UnboxToNullable Methode"
linktitle: "UnboxToNullable"
second_title: "Aspose.Font für C++"
description: "System::ObjectExt::UnboxToNullable Methode. Entpackt das Objekt zu einem Nullable‑Typ in C++."
type: docs
weight: 1700
url: /de/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Entboxt Objekt zu Nullable-Typ.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Zieltyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) zum Entpacken. |
| sicher | bool | Wenn true, gibt bei einem Fehlschlag nullptr zurück, andernfalls wird InvalidCastException ausgelöst. |

### ReturnValue

Entpackter Nullable‑Wert (kann null sein).

## Siehe auch

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
