---
title: "metode System::Cast"
linktitle: "Cast"
second_title: "Aspose.Page untuk C++"
description: "metode System::Cast. Melakukan casting pada objek SmartPtr di C++."
type: docs
weight: 15300
url: /id/cpp/system/cast/
---
## System::Cast method


Melakukan casting pada objek [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe pointee target. |
| TFrom | Tipe pointee sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Pointer sumber. |

### ReturnValue

Hasil cast jika cast diizinkan.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
