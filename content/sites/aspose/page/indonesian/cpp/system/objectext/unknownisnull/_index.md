---
title: "System::ObjectExt::UnknownIsNull metode"
linktitle: "UnknownIsNull"
second_title: "Aspose.Page untuk C++"
description: "System::ObjectExt::UnknownIsNull metode. Memeriksa apakah objek tipe tidak diketahui adalah nullptr. Overload untuk tipe non-skalar dalam C++."
type: docs
weight: 1700
url: /id/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


Memeriksa apakah objek tipe tidak diketahui adalah nullptr. Overload untuk tipe non-skalar.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | [Object](../../object/) tipe. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | T | [Object](../../object/) untuk diperiksa. |

### ReturnValue

True jika 'obj == nullptr' bernilai true, false sebaliknya.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


Memeriksa apakah objek tipe tidak diketahui adalah nullptr. Overload untuk tipe skalar.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | [Object](../../object/) tipe. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | T | [Object](../../object/) untuk diperiksa. |

### ReturnValue

Selalu mengembalikan false.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
