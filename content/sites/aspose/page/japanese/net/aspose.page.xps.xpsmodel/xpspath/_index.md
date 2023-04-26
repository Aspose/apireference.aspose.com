---
title: Class XpsPath
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsModel.XpsPath クラス. パス要素の機能をカプセル化するクラス. この要素は固定ページにベクトル グラフィックと画像を追加する唯一の手段です. ページにレンダリングされる単一のベクトル グラフィックを定義します.
type: docs
weight: 3260
url: /ja/net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

パス要素の機能をカプセル化するクラス. この要素は、固定ページにベクトル グラフィックと画像を追加する唯一の手段です. ページにレンダリングされる単一のベクトル グラフィックを定義します.

```csharp
public sealed class XpsPath : XpsContentElement
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | 要素のレンダリング領域を制限するパス ジオメトリ インスタンスを返す/設定します。 |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | 子要素の数を返します。 |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data/) { get; set; } | パスのジオメトリを返す/設定します。 |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill/) { get; set; } | パスの Data プロパティによって指定された ジオメトリをペイントするために使用されるブラシを返す/設定します. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | ハイパーリンク ターゲット オブジェクトを返す/設定します。 |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | インデックスによる要素の子へのアクセスを提供します*i*. |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | 要素の均一な透明度を定義する値を返す/設定します. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | 不透明度属性 と同じ方法で要素に適用されるアルファ値 のマスクを指定するブラシを返す/設定しますが、要素の異なる領域に対して異なるアルファ値を許可します。 |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | 要素のすべての属性とすべての子要素 (存在する場合) の新しい座標 frame を確立するアフィン変換マトリックスを返す/設定します. |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke/) { get; set; } | ストロークの描画に使用されるブラシを返す/設定します。 |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray/) { get; set; } | アウトライン ストロークのダッシュとギャップの長さを指定する配列を取得または設定します。 |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap/) { get; set; } | 各ダッシュの端の描画方法を指定する値を返す/設定します. |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset/) { get; set; } | 破線配列パターンを繰り返す開始点を返す/設定します。 この値を省略すると、破線配列はストロークの原点に揃えられます。 |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap/) { get; set; } | ストロークの最後のダッシュの終点の形状を定義する値を返す/設定します。 |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin/) { get; set; } | ストロークの最初のダッシュの始まりの形状を定義する値を返す/設定します. |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit/) { get; set; } | 留め継ぎの最大長とストロークの太さの半分の比率を返す/設定します。 この値は、`StrokeLineJoin`属性が指定します`マイター`. |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap/) { get; set; } | ストロークの最初のダッシュの始まりの形状を定義する値を返す/設定します. |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness/) { get; set; } | ストロークの太さを 有効な座標空間 (パスのレンダリング変換を含む) の単位で返す/設定します。 StrokeThickness extends の半分は Data プロパティで指定されたジオメトリの外側に拡張し、残りの半分 はジオメトリの内側に拡張. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone/)() | このパスを複製します。 |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | の実装IEnumerableインターフェイス. |

### 関連項目

* class [XpsContentElement](../xpscontentelement/)
* 名前空間 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 組み立て [Aspose.Page](../../)


