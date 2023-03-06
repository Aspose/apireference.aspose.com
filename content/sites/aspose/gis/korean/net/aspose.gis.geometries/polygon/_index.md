---
title: Class Polygon
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Geometries.Polygon 수업. APolygon 1개의 외부 경계와 0개 이상의 내부 경계로 정의되는 평면 표면 입니다.
type: docs
weight: 1200
url: /ko/net/aspose.gis.geometries/polygon/
---
## Polygon class

A`Polygon` 1개의 외부 경계와 0개 이상의 내부 경계로 정의되는 평면 표면, 입니다.

```csharp
public class Polygon : Surface, IPolygon
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Polygon](polygon/#constructor)() | 의 새 인스턴스를 초기화합니다.`Polygon` 클래스. |
| [Polygon](polygon/#constructor_1)(ILinearRing) | 의 새 인스턴스를 초기화합니다.`Polygon` 클래스. |
| [Polygon](polygon/#constructor_2)(ILinearRing, IEnumerable&lt;ILinearRing&gt;) | 의 새 인스턴스를 초기화합니다.`Polygon` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | 이것에 대한 좌표 차원의 수를 가져옵니다.[`Geometry`](../geometry/) . |
| [Dimension](../../aspose.gis.geometries/surface/dimension/) { get; } | 이것의 토폴로지 차원을 가져옵니다.[`Geometry`](../geometry/) . |
| [ExteriorRing](../../aspose.gis.geometries/polygon/exteriorring/) { get; set; } | 외부 링을 가져옵니다. |
| override [GeometryType](../../aspose.gis.geometries/polygon/geometrytype/) { get; } | 지오메트리 유형을 가져옵니다. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | 이 도형이 곡선(선형 아님) 도형인지 또는 포함하는지 나타내는 값을 가져옵니다. |
| override [HasM](../../aspose.gis.geometries/polygon/hasm/) { get; set; } | 이 인스턴스에 M 좌표가 있는지 여부를 나타내는 값을 가져옵니다. |
| override [HasZ](../../aspose.gis.geometries/polygon/hasz/) { get; set; } | 이 인스턴스에 Z 좌표가 있는지 여부를 나타내는 값을 가져옵니다. |
| [InteriorRingsCount](../../aspose.gis.geometries/polygon/interiorringscount/) { get; } | 내부 링의 수를 가져옵니다. |
| override [IsEmpty](../../aspose.gis.geometries/polygon/isempty/) { get; } | 이 인스턴스가 비어 있는지 여부를 나타내는 값을 가져옵니다. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | 이 인스턴스가 SFA 관점에서 단순한지 여부를 나타내는 값을 가져옵니다. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | 이 인스턴스가 유효한지 여부를 나타내는 값을 가져옵니다. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/polygon/spatialreferencesystem/) { get; set; } | 이 인스턴스의 SpatialReferenceSystem을 가져옵니다. 이 속성은 다음과 같을 수 있습니다.`null` , SpatialReferenceSystem is unknown. 새 SpatialReferenceSystem을 할당하면 좌표 변환이 수행되지 않고 참조만 변경됩니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [AddInteriorRing](../../aspose.gis.geometries/polygon/addinteriorring/)(ILinearRing) | 내부 링을 추가합니다. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | 이 기하학을 Well-Known Binary 표현으로 변환합니다. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | 이 기하학을 Well-Known Binary 표현으로 변환합니다. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | 이 형상을 이미지 표현으로 내보냅니다. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | 이 형상을 이미지 표현으로 내보냅니다. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | 이 형상을 이미지 표현으로 내보냅니다. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | 이 기하학을 Well-Known Text 표현으로 변환합니다. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | 이 기하학을 Well-Known Text 표현으로 변환합니다. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | 이 기하학을 Well-Known Text 표현으로 변환합니다. |
| override [Clone](../../aspose.gis.geometries/polygon/clone/)() | 이 인스턴스를 복제합니다. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | 이 기하 구조가 지정된 기하 구조로 덮여 있는지 여부를 결정합니다. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | 이 기하학이 지정된 기하학을 포함하는지 여부를 결정합니다. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | 이 기하학과 지정된 기하학이 교차하는지 결정합니다. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | 이 기하학에서 지정된 기하학을 뺍니다. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | 이 도형이 지정된 도형과 분리되어 있는지 확인합니다. |
| [Equals](../../aspose.gis.geometries/polygon/equals/#equals)(ICurvePolygon) | 지정된 개체가 현재 개체와 같은지 여부를 확인합니다. |
| [Equals](../../aspose.gis.geometries/polygon/equals/#equals_1)(IPolygon) | 지정된 개체가 현재 개체와 같은지 여부를 확인합니다. |
| override [Equals](../../aspose.gis.geometries/polygon/equals/#equals_2)(object) | 지정된 개체가 현재 개체와 같은지 여부를 확인합니다. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | 이 기하학의 면적을 계산합니다. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | 이 기하학 주변의 버퍼 영역을 계산합니다. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | 이 지오메트리의 중심을 계산합니다. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | 이 형상의 볼록 껍질을 계산합니다. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | 이 기하학과 지정된 기하학 사이의 최소 거리를 계산합니다. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | 이 기하학의 경계 범위를 계산하고 반환합니다. |
| override [GetHashCode](../../aspose.gis.geometries/polygon/gethashcode/)() | 기본 해시 함수 역할을 합니다. |
| [GetInteriorRing](../../aspose.gis.geometries/polygon/getinteriorring/)(int) | 인덱스로 내부 링을 가져옵니다. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | 이 기하학의 길이를 계산합니다. |
| override [GetPointOnSurface](../../aspose.gis.geometries/polygon/getpointonsurface/)() | 이 폴리곤에 있다고 보장되는 점을 찾습니다. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | 이 기하학과 지정된 기하학 사이의 교차점을 만듭니다. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | 이 기하학이 지정된 범위와 교차하는지 여부를 결정합니다. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | 이 기하학과 지정된 기하학이 교차하는지 결정합니다. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | 이 기하학이 지정된 기하학과 겹치는지 여부를 결정합니다. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | 이 기하학과 지정된 기하학의 DE-9IM 교차 행렬이 제공된 패턴과 일치하는지 결정합니다. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | 이 도형의 선으로 표현되는 다각형을 가져옵니다. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | M 좌표를 지정된 소수 자릿수로 반올림합니다. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | X 및 Y 좌표를 지정된 소수 자릿수로 반올림합니다. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Z 좌표를 지정된 소수 자릿수로 반올림합니다. |
| override [SetEmpty](../../aspose.gis.geometries/polygon/setempty/)() | 이렇게 만듭니다[`Geometry`](../geometry/) 비어 있습니다. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | 이 도형이 지정된 도형을 공간적으로 포함하는지 여부를 결정합니다. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | 이 기하학이 지정된 기하학과 공간적으로 동일한지 결정합니다. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | 이 지오메트리와 지정된 지오메트리 간의 대칭 차이를 만듭니다. |
| [ToEditable](../../aspose.gis.geometries/polygon/toeditable/#toeditable_1)() | 이 지오메트리의 편집 가능한 복사본을 가져옵니다. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | 이 지오메트리의 편집 가능한 복사본을 가져옵니다. |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/)() | 기본값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/surface/tolineargeometry/)(double) | 지정된 값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | 이 기하학과 지정된 기하학이 접촉하는지 결정합니다. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | 이 기하학과 지정된 기하학을 통합합니다. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | 이 기하학이 지정된 범위 내에 있는지 여부를 결정합니다. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | 이 기하학이 지정된 기하학 내에 있는지 여부를 결정합니다. |
| [operator ==](../../aspose.gis.geometries/polygon/op_equality/) | ==. 연산자 구현 |
| [operator !=](../../aspose.gis.geometries/polygon/op_inequality/) | 연산자 구현 !=. |

### 또한보십시오

* class [Surface](../surface/)
* interface [IPolygon](../ipolygon/)
* 네임스페이스 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 집회 [Aspose.GIS](../../)


