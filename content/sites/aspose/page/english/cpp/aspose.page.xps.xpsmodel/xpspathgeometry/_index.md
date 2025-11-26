---
title: Aspose::Page::XPS::XpsModel::XpsPathGeometry class
linktitle: XpsPathGeometry
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsPathGeometry class. Class incapsulating PathGeometry property element features. This element contains a set of path figures specified either with the Figures attribute or with a child PathFigure element in C++.'
type: docs
weight: 3200
url: /cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


Class incapsulating PathGeometry property element features. This element contains a set of path figures specified either with the Figures attribute or with a child PathFigure element.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Methods

| Method | Description |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | Adds a path segment to the list of child segments of the last pah figure. |
| [Clone](./clone/)() | Clones this path geometry. |
| [get_FillRule](./get_fillrule/)() const | Returns/sets the value specifying how the intersecting areas of geometric shapes are combined to form a region. |
| [get_PathFigures](./get_pathfigures/)() | Returns list of child path figures. |
| [get_Transform](./get_transform/)() override | Returns/sets the affine transformation matrix establishing the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | Inserts a path segment to the list of child segments of the last path figure at *index*  position. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | Removes a path segment from the list of child segments of the last path figure. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | Removes a path segment from the list of child segments of the last path figure at *index*  position. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | Returns/sets the value specifying how the intersecting areas of geometric shapes are combined to form a region. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Returns/sets the affine transformation matrix establishing the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Set n'th template argument a weak pointer (rather than shared). Allows switching pointers in containers to weak mode. |
## See Also

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
