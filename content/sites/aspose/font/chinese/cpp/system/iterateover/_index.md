---
title: "System::IterateOver 方法"
linktitle: "IterateOver"
second_title: "Aspose.Font 适用于 C++"
description: "System::IterateOver 方法。此函数属性包装可枚举（或可迭代）对象，使其能够在基于范围的 for 循环中使用。此重载针对 C++ 中的 Enumerable this，使用默认目标类型。"
type: docs
weight: 23200
url: /zh/cpp/system/iterateover/
---
## System::IterateOver(const Enumerable *) method


此函数属性包装可枚举（或可迭代）对象，使其能够在基于范围的 for 循环中使用。此重载针对 Enumerable this，使用默认目标类型。

```cpp
template<typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, Details::ValueTypeOfEnumerable<Enumerable>, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| 参数 | 描述 |
| --- | --- |
| Enumerable | 包装对象的类型 |

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(const Enumerable *) method


此函数属性包装可枚举（或可迭代）对象，使其能够在基于范围的 for 循环中使用。此重载针对没有 begin()、end() 方法的 Enumerable，使用目标类型参数，例如 (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!IsSmartPtr<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T, Enumerable *>> System::IterateOver(const Enumerable *enumerable)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型，必须由迭代器返回 |
| Enumerable | 包装对象的类型 |

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


此函数属性包装可枚举（或可迭代）对象，使其能够在基于范围的 for 循环中使用。此重载针对没有 begin()、end() 方法的 Enumerable，使用目标类型参数，例如 (auto& value : IterateOver<SomeType>(enumerable))

```cpp
template<typename T,typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| 参数 | 描述 |
| --- | --- |
| T | 目标类型，必须由迭代器返回 |
| Enumerable | 包装对象的类型 |

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


此函数属性包装可枚举（或可迭代）对象，使其能够在基于范围的 for 循环中使用。此重载针对没有 begin()、end() 方法的 Enumerable，使用默认目标类型参数，例如 (auto& value : IterateOver(enumerable))，相当于以下 C# 代码 foreach (var value in enumerable)。

```cpp
template<typename Enumerable> std::enable_if_t<!Details::IsIterable<Enumerable>::value, Details::EnumeratorAdapter<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| 参数 | 描述 |
| --- | --- |
| Enumerable | 包装对象的类型 |

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


此函数属性包装可枚举（或可迭代）对象，使其能够在基于范围的 for 循环中使用。此重载针对具有 begin()、end() 方法的 Enumerable，使用默认目标类型参数，例如 (auto& value : IterateOver(enumerable))。

```cpp
template<typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| 参数 | 描述 |
| --- | --- |
| Enumerable | 包装对象的类型 |

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


此函数属性包装可枚举（或可迭代）对象，使其能够在基于范围的 for 循环中使用。此重载针对具有 begin()、end() 方法的 Enumerable，目标类型与迭代器的原始 value_type 相同。

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, System::SmartPtr<Enumerable>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| 参数 | 描述 |
| --- | --- |
| Enumerable | 包装对象的类型 |
| T | 目标类型，必须由迭代器返回 |

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::IterateOver(System::SmartPtr\<Enumerable\>) method


此函数属性包装可枚举（或可迭代）对象，使其能够在基于范围的 for 循环中使用。此重载针对具有 begin()、end() 方法的 Enumerable，使用不同于迭代器原始 value_type 的目标类型。

```cpp
template<typename T,typename Enumerable> std::enable_if_t<Details::IsIterable<Enumerable>::value &&!std::is_same<typename Details::ReturnTypeTrait<T>::ReturnType, Details::IterableValueType<Enumerable>>::value, Details::CppIteratorAdapter<Enumerable, T>> System::IterateOver(System::SmartPtr<Enumerable> enumerable)
```


| 参数 | 描述 |
| --- | --- |
| Enumerable | 包装对象的类型 |
| T | 目标类型，必须由迭代器返回 |

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
