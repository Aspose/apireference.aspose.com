---
title: Class ImageCodecInfo
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Imaging.ImageCodecInfo クラス. ImageCodecInfoクラスはインストールされているイメージ エンコーダーとデコーダー コーデックと呼ばれる に関するすべての関連情報を取得するために必要なストレージ メンバーとメソッドを提供します継承不可.
type: docs
weight: 750
url: /ja/net/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class

ImageCodecInfoクラスは、インストールされているイメージ エンコーダーとデコーダー (コーデックと呼ばれる) に関するすべての関連情報を取得するために必要なストレージ メンバーとメソッドを提供します。継承不可.

```csharp
public sealed class ImageCodecInfo
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Clsid](../../system.drawing.imaging/imagecodecinfo/clsid/) { get; set; } | を取得または設定しますGuid特定の codec. を識別する GUID を含む構造体 |
| [CodecName](../../system.drawing.imaging/imagecodecinfo/codecname/) { get; set; } | コーデックの名前を含む文字列を取得または設定します。 |
| [FilenameExtension](../../system.drawing.imaging/imagecodecinfo/filenameextension/) { get; set; } | コーデックで使用されるファイル名拡張子を含む文字列を取得または設定します. 拡張子はセミコロンで区切られます. |
| [FormatDescription](../../system.drawing.imaging/imagecodecinfo/formatdescription/) { get; set; } | コーデックのファイル形式を説明する文字列を取得または設定します。 |
| [FormatID](../../system.drawing.imaging/imagecodecinfo/formatid/) { get; set; } | を取得または設定しますGuidコーデックの形式を識別する GUID を含む構造体. |
| [MimeType](../../system.drawing.imaging/imagecodecinfo/mimetype/) { get; set; } | コーデックの Multipurpose Internet Mail Extensions (MIME) タイプを含む文字列を取得または設定します。 |
| [SignatureMasks](../../system.drawing.imaging/imagecodecinfo/signaturemasks/) { get; set; } | フィルターとして使用できるバイトの 2 次元配列を取得または設定します。 |
| [SignaturePatterns](../../system.drawing.imaging/imagecodecinfo/signaturepatterns/) { get; set; } | コーデックの署名を表すバイトの 2 次元配列を取得または設定します。 |
| [Version](../../system.drawing.imaging/imagecodecinfo/version/) { get; set; } | コーデックのバージョン番号を取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [GetImageDecoders](../../system.drawing.imaging/imagecodecinfo/getimagedecoders/)() | の配列を返しますImageCodecInfoGDI+. に組み込まれているイメージ デコーダーに関する情報を含むオブジェクト |
| static [GetImageEncoders](../../system.drawing.imaging/imagecodecinfo/getimageencoders/)() | の配列を返しますImageCodecInfoGDI+. に組み込まれているイメージ エンコーダーに関する情報を含むオブジェクト |

### 関連項目

* 名前空間 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 組み立て [Aspose.Drawing](../../)


