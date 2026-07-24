---
title: "System::Drawing::Region::Equals 方法"
linktitle: "等于"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Region::Equals 方法。确定指定的区域是否与当前对象在指定绘图表面上所表示的区域相同（在 C++ 中）。"
type: docs
weight: 600
url: /zh/cpp/system.drawing/region/equals/
---
## Region::Equals method


确定指定的区域在给定的绘图表面上是否与当前对象所表示的区域相同。

```cpp
bool System::Drawing::Region::Equals(const SharedPtr<Region> &r, const SharedPtr<Graphics> &g)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| r | const SharedPtr\<Region\>\& | 用于与此区域比较的区域 |
| g | const SharedPtr\<Graphics\>\& | 绘图表面 |

### ReturnValue

True，如果在应用与 **g** 参数关联的变换后，指定区域的内部与当前对象所表示的区域的内部相同；否则为 false

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../)
* Class [Graphics](../../graphics/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
