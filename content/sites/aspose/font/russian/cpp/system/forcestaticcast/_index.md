---
title: "Метод System::ForceStaticCast"
linktitle: "ForceStaticCast"
second_title: "Aspose.Font для C++"
description: "Метод System::ForceStaticCast. Выполняет реальное статическое приведение типов объектов SmartPtr в C++."
type: docs
weight: 20500
url: /ru/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Выполняет реальное статическое приведение типов объектов [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Параметр | Описание |
| --- | --- |
| TTo | Тип целевого объекта, на который указывает указатель. |
| TFrom | Тип исходного объекта, на который указывает указатель. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Указатель на источник. |

### ReturnValue

Преобразует результат, если приведение разрешено, иначе поведение не определено.

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
