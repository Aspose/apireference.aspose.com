---
title: XpsPathGeometry class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 270
url: /python-net/aspose.page.xps.xpsmodel/xpspathgeometry/
---

## XpsPathGeometry class

Class incapsulating PathGeometry property element features.<br/>            This element contains a set of path figures specified either with the Figures attribute or<br/>            with a child PathFigure element.

**Inheritance:** `XpsPathGeometry` → [`XpsObject`](/page/python-net/aspose.page.xps.xpsmodel/xpsobject)

The XpsPathGeometry type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
| `fill_rule` | Returns/sets the value specifying how the intersecting areas of geometric<br/>            shapes are combined to form a region. |
| `transform` | Returns/sets the affine transformation matrix establishing the local matrix transformation<br/>            that is applied to all child and descendant elements of the path geometry before it is used<br/>            for filling, clipping, or stroking. |
| `path_figures` | Returns list of child path figures. |
| `count` | None |
## Indexer
| Name | Description |
| :- | :- |
| `[index]` | Returns an item at the specified index. |
## Methods
| Name | Description |
| :- | :- |
| `add_segment(segment)` | Adds a path segment to the list of child segments of the last pah figure. |
| `insert_segment(index, segment)` | Inserts a path segment to the list of child segments of<br/>            the last path figure at |
| `remove_segment(segment)` | Removes a path segment from the list of child segments of the last path figure. |
| `remove_segment_at(index)` | Removes a path segment from the list of child segments of<br/>            the last path figure at |
| `clone()` | Clones this path geometry. |
| `add(obj)` | Adds a path segment to the list of child segments of the last pah figure. |
| `remove(obj)` | None |
| `insert(index, obj)` | Inserts a path segment to the list of child segments of<br/>            the last path figure at |
| `remove_at(index)` | None |

### See Also

* module [`aspose.page.xps.xpsmodel`](/page/python-net/aspose.page.xps.xpsmodel/)
* package [`aspose.page`](/page/python-net/)

