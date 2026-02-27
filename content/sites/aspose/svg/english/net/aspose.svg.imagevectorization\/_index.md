---
title: Aspose.Svg.ImageVectorization
second_title: Aspose.SVG for .NET API Reference
description: The Aspose.Svg.ImageVectorization namespace contains classes for vectorizing raster images and converting them to SVG documents. This process involves reducing bitmaps to geometric shapes made up from path elements and storing them as SVG. The namespace includes classes for building path segments simplifying and smoothing trace points and configuring vectorization options
type: docs
weight: 190
url: /net/aspose.svg.imagevectorization/
---
The **Aspose.Svg.ImageVectorization** namespace contains classes for vectorizing raster images and converting them to SVG documents. This process involves reducing bitmaps to geometric shapes made up from path elements and storing them as SVG. The namespace includes classes for building path segments, simplifying and smoothing trace points, and configuring vectorization options.

## Classes

| Class | Description |
| --- | --- |
| [BezierPathBuilder](./bezierpathbuilder/) | The [`BezierPathBuilder`](../aspose.svg.imagevectorization/bezierpathbuilder/) class is responsible for constructing a Bezier path from a given set of points. It approximates a trace of points with a Bezier curve, optimizing the number of segments to closely match the original trace while minimizing complexity. |
| [ImageTraceSimplifier](./imagetracesimplifier/) | The ImageTraceSimplifier class is responsible reducing the number of points in a curve that is approximated by a series of the trace points. |
| [ImageTraceSmoother](./imagetracesmoother/) | The ImageTraceSimplifier class is responsible for smoothing the number of points in a curve that is approximated by a series of the trace points. This class implement nearest-neighbor approach. |
| [ImageVectorizer](./imagevectorizer/) | This ImageVectorizer class vectorizes raster images like PNG, JPG, GIF, BMP and etc... and returns SVGDocument. Under vectorization we mean the process of reducing bitmaps to geometric shapes made up from path elements and stored as SVG. |
| [ImageVectorizerConfiguration](./imagevectorizerconfiguration/) | The [`ImageVectorizerConfiguration`](../aspose.svg.imagevectorization/imagevectorizerconfiguration/) class defines a configuration of image vectorization methods and options. The configuration is used to initialize an ImageVectorizer and provides the configuration options for vectorizing images. |
| [SplinePathBuilder](./splinepathbuilder/) | The [`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/) class is designed to construct a smooth path by transforming Centripetal Catmull–Rom splines into Bezier curves. It offers a method to generate a path that smoothly interpolates through a set of points, providing a balance between fidelity to the points and smoothness of the curve. |
| [StencilConfiguration](./stencilconfiguration/) | The [`StencilConfiguration`](../aspose.svg.imagevectorization/stencilconfiguration/) class defines a configuration of stencil effect options. |
## Interfaces

| Interface | Description |
| --- | --- |
| [IImageTraceSimplifier](./iimagetracesimplifier/) | The IImageTraceSimplifier interface is responsible for reduction of points in the trace. |
| [IImageTraceSmoother](./iimagetracesmoother/) | The IImageTraceSmoother interface is responsible for smoothing trace. |
| [IPathBuilder](./ipathbuilder/) | The IPathBuilder interface is responsible for building path segments [`SVGPathSeg`](../aspose.svg.paths/svgpathseg/) from list of the trace points. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [StencilType](./stenciltype/) | The [`StencilType`](../aspose.svg.imagevectorization/stenciltype/) enum defines stencil types. |
