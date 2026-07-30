---
title: "System::MakeYieldEnumerator yöntemi"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Font için C++"
description: "System::MakeYieldEnumerator yöntemi. C++'ta bir yield işlevinden IEnumerator oluşturur."
type: docs
weight: 25500
url: /tr/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Bir yield işlevinden IEnumerator oluşturur.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Parametre | Açıklama |
| --- | --- |
| T | Dizideki öğelerin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Yürütülecek yield işlevi |

### ReturnValue

IEnumerator için paylaşımlı işaretçi

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
