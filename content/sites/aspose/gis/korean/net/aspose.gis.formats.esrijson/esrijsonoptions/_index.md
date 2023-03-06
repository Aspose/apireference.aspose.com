---
title: Class EsriJsonOptions
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Formats.EsriJson.EsriJsonOptions 수업. EsriJson 형식의 드라이버별 옵션.
type: docs
weight: 240
url: /ko/net/aspose.gis.formats.esrijson/esrijsonoptions/
---
## EsriJsonOptions class

EsriJson 형식의 드라이버별 옵션.

```csharp
public class EsriJsonOptions : DriverOptions
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [EsriJsonOptions](esrijsonoptions/)() | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | 닫히지 않은 것을 닫았는지 여부를 결정합니다.LinearRing 각 지오메트리에서. 기본값은`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | 지오메트리의 각 세그먼트 중간에 새 포인트를 추가할지 여부를 결정합니다. 기본값은`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | 각 지오메트리에서 가까운 지점을 삭제할지 여부를 결정합니다. 기본값은`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | 거리 결정[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . 기본값은`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | 곡선 형상을 선형화하는 데 사용할 공차입니다. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 도형이 추가될 때 M 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.esrijson/esrijsonoptions/nestedpropertiesseparator/) { get; set; } | 중첩 속성의 구성 요소를 구분하는 데 사용되는 문자열을 가져오거나 설정합니다. 기본값은 "_"입니다. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | 각 지오메트리에서 동일한 세그먼트에 있는 점을 삭제할지 여부를 결정합니다. 기본값은`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | 거리 결정[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . 기본값은`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | 도형이 레이어에 추가될 때 유효성을 검사해야 하는지 결정합니다. 다음으로 설정한 경우`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) 레이어에 추가될 때 각 도형에 대해 호출되고 유효성 검사가 실패하면([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) ~이다`false` ),[`GisException`](../../aspose.gis/gisexception/) 던졌습니다. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | 다각형 또는 다중 다각형을 선스트링으로 변환할 수 있는지 여부를 결정합니다. 기본값은`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 도형이 추가될 때 X 및 Y 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 지오메트리가 추가되면 Z 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### 또한보십시오

* class [DriverOptions](../../aspose.gis/driveroptions/)
* 네임스페이스 [Aspose.Gis.Formats.EsriJson](../../aspose.gis.formats.esrijson/)
* 집회 [Aspose.GIS](../../)


