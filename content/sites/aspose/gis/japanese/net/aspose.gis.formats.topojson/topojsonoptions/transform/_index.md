---
title: TopoJsonOptions.Transform
second_title: Aspose.GIS for .NET API リファレンス
description: TopoJsonOptions 財産. 出力 TopoJSON で座標を量子化し円弧をデルタ エンコードするために使用する変換オブジェクトを指定します
type: docs
weight: 60
url: /ja/net/aspose.gis.formats.topojson/topojsonoptions/transform/
---
## TopoJsonOptions.Transform property

出力 TopoJSON で座標を量子化し、円弧をデルタ エンコードするために使用する変換オブジェクトを指定します。

```csharp
public TopoJsonTransform Transform { get; set; }
```

### 備考

これは書き込みオプションです - 読み取りには影響しません. このオプションは相互に排他的です[`QuantizationNumber`](../quantizationnumber/) この 2 つのオプションのうちの 1 つだけを使用することはできません`null`. そうでない場合`null` 出力 TopoJSON 座標は量子化され、円弧は指定された 変換オブジェクトでデルタ エンコードされます。 変換オブジェクトの詳細については、TopoJSON 仕様を参照してください。 デフォルトは`null` .

### 関連項目

* class [TopoJsonTransform](../../topojsontransform/)
* class [TopoJsonOptions](../)
* 名前空間 [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* 組み立て [Aspose.GIS](../../../)


