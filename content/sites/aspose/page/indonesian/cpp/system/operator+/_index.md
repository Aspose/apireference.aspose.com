---
title: "System::operator+ metode"
linktitle: "operator+"
second_title: "Aspose.Page untuk C++"
description: "System::operator+ metode. Penggabungan string dalam C++."
type: docs
weight: 27500
url: /id/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kiri | const char_t | Karakter untuk digabungkan ke string. |
| right | const String\& | [String](../string/) untuk digabungkan. |

### ReturnValue

String yang digabungkan.

## Lihat Juga

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


Mengembalikan sebuah instance baru dari kelas [Decimal](../decimal/) yang mewakili nilai yang merupakan hasil penjumlahan nilai yang ditentukan dan nilai yang diwakili oleh objek [Decimal](../decimal/) yang ditentukan.

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | const T\& | Penjumlah pertama |
| d | const Decimal\& | Referensi konstan ke objek [Decimal](../decimal/) yang mewakili penjumlah kedua |

### ReturnValue

Sebuah instance baru dari kelas [Decimal](../decimal/) yang mewakili nilai yang merupakan hasil penjumlahan **x** dan nilai yang diwakili oleh **d**.

## Lihat Juga

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


Menjumlahkan nilai yang tidak nullable dan nullable.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Deskripsi |
| --- | --- |
| T1 | Tipe operand kiri. |
| T2 | Tipe operand kanan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| beberapa | const T1\& | Operand kiri. |
| lain | const Nullable\<T2\>\& | Operand kanan. |

### ReturnValue

Hasil penjumlahan.

## Lihat Juga

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Menghubungkan semua callback dari delegasi tangan kanan ke akhir daftar callback delegasi tangan kiri.

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Delegasi tempat callback ditambahkan. |
| rhv | MulticastDelegate\<T\> | Delegasi yang callback-nya sedang ditambahkan. |

### ReturnValue

Mengembalikan delegasi yang berisi callback dari nilai tangan kiri dan kemudian yang tangan kanan.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | Deskripsi |
| --- | --- |
| T | tipe literal [String](../string/). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| kiri | T\\& | Literal untuk menggabungkan ke string. |
| right | const String\& | [String](../string/) untuk digabungkan. |

### ReturnValue

String yang digabungkan.

## Lihat Juga

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe pointer [String](../string/). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| left | T\& | [String](../string/) pointer untuk menggabungkan ke string. |
| right | const String\& | [String](../string/) untuk digabungkan. |

### ReturnValue

String yang digabungkan.

## Lihat Juga

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
