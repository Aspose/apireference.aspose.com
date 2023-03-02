---
title: SpatialReferenceSystem.CreateFromWkt
second_title: .NET API 참조를 위한 Aspose.GIS
description: SpatialReferenceSystem 방법. 새로 만들기공간 참조 시스템 WKT잘 알려진 텍스트 string. 기반
type: docs
weight: 20
url: /ko/net/aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/
---
## SpatialReferenceSystem.CreateFromWkt method

새로 만들기`공간 참조 시스템` WKT(잘 알려진 텍스트) string. 기반

```csharp
public static SpatialReferenceSystem CreateFromWkt(string wkt)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| wkt | String | WKT 문자열. |

### 반환 값

새로운`공간 참조 시스템` .

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null` . |
| FormatException | wkt 값의 계층 구조, 순서 또는 유형이 잘못되었습니다. |
| NotSupportedException | WKT 루트 요소는 지원되지 않습니다(예: FITTED_CS). |

### 또한보십시오

* method [TryCreateFromWkt](../trycreatefromwkt/)
* class [SpatialReferenceSystem](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 집회 [Aspose.GIS](../../../)


