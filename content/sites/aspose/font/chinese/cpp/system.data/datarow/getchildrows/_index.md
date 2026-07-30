---
title: "System::Data::DataRow::GetChildRows 方法"
linktitle: "GetChildRows"
second_title: "Aspose.Font 适用于 C++"
description: "System::Data::DataRow::GetChildRows 方法。在 C++ 中通过指定的关系获取被视为子行的行。"
type: docs
weight: 200
url: /zh/cpp/system.data/datarow/getchildrows/
---
## DataRow::GetChildRows method


获取通过指定关系被视为子项的行。

```cpp
System::ArrayPtr<System::SharedPtr<System::Data::DataRow>> System::Data::DataRow::GetChildRows(const System::SharedPtr<System::Data::DataRelation> &relation)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| relation | const System::SharedPtr\<System::Data::DataRelation\>\& | 用于指定父行-子行关系的关系对象。 |

### ReturnValue

[Array](../../../system/array/) of child rows retreived.

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DataRow](../)
* Class [DataRelation](../../datarelation/)
* Class [DataRow](../)
* Namespace [System::Data](../../)
* Library [Aspose.Font for C++](../../../)
