---
title: built_in_document_properties属性
second_title: Aspose.Cells for Python via .NET API 参考文献
description:
type: docs
weight: 470
url: /zh/aspose.cells/workbook/built_in_document_properties/
is_root: false
---
## built_in_document_properties属性

返回一个 [`DocumentProperty`](/cells/python-net/zh/aspose.cells.properties/documentproperty) 集合，该集合代表电子表格的所有内置文档属性。

### 注意事项

无法将新属性添加到内置文档属性列表中。您只能获取内置属性并更改其值。
以下是内置属性名称列表：

标题


主题


作者


关键词


注意事项


模板


最后一位作者


修订号


应用程序名称


最后打印日期


创建日期


最后保存时间


总编辑时间


页数


字数


字符数


安全


类别


格式


经理


公司


字节数


行数


段落数


幻灯片数量


注释数量


隐藏幻灯片的数量


多媒体剪辑数量

### 例子

```python
from aspose.cells import Workbook

workbook = Workbook()
doc = workbook.built_in_document_properties.get("Author")
doc.value = "John Smith"

```
### 定义：
```python
@property
def built_in_document_properties(self):
    ...
```

### 也可以看看
* 模块[`aspose.cells`](../../)
* 类 [`BuiltInDocumentPropertyCollection`](/cells/python-net/zh/aspose.cells.properties/builtindocumentpropertycollection)
* 类 [`DocumentProperty`](/cells/python-net/zh/aspose.cells.properties/documentproperty)
* 类 [`Workbook`](/cells/python-net/zh/aspose.cells/workbook)
