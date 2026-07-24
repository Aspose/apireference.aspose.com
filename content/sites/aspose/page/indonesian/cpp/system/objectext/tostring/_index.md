---
title: "metode System::ObjectExt::ToString"
linktitle: "ToString"
second_title: "Aspose.Page untuk C++"
description: "metode System::ObjectExt::ToString. Pengganti metode ToString C# untuk bekerja pada tipe C++ apa pun dalam C++."
type: docs
weight: 1300
url: /id/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) literal untuk mengonversi ke string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Lihat Juga

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | [Nullable](../../nullable/) tipe. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) objek untuk mengonversi ke string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Lihat Juga

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | [Enum](../../enum/) tipe. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) nilai untuk mengonversi ke string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Lihat Juga

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | tipe smart pointer. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) nilai untuk mengonversi ke string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Lihat Juga

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | tipe struktur. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | nilai struktur untuk mengonversi ke string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Lihat Juga

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | tipe skalar. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | T\&& | nilai skalar untuk mengonversi ke string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Lihat Juga

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | tipe skalar. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | T\&& | nilai skalar untuk mengonversi ke string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Lihat Juga

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | tipe smart pointer atau [ExceptionWrapper](../../exceptionwrapper/). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | T\& | smart pointer atau [ExceptionWrapper](../../exceptionwrapper/) untuk mengonversi ke string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Lihat Juga

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | tipe skalar. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | T\\& | nilai skalar untuk mengonversi ke string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Lihat Juga

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | tipe struktur. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | T\\& | nilai struktur untuk mengonversi ke string. |

### ReturnValue

[String](../../string/) representation of **obj**.

## Lihat Juga

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
