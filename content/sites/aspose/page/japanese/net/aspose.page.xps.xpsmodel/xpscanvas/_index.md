---
title: Class XpsCanvas
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsModel.XpsCanvas クラス. Canvas 要素の機能をカプセル化するクラス この要素は要素をグループ化しますたとえばGlyphs および Path 要素 をキャンバスでグループ化してハイパーリンク先として ユニットとして識別したり を構成したプロパティ値を各子および先祖要素に適用したりできます
type: docs
weight: 2970
url: /ja/net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

Canvas 要素の機能をカプセル化するクラス。 この要素は、要素をグループ化します。たとえば、Glyphs および Path 要素 をキャンバスでグループ化して、(ハイパーリンク先として) ユニットとして識別したり、 を構成したプロパティ値を各子および先祖要素に適用したりできます。

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | 要素のレンダリング領域を制限するパス ジオメトリ インスタンスを返す/設定します。 |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | 子要素の数を返します。 |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | キャンバス内のパスの端がどのようにレンダリングされるかを制御する値を返す/設定します. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | ハイパーリンク ターゲット オブジェクトを返す/設定します。 |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | インデックスによる要素の子へのアクセスを提供します*i*. |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | 要素の均一な透明度を定義する値を返す/設定します. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | 不透明度属性 と同じ方法で要素に適用されるアルファ値 のマスクを指定するブラシを返す/設定しますが、要素の異なる領域に対して異なるアルファ値を許可します。 |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | 要素のすべての属性とすべての子要素 (存在する場合) の新しい座標 frame を確立するアフィン変換マトリックスを返す/設定します. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | このキャンバスの子リストに要素を追加します。 |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | 新しいキャンバスをこのキャンバスの子リストに追加します。 |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | 新しいグリフをこのキャンバスの子リストに追加します。 |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | このキャンバスの子リストに新しいパスを追加します. |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | このキャンバスを複製します。 |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | の実装IEnumerableインターフェイス. |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | このキャンバスの子リストに要素を挿入します*index*位置. |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | 新しいキャンバスをこのキャンバスの子リストに挿入します*index*位置. |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | 新しいグリフをこのキャンバスの子リストに挿入します*index*位置. |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | このキャンバスの子リストへの新しいパスを挿入します*index*位置. |

### 関連項目

* class [XpsContentElement](../xpscontentelement/)
* 名前空間 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 組み立て [Aspose.Page](../../)


