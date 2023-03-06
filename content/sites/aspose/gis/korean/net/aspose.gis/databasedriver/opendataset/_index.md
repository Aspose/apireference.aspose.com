---
title: DatabaseDriver.OpenDataset
second_title: .NET API 참조를 위한 Aspose.GIS
description: DatabaseDriver 방법. 데이터 세트를 엽니다.
type: docs
weight: 10
url: /ko/net/aspose.gis/databasedriver/opendataset/
---
## DatabaseDriver.OpenDataset method

데이터 세트를 엽니다.

```csharp
public abstract Dataset OpenDataset(IDbConnection connection)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| connection | IDbConnection | 데이터베이스에 대한 연결을 열었습니다. |

### 반환 값

인스턴스[`Dataset`](../../dataset/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 연결은`null`. |
| [GisException](../../gisexception/) | 데이터세트를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [Dataset](../../dataset/)
* class [DatabaseDriver](../)
* 네임스페이스 [Aspose.Gis](../../databasedriver/)
* 집회 [Aspose.GIS](../../../)


