---
title: "System::ObjectExt::UnboxToNullable metode"
linktitle: "UnboxToNullable"
second_title: "Aspose.Page untuk C++"
description: "System::ObjectExt::UnboxToNullable metode. Membongkar objek ke tipe nullable dalam C++."
type: docs
weight: 1600
url: /id/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Membuka bungkus objek ke tipe nullable.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe tujuan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) untuk dibuka. |
| aman | bool | Jika true, kembalikan nullptr pada kegagalan, jika tidak lempar InvalidCastException. |

### ReturnValue

Nilai nullable yang dibongkar (bisa null).

## Lihat Juga

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
