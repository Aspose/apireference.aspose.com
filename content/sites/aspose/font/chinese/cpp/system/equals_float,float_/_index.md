---
title: "System::Equals< float, float > 方法"
linktitle: "等于< float, float >"
second_title: "Aspose.Font 适用于 C++"
description: "System::Equals< float, float > 方法。针对单精度浮点值的特化。虽然 IEC 60559:1989 定义两个浮点 NaN 总是比较为不相等，但 System.Object.Equals 的契约要求重写必须满足等价运算符的要求。因此，在比较两个 NaN 时，System.Double.Equals 和 System.Single.Equals 返回 True，而相等运算符在这种情况下返回 False，符合 C++ 标准的要求。"
type: docs
weight: 18500
url: /zh/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


针对单精度浮点值的特化。虽然 IEC 60559:1989 定义两个浮点 NaN 总是比较为不相等，但 [System.Object.Equals](../object/equals/) 的契约要求重写必须满足等价运算符的要求。因此，在比较两个 NaN 时，System.Double.Equals 和 System.Single.Equals 返回 True，而相等运算符在这种情况下返回 False，符合标准的要求。

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | const float\& | 第一个比较数 |
| b | const float\& | 第二个比较数 |

### ReturnValue

如果两个值都是 NaN 或相等则返回 True，否则返回 false

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
