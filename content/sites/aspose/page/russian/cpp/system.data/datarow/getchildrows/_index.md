---
title: "System::Data::DataRow::GetChildRows метод"
linktitle: "GetChildRows"
second_title: "Aspose.Page для C++"
description: "System::Data::DataRow::GetChildRows метод. Получает строки, которые считаются дочерними через указанное отношение в C++."
type: docs
weight: 200
url: /ru/cpp/system.data/datarow/getchildrows/
---
## DataRow::GetChildRows method


Получает строки, считающиеся дочерними через указанную связь.

```cpp
System::ArrayPtr<System::SharedPtr<System::Data::DataRow>> System::Data::DataRow::GetChildRows(const System::SharedPtr<System::Data::DataRelation> &relation)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| отношение | const System::SharedPtr\<System::Data::DataRelation\>\& | Объект Relation, указывающий отношение родительской строки — дочерней строки. |

### ReturnValue

[Array](../../../system/array/) of child rows retreived.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DataRow](../)
* Class [DataRelation](../../datarelation/)
* Class [DataRow](../)
* Namespace [System::Data](../../)
* Library [Aspose.Page for C++](../../../)
