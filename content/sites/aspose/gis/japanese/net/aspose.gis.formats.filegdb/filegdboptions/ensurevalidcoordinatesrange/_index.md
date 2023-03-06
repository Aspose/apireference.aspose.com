---
title: FileGdbOptions.EnsureValidCoordinatesRange
second_title: Aspose.GIS for .NET API リファレンス
description: FileGdbOptions 財産. 座標が有効な範囲内にあるかどうか.
type: docs
weight: 30
url: /ja/net/aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/
---
## FileGdbOptions.EnsureValidCoordinatesRange property

座標が有効な範囲内にあるかどうか.

```csharp
public bool EnsureValidCoordinatesRange { get; set; }
```

### 備考

これは作成オプションであり、読み取りには影響しません。 に設定した場合`true`有効な範囲外の values で座標を書き込もうとすると、例外がスローされます。に設定した場合`false`そのような座標はサイレントに書き込まれます. 有効な範囲は次のように定義されます[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/).参照する[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) ドキュメントを参照して、座標精度グリッドから有効な範囲を決定する方法を確認してください。 デフォルトは`false` .

### 関連項目

* class [FileGdbOptions](../)
* 名前空間 [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* 組み立て [Aspose.GIS](../../../)


