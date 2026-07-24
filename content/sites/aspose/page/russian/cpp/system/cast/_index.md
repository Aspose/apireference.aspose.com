---
title: "System::Cast метод"
linktitle: "Cast"
second_title: "Aspose.Page для C++"
description: "System::Cast метод. Выполняет приведение типов объектов SmartPtr в C++."
type: docs
weight: 15300
url: /ru/cpp/system/cast/
---
## System::Cast method


Выполняет приведение типов объектов [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Параметр | Описание |
| --- | --- |
| TTo | Тип целевого указываемого объекта. |
| TFrom | Тип исходного указываемого объекта. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Указатель источника. |

### ReturnValue

Результат приведения, если приведение разрешено.

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
