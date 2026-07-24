---
title: "System::ObjectExt::UnboxToNullable-methode"
linktitle: "UnboxToNullable"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt::UnboxToNullable method. Deboxt object naar een nullable type in C++."
type: docs
weight: 1600
url: /nl/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Ontdoet object naar nullable type.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Doeltype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) om te unboxen. |
| veilig | bool | Als true, retourneer nullptr bij falen, anders gooi InvalidCastException. |

### ReturnValue

Deboxte nullable waarde (kan null zijn).

## Zie ook

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
