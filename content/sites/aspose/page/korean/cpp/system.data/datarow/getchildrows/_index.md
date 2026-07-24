---
title: "System::Data::DataRow::GetChildRows 메서드"
linktitle: "GetChildRows"
second_title: "C++용 Aspose.Page"
description: "System::Data::DataRow::GetChildRows 메서드. 지정된 관계를 통해 자식으로 간주되는 행을 C++에서 가져옵니다."
type: docs
weight: 200
url: /ko/cpp/system.data/datarow/getchildrows/
---
## DataRow::GetChildRows method


지정된 관계를 통해 자식으로 간주되는 행들을 가져옵니다.

```cpp
System::ArrayPtr<System::SharedPtr<System::Data::DataRow>> System::Data::DataRow::GetChildRows(const System::SharedPtr<System::Data::DataRelation> &relation)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 관계 | const System::SharedPtr\<System::Data::DataRelation\>\& | 부모 행과 자식 행 관계를 지정하는 Relation 객체. |

### ReturnValue

[Array](../../../system/array/) of child rows retreived.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DataRow](../)
* Class [DataRelation](../../datarelation/)
* Class [DataRow](../)
* Namespace [System::Data](../../)
* Library [Aspose.Page for C++](../../../)
