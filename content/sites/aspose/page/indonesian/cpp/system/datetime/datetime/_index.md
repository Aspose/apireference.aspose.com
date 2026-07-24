---
title: "System::DateTime::DateTime konstruktor"
linktitle: "DateTime"
second_title: "Aspose.Page untuk C++"
description: "System::DateTime::DateTime konstruktor. Membuat sebuah instance yang merepresentasikan nilai tanggal dan waktu terkecil yang mungkin yang sama dengan MinValue dalam C++."
type: docs
weight: 100
url: /id/cpp/system/datetime/datetime/
---
## DateTime::DateTime() constructor


Membuat sebuah instance yang mewakili nilai tanggal dan waktu terkecil yang mungkin, sama dengan MinValue.

```cpp
System::DateTime::DateTime()
```

## Lihat Juga

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(const DateTime\&) constructor


Membuat salinan sebuah instance.

```cpp
System::DateTime::DateTime(const DateTime &dt)=default
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dt | const DateTime\& | Sebuah instance dari kelas [DateTime](../) untuk menyalin nilai tanggal dan waktu yang diwakili dari |

## Lihat Juga

* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int) constructor


Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, dan hari tertentu.

```cpp
System::DateTime::DateTime(int year, int month, int day)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tahun | int | Tahun yang akan direpresentasikan oleh instance yang sedang dibangun. |
| bulan | int | Bulan dari **year** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| hari | int | Hari dari **month** yang akan direpresentasikan oleh instance yang sedang dibangun. |

## Lihat Juga

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, dan hari tertentu dalam kalender yang ditentukan.

```cpp
System::DateTime::DateTime(int year, int month, int day, const SharedPtr<Globalization::Calendar> &calendar)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tahun | int | Tahun yang akan direpresentasikan oleh instance yang sedang dibangun. |
| bulan | int | Bulan dari **year** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| hari | int | Hari dari **month** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| kalender | const SharedPtr\<Globalization::Calendar\>\& | Kalender yang digunakan untuk menginterpretasikan **year**, **month**, dan **day** yang ditentukan. |

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int) constructor


Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, hari, jam, menit, dan detik tertentu.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tahun | int | Tahun yang akan direpresentasikan oleh instance yang sedang dibangun. |
| bulan | int | Bulan dari **year** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| hari | int | Hari dari **month** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| jam | int | Jam dari **day** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| menit | int | Menit dari **hour** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| detik | int | Detik dari **minute** yang akan direpresentasikan oleh instance yang sedang dibangun. |

## Lihat Juga

* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) constructor


Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, hari, jam, menit, dan detik tertentu dalam kalender yang ditentukan.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, const SharedPtr<Globalization::Calendar> &calendar)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tahun | int | Tahun yang akan direpresentasikan oleh instance yang sedang dibangun. |
| bulan | int | Bulan dari **year** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| hari | int | Hari dari **month** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| jam | int | Jam dari **day** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| menit | int | Menit dari **hour** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| detik | int | Detik dari **minute** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| kalender | const SharedPtr\<Globalization::Calendar\>\& | Kalender yang digunakan untuk menginterpretasikan **year**, **month**, dan **day** yang ditentukan. |

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, DateTimeKind) constructor


Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, hari, jam, menit, dan detik tertentu.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, DateTimeKind kind)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tahun | int | Tahun yang akan direpresentasikan oleh instance yang sedang dibangun. |
| bulan | int | Bulan dari **year** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| hari | int | Hari dari **month** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| jam | int | Jam dari **day** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| menit | int | Menit dari **hour** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| detik | int | Detik dari **minute** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| jenis | DateTimeKind | Nilai yang menunjukkan apakah parameter tanggal dan waktu yang diberikan menentukan waktu lokal, waktu UTC, atau tidak keduanya. |

## Lihat Juga

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) constructor


Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, hari, jam, menit, detik, dan milidetik tertentu dalam kalender yang ditentukan.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, const SharedPtr<Globalization::Calendar> &calendar, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tahun | int | Tahun yang akan direpresentasikan oleh instance yang sedang dibangun. |
| bulan | int | Bulan dari **year** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| hari | int | Hari dari **month** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| jam | int | Jam dari **day** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| menit | int | Menit dari **hour** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| detik | int | Detik dari **minute** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| milidetik | int | Milidetik dari **second** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| jenis | const SharedPtr\<Globalization::Calendar\>\& | Nilai yang menunjukkan apakah parameter tanggal dan waktu yang diberikan menentukan waktu lokal, waktu UTC, atau tidak keduanya. |
| kalender | DateTimeKind | Kalender yang digunakan untuk menginterpretasikan **year**, **month**, dan **day** yang ditentukan. |

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Calendar](../../../system.globalization/calendar/)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int, int, int, int, int, int, int, DateTimeKind) constructor


Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, hari, jam, menit, detik, dan milidetik tertentu.

```cpp
System::DateTime::DateTime(int year, int month, int day, int hour, int minute, int second, int millisecond, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tahun | int | Tahun yang akan direpresentasikan oleh instance yang sedang dibangun. |
| bulan | int | Bulan dari **year** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| hari | int | Hari dari **month** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| jam | int | Jam dari **day** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| menit | int | Menit dari **hour** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| detik | int | Detik dari **minute** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| milidetik | int | Milidetik dari **second** yang akan direpresentasikan oleh instance yang sedang dibangun. |
| jenis | DateTimeKind | Nilai yang menunjukkan apakah parameter tanggal dan waktu yang diberikan menentukan waktu lokal, waktu UTC, atau tidak keduanya. |

## Lihat Juga

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind, bool) constructor


Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai sejumlah tick. UNTUK PENGGUNAAN INTERNAL.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind, bool is_ambiguous_local_dst)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ticks | int64_t | Jumlah interval 100-ns yang telah berlalu sejak 1 Januari 0001 00:00:00.000 dalam kalender Gregorian. |
| jenis | DateTimeKind | Nilai yang menunjukkan apakah parameter **ticks** menentukan waktu lokal, waktu UTC, atau tidak keduanya. |
| is_ambiguous_local_dst | bool | Benar jika tanggal dan waktu yang ditentukan ambigu dan dapat dipetakan ke banyak waktu UTC. |

## Lihat Juga

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::DateTime(int64_t, DateTimeKind) constructor


Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai sejumlah tick.

```cpp
System::DateTime::DateTime(int64_t ticks, DateTimeKind kind=DateTimeKind::Unspecified)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ticks | int64_t | Jumlah interval 100-ns yang telah berlalu sejak 1 Januari 0001 00:00:00.000 dalam kalender Gregorian. |
| jenis | DateTimeKind | Nilai yang menunjukkan apakah parameter **ticks** menentukan waktu lokal, waktu UTC, atau tidak keduanya. |

## Lihat Juga

* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
