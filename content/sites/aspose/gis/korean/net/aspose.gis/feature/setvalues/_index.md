---
title: Feature.SetValues
second_title: .NET API 참조를 위한 Aspose.GIS
description: Feature 방법. 모든 속성에 대해 새 값을 설정합니다. 또한 사용을 고려하십시오.CopyValues 한 번의 호출로 값 설정을 간소화하는 방법.
type: docs
weight: 120
url: /ko/net/aspose.gis/feature/setvalues/
---
## Feature.SetValues method

모든 속성에 대해 새 값을 설정합니다. 또한 사용을 고려하십시오.[`CopyValues`](../copyvalues/) 한 번의 호출로 값 설정을 간소화하는 방법.

```csharp
public int SetValues(object[] values)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| values | Object[] | 새 값의 배열입니다. |

### 반환 값

설정된 속성 값의 수입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는 다음과 같을 수 없습니다.`null`. |
| ArgumentException | 이 이름을 가진 속성이 이 레이어에 없습니다. |
| InvalidOperationException | 속성이 잠겨 있지 않습니다. |
| InvalidCastException | 값의 유형이 구현되지 않습니다.IConvertible. |
| FormatException | 값이 잘못된 형식이기 때문에 변환에 실패했습니다. |
| OverflowException | 오버플로로 인해 변환에 실패했습니다. |

### 비고

이 방법은 각 값을 속성의 유형으로 자동 변환합니다.  값 배열의 길이는 기능의 속성 수와 일치할 필요가 없습니다. 배열 길이가 속성 수보다 크면 모든 배열 값이 속성으로 복사됩니다. 작으면 값의 배열 길이 수만 특성에 복사되며, 는 서수가 0인 특성 값에서 시작합니다.

### 또한보십시오

* class [Feature](../)
* 네임스페이스 [Aspose.Gis](../../feature/)
* 집회 [Aspose.GIS](../../../)


