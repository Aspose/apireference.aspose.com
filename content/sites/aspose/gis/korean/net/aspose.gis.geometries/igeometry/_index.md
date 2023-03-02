---
title: Interface IGeometry
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Geometries.IGeometry 상호 작용. 기하학의 인터페이스 루트 클래스 hierarchy
type: docs
weight: 1000
url: /ko/net/aspose.gis.geometries/igeometry/
---
## IGeometry interface

기하학의 인터페이스 루트 클래스 hierarchy

```csharp
public interface IGeometry
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Dimension](../../aspose.gis.geometries/igeometry/dimension/) { get; } | 이것의 토폴로지 차원을 가져옵니다.`IGeometry` . 차원을 알 수 없는 경우(예: 빈 GEOMETRYCOLLECTION의 경우)Point 반환됩니다. |
| [GeometryType](../../aspose.gis.geometries/igeometry/geometrytype/) { get; } | 지오메트리 유형을 가져옵니다. |
| [HasCurveGeometry](../../aspose.gis.geometries/igeometry/hascurvegeometry/) { get; } | 이 도형이 곡선(선형 아님) 도형인지 또는 포함하는지 나타내는 값을 가져옵니다. |
| [HasM](../../aspose.gis.geometries/igeometry/hasm/) { get; } | 이 인스턴스에 M 좌표가 있는지 여부를 나타내는 값을 가져옵니다. |
| [HasZ](../../aspose.gis.geometries/igeometry/hasz/) { get; } | 이 인스턴스에 Z 좌표가 있는지 여부를 나타내는 값을 가져옵니다. |
| [IsEmpty](../../aspose.gis.geometries/igeometry/isempty/) { get; } | 이 인스턴스가 비어 있는지 여부를 나타내는 값을 가져옵니다(빈 포인트 집합을 나타냄). |
| [IsSimple](../../aspose.gis.geometries/igeometry/issimple/) { get; } | 이 인스턴스가 SFA 관점에서 단순한지 여부를 나타내는 값을 가져옵니다. |
| [IsValid](../../aspose.gis.geometries/igeometry/isvalid/) { get; } | 이 인스턴스가 유효한지 여부를 나타내는 값을 가져옵니다. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/igeometry/spatialreferencesystem/) { get; } | 이 인스턴스의 SpatialReferenceSystem을 가져옵니다. 이 속성은 다음과 같을 수 있습니다.`null` , SpatialReferenceSystem이 알려지지 않은 경우. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary)() | 이 기하학을 Well-Known Binary 표현으로 변환합니다. |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary_1)(WkbVariant) | 이 기하학을 Well-Known Binary 표현으로 변환합니다. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | 이 형상을 이미지 표현으로 내보냅니다. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | 이 형상을 이미지 표현으로 내보냅니다. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | 이 형상을 이미지 표현으로 내보냅니다. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext)() | 이 기하학을 Well-Known Text 표현으로 변환합니다. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_1)(WktVariant) | 이 기하학을 Well-Known Text 표현으로 변환합니다. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_2)(WktVariant, NumericFormat) | 이 기하학을 Well-Known Text 표현으로 변환합니다. |
| [Clone](../../aspose.gis.geometries/igeometry/clone/)() | 이 인스턴스를 복제합니다. |
| [CoveredBy](../../aspose.gis.geometries/igeometry/coveredby/)(IGeometry) | 이 기하 구조가 지정된 기하 구조로 덮여 있는지 여부를 결정합니다. |
| [Covers](../../aspose.gis.geometries/igeometry/covers/)(IGeometry) | 이 기하학이 지정된 기하학을 포함하는지 여부를 결정합니다. |
| [Crosses](../../aspose.gis.geometries/igeometry/crosses/)(IGeometry) | 이 기하학과 지정된 기하학이 교차하는지 결정합니다. |
| [Difference](../../aspose.gis.geometries/igeometry/difference/)(IGeometry) | 이 기하학에서 지정된 기하학을 뺍니다. |
| [Disjoint](../../aspose.gis.geometries/igeometry/disjoint/)(IGeometry) | 이 도형이 지정된 도형과 분리되어 있는지 확인합니다. |
| [GetArea](../../aspose.gis.geometries/igeometry/getarea/)() | 이 기하학의 면적을 계산합니다. |
| [GetBuffer](../../aspose.gis.geometries/igeometry/getbuffer/)(double, int) | 이 기하학 주변의 버퍼 영역을 계산합니다. |
| [GetCentroid](../../aspose.gis.geometries/igeometry/getcentroid/)() | 이 지오메트리의 중심을 계산합니다. |
| [GetConvexHull](../../aspose.gis.geometries/igeometry/getconvexhull/)() | 이 형상의 볼록 껍질을 계산합니다. |
| [GetDistanceTo](../../aspose.gis.geometries/igeometry/getdistanceto/)(IGeometry) | 이 기하학과 지정된 기하학 사이의 최소 거리를 계산합니다. |
| [GetExtent](../../aspose.gis.geometries/igeometry/getextent/)() | 이 기하학의 경계 범위를 계산하고 반환합니다. |
| [GetLength](../../aspose.gis.geometries/igeometry/getlength/)() | 이 기하학의 길이를 계산합니다. |
| [Intersection](../../aspose.gis.geometries/igeometry/intersection/)(IGeometry) | 이 기하학과 지정된 기하학 사이의 교차점을 만듭니다. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects)(Extent) | 이 기하학이 지정된 범위와 교차하는지 여부를 결정합니다. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects_1)(IGeometry) | 이 기하학과 지정된 기하학이 교차하는지 결정합니다. |
| [Overlaps](../../aspose.gis.geometries/igeometry/overlaps/)(IGeometry) | 이 기하학이 지정된 기하학과 겹치는지 여부를 결정합니다. |
| [Relate](../../aspose.gis.geometries/igeometry/relate/)(IGeometry, string) | 이 기하학과 지정된 기하학의 DE-9IM 교차 행렬이 제공된 패턴과 일치하는지 결정합니다. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometry/replacepolygonsbylines/)() | 이 도형의 선으로 표현되는 다각형을 가져옵니다. |
| [SpatiallyContains](../../aspose.gis.geometries/igeometry/spatiallycontains/)(IGeometry) | 이 도형이 지정된 도형을 공간적으로 포함하는지 여부를 결정합니다. |
| [SpatiallyEquals](../../aspose.gis.geometries/igeometry/spatiallyequals/)(IGeometry) | 이 기하학이 지정된 기하학과 공간적으로 동일한지 결정합니다. |
| [SymDifference](../../aspose.gis.geometries/igeometry/symdifference/)(IGeometry) | 이 지오메트리와 지정된 지오메트리 간의 대칭 차이를 만듭니다. |
| [ToEditable](../../aspose.gis.geometries/igeometry/toeditable/#toeditable)() | 이 지오메트리의 편집 가능한 복사본을 가져옵니다. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/igeometry/toeditable/#toeditable_1)() | 이 지오메트리의 편집 가능한 복사본을 가져옵니다. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry)() | 기본값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry_1)(double) | 지정된 값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` . |
| [Touches](../../aspose.gis.geometries/igeometry/touches/)(IGeometry) | 이 기하학과 지정된 기하학이 접촉하는지 결정합니다. |
| [Union](../../aspose.gis.geometries/igeometry/union/)(IGeometry) | 이 기하학과 지정된 기하학을 통합합니다. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within)(Extent) | 이 기하학이 지정된 범위 내에 있는지 여부를 결정합니다. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within_1)(IGeometry) | 이 기하학이 지정된 기하학 내에 있는지 여부를 결정합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 집회 [Aspose.GIS](../../)


