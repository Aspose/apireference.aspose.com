---
title: Enum CombineMode
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Drawing2D.CombineMode 列挙. 異なるクリッピング領域を組み合わせる方法を指定します.
type: docs
weight: 160
url: /ja/net/system.drawing.drawing2d/combinemode/
---
## CombineMode enumeration

異なるクリッピング領域を組み合わせる方法を指定します.

```csharp
public enum CombineMode
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| Replace | `0` | 1 つのクリッピング領域が別のクリッピング領域に置き換えられます。 |
| Intersect | `1` | 2 つのクリッピング領域が交差して結合されます。 |
| Union | `2` | 2 つのクリッピング領域は、両方の結合を取ることによって結合されます。 |
| Xor | `3` | 2 つのクリッピング領域は、両方ではなく、一方または他方の領域によって囲まれた領域のみを取得することによって結合されます。 |
| Exclude | `4` | 既存の領域から新しい領域が削除された結果、既存の領域が置き換えられることを指定します。 別の言い方をすれば、新しい領域は既存の領域から除外されます。 |
| Complement | `5` | 既存の領域が、新しい領域から削除された既存の領域の結果に置き換えられることを指定します。 別の言い方をすれば、既存の領域は新しい領域から除外されます。 |

### 関連項目

* 名前空間 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 組み立て [Aspose.Drawing](../../)


