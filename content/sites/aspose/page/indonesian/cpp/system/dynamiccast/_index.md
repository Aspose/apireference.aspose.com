---
title: "Metode System::DynamicCast"
linktitle: "DynamicCast"
second_title: "Aspose.Page untuk C++"
description: "Metode System::DynamicCast. Melakukan cast dinamis pada objek Exception dalam C++."
type: docs
weight: 16900
url: /id/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


Melakukan cast dinamis pada objek [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


Melakukan cast dinamis pada objek [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\>) method


Membuka enum yang dibungkus melalui cast.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe enum target. |
| TFrom | Tipe pointee sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Pointer ke objek untuk membuka data dari. |

### ReturnValue

Nilai enum yang telah dibuka.

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


Melakukan cast dinamis pada Objek menjadi objek [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
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
## System::DynamicCast(std::nullptr_t) method


Melakukan cast dinamis pada objek null.

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
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
## System::DynamicCast(TFrom\&) method


Melakukan cast dinamis pada objek non-pointer.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe target. |
| TFrom | Tipe sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | TFrom\& | Objek sumber. |

### ReturnValue

Hasil cast.

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom) method


Melakukan cast dinamis dari IntPtr ke pointer.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| Parameter | Deskripsi |
| --- | --- |
| TTo | Tipe target. |
| TFrom | Tipe sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | TFrom | Nilai IntPtr sumber. |

### ReturnValue

Hasil cast.

## Deprecated
Dibiarkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
