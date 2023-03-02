---
title: Enum SpatialReferenceSystemMode
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferenceSystemMode 列挙. 不明な SRS の場合database に書き込む空間参照システム SRS のモードを指定します
type: docs
weight: 2020
url: /ja/net/aspose.gis/spatialreferencesystemmode/
---
## SpatialReferenceSystemMode enumeration

不明な SRS の場合、database に書き込む空間参照システム (SRS) のモードを指定します。

```csharp
public enum SpatialReferenceSystemMode
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| ThrowException | `0` | データベースの不明な SRS である場合は、例外をスローします。 |
| WriteInSystemTable | `1` | データベースの不明な SRS である場合は、システム テーブルに SRS 情報を書き込みます。 |
| SetupToZero | `2` | データベースの未知の SRS である場合、ジオメトリの SRID を「ゼロ」に設定します。 |

### 関連項目

* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


