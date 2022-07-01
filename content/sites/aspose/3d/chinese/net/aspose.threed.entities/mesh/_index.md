---
title: Mesh
second_title: Aspose.3D for .NET API 参考
description: 网格由许多 n 边多边形组成
type: docs
weight: 450
url: /zh/net/aspose.threed.entities/mesh/
---
## Mesh class

网格由许多 n 边多边形组成。

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Mesh](mesh#constructor)() | 初始化[`Mesh`](../mesh)类的新实例。 |
| [Mesh](mesh#constructor_1)(Bitmap) | 使用指定的高度图构造一个网格， 如果高度图的像素格式包含多个组件，第一个（通常是红色）组件将是用作高度值(z) 控制点的 x 和 y 分量是归一化的像素坐标。 |
| [Mesh](mesh#constructor_4)(string) | 初始化[`Mesh`](../mesh)类的新实例。 |
| [Mesh](mesh#constructor_2)(Bitmap, Matrix4) | 使用指定的高度图构造一个网格， 如果高度图的像素格式包含多个组件，第一个（通常是红色）组件将是用作高度值(z) 控制点的 x 和 y 分量是归一化的像素坐标。 |
| [Mesh](mesh#constructor_3)(Bitmap, bool, Matrix4) | 使用指定的高度图构造一个网格， 如果高度图的像素格式包含多个组件，第一个（通常是红色）组件将是用作高度值(z) 控制点的 x 和 y 分量是归一化的像素坐标。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | 获取或设置此几何是否可以投射阴影 |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | 获取所有控制点 |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | 获取与此几何体关联的所有变形器。 |
| [Edges](../../aspose.threed.entities/mesh/edges) { get; } | 获取网格的边缘。 Edge 在网格中是可选的，所以它可以是空的。 |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | 获取或设置是否在导出时排除该实体。 |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | 获取或设置名称。 |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | 获取或设置第一个父节点，如果设置了第一个父节点，该实体将与其他父节点分离。 |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | 获取所有父节点，一个实体可以附加到多个父节点进行几何实例化 |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount) { get; } | 获取多边形数量 |
| [Polygons](../../aspose.threed.entities/mesh/polygons) { get; } | 获取网格的多边形定义 |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | 获取所有属性的集合。 |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | 获取或设置此几何体是否可以接收阴影。 |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | 获取该对象所属的场景 |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | 获取所有顶点元素 |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | 获取或设置几何是否可见 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | 将现有顶点元素添加到当前几何体 |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | 创建具有指定类型的顶点元素并将其添加到几何图形中。 |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | 创建具有指定类型的顶点元素并将其添加到几何图形中。 |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | 创建具有给定纹理映射类型的[`VertexElementUV`](../vertexelementuv)。 |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | 创建具有给定纹理映射类型的[`VertexElementUV`](../vertexelementuv)。 |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_2)(int[]) | 使用*indices*中定义的所有顶点创建一个新多边形。 要逐个顶点创建多边形顶点，请使用[`PolygonBuilder`](../polygonbuilder)。 |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon)(int, int, int) | 创建一个具有 3 个顶点（三角形）的多边形 |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_3)(int[], int, int) | 使用*indices*中定义的所有顶点创建一个新多边形。 要逐个顶点创建多边形顶点，请使用[`PolygonBuilder`](../polygonbuilder)。 |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_1)(int, int, int, int) | 创建一个有 4 个顶点的多边形（四边形） |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | 查找属性。 可以是动态属性（由 CreateDynamicProperty/SetProperty 创建） 或本机属性（由其名称标识） |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | 获取当前实体在其对象空间坐标系中的边界框。 |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | 获取指定类型的顶点元素 |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | 获取在渲染器中注册的实体渲染器的key |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator)() | 获取每个内部多边形的枚举器。 |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize)(int) | 获取指定多边形的顶点数。 |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | 获取指定属性的值 |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | 得到一个 [`VertexElementUV`](../vertexelementuv) 具有给定纹理映射类型的实例 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | 删除动态属性。 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | 删除名称标识的指定属性 |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | 设置指定属性的值 |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh)() | 从当前实体获取 Mesh 实例。 |

### 例子

在网格中添加多边形: 穿过网格中的所有多边形:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    //处理多边形
}
```

### 也可以看看

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* 命名空间 [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* 部件 [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
