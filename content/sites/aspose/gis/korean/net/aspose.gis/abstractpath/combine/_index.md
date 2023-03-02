---
title: AbstractPath.Combine
second_title: .NET API 참조를 위한 Aspose.GIS
description: AbstractPath 방법. 이것을 결합AbstractPath 지정된 경로 구성요소 포함.
type: docs
weight: 50
url: /ko/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

이것을 결합[`AbstractPath`](../) 지정된 경로 구성요소 포함.

```csharp
public virtual AbstractPath Combine(string location)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| location | String | 여기에 추가할 경로 구성요소[`AbstractPath`](../). |

### 반환 값

새로운[`AbstractPath`](../) 가리키는[`Location`](../location/) 그것은 이것의 위치의 조합입니다[`AbstractPath`](../)and 인수.

### 비고

일반적으로 이 메서드는 상속자에 의해 재정의되어서는 안 됩니다. 기본 implementation 는 이것을 연결합니다.[`Location`](../location/) 인수를 사용하여 다음을 호출합니다.[`WithLocation`](../withlocation/) 연결된 문자열을 인수로 사용하는 메서드. 조합 결과는 다음과 같이 정의됩니다.  인수가 다음으로 시작하는 경우[`Separator`](../separator/), 조합 결과는 인수와 같습니다. 그렇지 않으면[`Location`](../location/) 로 끝납니다[`Separator`](../separator/) , 조합 결과는 다음과 같습니다.` +`; 그렇지 않으면 결과는 다음과 같습니다.` + +`

### 또한보십시오

* class [AbstractPath](../)
* 네임스페이스 [Aspose.Gis](../../abstractpath/)
* 집회 [Aspose.GIS](../../../)


