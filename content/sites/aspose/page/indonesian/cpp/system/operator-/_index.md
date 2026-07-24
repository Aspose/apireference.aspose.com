---
title: "Metode System::operator-"
linktitle: "operator-"
second_title: "Aspose.Page untuk C++"
description: "Metode System::operator-. Mengembalikan instance baru dari kelas Decimal yang mewakili nilai yang merupakan hasil pengurangan nilai yang diwakili oleh objek Decimal yang ditentukan dari nilai yang ditentukan dalam C++."
type: docs
weight: 28100
url: /id/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


Mengembalikan instance baru dari kelas [Decimal](../decimal/) yang mewakili nilai yang merupakan hasil pengurangan nilai yang diwakili oleh objek [Decimal](../decimal/) yang ditentukan dari nilai yang ditentukan.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | const T\& | Nilai yang akan dikurangkan dari |
| d | const Decimal\& | Objek [Decimal](../decimal/) yang mewakili nilai yang dikurangkan |

### ReturnValue

Sebuah instance baru dari kelas [Decimal](../decimal/) yang mewakili nilai yang merupakan hasil pengurangan nilai yang diwakili oleh **d** dari **x**.

## Lihat Juga

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


Mengurangi nilai non-nullable dan nullable.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
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

Hasil pengurangan.

## Lihat Juga

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


Menghitung jumlah hari antara dua hari dalam seminggu.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| a | DayOfWeek | Minuend |
| b | DayOfWeek | Subtrahend |

### ReturnValue

Jumlah hari antara hari kerja **a** dan **b**; nilai kembali adalah angka negatif jika *goes* after ****

## Lihat Juga

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Memutus semua callback dalam delegasi tangan kanan dari akhir daftar callback delegasi tangan kiri.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Delegasi dari mana callback akan dihapus. |
| rhv | MulticastDelegate\<T\> | Delegasi yang callback-nya akan dihapus. |

### ReturnValue

Mengembalikan delegasi yang berisi callback dari nilai tangan kiri, tetapi tanpa yang dari nilai tangan kanan.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
