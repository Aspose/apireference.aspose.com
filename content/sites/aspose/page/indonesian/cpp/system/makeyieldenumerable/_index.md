---
title: "Metode System::MakeYieldEnumerable"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Page untuk C++"
description: "Metode System::MakeYieldEnumerable. Membuat IEnumerable dari fungsi yield dalam C++."
type: docs
weight: 25300
url: /id/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


Membuat IEnumerable dari fungsi yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen dalam urutan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Fungsi yield untuk dieksekusi |

### ReturnValue

Pointer bersama ke IEnumerable

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
