---
title: GraphicsPathIterator.NextPathType
second_title: Aspose.Drawing for .NET API リファレンス
description: GraphicsPathIterator 方法. すべて同じタイプのデータ ポイントの次のグループの開始インデックスと終了インデックスを取得します
type: docs
weight: 90
url: /ja/net/system.drawing.drawing2d/graphicspathiterator/nextpathtype/
---
## GraphicsPathIterator.NextPathType method

すべて同じタイプのデータ ポイントの次のグループの開始インデックスと終了インデックスを取得します。

```csharp
public int NextPathType(out byte pathType, out int startIndex, out int endIndex)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| pathType | Byte& | [out] グループ内のすべてのポイントで共有されるポイント タイプを受け取ります。可能なタイプは、PathPointType列挙。 |
| startIndex | Int32& | [out] ポイントのグループの開始インデックスを受け取ります。 |
| endIndex | Int32& | [out] ポイントのグループの終了インデックスを受け取ります。 |

### 戻り値

このメソッドは、グループ内のデータ ポイントの数を返します。パスにそれ以上グループがない場合、このメソッドは 0 を返します。

### 関連項目

* class [GraphicsPathIterator](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspathiterator/)
* 組み立て [Aspose.Drawing](../../../)


