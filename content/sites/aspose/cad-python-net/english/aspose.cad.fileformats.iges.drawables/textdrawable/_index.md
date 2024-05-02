---
title: TextDrawable class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.cad.fileformats.iges.drawables/textdrawable/
is_root: false
---

## TextDrawable class

Provides intermediate Drawable representation of a text in a drawing



**Inheritance:** [`TextDrawable`](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable) → 
[`IgesDrawableBase`](/cad/python-net/aspose.cad.fileformats.iges.drawables/igesdrawablebase)



The TextDrawable type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/__init__/#str-aspose.cad.primitives.Point3D-float-float-float-aspose.cad.fileformats.iges.drawables.IDrawableProperties) | Creates text Drawable and determines its text boundaries |


### Properties
| Property | Description |
| :- | :- |
| [properties](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/properties) | Non-geometric properties for geometry |
| [all_points](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/all_points) | Array of all points defining geometry |
| [entity_uid](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/entity_uid) | Unique identifier (line number) of entity that created this entity |
| [id](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/id) |  |
| [childs](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/childs) |  |
| [orientation](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/orientation) | Horizontal or vertical text |
| [mirrioring](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/mirrioring) | Mirroring of text |
| [text](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/text) | Text |
| [origin](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/origin) | Left bottom point of text boundary, used as origin point of primitive,maps to AllPoints[0] |
| [end_bottom_line](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/end_bottom_line) | Right bottom point of text boundary, maps to AllPoints[3] |
| [upper_left](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/upper_left) | Left upper point of text boundary, maps to AllPoints[1] |
| [upper_right](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/upper_right) | Right upper point of text boundary, maps to AllPoints[2] |


### Methods
| Method | Description |
| :- | :- |
| [get_transformed_drawable](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/get_transformed_drawable/#list) | Creates a new Text drawable using provided points and non-geometric properties of current Text drawable |
| [get_new_props_drawable](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable/get_new_props_drawable/#aspose.cad.fileformats.iges.drawables.IDrawableProperties) | Creates a new Text drawable using geometry of current Text drawable and provided non-geometric properties |



### See Also
* module [`aspose.cad.fileformats.iges.drawables`](..)
* class [`IgesDrawableBase`](/cad/python-net/aspose.cad.fileformats.iges.drawables/igesdrawablebase)
* class [`TextDrawable`](/cad/python-net/aspose.cad.fileformats.iges.drawables/textdrawable)
