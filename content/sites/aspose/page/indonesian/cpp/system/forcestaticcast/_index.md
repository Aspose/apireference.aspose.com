---
title: "metode System::ForceStaticCast"
linktitle: "PaksaCastStatis"
second_title: "Aspose.Page untuk C++"
description: "metode System::ForceStaticCast. Melakukan cast statis nyata pada objek SmartPtr di C++."
type: docs
weight: 20400
url: /id/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Melakukan cast statis nyata pada objek [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe pointee target. |
| TFrom | Tipe pointee sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Pointer sumber. |

### ReturnValue

Hasil cast jika cast diizinkan, jika tidak perilakunya tidak terdefinisi.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
