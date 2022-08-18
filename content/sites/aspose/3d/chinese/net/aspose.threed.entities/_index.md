---
title: Aspose.ThreeD.Entities
second_title: Aspose.3D for .NET API 参考
description: 所有几何和实体都在这个命名空间中定义
type: docs
weight: 40
url: /zh/net/aspose.threed.entities/
---
所有几何和实体都在这个命名空间中定义

## 课程

| 班级 | 描述 |
| --- | --- |
| [Box](./box) | 盒子. |
| [Camera](./camera) | 相机描述了观看者观看场景的眼点。 |
| [Circle](./circle) | 一个[`Circle`](../aspose.threed.entities/circle)曲线由圆形边缘的一组点组成。 |
| [CompositeCurve](./compositecurve) | 一个[`CompositeCurve`](../aspose.threed.entities/compositecurve)由几个曲线段组成。 |
| [Curve](./curve) | 所有曲线实现的基类。 |
| [Cylinder](./cylinder) | 参数化圆柱体。 也可用于表示radiusTop/radiusBottom 之一为零时的圆锥体。 |
| [Dish](./dish) | 参数化菜。 |
| [Ellipse](./ellipse) | 一个[`Ellipse`](../aspose.threed.entities/ellipse)定义了一组形成椭圆形状的点。 |
| [Frustum](./frustum) | 的基类[`Camera`](../aspose.threed.entities/camera)和[`Light`](../aspose.threed.entities/light) |
| [Geometry](./geometry) | 所有可渲染几何对象的基类（如[`Mesh`](../aspose.threed.entities/mesh),[`NurbsSurface`](../aspose.threed.entities/nurbssurface),[`Patch`](../aspose.threed.entities/patch)等等）. |
| [Light](./light) | 灯光照亮场景。 |
| [Line](./line) | 折线是由一组点定义的路径[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) 并由[`Segments`](../aspose.threed.entities/line/segments), 表示它也可以是一组相连的线段。 线通常是一个线性对象，表示它不能用来表示曲线，为了表示曲线，使用[`NurbsCurve`](../aspose.threed.entities/nurbscurve). |
| [LinearExtrusion](./linearextrusion) | 线性挤压将 2D 形状作为输入，并在第 3 维中扩展形状。 |
| [Mesh](./mesh) | 一个网格由许多 n 边多边形组成。 |
| [NurbsCurve](./nurbscurve) | [NURBS 曲线](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline)是由 NURBS（非均匀有理基样条）表示的曲线， NURBS 曲线由其定义[`Order`](../aspose.threed.entities/nurbscurve/order) 一组加权[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints)和一个[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors) 控制点中的w分量作为控制点的权重，不管它是什么TwoDimensional或者ThreeDimensional |
| [NurbsDirection](./nurbsdirection) | 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface)有两个方向，[`U`](../aspose.threed.entities/nurbssurface/u)和[`V`](../aspose.threed.entities/nurbssurface/v) ， 这[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)为每个方向定义数据。 一个方向实际上是一条 NURBS 曲线，这意味着它也由它的定义[`Order`](../aspose.threed.entities/nurbsdirection/order)， 一个[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors)，以及一组加权控制点（定义在[`NurbsSurface`](../aspose.threed.entities/nurbssurface)). |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface)是一个表面，由[NURBS（非均匀有理基础样条）](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), 一个[`NurbsSurface`](../aspose.threed.entities/nurbssurface)由两个定义[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)[`U`](../aspose.threed.entities/nurbssurface/u)和[`V`](../aspose.threed.entities/nurbssurface/v). 无论方向的类型是什么，控制点中的 w 分量都用作控制点的权重TwoDimensional或者ThreeDimensional |
| [Patch](./patch) | 一个[`Patch`](../aspose.threed.entities/patch)是一个参数化建模表面，类似于[`NurbsSurface`](../aspose.threed.entities/nurbssurface)，它也是由两个 定义的[`PatchDirection`](../aspose.threed.entities/patchdirection) ， 这[`U`](../aspose.threed.entities/patch/u)和[`V`](../aspose.threed.entities/patch/v). 但两者之间的区别[`Patch`](../aspose.threed.entities/patch)和[`NurbsSurface`](../aspose.threed.entities/nurbssurface)那是[`PatchDirection`](../aspose.threed.entities/patchdirection)曲线 可以是以下之一Bezier,QuadraticBezier,BasisSpline,CardinalSpline和Linear |
| [PatchDirection](./patchdirection) | 面片的 U 和 V 方向。 |
| [Plane](./plane) | 参数化平面。 |
| [PointCloud](./pointcloud) | 点云不包含拓扑信息，只包含控制点和顶点元素。 |
| [PolygonBuilder](./polygonbuilder) | 一个帮助类来构建多边形[`Mesh`](../aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | 修改多边形的实用程序 |
| [Primitive](./primitive) | 所有原语的基类 |
| [Pyramid](./pyramid) | 参数化金字塔. |
| [RectangularTorus](./rectangulartorus) | 参数化矩形环面。 |
| [RevolvedAreaSolid](./revolvedareasolid) | 此类通过围绕轴旋转轮廓提供的横截面来表示实体模型。 |
| [Shape](./shape) | 形状描述了一组控制点上的变形，类似于 Maya 中的簇变形器。 例如，我们可以将形状添加到创建的几何体中。 并且形状和几何具有相同的拓扑信息，但控制点的位置不同。 由于影响量不同，几何体会产生变形效果。 |
| [Skeleton](./skeleton) | 的[`Skeleton`](../aspose.threed.entities/skeleton)主要是CAD软件用来帮助设计者操纵骨骼结构的变换，一般在CAD软件之外是没用的[`Skeleton`](../aspose.threed.entities/skeleton)通过设置节点作为根节点[`Type`](../aspose.threed.entities/skeleton/type)至Skeleton, 和所有孩子设置为Bone |
| [Sphere](./sphere) | 参数化球体. |
| [SweptAreaSolid](./sweptareasolid) | 一个[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid)通过沿准线扫描轮廓来构造几何图形。 |
| [Torus](./torus) | 参数化圆环。 |
| [TransformedCurve](./transformedcurve) | 一个[`TransformedCurve`](../aspose.threed.entities/transformedcurve)通过使用变换矩阵给曲线一个位置。 这允许在一个内部执行一个变换[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve)或者[`CompositeCurve`](../aspose.threed.entities/compositecurve). |
| [TriMesh](./trimesh) | TriMesh 包含可由 GPU 直接使用的原始数据。 此类是一个实用程序，可帮助构建仅包含每个顶点数据的网格。 |
| [TriMesh&lt;T&gt;](./trimesh-1) | 的通用版本[`TriMesh`](../aspose.threed.entities/trimesh)用于用户静态定义的顶点 type |
| [TrimmedCurve](./trimmedcurve) | 在两端修剪基础曲线的有界曲线。 |
| [VertexElement](./vertexelement) | 顶点元素的基类。 顶点元素类型由 VertexElementType 标识。 VertexElement 描述了顶点元素如何映射到几何表面以及映射信息如何在内存中排列。 VertexElement 包含法线、UV 或其他类型的信息。 |
| [VertexElementBinormal](./vertexelementbinormal) | 定义指定分量的副法线向量。 |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | 定义具体的辅助类[`VertexElement`](../aspose.threed.entities/vertexelement)实现. |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | 定义指定组件的边缘折痕 |
| [VertexElementHole](./vertexelementhole) | 定义指定的多边形是否为hole |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | 定义具体的辅助类[`VertexElement`](../aspose.threed.entities/vertexelement)实现. |
| [VertexElementMaterial](./vertexelementmaterial) | 定义指定组件的材质索引。 一个节点可以有多种材质，[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial)用于在不同材质中渲染几何的不同部分。 |
| [VertexElementNormal](./vertexelementnormal) | 定义指定组件的法线向量。 |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | 为指定的组件定义多边形组以将相关的多边形组合在一起。 |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | 平滑组是多边形网格中的一组多边形，它们应该看起来形成一个平滑的表面。 一些早期的 3D 建模软件，如 DOS 的 3D studio max 使用平滑组来避免为每个网格顶点存储法线向量。 |
| [VertexElementSpecular](./vertexelementspecular) | 定义指定组件的镜面反射颜色。 |
| [VertexElementTangent](./vertexelementtangent) | 定义指定组件的切向量。 |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | 定义具体的辅助类[`VertexElement`](../aspose.threed.entities/vertexelement)实现. |
| [VertexElementUserData](./vertexelementuserdata) | 为指定组件定义自定义用户数据。 通常是用于特殊目的的应用程序特定数据。 |
| [VertexElementUV](./vertexelementuv) | 定义指定组件的 UV 坐标。 几何图形可以有多个[`VertexElementUV`](../aspose.threed.entities/vertexelementuv)元素，每一个都有不同的[`TextureMapping`](../aspose.threed.entities/texturemapping)s. |
| [VertexElementVector4](./vertexelementvector4) | 定义具体的辅助类[`VertexElement`](../aspose.threed.entities/vertexelement)实现. |
| [VertexElementVertexColor](./vertexelementvertexcolor) | 定义指定组件的顶点颜色 |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | 定义指定组件的顶点折痕 |
| [VertexElementVisibility](./vertexelementvisibility) | 定义指定组件是否可见 |
| [VertexElementWeight](./vertexelementweight) | 定义指定组件的混合权重。 |
## 接口

| 界面 | 描述 |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement) | 带有索引数据的 VertexElement。 |
| [IMeshConvertible](./imeshconvertible) | 实现此接口的实体可以转换为[`Mesh`](../aspose.threed.entities/mesh) |
| [IOrientable](./iorientable) | 可定向实体应实现此接口。 |
## 枚举

| 枚举 | 描述 |
| --- | --- |
| [ApertureMode](./aperturemode) | 相机光圈模式。 光圈模式确定驱动相机光圈的值。 如果光圈模式是 HorizAndVert、Horizontal 或 Vertical，则使用视野。 如果光圈模式为FocalLength，则使用焦距。 |
| [CurveDimension](./curvedimension) | 曲线的尺寸。 |
| [LightType](./lighttype) | 灯光类型. |
| [MappingMode](./mappingmode) | 确定元素如何映射到表面。 的[`MappingMode`](../aspose.threed.entities/mappingmode)定义如何[`VertexElement`](../aspose.threed.entities/vertexelement)映射到几何体的表面。 |
| [NurbsType](./nurbstype) | NURBS 类型。 |
| [PatchDirectionType](./patchdirectiontype) | 面片方向的类型。 |
| [ProjectionType](./projectiontype) | 相机的投影类型。 |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](../aspose.threed.entities/referencemode)定义映射信息如何存储和引用。 |
| [RotationMode](./rotationmode) | 截锥体的旋转模式 |
| [SkeletonType](./skeletontype) | [`Skeleton`](../aspose.threed.entities/skeleton) s 类型. |
| [SplitMeshPolicy](./splitmeshpolicy) | 在子网格之间共享顶点/控制点数据或每个子网格都有自己的压缩数据。 |
| [TextureMapping](./texturemapping) | 的纹理映射类型[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) 描述使用哪种纹理映射。 |
| [VertexElementType](./vertexelementtype) | 顶点元素的类型，定义了它将如何在建模中使用。 |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
