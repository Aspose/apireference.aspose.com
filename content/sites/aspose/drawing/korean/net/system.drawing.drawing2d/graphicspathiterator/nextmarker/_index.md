---
title: GraphicsPathIterator.NextMarker
second_title: .NET API 참조용 Aspose.Drawing
description: GraphicsPathIterator 방법. 증가GraphicsPathIteratorpath 의 다음 마커로 이동하고 out 매개변수를 통해 시작 및 중지 인덱스를 반환합니다.
type: docs
weight: 80
url: /ko/net/system.drawing.drawing2d/graphicspathiterator/nextmarker/
---
## NextMarker(out int, out int) {#nextmarker}

증가[`GraphicsPathIterator`](../)path 의 다음 마커로 이동하고 [out] 매개변수를 통해 시작 및 중지 인덱스를 반환합니다.

```csharp
public int NextMarker(out int startIndex, out int endIndex)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| startIndex | Int32& | 【아웃】 이 매개변수에 제공된 정수 참조는 하위 경로를 시작하는 지점의 인덱스 를 받습니다. |
| endIndex | Int32& | 【아웃】 이 매개변수에 제공된 정수 참조는 startIndex가 가리키는 하위 경로를 종료하는 지점의 인덱스 를 받습니다. |

### 반환 값

이 마커와 다음 마커 사이의 포인트 수입니다.

### 또한보십시오

* class [GraphicsPathIterator](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspathiterator/)
* 집회 [Aspose.Drawing](../../../)

---

## NextMarker(GraphicsPath) {#nextmarker_1}

이[`GraphicsPathIterator`](../) 객체는[`GraphicsPath`](../../graphicspath/) 그것과 연관된 객체. 이 방법은 연관된 객체를 증가시킵니다.[`GraphicsPath`](../../graphicspath/) path 의 다음 마커로 현재 마커와 다음 마커(또는 경로의 끝) 사이에 포함된 모든 점을 두 번째로 복사합니다.[`GraphicsPath`](../../graphicspath/) 매개변수에 전달된 개체.

```csharp
public int NextMarker(GraphicsPath path)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | GraphicsPath | 그만큼[`GraphicsPath`](../../graphicspath/) 점이 복사될 객체입니다. |

### 반환 값

이 마커와 다음 마커 사이의 포인트 수입니다.

### 또한보십시오

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspathiterator/)
* 집회 [Aspose.Drawing](../../../)


