---
title: Class SVGException
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.SVGException クラス. この例外は特定の SVG 操作を実行できない場合に発生します
type: docs
weight: 3230
url: /ja/net/aspose.svg/svgexception/
---
## SVGException class

この例外は、特定の SVG 操作を実行できない場合に発生します。

```csharp
public class SVGException : PlatformException
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [SVGException](svgexception/)(ushort) | の新しいインスタンスを初期化します`SVGException` class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Code](../../aspose.svg/svgexception/code/) { get; } | 要求された操作を実行できなかった理由を識別するコード。このメンバーの値は、SVGException コード グループの定数の 1 つになります。 |

## 田畑

| 名前 | 説明 |
| --- | --- |
| const [SVG_INVALID_VALUE_ERR](../../aspose.svg/svgexception/svg_invalid_value_err/) | 無効な値が操作に渡された場合、または属性に割り当てられた場合に発生します。 |
| const [SVG_MATRIX_NOT_INVERTABLE](../../aspose.svg/svgexception/svg_matrix_not_invertable/) | 反転できない行列を反転しようとすると発生します. |
| const [SVG_WRONG_TYPE_ERR](../../aspose.svg/svgexception/svg_wrong_type_err/) | 間違った型のオブジェクトが操作に渡されたときに発生します. |

### 関連項目

* class [PlatformException](../platformexception/)
* 名前空間 [Aspose.Svg](../../aspose.svg/)
* 組み立て [Aspose.SVG](../../)


