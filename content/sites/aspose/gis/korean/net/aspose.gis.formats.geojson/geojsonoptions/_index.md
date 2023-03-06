---
title: Class GeoJsonOptions
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions 수업. GeoJSON 형식에 대한 드라이버별 옵션.
type: docs
weight: 310
url: /ko/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

GeoJSON 형식에 대한 드라이버별 옵션.

```csharp
public class GeoJsonOptions : DriverOptions
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | 문자열, 정수 또는 실수의 JSon 배열을 문자열로 노출할지 여부입니다. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | 속성 변환 제어: 예 - 모든 속성 건너뛰기 |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | 자동 생성 ids |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | 닫히지 않은 것을 닫았는지 여부를 결정합니다.LinearRing 각 지오메트리에서. 기본값은`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | 지오메트리의 각 세그먼트 중간에 새 포인트를 추가할지 여부를 결정합니다. 기본값은`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | JSon 날짜/시간/날짜-시간을 문자열로 노출할지 여부. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | 각 지오메트리에서 가까운 지점을 삭제할지 여부를 결정합니다. 기본값은`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | 거리 결정[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . 기본값은`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | 피처 컬렉션 수준의 설명(레이어 생성용) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | 도형 변환 제어: 예 - GeometryCollection type 로 도형을 래핑합니다. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | 곡선 형상을 선형화하는 데 사용할 공차입니다. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 도형이 추가될 때 M 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | 피처 컬렉션 수준의 이름(레이어 생성용) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | 중첩 속성의 구성 요소를 구분하는 데 사용되는 문자열을 가져오거나 설정합니다. 기본값은 "_"입니다. |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | 경계 상자('bbox')를 이름이 'bbox_0', 'bbox_1' 등인 속성으로 읽어야 하는지 결정합니다. 기본값은`false` . [`NestedPropertiesSeparator`](./nestedpropertiesseparator/) 문자열은 bbox_0, bbox_1,..에서 사용됩니다. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | 각 지오메트리에서 동일한 세그먼트에 있는 점을 삭제할지 여부를 결정합니다. 기본값은`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | 거리 결정[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . 기본값은`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | 도형이 레이어에 추가될 때 유효성을 검사해야 하는지 결정합니다. 다음으로 설정한 경우`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) 레이어에 추가될 때 각 도형에 대해 호출되고 유효성 검사가 실패하면([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) ~이다`false` ),[`GisException`](../../aspose.gis/gisexception/) 던졌습니다. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | GeoJSON 개체에 Geometries의 좌표 범위에 대한 정보를 포함해야 하는지 결정합니다. 다음으로 설정한 경우`true` , 멤버 "bbox"는 레이어에 추가될 때 각 도형(null이 아님)에 대해 생성됩니다. 기본값은`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | 다각형 또는 다중 다각형을 선스트링으로 변환할 수 있는지 여부를 결정합니다. 기본값은`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | 'null' 값을 추가하여 설정되지 않은 속성을 쓸지 여부 |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 도형이 추가될 때 X 및 Y 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 지오메트리가 추가되면 Z 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### 또한보십시오

* class [DriverOptions](../../aspose.gis/driveroptions/)
* 네임스페이스 [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* 집회 [Aspose.GIS](../../)


