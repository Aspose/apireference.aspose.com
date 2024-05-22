---
title: aspose.svg.imagevectorization
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.svg.imagevectorization/
is_root: false
---

The **Aspose.Svg.ImageVectorization**  namespace contains classes for vectorizing raster images and converting them to SVG documents.
This process involves reducing bitmaps to geometric shapes made up from path elements and storing them as SVG.
The namespace includes classes for building path segments, simplifying and smoothing trace points, and configuring vectorization options.

### Classes
| Class | Description |
| :- | :- |
| [`BezierPathBuilder`](/svg/python-net/aspose.svg.imagevectorization/bezierpathbuilder) | The [`BezierPathBuilder`](/svg/python-net/aspose.svg.imagevectorization/bezierpathbuilder) class is responsible for constructing a Bezier path from a given set of points.<br/>It approximates a trace of points with a Bezier curve, optimizing the number of segments to closely<br/>match the original trace while minimizing complexity. |
| [`IImageTraceSimplifier`](/svg/python-net/aspose.svg.imagevectorization/iimagetracesimplifier) | The IImageTraceSimplifier interface is responsible for reduction of points in the trace. |
| [`IImageTraceSmoother`](/svg/python-net/aspose.svg.imagevectorization/iimagetracesmoother) | The IImageTraceSmoother interface is responsible for smoothing trace. |
| [`IPathBuilder`](/svg/python-net/aspose.svg.imagevectorization/ipathbuilder) | The IPathBuilder interface is responsible for building path segments [`SVGPathSeg`](/svg/python-net/aspose.svg.paths/svgpathseg) from list of the trace points. |
| [`ImageTraceSimplifier`](/svg/python-net/aspose.svg.imagevectorization/imagetracesimplifier) | The ImageTraceSimplifier class is responsible reducing the number of points in a curve that is approximated by a series of the trace points. |
| [`ImageTraceSmoother`](/svg/python-net/aspose.svg.imagevectorization/imagetracesmoother) | The ImageTraceSimplifier class is responsible for smoothing the number of points in a curve that is approximated by a series of the trace points.<br/>This class implement nearest-neighbor approach. |
| [`ImageVectorizer`](/svg/python-net/aspose.svg.imagevectorization/imagevectorizer) | This ImageVectorizer class vectorizes raster images like PNG, JPG, GIF, BMP and etc... and returns SVGDocument.  <br/>Under vectorization we mean the process of reducing bitmaps to geometric shapes made up from path elements and stored as SVG. |
| [`ImageVectorizerConfiguration`](/svg/python-net/aspose.svg.imagevectorization/imagevectorizerconfiguration) | The [`ImageVectorizerConfiguration`](/svg/python-net/aspose.svg.imagevectorization/imagevectorizerconfiguration) class defines a configuration of image vectorization methods and options.<br/>The configuration is used to initialize an ImageVectorizer and provides the configuration options for<br/>vectorizing images. |
| [`SplinePathBuilder`](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder) | The [`SplinePathBuilder`](/svg/python-net/aspose.svg.imagevectorization/splinepathbuilder) class is designed to construct a smooth path by transforming Centripetal Catmull–Rom splines into Bezier curves.<br/>It offers a method to generate a path that smoothly interpolates through a set of points, providing a balance between fidelity to the points and smoothness of the curve. |
| [`StencilConfiguration`](/svg/python-net/aspose.svg.imagevectorization/stencilconfiguration) | The [`StencilConfiguration`](/svg/python-net/aspose.svg.imagevectorization/stencilconfiguration) class defines a configuration of stencil effect options. |


### Enumerations
| Enumeration | Description |
| :- | :- |
| [`StencilType`](/svg/python-net/aspose.svg.imagevectorization/stenciltype) | The [`StencilType`](/svg/python-net/aspose.svg.imagevectorization/stenciltype) enum defines stencil types. |


