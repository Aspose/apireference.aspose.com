---
title: Class GeographicDatum
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing.GeographicDatum 수업. 지리적 데이텀은 경도와 위도를 지구상의 특정 위치와 관련시킵니다.
type: docs
weight: 2120
url: /ko/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

지리적 데이텀은 경도와 위도를 지구상의 특정 위치와 관련시킵니다.

```csharp
public class GeographicDatum : IdentifiableObject
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 데이텀. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83 데이텀. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | OSGB 1936 데이텀. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 데이텀. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 데이텀. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | 지구를 근사하기 위해 이 데이텀에서 사용되는 타원체. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | 이 개체 식별자가 EPSG 식별자이면 해당 코드를 반환합니다. 그렇지 않으면 -1. 를 반환합니다. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | 이 식별 가능한 개체의 식별자입니다. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | 이 개체의 이름입니다. |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | 이 데이텀의 좌표를 WGS84 데이텀의 좌표로 변환하는 데 사용할 수 있는 BursaWolfParamters. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | 두 데이텀이 동일한지 확인합니다. 동일한 데이텀의 동일한 좌표가 지구상의 동일한 위치와 일치합니다. 동일한 데이텀의 일부 매개변수가 다를 수 있습니다. 예를 들어[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | 두 데이텀이 동일한지 확인합니다. 동일한 데이텀의 동일한 좌표가 지구상의 동일한 위치와 일치합니다. 동일한 데이텀의 일부 매개변수가 다를 수 있습니다. 예를 들어[`Name`](../identifiableobject/name/) . |

### 또한보십시오

* class [IdentifiableObject](../identifiableobject/)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 집회 [Aspose.GIS](../../)


