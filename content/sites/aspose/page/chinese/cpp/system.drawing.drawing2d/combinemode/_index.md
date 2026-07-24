---
title: "System::Drawing::Drawing2D::CombineMode 枚举"
linktitle: "CombineMode"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Drawing2D::CombineMode 枚举。指定在 C++ 中如何组合裁剪区域。"
type: docs
weight: 1400
url: /zh/cpp/system.drawing.drawing2d/combinemode/
---
## CombineMode enum


指定剪裁区域的组合方式。

```cpp
enum class CombineMode
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 替换 | 0 | 一个裁剪区域被另一个替换。 |
| 相交 | 1 | 两个裁剪区域通过取它们的交集进行组合。 |
| 并集 | 2 | 两个裁剪区域通过取它们的并集进行组合。 |
| 异或 | 3 | 两个裁剪区域通过仅取其中一个区域所围成的面积（而不是两者都包含）进行组合。 |
| 排除 | 4 | 两个裁剪区域通过取第一区域中不与第二区域相交的面积进行组合。 |
| 补集 | 5 | 两个裁剪区域通过取第二区域中不与第一区域相交的面积进行组合。 |

## 另见

* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
