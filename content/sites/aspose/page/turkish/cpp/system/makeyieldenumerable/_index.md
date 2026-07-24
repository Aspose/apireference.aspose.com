---
title: "System::MakeYieldEnumerable yöntemi"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Page için C++"
description: "System::MakeYieldEnumerable yöntemi. C++'ta bir yield işlevinden IEnumerable oluşturur."
type: docs
weight: 25300
url: /tr/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


Bir yield işlevinden IEnumerable oluşturur.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| Parameter | Açıklama |
| --- | --- |
| T | Dizideki öğelerin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Yürütülecek yield işlevi |

### ReturnValue

IEnumerable için paylaşımlı işaretçi

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
