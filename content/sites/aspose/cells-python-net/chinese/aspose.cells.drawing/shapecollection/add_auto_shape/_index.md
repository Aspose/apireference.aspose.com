---
title: add_auto_shape方法
second_title: Aspose.Cells for Python via .NET API 参考文献
description:
type: docs
weight: 40
url: /zh/aspose.cells.drawing/shapecollection/add_auto_shape/
is_root: false
---
##  add_auto_shape(self, type, upper_left_row, top, upper_left_column, left, height, width) {#aspose.cells.drawing.AutoShapeType-int-int-int-int-int-int}
向工作表添加自选图形。


### 返回

一个 Shape 对象。


```python

def add_auto_shape(self, type, upper_left_row, top, upper_left_column, left, height, width):
    ...
```


|范围|类型|描述|
| :- | :- | :- |
| type | [`AutoShapeType`](/cells/python-net/zh/aspose.cells.drawing/autoshapetype) |自动形状类型。|
| upper_left_row | int |左上行索引。|
| top | int |表示 Shape 距离其左行的垂直偏移量，以像素为单位。|
| upper_left_column | int |左上角的列索引。|
| left | int |表示 Shape 距离其左列的水平偏移量，以像素为单位。|
| height | int |表示Shape的高度，以像素为单位。|
| width | int |表示Shape的宽度，以像素为单位。|
### 注意事项

类型不能是 Chart/Comment/Picture/OleObject/Polygon/DialogBox
### 例子


```python
from aspose.cells.drawing import AutoShapeType

# Adds a AutoShape to the worksheet.
autoShape = shapes.add_auto_shape(AutoShapeType.CUBE, 1, 0, 1, 0, 100, 50)

```



### 也可以看看
* 模块[`aspose.cells.drawing`](../../)
* 类 [`ShapeCollection`](/cells/python-net/zh/aspose.cells.drawing/shapecollection)
