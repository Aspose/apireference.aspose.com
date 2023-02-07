---
title: Scene
second_title: Aspose.3D for.NETAPIリファレンス
description: シーンはノードジオメトリマテリアルテクスチャアニメーションポーズサブシーンなどを含む最上位のオブジェクトです シーンはサブシーンを持つことができcollada/blender などのファイルで複数ドキュメントのサポートとして機能します /fbx ノード階層には以下からアクセスできますRootNode./scene/rootnode/Library./scene/library/ライブラリとして使用できるようにシリアル化中にアタッチされていないオブジェクト メタデータやカスタム オブジェクトなど の参照を保持するために使用されます
type: docs
weight: 2250
url: /ja/net/aspose.threed/scene/
---
## Scene class

シーンは、ノード、ジオメトリ、マテリアル、テクスチャ、アニメーション、ポーズ、サブシーンなどを含む最上位のオブジェクトです。 シーンはサブシーンを持つことができ、collada/blender などのファイルで複数ドキュメントのサポートとして機能します。 /fbx ノード階層には以下からアクセスできます[`RootNode`](./rootnode/)[`Library`](./library/)ライブラリとして使用できるように、シリアル化中にアタッチされていないオブジェクト (メタデータやカスタム オブジェクトなど) の参照を保持するために使用されます。

```csharp
public class Scene : SceneObject
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Scene](scene/#constructor)() | の新しいインスタンスを初期化します`Scene`class. |
| [Scene](scene/#constructor_1)(Entity) | の新しいインスタンスを初期化します`Scene`新しいノードに接続されたエンティティを持つクラス. |
| [Scene](scene/#constructor_2)(Scene, string) | の新しいインスタンスを初期化します`Scene`サブシーンとしてクラス. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips/) { get; } | すべて取得[`AnimationClip`](../../aspose.threed.animation/animationclip/)シーンで定義. |
| [AssetInfo](../../aspose.threed/scene/assetinfo/) { get; set; } | 最上位の資産情報を取得または設定します |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip/) { get; set; } | アクティブな[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [Library](../../aspose.threed/scene/library/) { get; } | シーン階層で直接使用されないオブジェクトは、ライブラリで定義できます. これは、サブシーンを使用していて、サブシーンの下に再利用可能なコンポーネントを配置する場合に役立ちます. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | 名前を取得または設定します。 |
| [Poses](../../aspose.threed/scene/poses/) { get; } | すべて取得[`Pose`](../pose/)このシーンで使用. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | すべてのプロパティのコレクションを取得します。 |
| [RootNode](../../aspose.threed/scene/rootnode/) { get; } | シーンのルート ノードを取得します。 |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | このオブジェクトが属するシーンを取得します |
| [SubScenes](../../aspose.threed/scene/subscenes/) { get; } | すべてのサブシーンを取得します |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile)(string) | 指定されたパスからシーンを開きます |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_3)(string, CancellationToken) | 指定されたパスからシーンを開きます |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_1)(string, FileFormat, CancellationToken) | 指定されたファイル形式を使用して、指定されたパスからシーンを開きます。 |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_2)(string, LoadOptions, CancellationToken) | 指定されたファイル形式を使用して、指定されたパスからシーンを開きます。 |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_2)(Stream, CancellationToken) | 指定されたストリームからシーンを開きます |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream)(Stream, FileFormat, CancellationToken) | 指定されたファイル形式を使用して、指定されたストリームからシーンを開きます。 |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_1)(Stream, LoadOptions, CancellationToken) | 指定された IO config. を使用して、指定されたストリームからシーンを開きます |
| [Clear](../../aspose.threed/scene/clear/)() | シーン コンテンツをクリアし、デフォルト設定を復元します。 |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip/)(string) | を作成および登録する省略関数[`AnimationClip`](../../aspose.threed.animation/animationclip/) 最初の[`AnimationClip`](../../aspose.threed.animation/animationclip/)に割り当てられます[`CurrentAnimationClip`](./currentanimationclip/) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | プロパティを検索します。 動的プロパティ (CreateDynamicProperty/SetProperty で作成) またはネイティブ プロパティ (名前で識別) を指定できます。 |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip/)(string) | 名前付きを取得します[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | 指定したプロパティの値を取得 |
| [Open](../../aspose.threed/scene/open/#open)(Stream) | 指定されたストリームからシーンを開きます |
| [Open](../../aspose.threed/scene/open/#open_4)(string) | 指定されたパスからシーンを開きます |
| [Open](../../aspose.threed/scene/open/#open_3)(Stream, CancellationToken) | 指定されたストリームからシーンを開きます |
| [Open](../../aspose.threed/scene/open/#open_8)(string, CancellationToken) | 指定されたパスからシーンを開きます |
| [Open](../../aspose.threed/scene/open/#open_6)(string, LoadOptions) | 指定されたファイル形式を使用して、指定されたパスからシーンを開きます。 |
| [Open](../../aspose.threed/scene/open/#open_1)(Stream, FileFormat, CancellationToken) | 指定されたファイル形式を使用して、指定されたストリームからシーンを開きます。 |
| [Open](../../aspose.threed/scene/open/#open_2)(Stream, LoadOptions, CancellationToken) | 指定された IO config. を使用して、指定されたストリームからシーンを開きます |
| [Open](../../aspose.threed/scene/open/#open_5)(string, FileFormat, CancellationToken) | 指定されたファイル形式を使用して、指定されたパスからシーンを開きます。 |
| [Open](../../aspose.threed/scene/open/#open_7)(string, LoadOptions, CancellationToken) | 指定されたファイル形式を使用して、指定されたパスからシーンを開きます。 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | 動的プロパティを削除します。 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | name で識別される指定されたプロパティを削除します |
| [Render](../../aspose.threed/scene/render/#render)(Camera, Bitmap) | 指定されたカメラの視点からシーンをビットマップにレンダリングします. |
| [Render](../../aspose.threed/scene/render/#render_2)(Camera, string) | 指定されたカメラの視点からシーンを外部ファイルにレンダリングします。 デフォルトの出力サイズは 1024x768 で、出力形式は png です。 |
| [Render](../../aspose.threed/scene/render/#render_1)(Camera, Bitmap, ImageRenderOptions) | 指定されたカメラの視点からシーンをビットマップにレンダリングします. |
| [Render](../../aspose.threed/scene/render/#render_3)(Camera, string, Size, ImageFormat) | 指定されたカメラの視点からシーンを外部ファイルにレンダリングします。 |
| [Render](../../aspose.threed/scene/render/#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | 指定されたカメラの視点からシーンを外部ファイルにレンダリングします。 |
| [Save](../../aspose.threed/scene/save/#save_4)(string) | 指定されたファイル形式を使用して指定されたパスにシーンを保存します。 |
| [Save](../../aspose.threed/scene/save/#save)(Stream, FileFormat) | 指定したファイル形式を使用してストリームにシーンを保存します。 |
| [Save](../../aspose.threed/scene/save/#save_2)(Stream, SaveOptions) | 指定したファイル形式を使用してストリームにシーンを保存します。 |
| [Save](../../aspose.threed/scene/save/#save_5)(string, FileFormat) | 指定されたファイル形式を使用して指定されたパスにシーンを保存します。 |
| [Save](../../aspose.threed/scene/save/#save_7)(string, SaveOptions) | 指定されたファイル形式を使用して指定されたパスにシーンを保存します。 |
| [Save](../../aspose.threed/scene/save/#save_1)(Stream, FileFormat, CancellationToken) | 指定したファイル形式を使用してストリームにシーンを保存します。 |
| [Save](../../aspose.threed/scene/save/#save_3)(Stream, SaveOptions, CancellationToken) | 指定したファイル形式を使用してストリームにシーンを保存します。 |
| [Save](../../aspose.threed/scene/save/#save_6)(string, FileFormat, CancellationToken) | 指定されたファイル形式を使用して指定されたパスにシーンを保存します。 |
| [Save](../../aspose.threed/scene/save/#save_8)(string, SaveOptions, CancellationToken) | 指定されたファイル形式を使用して指定されたパスにシーンを保存します。 |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | 指定されたプロパティの値を設定します |

### 関連項目

* class [SceneObject](../sceneobject/)
* 名前空間 [Aspose.ThreeD](../../aspose.threed/)
* 組み立て [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
