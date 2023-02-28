---
title: Class AsposeOcr
second_title: Aspose.OCR for .NET API リファレンス
description: Aspose.OCR.AsposeOcr クラス. Aspose OCR のメイン API ライブラリ
type: docs
weight: 20
url: /ja/net/aspose.ocr/asposeocr/
---
## AsposeOcr class

Aspose OCR のメイン API ライブラリ

```csharp
public class AsposeOcr
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [AsposeOcr](asposeocr/#constructor)() | の新しいインスタンスを初期化します`AsposeOcr`class. 空のコンストラクター. |
| [AsposeOcr](asposeocr/#constructor_1)(string) | の新しいインスタンスを初期化します`AsposeOcr` class. alphabet プロパティで許可される文字を設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew)(MemoryStream) | 画像の傾き角度を計算します. |
| [CalculateSkew](../../aspose.ocr/asposeocr/calculateskew/#calculateskew_1)(string) | 画像の傾き角度を計算します. |
| [CalculateSkewFromUri](../../aspose.ocr/asposeocr/calculateskewfromuri/)(string) | URIから画像の傾き角度を計算します. |
| [CompareImageTexts](../../aspose.ocr/asposeocr/compareimagetexts/)(string, string, RecognitionSettings, bool) | 2 つの画像に同じテキストが含まれているかどうかを確認します。 |
| [CorrectSpelling](../../aspose.ocr/asposeocr/correctspelling/)(string, SpellCheckLanguage, string) | テキストを修正します (スペルミスの単語を置き換えます). |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles)(MemoryStream, AreasType, bool) | 画像上のテキスト領域を検出します.  自動画像傾き補正は適用されません。 GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。 |
| [GetRectangles](../../aspose.ocr/asposeocr/getrectangles/#getrectangles_1)(string, AreasType, bool) | 画像上のテキスト領域を検出します.  自動画像傾き補正は適用されません。 GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。 |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext_1)(string, Regex, RecognitionSettings) | 画像テキストが提供された正規表現と一致するかどうかを確認します。 |
| [ImageHasText](../../aspose.ocr/asposeocr/imagehastext/#imagehastext)(string, string, RecognitionSettings, bool) | 画像に提供されたテキスト フラグメントが含まれているかどうかを確認します。 |
| [ImageTextDiff](../../aspose.ocr/asposeocr/imagetextdiff/)(string, string, RecognitionSettings, bool) | 2 つの画像のテキストを比較し、類似度を表す数値 (0 から 1) を返します。 |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage)(MemoryStream, PreprocessingFilter) | 画像の前処理を使用して、OCR の精度を向上させます。 指定した順序で入力画像に適用されるフィルタのリストを作成します。 フィルタを作成する例: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; すべて必要というわけではありません。必要なものだけを設定してください. |
| [PreprocessImage](../../aspose.ocr/asposeocr/preprocessimage/#preprocessimage_1)(string, PreprocessingFilter) | 画像の前処理を使用して、OCR の精度を向上させます。 指定した順序で入力画像に適用されるフィルタのリストを作成します。 フィルタを作成する例: PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; すべて必要というわけではありません。必要なものだけを設定してください. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate)(MemoryStream, CarPlateRecognitionSettings) | 車のプレートを認識します. |
| [RecognizeCarPlate](../../aspose.ocr/asposeocr/recognizecarplate/#recognizecarplate_1)(string, CarPlateRecognitionSettings) | 車のプレートを認識します. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu)(MemoryStream, DocumentRecognitionSettings) | 複数ページの DJVU 画像からテキストを認識します。  DJVUファイルを認識して指定可能[`DocumentRecognitionSettings`](../documentrecognitionsettings/). DJVU のみをサポートします。他の画像タイプはサポートしていません. |
| [RecognizeDjvu](../../aspose.ocr/asposeocr/recognizedjvu/#recognizedjvu_1)(string, DocumentRecognitionSettings) | 複数ページの DJVU 画像からテキストを認識します。  DJVUファイルを認識して指定可能[`DocumentRecognitionSettings`](../documentrecognitionsettings/). DJVU のみをサポートします。他の画像タイプはサポートしていません. |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard)(MemoryStream, IDCardRecognitionSettings) | ID カードのテキストを認識します。 |
| [RecognizeIDCard](../../aspose.ocr/asposeocr/recognizeidcard/#recognizeidcard_1)(string, IDCardRecognitionSettings) | ID カードのテキストを認識します。 |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_4)(MemoryStream) | 画像上のテキストを認識します. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_5)(string) | 画像上のテキストを認識します. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_2)(MemoryStream, RecognitionSettings) | 画像上のテキストを認識します.  指定可能画像認識[`RecognitionSettings`](../recognitionsettings/). GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。 |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_3)(string, RecognitionSettings) | 画像上のテキストを認識します. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage)(Color[], int, int, RecognitionSettings) | 画像上のテキストを認識します. |
| [RecognizeImage](../../aspose.ocr/asposeocr/recognizeimage/#recognizeimage_1)(byte[], int, int, PixelType, RecognitionSettings) | 画像上のテキストを認識します. |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast)(MemoryStream) | 画像上のテキストを高品質で認識します。傾き補正や領域検出は使用しません。高速モードで動作します。 |
| [RecognizeImageFast](../../aspose.ocr/asposeocr/recognizeimagefast/#recognizeimagefast_1)(string) | 画像上のテキストを高品質で認識します。傾き補正や領域検出は使用しません。高速モードで動作します。 |
| [RecognizeImageFromBase64](../../aspose.ocr/asposeocr/recognizeimagefrombase64/)(string, RecognitionSettings) | base64 タイプで提供される画像上のテキストを認識します。 |
| [RecognizeImageFromUri](../../aspose.ocr/asposeocr/recognizeimagefromuri/)(string, RecognitionSettings) | URI リンクによって提供される画像上のテキストを認識します。 |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice)(MemoryStream, InvoiceRecognitionSettings) | 請求書画像のテキストを認識します。 |
| [RecognizeInvoice](../../aspose.ocr/asposeocr/recognizeinvoice/#recognizeinvoice_1)(string, InvoiceRecognitionSettings) | 請求書画像のテキストを認識します。 |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline)(MemoryStream) | 1 行のテキストを含む画像を認識します。  自動画像傾き補正は適用されません。 GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。 |
| [RecognizeLine](../../aspose.ocr/asposeocr/recognizeline/#recognizeline_1)(string) | 1 行のテキストを含む画像を認識します。  自動画像傾き補正は適用されません。 GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします。 |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages)(List&lt;string&gt;) | デフォルト設定でリストから複数の画像を認識します.  アーカイブとフォルダはサポートされていません. 処理される画像の最大量は 20 です. GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートしています. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_2)(string) | ZIP アーカイブまたはデフォルト設定のフォルダーから圧縮された複数の画像を認識します。  ネストされたアーカイブとフォルダーはサポートされていません. 処理される画像の最大量は 20 です. GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_1)(List&lt;string&gt;, RecognitionSettings) | リストから複数の画像を認識します.  アーカイブとフォルダはサポートされていません. 処理される画像の最大量は 20 です. GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートしています. |
| [RecognizeMultipleImages](../../aspose.ocr/asposeocr/recognizemultipleimages/#recognizemultipleimages_3)(string, RecognitionSettings) | ZIP アーカイブまたはフォルダーから圧縮された複数の画像を認識します。  ネストされたアーカイブとフォルダーはサポートされていません. 処理される画像の最大量は 20 です. GIF、PNG、JPEG、BMP、TIFF、JFIF をサポートします. |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport)(MemoryStream, PassportRecognitionSettings) | パスポートのテキストを認識します。 |
| [RecognizePassport](../../aspose.ocr/asposeocr/recognizepassport/#recognizepassport_1)(string, PassportRecognitionSettings) | パスポートのテキストを認識します。 |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf)(MemoryStream, DocumentRecognitionSettings) | スキャンした PDF からテキストを認識します (画像を抽出します).  指定機能でpdfファイルを認識[`RecognitionSettings`](../recognitionsettings/). スキャンした PDF のみをサポートします。サーチャブル PDF をサポートしていません。 |
| [RecognizePdf](../../aspose.ocr/asposeocr/recognizepdf/#recognizepdf_1)(string, DocumentRecognitionSettings) | スキャンした PDF からテキストを認識します (画像を抽出します).  指定機能でpdfファイルを認識[`DocumentRecognitionSettings`](../documentrecognitionsettings/). スキャンした PDF のみをサポートします。サーチャブル PDF をサポートしていません。 |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt)(MemoryStream, ReceiptRecognitionSettings) | 画像上のテキストを認識します. |
| [RecognizeReceipt](../../aspose.ocr/asposeocr/recognizereceipt/#recognizereceipt_1)(string, ReceiptRecognitionSettings) | 画像上のテキストを認識します. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff)(MemoryStream, DocumentRecognitionSettings) | 複数ページの TIFF 画像からテキストを認識します。  指定できるTIFFファイルを認識[`DocumentRecognitionSettings`](../documentrecognitionsettings/). TIFF (TIF) のみをサポートします。他の画像タイプはサポートしていません. |
| [RecognizeTiff](../../aspose.ocr/asposeocr/recognizetiff/#recognizetiff_1)(string, DocumentRecognitionSettings) | 複数ページの TIFF 画像からテキストを認識します。  指定できるTIFFファイルを認識[`DocumentRecognitionSettings`](../documentrecognitionsettings/). TIFF (TIF) のみをサポートします。他の画像タイプはサポートしていません. |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument)(MemoryStream, SaveFormat, List&lt;RecognitionResult&gt;) | RecognitionResult オブジェクトのリストから複数ページのドキュメントを取得できます |
| static [SaveMultipageDocument](../../aspose.ocr/asposeocr/savemultipagedocument/#savemultipagedocument_1)(string, SaveFormat, List&lt;RecognitionResult&gt;) | RecognitionResult オブジェクトのリストから複数ページのドキュメントを取得できます |

## イベント

| 名前 | 説明 |
| --- | --- |
| event [OcrProgress](../../aspose.ocr/asposeocr/ocrprogress/) | 複数ページの画像認識の進行状況を追跡するイベント。 |

### 関連項目

* 名前空間 [Aspose.OCR](../../aspose.ocr/)
* 組み立て [Aspose.OCR](../../)


