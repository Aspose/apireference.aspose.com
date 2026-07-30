---
title: "System::operator- 方法"
linktitle: "operator-"
second_title: "Aspose.Font 适用于 C++"
description: "System::operator- 方法。返回 Decimal 类的新实例，该实例表示从指定值中减去指定 Decimal 对象所表示的值后的结果。"
type: docs
weight: 28200
url: /zh/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


返回一个新的 [Decimal](../decimal/) 类实例，该实例表示从指定值中减去指定的 [Decimal](../decimal/) 对象所表示的值的结果。

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | const T\& | 要被减去的值 |
| d | const Decimal\& | 表示被减去值的 [Decimal](../decimal/) 对象 |

### ReturnValue

一个新的 [Decimal](../decimal/) 类实例，表示从 **x** 中减去 **d** 所表示的值后的结果。

## 另见

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


对非可空和可空值进行减法。

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
```


| 参数 | 描述 |
| --- | --- |
| T1 | 左操作数类型。 |
| T2 | 右操作数类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 一些 | const T1\& | 左操作数。 |
| 其他 | const Nullable\<T2\>\& | 右操作数。 |

### ReturnValue

减法结果。

## 另见

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


计算两个星期几之间的天数。

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | DayOfWeek | 被减数 |
| b | DayOfWeek | 减数 |

### ReturnValue

星期几 **a** 与 **b** 之间的天数；如果 *goes* 在 **** 之后，返回值为负数。

## 另见

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


从左侧委托的回调列表末端断开右侧委托的所有回调。

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | 将从中移除回调的委托。 |
| rhv | MulticastDelegate\<T\> | 其回调将被移除的委托。 |

### ReturnValue

返回一个委托，其中包含左侧值的回调，但不包括右侧值的回调。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
