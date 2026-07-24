---
title: "System::Threading::Interlocked::Exchange 方法"
linktitle: "交换"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Interlocked::Exchange 方法。交换变量上的值：存储新值并返回变量在存储前立即拥有的值（C++）。"
type: docs
weight: 400
url: /zh/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


交换变量的值：存储新值并返回存储前变量原有的值。

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | 描述 |
| --- | --- |
| T | 变量类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| location1 | T\& | 用于更改的变量引用。 |
| value | T | 要存储的值。 |

### ReturnValue

变量在被更改前的值。

## 另见

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


交换变量的值：存储新值并返回存储前变量原有的值。未实现。

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parameter | 描述 |
| --- | --- |
| T | 变量类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| location1 | T\& | 用于更改的变量引用。 |
| value | T | 要存储的值。 |

### ReturnValue

变量在被更改前的值。

## 另见

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
