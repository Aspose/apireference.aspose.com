---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: .NET API 참조를 위한 Aspose.GIS
description: FileDriver 방법. 지정된 공간 참조 시스템이 드라이버에서 지원되는지 여부를 결정합니다.
type: docs
weight: 100
url: /ko/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

지정된 공간 참조 시스템이 드라이버에서 지원되는지 여부를 결정합니다.

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | 공간 참조 시스템. |

### 반환 값

지정된 공간 참조 시스템이 드라이버에서 지원되는지 여부를 나타내는 부울 값입니다. `null` 모든 드라이버에서 지원하는 것으로 간주됩니다.

### 비고

공간 참조 시스템이 지원되지 않는 경우[`CreateLayer`](../createlayer/) 방법, aNotSupportedException 던질 것입니다.

### 또한보십시오

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)


