---
title: Image.GetThumbnailImage
second_title: Aspose.Drawing for .NET API リファレンス
description: Image 方法. このサムネイルを返しますImage.
type: docs
weight: 230
url: /ja/net/system.drawing/image/getthumbnailimage/
---
## Image.GetThumbnailImage method

このサムネイルを返しますImage.

```csharp
public Image GetThumbnailImage(int thumbWidth, int thumbHeight, GetThumbnailImageAbort callback, 
    IntPtr callbackData)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| thumbWidth | Int32 | 要求されたサムネイル画像の幅 (ピクセル単位)。 |
| thumbHeight | Int32 | 要求されたサムネイル画像の高さ (ピクセル単位)。 |
| callback | GetThumbnailImageAbort | あ[`GetThumbnailImageAbort`](../../image.getthumbnailimageabort/)デリゲート。注 デリゲートを作成し、デリゲートへの参照を*callback*パラメータですが、デリゲートは使用されません。 |
| callbackData | IntPtr | でなければなりませんZero. |

### 戻り値

アンImageサムネイルを表す.

### 関連項目

* delegate [GetThumbnailImageAbort](../../image.getthumbnailimageabort/)
* class [Image](../)
* 名前空間 [System.Drawing](../../image/)
* 組み立て [Aspose.Drawing](../../../)


