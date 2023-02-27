---
title: Enum DetectAreasMode
second_title: Aspose.OCR for .NET API リファレンス
description: Aspose.OCR.DetectAreasMode 列挙. 領域検出に使用されるニューラル ネットワークのタイプを決定します
type: docs
weight: 60
url: /ja/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

領域検出に使用されるニューラル ネットワークのタイプを決定します。

```csharp
public enum DetectAreasMode
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| NONE | `0` | 段落を検出しません。 写真のない単純な 1 列のドキュメントに適しています。 |
| DOCUMENT | `1` | ドキュメントの NN モデルを使用する段落を検出します。 複数列のドキュメント、写真を含むドキュメント、またはテキスト以外のオブジェクトを含むドキュメントに適しています。 |
| PHOTO | `2` | 写真の NN モデルを使用して段落を検出します。 多くの写真やその他のテキスト以外のオブジェクトを含む画像に適しています. |
| COMBINE | `3` | テキストを含む段落を検出し、他の NN モデルを使用して段落内の領域を検出します. 複雑な構造の画像に適しています. |
| TABLE | `4` | テキストを含むセルを検出します。 テーブル構造の画像に適したモードです。 |
| CURVED_TEXT | `5` | 曲がった画像の線を検出し、テキストを認識します。 本や雑誌のページの写真に適したモードです。 |

### 備考

で使用[`RecognitionSettings`](../recognitionsettings/)認識したい画像の種類を指定します.

### 関連項目

* 名前空間 [Aspose.OCR](../../aspose.ocr/)
* 組み立て [Aspose.OCR](../../)


