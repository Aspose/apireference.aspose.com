---
title: "Метод System::Data::DataRow::GetChildRows"
linktitle: "GetChildRows"
second_title: "Aspose.Font для C++"
description: "Метод System::Data::DataRow::GetChildRows. Получает строки, считающиеся дочерними через указанное отношение в C++."
type: docs
weight: 200
url: /ru/cpp/system.data/datarow/getchildrows/
---
## DataRow::GetChildRows method


Получает строки, которые считаются дочерними через указанную связь.

```cpp
System::ArrayPtr<System::SharedPtr<System::Data::DataRow>> System::Data::DataRow::GetChildRows(const System::SharedPtr<System::Data::DataRelation> &relation)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| relation | const System::SharedPtr\<System::Data::DataRelation\>\& | Объект отношения для указания связи родительской строки - дочерней строки. |

### ReturnValue

[Array](../../../system/array/) of child rows retreived.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DataRow](../)
* Class [DataRelation](../../datarelation/)
* Class [DataRow](../)
* Namespace [System::Data](../../)
* Library [Aspose.Font for C++](../../../)
