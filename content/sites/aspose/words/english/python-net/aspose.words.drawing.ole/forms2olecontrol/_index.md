﻿---
title: Forms2OleControl class
linktitle: Forms2OleControl class
articleTitle: Forms2OleControl class
second_title: Aspose.Words for Python
description: "aspose.words.drawing.ole.Forms2OleControl class. Represents Microsoft Forms 2.0 OLE control"
type: docs
weight: 30
url: /python-net/aspose.words.drawing.ole/forms2olecontrol/
---

## Forms2OleControl class

Represents Microsoft Forms 2.0 OLE control.
To learn more, visit the [Working with Ole Objects](https://docs.aspose.com/words/python-net/working-with-ole-objects/) documentation article.




**Inheritance:** [Forms2OleControl](./) → [OleControl](../olecontrol/)

### Properties

| Name | Description |
| --- | --- |
| [back_color](./back_color/) | Gets or sets a background color of the control. The default value depends on a type of the control. |
| [caption](./caption/) | Gets or sets a Caption property of the control. Default value is an empty string. |
| [child_nodes](./child_nodes/) | Gets collection of immediate child controls. |
| [enabled](./enabled/) | Returns ``True`` if control is in enabled state. |
| [fore_color](./fore_color/) | Gets or sets a foreground color of the control. The default value depends on a type of the control. |
| [group_name](./group_name/) | Gets or sets a string that specifies a group of mutually exclusive controls. The default value is an empty string. |
| [height](./height/) | Gets or sets a height of the control in points. |
| [is_forms2_ole_control](../olecontrol/is_forms2_ole_control/) | Returns ``True`` if the control is a [Forms2OleControl](./).<br>(Inherited from [OleControl](../olecontrol/)) |
| [name](../olecontrol/name/) | Gets or sets name of the ActiveX control.<br>(Inherited from [OleControl](../olecontrol/)) |
| [type](./type/) | Gets type of Forms 2.0 control. |
| [value](./value/) | Gets underlying Value property which often represents control state. For example checked option button has '1' value while unchecked has '0'. Default value is an empty string. |
| [width](./width/) | Gets or sets a width of the control in points. |

### Methods

| Name | Description |
| --- | --- |

### Examples

Shows how to verify the properties of an ActiveX control.

```python
doc = aw.Document(file_name=MY_DIR + 'ActiveX controls.docx')
shape = doc.get_child(aw.NodeType.SHAPE, 0, True).as_shape()
ole_control = shape.ole_format.ole_control
self.assertEqual('CheckBox1', ole_control.name)
if ole_control.is_forms2_ole_control:
    check_box = ole_control.as_forms2_ole_control()
    self.assertEqual('First', check_box.caption)
    self.assertEqual('0', check_box.value)
    self.assertEqual(True, check_box.enabled)
    self.assertEqual(aw.drawing.ole.Forms2OleControlType.CHECK_BOX, check_box.type)
    self.assertEqual(None, check_box.child_nodes)
    self.assertEqual('', check_box.group_name)
    # Note, that you can't set GroupName for a Frame.
    check_box.group_name = 'Aspose group name'
```

### See Also

* module [aspose.words.drawing.ole](../)
* class [OleControl](../olecontrol/)

