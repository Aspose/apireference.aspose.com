---
title: "System::ConstCast method"
linktitle: "ConstCast"
second_title: "Aspose.Font для C++"
description: "Метод System::ConstCast. Конец устаревших приведения в C++."
type: docs
weight: 16200
url: /ru/cpp/system/constcast/
---
## System::ConstCast method


Конец устаревших приведения.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Параметр | Описание |
| --- | --- |
| TTo | Тип целевого объекта, на который указывает указатель. |
| TFrom | Тип исходного объекта, на который указывает указатель. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Указатель на источник. |

### ReturnValue

Результат приведения, если приведение разрешено, иначе nullptr.
## Примечания


Выполняет const приведение над объектами [SmartPtr](../smartptr/).
## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
