---
title: GraphicsPathIterator.NextMarker
second_title: Aspose.Drawing for .NET API リファレンス
description: GraphicsPathIterator 方法. インクリメントGraphicsPathIteratorpath の次のマーカーに移動しout パラメータを介して開始インデックスと終了インデックスを返します
type: docs
weight: 80
url: /ja/net/system.drawing.drawing2d/graphicspathiterator/nextmarker/
---
## NextMarker(out int, out int) {#nextmarker}

インクリメント[`GraphicsPathIterator`](../)path の次のマーカーに移動し、[out] パラメータを介して開始インデックスと終了インデックスを返します。

```csharp
public int NextMarker(out int startIndex, out int endIndex)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| startIndex | Int32& | [アウト] このパラメーターに指定された整数参照 receive サブパスを開始するポイントのインデックス。 |
| endIndex | Int32& | [アウト] このパラメーターに指定された整数参照 receive startIndex が指すサブパスを終了するポイントのインデックス。 |

### 戻り値

このマーカーと次のマーカーの間のポイント数。

### 関連項目

* class [GraphicsPathIterator](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspathiterator/)
* 組み立て [Aspose.Drawing](../../../)

---

## NextMarker(GraphicsPath) {#nextmarker_1}

これ[`GraphicsPathIterator`](../)オブジェクトは[`GraphicsPath`](../../graphicspath/)それに関連付けられたオブジェクト. このメソッドは、関連付けられた[`GraphicsPath`](../../graphicspath/)path 内の次のマーカーにコピーし、現在のマーカーと次のマーカー (またはパスの終わり) の間に含まれるすべてのポイントを 1 秒にコピーします。[`GraphicsPath`](../../graphicspath/)パラメータに渡されたオブジェクト.

```csharp
public int NextMarker(GraphicsPath path)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | GraphicsPath | の[`GraphicsPath`](../../graphicspath/)ポイントがコピーされるオブジェクト。 |

### 戻り値

このマーカーと次のマーカーの間のポイント数。

### 関連項目

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspathiterator/)
* 組み立て [Aspose.Drawing](../../../)


