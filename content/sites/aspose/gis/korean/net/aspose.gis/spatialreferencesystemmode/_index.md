---
title: Enum SpatialReferenceSystemMode
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferenceSystemMode 열거형. 알 수 없는 SRS인 경우 database 에 쓰는 SRS공간 참조 시스템의 모드를 지정합니다.
type: docs
weight: 2020
url: /ko/net/aspose.gis/spatialreferencesystemmode/
---
## SpatialReferenceSystemMode enumeration

알 수 없는 SRS인 경우 database 에 쓰는 SRS(공간 참조 시스템)의 모드를 지정합니다.

```csharp
public enum SpatialReferenceSystemMode
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| ThrowException | `0` | 데이터베이스에 대해 알 수 없는 SRS인 경우 예외를 발생시킵니다. |
| WriteInSystemTable | `1` | 데이터베이스에 대한 알 수 없는 SRS인 경우 시스템 테이블에 SRS 정보를 기록합니다. |
| SetupToZero | `2` | 데이터베이스에 대해 알 수 없는 SRS인 경우 지오메트리의 SRID를 '0'으로 설정합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Gis](../../aspose.gis/)
* 집회 [Aspose.GIS](../../)


