---
title: "System::Array::Array constructor"
linktitle: "Array"
second_title: "Aspose.Page untuk C++"
description: "Konstruktor System::Array::Array. Membuat array kosong dalam C++."
type: docs
weight: 100
url: /id/cpp/system/array/array/
---
## Array::Array() constructor


Membuat sebuah array kosong.

```cpp
System::Array<T>::Array()
```

## Lihat Juga

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


Membuat objek [Array](../) dan mengisinya dengan nilai dari array yang ditentukan yang berisi elemen dengan tipe **[UnderlyingType](../underlyingtype/)**.

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| Parameter | Deskripsi |
| --- | --- |
| InitArraySize | Jumlah elemen dari array **init**. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | [Array](../) untuk disalin ke dalam array yang sedang dibangun. |

## Lihat Juga

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


Membuat objek [Array](../) dan mengisinya dengan nilai yang disalin dari objek std::vector yang tipe nilainya sama dengan **T** tetapi berbeda dari **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| Parameter | Deskripsi |
| --- | --- |
| Q | Tipe elemen dari objek std::vector untuk menyalin elemen darinya |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const std::vector\<Q\>\& | std::vector untuk menyalin nilai dari |

## Lihat Juga

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const vector_t\&) constructor


Konstruktor penyalinan.

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| assgn | const vector_t\& | std::vector untuk menyalin nilai dari |

## Lihat Juga

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T\&) constructor


Konstruktor pengisian.

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| count | int | Ukuran awal array |
| init | const T\& | Nilai awal yang digunakan untuk mengisi array |

## Lihat Juga

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T) constructor


Konstruktor pengisian.

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| count | int | Ukuran awal array |
| inits | const T | Nilai untuk mengisi array |

## Lihat Juga

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


Membuat objek [Array](../) dan mengisinya dengan nilai dari daftar inisialisasi yang ditentukan yang berisi elemen bertipe bool.

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | Daftar inisialisasi yang berisi elemen untuk mengisi array |

## Lihat Juga

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


Membuat objek [Array](../) dan mengisinya dengan nilai dari daftar inisialisasi yang ditentukan yang berisi elemen bertipe **[UnderlyingType](../underlyingtype/)**.

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | Daftar inisialisasi yang berisi elemen untuk mengisi array |

## Lihat Juga

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


Membuat objek [Array](../) dan mengisinya dengan nilai yang dipindahkan dari objek std::vector yang tipe nilaiannya sama dengan **T** tetapi berbeda dari **[UnderlyingType](../underlyingtype/)**.

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| Parameter | Deskripsi |
| --- | --- |
| Q | Tipe elemen dari objek std::vector untuk memindahkan elemen |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | std::vector\<Q\>\&& | std::vector untuk menyalin nilai dari |

## Lihat Juga

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


Konstruktor pengisian.

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| Parameter | Deskripsi |
| --- | --- |
| ValueType | Tipe nilai awal |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | Ukuran awal array |
| init | ValueType | Nilai awal yang digunakan untuk mengisi array |

## Lihat Juga

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(vector_t\&&) constructor


Konstruktor pemindahan.

```cpp
System::Array<T>::Array(vector_t &&value)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | vector_t\&& | std::vector, elemen-elemennya diakuisisi oleh array |

## Lihat Juga

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
