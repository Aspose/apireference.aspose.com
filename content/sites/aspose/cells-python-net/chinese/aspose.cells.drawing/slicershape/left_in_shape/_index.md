---
title: left_in_shape属性
second_title: Aspose.Cells for Python via .NET API 参考文献
description:
type: docs
weight: 700
url: /zh/aspose.cells.drawing/slicershape/left_in_shape/
is_root: false
---
## left_in_shape属性

表示形状与父形状左边界的水平偏移量，
以父形状宽度的 1/4000 为单位。

### 注意事项

仅当此形状位于组或图表中时适用。

### 例子

```python

if shape.is_in_group and shape.left_in_shape == 2000:
    shape.left_in_shape = 4000

```
### 定义：
```python
@property
def left_in_shape(self):
    ...
@left_in_shape.setter
def left_in_shape(self, value):
    ...
```

### 也可以看看
* 模块[`aspose.cells.drawing`](../../)
* 类 [`SlicerShape`](/cells/python-net/zh/aspose.cells.drawing/slicershape)
