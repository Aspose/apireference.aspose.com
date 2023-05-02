---
title: Enum StringFormatFlags
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.StringFormatFlags 列挙. テキスト文字列の表示およびレイアウト情報を指定します
type: docs
weight: 1140
url: /ja/net/system.drawing/stringformatflags/
---
## StringFormatFlags enumeration

テキスト文字列の表示およびレイアウト情報を指定します。

```csharp
[Flags]
public enum StringFormatFlags
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| DirectionRightToLeft | `1` | テキストは右から左に表示されます. |
| DirectionVertical | `2` | テキストは垂直方向に配置されます。 |
| FitBlackBox | `4` | 文字の一部が文字列のレイアウト四角形からオーバーハングすることが許可されます. デフォルトでは、文字はオーバーハングを避けるために再配置されます. |
| DisplayFormatControl | `20` | 左から右へのマークなどの制御文字は、代表的なグリフとともに出力に表示されます。 |
| NoFontFallback | `400` | 要求されたフォントでサポートされていない文字の代替フォントへのフォールバックは無効になっています. 欠落している文字は、フォントに欠落しているグリフで表示されます. |
| MeasureTrailingSpaces | `800` | 各行の末尾に末尾のスペースを含めます. デフォルトでは、MeasureString メソッドによって返される境界四角形は、各行の末尾にあるスペースを除外します. このフラグを設定して、そのスペースを測定に含めます. |
| NoWrap | `1000` | 四角形内の書式設定が無効な場合の行間のテキスト折り返し. このフラグは、四角形の代わりにポイントが渡された場合、 、または指定された四角形の行の長さがゼロの場合に暗示されます. |
| LineLimit | `2000` | 行全体のみが書式設定用の四角形に配置されます。 デフォルトでは、テキストの終わりまで、 、またはクリッピングの結果としてそれ以上の行が表示されなくなるまで、レイアウトが続きます。 デフォルト設定では、最後の行は、行の高さの倍数ではない書式設定のrectangle によって部分的に隠されます。行全体のみが表示されるようにするには、 この値を指定し、少なくとも 1 行の高さと同じ高さの形式のrectangle を提供するように注意してください. |
| NoClip | `4000` | グリフのはみ出した部分、および整形四角形の外側に達するラップされていないテキストを表示できます. デフォルトでは、すべてのテキストと整形四角形の外側に達するグリフ部分はクリップされます. |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


