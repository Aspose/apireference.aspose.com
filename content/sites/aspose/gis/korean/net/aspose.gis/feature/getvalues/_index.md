---
title: Feature.GetValues
second_title: .NET API 참조를 위한 Aspose.GIS
description: Feature 방법. 배열의 모든 속성 값을 반환합니다.
type: docs
weight: 50
url: /ko/net/aspose.gis/feature/getvalues/
---
## Feature.GetValues method

배열의 모든 속성 값을 반환합니다.

```csharp
public int GetValues(object[] values, object defaultValue = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| values | Object[] | 속성 값을 복사할 배열입니다. |
| defaultValue | Object | 속성 값이 누락된 경우(설정되지 않은 경우) 반환할 값입니다. 기본값은`null`. ' 사용 고려DBNull'unset'과 '을 구분하기 위한 .Value'`null` 값. |

### 반환 값

여러 속성이 복사되었습니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| InvalidOperationException | 속성이 잠겨 있지 않습니다. |

### 비고

기능의 값 속성이 매개변수로 전달되는 값 배열에 복사됩니다. 값이 설정되지 않은 속성의 경우 지정된 'unsetValue' 매개변수가 반환됩니다.  값 배열의 길이는 기능의 속성 수와 일치할 필요가 없습니다. 배열 길이가 속성 수보다 크면 모든 속성 값이 배열에 복사됩니다. 작으면 속성 값의 배열 길이 수만 배열에 복사됩니다. 서수 0. 속성 값에서 시작

### 또한보십시오

* class [Feature](../)
* 네임스페이스 [Aspose.Gis](../../feature/)
* 집회 [Aspose.GIS](../../../)


