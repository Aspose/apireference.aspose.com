---
title: GeometryCollection.Add
second_title: .NET API 참조를 위한 Aspose.GIS
description: GeometryCollection 방법. 컬렉션에 지정된 도형을 추가합니다.
type: docs
weight: 110
url: /ko/net/aspose.gis.geometries/geometrycollection/add/
---
## GeometryCollection.Add method

컬렉션에 지정된 도형을 추가합니다.

```csharp
public void Add(IGeometry geometry)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| geometry | IGeometry | 추가할 형상입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | 컬렉션은 이 유형의 도형을 허용하지 않습니다. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) 이 기하학의[`SpatialReferenceSystem`](../spatialreferencesystem/) 인수는 모두 not 입니다.`null` 서로 같지 않습니다. |

### 또한보십시오

* interface [IGeometry](../../igeometry/)
* class [GeometryCollection](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometrycollection/)
* 집회 [Aspose.GIS](../../../)


