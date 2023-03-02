---
title: GdalDriver.CreateLayer
second_title: .NET API 참조를 위한 Aspose.GIS
description: GdalDriver 방법. 레이어를 생성하고 새 기능을 추가하기 위해 엽니다.
type: docs
weight: 40
url: /ko/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

레이어를 생성하고 새 기능을 추가하기 위해 엽니다.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| options | DriverOptions | 드라이버별 옵션. |
| spatialReferenceSystem | SpatialReferenceSystem | 공간 참조 시스템. |

### 반환 값

인스턴스[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| InvalidOperationException | 레이어가 이미 존재합니다. |
| NotSupportedException | 드라이버에서 공간 참조 시스템을 지원하지 않습니다. |

### 또한보십시오

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* 네임스페이스 [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* 집회 [Aspose.GIS](../../../)


