---
title: "Metode System::Cast_noexcept"
linktitle: "Cast_noexcept"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Cast_noexcept. Melakukan casting pada objek SmartPtr di C++."
type: docs
weight: 15400
url: /id/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


Melakukan casting pada objek [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe pointee target. |
| TFrom | Tipe pointee sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Pointer sumber. |

### ReturnValue

Hasil cast jika cast diizinkan atau nullptr jika tidak.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
