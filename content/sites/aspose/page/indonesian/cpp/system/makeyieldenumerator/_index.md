---
title: "metode System::MakeYieldEnumerator"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Page untuk C++"
description: "metode System::MakeYieldEnumerator. Membuat IEnumerator dari fungsi yield di C++."
type: docs
weight: 25400
url: /id/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


Membuat IEnumerator dari fungsi yield.

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen dalam urutan |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | Fungsi yield untuk dieksekusi |

### ReturnValue

Pointer bersama ke IEnumerator

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
