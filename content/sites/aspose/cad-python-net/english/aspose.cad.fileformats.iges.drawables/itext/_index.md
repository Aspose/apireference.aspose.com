---
title: IText class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 50
url: /aspose.cad.fileformats.iges.drawables/itext/
is_root: false
---

## IText class

Interface for text primitive



The IText type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [text](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/text) | Text |
| [orientation](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/orientation) | Horizontal or vertical text |
| [mirrioring](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/mirrioring) | Mirroring of text |
| [origin](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/origin) | Left bottom point of text boundary, used as origin point of primitive,maps to AllPoints[0] |
| [end_bottom_line](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/end_bottom_line) | Right bottom point of text boundary, maps to AllPoints[3] |
| [upper_left](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/upper_left) | Left upper point of text boundary, maps to AllPoints[1] |
| [upper_right](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/upper_right) | Right upper point of text boundary, maps to AllPoints[2] |
| [properties](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/properties) | Non-geometric properties of geometric representation |
| [all_points](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/all_points) | Array of all points defining geometry |
| [entity_uid](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/entity_uid) | Unique identifier (line number) of entity that created this entity |


### Methods
| Method | Description |
| :- | :- |
| [get_transformed_drawable](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/get_transformed_drawable/#list) | Creates a new drawable using provided points and non-geometric properties of current drawable |
| [get_new_props_drawable](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/get_new_props_drawable/#aspose.cad.fileformats.iges.drawables.IDrawableProperties) | Creates a new drawable using geometry of current drawable and provided non-geometric properties |
| [accept](/cad/python-net/aspose.cad.fileformats.iges.drawables/itext/accept/#aspose.cad.exporters.igesexporter.igesdrawableexporter.IExporterVisitor) | Part of Visitor pattern with an IgesDrawableExporter |



### See Also
* module [`aspose.cad.fileformats.iges.drawables`](..)
* class [`IDrawable`](/cad/python-net/aspose.cad.fileformats.iges.drawables/idrawable)
