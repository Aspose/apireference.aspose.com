---
title: Interface IGeometryCollection
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Geometries.IGeometryCollection 상호 작용. AIGeometryCollection 이다IGeometry 이는 하나 이상의 기하학 모음입니다.
type: docs
weight: 1010
url: /ko/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

A`IGeometryCollection` 이다[`IGeometry`](../igeometry/) 이는 하나 이상의 기하학 모음입니다.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | 이 컬렉션의 도형 수를 가져옵니다. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | 가져오기[`IGeometry`](../igeometry/) 지정된 index. 에서 |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | 이 컬렉션의 표면 중 하나에 있다고 보장되는 점을 찾습니다. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | 이 도형의 선으로 표현되는 다각형을 가져옵니다. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | 이 지오메트리의 편집 가능한 복사본을 가져옵니다. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | 기본값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | 지정된 값을 사용하여 이 지오메트리의 대략적이거나 동등한 비곡선 버전을 가져옵니다.`용인` . |

### 또한보십시오

* interface [IGeometry](../igeometry/)
* 네임스페이스 [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* 집회 [Aspose.GIS](../../)


