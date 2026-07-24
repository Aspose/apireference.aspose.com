---
title: "System::Threading::Interlocked::CompareExchange 方法"
linktitle: "比较交换"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Interlocked::CompareExchange 方法。比较并交换变量上的值：检查变量是否等于特定值，仅在已存储的值与预期值匹配时才存储新值（C++）。"
type: docs
weight: 200
url: /zh/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


比较并交换变量的值：检查变量是否等于特定值，仅在存储的值与预期值匹配时才存储新值。

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| location1 | int32_t\& | 用于更改的变量引用。 |
| value | int32_t | 要存储的值。 |
| comparand | int32_t | 在交换前用于比较变量值的值。 |
| 成功 | bool\& | 变量的引用，如果交换发生则设为 true，否则设为 false。 |

### ReturnValue

操作开始时变量的值，无论是否已更改。

## 另见

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


比较并交换变量的值：检查变量是否等于特定值，仅在存储的值与预期值匹配时才存储新值。

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | 描述 |
| --- | --- |
| T | 变量类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| location1 | T\& | 用于更改的变量引用。 |
| value | T | 要存储的值。 |
| comparand | T | 在交换前用于比较变量值的值。 |

### ReturnValue

操作开始时变量的值，无论是否已更改。

## 另见

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


比较并交换变量的值：检查变量是否等于特定值，仅在存储的值与预期值匹配时才存储新值。未实现。

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parameter | 描述 |
| --- | --- |
| T | 变量类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| location1 | T\& | 用于更改的变量引用。 |
| value | T | 要存储的值。 |
| comparand | T | 在交换前用于比较变量值的值。 |

### ReturnValue

操作开始时变量的值，无论是否已更改。

## 另见

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
