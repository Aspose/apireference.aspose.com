---
title: "Метод System::IterateOver"
linktitle: "IterateOver"
second_title: "Aspose.Font для C++"
description: "Метод System::IterateOver. Это свойство‑функция оборачивает объект, поддерживающий перечисление (или итерирование), чтобы его можно было использовать в range‑based for loop. Эта перегрузка для Enumerable с типом‑целью по умолчанию в C++."
type: docs
weight: 23200
url: /ru/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


Это свойство‑функция оборачивает объект, поддерживающий перечисление (или итерирование), чтобы его можно было использовать в range‑based for loop. Эта перегрузка для Enumerable с типом‑целью по умолчанию.

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Параметр | Описание |
| --- | --- |
| Enumerable | Тип оборачиваемого объекта |

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(const Enumerable *) method


Это свойство‑функция оборачивает объект, поддерживающий перечисление (или итерирование), чтобы его можно было использовать в range‑based for loop. Эта перегрузка для Enumerable без методов begin(), end() с аргументом типа‑цели для (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| Параметр | Описание |
| --- | --- |
| T | Тип‑цель, который должен возвращаться итератором |
| Enumerable | Тип оборачиваемого объекта |

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Это свойство‑функция оборачивает объект, поддерживающий перечисление (или итерирование), чтобы его можно было использовать в range‑based for loop. Эта перегрузка для Enumerable без методов begin(), end() с аргументом типа‑цели для (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Параметр | Описание |
| --- | --- |
| T | Тип‑цель, который должен возвращаться итератором |
| Enumerable | Тип оборачиваемого объекта |

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Это свойство‑функция оборачивает объект, поддерживающий перечисление (или итерирование), чтобы его можно было использовать в range‑based for loop. Эта перегрузка для Enumerable без методов begin(), end() с типом‑целью по умолчанию для (auto& value : IterateOver(enumerable)), аналогично следующему коду C#: foreach (var value in enumerable)

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Параметр | Описание |
| --- | --- |
| Enumerable | Тип оборачиваемого объекта |

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Это свойство‑функция оборачивает объект, поддерживающий перечисление (или итерирование), чтобы его можно было использовать в range‑based for loop. Эта перегрузка для Enumerable с методами begin(), end() и типом‑целью по умолчанию для (auto& value : IterateOver(enumerable))

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Параметр | Описание |
| --- | --- |
| Enumerable | Тип оборачиваемого объекта |

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Это свойство‑функция оборачивает объект, поддерживающий перечисление (или итерирование), чтобы его можно было использовать в range‑based for loop. Эта перегрузка для Enumerable с методами begin(), end() и типом‑целью, совпадающим с оригинальным value_type итератора.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Параметр | Описание |
| --- | --- |
| Enumerable | Тип оборачиваемого объекта |
| T | Тип‑цель, который должен быть возвращён итератором |

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


Это свойство‑функция оборачивает объект, поддерживающий перечисление (или итерирование), чтобы его можно было использовать в range‑based for loop. Эта перегрузка для Enumerable с методами begin(), end() и различным типом‑целью и оригинальным value_type итератора.

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| Параметр | Описание |
| --- | --- |
| Enumerable | Тип оборачиваемого объекта |
| T | Тип‑цель, который должен быть возвращён итератором |

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
