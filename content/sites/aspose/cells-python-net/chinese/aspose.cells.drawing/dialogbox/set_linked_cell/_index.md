---
title: set_linked_cell方法
second_title: Aspose.Cells for Python via .NET API 参考文献
description:
type: docs
weight: 210
url: /zh/aspose.cells.drawing/dialogbox/set_linked_cell/
is_root: false
---
##  set_linked_cell(self, formula, is_r1c1, is_local) {#str-bool-bool}
设置与控件值链接的范围。



```python

def set_linked_cell(self, formula, is_r1c1, is_local):
    ...
```


|范围|类型|描述|
| :- | :- | :- |
| formula | str |与控件值关联的范围。|
| is_r1c1 | bool |公式是否需要格式化为R1C1。|
| is_local | bool |公式是否需要根据语言环境进行格式化。|

### 例子

```python

# After executing the code below, a ScrollBar object is created in the generated file. As you drag the slider, the value is displayed in cell A12.
# ActiveX Controls
# Aspose.Cells.Drawing.Shape scrollBar = book.Worksheets[0].Shapes.AddActiveXControl( Aspose.Cells.Drawing.ActiveXControls.ControlType.ScrollBar,2, 0, 2, 0, 30, 130);
# Form Controls
scrollBar = book.worksheets[0].shapes.add_scroll_bar(2, 0, 2, 0, 130, 30)
# Sets the range linked to the control's value.
scrollBar.set_linked_cell("$A$12", False, True)

```



### 也可以看看
* 模块[`aspose.cells.drawing`](../../)
* 类 [`DialogBox`](/cells/python-net/zh/aspose.cells.drawing/dialogbox)
