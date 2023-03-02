---
title: Feature.CopyValues
second_title: .NET API 참조를 위한 Aspose.GIS
description: Feature 방법. 다른 기능에서 속성 값을 복사합니다.
type: docs
weight: 20
url: /ko/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

다른 기능에서 속성 값을 복사합니다.

```csharp
public void CopyValues(Feature inputFeature)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| inputFeature | Feature | 값을 복사할 기능입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | 이 이름을 가진 속성이 이 레이어에 없습니다. |
| InvalidOperationException | 속성이 잠겨 있지 않습니다. |
| InvalidOperationException | 입력 값은 null이며 이 기능의 속성은 null일 수 없습니다. |
| [GisException](../../gisexception/) | 속성의 이름은 같지만 기능에서 데이터 유형이 다릅니다. |

### 비고

이 방법은 이름이 일치하는 속성만 복사합니다.

### 또한보십시오

* class [Feature](../)
* 네임스페이스 [Aspose.Gis](../../feature/)
* 집회 [Aspose.GIS](../../../)


