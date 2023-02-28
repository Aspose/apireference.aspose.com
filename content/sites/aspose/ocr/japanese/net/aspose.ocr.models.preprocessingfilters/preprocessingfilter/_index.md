---
title: Class PreprocessingFilter
second_title: Aspose.OCR for .NET API リファレンス
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter クラス. 画像処理コマンドの基本クラス.
type: docs
weight: 170
url: /ja/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

画像処理コマンドの基本クラス.

画像処理コマンドの基本クラス.

```csharp
public class PreprocessingFilter : IEnumerable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | デフォルトのコンストラクター。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | 追加のニューラル ネットワークを使用して画像を改善し、ノイズを減らします。 スキャン アーティファクト、歪み、スポット、フレア、グラデーション、異物を含む画像に役立ちます。 |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | 追加のニューラル ネットワークを使用して画像部分を改善し、ノイズを減らします。 スキャン アーティファクト、歪み、スポット、フレア、グラデーション、異物を含む画像に役立ちます。 |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | 画像の幾何学的な歪みを自動的に修正します. リソースを大量に消費します! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | 自動画像スキュー補正を有効にします。 |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | 画像部分の自動傾き補正を有効にします。 |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | 画像を白黒画像に変換します。 バイナリ画像は、ピクセルが可能な強度値を 2 つしか持たない画像です。 通常は白黒で表示されます。数値的には、2 つの値は多くの場合、黒の場合は 0 で、白の場合は 255 です。 |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | 画像の一部を白黒画像に変換します。 バイナリ画像は、ピクセルが可能な強度値を 2 つしか持たない画像です。 通常は白黒で表示されます。数値的には、2 つの値は多くの場合、黒の場合は 0 で、白の場合は 255 です。 |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | コントラスト補正フィルター. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | 画像の一部のコントラスト補正フィルター. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | 膨張は、画像内のオブジェクトの境界にピクセルを追加します. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | 膨張は、画像の一部のオブジェクトの境界にピクセルを追加します. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | ドキュメント画像の色を自動的に反転します。 |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | 画像の一部の色を自動的に反転します。 |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | 中央値フィルターは、画像の各要素を通過し、各ピクセルを隣接するピクセルの中央値に置き換えます。 |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | メディアン フィルターは、画像部分の各要素を通過し、各ピクセルを隣接するピクセルの中央値に置き換えます。 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | 画像の再スケーリング - 画像の解像度をアップスケールまたはダウンスケールします。 InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | 画像の再スケーリング - 画像の解像度をアップスケールまたはダウンスケールします。 |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | 元の画像を回転します。 |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | 画像の一部を回転させます。 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | 画像の再スケーリング - 画像の解像度をアップスケールまたはダウンスケールします。 InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | 画像の再スケーリング - 画像の解像度をアップスケールまたはダウンスケールします。 |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | 元の画像のピクセル強度にしきい値を設定して、バイナリ画像を作成します。 |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | 元の画像部分のピクセル強度にしきい値を設定することに基づいて、画像のバイナリ部分を作成します。 |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | 画像をグレースケール画像に変換します。 グレースケール画像は、画像内に 256 レベルの光 (0 ～ 255) があります。 |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | 新しいフィルターをコレクションに追加して、さらにすべての操作を実行します。 コレクション内の一貫性が重要です。 |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | IEnumarable インターフェイスの実現用. |

### 関連項目

* 名前空間 [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* 組み立て [Aspose.OCR](../../)


