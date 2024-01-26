---
title: insert_glyphs method
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 320
url: /python-net/aspose.page.xps/xpsdocument/insert_glyphs/
is_root: false
---

## insert_glyphs {#int-aspose.page.xps.xpsmodel.XpsFont-float-float-float-str}

Inserts new glyphs to the active page at `index` position.


### Returns 


Inserted glyphs.


```python
def insert_glyphs(self, index, font, font_size, origin_x, origin_y, unicode_string):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Position at which new glyphs should be inserted. |
| font | aspose.page.xps.xpsmodel.XpsFont | Font resource. |
| font_size | float | Font size. |
| origin_x | float | Glyphs origin X coordinate. |
| origin_y | float | Glyphs origin Y coordinate. |
| unicode_string | str | String to be printed. |


## insert_glyphs {#int-str-float-aspose.pydrawing.FontStyle-float-float-str}

Inserts new glyphs to the active page at `index` position.


### Returns 


Inserted glyphs.


```python
def insert_glyphs(self, index, font_family, font_size, font_style, origin_x, origin_y, unicode_string):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| index | int | Position at which new glyphs should be inserted. |
| font_family | str | Font family. |
| font_size | float | Font size. |
| font_style | aspose.pydrawing.FontStyle | Font style. |
| origin_x | float | Glyphs origin X coordinate. |
| origin_y | float | Glyphs origin Y coordinate. |
| unicode_string | str | String to be printed. |



### See Also
* module [`aspose.page.xps`](../../)
* class [`XpsDocument`](/page/python-net/aspose.page.xps/xpsdocument)
* class [`XpsGlyphs`](/page/python-net/aspose.page.xps.xpsmodel/xpsglyphs)
