---
title: PostGisDriver.OpenDataset
second_title: Aspose.GIS for .NET API リファレンス
description: PostGisDriver 方法. データセットを開きます
type: docs
weight: 10
url: /ja/net/aspose.gis.formats.postgis/postgisdriver/opendataset/
---
## PostGisDriver.OpenDataset method

データセットを開きます。

```csharp
public override Dataset OpenDataset(IDbConnection connection)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| connection | IDbConnection | データベースへの接続を開きました。 |

### 戻り値

のインスタンス[`Dataset`](../../../aspose.gis/dataset/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 接続は`null`. |
| [GisException](../../../aspose.gis/gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [Dataset](../../../aspose.gis/dataset/)
* class [PostGisDriver](../)
* 名前空間 [Aspose.Gis.Formats.PostGis](../../postgisdriver/)
* 組み立て [Aspose.GIS](../../../)


