---
title: "System::Data::DataRow::GetChildRows yöntemi"
linktitle: "GetChildRows"
second_title: "Aspose.Page için C++"
description: "System::Data::DataRow::GetChildRows yöntemi. Belirtilen ilişki aracılığıyla alt olarak kabul edilen satırları alır (C++)."
type: docs
weight: 200
url: /tr/cpp/system.data/datarow/getchildrows/
---
## DataRow::GetChildRows method


Belirtilen ilişki aracılığıyla çocuk olarak kabul edilen satırları alır.

```cpp
System::ArrayPtr<System::SharedPtr<System::Data::DataRow>> System::Data::DataRow::GetChildRows(const System::SharedPtr<System::Data::DataRelation> &relation)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ilişki | const System::SharedPtr\<System::Data::DataRelation\>\& | Üst satır - alt satır ilişkisini belirtmek için ilişki nesnesi. |

### ReturnValue

[Array](../../../system/array/) of child rows retreived.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DataRow](../)
* Class [DataRelation](../../datarelation/)
* Class [DataRow](../)
* Namespace [System::Data](../../)
* Library [Aspose.Page for C++](../../../)
