---
title: NurbsDirection class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 230
url: /python-net/aspose.threed.entities/nurbsdirection/
is_root: false
---

## NurbsDirection class

A 3D [`NurbsSurface`](/3d/python-net/aspose.threed.entities/nurbssurface) has two direction, the [`NurbsSurface.u`](/3d/python-net/aspose.threed.entities/nurbssurface#u) and [`NurbsSurface.v`](/3d/python-net/aspose.threed.entities/nurbssurface#v), the [`NurbsDirection`](/3d/python-net/aspose.threed.entities/nurbsdirection) defines data for each direction.
A direction is actually a NURBS curve, that means it's also defined by its [`NurbsDirection.order`](/3d/python-net/aspose.threed.entities/nurbsdirection#order), a [`NurbsDirection.KnotVectors`](/3d/python-net/aspose.threed.entities/nurbsdirection), and a set of weighted control points(defined in [`NurbsSurface`](/3d/python-net/aspose.threed.entities/nurbssurface)).



The NurbsDirection type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self)`](/3d/python-net/aspose.threed.entities/nurbsdirection/__init__/#) | Construct a new instance of [`NurbsDirection`](/3d/python-net/aspose.threed.entities/nurbsdirection) |


### Properties
| Property | Description |
| :- | :- |
| [order](/3d/python-net/aspose.threed.entities/nurbsdirection/order) | Gets or sets the order of a NURBS curve, it defines the number of nearby control points that influence any given point on the curve. |
| [degree](/3d/python-net/aspose.threed.entities/nurbsdirection/degree) | Gets or sets the degree of a NURBS curve, the degree are defined as Order - 1 |
| [divisions](/3d/python-net/aspose.threed.entities/nurbsdirection/divisions) | Gets or sets the number of divisions between adjacent control points in current direction. |
| [type](/3d/python-net/aspose.threed.entities/nurbsdirection/type) | Gets or sets the type of the current direction. |
| [count](/3d/python-net/aspose.threed.entities/nurbsdirection/count) | Gets or sets the count of control points in current direction. |



### See Also
* module [`aspose.threed.entities`](..)
* class [`NurbsDirection`](/3d/python-net/aspose.threed.entities/nurbsdirection)
* class [`NurbsSurface`](/3d/python-net/aspose.threed.entities/nurbssurface)
