---
title: "metode System::operator*"
linktitle: "operator*"
second_title: "Aspose.Page untuk C++"
description: "metode System::operator*. Mengembalikan sebuah instance baru dari kelas Decimal yang mewakili nilai hasil perkalian antara nilai yang ditentukan dan nilai yang diwakili oleh objek Decimal yang ditentukan dalam C++."
type: docs
weight: 27400
url: /id/cpp/system/operator_/
---
## System::operator* method


Mengembalikan sebuah instance baru dari kelas [Decimal](../decimal/) yang mewakili nilai hasil perkalian antara nilai yang ditentukan dan nilai yang diwakili oleh objek [Decimal](../decimal/) yang ditentukan.

```cpp
template<typename T,typename _> Decimal System::operator*(const T &x, const Decimal &d)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | const T\& | Pengganda pertama |
| d | const Decimal\& | Objek [Decimal](../decimal/) yang mewakili pengganda kedua |

### ReturnValue

Sebuah instance baru dari kelas [Decimal](../decimal/) yang mewakili nilai hasil perkalian **x** dan nilai yang diwakili oleh **d**.

## Lihat Juga

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
judul: metode System::operator< method
judul tautan: operator<
judul_kedua: Aspose.Page for C++
description: 'System::operator< method. Menentukan apakah nilai yang ditentukan lebih kecil daripada nilai yang direpresentasikan oleh objek Nullable yang ditentukan dengan menerapkan operator<() pada nilai-nilai ini dalam C++.'
tipe: docs
bobot: 28600
url: /cpp/system/operator_/
---
## System::operator<(const T1\&, const Nullable\<T2\>\&) method


Menentukan apakah nilai yang ditentukan lebih kecil daripada nilai yang direpresentasikan oleh objek [Nullable](../nullable/) yang ditentukan dengan menerapkan [operator<()](./) pada nilai-nilai ini.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<(const T1 &some, const Nullable<T2> &other)
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

Benar jika komparan pertama lebih kecil daripada komparan kedua, jika tidak - salah

## Lihat Juga

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<(std::nullptr_t, const DateTimeOffset &)
```

## Lihat Juga

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const Nullable\<T\>\&) method


Selalu mengembalikan false.

```cpp
template<typename T> bool System::operator<(std::nullptr_t, const Nullable<T> &)
```

## Lihat Juga

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, DateTime) method




```cpp
bool System::operator<(std::nullptr_t, DateTime)
```

## Lihat Juga

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<(std::nullptr_t, TimeSpan)
```

## Lihat Juga

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
judul: System::operator> method
judul tautan: operator>
judul_kedua: Aspose.Page for C++
description: 'System::operator> method. Menentukan apakah nilai yang ditentukan lebih besar daripada nilai yang direpresentasikan oleh objek Nullable yang ditentukan dengan menerapkan operator>() pada nilai-nilai ini dalam C++.'
tipe: docs
bobot: 34100
url: /cpp/system/operator_/
---
## System::operator>(const T1\&, const Nullable\<T2\>\&) method


Menentukan apakah nilai yang ditentukan lebih besar daripada nilai yang direpresentasikan oleh objek [Nullable](../nullable/) yang ditentukan dengan menerapkan [operator>()](./) pada nilai-nilai ini.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>(const T1 &some, const Nullable<T2> &other)
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

Benar jika komparan pertama lebih besar daripada komparan kedua, jika tidak - salah

## Lihat Juga

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>(std::nullptr_t, const DateTimeOffset &)
```

## Lihat Juga

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const Nullable\<T\>\&) method


Selalu mengembalikan false.

```cpp
template<typename T> bool System::operator>(std::nullptr_t, const Nullable<T> &)
```

## Lihat Juga

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, DateTime) method




```cpp
bool System::operator>(std::nullptr_t, DateTime)
```

## Lihat Juga

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>(std::nullptr_t, TimeSpan)
```

## Lihat Juga

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
