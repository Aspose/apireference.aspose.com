---
title: Class SaveOptions
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.SaveOptions クラス. このクラスには変換プロセスを管理するために必要なオプションが含まれています.
type: docs
weight: 300
url: /ja/net/aspose.page/saveoptions/
---
## SaveOptions class

このクラスには、変換プロセスを管理するために必要なオプションが含まれています.

```csharp
public abstract class SaveOptions
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [SaveOptions](saveoptions/#constructor)() | の新しいインスタンスを初期化します`SaveOptions`フラグのデフォルト値 を持つクラス!:SuppressErrors(真) と[`Debug`](./debug/)(false). |
| [SaveOptions](saveoptions/#constructor_1)(bool) | の新しいインスタンスを初期化します`SaveOptions`フラグのデフォルト値を持つクラス[`Debug`](./debug/)(false). |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | コンバーターが入力ドキュメントのフォントを検索する追加のフォルダーを指定します。 |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | デバッグ情報を標準出力ストリームに出力する必要があるかどうかを指定します. |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | 抑制された変換エラーのリストを返します!:SuppressErrors本当です. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | 品質カテゴリは、画像の圧縮レベルを指定します。 使用可能な値は 0 ～ 100 です。 指定した数値が小さいほど、圧縮率が高くなり、画像の品質が低下します。 値が 0 の場合は画質が最低になり、100 の場合は最高画質になります。 |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | エラーを抑制する必要があるかどうかを指定します。 true の場合、抑制されたエラーが追加されます[`Exceptions`](./exceptions/)list. false の場合、最初のエラーでプログラムが終了します。 |

### 関連項目

* 名前空間 [Aspose.Page](../../aspose.page/)
* 組み立て [Aspose.Page](../../)


