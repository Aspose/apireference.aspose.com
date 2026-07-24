---
title: "System::ObjectExt::UnboxToNullable метод"
linktitle: "UnboxToNullable"
second_title: "Aspose.Page для C++"
description: "System::ObjectExt::UnboxToNullable метод. Распаковывает объект в тип, допускающий null, в C++."
type: docs
weight: 1600
url: /ru/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Разупаковывает объект в nullable‑тип.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Параметр | Описание |
| --- | --- |
| T | Тип назначения. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) для разупаковки. |
| безопасный | bool | Если true, вернуть nullptr при ошибке, иначе бросить InvalidCastException. |

### ReturnValue

Распакованное nullable-значение (может быть null).

## См. также

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
