---
title: "System::Data::DataRow::GetChildRows メソッド"
linktitle: "GetChildRows"
second_title: "C++ 用 Aspose.Page"
description: "System::Data::DataRow::GetChildRows メソッド。指定されたリレーションを通じて子とみなされる行を取得します（C++）。"
type: docs
weight: 200
url: /ja/cpp/system.data/datarow/getchildrows/
---
## DataRow::GetChildRows method


指定されたリレーションを通じて子として扱われる行を取得します。

```cpp
System::ArrayPtr<System::SharedPtr<System::Data::DataRow>> System::Data::DataRow::GetChildRows(const System::SharedPtr<System::Data::DataRelation> &relation)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| リレーション | const System::SharedPtr\<System::Data::DataRelation\>\& | 親行と子行のリレーションを指定するためのリレーションオブジェクト。 |

### ReturnValue

[Array](../../../system/array/) of child rows retreived.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DataRow](../)
* Class [DataRelation](../../datarelation/)
* Class [DataRow](../)
* Namespace [System::Data](../../)
* Library [Aspose.Page for C++](../../../)
