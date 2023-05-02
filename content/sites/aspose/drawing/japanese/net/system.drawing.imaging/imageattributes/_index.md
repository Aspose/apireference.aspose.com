---
title: Class ImageAttributes
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Imaging.ImageAttributes クラス. レンダリング中にビットマップとメタファイルの色がどのように操作されるかについての情報が含まれています.
type: docs
weight: 740
url: /ja/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

レンダリング中にビットマップとメタファイルの色がどのように操作されるかについての情報が含まれています.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [ImageAttributes](imageattributes/)() | の新しいインスタンスを初期化します`ImageAttributes`class. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable/)() | このブラシ カラー リマップ テーブルをクリアしますImageAttributesobject. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey)() | デフォルト カテゴリのカラー キー (透明度範囲) をクリアします。 |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey_1)(ColorAdjustType) | 指定したカテゴリのカラー キー (透明度範囲) をクリアします。 |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix)() | デフォルト カテゴリの色調整マトリックスをクリアします。 |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix_1)(ColorAdjustType) | 指定したカテゴリの色調整マトリックスをクリアします。 |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma/#cleargamma)() | デフォルト カテゴリのガンマ補正を無効にします。 |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma/#cleargamma_1)(ColorAdjustType) | 指定したカテゴリのガンマ補正を無効にします。 |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop/#clearnoop)() | デフォルト カテゴリの NoOp 設定をクリアします。 |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop/#clearnoop_1)(ColorAdjustType) | 指定したカテゴリの NoOp 設定をクリアします。 |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel)() | デフォルト カテゴリの CMYK (シアン-マゼンタ-イエロー-ブラック) 出力チャネル設定をクリアします。 |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel_1)(ColorAdjustType) | 指定されたカテゴリーの (シアン-マゼンタ-黄-黒) 出力チャネル設定をクリアします。 |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile)() | デフォルト カテゴリの出力チャネル カラー プロファイル設定をクリアします。 |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile_1)(ColorAdjustType) | 指定したカテゴリの出力チャネル カラー プロファイル設定をクリアします。 |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable/#clearremaptable)() | デフォルト カテゴリのカラー リマップ テーブルをクリアします。 |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable/#clearremaptable_1)(ColorAdjustType) | 指定したカテゴリのカラー リマップ テーブルをクリアします。 |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold/#clearthreshold)() | デフォルト カテゴリのしきい値をクリアします。 |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold/#clearthreshold_1)(ColorAdjustType) | 指定したカテゴリのしきい値をクリアします。 |
| [Clone](../../system.drawing.imaging/imageattributes/clone/)() | これの正確なコピーを作成しますImageAttributesobject. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose/)() | これによって使用されたすべてのリソースを解放しますImageAttributesobject. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette/)(ColorPalette, ColorAdjustType) | 指定されたカテゴリの調整設定に従って、パレットの色を調整します。 |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable/)(ColorMap[]) | ブラシ カテゴリのカラー リマップ テーブルを設定します。 |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey/#setcolorkey)(Color, Color) | デフォルト カテゴリのカラー キーを設定します。 |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey/#setcolorkey_1)(Color, Color, ColorAdjustType) | 指定したカテゴリのカラー キー (透明度の範囲) を設定します。 |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices)(ColorMatrix, ColorMatrix) | デフォルト カテゴリの色調整マトリックスとグレースケール調整マトリックスを設定します。 |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | デフォルト カテゴリの色調整マトリックスとグレースケール調整マトリックスを設定します。 |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | 指定したカテゴリのカラー調整マトリックスとグレースケール調整マトリックスを設定します。 |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix)(ColorMatrix) | デフォルト カテゴリの色調整マトリックスを設定します。 |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | デフォルト カテゴリの色調整マトリックスを設定します。 |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | 指定したカテゴリの色調整マトリックスを設定します。 |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma/#setgamma)(float) | デフォルト カテゴリのガンマ値を設定します。 |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma/#setgamma_1)(float, ColorAdjustType) | 指定したカテゴリのガンマ値を設定します。 |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop/#setnoop)() | デフォルト カテゴリの色調整をオフにします。 を呼び出すことができます。[`ClearNoOp`](./clearnoop/) call の前にあった色調整設定を元に戻す メソッド[`SetNoOp`](./setnoop/) method. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop/#setnoop_1)(ColorAdjustType) | 指定したカテゴリの色調整をオフにします。あなたは呼び出すことができます[`ClearNoOp`](./clearnoop/) メソッドを使用して、call の前に設定されていた色調整設定を[`SetNoOp`](./setnoop/) method. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel)(ColorChannelFlag) | デフォルト カテゴリの CMYK (シアン-マゼンタ-イエロー-ブラック) 出力チャネルを設定します。 |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | 指定したカテゴリの CMYK (シアン-マゼンタ-イエロー-ブラック) 出力チャネルを設定します。 |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile)(string) | デフォルト カテゴリの出力チャネル カラー プロファイル ファイルを設定します。 |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | 指定したカテゴリの出力チャネル カラー プロファイル ファイルを設定します。 |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable/#setremaptable)(ColorMap[]) | デフォルト カテゴリのカラー リマップ テーブルを設定します。 |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable/#setremaptable_1)(ColorMap[], ColorAdjustType) | 指定したカテゴリのカラー リマップ テーブルを設定します。 |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold/#setthreshold)(float) | 既定のカテゴリのしきい値 (透明度の範囲) を設定します。 |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold/#setthreshold_1)(float, ColorAdjustType) | 指定したカテゴリのしきい値 (透明度の範囲) を設定します。 |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode)(WrapMode) | シェイプ全体またはシェイプの境界でテクスチャをタイリングする方法を決定するために使用されるラップ モードを設定します。 |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_1)(WrapMode, Color) | シェイプ全体またはシェイプ境界でテクスチャをタイル化する方法を決定するために使用されるラップ モードと色を設定します。 |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_2)(WrapMode, Color, bool) | シェイプ全体またはシェイプ境界でテクスチャをタイル化する方法を決定するために使用されるラップ モードと色を設定します。 |

### 関連項目

* 名前空間 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 組み立て [Aspose.Drawing](../../)


