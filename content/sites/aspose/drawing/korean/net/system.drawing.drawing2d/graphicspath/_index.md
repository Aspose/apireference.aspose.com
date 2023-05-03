---
title: Class GraphicsPath
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Drawing2D.GraphicsPath 수업. 연결된 일련의 선과 곡선을 나타냅니다.
type: docs
weight: 260
url: /ko/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

연결된 일련의 선과 곡선을 나타냅니다.

```csharp
public class GraphicsPath : IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [GraphicsPath](graphicspath/#constructor)() | Alternate. 의 FillMode 값을 사용하여 GraphicsPath 클래스의 새 인스턴스를 초기화합니다. |
| [GraphicsPath](graphicspath/#constructor_1)(FillMode) | 의 새 인스턴스를 초기화합니다.`GraphicsPath`지정된 가 있는 클래스FillMode 열거형. |
| [GraphicsPath](graphicspath/#constructor_2)(PointF[], byte[]) | 의 새 인스턴스를 초기화합니다.`GraphicsPath` 지정된 클래스[`PathPointType`](../pathpointtype/) 그리고PointF 배열. |
| [GraphicsPath](graphicspath/#constructor_4)(Point[], byte[]) | 의 새 인스턴스를 초기화합니다.`GraphicsPath` 지정된 클래스[`PathPointType`](../pathpointtype/) 그리고Point 배열. |
| [GraphicsPath](graphicspath/#constructor_3)(PointF[], byte[], FillMode) | 의 새 인스턴스를 초기화합니다.`GraphicsPath` 지정된 클래스PathPointType 그리고PointF 배열 및 지정된FillMode 열거형 요소.. |
| [GraphicsPath](graphicspath/#constructor_5)(Point[], byte[], FillMode) | 의 새 인스턴스를 초기화합니다.`GraphicsPath` 지정된 클래스PathPointType 그리고Point 배열 및 지정된FillMode 열거형 요소.. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode/) { get; set; } | 이 GraphicsPath에 있는 모양의 내부가 채워지는 방법을 결정하는 FillMode 열거형을 가져오거나 설정합니다. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata/) { get; } | 가져오기PathData 이에 대한 포인트 및 유형의 배열을 캡슐화합니다.GraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints/) { get; } | 경로의 포인트를 가져옵니다. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes/) { get; } | 해당 포인트의 유형을 가져옵니다.PathPoints 배열. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount/) { get; } | 에 있는 요소의 수를 가져옵니다.PathPoints 아니면 그PathTypes 배열. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc_1)(RectangleF, float, float) | 현재 그림에 타원형 호를 추가합니다. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc)(float, float, float, float, float, float) | 현재 그림에 타원형 호를 추가합니다. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier_1)(PointF, PointF, PointF, PointF) | 현재 그림에 3차 베지어 곡선을 추가합니다. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier)(float, float, float, float, float, float, float, float) | 현재 그림에 3차 베지어 곡선을 추가합니다. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers)(PointF[]) | 연결된 3차 베지어 곡선 시퀀스를 현재 그림에 추가합니다. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers_1)(Point[]) | 연결된 3차 베지어 곡선 시퀀스를 현재 그림에 추가합니다. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve)(PointF[]) | 이 경로에 닫힌 곡선을 추가합니다. 곡선이 배열의 각 점을 통과하기 때문에 기본 스플라인 곡선이 사용됩니다. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve_1)(PointF[], float) | 이 경로에 닫힌 곡선을 추가합니다. 곡선이 배열의 각 점을 통과하기 때문에 기본 스플라인 곡선이 사용됩니다. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve)(PointF[]) | 현재 그림에 스플라인 곡선을 추가합니다. 곡선이 배열의 각 점을 통과하기 때문에 기본 스플라인 곡선이 사용됩니다. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_3)(Point[]) | 현재 그림에 스플라인 곡선을 추가합니다. 곡선이 배열의 각 점을 통과하기 때문에 기본 스플라인 곡선이 사용됩니다. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_2)(PointF[], float) | 현재 그림에 스플라인 곡선을 추가합니다. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_1)(PointF[], int, int, float) | 현재 그림에 스플라인 곡선을 추가합니다. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse_1)(RectangleF) | 현재 경로에 타원을 추가합니다. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse)(float, float, float, float) | 현재 경로에 타원을 추가합니다. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline_1)(PointF, PointF) | 이 GraphicsPath에 선분을 추가합니다. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline)(float, float, float, float) | 이 GraphicsPath에 선분을 추가합니다. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines)(PointF[]) | 일련의 연결된 선 세그먼트를 이 끝에 추가합니다.GraphicsPath . |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines_1)(Point[]) | 일련의 연결된 선 세그먼트를 이 끝에 추가합니다.GraphicsPath . |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath/)(GraphicsPath, bool) | 지정된 GraphicsPath를 이 경로에 추가합니다. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie_1)(Rectangle, float, float) | 파이 모양의 외곽선을 이 경로에 추가합니다. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie)(float, float, float, float, float, float) | 파이 모양의 외곽선을 이 경로에 추가합니다. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon)(PointF[]) | 이 경로에 다각형을 추가합니다. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon_1)(Point[]) | 이 경로에 다각형을 추가합니다. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle)(Rectangle) | 이 경로에 사각형을 추가합니다. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle_1)(RectangleF) | 이 경로에 사각형을 추가합니다. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles)(RectangleF[]) | 이 경로에 일련의 직사각형을 추가합니다. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles_1)(Rectangle[]) | 이 경로에 일련의 직사각형을 추가합니다. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring)(string, FontFamily, int, float, Point, StringFormat) | 이 경로에 텍스트 문자열을 추가합니다. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | 이 경로에 텍스트 문자열을 추가합니다. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | 이 경로에 텍스트 문자열을 추가합니다. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | 이 경로에 텍스트 문자열을 추가합니다. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone/)() | 현재 경로 개체의 복사본을 만듭니다. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures/)() | 이 경로에서 열려 있는 모든 그림을 닫고 새 그림을 시작합니다. 끝점에서 시작점까지 선을 연결하여 열려 있는 그림을 닫습니다. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure/)() | 현재 그림을 닫고 새 그림을 시작합니다. 현재 그림에 연결된 선과 곡선의 시퀀스가 포함되어 있으면 메서드는 끝점에서 시작점까지 선을 연결하여 루프를 닫습니다. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose/)() | 이 GraphicsPath에서 사용하는 모든 리소스를 해제합니다. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten)() | 이 경로의 각 곡선을 일련의 연결된 선 세그먼트로 변환합니다. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_1)(Matrix) | 지정된 변환을 적용한 다음 이 안에 있는 각 곡선을 변환합니다.GraphicsPath . |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_2)(Matrix, float) | 이 안에 있는 각 곡선을 변환합니다.GraphicsPath 연결된 라인 세그먼트의 시퀀스로. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds)() | 이것을 경계하는 사각형을 반환합니다.GraphicsPath . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_1)(Matrix) | 이것을 경계하는 사각형을 반환합니다.GraphicsPath 이 경로가 지정된 경로에 의해 변환될 때Matrix . |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_2)(Matrix, Pen) | 이것을 경계하는 사각형을 반환합니다.GraphicsPath 현재 경로가 지정된 경로에 의해 변환된 경우Matrix 그리고 지정된Pen . |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint/)() | 이 PathPoints 배열의 마지막 지점을 가져옵니다.`GraphicsPath` . |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible/)(PointF, Pen) | 지정된 점이 이 윤곽선 안에(아래) 포함되는지 여부를 나타냅니다.GraphicsPath 지정된 것으로 그릴 때Pen . |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/)(PointF) | 지정된 점이 이 안에 포함되는지 여부를 나타냅니다.GraphicsPath . |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset/)() | 비우기[`PathPoints`](./pathpoints/) 그리고[`PathTypes`](./pathtypes/) arrays 및 설정[`FillMode`](../fillmode/) 에게Alternate . |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse/)() | 포인트의 순서를 반대로 합니다.[`PathPoints`](./pathpoints/)이것의 배열`GraphicsPath` . |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers/)() | 이것에 마커를 설정합니다.`GraphicsPath` . |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure/)() | 현재 그림을 닫지 않고 새 그림을 시작합니다. 경로에 추가된 모든 후속 점이 이 새 그림에 추가됩니다. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform/)(Matrix) | 이 GraphicsPath에 변환 매트릭스를 적용합니다. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp)(PointF[], RectangleF) | 사각형과 평행사변형으로 정의된 워프 변환을 여기에 적용합니다.`GraphicsPath` . |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_1)(PointF[], RectangleF, Matrix) | 직사각형과 평행사변형으로 정의된 뒤틀기 변환을 여기에 적용합니다.`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | 직사각형과 평행사변형으로 정의된 뒤틀기 변환을 여기에 적용합니다.`GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | 직사각형과 평행사변형으로 정의된 뒤틀기 변환을 여기에 적용합니다.`GraphicsPath`. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen)(Pen) | 경로에 윤곽선을 추가합니다. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_1)(Pen, Matrix) | 에 윤곽을 추가합니다.GraphicsPath . |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_2)(Pen, Matrix, float) | 이것을 대체합니다.GraphicsPath 지정된 펜으로 이 경로를 그릴 때 채워지는 영역을 둘러싸는 곡선으로. |

### 또한보십시오

* 네임스페이스 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 집회 [Aspose.Drawing](../../)


