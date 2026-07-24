---
title: "System::Decimal::Round メソッド"
linktitle: "丸め"
second_title: "C++ 用 Aspose.Page"
description: "System::Decimal::Round メソッド。指定された値を、指定された小数桁数で最も近い値に丸めます。パラメーターは、指定された値が2つの最も近い数値と同等に近い場合の関数の動作を指定します。C++ において。"
type: docs
weight: 4400
url: /ja/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


指定された小数桁数で、指定された値を最も近い値に丸めます。パラメーターは、指定された値が 2 つの最も近い数と同等に近い場合の関数の動作を指定します。

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| d | const Decimal\& | 丸める値 |
| 桁数 | int | 丸められた値の小数桁数 |
| mode | MidpointRounding | **value** が2つの最も近い数値と同等に近い場合の丸め方法を指定します。 |

### ReturnValue

指定された桁数で **value** に最も近い数

## 参照

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


指定された値を最も近い整数に丸めます。パラメーターは、指定された値が 2 つの最も近い数と同等に近い場合の関数の動作を指定します。

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| d | const Decimal\& | 丸める値 |
| mode | MidpointRounding | **value** が2つの最も近い数値と同等に近い場合の丸め方法を指定します。 |

### ReturnValue

**d** rounded to the nearest integral value

## 参照

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
