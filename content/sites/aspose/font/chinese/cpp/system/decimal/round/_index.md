---
title: "System::Decimal::Round 方法"
linktitle: "Round"
second_title: "Aspose.Font 适用于 C++"
description: "System::Decimal::Round 方法。将指定的值四舍五入到具有指定小数位数的最近值。如果指定的值与两个最近的数字等距，则参数指定函数的行为（在 C++ 中）。"
type: docs
weight: 4400
url: /zh/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


将指定值四舍五入到具有指定小数位数的最近值。若指定值同等接近两个最近的数，则通过参数指定函数的行为。

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| d | const Decimal\& | 要四舍五入的值 |
| 位数 | int | 四舍五入后值的小数位数 |
| mode | MidpointRounding | 指定当 **value** 与两个最近的数字等距时如何执行四舍五入。 |

### ReturnValue

具有指定位数且最接近 **value** 的数字

## 另见

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


将指定值四舍五入到最近的整数。若指定值同等接近两个最近的整数，则通过参数指定函数的行为。

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| d | const Decimal\& | 要四舍五入的值 |
| mode | MidpointRounding | 指定当 **value** 与两个最近的数字等距时如何执行四舍五入。 |

### ReturnValue

**d** rounded to the nearest integral value

## 另见

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
