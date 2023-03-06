---
title: GeoConvert.ParsePointText
second_title: Aspose.GIS for .NET API リファレンス
description: GeoConvert 方法. 座標を含む文字列を IPoint オブジェクトに変換します
type: docs
weight: 20
url: /ja/net/aspose.gis/geoconvert/parsepointtext/
---
## GeoConvert.ParsePointText method

座標を含む文字列を IPoint オブジェクトに変換します。

```csharp
public static IPoint ParsePointText(string text)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| text | String | 変換する座標を含む文字列. 文字列には座標の緯度と経度の両方が含まれている必要があります. 座標は空白、コンマ、またはセミコロンで区切られている必要があります. |

### 戻り値

入力文字列と同等の座標を持つ IPoint オブジェクト。

### 例外

| 例外 | 調子 |
| --- | --- |
| [GisException](../../gisexception/) |  |

### 備考

例: "80° 151°"、"74°50.82'、172°08.21'"、"80°;151°"、"2CMB"、"2CMB6682893142"、"2C MB 66828 93142"、"WMAQ12405535".

### 関連項目

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* 名前空間 [Aspose.Gis](../../geoconvert/)
* 組み立て [Aspose.GIS](../../../)


