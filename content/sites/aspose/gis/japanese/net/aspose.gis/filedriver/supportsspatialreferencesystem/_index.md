---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS for .NET API リファレンス
description: FileDriver 方法. 指定された空間参照系がドライバーでサポートされているかどうかを判断します
type: docs
weight: 100
url: /ja/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

指定された空間参照系がドライバーでサポートされているかどうかを判断します。

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | 空間参照系。 |

### 戻り値

指定された空間参照系がドライバーでサポートされているかどうかを示すブール値。`null`任意のドライバーでサポートされていると見なされます.

### 備考

空間参照系がサポートされておらず、それをに渡す場合[`CreateLayer`](../createlayer/)メソッド, aNotSupportedExceptionスローされます.

### 関連項目

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)


