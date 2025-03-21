﻿---
title: OptionButtonControl class
linktitle: OptionButtonControl class
articleTitle: OptionButtonControl class
second_title: Aspose.Words for Python
description: "aspose.words.drawing.ole.OptionButtonControl class. The OptionButton control enables a single choice in a limited set of mutually exclusive choices."
type: docs
weight: 80
url: /python-net/aspose.words.drawing.ole/optionbuttoncontrol/
---

## OptionButtonControl class

The OptionButton control enables a single choice in a limited set of mutually exclusive choices.


**Inheritance:** [OptionButtonControl](./) → [MorphDataControl](../morphdatacontrol/) → [Forms2OleControl](../forms2olecontrol/) → [OleControl](../olecontrol/)

### Properties

| Name | Description |
| --- | --- |
| [back_color](../forms2olecontrol/back_color/) | Gets or sets a background color of the control. The default value depends on a type of the control.<br>(Inherited from [Forms2OleControl](../forms2olecontrol/)) |
| [caption](../forms2olecontrol/caption/) | Gets or sets a Caption property of the control. Default value is an empty string.<br>(Inherited from [Forms2OleControl](../forms2olecontrol/)) |
| [child_nodes](../forms2olecontrol/child_nodes/) | Gets collection of immediate child controls.<br>(Inherited from [Forms2OleControl](../forms2olecontrol/)) |
| [enabled](../forms2olecontrol/enabled/) | Returns ``True`` if control is in enabled state.<br>(Inherited from [Forms2OleControl](../forms2olecontrol/)) |
| [fore_color](../forms2olecontrol/fore_color/) | Gets or sets a foreground color of the control. The default value depends on a type of the control.<br>(Inherited from [Forms2OleControl](../forms2olecontrol/)) |
| [group_name](../forms2olecontrol/group_name/) | Gets or sets a string that specifies a group of mutually exclusive controls. The default value is an empty string.<br>(Inherited from [Forms2OleControl](../forms2olecontrol/)) |
| [height](../forms2olecontrol/height/) | Gets or sets a height of the control in points.<br>(Inherited from [Forms2OleControl](../forms2olecontrol/)) |
| [is_forms2_ole_control](../olecontrol/is_forms2_ole_control/) | Returns ``True`` if the control is a [Forms2OleControl](../forms2olecontrol/).<br>(Inherited from [OleControl](../olecontrol/)) |
| [name](../olecontrol/name/) | Gets or sets name of the ActiveX control.<br>(Inherited from [OleControl](../olecontrol/)) |
| [selected](./selected/) | Gets or sets a boolean value indicating either this [OptionButtonControl](./) is selected or not. |
| [type](./type/) | Gets type of Forms 2.0 control. |
| [value](../forms2olecontrol/value/) | Gets underlying Value property which often represents control state. For example checked option button has '1' value while unchecked has '0'. Default value is an empty string.<br>(Inherited from [Forms2OleControl](../forms2olecontrol/)) |
| [width](../forms2olecontrol/width/) | Gets or sets a width of the control in points.<br>(Inherited from [Forms2OleControl](../forms2olecontrol/)) |

### Methods

| Name | Description |
| --- | --- |

### Examples

Shows how to select radio button.

```python
doc = aw.Document(file_name=MY_DIR + 'Radio buttons.docx')
shape1 = doc.get_child(aw.NodeType.SHAPE, 0, True).as_shape()
option_button1 = shape1.ole_format.ole_control.as_option_button_control()
# Deselect selected first item.
option_button1.selected = False
shape2 = doc.get_child(aw.NodeType.SHAPE, 1, True).as_shape()
option_button2 = shape2.ole_format.ole_control.as_option_button_control()
# Select second option button.
option_button2.selected = True
self.assertEqual(aw.drawing.ole.Forms2OleControlType.OPTION_BUTTON, option_button1.type)
self.assertEqual(aw.drawing.ole.Forms2OleControlType.OPTION_BUTTON, option_button2.type)
doc.save(file_name=ARTIFACTS_DIR + 'Shape.SelectRadioControl.docx')
```

### See Also

* module [aspose.words.drawing.ole](../)
* class [MorphDataControl](../morphdatacontrol/)

