---
title: GraphicsPathIterator.NextPathType
second_title: .NET API 참조용 Aspose.Drawing
description: GraphicsPathIterator 방법. 모두 동일한 유형을 가진 다음 데이터 포인트 그룹의 시작 인덱스와 끝 인덱스를 가져옵니다.
type: docs
weight: 90
url: /ko/net/system.drawing.drawing2d/graphicspathiterator/nextpathtype/
---
## GraphicsPathIterator.NextPathType method

모두 동일한 유형을 가진 다음 데이터 포인트 그룹의 시작 인덱스와 끝 인덱스를 가져옵니다.

```csharp
public int NextPathType(out byte pathType, out int startIndex, out int endIndex)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| pathType | Byte& | 【아웃】 그룹의 모든 포인트가 공유하는 포인트 유형을 받습니다. 가능한 유형은 다음에서 검색할 수 있습니다.PathPointType 열거. |
| startIndex | Int32& | [out] 포인트 그룹의 시작 인덱스를 받습니다. |
| endIndex | Int32& | 【아웃】 포인트 그룹의 종료 인덱스를 수신합니다. |

### 반환 값

이 메서드는 그룹의 데이터 포인트 수를 반환합니다. 경로에 그룹이 더 이상 없으면 이 메서드는 0을 반환합니다.

### 또한보십시오

* class [GraphicsPathIterator](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspathiterator/)
* 집회 [Aspose.Drawing](../../../)


