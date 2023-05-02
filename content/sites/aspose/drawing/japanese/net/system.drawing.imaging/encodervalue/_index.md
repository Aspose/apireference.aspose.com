---
title: Enum EncoderValue
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Imaging.EncoderValue 列挙. を使用するときに JPEG または TIFF 画像エンコーダーに渡されるパラメーター値を指定するために使用されますEncoderParameters またはEncoderParametersメソッド.
type: docs
weight: 720
url: /ja/net/system.drawing.imaging/encodervalue/
---
## EncoderValue enumeration

を使用するときに JPEG または TIFF 画像エンコーダーに渡されるパラメーター値を指定するために使用されます。EncoderParameters) またはEncoderParameters)メソッド.

```csharp
public enum EncoderValue
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| ColorTypeCMYK | `0` | GDI+ バージョン 1.0 では使用されません。 |
| ColorTypeYCCK | `1` | GDI+ バージョン 1.0 では使用されません。 |
| CompressionLZW | `2` | LZW 圧縮方式を指定します。 Compression カテゴリに属するパラメーターとして TIFF エンコーダーに渡すことができます。 |
| CompressionCCITT3 | `3` | CCITT3 圧縮方式を指定します。圧縮カテゴリに属するパラメーターとして TIFF エンコーダーに渡すことができます。 |
| CompressionCCITT4 | `4` | CCITT4 圧縮方式を指定します。圧縮カテゴリに属するパラメーターとして TIFF エンコーダーに渡すことができます。 |
| CompressionRle | `5` | RLE 圧縮方式を指定します。圧縮カテゴリに属するパラメーターとして TIFF エンコーダーに渡すことができます。 |
| CompressionNone | `6` | 圧縮なしを指定します。圧縮カテゴリに属するパラメーターとして TIFF エンコーダーに渡すことができます。 |
| ScanMethodInterlaced | `7` | GDI+ バージョン 1.0 では使用されません。 |
| ScanMethodNonInterlaced | `8` | GDI+ バージョン 1.0 では使用されません。 |
| VersionGif87 | `9` | GDI+ バージョン 1.0 では使用されません。 |
| VersionGif89 | `10` | GDI+ バージョン 1.0 では使用されません。 |
| RenderProgressive | `11` | GDI+ バージョン 1.0 では使用されません。 |
| RenderNonProgressive | `12` | GDI+ バージョン 1.0 では使用されません。 |
| TransformRotate90 | `13` | イメージを中心から時計回りに 90 度回転することを指定します。変換カテゴリに属するパラメーターとして JPEG エンコーダーに渡すことができます。 |
| TransformRotate180 | `14` | イメージをその中心を中心に 180 度回転するように指定します。変換カテゴリに属するパラメーターとして JPEG エンコーダーに渡すことができます。 |
| TransformRotate270 | `15` | 画像を中心から時計回りに 270 度回転することを指定します。変換カテゴリに属するパラメーターとして JPEG エンコーダーに渡すことができます。 |
| TransformFlipHorizontal | `16` | イメージを水平方向 (垂直軸を中心に) 反転することを指定します。変換カテゴリに属するパラメーターとして JPEG エンコーダーに渡すことができます。 |
| TransformFlipVertical | `17` | イメージを垂直方向 (水平軸を中心に) 反転することを指定します。変換カテゴリに属するパラメーターとして JPEG エンコーダーに渡すことができます。 |
| MultiFrame | `18` | イメージに複数のフレーム (ページ) があることを指定します。保存フラグ カテゴリに属するパラメーターとして TIFF エンコーダーに渡すことができます。 |
| LastFrame | `19` | 複数フレーム イメージの最後のフレームを指定します。保存フラグ カテゴリに属するパラメーターとして TIFF エンコーダーに渡すことができます。 |
| Flush | `20` | 複数フレームのファイルまたはストリームを閉じる必要があることを指定します。保存フラグ カテゴリに属するパラメーターとして TIFF エンコーダーに渡すことができます。 |
| FrameDimensionTime | `21` | GDI+ バージョン 1.0 では使用されません。 |
| FrameDimensionResolution | `22` | GDI+ バージョン 1.0 では使用されません。 |
| FrameDimensionPage | `23` | イメージのページ ディメンションにフレームを追加することを指定します。保存フラグ カテゴリに属するパラメーターとして TIFF エンコーダーに渡すことができます。 |

### 関連項目

* 名前空間 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 組み立て [Aspose.Drawing](../../)


