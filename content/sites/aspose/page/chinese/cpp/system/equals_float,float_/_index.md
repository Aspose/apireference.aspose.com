---
title: "System::Equals< float, float > 方法"
linktitle: "等于< float, float >"
second_title: "Aspose.Page 适用于 C++"
description: "System::Equals< float, float > 方法。专用于单精度浮点值。虽然 IEC 60559:1989 将两个浮点 NaN 定义为始终不相等，但 System.Object.Equals 的约定要求重写必须满足等价运算符的要求。因此，System.Double.Equals 和 System.Single.Equals 在比较两个 NaN 时返回 True，而相等运算符在这种情况下返回 False，符合 C++ 标准的要求。"
type: docs
weight: 18400
url: /zh/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


专用于单精度浮点值。虽然 IEC 60559:1989 将两个浮点 NaN 定义为始终不相等，但 [System.Object.Equals](../object/equals/) 的约定要求重写必须满足等价运算符的要求。因此，System.Double.Equals 和 System.Single.Equals 在比较两个 NaN 时返回 True，而相等运算符在这种情况下返回 False，符合标准的要求。

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 一个 | const float\& | 第一个比较数 |
| b | const float\& | 第二个比较数 |

### ReturnValue

如果两个值都是 NaN 或相等则为 true，否则为 false

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
