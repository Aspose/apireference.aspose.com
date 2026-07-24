---
title: "Метод System::ConstCast"
linktitle: "ConstCast"
second_title: "Aspose.Page для C++"
description: "Метод System::ConstCast. Конец устаревших приведений в C++."
type: docs
weight: 16100
url: /ru/cpp/system/constcast/
---
## System::ConstCast method


Конец устаревших приведений.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Параметр | Описание |
| --- | --- |
| TTo | Тип целевого указываемого объекта. |
| TFrom | Тип исходного указываемого объекта. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Указатель источника. |

### ReturnValue

Результат приведения, если приведение разрешено, иначе nullptr.
## Примечания


Выполняет const‑приведение над объектами [SmartPtr](../smartptr/).
## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
