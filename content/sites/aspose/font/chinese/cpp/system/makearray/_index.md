---
title: "System::MakeArray 方法"
linktitle: "MakeArray"
second_title: "Aspose.Font 适用于 C++"
description: "System::MakeArray 方法。一个工厂函数，在 C++ 中构造一个新的 Array 对象，并将指定的参数传递给其构造函数。"
type: docs
weight: 24100
url: /zh/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


一个工厂函数，构造一个新的 [Array](../array/) 对象，并将指定的参数传递给其构造函数。

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| 参数 | 描述 |
| --- | --- |
| T | 函数构造的 [Array](../array/) 对象的元素类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| args | Args\&&... | 传递给正在构造的 [Array](../array/) 对象构造函数的参数 |

### ReturnValue

指向已构造的 [Array](../array/) 对象的智能指针

## 另见

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


一个工厂函数，构造一个新的 [Array](../array/) 对象，并将指定的参数传递给其构造函数。

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| 参数 | 描述 |
| --- | --- |
| T | 函数构造的 [Array](../array/) 对象的元素类型 |
| Integral | 数组大小的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| size | Integral | 正在创建的数组的大小。 |
| args | Args\&&... | 传递给正在构造的 [Array](../array/) 对象构造函数的参数 |

### ReturnValue

指向已构造的 [Array](../array/) 对象的智能指针

## 另见

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


一个工厂函数，构造一个新的 [Array](../array/) 对象，用指定的初始化列表中的元素填充它，并返回指向该 [Array](../array/) 对象的智能指针。

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| 参数 | 描述 |
| --- | --- |
| T | 函数构造的 [Array](../array/) 对象的元素类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| init | std::initializer_list\<T\> | 包含用于填充数组的元素的初始化列表 |

### ReturnValue

指向已构造的 [Array](../array/) 对象的智能指针

## 另见

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
