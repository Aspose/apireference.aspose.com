---
title: TriMeshT
second_title: Aspose.3D for.NETAPIリファレンス
description: の汎用バージョンTriMesh./trimesh/ユーザーの静的定義頂点 type
type: docs
weight: 740
url: /ja/net/aspose.threed.entities/trimesh-1/
---
## TriMesh&lt;T&gt; class

の汎用バージョン[`TriMesh`](../trimesh/)ユーザーの静的定義頂点 type

```csharp
public class TriMesh<T> : TriMesh
    where T : struct
```

| パラメータ | 説明 |
| --- | --- |
| T |  |

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [TriMesh](trimesh/)(string) | のインスタンスを初期化します[`TriMesh`](../trimesh/) |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity/) { get; } | 事前に割り当てられた頂点の容量. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | エクスポート中にこのエンティティを除外するかどうかを取得または設定します。 |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount/) { get; } | この中のインデックスの数[`TriMesh`](../trimesh/) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | 名前を取得または設定します。 |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | 最初の親ノードを取得または設定します。最初の親ノードを設定すると、このエンティティは他の親ノードから切り離されます。 |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | すべての親ノードを取得します。ジオメトリのインスタンス化のためにエンティティを複数の親ノードにアタッチできます |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | すべてのプロパティのコレクションを取得します。 |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | このオブジェクトが属するシーンを取得します |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount/) { get; } | によって渡されたマージされていない頂点の数[`BeginVertex`](../trimesh/beginvertex/)と[`EndVertex`](../trimesh/endvertex/). |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration/) { get; } | の頂点レイアウト[`TriMesh`](../trimesh/). |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount/) { get; } | この中の頂点の数[`TriMesh`](../trimesh/) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes/) { get; } | バイト単位のすべての頂点の合計サイズ |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [FromMesh](../../aspose.threed.entities/trimesh-1/frommesh/)(Mesh) | 自動的に生成された頂点レイアウトを使用して、指定されたメッシュ オブジェクトから TriMesh を作成します。 |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex/)() | 頂点の追加を開始 |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex/)() | 頂点追加終了 |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | プロパティを検索します。 動的プロパティ (CreateDynamicProperty/SetProperty で作成) またはネイティブ プロパティ (名前で識別) を指定できます。 |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | オブジェクト空間座標系で現在のエンティティの境界ボックスを取得します. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | レンダラーに登録されているエンティティ レンダラーのキーを取得します |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator/)() | 列挙する列挙子を取得します[`Vertex`](../../aspose.threed.utilities/vertex/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | 指定したプロパティの値を取得 |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes/)(byte[]) | バイトから頂点をロードします。バイトの長さは、頂点サイズの整数倍でなければなりません。 |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble/)(int, VertexField) | double フィールドを読み取ります |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat/)(int, VertexField) | float フィールドを読み取ります |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2/)(int, VertexField) | vector2 フィールドを読み取ります |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3/)(int, VertexField) | vector3 フィールドを読み取ります |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4/)(int, VertexField) | vector4 フィールドを読み取ります |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2/)(int, VertexField) | vector2 フィールドを読み取ります |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3/)(int, VertexField) | vector3 フィールドを読み取ります |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4/)(int, VertexField) | vector4 フィールドを読み取ります |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | 動的プロパティを削除します。 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | name で識別される指定されたプロパティを削除します |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | 指定されたプロパティの値を設定します |
| override [ToString](../../aspose.threed.entities/trimesh/tostring/)() | の文字列表現を取得します[`TriMesh`](../trimesh/) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray/)() | 頂点データをバイト配列に変換 |
| [VerticesToTypedArray](../../aspose.threed.entities/trimesh-1/verticestotypedarray/)() | 頂点データを型付き配列に変換します |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto/)(Stream) | インデックス データを 16 ビット整数としてストリームに書き込みます |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto/)(Stream) | インデックス データを 32 ビット整数としてストリームに書き込みます |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto/)(Stream) | 指定したストリームに頂点データを書き込みます |

### 関連項目

* class [TriMesh](../trimesh/)
* 名前空間 [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* 組み立て [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
