---
title: "System::Equals< float, float > メソッド"
linktitle: "等しい< float, float >"
second_title: "C++ 用 Aspose.Page"
description: "System::Equals< float, float > メソッド。単精度浮動小数点値に対する特殊化です。IEC 60559:1989 では 2 つの浮動小数点 NaN は常に等しくないと定義されていますが、System.Object.Equals の契約では、オーバーライドは同値演算子の要件を満たす必要があります。そのため、System.Double.Equals と System.Single.Equals は 2 つの NaN を比較したときに True を返しますが、等価演算子はその場合 False を返します（C++ の標準で要求されている通り）。"
type: docs
weight: 18400
url: /ja/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


単精度浮動小数点値に対する特殊化です。IEC 60559:1989 では 2 つの浮動小数点 NaN は常に等しくないと定義されていますが、[System.Object.Equals](../object/equals/) の契約では、オーバーライドは同値演算子の要件を満たす必要があります。そのため、System.Double.Equals と System.Single.Equals は 2 つの NaN を比較したときに True を返しますが、等価演算子はその場合 False を返します（標準で要求されている通り）。

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| a | const float\& | 最初の比較対象 |
| b | const float\& | 2 番目の比較対象 |

### ReturnValue

両方の値が NaN であるか等しい場合は True、そうでなければ false

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
