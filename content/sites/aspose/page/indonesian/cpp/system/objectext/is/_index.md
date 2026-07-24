---
title: "System::ObjectExt::Is metode"
linktitle: "Apakah"
second_title: "Aspose.Page untuk C++"
description: "System::ObjectExt::Is metode. Mengimplementasikan terjemahan operator ''is''. Spesialisasi untuk literal string dalam C++."
type: docs
weight: 1000
url: /id/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


Menerapkan terjemahan operator 'is'. Spesialisasi untuk literal string.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) literal. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe pembungkus pengecualian.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


Mengimplementasikan terjemahan operator 'is'. Spesialisasi untuk tipe [Nullable](../../nullable/).

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const Nullable\<U\>\& | [Nullable](../../nullable/) tipe. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


Mengimplementasikan terjemahan operator 'is'. Spesialisasi untuk tipe nilai.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe yang tidak dapat dikonversi.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

Selalu mengembalikan false karena tipe tidak dapat dikonversi.

## Lihat Juga

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe nullable.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe yang dapat dibungkus dengan operator == yang didefinisikan.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe yang dapat dibungkus tanpa operator == yang didefinisikan.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Mengimplementasikan terjemahan operator 'is'. Spesialisasi untuk tipe pointer.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe enum.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |
| U | Tipe objek yang ditunjuk. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


Menerapkan terjemahan operator 'is'. Spesialisasi tipe nilai yang dibungkus ke antarmuka.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |
| V | Tipe objek yang ditunjuk. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const T\&) method


Mengimplementasikan terjemahan operator 'is'. Spesialisasi untuk tipe yang dapat dibungkus (nilai) yang memang demikian.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) untuk menguji operator 'is'. Diabaikan. |

### ReturnValue

Selalu true

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


Mengimplementasikan terjemahan operator 'is'. Spesialisasi untuk tipe pointer yang dioptimalkan untuk kelas 'final'.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |
| U | Tipe yang diuji. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


Mengimplementasikan terjemahan operator 'is'. Spesialisasi untuk tipe pointer.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |
| U | Tipe yang diuji. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe enum vs pointer lemah.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |
| U | Tipe objek yang ditunjuk. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) untuk menguji operator 'is'. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(int32_t) method


Menerapkan terjemahan operator 'is'. Spesialisasi untuk literal integer.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | int32_t | literal integer. |

### ReturnValue

True jika 'is' mengembalikan true, false sebaliknya.

## Lihat Juga

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
