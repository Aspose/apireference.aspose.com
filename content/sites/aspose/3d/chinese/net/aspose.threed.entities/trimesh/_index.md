---
title: TriMesh
second_title: Aspose.3D for .NET API 参考
description: TriMesh 包含 GPU 可以直接使用的原始数据 此类是一个实用程序可帮助构建仅包含每个顶点数据的网格
type: docs
weight: 730
url: /zh/net/aspose.threed.entities/trimesh/
---
## TriMesh class

TriMesh 包含 GPU 可以直接使用的原始数据。 此类是一个实用程序，可帮助构建仅包含每个顶点数据的网格。

```csharp
public class TriMesh : Entity, IEnumerable<Vertex>
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [TriMesh](trimesh)(string, VertexDeclaration) | 初始化[`TriMesh`](../trimesh) |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity) { get; } | 预分配顶点的容量。 |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | 获取或设置是否在导出时排除该实体。 |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount) { get; } | 此[`TriMesh`](../trimesh) |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | 获取或设置名称。 |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | 获取或设置第一个父节点，如果设置了第一个父节点，该实体将与其他父节点分离。 |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | 获取所有父节点，一个实体可以附加到多个父节点进行几何实例化 |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | 获取所有属性的集合。 |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | 获取该对象所属的场景 |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount) { get; } | 由[`BeginVertex`](./beginvertex)和M传入的未合并顶点的计数:Aspose.ThreeD.Entities.TriMesh.EndVertex。 |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration) { get; } | [`TriMesh`](../trimesh)的顶点布局。 |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount) { get; } | 此[`TriMesh`](../trimesh) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes) { get; } | 所有顶点的总大小（以字节为单位） |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [CopyFrom](../../aspose.threed.entities/trimesh/copyfrom)(TriMesh, VertexDeclaration) | 复制 [`TriMesh`](../trimesh) 来自具有新顶点布局的输入 |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh#frommesh)(Mesh, bool) | 从给定的网格对象创建一个 TriMesh，顶点声明基于输入网格的结构。 |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh#frommesh_1)(VertexDeclaration, Mesh) | 从具有给定顶点布局的给定网格对象创建 TriMesh。 |
| static [FromRawData](../../aspose.threed.entities/trimesh/fromrawdata)(VertexDeclaration, byte[], int[], bool) | 从原始数据创建 TriMesh |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex)() | 开始添加顶点 |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex)() | 结束添加顶点 |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | 查找属性。 可以是动态属性（由 CreateDynamicProperty/SetProperty 创建） 或本机属性（由其名称标识） |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | 获取当前实体在其对象空间坐标系中的边界框。 |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | 获取在渲染器中注册的实体渲染器的key |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator)() | 获取枚举器枚举[`Vertex`](../../aspose.threed.utilities/vertex) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | 获取指定属性的值 |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray#indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray#indicestoarray_1)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes)(byte[]) | 从字节加载顶点，字节长度必须是顶点大小的整数倍。 |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble)(int, VertexField) | 读取双字段 |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat)(int, VertexField) | 读取浮点字段 |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2)(int, VertexField) | 读取vector2字段 |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3)(int, VertexField) | 读取vector3字段 |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4)(int, VertexField) | 读取vector4字段 |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2)(int, VertexField) | 读取vector2字段 |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3)(int, VertexField) | 读取vector3字段 |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4)(int, VertexField) | 读取vector4字段 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | 删除动态属性。 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | 删除名称标识的指定属性 |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | 设置指定属性的值 |
| override [ToString](../../aspose.threed.entities/trimesh/tostring)() | 获取字符串表示 [`TriMesh`](../trimesh) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray)() | 将顶点数据转换为字节数组 |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto)(Stream) | 将索引数据作为 16 位整数写入流 |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto)(Stream) | 将索引数据作为 32 位整数写入流 |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto)(Stream) | 将顶点数据写入指定流 |

### 也可以看看

* class [Entity](../../aspose.threed/entity)
* class [Vertex](../../aspose.threed.utilities/vertex)
* 命名空间 [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* 部件 [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
