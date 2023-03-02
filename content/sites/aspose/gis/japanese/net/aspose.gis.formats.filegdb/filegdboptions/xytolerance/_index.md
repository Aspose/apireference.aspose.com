---
title: FileGdbOptions.XYTolerance
second_title: Aspose.GIS for .NET API リファレンス
description: FileGdbOptions 財産. X および Y スナップ許容値.
type: docs
weight: 70
url: /ja/net/aspose.gis.formats.filegdb/filegdboptions/xytolerance/
---
## FileGdbOptions.XYTolerance property

X および Y スナップ許容値.

```csharp
public double? XYTolerance { get; set; }
```

### 備考

これは作成オプションであり、読み取りには影響しません。 このパラメーターは、高度な ArcGIS 機能に使用されるスナップ許容値を制御します。 Aspose.GIS の動作には影響しませんが、ArcGIS で使用できます。 パラメーターの単位空間参照系の単位です。 に設定した場合`null`、デフォルトが使用されます。デフォルトは、空間参照システム に依存し、地理システムの場合は 0.000000008983153 度、投影システムの場合は 0.001 メートルです (値は空間参照システムの単位に変換されます). 空間参照システムが不明な場合、デフォルトは 0.001. です。

### 関連項目

* class [FileGdbOptions](../)
* 名前空間 [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* 組み立て [Aspose.GIS](../../../)


