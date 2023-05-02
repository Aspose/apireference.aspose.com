---
title: Enum CopyPixelOperation
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.CopyPixelOperation 列挙. コピー ピクセル操作のソース カラーをターゲット カラーと組み合わせて最終的なカラーを生成する方法を決定します
type: docs
weight: 120
url: /ja/net/system.drawing/copypixeloperation/
---
## CopyPixelOperation enumeration

コピー ピクセル操作のソース カラーをターゲット カラーと組み合わせて最終的なカラーを生成する方法を決定します。

```csharp
public enum CopyPixelOperation
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| NoMirrorBitmap | `-2147483648` | ビットマップはミラー化されていません。 |
| Blackness | `66` | 宛先領域は、物理パレットのインデックス 0 に関連付けられた色を使用して塗りつぶされます。 (この色はデフォルトの物理パレットでは黒です。) |
| NotSourceErase | `1114278` | ソースと宛先の色は、ブール値を使用して結合されます`また`演算子、そして結果の色が反転されます. |
| NotSourceCopy | `3342344` | 反転されたソース領域がコピー先にコピーされます. |
| SourceErase | `4457256` | ブール値を使用して、宛先領域の反転色がソース領域の色と組み合わされます`と`operator. |
| DestinationInvert | `5570569` | 宛先領域が反転しています。 |
| PatInvert | `5898313` | 宛先デバイス コンテキストで現在選択されているブラシの色は、 宛先の色がブール値を使用して結合されます`XOR`operator. |
| SourceInvert | `6684742` | ソース領域と宛先領域の色は、ブール値を使用して結合されます`XOR`operator. |
| SourceAnd | `8913094` | ソース領域と宛先領域の色は、ブール値を使用して結合されます`と`operator. |
| MergePaint | `12255782` | ブール値`また`operator. |
| MergeCopy | `12583114` | ソース領域の色は、ブール値`と`operator. |
| SourceCopy | `13369376` | ソース領域が宛先領域に直接コピーされます. |
| SourcePaint | `15597702` | ソース領域と宛先領域の色は、ブール値を使用して結合されます`また`operator. |
| PatCopy | `15728673` | 宛先デバイス コンテキストで現在選択されているブラシが、宛先ビットマップにコピーされます。 |
| PatPaint | `16452105` | 宛先デバイス コンテキストで現在選択されているブラシの色は、ブール値`また`オペレーター。 この操作の結果は、ブール値を使用して宛先領域の色と組み合わされます。`また`operator. |
| Whiteness | `16711778` | 宛先領域は、物理パレットのインデックス 1 に関連付けられた色を使用して塗りつぶされます。 (この色は、既定の物理パレットでは白です。) |
| CaptureBlt | `1073741824` | ウィンドウの上に重ねられたウィンドウが結果の画像に含まれます。 デフォルトでは、画像にはウィンドウのみが含まれます。これは通常、デバイスコンテキストの印刷には使用できないことに注意してください. |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


