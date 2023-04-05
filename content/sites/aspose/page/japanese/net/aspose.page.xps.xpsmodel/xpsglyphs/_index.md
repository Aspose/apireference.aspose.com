---
title: Class XpsGlyphs
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsModel.XpsGlyphs クラス. Glyphs 要素の機能をカプセル化するクラス この要素は単一のフォントから一様にフォーマットされた一連のテキストを表します 正確なレンダリングに必要な情報を提供しコンシューマーを表示する際の search および選択機能をサポートします
type: docs
weight: 3090
url: /ja/net/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class

Glyphs 要素の機能をカプセル化するクラス。 この要素は、単一のフォントから一様にフォーマットされた一連のテキストを表します。 正確なレンダリングに必要な情報を提供し、コンシューマーを表示する際の search および選択機能をサポートします。

```csharp
public sealed class XpsGlyphs : XpsContentElement
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [BidiLevel](../../aspose.page.xps.xpsmodel/xpsglyphs/bidilevel/) { get; set; } | Unicode アルゴリズムの双方向のネスティング レベルを指定する値を返す/設定します。 偶数の値は左から右のレイアウトを意味し、奇数の値は右から左のレイアウトを意味します。 右から左のレイアウトは実行原点を右側に配置します。最初のグリフの を正の送り幅 (左への送りを表す) で、後続の グリフを前のグリフの左側に配置する. |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | 要素のレンダリング領域を制限するパス ジオメトリ インスタンスを返す/設定します。 |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | 子要素の数を返します。 |
| [Fill](../../aspose.page.xps.xpsmodel/xpsglyphs/fill/) { get; set; } | レンダリングされたグリフの形状を塗りつぶすために使用されるブラシを返す/設定します. |
| [Font](../../aspose.page.xps.xpsmodel/xpsglyphs/font/) { get; } | 要素テキストのタイプセットに使用される TrueType フォントのフォント リソースを返します。 |
| [FontRenderingEmSize](../../aspose.page.xps.xpsmodel/xpsglyphs/fontrenderingemsize/) { get; set; } | 有効座標空間の単位で float として表される描画面単位のフォント サイズを返す/設定します。 |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | ハイパーリンク ターゲット オブジェクトを返す/設定します。 |
| [IsSideways](../../aspose.page.xps.xpsmodel/xpsglyphs/issideways/) { get; set; } | グリフが横向きであることを示す値を返す/設定します。 原点は回転していないグリフの上部中央として定義されます。 |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | インデックスによる要素の子へのアクセスを提供します*i*. |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | 要素の均一な透明度を定義する値を返す/設定します. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | 不透明度属性 と同じ方法で要素に適用されるアルファ値 のマスクを指定するブラシを返す/設定しますが、要素の異なる領域に対して異なるアルファ値を許可します。 |
| [OriginX](../../aspose.page.xps.xpsmodel/xpsglyphs/originx/) { get; set; } | ランの最初のグリフの x 座標 を有効な座標空間の単位で返す/設定します. |
| [OriginY](../../aspose.page.xps.xpsmodel/xpsglyphs/originy/) { get; set; } | run の最初のグリフの y 座標を返す/設定します 有効な座標空間の単位で. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | 要素のすべての属性とすべての子要素 (存在する場合) の新しい座標 frame を確立するアフィン変換マトリックスを返す/設定します. |
| [StyleSimulations](../../aspose.page.xps.xpsmodel/xpsglyphs/stylesimulations/) { get; set; } | スタイル シミュレーションを指定する値を返す/設定します。 |
| [UnicodeString](../../aspose.page.xps.xpsmodel/xpsglyphs/unicodestring/) { get; set; } | Glyphs 要素によってレンダリングされるテキストの文字列を返す/設定します。 テキストは Unicode コード ポイントとして指定されます。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsglyphs/clone/)() | このグリフを複製します。 |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | の実装IEnumerableインターフェイス. |

### 関連項目

* class [XpsContentElement](../xpscontentelement/)
* 名前空間 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 組み立て [Aspose.Page](../../)


