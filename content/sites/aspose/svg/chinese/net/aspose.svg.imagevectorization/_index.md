---
title: Aspose.Svg.ImageVectorization
second_title: Aspose.SVG for .NET API 参考
description: 的 Aspose.Svg.ImageVectorization 图像矢量化命名空间包含用于矢量化光栅图像并将它们转换为 SVG 文档的类 此过程涉及将位图减少为由路径元素组成的几何形状并将它们存储为 SVG 命名空间包含用于构建路径段简化和平滑跟踪点的类并配置矢量化选项
type: docs
weight: 170
url: /zh/net/aspose.svg.imagevectorization/
---
的 **Aspose.Svg.ImageVectorization 图像矢量化**命名空间包含用于矢量化光栅图像并将它们转换为 SVG 文档的类。 此过程涉及将位图减少为由路径元素组成的几何形状并将它们存储为 SVG。 命名空间包含用于构建路径段、简化和平滑跟踪点的类，并配置矢量化选项。

## 课程

| 班级 | 描述 |
| --- | --- |
| [BezierPathBuilder](./bezierpathbuilder/) | 的[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/)类负责构建路径段[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/)来自跟踪点列表。 此路径构建器基于使用最小二乘法来查找点跟踪的贝塞尔控制点。 |
| [ImageTraceSimplifier](./imagetracesimplifier/) | ImageTraceSimplifier 类负责减少由一系列跟踪点近似的曲线中的点数。 |
| [ImageTraceSmoother](./imagetracesmoother/) | ImageTraceSimplifier 类负责平滑由一系列跟踪点近似的曲线中的点数。 此类实现最近邻方法。 |
| [ImageVectorizer](./imagevectorizer/) | 此 ImageVectorizer 类矢量化光栅图像，如 PNG、JPG、GIF、BMP 等...并返回 SVGDocument。 在矢量化下，我们指的是将位图缩小为由路径元素组成的几何形状并存储为 SVG 的过程。 |
| [ImageVectorizerConfiguration](./imagevectorizerconfiguration/) | 的[`ImageVectorizerConfiguration`](../aspose.svg.imagevectorization/imagevectorizerconfiguration/)类定义了图像矢量化方法和选项的配置。 配置用于初始化ImageVectorizer并提供 矢量化图像的配置选项。 |
| [SplinePathBuilder](./splinepathbuilder/) | 的[`SplinePathBuilder`](../aspose.svg.imagevectorization/splinepathbuilder/)类负责构建路径段[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/)来自跟踪点列表。 此路径构建器基于将 Catmull-Roma 样条应用于一组平滑和减少的路径点.. |
| [StencilConfiguration](./stencilconfiguration/) | 的[`StencilConfiguration`](../aspose.svg.imagevectorization/stencilconfiguration/)类定义模板效果选项的配置。 |
## 接口

| 界面 | 描述 |
| --- | --- |
| [IImageTraceSimplifier](./iimagetracesimplifier/) | IImageTraceSimplifier 接口负责减少轨迹中的点。 |
| [IImageTraceSmoother](./iimagetracesmoother/) | IImageTraceSmoother 接口负责平滑轨迹。 |
| [IPathBuilder](./ipathbuilder/) | IPathBuilder接口负责构建路径段[`SVGPathSeg`](../aspose.svg.paths/svgpathseg/)来自跟踪点列表. |
## 枚举

| 枚举 | 描述 |
| --- | --- |
| [StencilType](./stenciltype/) | 的[`StencilType`](../aspose.svg.imagevectorization/stenciltype/)枚举定义模板类型. |


