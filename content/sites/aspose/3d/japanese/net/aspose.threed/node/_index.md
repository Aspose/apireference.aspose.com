---
title: Node
second_title: Aspose.3D for.NETAPIリファレンス
description: シーン グラフの要素を表します シーン グラフはノード オブジェクトのツリーですツリー管理サービスはこのクラスに含まれています Aspose.3D SDK は構築されたシーン グラフの有効性をテストしないことに注意してくださいノード階層で巡回グラフが生成されないようにするのは呼び出し元の責任です ツリー管理に加えてこのクラスはシーン内のオブジェクトの位置を記述するために必要なすべてのプロパティを定義しますこの情報には基本的な TranslationRotationおよび Scaling プロパティと剛性や減衰などのピボット制限および IK ジョイント アトリビュートのより高度なオプションが含まれます位置情報のみを含むグラフィック表現のないオブジェクトこの状態ではノード ツリー構造で親を表すために使用できますがそれ以上のことはできませんこのタイプのオブジェクトの通常の使用法はノードを特殊化するエンティティを追加することです エンティティを参照 エンティティはそれ自体がオブジェクトでありノードに接続されていますこれは同じエンティティを複数のノード間で共有できることも意味しますカメラライトメッシュなどはすべてエンティティでありそれらはすべて基本クラス Entity. から派生しています
type: docs
weight: 1470
url: /ja/net/aspose.threed/node/
---
## Node class

シーン グラフの要素を表します。 シーン グラフはノード オブジェクトのツリーです。ツリー管理サービスは、このクラスに含まれています。 Aspose.3D SDK は、構築されたシーン グラフの有効性をテストしないことに注意してください。ノード階層で巡回グラフが生成されないようにするのは呼び出し元の責任です。 ツリー管理に加えて、このクラスはシーン内のオブジェクトの位置を記述するために必要なすべてのプロパティを定義します。この情報には、基本的な Translation、Rotation、および Scaling プロパティと、剛性や減衰などのピボット、制限、および IK ジョイント アトリビュートのより高度なオプションが含まれます。位置情報のみを含むグラフィック表現のないオブジェクト)。この状態では、ノード ツリー構造で親を表すために使用できますが、それ以上のことはできません。このタイプのオブジェクトの通常の使用法は、ノードを特殊化するエンティティを追加することです (「エンティティ」を参照)。 エンティティはそれ自体がオブジェクトであり、ノードに接続されています。これは、同じエンティティを複数のノード間で共有できることも意味します。カメラ、ライト、メッシュなどはすべてエンティティであり、それらはすべて基本クラス Entity. から派生しています。

```csharp
public class Node : SceneObject
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Node](node/#constructor)() | の新しいインスタンスを初期化します`Node`class. |
| [Node](node/#constructor_1)(string) | の新しいインスタンスを初期化します`Node`class. |
| [Node](node/#constructor_2)(string, Entity) | の新しいインスタンスを初期化します`Node`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo/) { get; set; } | ノードごとのアセット info |
| [ChildNodes](../../aspose.threed/node/childnodes/) { get; } | 子ノードを取得します。 |
| [Entities](../../aspose.threed/node/entities/) { get; } | すべてのノード エンティティを取得します。 |
| [Entity](../../aspose.threed/node/entity/) { get; set; } | このノードにアタッチされた最初のエンティティを取得または設定します。設定すると、他のエンティティがクリアされます。 |
| [Excluded](../../aspose.threed/node/excluded/) { get; set; } | エクスポート中にこのノードとすべての子ノード/エンティティを除外するかどうかを取得または設定します. |
| [GlobalTransform](../../aspose.threed/node/globaltransform/) { get; } | グローバル変換を取得します。 |
| [Material](../../aspose.threed/node/material/) { get; set; } | このノードに関連付けられた最初のマテリアルを取得または設定します。設定すると、他のマテリアルがクリアされます |
| [Materials](../../aspose.threed/node/materials/) { get; } | このノードに関連付けられたマテリアルを取得します。 |
| [MetaDatas](../../aspose.threed/node/metadatas/) { get; } | このノードで定義されているメタ データを取得します。 |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | 名前を取得または設定します。 |
| [ParentNode](../../aspose.threed/node/parentnode/) { get; set; } | 親ノードを取得または設定します。 |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | すべてのプロパティのコレクションを取得します。 |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | このオブジェクトが属するシーンを取得します |
| [Transform](../../aspose.threed/node/transform/) { get; } | ローカル変換を取得します。 |
| [Visible](../../aspose.threed/node/visible/) { get; set; } | node を表示するように取得または設定します |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Accept](../../aspose.threed/node/accept/)(NodeVisitor) | すべての子孫ノード (現在のノードを含む) をウォークスルーし、そのノードでビジターを呼び出します。 |
| [AddChildNode](../../aspose.threed/node/addchildnode/)(Node) | このノードに子ノードを追加します |
| [AddEntity](../../aspose.threed/node/addentity/)(Entity) | ノードにエンティティを追加します。 |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode)() | 子ノードを作成 |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_1)(Entity) | 指定されたエンティティで新しい子ノードを作成します attach |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_2)(string) | 指定したノード名で新しい子ノードを作成します |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_3)(string, Entity) | 指定したノード名で新しい子ノードを作成します |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_4)(string, Entity, Material) | 指定されたノード名で新しい子ノードを作成し、指定されたエンティティとマテリアルをアタッチします |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform/)(bool) | グローバル変換を評価し、幾何学的変換を含めるかどうかを指定します。 |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | プロパティを検索します。 動的プロパティ (CreateDynamicProperty/SetProperty で作成) またはネイティブ プロパティ (名前で識別) を指定できます。 |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox/)() | node の境界ボックスを計算します |
| [GetChild](../../aspose.threed/node/getchild/#getchild)(int) | 指定されたインデックスの子ノードを取得します。 |
| [GetChild](../../aspose.threed/node/getchild/#getchild_1)(string) | 指定した名前の子ノードを取得します |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity/)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | 指定したプロパティの値を取得 |
| [Merge](../../aspose.threed/node/merge/)(Node) | ノードの下のすべてを切り離し、それらを現在のノードに接続します。 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | 動的プロパティを削除します。 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | name で識別される指定されたプロパティを削除します |
| [SelectObjects](../../aspose.threed/node/selectobjects/)(string) | XPath に似たクエリ構文を使用して、現在のノードの下にある複数のオブジェクトを選択します。 |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject/)(string) | XPath に似たクエリ構文を使用して、現在のノードの下にある単一のオブジェクトを選択します。 |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | 指定されたプロパティの値を設定します |
| override [ToString](../../aspose.threed/node/tostring/)() | このノードの文字列表現を取得します。 |

### 関連項目

* class [SceneObject](../sceneobject/)
* 名前空間 [Aspose.ThreeD](../../aspose.threed/)
* 組み立て [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
