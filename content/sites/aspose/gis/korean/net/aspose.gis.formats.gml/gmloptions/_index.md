---
title: Class GmlOptions
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Formats.Gml.GmlOptions 수업. GML 형식에 대한 드라이버별 옵션.
type: docs
weight: 350
url: /ko/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

GML 형식에 대한 드라이버별 옵션.

```csharp
public class GmlOptions : DriverOptions
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [GmlOptions](gmloptions/)() | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | 닫히지 않은 것을 닫았는지 여부를 결정합니다.LinearRing 각 지오메트리에서. 기본값은`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | 지오메트리의 각 세그먼트 중간에 새 포인트를 추가할지 여부를 결정합니다. 기본값은`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | 각 지오메트리에서 가까운 지점을 삭제할지 여부를 결정합니다. 기본값은`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | 거리 결정[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . 기본값은`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | 곡선 형상을 선형화하는 데 사용할 공차입니다. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/) { get; set; } | Aspose.GIS가 인터넷에서 XML 스키마를 로드할 수 있는지 여부를 결정합니다. 다음으로 설정한 경우`false` 'file://'로 시작하지 않는 절대 URI가 있는 스키마는 로드되지 않습니다. 기본값은 다음과 같습니다.`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 도형이 추가될 때 M 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator/) { get; set; } | 중첩 속성의 구성 요소를 구분하는 데 사용되는 문자열을 가져오거나 설정합니다. 기본값은 "_"입니다. |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema/) { get; set; } | Aspose.GIS가 XML 스키마가 누락되었거나 로드할 수 없는 Gml 파일의 속성을 구문 분석할 수 있는지 여부를 결정합니다. 다음으로 설정한 경우`true` , Aspose.GIS 리더는 XML 스키마의 존재를 요구하지 않습니다. 기본값은`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation/) { get; set; } | 공백으로 구분된 URI 쌍 목록입니다. 모든 쌍의 첫 번째 URI는 네임스페이스의 URI이고, 두 번째 URI는 네임스페이스의 XML 스키마에 대한 경로입니다. `null` ,[`GmlDriver`](../gmldriver/) 문서의 루트 요소에서 schemaLocation 읽기를 시도합니다. 기본값은`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | 각 지오메트리에서 동일한 세그먼트에 있는 점을 삭제할지 여부를 결정합니다. 기본값은`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | 거리 결정[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . 기본값은`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | 도형이 레이어에 추가될 때 유효성을 검사해야 하는지 결정합니다. 다음으로 설정한 경우`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) 레이어에 추가될 때 각 도형에 대해 호출되고 유효성 검사가 실패하면([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) ~이다`false` ),[`GisException`](../../aspose.gis/gisexception/) 던졌습니다. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | 다각형 또는 다중 다각형을 선스트링으로 변환할 수 있는지 여부를 결정합니다. 기본값은`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver/) { get; set; } | A[`XmlResolver`](./xmlresolver/) 외부 리소스를 해결하는 데 사용됩니다. 기본값은XmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 도형이 추가될 때 X 및 Y 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) 지오메트리가 추가되면 Z 좌표 에 적용됩니다.[`VectorLayer`](../../aspose.gis/vectorlayer/) 또는[`VectorLayer`](../../aspose.gis/vectorlayer/) . 기본값은[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### 또한보십시오

* class [DriverOptions](../../aspose.gis/driveroptions/)
* 네임스페이스 [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml/)
* 집회 [Aspose.GIS](../../)


