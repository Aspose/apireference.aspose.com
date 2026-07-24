---
title: "System::Drawing::CopyPixelOperation 列挙型"
linktitle: "CopyPixelOperation"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::CopyPixelOperation 列挙型。ピクセルコピー操作におけるソースカラーがデスティネーションカラーとどのように結合され、最終的なカラーになるかを C++ で指定します。"
type: docs
weight: 3000
url: /ja/cpp/system.drawing/copypixeloperation/
---
## CopyPixelOperation enum


ピクセルコピー操作において、ソースカラーがデスティネーションカラーとどのように合成されて最終的なカラーになるかを指定します。

```cpp
enum class CopyPixelOperation
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| NoMirrorBitmap | n/a | ビットマップはミラーリングされません。 |
| Blackness | 66 | デスティネーション領域は、物理パレットのインデックス 0 のカラーを使用して塗りつぶされます。 |
| NotSourceErase | 1114278 | ソースカラーとデスティネーションカラーは OR 演算され、結果のカラーは反転されます。 |
| NotSourceCopy | 3342344 | ソース領域が反転され、次にデスティネーションにコピーされます。 |
| SourceErase | 4457256 | 宛先領域の反転した色は、ソース領域の色とAND演算されます。 |
| DestinationInvert | 5570569 | 宛先領域が反転します。 |
| PatInvert | 5898313 | 宛先デバイスコンテキストで現在選択されているブラシの色は、宛先の色とXOR演算されます。 |
| SourceInvert | 6684742 | ソース領域と宛先領域の色はXOR演算されます。 |
| SourceAnd | 8913094 | ソース領域と宛先領域の色はAND演算されます。 |
| MergePaint | 12255782 | 反転したソース領域の色は、宛先領域の色とOR演算されます。 |
| MergeCopy | 12583114 | ソース領域の色は、宛先デバイスコンテキストで選択されたブラシの色とAND演算されます。 |
| SourceCopy | 13369376 | ソース領域が直接宛先領域にコピーされます。 |
| SourcePaint | 15597702 | ソース領域と宛先領域の色が OR 演算されます。 |
| PatCopy | 15728673 | 宛先デバイスコンテキストで現在選択されているブラシが宛先ビットマップにコピーされます。 |
| PatPaint | 16452105 | 宛先デバイスコンテキストで現在選択されているブラシの色は、反転されたソース領域の色と OR 演算されます。この操作の結果は、宛先領域の色と OR 演算されます。 |
| Whiteness | 16711778 | 宛先領域は、物理パレットのインデックス 1 の色を使用して塗りつぶされます。 |
| CaptureBlt | 1073741824 | [Windows](../../system.windows/) がアプリケーションのウィンドウの上にレイヤーとして重ねられている場合、結果画像に含まれます。 |

## 参照

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
