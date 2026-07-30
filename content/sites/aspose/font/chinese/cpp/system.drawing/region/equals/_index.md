---
title: "System::Drawing::Region::Equals 方法"
linktitle: "等于"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Region::Equals 方法。确定指定的区域是否与当前对象在指定绘图表面上所表示的区域完全相同（C++）。"
type: docs
weight: 600
url: /zh/cpp/system.drawing/region/equals/
---
## Region::Equals method


确定在指定的绘图表面上，指定的区域是否与当前对象所表示的区域完全相同。

```cpp
bool System::Drawing::Region::Equals(const SharedPtr<Region> &r, const SharedPtr<Graphics> &g)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| r | const SharedPtr\<Region\>\& | 用于与此区域比较的区域 |
| g | const SharedPtr\<Graphics\>\& | 绘图表面 |

### ReturnValue

如果在应用与 **g** 参数关联的变换时，指定区域的内部与当前对象所表示区域的内部相同，则为 true；否则为 false

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../)
* Class [Graphics](../../graphics/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
