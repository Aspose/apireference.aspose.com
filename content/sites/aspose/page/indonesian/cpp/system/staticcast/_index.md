---
title: "Metode System::StaticCast"
linktitle: "StaticCast"
second_title: "Aspose.Page untuk C++"
description: "Metode System::StaticCast. Melakukan static cast pada objek non-pointer dalam C++."
type: docs
weight: 38500
url: /id/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


Melakukan static cast pada objek non-pointer.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe target. |
| TFrom | Tipe sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const TFrom\& | Objek sumber. |

### ReturnValue

Hasil cast jika cast diizinkan.

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom\&) method


Melakukan static cast pada objek [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe [Exception](../exception/) target. |
| TFrom | Tipe [Exception](../exception/) sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const TFrom\& | Pointer sumber. |

### ReturnValue

Hasil cast jika cast diizinkan.

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom *) method


Spesialisasi untuk tipe aritmetika.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


Melakukan static cast pada objek [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
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

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\>) method


Melakukan static cast pada Objek ke objek [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe [Exception](../exception/) target. |
| TFrom | Tipe [Object](../object/). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Pointer sumber. |

### ReturnValue

Hasil cast jika cast diizinkan.

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(std::nullptr_t) method


Melakukan static cast pada objek null.

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe pointee target. |

### ReturnValue

nullptr.

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TFrom) method


Spesialisasi untuk tipe aritmetika.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TTo) method


Proses cast dari [String](../string/) ke [String](../string/).

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## Lihat Juga

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


Melakukan static cast pada objek [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe pointee target. |
| TFrom | Tipe pointee sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Pointer sumber. |

### ReturnValue

Hasil cast jika cast diizinkan.

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
