---
title: GeoConvert.TryParsePointText
second_title: Aspose.GIS for .NET API リファレンス
description: GeoConvert 方法. 座標を含む文字列を IPoint オブジェクトに変換します戻り値は変換が成功したか失敗したかを示します.
type: docs
weight: 30
url: /ja/net/aspose.gis/geoconvert/tryparsepointtext/
---
## GeoConvert.TryParsePointText method

座標を含む文字列を IPoint オブジェクトに変換します。戻り値は、変換が成功したか失敗したかを示します.

```csharp
public static bool TryParsePointText(string text, out IPoint point)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| text | String | 変換する座標を含む文字列. 文字列には座標の緯度と経度の両方が含まれている必要があります. 座標は空白、コンマ、またはセミコロンで区切られている必要があります. |
| point | IPoint& | このメソッドが返されるときに、変換が成功した場合は解析された座標を持つ IPoint オブジェクトを含み、変換が失敗した場合は null を含みます。 |

### 戻り値

テキストが正常に解析された場合は True、それ以外の場合は False。

### 備考

例: "80° 151°"、"74°50.82'、172°08.21'"、"80°;151°"、"2CMB"、"2CMB6682893142"、"2C MB 66828 93142"、"WMAQ12405535".

### 関連項目

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* 名前空間 [Aspose.Gis](../../geoconvert/)
* 組み立て [Aspose.GIS](../../../)


