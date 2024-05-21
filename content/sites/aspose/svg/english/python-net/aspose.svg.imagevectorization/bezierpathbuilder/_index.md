---
title: BezierPathBuilder class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 10
url: /aspose.svg.imagevectorization/bezierpathbuilder/
is_root: false
---

## BezierPathBuilder class

The [`BezierPathBuilder`](./aspose.svg.imagevectorization/bezierpathbuilder) class is responsible for constructing a Bezier path from a given set of points.
It approximates a trace of points with a Bezier curve, optimizing the number of segments to closely
match the original trace while minimizing complexity.



The BezierPathBuilder type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](./aspose.svg.imagevectorization/bezierpathbuilder/__init__/#) | Initializes a new instance of the [`BezierPathBuilder`](./aspose.svg.imagevectorization/bezierpathbuilder) class. |


### Properties
| Property | Description |
| :- | :- |
| [error_threshold](./aspose.svg.imagevectorization/bezierpathbuilder/error_threshold) | Gets or sets the error threshold.<br/>This parameter defines maximum deviation of points to fitted curve.<br/>By default it is 30. |
| [max_iterations](./aspose.svg.imagevectorization/bezierpathbuilder/max_iterations) | Gets or sets the error threshold.<br/>This parameter defines number of iteration for least-squares approximation method.<br/>By default it is 30. |
| [trace_smoother](./aspose.svg.imagevectorization/bezierpathbuilder/trace_smoother) | Gets or sets the trace smoother. |


### Methods
| Method | Description |
| :- | :- |
| [build](./aspose.svg.imagevectorization/bezierpathbuilder/build/#list) |  |



### See Also
* module [`aspose.svg.imagevectorization`](..)
* class [`BezierPathBuilder`](./aspose.svg.imagevectorization/bezierpathbuilder)
* class [`IPathBuilder`](./aspose.svg.imagevectorization/ipathbuilder)
