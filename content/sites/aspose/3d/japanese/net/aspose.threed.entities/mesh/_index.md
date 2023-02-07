---
title: Mesh
second_title: Aspose.3D for.NETAPIリファレンス
description: メッシュは多数の n 辺のポリゴンで構成されています
type: docs
weight: 450
url: /ja/net/aspose.threed.entities/mesh/
---
## Mesh class

メッシュは多数の n 辺のポリゴンで構成されています。

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Mesh](mesh/#constructor)() | の新しいインスタンスを初期化します`Mesh`class. |
| [Mesh](mesh/#constructor_1)(Bitmap) | 指定された高さマップを使用してメッシュを構築します。 高さマップのピクセル形式に複数のコンポーネントが含まれている場合、最初の (通常は赤) コンポーネントが高さの値として使用されます (z) コントロール ポイントの x および y コンポーネントは正規化されたピクセル座標です. |
| [Mesh](mesh/#constructor_4)(string) | の新しいインスタンスを初期化します`Mesh`class. |
| [Mesh](mesh/#constructor_2)(Bitmap, Matrix4) | 指定された高さマップを使用してメッシュを構築します。 高さマップのピクセル形式に複数のコンポーネントが含まれている場合、最初の (通常は赤) コンポーネントが高さの値として使用されます (z) コントロール ポイントの x および y コンポーネントは正規化されたピクセル座標です. |
| [Mesh](mesh/#constructor_3)(Bitmap, bool, Matrix4) | 指定された高さマップを使用してメッシュを構築します。 高さマップのピクセル形式に複数のコンポーネントが含まれている場合、最初の (通常は赤) コンポーネントが高さの値として使用されます (z) コントロール ポイントの x および y コンポーネントは正規化されたピクセル座標です. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | このジオメトリがシャドウをキャストできるかどうかを取得または設定します |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | すべてのコントロール ポイントを取得します |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | このジオメトリに関連付けられたすべてのデフォーマを取得します。 |
| [Edges](../../aspose.threed.entities/mesh/edges/) { get; } | メッシュのエッジを取得します。エッジはメッシュではオプションなので、空にすることができます. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | エクスポート中にこのエンティティを除外するかどうかを取得または設定します。 |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | 名前を取得または設定します。 |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | 最初の親ノードを取得または設定します。最初の親ノードを設定すると、このエンティティは他の親ノードから切り離されます。 |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | すべての親ノードを取得します。ジオメトリのインスタンス化のためにエンティティを複数の親ノードにアタッチできます |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount/) { get; } | ポリゴンの数を取得します |
| [Polygons](../../aspose.threed.entities/mesh/polygons/) { get; } | メッシュのポリゴン定義を取得します |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | すべてのプロパティのコレクションを取得します。 |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | このジオメトリが影を受け取ることができるかどうかを取得または設定します. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | このオブジェクトが属するシーンを取得します |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | すべての頂点要素を取得します |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | ジオメトリが表示されているかどうかを取得または設定します |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement/)(VertexElement) | 既存の頂点要素を現在のジオメトリに追加します |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType) | 指定されたタイプの頂点要素を作成し、ジオメトリに追加します。 |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType, MappingMode, ReferenceMode) | 指定されたタイプの頂点要素を作成し、ジオメトリに追加します。 |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping) | を作成します[`VertexElementUV`](../vertexelementuv/)指定されたテクスチャ マッピング タイプで. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping, MappingMode, ReferenceMode) | を作成します[`VertexElementUV`](../vertexelementuv/)指定されたテクスチャ マッピング タイプで. |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_2)(int[]) | で定義されたすべての頂点を持つ新しいポリゴンを作成します*indices*. 頂点ごとにポリゴン頂点を作成するには、使用してください[`PolygonBuilder`](../polygonbuilder/). |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon)(int, int, int) | 3頂点のポリゴン(三角形)を作成 |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_3)(int[], int, int) | で定義されたすべての頂点を持つ新しいポリゴンを作成します*indices*. 頂点ごとにポリゴン頂点を作成するには、使用してください[`PolygonBuilder`](../polygonbuilder/). |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_1)(int, int, int, int) | 頂点が 4 つあるポリゴンを作成します (quad) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | プロパティを検索します。 動的プロパティ (CreateDynamicProperty/SetProperty で作成) またはネイティブ プロパティ (名前で識別) を指定できます。 |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | オブジェクト空間座標系で現在のエンティティの境界ボックスを取得します. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | 指定した type の頂点要素を取得します |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | レンダラーに登録されているエンティティ レンダラーのキーを取得します |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator/)() | 各内側ポリゴンの列挙子を取得します。 |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize/)(int) | 指定したポリゴンの頂点数を取得します。 |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | 指定したプロパティの値を取得 |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | を取得します[`VertexElementUV`](../vertexelementuv/)指定されたテクスチャ マッピング type を持つインスタンス |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | 動的プロパティを削除します。 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | name で識別される指定されたプロパティを削除します |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | 指定されたプロパティの値を設定します |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh/)() | 現在のエンティティから Mesh インスタンスを取得します. |

### 例

メッシュにポリゴンを追加するには: メッシュ内のすべてのポリゴンを移動:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    //ポリゴンを扱う
}
```

### 関連項目

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* 名前空間 [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* 組み立て [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
