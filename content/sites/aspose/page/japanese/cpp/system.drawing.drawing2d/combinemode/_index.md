---
title: "System::Drawing::Drawing2D::CombineMode enum"
linktitle: "CombineMode"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::CombineMode 列挙体。C++ においてクリッピング領域がどのように結合されるかを指定します。"
type: docs
weight: 1400
url: /ja/cpp/system.drawing.drawing2d/combinemode/
---
## CombineMode enum


クリッピング領域の結合方法を指定します。

```cpp
enum class CombineMode
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| 置換 | 0 | あるクリッピング領域は別の領域に置き換えられます。 |
| 交差 | 1 | 2 つのクリッピング領域は交差部分を取ることで結合されます。 |
| 結合 | 2 | 2 つのクリッピング領域は両方の合併集合を取ることで結合されます。 |
| Xor | 3 | 2 つのクリッピング領域は、どちらか一方にのみ含まれる領域を取り、両方に含まれる領域は除外して結合されます。 |
| 除外 | 4 | 2 つのクリッピング領域は、最初の領域で第二の領域と交差しない部分の領域を取ることで結合されます。 |
| 補完 | 5 | 2 つのクリッピング領域は、第二の領域で最初の領域と交差しない部分の領域を取ることで結合されます。 |

## 参照

* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
