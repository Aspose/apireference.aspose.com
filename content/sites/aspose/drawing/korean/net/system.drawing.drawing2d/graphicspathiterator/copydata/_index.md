---
title: GraphicsPathIterator.CopyData
second_title: .NET API 참조용 Aspose.Drawing
description: GraphicsPathIterator 방법. 연결된 GraphicsPath.PathPoints 속성 및 GraphicsPath.PathTypes 속성 arrays 를 복사합니다.GraphicsPath 두 개의 지정된 배열로.
type: docs
weight: 40
url: /ko/net/system.drawing.drawing2d/graphicspathiterator/copydata/
---
## GraphicsPathIterator.CopyData method

연결된 GraphicsPath.PathPoints 속성 및 GraphicsPath.PathTypes 속성 arrays 를 복사합니다.[`GraphicsPath`](../../graphicspath/) 두 개의 지정된 배열로.

```csharp
public int CopyData(ref PointF[] points, ref byte[] types, int startIndex, int endIndex)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| points | PointF[]& | 반환 시 경로의 점을 나타내는 System.Drawing.PointF 구조의 배열을 포함합니다. |
| types | Byte[]& | 반환 시 경로의 점 유형을 나타내는 바이트 배열을 포함합니다. |
| startIndex | Int32 | 배열의 시작 인덱스를 지정합니다. |
| endIndex | Int32 | 배열의 끝 인덱스를 지정합니다. |

### 반환 값

복사된 점의 수입니다.

### 또한보십시오

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPathIterator](../)
* 네임스페이스 [System.Drawing.Drawing2D](../../graphicspathiterator/)
* 집회 [Aspose.Drawing](../../../)


