---
title: Delegate Graphics.DrawImageAbort
second_title: Aspose.Drawing for .NET API リファレンス
description: を決定するためのコールバック メソッドを提供しますDrawImageメソッドは実行を途中でキャンセルし画像の描画を停止する必要があります
type: docs
weight: 540
url: /ja/net/system.drawing/graphics.drawimageabort/
---
## Graphics.DrawImageAbort delegate

を決定するためのコールバック メソッドを提供します。[`DrawImage`](../graphics/drawimage/)メソッドは実行を途中でキャンセルし、画像の描画を停止する必要があります。

```csharp
public delegate bool DrawImageAbort(IntPtr callbackdata);
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| callbackdata | IntPtr | コールバック メソッドのデータを指定する内部ポインター。このパラメーターは、すべてによって渡されるわけではありません[`DrawImage`](../graphics/drawimage/)過負荷。値を確認することで、その不在をテストできますZero. |

### 戻り値

このメソッドは、[`DrawImage`](../graphics/drawimage/)メソッドは途中で実行を停止する必要があります。それ以外の場合は false を返し、[`DrawImage`](../graphics/drawimage/)メソッドは実行を継続する必要があります。

### 関連項目

* class [Graphics](../graphics/)
* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


