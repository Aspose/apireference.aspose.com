---
title: "Метод System::ObjectExt::UnboxToNullable"
linktitle: "UnboxToNullable"
second_title: "Aspose.Font для C++"
description: "Метод System::ObjectExt::UnboxToNullable. Разупаковывает объект в тип, допускающий null, в C++."
type: docs
weight: 1700
url: /ru/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Разупаковывает объект в nullable тип.

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

Разупакованное nullable‑значение (может быть null).

## См. также

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
