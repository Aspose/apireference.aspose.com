---
title: Aspose.ThreeD.Entities
second_title: Aspose.3D for .NET API 参考
description: 所有几何体和实体都在此命名空间中定义
type: docs
weight: 40
url: /zh/net/aspose.threed.entities/
---
所有几何体和实体都在此命名空间中定义

## 课程

| 班级 | 描述 |
| --- | --- |
| [Box](./box) | 框。 |
| [Camera](./camera) | 相机描述观看者观看场景的眼点。 |
| [Circle](./circle) | A[`Circle`](../aspose.threed.entities/circle)曲线由圆形边缘的一组点组成。 |
| [CompositeCurve](./compositecurve) | A[`CompositeCurve`](../aspose.threed.entities/compositecurve)由多个曲线段组成。 |
| [Curve](./curve) | 所有曲线实现的基类。 |
| [Cylinder](./cylinder) | 参数化气缸。 当radiusTop/radiusBottom 之一为零时，也可以用来表示圆锥。 |
| [Dish](./dish) | 参数化菜。 |
| [Ellipse](./ellipse) | [`Ellipse`](../aspose.threed.entities/ellipse)定义了一组形成椭圆形状的点。 |
| [Frustum](./frustum) | [`Camera`](../aspose.threed.entities/camera)和Entities的基类。光 |
| [Geometry](./geometry) | 所有可渲染几何对象的基类（如[`Mesh`](../aspose.threed.entities/mesh),[`NurbsSurface`](../aspose.threed.entities/nurbssurface),[`Patch`](../aspose.threed.entities/patch)等）。 |
| [Light](./light) | 灯光照亮场景。 |
| [Line](./line) | 多段线是由一组点定义的路径[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints)并通过以下方式连接[`Segments`](../aspose.threed.entities/line/segments), 这意味着它也可以是一组连接的线段。 线通常是一个线性对象，这意味着它不能用来表示曲线，为了表示曲线，使用[`NurbsCurve`](../aspose.threed.entities/nurbscurve). |
| [LinearExtrusion](./linearextrusion) | 线性挤压将 2D 形状作为输入，并在 3rd 维度上扩展该形状。 |
| [Mesh](./mesh) | 网格由许多 n 边多边形组成。 |
| [NurbsCurve](./nurbscurve) | [NURBS 曲线](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) 是用 NURBS(非均匀有理基础样条), NURBS 曲线由其[`Order`](../aspose.threed.entities/nurbscurve/order)一组加权定义[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) 和 a[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors) 控制点中的 w 分量是用作控制点的权重，无论它是TwoDimensional还是ThreeDimensional |
| [NurbsDirection](./nurbsdirection) | 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface)有两个方向，U和[`V`](../aspose.threed.entities/nurbssurface/v)，[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)定义数据每个方向。 一个方向实际上是一条 NURBS 曲线，这意味着它也由它的[`Order`](../aspose.threed.entities/nurbsdirection/order)定义，一个[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors)和一组加权控制点（在[`NurbsSurface`](../aspose.threed.entities/nurbssurface)中定义）。 |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface) 是一个表面，由 [NURBS（非均匀有理基础样条）](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), 一个 [`NurbsSurface`](../aspose.threed.entities/nurbssurface) 由两个定义 [`NurbsDirection`](../aspose.threed.entities/nurbsdirection)[`U`](../aspose.threed.entities/nurbssurface/u) 和 [`V`](../aspose.threed.entities/nurbssurface/v). 控制点中的 w 分量用作控制点的权重，无论方向的类型是 TwoDimensional 或者 ThreeDimensional |
| [Patch](./patch) | A[`Patch`](../aspose.threed.entities/patch)是一个参数化建模曲面，类似于NurbsSurface，它也由两个 [`PatchDirection`](../aspose.threed.entities/patchdirection)定义，[`U`](../aspose.threed.entities/patch/u)和[`V`](../aspose.threed.entities/patch/v)。 但是[`Patch`](../aspose.threed.entities/patch)和NurbsSurface之间的区别是[`PatchDirection`](../aspose.threed.entities/patchdirection)曲线 可以是Bezier之一,QuadraticBezier,BasisSpline,CardinalSpline和Linear |
| [PatchDirection](./patchdirection) | 补丁的 U 和 V 方向。 |
| [Plane](./plane) | 参数化平面。 |
| [PointCloud](./pointcloud) | 点云不包含拓扑信息，只包含控制点和顶点元素。 |
| [PolygonBuilder](./polygonbuilder) | 一个帮助类来构建多边形 [`Mesh`](../aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | 修改多边形的实用程序 |
| [Primitive](./primitive) | 所有原语的基类 |
| [Pyramid](./pyramid) | 参数化金字塔。 |
| [RectangularTorus](./rectangulartorus) | 参数化矩形环面。 |
| [RevolvedAreaSolid](./revolvedareasolid) | 此类通过围绕轴旋转轮廓提供的横截面来表示实体模型。 |
| [Shape](./shape) | 形状描述了一组控制点上的变形，类似于 Maya 中的簇变形器。 例如，我们可以将形状添加到创建的几何图形中。 形状和几何具有相同的拓扑信息，但控制点的位置不同。 几何体具有不同程度的影响，会产生变形效果。 |
| [Skeleton](./skeleton) | [`Skeleton`](../aspose.threed.entities/skeleton)主要用于 CAD 软件帮助设计者操纵骨骼结构的变换，它通常在 CAD 软件之外是无用的。 为了使骨架层次在 CAD 软件中像一个对象一样，需要通过设置将顶部的[`Skeleton`](../aspose.threed.entities/skeleton)节点标记为根节点[`Type`](../aspose.threed.entities/skeleton/type)到Skeleton, 和所有孩子设置为Bone |
| [Sphere](./sphere) | 参数化球体。 |
| [SweptAreaSolid](./sweptareasolid) | A[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid)通过沿准线扫描轮廓来构造几何。 |
| [Torus](./torus) | 参数化圆环。 |
| [TransformedCurve](./transformedcurve) | A[`TransformedCurve`](../aspose.threed.entities/transformedcurve)使用变换矩阵为曲线提供位置。 这允许在[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve)或[`CompositeCurve`](../aspose.threed.entities/compositecurve)中执行转换. |
| [TriMesh](./trimesh) | TriMesh 包含 GPU 可以直接使用的原始数据。 此类是一个实用程序，可帮助构建仅包含每个顶点数据的网格。 |
| [TriMesh&lt;T&gt;](./trimesh-1) | [`TriMesh`](../aspose.threed.entities/trimesh)的通用版本，用于用户静态定义的顶点类型 |
| [TrimmedCurve](./trimmedcurve) | 在两端修剪基础曲线的有界曲线。 |
| [VertexElement](./vertexelement) | 顶点元素的基类。 顶点元素类型由 VertexElementType 标识。 VertexElement 描述了顶点元素如何映射到几何表面以及映射信息如何在内存中排列。 VertexElement 包含法线、UV 或其他类型的信息。 |
| [VertexElementBinormal](./vertexelementbinormal) | 定义指定分量的副法线向量。 |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | 用于定义具体[`VertexElement`](../aspose.threed.entities/vertexelement)实现的帮助类。 |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | 定义指定组件的边缘折痕 |
| [VertexElementHole](./vertexelementhole) | 定义指定多边形是否为孔 |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | 用于定义具体[`VertexElement`](../aspose.threed.entities/vertexelement)实现的帮助类。 |
| [VertexElementMaterial](./vertexelementmaterial) | 定义指定组件的材料索引。 一个节点可以有多种材质，[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial)用于渲染几何的不同部分材料。 |
| [VertexElementNormal](./vertexelementnormal) | 定义指定组件的法线向量。 |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | 为指定的组件定义多边形组以将相关的多边形组合在一起。 |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | 平滑组是多边形网格中的一组多边形，看起来应该形成一个平滑的表面。 一些早期的 3D 建模软件，如 DOS 的 3D studio max 使用平滑组来避免为每个网格顶点存储法线向量。 |
| [VertexElementSpecular](./vertexelementspecular) | 定义指定组件的镜面反射颜色。 |
| [VertexElementTangent](./vertexelementtangent) | 定义指定组件的切向量。 |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | 用于定义具体[`VertexElement`](../aspose.threed.entities/vertexelement)实现的帮助类。 |
| [VertexElementUserData](./vertexelementuserdata) | 定义指定组件的自定义用户数据。 通常它是用于特殊目的的特定于应用程序的数据。 |
| [VertexElementUV](./vertexelementuv) | 定义指定组件的 UV 坐标。 一个几何体可以有多个[`VertexElementUV`](../aspose.threed.entities/vertexelementuv)元素，每个元素都有不同的[`TextureMapping`](../aspose.threed.entities/texturemapping)秒。 |
| [VertexElementVector4](./vertexelementvector4) | 用于定义具体[`VertexElement`](../aspose.threed.entities/vertexelement)实现的帮助类。 |
| [VertexElementVertexColor](./vertexelementvertexcolor) | 定义指定组件的顶点颜色 |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | 定义指定组件的顶点折痕 |
| [VertexElementVisibility](./vertexelementvisibility) | 定义指定组件是否可见 |
| [VertexElementWeight](./vertexelementweight) | 定义指定组件的混合权重。 |
## 接口

| 界面 | 描述 |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement) | VertexElement 与索引数据。 |
| [IMeshConvertible](./imeshconvertible) | 实现此接口的实体可以转换为[`Mesh`](../aspose.threed.entities/mesh) |
| [IOrientable](./iorientable) | 可定向实体应实现此接口。 |
## 枚举

| 枚举 | 描述 |
| --- | --- |
| [ApertureMode](./aperturemode) | 相机光圈模式。 光圈模式决定了驱动相机光圈的值。 如果光圈模式是 HorizAndVert、Horizontal 或 Vertical，则使用视野。 如果光圈模式为FocalLength，则使用焦距。 |
| [CurveDimension](./curvedimension) | 曲线的尺寸。 |
| [LightType](./lighttype) | 灯光类型。 |
| [MappingMode](./mappingmode) | 确定元素如何映射到表面。 [`MappingMode`](../aspose.threed.entities/mappingmode)定义了[`VertexElement`](../aspose.threed.entities/vertexelement)如何映射到表面几何学。 |
| [NurbsType](./nurbstype) | NURBS 类型。 |
| [PatchDirectionType](./patchdirectiontype) | 补丁方向的类型。 |
| [ProjectionType](./projectiontype) | 相机的投影类型。 |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](../aspose.threed.entities/referencemode)定义如何存储和引用映射信息。 |
| [RotationMode](./rotationmode) | 截锥体的旋转模式 |
| [SkeletonType](./skeletontype) | [`Skeleton`](../aspose.threed.entities/skeleton)的类型。 |
| [SplitMeshPolicy](./splitmeshpolicy) | 在子网格之间共享顶点/控制点数据，或者每个子网格都有自己的压缩数据。 |
| [TextureMapping](./texturemapping) | [`VertexElementUV`](../aspose.threed.entities/vertexelementuv) 的纹理映射类型 描述哪种纹理映射用来。 |
| [VertexElementType](./vertexelementtype) | 顶点元素的类型，定义了它在建模中的使用方式。 |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
