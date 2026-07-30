---
title: "System::Drawing::Drawing2D::CombineMode 枚举"
linktitle: "CombineMode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::CombineMode 枚举。指定在 C++ 中如何组合剪裁区域。"
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
| 替换 | 0 | 一个剪裁区域被另一个替换。 |
| Intersect | 1 | 两个剪裁区域通过取交集进行组合。 |
| Union | 2 | 两个剪裁区域通过取两者的并集进行组合。 |
| 异或 | 3 | 两个剪裁区域通过仅取被其中一个区域包围的面积（而非两者共同的面积）进行组合。 |
| 排除 | 4 | 两个剪裁区域通过取第一区域中不与第二区域相交的面积进行组合。 |
| Complement | 5 | 两个剪裁区域通过取第二区域中不与第一区域相交的面积进行组合。 |

## 另见

* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
