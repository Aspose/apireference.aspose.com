---
title: RelativeRectangle class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 160
url: /python-net/aspose.threed.utilities/relativerectangle/
is_root: false
---

## RelativeRectangle class

Relative rectangle
The formula between relative component to absolute value is:
Scale * (Reference Width) + offset
So if we want it to represent an absolute value, leave all scale fields zero, and use offset fields instead.



The RelativeRectangle type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [RelativeRectangle()](/3d/python-net/aspose.threed.utilities/relativerectangle/__init__/#) |  |


### Properties
| Property | Description |
| :- | :- |
| [scale_x](/3d/python-net/aspose.threed.utilities/relativerectangle/scale_x) | Relative coordinate X |
| [scale_y](/3d/python-net/aspose.threed.utilities/relativerectangle/scale_y) | Relative coordinate Y |
| [scale_width](/3d/python-net/aspose.threed.utilities/relativerectangle/scale_width) | Relative width |
| [scale_height](/3d/python-net/aspose.threed.utilities/relativerectangle/scale_height) | Relative height |
| [offset_x](/3d/python-net/aspose.threed.utilities/relativerectangle/offset_x) | Gets or sets the offset for coordinate X |
| [offset_y](/3d/python-net/aspose.threed.utilities/relativerectangle/offset_y) | Gets or sets the offset for coordinate Y |
| [offset_width](/3d/python-net/aspose.threed.utilities/relativerectangle/offset_width) | Gets or sets the offset for width |
| [offset_height](/3d/python-net/aspose.threed.utilities/relativerectangle/offset_height) | Gets or sets the offset for height |


### Methods
| Method | Description |
| :- | :- |
| [to_absolute(rect)](/3d/python-net/aspose.threed.utilities/relativerectangle/to_absolute/#System.Drawing.Size) | Convert the relative rectangle to absolute rectangle |
| [to_absolute(rect)](/3d/python-net/aspose.threed.utilities/relativerectangle/to_absolute/#System.Drawing.Rectangle) | Convert the relative rectangle to absolute rectangle |
| [from_scale(scale_x, scale_y, scale_width, scale_height)](/3d/python-net/aspose.threed.utilities/relativerectangle/from_scale/#float-float-float-float) | Construct a [RelativeRectangle](/3d/python-net/aspose.threed.utilities/relativerectangle) with all offset fields zero and scale fields from given parameters. |


### See Also

* module [aspose.threed.utilities](../)
