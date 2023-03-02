---
title: FileGdbOptions.ZTolerance
second_title: Aspose.GIS for .NET API リファレンス
description: FileGdbOptions 財産. Z スナップ許容値.
type: docs
weight: 80
url: /ja/net/aspose.gis.formats.filegdb/filegdboptions/ztolerance/
---
## FileGdbOptions.ZTolerance property

Z スナップ許容値.

```csharp
public double? ZTolerance { get; set; }
```

### 備考

これは作成オプションであり、読み取りには影響しません。 このパラメーターは、高度な ArcGIS 機能に使用されるスナップ許容値を制御します。 Aspose.GIS の動作には影響しませんが、ArcGIS で使用できます。 パラメーターの単位空間参照系の単位です。 に設定した場合`null` 、デフォルトが使用されます。空間参照系が unknown であるか、3 次元未満の場合、デフォルトは 0.001 です。空間参照系に 3 つの次元がある場合 デフォルトは、3 番目の次元の単位に変換された 0.001 メートルです.

### 関連項目

* class [FileGdbOptions](../)
* 名前空間 [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* 組み立て [Aspose.GIS](../../../)


