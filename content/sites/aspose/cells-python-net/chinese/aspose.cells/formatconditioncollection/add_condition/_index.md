---
title: add_condition方法
second_title: Aspose.Cells for Python via .NET API 参考文献
description:
type: docs
weight: 40
url: /zh/aspose.cells/formatconditioncollection/add_condition/
is_root: false
---
##  add_condition(self, type) {#aspose.cells.FormatConditionType}
添加格式条件。


### 返回

格式化条件对象索引；


```python

def add_condition(self, type):
    ...
```


|范围|类型|描述|
| :- | :- | :- |
| type | [`FormatConditionType`](/cells/python-net/zh/aspose.cells/formatconditiontype) |格式条件类型。|


##  add_condition(self, type, operator_type, formula1, formula2) {#aspose.cells.FormatConditionType-aspose.cells.OperatorType-str-str}
添加格式化条件。


### 返回

格式化条件对象索引；


```python

def add_condition(self, type, operator_type, formula1, formula2):
    ...
```


|范围|类型|描述|
| :- | :- | :- |
| type | [`FormatConditionType`](/cells/python-net/zh/aspose.cells/formatconditiontype) |格式条件的类型。|
| operator_type | [`OperatorType`](/cells/python-net/zh/aspose.cells/operatortype) |运算符类型|
| formula1 | str |与条件格式相关的值或表达式。<br/>如果输入值以“=”开头，则将被视为公式。<br/>否则它将被视为纯值（文本、数字、布尔值）。<br/>对于以“=”开头的文本值，用户可以以公式形式输入，格式为：“=\"=...\"”。|
| formula2 | str |与条件格式相关的值或表达式。<br/>输入格式与公式1相同|



### 也可以看看
* 模块[`aspose.cells`](../../)
* 类 [`FormatConditionCollection`](/cells/python-net/zh/aspose.cells/formatconditioncollection)
