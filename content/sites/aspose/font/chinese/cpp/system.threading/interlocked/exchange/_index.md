---
title: "System::Threading::Interlocked::Exchange 方法"
linktitle: "Exchange"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Interlocked::Exchange 方法。交换变量的值：存储新值并返回变量在存储前立即拥有的值（C++）。"
type: docs
weight: 400
url: /zh/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


交换变量的值：存储新值并返回存储前变量原有的值。

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| 参数 | 描述 |
| --- | --- |
| T | 变量类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| location1 | T\& | 用于更改的变量引用。 |
| 值 | T | 要存储的值。 |

### ReturnValue

变量在被更改前的值。

## 另见

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::Exchange(T\&, T) method


交换变量的值：存储新值并返回存储前变量原有的值。未实现。

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| 参数 | 描述 |
| --- | --- |
| T | 变量类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| location1 | T\& | 用于更改的变量引用。 |
| 值 | T | 要存储的值。 |

### ReturnValue

变量在被更改前的值。

## 另见

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
