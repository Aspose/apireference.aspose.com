---
title: Class PsSaveOptions
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.EPS.Device.PsSaveOptions クラス. このクラスにはドキュメントを PostScript PS または Encapsulated PostScript EPS ファイルに変換するプロセスを管理するために必要なオプションが含まれています
type: docs
weight: 80
url: /ja/net/aspose.page.eps.device/pssaveoptions/
---
## PsSaveOptions class

このクラスには、ドキュメントを PostScript (PS) または Encapsulated PostScript (EPS) ファイルに変換するプロセスを管理するために必要なオプションが含まれています。

```csharp
public class PsSaveOptions : SaveOptions
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [PsSaveOptions](pssaveoptions/#constructor)() | の新しいインスタンスを初期化します`PsSaveOptions`フラグのデフォルト値 を持つクラス!:SuppressErrors(真) と!:Debug(false). |
| [PsSaveOptions](pssaveoptions/#constructor_1)(bool) | の新しいインスタンスを初期化します`PsSaveOptions`フラグのデフォルト値を持つクラス!:Debug(false). |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | コンバーターが入力ドキュメントのフォントを検索する追加のフォルダーを指定します。 |
| [BackgroundColor](../../aspose.page.eps.device/pssaveoptions/backgroundcolor/) { get; set; } | 背景色. |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | デバッグ情報を標準出力ストリームに出力する必要があるかどうかを指定します. |
| [EmbedFonts](../../aspose.page.eps.device/pssaveoptions/embedfonts/) { get; set; } | 使用されているフォントを PS ドキュメントに埋め込むかどうかを示します。 |
| [EmbedFontsAs](../../aspose.page.eps.device/pssaveoptions/embedfontsas/) { get; set; } | PS ドキュメントにフォントを埋め込むためのフォントのタイプ。 |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | 抑制された変換エラーのリストを返します!:SuppressErrors本当です. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | 品質カテゴリは、画像の圧縮レベルを指定します。 使用可能な値は 0 ～ 100 です。 指定した数値が小さいほど、圧縮率が高くなり、画像の品質が低下します。 値が 0 の場合は画質が最低になり、100 の場合は最高画質になります。 |
| [Margins](../../aspose.page.eps.device/pssaveoptions/margins/) { get; set; } | ページのマージン。 |
| [PageSize](../../aspose.page.eps.device/pssaveoptions/pagesize/) { get; set; } | ページのサイズ. |
| [SaveFormat](../../aspose.page.eps.device/pssaveoptions/saveformat/) { get; set; } | 結果ファイルの保存形式. |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | エラーを抑制する必要があるかどうかを指定します。 true の場合、抑制されたエラーが追加されます[`Exceptions`](../../aspose.page/saveoptions/exceptions/)list. false の場合、最初のエラーでプログラムが終了します。 |
| [Transparent](../../aspose.page.eps.device/pssaveoptions/transparent/) { get; set; } | 背景が透明かどうかを示します。 |

### 関連項目

* class [SaveOptions](../../aspose.page/saveoptions/)
* 名前空間 [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* 組み立て [Aspose.Page](../../)


