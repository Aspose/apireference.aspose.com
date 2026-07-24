---
title: "Metode System::ConstCast"
linktitle: "ConstCast"
second_title: "Aspose.Page untuk C++"
description: "Metode System::ConstCast. Akhir dari cast yang tidak lagi dipakai dalam C++."
type: docs
weight: 16100
url: /id/cpp/system/constcast/
---
## System::ConstCast method


Akhir dari cast yang tidak lagi dipakai.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe pointee target. |
| TFrom | Tipe pointee sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | Pointer sumber. |

### ReturnValue

Hasil cast jika cast diizinkan atau nullptr jika tidak.
## Catatan


Melakukan const cast pada objek [SmartPtr](../smartptr/).
## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
