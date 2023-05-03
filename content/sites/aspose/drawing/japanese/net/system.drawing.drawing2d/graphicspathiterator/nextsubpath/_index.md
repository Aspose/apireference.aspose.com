---
title: GraphicsPathIterator.NextSubpath
second_title: Aspose.Drawing for .NET API リファレンス
description: GraphicsPathIterator 方法. 移動しますGraphicsPathIteratorパス内の次のサブパスへ out パラメータには次のサブパスの開始インデックスと終了インデックスが含まれます
type: docs
weight: 100
url: /ja/net/system.drawing.drawing2d/graphicspathiterator/nextsubpath/
---
## NextSubpath(out int, out int, out bool) {#nextsubpath}

移動します[`GraphicsPathIterator`](../)パス内の次のサブパスへ。 [out] パラメータには、次のサブパスの開始インデックスと終了インデックスが含まれます。

```csharp
public int NextSubpath(out int startIndex, out int endIndex, out bool isClosed)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| startIndex | Int32& | [out] 次のサブパスの開始インデックスを受け取ります。 |
| endIndex | Int32& | [out] 次のサブパスの終了インデックスを受け取ります。 |
| isClosed | Boolean& | [out] サブパスが閉じているかどうかを示します。 |

### 戻り値

取得した Figure (サブパス) 内のデータ ポイントの数。取得する数値がこれ以上ない場合は、0 が返されます。

### 関連項目

* class [GraphicsPathIterator](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspathiterator/)
* 組み立て [Aspose.Drawing](../../../)

---

## NextSubpath(GraphicsPath, out bool) {#nextsubpath_1}

この関連付けられたパスから次の図形 (サブパス) を取得します[`GraphicsPathIterator`](../).

```csharp
public int NextSubpath(GraphicsPath path, out bool isClosed)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | GraphicsPath | あ[`GraphicsPath`](../../graphicspath/)つまり、このイテレータに対して取得された図 (サブパス) のデータ ポイントと一致するようにデータ ポイントが設定されます。 |
| isClosed | Boolean& | [out] 現在のサブパスが閉じているかどうかを示します。 Figure が閉じている場合は true、そうでない場合は false です。 |

### 戻り値

取得した Figure (サブパス) 内のデータ ポイントの数。取得する数値がこれ以上ない場合は、0 が返されます。

### 関連項目

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspathiterator/)
* 組み立て [Aspose.Drawing](../../../)


