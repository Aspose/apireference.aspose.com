---
title: GraphicsPathIterator.NextSubpath
second_title: .NET API 참조용 Aspose.Drawing
description: GraphicsPathIterator 방법. 이동GraphicsPathIterator 경로의 다음 하위 경로로. 다음 하위 경로의 시작 인덱스와 끝 인덱스는 out 매개변수에 포함됩니다.
type: docs
weight: 100
url: /ko/net/system.drawing.drawing2d/graphicspathiterator/nextsubpath/
---
## NextSubpath(out int, out int, out bool) {#nextsubpath}

이동[`GraphicsPathIterator`](../) 경로의 다음 하위 경로로. 다음 하위 경로의 시작 인덱스와 끝 인덱스는 [out] 매개변수에 포함됩니다.

```csharp
public int NextSubpath(out int startIndex, out int endIndex, out bool isClosed)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| startIndex | Int32& | [out] 다음 하위 경로의 시작 인덱스를 받습니다. |
| endIndex | Int32& | [out] 다음 하위 경로의 끝 인덱스를 받습니다. |
| isClosed | Boolean& | 【아웃】 하위 경로가 닫혀 있는지 여부를 나타냅니다. |

### 반환 값

검색된 그림(서브 경로)의 데이터 포인트 수입니다. 검색할 그림이 더 이상 없으면 0이 반환됩니다.

### 또한보십시오

* class [GraphicsPathIterator](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspathiterator/)
* 집회 [Aspose.Drawing](../../../)

---

## NextSubpath(GraphicsPath, out bool) {#nextsubpath_1}

관련 경로에서 다음 그림(하위 경로)을 가져옵니다.[`GraphicsPathIterator`](../) .

```csharp
public int NextSubpath(GraphicsPath path, out bool isClosed)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | GraphicsPath | ㅏ[`GraphicsPath`](../../graphicspath/) 즉, 이 반복자에 대해 검색된 그림(서브 경로)의 데이터 포인트와 일치하도록 데이터 포인트를 설정합니다. |
| isClosed | Boolean& | 【아웃】 현재 하위 경로가 닫혀 있는지 여부를 나타냅니다. 그림이 닫혀 있으면 참이고 그렇지 않으면 거짓입니다. |

### 반환 값

검색된 그림(서브 경로)의 데이터 포인트 수입니다. 검색할 그림이 더 이상 없으면 0이 반환됩니다.

### 또한보십시오

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspathiterator/)
* 집회 [Aspose.Drawing](../../../)


