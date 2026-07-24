---
title: "System::ForceStaticCast метод"
linktitle: "ForceStaticCast"
second_title: "Aspose.Page для C++"
description: "System::ForceStaticCast метод. Выполняет реальное статическое приведение типов объектов SmartPtr в C++."
type: docs
weight: 20400
url: /ru/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Выполняет реальное статическое приведение типов объектов [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Параметр | Описание |
| --- | --- |
| TTo | Тип целевого указываемого объекта. |
| TFrom | Тип исходного указываемого объекта. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Указатель источника. |

### ReturnValue

Результат приведения, если приведение разрешено, иначе поведение не определено.

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
