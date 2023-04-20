---
title: Class SVGAngle
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.DataTypes.SVGAngle クラス. SVGAngle インターフェイスは角度の基本データ型に対応します
type: docs
weight: 80
url: /ja/net/aspose.svg.datatypes/svgangle/
---
## SVGAngle class

SVGAngle インターフェイスは、角度の基本データ型に対応します。

```csharp
public class SVGAngle : SVGValueType
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svgangle/unittype/) { get; } | このインターフェイスで定義された SVG_ANGLETYPE_* 定数の 1 つによって指定された値の型。 |
| [Value](../../aspose.svg.datatypes/svgangle/value/) { get; set; } | 浮動小数点値としての角度値 (度単位)。この属性を設定すると、valueInSpecifiedUnits と valueAsString が自動的に更新され、この設定が反映されます。 |
| [ValueAsString](../../aspose.svg.datatypes/svgangle/valueasstring/) { get; set; } | unitType で表される単位の文字列値としての角度値。この属性を設定すると、値、valueInSpecifiedUnits、および unitType が自動的に更新され、この設定が反映されます。 |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svgangle/valueinspecifiedunits/) { get; set; } | unitType で表される単位の浮動小数点値としての角度値。この属性を設定すると、値と valueAsString が自動的に更新され、この設定が反映されます。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svgangle/converttospecifiedunits/)(ushort) | 基礎となる保存された同じ値を保持しますが、保存されたユニット識別子を指定された unitType にリセットします。オブジェクト属性 unitType、valueInSpecifiedUnits、および valueAsString は、このメソッドの結果として変更される可能性があります. |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | 管理されていないリソースと、オプションで管理されているリソースを解放します。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svgangle/newvaluespecifiedunits/)(ushort, float) | 関連付けられた unitType を持つ数値として値をリセットし、オブジェクトのすべての属性の値を置き換えます。 |
| override [ToString](../../aspose.svg.datatypes/svgangle/tostring/)() | を返しますStringこのインスタンスを表す. |

## 田畑

| 名前 | 説明 |
| --- | --- |
| const [SVG_ANGLETYPE_DEG](../../aspose.svg.datatypes/svgangle/svg_angletype_deg/) | 単位の種類が明示的に度に設定されました. |
| const [SVG_ANGLETYPE_GRAD](../../aspose.svg.datatypes/svgangle/svg_angletype_grad/) | 単位の種類はラジアンです。 |
| const [SVG_ANGLETYPE_RAD](../../aspose.svg.datatypes/svgangle/svg_angletype_rad/) | 単位の種類はラジアンです。 |
| const [SVG_ANGLETYPE_UNKNOWN](../../aspose.svg.datatypes/svgangle/svg_angletype_unknown/) | ユニット タイプは、定義済みのユニット タイプの 1 つではありません。この型の新しい値を定義しようとしたり、既存の値をこの型に切り替えようとしたりすることは無効です. |
| const [SVG_ANGLETYPE_UNSPECIFIED](../../aspose.svg.datatypes/svgangle/svg_angletype_unspecified/) | 単位の種類が指定されていません (つまり、単位のない値が指定されました)。角度の場合、単位のない値は度が指定された場合と同じように扱われます. |

### 関連項目

* class [SVGValueType](../svgvaluetype/)
* 名前空間 [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* 組み立て [Aspose.SVG](../../)


