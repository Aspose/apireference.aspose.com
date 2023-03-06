---
title: Class GpxOptions
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Formats.Gpx.GpxOptions 수업. GPX 형식에 대한 드라이버별 옵션.
type: docs
weight: 370
url: /ko/net/aspose.gis.formats.gpx/gpxoptions/
---
## GpxOptions class

GPX 형식에 대한 드라이버별 옵션.

```csharp
public class GpxOptions : DriverOptions
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [GpxOptions](gpxoptions/)() | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | 닫히지 않은 것을 닫았는지 여부를 결정합니다.LinearRing 각 지오메트리에서. 기본값은`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | 지오메트리의 각 세그먼트 중간에 새 포인트를 추가할지 여부를 결정합니다. 기본값은`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | 각 지오메트리에서 가까운 지점을 삭제할지 여부를 결정합니다. 기본값은`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | 거리 결정[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . 기본값은`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | 곡선 형상을 선형화하는 데 사용할 공차입니다. |
| [MAttribute](../../aspose.gis.formats.gpx/gpxoptions/mattribute/) { get; set; } | 웨이포인트, 루트 포인트 및 트랙 포인트의 'M' 좌표로 내보낼 GPX 속성을 결정합니다. 동작은 다음과 동일합니다.[`ZAttribute`](./zattribute/) , 기본값은`null` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 도형이 추가될 때 M 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedAttributeSeparator](../../aspose.gis.formats.gpx/gpxoptions/nestedattributeseparator/) { get; } | 중첩된 속성 이름과 해당 인덱스를 구분하는 문자열입니다. 이중 밑줄 "__"이 기본값입니다. |
| [ReadNestedAttributes](../../aspose.gis.formats.gpx/gpxoptions/readnestedattributes/) { get; set; } | 'trkpt' 및 'rtept'와 같은 GPX 포인트에 내부 속성이 포함되어 있는지와 읽어야 하는지 여부를 결정합니다. 기본값은`false` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | 각 지오메트리에서 동일한 세그먼트에 있는 점을 삭제할지 여부를 결정합니다. 기본값은`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | 거리 결정[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . 기본값은`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | 도형이 레이어에 추가될 때 유효성을 검사해야 하는지 결정합니다. 다음으로 설정한 경우`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) 레이어에 추가될 때 각 도형에 대해 호출되고 유효성 검사가 실패하면([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) ~이다`false` ),[`GisException`](../../aspose.gis/gisexception/) 던졌습니다. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | 다각형 또는 다중 다각형을 선스트링으로 변환할 수 있는지 여부를 결정합니다. 기본값은`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 도형이 추가될 때 X 및 Y 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZAttribute](../../aspose.gis.formats.gpx/gpxoptions/zattribute/) { get; set; } | 웨이포인트, 루트 포인트 및 트랙 포인트의 'Z' 좌표로 내보낼 GPX 속성을 결정합니다. If`null` 어떤 속성도 'Z' 좌표로 내보내지지 않습니다. 기본값은 "ele"입니다. 가능한 값은 이중으로 표현될 수 있는 모든 GPX XML 속성의 이름입니다(예: "speed", "magvar", "geoidheight" 등). ) |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 지오메트리가 추가되면 Z 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### 또한보십시오

* class [DriverOptions](../../aspose.gis/driveroptions/)
* 네임스페이스 [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx/)
* 집회 [Aspose.GIS](../../)


