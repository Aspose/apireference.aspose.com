---
title: Identifier.Epsg
second_title: .NET API 참조를 위한 Aspose.GIS
description: Identifier 방법. 코드로 EPSG 식별자를 나타내는 새로운 식별자 생성epsgCode .
type: docs
weight: 20
url: /ko/net/aspose.gis.spatialreferencing/identifier/epsg/
---
## Identifier.Epsg method

코드로 EPSG 식별자를 나타내는 새로운 식별자 생성*epsgCode* .

```csharp
public static Identifier Epsg(int epsgCode)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| epsgCode | Int32 | Epsg 코드. |

### 반환 값

새 식별자[`AuthorityName`](../authorityname/) "EPSG"와[`AuthorityUniqueIdentifier`](../authorityuniqueidentifier/)*epsgCode* . 만약*epsgCode* 0보다 작음 - 반환`null` ;

### 또한보십시오

* class [Identifier](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../identifier/)
* 집회 [Aspose.GIS](../../../)


