---
title: "metode System::DynamicCast_noexcept"
linktitle: "DynamicCast_noexcept"
second_title: "Aspose.Page untuk C++"
description: "metode System::DynamicCast_noexcept. Cast lama yang usang. Akan dihapus pada versi C++ mendatang."
type: docs
weight: 17600
url: /id/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


Cast usang lama. Akan dihapus pada versi mendatang.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe [Exception](../exception/) target. |
| TFrom | Tipe [Exception](../exception/) sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const TFrom\& | Pointer sumber. |

### ReturnValue

Hasil cast jika cast diizinkan atau nullptr jika tidak.
## Catatan


Melakukan cast dinamis pada objek [Exception](../exception/). ## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan AsCast sebagai gantinya.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


Melakukan cast dinamis pada objek [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
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

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan AsCast sebagai gantinya.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


Melakukan cast dinamis pada Objek menjadi objek [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe [Exception](../exception/) target. |
| TFrom | Tipe [Object](../object/). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Pointer sumber. |

### ReturnValue

Hasil cast jika cast diizinkan atau nullptr jika tidak.

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan AsCast sebagai gantinya.

## Lihat Juga

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
