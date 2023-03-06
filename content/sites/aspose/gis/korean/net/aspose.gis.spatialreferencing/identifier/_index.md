---
title: Class Identifier
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.SpatialReferencing.Identifier 수업. 식별자  개체의 외부 설명에 대한 참조를 나타냅니다. WKT에서 SRS를 생성하면Identifier AUTHORITY 키워드에 해당합니다.
type: docs
weight: 2160
url: /ko/net/aspose.gis.spatialreferencing/identifier/
---
## Identifier class

식별자 - 개체의 외부 설명에 대한 참조를 나타냅니다. WKT에서 SRS를 생성하면`Identifier` "AUTHORITY" 키워드에 해당합니다.

```csharp
public class Identifier : IEquatable<Identifier>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Identifier](identifier/)(string, string) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [AuthorityName](../../aspose.gis.spatialreferencing/identifier/authorityname/) { get; } | 권한을 부여한 이름[`AuthorityUniqueIdentifier`](./authorityuniqueidentifier/) . |
| [AuthorityUniqueIdentifier](../../aspose.gis.spatialreferencing/identifier/authorityuniqueidentifier/) { get; } | 내에서 개체를 나타내는 고유한 방법[`AuthorityName`](./authorityname/) . |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [Epsg](../../aspose.gis.spatialreferencing/identifier/epsg/)(int) | 코드로 EPSG 식별자를 나타내는 새로운 식별자 생성*epsgCode* . |
| [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals)(Identifier) | 현재 개체가 같은 유형의 다른 개체와 같은지 여부를 나타냅니다. |
| override [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals_1)(object) | 지정된 개체가 현재 개체와 같은지 여부를 확인합니다. |
| [GetEpsgCode](../../aspose.gis.spatialreferencing/identifier/getepsgcode/)() | 이 개체가 유효한 EPSG 식별자를 나타내는 경우(예: 기관 이름이 "EPSG"이고 기관 고유 식별자가 정수인 경우) - 반환합니다. 그렇지 않으면 -1. 를 반환합니다. |
| override [GetHashCode](../../aspose.gis.spatialreferencing/identifier/gethashcode/)() | 기본 해시 함수 역할을 합니다. |
| [operator ==](../../aspose.gis.spatialreferencing/identifier/op_equality/) | ==. 연산자 구현 |
| [operator !=](../../aspose.gis.spatialreferencing/identifier/op_inequality/) | 연산자 구현 !=. |

### 예

WGS 84 공간 참조 시스템에는 EPSG 코드 4326이 있으므로 식별자: 를 포함할 수 있습니다. WGS 84 Ellipsoid에는 EPSG 코드 7030이 있으며 식별자: 를 포함할 수 있습니다.

```csharp
new  {  = "EPSG",  = 4326 };
```

```csharp
new  {  = "EPSG",  = 7030 };
```

### 또한보십시오

* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* 집회 [Aspose.GIS](../../)


