---
title: Feature.GetValuesDump
second_title: .NET API 참조를 위한 Aspose.GIS
description: Feature 방법. 배열의 모든 속성에 대한 값을 반환합니다. 사용 고려GetValues 추가 메모리 할당을 피하기 위한 방법.
type: docs
weight: 60
url: /ko/net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

배열의 모든 속성에 대한 값을 반환합니다. 사용 고려[`GetValues`](../getvalues/) 추가 메모리 할당을 피하기 위한 방법.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| defaultValue | Object | 속성 값이 누락된 경우(설정되지 않은 경우) 반환할 값입니다. 기본값은`null`. ' 사용 고려DBNull'unset'과 '을 구분하기 위한 .Value'`null` 값. |

### 반환 값

속성 값을 복사할 새 배열입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| InvalidOperationException | 속성이 잠겨 있지 않습니다. |

### 비고

기능의 값 속성이 매개변수로 전달되는 값 배열에 복사됩니다. 값이 설정되지 않은 속성의 경우 지정된 'unsetValue' 매개변수가 반환됩니다.

### 또한보십시오

* class [Feature](../)
* 네임스페이스 [Aspose.Gis](../../feature/)
* 집회 [Aspose.GIS](../../../)


