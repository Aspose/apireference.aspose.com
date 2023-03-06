---
title: Enum SpatialReferenceSystemType
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType 열거형. 공간 참조 시스템의 유형을 나타냅니다.
type: docs
weight: 2270
url: /ko/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

공간 참조 시스템의 유형을 나타냅니다.

```csharp
public enum SpatialReferenceSystemType
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Unknown | `0` | 기본값. 에서 반환 가능[`Type`](../spatialreferencesystem/type/) 이것이 기본 SRS의 유효하지 않은 조합이 있는 복합 SRS인 경우. 보다[`IsCompound`](../spatialreferencesystem/iscompound/) . |
| Geographic | `1` | 지리적 SRS는 각경도 및 각위도를 기반으로 합니다. 지리적 SRS는 다음으로 변환할 수 있습니다.[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) 경유[`AsGeographic`](../spatialreferencesystem/asgeographic/) 방법. |
| Geocentric | `2` | Geocentric SRS는 지구 중심을 원점으로 하는 3차원 데카르트 SRS입니다. Geocentric SRS는 다음으로 변환할 수 있습니다.[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) 경유[`AsGeocentric`](../spatialreferencesystem/asgeocentric/) 방법. |
| Projected | `3` | 투영된 SRS는 선형 X 및 선형 Y를 기반으로 합니다.Geographic SRS. 예상 SRS를 다음으로 변환할 수 있습니다.[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) 경유[`AsProjected`](../spatialreferencesystem/asprojected/) 방법. |
| Vertical | `4` | 세로 SRS는 선형 높이 좌표를 나타냅니다. 세로 SRS는 다음으로 변환할 수 있습니다.[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) 경유[`AsVertical`](../spatialreferencesystem/asvertical/) 방법. |
| Local | `5` | 로컬 SRS는 좌표를 일부 객체와 연결하고 다른 객체는 지구와 연결합니다. 로컬 SRS는 다음으로 변환할 수 있습니다.[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) 경유[`AsLocal`](../spatialreferencesystem/aslocal/) 방법. |

### 또한보십시오

* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 집회 [Aspose.GIS](../../)


