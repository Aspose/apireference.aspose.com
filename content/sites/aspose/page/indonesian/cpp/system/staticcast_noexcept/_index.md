---
title: "metode System::StaticCast_noexcept"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Page untuk C++"
description: "metode System::StaticCast_noexcept. Melakukan static cast pada objek Exception dalam C++."
type: docs
weight: 39400
url: /id/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


Melakukan static cast pada objek [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
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

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan AsCast sebagai gantinya.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


Melakukan static cast pada objek [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
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
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Melakukan static cast pada Objek ke objek [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
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
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


Melakukan static cast pada objek [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe pointee target. |
| TFrom | Tipe pointee sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Pointer sumber. |

### ReturnValue

Hasil cast jika cast diizinkan atau nullptr jika tidak.

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan AsCast sebagai gantinya.

## Lihat Juga

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
