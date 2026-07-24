---
title: "Metode System::IterateOver"
linktitle: "IterasiAtas"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IterateOver. Properti fungsi ini membungkus objek enumerable (atau iterable) sehingga dapat digunakan dengan loop for berbasis rentang. Overload ini untuk Enumerable ini dengan tipe target default dalam C++."
type: docs
weight: 23100
url: /id/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


Properti fungsi ini membungkus objek enumerable (atau iterable) sehingga dapat digunakan dengan loop for berbasis rentang. Overload ini untuk Enumerable ini dengan tipe target default.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parameter | Deskripsi |
| --- | --- |
| Enumerable | Tipe dari objek yang dibungkus |

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(const Enumerable *) method


Properti fungsi ini membungkus objek enumerable (atau iterable) sehingga dapat digunakan dengan loop for berbasis rentang. Overload ini untuk Enumerable tanpa metode begin(), end() dengan argumen tipe target untuk (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target, harus dikembalikan dari iterator |
| Enumerable | Tipe dari objek yang dibungkus |

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Properti fungsi ini membungkus objek enumerable (atau iterable) sehingga dapat digunakan dengan loop for berbasis rentang. Overload ini untuk Enumerable tanpa metode begin(), end() dengan argumen tipe target untuk (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe target, harus dikembalikan dari iterator |
| Enumerable | Tipe dari objek yang dibungkus |

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Properti fungsi ini membungkus objek enumerable (atau iterable) sehingga dapat digunakan dengan loop for berbasis rentang. Overload ini untuk Enumerable tanpa metode begin(), end() dengan argumen tipe target default untuk (auto& value : IterateOver(enumerable)) analog dengan kode C# berikut foreach (var value in enumerable)

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Deskripsi |
| --- | --- |
| Enumerable | Tipe dari objek yang dibungkus |

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Properti fungsi ini membungkus objek enumerable (atau iterable) sehingga dapat digunakan dengan loop for berbasis rentang. Overload ini untuk Enumerable dengan metode begin(), end() dengan argumen tipe target default untuk (auto& value : IterateOver(enumerable))

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Deskripsi |
| --- | --- |
| Enumerable | Tipe dari objek yang dibungkus |

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Properti fungsi ini membungkus objek enumerable (atau iterable) sehingga dapat digunakan dengan loop for berbasis rentang. Overload ini untuk Enumerable dengan metode begin(), end() dengan tipe target yang sama dengan value_type asli iterator.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Deskripsi |
| --- | --- |
| Enumerable | Tipe dari objek yang dibungkus |
| T | Tipe target yang harus dikembalikan dari iterator |

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Properti fungsi ini membungkus objek enumerable (atau iterable) sehingga dapat digunakan dengan loop for berbasis rentang. Overload ini untuk Enumerable dengan metode begin(), end() dengan tipe target berbeda dan value_type asli iterator.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Parameter | Deskripsi |
| --- | --- |
| Enumerable | Tipe dari objek yang dibungkus |
| T | Tipe target yang harus dikembalikan dari iterator |

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
