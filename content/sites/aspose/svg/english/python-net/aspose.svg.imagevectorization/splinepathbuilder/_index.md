---
title: SplinePathBuilder class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 90
url: /python-net/aspose.svg.imagevectorization/splinepathbuilder/
is_root: false
---

## SplinePathBuilder class

The [`SplinePathBuilder`](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder) class is designed to construct a smooth path by transforming Centripetal Catmull–Rom splines into Bezier curves.
It offers a method to generate a path that smoothly interpolates through a set of points, providing a balance between fidelity to the points and smoothness of the curve.



The SplinePathBuilder type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder/__init__/#) | Initializes a new instance of the [`SplinePathBuilder`](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder) class. |
| [__init__](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder/__init__/#float) | Initializes a new instance of the [`SplinePathBuilder`](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder) class. |
| [__init__](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder/__init__/#aspose.svg.imagevectorization.IImageTraceSmoother-aspose.svg.imagevectorization.IImageTraceSimplifier-float) | Initializes a new instance of the [`SplinePathBuilder`](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder) class. |


### Properties
| Property | Description |
| :- | :- |
| [trace_smoother](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder/trace_smoother) | Gets or sets the trace smoother. |
| [trace_simplifier](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder/trace_simplifier) | Gets or sets the trace simplifier. |
| [tension](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder/tension) | The value of the tensions affects how sharply the curve bends at the (interpolated) control points.<br/>It must be in the range from 0 to 1. Any higher or lower values will be aligned with the minimum and maximum values of this range, accordingly. |


### Methods
| Method | Description |
| :- | :- |
| [build](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder/build/#list) |  |



### See Also
* module [`aspose.svg.imagevectorization`](..)
* class [`IPathBuilder`](/svg/python-net/aspose.svg.imagevectorization/ipathbuilder)
* class [`SplinePathBuilder`](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder)
