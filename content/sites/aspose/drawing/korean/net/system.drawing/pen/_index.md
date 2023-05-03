---
title: Class Pen
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Pen 수업. 선과 곡선을 그리는 데 사용되는 개체를 정의합니다.
type: docs
weight: 910
url: /ko/net/system.drawing/pen/
---
## Pen class

선과 곡선을 그리는 데 사용되는 개체를 정의합니다.

```csharp
public class Pen : IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Pen](pen/#constructor)(Brush) | 의 새 인스턴스를 초기화합니다.`Pen` 지정된 클래스Brush . |
| [Pen](pen/#constructor_2)(Color) | 의 새 인스턴스를 초기화합니다.`Pen` 지정된 클래스Color . |
| [Pen](pen/#constructor_1)(Brush, float) | 지정된 Brush 및 Width를 사용하여 Pen 클래스의 새 인스턴스를 초기화합니다. |
| [Pen](pen/#constructor_3)(Color, float) | 지정된 Color 및 Width 속성을 사용하여 Pen 클래스의 새 인스턴스를 초기화합니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment/) { get; set; } | 이에 대한 정렬을 가져오거나 설정합니다.Pen . |
| [Brush](../../system.drawing/pen/brush/) { get; set; } | 이 속성을 결정하는 Brush를 가져오거나 설정합니다.Pen . |
| [Color](../../system.drawing/pen/color/) { get; set; } | 이 색상을 가져오거나 설정합니다.Pen . |
| [CompoundArray](../../system.drawing/pen/compoundarray/) { get; set; } | 복합 펜을 지정하는 값의 배열을 가져오거나 설정합니다. 복합펜은 평행선과 여백으로 이루어진 복합선을 그립니다. |
| [CustomEndCap](../../system.drawing/pen/customendcap/) { get; set; } | 이 항목으로 그린 줄의 끝에서 사용할 사용자 지정 캡을 가져오거나 설정합니다.Pen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap/) { get; set; } | 이 항목으로 그린 선의 시작 부분에 사용할 사용자 지정 캡을 가져오거나 설정합니다.Pen . |
| [DashCap](../../system.drawing/pen/dashcap/) { get; set; } | this 로 그린 파선을 구성하는 대시 끝에 사용되는 캡 스타일을 가져오거나 설정합니다.Pen . |
| [DashOffset](../../system.drawing/pen/dashoffset/) { get; set; } | 선의 시작부터 대시 패턴의 시작까지의 거리를 가져오거나 설정합니다. |
| [DashPattern](../../system.drawing/pen/dashpattern/) { get; set; } | 사용자 지정 대시 및 공백의 배열을 가져오거나 설정합니다. |
| [DashStyle](../../system.drawing/pen/dashstyle/) { get; set; } | 이 항목으로 그린 점선에 사용되는 스타일을 가져오거나 설정합니다.Pen . |
| [EndCap](../../system.drawing/pen/endcap/) { get; set; } | 이 Pen. 로 그린 선의 끝에 사용되는 캡 스타일을 가져오거나 설정합니다. |
| [LineJoin](../../system.drawing/pen/linejoin/) { get; set; } | 이 Pen. 로 그린 두 연속 선의 끝에 대한 조인 스타일을 가져오거나 설정합니다. |
| [MiterLimit](../../system.drawing/pen/miterlimit/) { get; set; } | 연귀 모서리의 결합 두께 제한을 가져오거나 설정합니다. |
| [PenType](../../system.drawing/pen/pentype/) { get; } | 이 펜으로 그린 선의 스타일을 가져옵니다. |
| [StartCap](../../system.drawing/pen/startcap/) { get; set; } | 이 펜으로 그린 선의 시작 부분에 사용되는 캡 스타일을 가져오거나 설정합니다. |
| [Transform](../../system.drawing/pen/transform/) { get; set; } | 이에 대한 기하 변환의 복사본을 가져오거나 설정합니다.Pen . |
| [Width](../../system.drawing/pen/width/) { get; set; } | 그리기에 사용되는 Graphics 개체 단위로 이 Pen의 너비를 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../system.drawing/pen/clone/)() | 이것의 정확한 복사본을 만듭니다.Pen . |
| [Dispose](../../system.drawing/pen/dispose/)() | 이 펜에서 사용하는 모든 리소스를 해제합니다. |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform/#multiplytransform)(Matrix) | 이에 대한 변환 행렬을 곱합니다.Pen 지정된Matrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | 이에 대한 변환 행렬을 곱합니다.Pen 지정된Matrix 지정된 order. |
| [ResetTransform](../../system.drawing/pen/resettransform/)() | 이에 대한 기하 변환 행렬을 재설정합니다.Pen 정체성에. |
| [RotateTransform](../../system.drawing/pen/rotatetransform/#rotatetransform)(float) | 지정된 각도만큼 로컬 기하 변환을 회전합니다. 이 방법은 변환 앞에 회전을 추가합니다. |
| [RotateTransform](../../system.drawing/pen/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | 지정된 순서로 지정된 각도만큼 로컬 기하 변환을 회전합니다. |
| [ScaleTransform](../../system.drawing/pen/scaletransform/#scaletransform)(float, float) | 지정된 계수로 로컬 기하 변환을 조정합니다. 이 방법은 스케일링 행렬을 변환 앞에 추가합니다. |
| [ScaleTransform](../../system.drawing/pen/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | 지정된 순서로 지정된 요소로 로컬 기하 변환의 크기를 조정합니다. |
| [SetLineCap](../../system.drawing/pen/setlinecap/)(LineCap, LineCap, DashCap) | 이것에 의해 그려진 선을 끝내는 데 사용되는 캡 스타일을 결정하는 값을 설정합니다.`Pen` . |
| [TranslateTransform](../../system.drawing/pen/translatetransform/#translatetransform)(float, float) | 지정된 치수로 로컬 기하 변환을 변환합니다. 이 방법은 변환을 변환 앞에 추가합니다. |
| [TranslateTransform](../../system.drawing/pen/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | 지정된 순서로 지정된 치수로 로컬 기하 변환을 변환합니다. |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


