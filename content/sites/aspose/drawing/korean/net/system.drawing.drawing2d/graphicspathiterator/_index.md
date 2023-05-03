---
title: Class GraphicsPathIterator
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Drawing2D.GraphicsPathIterator 수업. 에서 하위 경로를 반복하는 기능을 제공합니다.GraphicsPath 각 하위 경로에 포함된 모양의 유형을 테스트합니다. 이 클래스는 상속될 수 없습니다.
type: docs
weight: 270
url: /ko/net/system.drawing.drawing2d/graphicspathiterator/
---
## GraphicsPathIterator class

에서 하위 경로를 반복하는 기능을 제공합니다.GraphicsPath 각 하위 경로에 포함된 모양의 유형을 테스트합니다. 이 클래스는 상속될 수 없습니다.

```csharp
public sealed class GraphicsPathIterator : IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [GraphicsPathIterator](graphicspathiterator/)(GraphicsPath) | 의 새 인스턴스를 초기화합니다.`GraphicsPathIterator` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Count](../../system.drawing.drawing2d/graphicspathiterator/count/) { get; } | 경로의 포인트 수를 가져옵니다. |
| [SubpathCount](../../system.drawing.drawing2d/graphicspathiterator/subpathcount/) { get; } | 경로의 하위 경로 수를 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [CopyData](../../system.drawing.drawing2d/graphicspathiterator/copydata/)(ref PointF[], ref byte[], int, int) | 연결된 GraphicsPath.PathPoints 속성 및 GraphicsPath.PathTypes 속성 arrays 를 복사합니다.[`GraphicsPath`](../graphicspath/) 두 개의 지정된 배열로. |
| [Dispose](../../system.drawing.drawing2d/graphicspathiterator/dispose/)() | 관리되지 않는 리소스 해제, 해제 또는 재설정과 관련된 응용 프로그램 정의 작업을 수행합니다. |
| [Enumerate](../../system.drawing.drawing2d/graphicspathiterator/enumerate/)(ref PointF[], ref byte[]) | 연결된 GraphicsPath.PathPoints 속성 및 GraphicsPath.PathTypes 속성 arrays 를 복사합니다.[`GraphicsPath`](../graphicspath/) 두 개의 지정된 배열로. |
| [HasCurve](../../system.drawing.drawing2d/graphicspathiterator/hascurve/)() | 이 경로와 관련된 경로가`GraphicsPathIterator` 곡선을 포함합니다. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker_1)(GraphicsPath) | 이`GraphicsPathIterator` 객체는[`GraphicsPath`](../graphicspath/) 그것과 연관된 객체. 이 방법은 연관된 객체를 증가시킵니다.[`GraphicsPath`](../graphicspath/) path 의 다음 마커로 현재 마커와 다음 마커(또는 경로의 끝) 사이에 포함된 모든 점을 두 번째로 복사합니다.[`GraphicsPath`](../graphicspath/) 매개변수에 전달된 개체. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker)(out int, out int) | 증가`GraphicsPathIterator`path 의 다음 마커로 이동하고 [out] 매개변수를 통해 시작 및 중지 인덱스를 반환합니다. |
| [NextPathType](../../system.drawing.drawing2d/graphicspathiterator/nextpathtype/)(out byte, out int, out int) | 모두 동일한 유형을 가진 다음 데이터 포인트 그룹의 시작 인덱스와 끝 인덱스를 가져옵니다. |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath_1)(GraphicsPath, out bool) | 관련 경로에서 다음 그림(하위 경로)을 가져옵니다.`GraphicsPathIterator` . |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath)(out int, out int, out bool) | 이동`GraphicsPathIterator` 경로의 다음 하위 경로로. 다음 하위 경로의 시작 인덱스와 끝 인덱스는 [out] 매개변수에 포함됩니다. |
| [Rewind](../../system.drawing.drawing2d/graphicspathiterator/rewind/)() | 되감기`GraphicsPathIterator` 연결된 경로의 시작 부분으로. |

### 또한보십시오

* 네임스페이스 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 집회 [Aspose.Drawing](../../)


