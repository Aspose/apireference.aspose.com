---
title: DatabaseDriver.OpenDataset
second_title: Aspose.GIS for .NET API リファレンス
description: DatabaseDriver 方法. データセットを開きます
type: docs
weight: 10
url: /ja/net/aspose.gis/databasedriver/opendataset/
---
## DatabaseDriver.OpenDataset method

データセットを開きます。

```csharp
public abstract Dataset OpenDataset(IDbConnection connection)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| connection | IDbConnection | データベースへの接続を開きました。 |

### 戻り値

のインスタンス[`Dataset`](../../dataset/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 接続は`null`. |
| [GisException](../../gisexception/) | データセットの読み取りエラー。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [Dataset](../../dataset/)
* class [DatabaseDriver](../)
* 名前空間 [Aspose.Gis](../../databasedriver/)
* 組み立て [Aspose.GIS](../../../)


