---
title: "metode System::operator!="
linktitle: "operator!="
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan metode operator!= dari kelas dalam C++."
type: docs
weight: 25800
url: /id/cpp/system/operator!=/
---
## System::operator!=(ArraySegment\<T\>, ArraySegment\<T\>) method




```cpp
template<typename T> bool System::operator!=(ArraySegment<T> a, ArraySegment<T> b)
```

## Lihat Juga

* Class [ArraySegment](../arraysegment/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(Chars\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class Chars,typename std::enable_if< IsStringLiteral< Chars, char_t >::value >::type *> bool System::operator!=(Chars &left, const String &right)
```


| Parameter | Deskripsi |
| --- | --- |
| Chars | tipe literal [String](../string/). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| left | Chars\& | literal [String](../string/) untuk dibandingkan. |
| right | const String\& | [String](../string/) untuk dibandingkan. |

### ReturnValue

false jika string cocok, true sebaliknya.

## Lihat Juga

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SharedPtr\<Object\>\&, const String\&) method


[Object](../object/) and string comparison.

```cpp
bool System::operator!=(const SharedPtr<Object> &left, const String &right)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| left | const SharedPtr\<Object\>\& | [Object](../object/) untuk mengonversi ke string dan membandingkan. |
| right | const String\& | [String](../string/) untuk dibandingkan. |

### ReturnValue

false jika representasi string objek sama dengan string, true sebaliknya.

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) method


Menentukan apakah URI yang diwakili oleh objek saat ini dan objek yang ditentukan tidak sama.

```cpp
bool System::operator!=(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Objek [Uri](../uri/) pertama untuk dibandingkan |
| uri2 | const SharedPtr\<Uri\>\& | Objek [Uri](../uri/) kedua untuk dibandingkan |

### ReturnValue

True jika URI tidak sama, jika tidak - false

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Class [Uri](../uri/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const SmartPtr\<Y\>\&) method


Perbandingan tidak sama membandingkan dua smart pointer.

```cpp
template<class X,class Y> bool System::operator!=(const SmartPtr<X> &x, const SmartPtr<Y> &y)
```


| Parameter | Deskripsi |
| --- | --- |
| X | Tipe pointee dari pointer pertama. |
| Y | Tipe pointee dari pointer kedua. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | Pointer pertama untuk dibandingkan. |
| y | const SmartPtr\<Y\>\& | Pointer kedua untuk dibandingkan. |

### ReturnValue

False jika pointer cocok, true sebaliknya.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const Y *) method


Perbandingan ketidaksamaan smart pointer terhadap pointer sederhana (C).

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, Y>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const SmartPtr<X> &x, const Y *y)
```


| Parameter | Deskripsi |
| --- | --- |
| X | tipe smart pointer. |
| Y | tipe pointer sederhana. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | smart pointer untuk dibandingkan (kiri). |
| y | const Y * | pointer untuk dibandingkan (kanan). |

### ReturnValue

False jika pointer cocok, true sebaliknya.

## Lihat Juga

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const T1\&, const Nullable\<T2\>\&) method


Menentukan apakah nilai yang ditentukan tidak sama dengan nilai yang diwakili oleh objek [Nullable](../nullable/) yang ditentukan dengan menerapkan [operator!=()](./) pada nilai-nilai ini.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator!=(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe nilai perbandingan pertama |
| T2 | Tipe dasar dari objek [Nullable](../nullable/) yang mewakili nilai perbandingan kedua |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| beberapa | const T1\& | Referensi konstan ke nilai yang akan digunakan sebagai perbandingan pertama |
| other | const Nullable\<T2\>\& | Referensi konstan ke objek [Nullable](../nullable/) yang nilai yang diwakilinya akan digunakan sebagai perbandingan kedua |

### ReturnValue

True jika nilai perbandingan tidak sama, jika tidak - false

## Lihat Juga

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const X *, const SmartPtr\<Y\>\&) method


Perbandingan kesetaraan smart pointer dengan pointer sederhana (C).

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, X>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const X *x, const SmartPtr<Y> &y)
```


| Parameter | Deskripsi |
| --- | --- |
| X | tipe pointer sederhana. |
| Y | tipe smart pointer. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | const X * | pointer untuk dibandingkan (kanan). |
| y | const SmartPtr\<Y\>\& | smart pointer untuk dibandingkan (kiri). |

### ReturnValue

False jika pointer cocok, true sebaliknya.

## Lihat Juga

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(SmartPtr\<X\> const\&, std::nullptr_t) method


Memeriksa apakah smart pointer tidak null.

```cpp
template<class X> bool System::operator!=(SmartPtr<X> const &x, std::nullptr_t)
```


| Parameter | Deskripsi |
| --- | --- |
| X | Tipe pointee dari pointer. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | SmartPtr\<X\> const\& | Pointer untuk diperiksa. |

### ReturnValue

False jika pointer null, true jika tidak.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator!=(std::nullptr_t, const DateTimeOffset &)
```

## Lihat Juga

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const Nullable\<T\>\&) method


Menentukan apakah objek [Nullable](../nullable/) yang ditentukan mewakili nilai yang tidak sama dengan null.

```cpp
template<typename T> bool System::operator!=(std::nullptr_t, const Nullable<T> &other)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| other | std::nullptr_t | Referensi konstan ke objek [Nullable](../nullable/) untuk diuji |

### ReturnValue

True jika objek yang ditentukan mewakili nilai non-null, false jika tidak

## Lihat Juga

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const String\&) method


Memeriksa apakah string null.

```cpp
bool System::operator!=(std::nullptr_t, const String &str)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| str | std::nullptr_t | [String](../string/) untuk diperiksa. |

### ReturnValue

false jika string null, true jika tidak.

## Lihat Juga

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, DateTime) method




```cpp
bool System::operator!=(std::nullptr_t, DateTime)
```

## Lihat Juga

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, SmartPtr\<X\> const\&) method


Memeriksa apakah smart pointer tidak null.

```cpp
template<class X> bool System::operator!=(std::nullptr_t, SmartPtr<X> const &x)
```


| Parameter | Deskripsi |
| --- | --- |
| X | Tipe pointee dari pointer. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | std::nullptr_t | Pointer untuk diperiksa. |

### ReturnValue

False jika pointer null, true jika tidak.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator!=(std::nullptr_t, TimeSpan)
```

## Lihat Juga

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(T\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class T,typename std::enable_if< IsStringPointer< T, char_t >::value >::type *> bool System::operator!=(T &left, const String &right)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe pointer [String](../string/). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| left | T\& | [String](../string/) pointer untuk dibandingkan. |
| right | const String\& | [String](../string/) untuk dibandingkan. |

### ReturnValue

false jika string cocok, true sebaliknya.

## Lihat Juga

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
