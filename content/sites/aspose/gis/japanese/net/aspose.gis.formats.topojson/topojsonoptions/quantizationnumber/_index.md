---
title: TopoJsonOptions.QuantizationNumber
second_title: Aspose.GIS for .NET API リファレンス
description: TopoJsonOptions 財産. 出力 TopoJSON で座標を量子化し円弧をデルタ エンコードするために使用する量子化数を指定します
type: docs
weight: 50
url: /ja/net/aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/
---
## TopoJsonOptions.QuantizationNumber property

出力 TopoJSON で座標を量子化し、円弧をデルタ エンコードするために使用する量子化数を指定します。

```csharp
public int? QuantizationNumber { get; set; }
```

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | 引数が 2 未満です。 |

### 備考

これは書き込みオプションです - 読み取りには影響しません. このオプションは相互に排他的です[`Transform`](../transform/) この 2 つのオプションのうちの 1 つだけを使用することはできません`null`. そうでない場合`null` - 出力 TopoJSON 座標は量子化され、アークは指定された 量子化番号でデルタ エンコードされます。量子化数は、結果として得られる量子化された座標で、dimension ごとに表現可能な値の最大数を決定します。通常、10 の累乗が選択されます。 デフォルトは`null` .

### 関連項目

* class [TopoJsonOptions](../)
* 名前空間 [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* 組み立て [Aspose.GIS](../../../)


