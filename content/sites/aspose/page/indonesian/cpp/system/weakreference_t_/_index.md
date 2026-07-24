---
title: "System::WeakReference< T > class"
linktitle: "WeakReference< T >"
second_title: "Aspose.Page untuk C++"
description: "System::WeakReference< T > class. Mewakili referensi lemah, yang mereferensikan sebuah objek sambil tetap memungkinkan objek tersebut dihapus dalam C++."
type: docs
weight: 7700
url: /id/cpp/system/weakreference_t_/
---
## WeakReference< T > class


Mewakili referensi lemah, yang mereferensikan sebuah objek sambil tetap memungkinkan objek tersebut dihapus.

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe dari objek yang direferensikan. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | Memeriksa apakah objek yang direferensikan tidak null. |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | Membandingkan objek yang direferensikan dengan instance lain dari kelas [WeakReference](../weakreference/). |
| [operator==](./operator==/)(std::nullptr_t) const | Memeriksa apakah objek yang direferensikan null. |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | Membandingkan objek yang direferensikan dengan instance lain dari kelas [WeakReference](../weakreference/). |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | Menetapkan objek (target) yang direferensikan oleh objek [WeakReference](../weakreference/) saat ini. |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | Mendapatkan objek (target) yang direferensikan oleh objek [WeakReference](../weakreference/) saat ini. |
| [WeakReference](./weakreference/)() | Konstruktor default. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Konstruktor dari nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | Menginisialisasi sebuah instance baru dari kelas [WeakReference](../weakreference/), yang mereferensikan objek yang ditentukan. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | Menginisialisasi sebuah instance baru dari kelas [WeakReference](../weakreference/), yang mereferensikan objek yang ditentukan. |

## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
