---
title: Class LinearRing
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Geometries.LinearRing 수업. ALinearRing 이다LineString 폐쇄적이고 단순합니다.
type: docs
weight: 1130
url: /ko/net/aspose.gis.geometries/linearring/
---
## LinearRing class

A`LinearRing` 이다[`LineString`](../linestring/) 폐쇄적이고 단순합니다.

```csharp
public class LinearRing : LineString, ILinearRing
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [LinearRing](linearring/#constructor)() | 의 새 인스턴스를 초기화합니다.`LinearRing` 클래스. |
| [LinearRing](linearring/#constructor_2)(IEnumerable&lt;IPoint&gt;) | 의 새 인스턴스를 초기화합니다.`LinearRing` 클래스. |
| [LinearRing](linearring/#constructor_1)(ILineString) | 의 새 인스턴스를 초기화합니다.`LinearRing` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | 이것에 대한 좌표 차원의 수를 가져옵니다.[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/linestring/count/) { get; } | 에 있는 포인트 수를 가져옵니다.[`LineString`](../linestring/) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | 이것의 토폴로지 차원을 가져옵니다.[`Geometry`](../geometry/) . |
| override [EndPoint](../../aspose.gis.geometries/linestring/endpoint/) { get; } | 곡선의 끝점 복사본을 반환합니다. |
| override [GeometryType](../../aspose.gis.geometries/linearring/geometrytype/) { get; } | 지오메트리 유형을 가져옵니다. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | 이 도형이 곡선(선형 아님) 도형인지 또는 포함하는지 나타내는 값을 가져옵니다. |
| [HasM](../../aspose.gis.geometries/linestring/hasm/) { get; set; } | 이 인스턴스에 M 좌표가 있는지 여부를 나타내는 값을 가져옵니다. |
| [HasZ](../../aspose.gis.geometries/linestring/hasz/) { get; set; } | 이 인스턴스에 Z 좌표가 있는지 여부를 나타내는 값을 가져옵니다. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | 곡선이 닫혔는지 여부를 나타내는 값을 가져옵니다. 시작점이 끝점과 같으면 곡선이 닫힙니다. |
| override [IsEmpty](../../aspose.gis.geometries/linestring/isempty/) { get; } | 이 인스턴스가 비어 있는지 여부를 나타내는 값을 가져옵니다. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | 이 인스턴스가 SFA 관점에서 단순한지 여부를 나타내는 값을 가져옵니다. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | 이 인스턴스가 유효한지 여부를 나타내는 값을 가져옵니다. |
| [Item](../../aspose.gis.geometries/linestring/item/) { get; set; } | 가져오거나 설정합니다.[`IPoint`](../ipoint/) 지정된 index. 에서 |
| [SpatialReferenceSystem](../../aspose.gis.geometries/linestring/spatialreferencesystem/) { get; set; } | 이 인스턴스의 SpatialReferenceSystem을 가져옵니다. 이 속성은 다음과 같을 수 있습니다.`null` , SpatialReferenceSystem이 설정되지 않은 경우. 새 SpatialReferenceSystem을 할당하면 좌표 변환이 수행되지 않고 참조만 변경됩니다. |
| override [StartPoint](../../aspose.gis.geometries/linestring/startpoint/) { get; } | 곡선 시작점의 복사본을 반환합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(IPoint) | 선의 끝에 점을 추가합니다. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double) | 선의 끝에 점을 추가합니다. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double, double) | 선의 끝에 점을 추가합니다. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double, double, double) | 선의 끝에 점을 추가합니다. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | 이 기하학을 Well-Known Binary 표현으로 변환합니다. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | 이 기하학을 Well-Known Binary 표현으로 변환합니다. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | 이 형상을 이미지 표현으로 내보냅니다. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | 이 형상을 이미지 표현으로 내보냅니다. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | 이 형상을 이미지 표현으로 내보냅니다. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | 이 기하학을 Well-Known Text 표현으로 변환합니다. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | 이 기하학을 Well-Known Text 표현으로 변환합니다. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | 이 기하학을 Well-Known Text 표현으로 변환합니다. |
| override [Clone](../../aspose.gis.geometries/linearring/clone/)() | 이 인스턴스를 복제합니다. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | 이 기하 구조가 지정된 기하 구조로 덮여 있는지 여부를 결정합니다. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | 이 기하학이 지정된 기하학을 포함하는지 여부를 결정합니다. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | 이 기하학과 지정된 기하학이 교차하는지 결정합니다. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | 이 기하학에서 지정된 기하학을 뺍니다. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | 이 도형이 지정된 도형과 분리되어 있는지 확인합니다. |
| [Equals](../../aspose.gis.geometries/linestring/equals/)(ILineString) | 현재 개체가 같은 유형의 다른 개체와 같은지 여부를 나타냅니다. |
| override [Equals](../../aspose.gis.geometries/linestring/equals/)(object) | 지정된 개체가 현재 개체와 같은지 여부를 확인합니다. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | 이 기하학의 면적을 계산합니다. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | 이 기하학 주변의 버퍼 영역을 계산합니다. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | 이 지오메트리의 중심을 계산합니다. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | 이 형상의 볼록 껍질을 계산합니다. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | 이 기하학과 지정된 기하학 사이의 최소 거리를 계산합니다. |
| [GetEnumerator](../../aspose.gis.geometries/linestring/getenumerator/)() | 컬렉션을 반복하는 열거자를 반환합니다. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | 이 기하학의 경계 범위를 계산하고 반환합니다. |
| override [GetHashCode](../../aspose.gis.geometries/linestring/gethashcode/)() | 기본 해시 함수 역할을 합니다. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | 이 기하학의 길이를 계산합니다. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | 이 기하학과 지정된 기하학 사이의 교차점을 만듭니다. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | 이 기하학이 지정된 범위와 교차하는지 여부를 결정합니다. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | 이 기하학과 지정된 기하학이 교차하는지 결정합니다. |
| [IsClockwise](../../aspose.gis.geometries/linearring/isclockwise/)() | 링이 시계 방향으로 감기는지 여부를 결정합니다. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | 이 기하학이 지정된 기하학과 겹치는지 여부를 결정합니다. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | 이 기하학과 지정된 기하학의 DE-9IM 교차 행렬이 제공된 패턴과 일치하는지 결정합니다. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | 이 도형의 선으로 표현되는 다각형을 가져옵니다. |
| override [Reverse](../../aspose.gis.geometries/linestring/reverse/)() | 이 점의 순서를 반대로 합니다.[`LineString`](../linestring/) . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | M 좌표를 지정된 소수 자릿수로 반올림합니다. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | X 및 Y 좌표를 지정된 소수 자릿수로 반올림합니다. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Z 좌표를 지정된 소수 자릿수로 반올림합니다. |
| override [SetEmpty](../../aspose.gis.geometries/linestring/setempty/)() | 이렇게 만듭니다[`Geometry`](../geometry/) 비어 있습니다. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | 이 도형이 지정된 도형을 공간적으로 포함하는지 여부를 결정합니다. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | 이 기하학이 지정된 기하학과 공간적으로 동일한지 결정합니다. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | 이 지오메트리와 지정된 지오메트리 간의 대칭 차이를 만듭니다. |
| [ToEditable](../../aspose.gis.geometries/linearring/toeditable/#toeditable_2)() | 이 지오메트리의 편집 가능한 복사본을 가져옵니다. (4 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | 이 지오메트리의 편집 가능한 복사본을 가져옵니다. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | 기본값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | 지정된 값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | 이 기하학과 지정된 기하학이 접촉하는지 결정합니다. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | 이 기하학과 지정된 기하학을 통합합니다. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | 이 기하학이 지정된 범위 내에 있는지 여부를 결정합니다. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | 이 기하학이 지정된 기하학 내에 있는지 여부를 결정합니다. |

### 또한보십시오

* class [LineString](../linestring/)
* interface [ILinearRing](../ilinearring/)
* 네임스페이스 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 집회 [Aspose.GIS](../../)


