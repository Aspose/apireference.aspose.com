---
title: Font类
second_title: Aspose.Cells for Python via .NET API 参考文献
description:
type: docs
weight: 660
url: /zh/aspose.cells/font/
is_root: false
---
## Font类
封装电子表格中使用的字体对象。



Font 类型公开以下成员：

### 属性
|属性|描述|
| :- | :- |
| [charset](/cells/python-net/zh/aspose.cells/font/charset) |表示字符集。|
| [is_italic](/cells/python-net/zh/aspose.cells/font/is_italic) |获取或设置一个值，指示字体是否为斜体。|
| [is_bold](/cells/python-net/zh/aspose.cells/font/is_bold) |获取或设置一个值，指示字体是否为粗体。|
| [caps_type](/cells/python-net/zh/aspose.cells/font/caps_type) |获取并设置文本大小写类型。|
| [strike_type](/cells/python-net/zh/aspose.cells/font/strike_type) |获取文本的删除类型。|
| [is_strikeout](/cells/python-net/zh/aspose.cells/font/is_strikeout) |获取或设置一个值，指示字体是否为单删除线。|
| [script_offset](/cells/python-net/zh/aspose.cells/font/script_offset) |获取或设置脚本偏移量，以百分比为单位|
| [is_superscript](/cells/python-net/zh/aspose.cells/font/is_superscript) |获取或设置一个值，指示字体是否为上标。|
| [is_subscript](/cells/python-net/zh/aspose.cells/font/is_subscript) |获取或设置一个值，指示字体是否为下标。|
| [underline](/cells/python-net/zh/aspose.cells/font/underline) |获取或设置字体下划线类型。|
| [name](/cells/python-net/zh/aspose.cells/font/name) |获取或设置 [`Font`](/cells/python-net/zh/aspose.cells/font) 的名称。|
| [double_size](/cells/python-net/zh/aspose.cells/font/double_size) |获取并设置字体的双倍大小。|
| [size](/cells/python-net/zh/aspose.cells/font/size) |获取或设置字体的大小。|
| [theme_color](/cells/python-net/zh/aspose.cells/font/theme_color) |获取并设置主题颜色。|
| [color](/cells/python-net/zh/aspose.cells/font/color) |获取或设置字体的颜色。|
| [argb_color](/cells/python-net/zh/aspose.cells/font/argb_color) |获取并设置具有 32 位 ARGB 值的颜色。|
| [is_normalize_heights](/cells/python-net/zh/aspose.cells/font/is_normalize_heights) |指示是否要将高度标准化应用于文本运行。|
| [scheme_type](/cells/python-net/zh/aspose.cells/font/scheme_type) |获取并设置字体的方案类型。|


### 方法
|方法|描述|
| :- | :- |
| [`equals(self, font)`](/cells/python-net/zh/aspose.cells/font/equals/#aspose.cells.font) |检查两种字体是否相同。|



### 例子

```python
from aspose.cells import Workbook
from aspose.pydrawing import Color

# Instantiating a Workbook object
workbook = Workbook()
# Obtaining the reference of the newly added worksheet by passing its sheet index
worksheet = workbook.worksheets[0]
# Accessing the "A1" cell from the worksheet
cell = worksheet.cells.get("A1")
# Adding some value to the "A1" cell
cell.put_value("Hello Aspose!")
font = cell.get_style().font
# Setting the font name to "Times New Roman"
font.name = "Times New Roman"
# Setting font size to 14
font.size = 14
# setting font color as Red
font.color = Color.red
# Saving the Excel file
workbook.save(r"dest.xls")

```

### 也可以看看
* 模块[`aspose.cells`](..)
* 类 [`Font`](/cells/python-net/zh/aspose.cells/font)
