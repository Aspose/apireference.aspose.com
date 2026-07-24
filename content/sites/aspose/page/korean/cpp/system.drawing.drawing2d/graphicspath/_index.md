---
title: "System::Drawing::Drawing2D::GraphicsPath 클래스"
linktitle: "GraphicsPath"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Drawing2D::GraphicsPath 클래스. 연결된 선과 곡선의 집합을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 600
url: /ko/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


연결된 선과 곡선의 집합을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 new 연산자를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터에 래핑하고, 이 포인터를 함수 인수로 전달하십시오.

```cpp
class GraphicsPath : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | 현재 객체가 나타내는 경로에 지정된 타원 호를 추가합니다. |
| [AddArc](./addarc/)(int, int, int, int, float, float) | 현재 객체가 나타내는 경로에 지정된 타원 호를 추가합니다. |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | 현재 객체가 나타내는 경로에 지정된 타원 호를 추가합니다. |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | 현재 객체가 나타내는 경로에 지정된 타원 호를 추가합니다. |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | 현재 객체가 나타내는 경로에 지정된 3차 베지어 곡선을 추가합니다. |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | 현재 객체가 나타내는 경로에 지정된 3차 베지어 곡선을 추가합니다. |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | 현재 객체가 나타내는 경로에 지정된 3차 베지어 곡선을 추가합니다. |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | 현재 객체가 나타내는 경로에 지정된 3차 베지어 곡선을 추가합니다. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | 현재 도형에 연결된 3차 베지어 곡선들의 시퀀스를 추가합니다. |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | 현재 도형에 연결된 3차 베지어 곡선들의 시퀀스를 추가합니다. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | 현재 객체가 나타내는 경로에 지정된 닫힌 곡선을 추가합니다. |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | 현재 객체가 나타내는 경로에 지정된 닫힌 곡선을 추가합니다. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | 현재 객체가 나타내는 경로에 지정된 곡선을 추가합니다. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | 현재 객체가 나타내는 경로에 지정된 곡선을 추가합니다. |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | 현재 객체가 나타내는 경로에 지정된 곡선을 추가합니다. |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | 현재 객체가 나타내는 경로에 지정된 곡선을 추가합니다. |
| [AddEllipse](./addellipse/)(float, float, float, float) | 현재 객체가 나타내는 경로에 지정된 타원을 추가합니다. |
| [AddEllipse](./addellipse/)(int, int, int, int) | 현재 객체가 나타내는 경로에 지정된 타원을 추가합니다. |
| [AddEllipse](./addellipse/)(const RectangleF\&) | 현재 객체가 나타내는 경로에 지정된 타원을 추가합니다. |
| [AddEllipse](./addellipse/)(const Rectangle\&) | 현재 객체가 나타내는 경로에 지정된 타원을 추가합니다. |
| [AddLine](./addline/)(const Point\&, const Point\&) | 현재 객체가 나타내는 경로에 지정된 선을 추가합니다. |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | 현재 객체가 나타내는 경로에 지정된 선을 추가합니다. |
| [AddLine](./addline/)(int, int, int, int) | 현재 객체가 나타내는 경로에 지정된 선을 추가합니다. |
| [AddLine](./addline/)(float, float, float, float) | 현재 객체가 나타내는 경로에 지정된 선을 추가합니다. |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | 현재 객체가 나타내는 경로에 지정된 연결된 선분들의 시리즈를 추가합니다. |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | 현재 객체가 나타내는 경로에 지정된 연결된 선분들의 시리즈를 추가합니다. |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | 현재 객체가 나타내는 경로에 지정된 경로를 추가합니다. |
| [AddPie](./addpie/)(float, float, float, float, float, float) | 현재 객체가 나타내는 경로에 지정된 파이 모양의 외곽선을 추가합니다. |
| [AddPie](./addpie/)(int, int, int, int, float, float) | 현재 객체가 나타내는 경로에 지정된 파이 모양의 외곽선을 추가합니다. |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | 현재 객체가 나타내는 경로에 지정된 파이 모양의 외곽선을 추가합니다. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | 현재 객체가 나타내는 경로에 지정된 다각형을 추가합니다. |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | 현재 객체가 나타내는 경로에 지정된 다각형을 추가합니다. |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | 현재 객체가 나타내는 경로에 지정된 사각형을 추가합니다. |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | 현재 객체가 나타내는 경로에 지정된 사각형을 추가합니다. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | 현재 객체가 나타내는 경로에 지정된 사각형들의 시리즈를 추가합니다. |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | 현재 객체가 나타내는 경로에 지정된 사각형들의 시리즈를 추가합니다. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | 현재 객체가 나타내는 경로에 텍스트 문자열을 추가합니다. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | 현재 객체가 나타내는 경로에 텍스트 문자열을 추가합니다. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | 현재 객체가 나타내는 경로에 텍스트 문자열을 추가합니다. |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | 현재 객체가 나타내는 경로에 텍스트 문자열을 추가합니다. |
| virtual [Clone](./clone/)() | 현재 객체의 복사본을 생성합니다. |
| [CloseAllFigures](./closeallfigures/)() | 모든 열린 도형을 닫고 새 도형을 시작합니다. |
| [CloseFigure](./closefigure/)() | 현재 도형을 닫고 새 도형을 시작합니다. |
| [Dispose](./dispose/)() | 현재 객체가 획득한 모든 운영 체제 리소스를 해제합니다. |
| [Flatten](./flatten/)() | 경로의 각 곡선을 연결된 선들의 시리즈로 변환하여 평탄화합니다. 평탄도 값 0.25가 사용됩니다. |
| [Flatten](./flatten/)(const MatrixPtr\&) | 경로의 각 곡선을 연결된 선들의 시리즈로 변환하여 평탄화합니다. 평탄도 값 0.25가 사용됩니다. |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | 경로의 각 곡선을 연결된 선들의 시리즈로 변환하여 평탄화합니다. |
| [get_FillMode](./get_fillmode/)() | 현재 객체의 채우기 모드를 반환합니다. |
| [get_PathData](./get_pathdata/)() | 현재 객체가 나타내는 경로를 구성하는 점들과 그 유형을 포함하는 [PathData](../pathdata/) 객체를 반환합니다. |
| [get_PathPoints](./get_pathpoints/)() const | 현재 객체가 나타내는 경로를 구성하는 점들을 포함하는 배열을 반환합니다. |
| [get_PathTypes](./get_pathtypes/)() const | 현재 객체가 나타내는 경로를 구성하는 점들의 유형을 나타내는 값을 포함하는 배열을 반환합니다. |
| [get_PointCount](./get_pointcount/)() const | 현재 객체가 나타내는 경로의 점 개수를 반환합니다. |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | 지정된 행렬로 변환될 때 현재 객체가 나타내는 경로를 둘러싸는 사각형을 나타내는 [RectangleF](../../system.drawing/rectanglef/) 객체를 반환합니다. |
| [GetFigureFlags](./getfigureflags/)() | 현재 객체가 나타내는 경로에 포함된 도형 유형을 나타내는 Detail::FigureType 값들의 비트별 조합인 값을 반환합니다. |
| [GetLastPoint](./getlastpoint/)() const | 경로의 마지막 점을 나타내는 [PointF](../../system.drawing/pointf/) 객체를 반환합니다. |
| [GraphicsPath](./graphicspath/)(FillMode) | 지정된 채우기 모드로 [GraphicsPath](./) 클래스의 새 인스턴스를 생성합니다. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | 지정된 경로를 나타내는 [GraphicsPath](./) 객체의 새 인스턴스를 생성합니다. |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | 지정된 경로를 나타내는 [GraphicsPath](./) 객체의 새 인스턴스를 생성합니다. |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | 지정된 [Pen](../../system.drawing/pen/)으로 그릴 때 이 [GraphicsPath](./)의 외곽선(아래)에 지정된 점이 포함되는지 여부를 나타냅니다. 구현되지 않음. |
| [IsVisible](./isvisible/)(const PointF\&) | 현재 객체가 나타내는 경로에 지정된 점이 포함되는지 여부를 판단합니다. |
| [IsVisible](./isvisible/)(float, float) | 현재 객체가 나타내는 경로에 지정된 점이 포함되는지 여부를 판단합니다. |
| [Reset](./reset/)() | 모든 점을 제거하여 경로를 비웁니다. |
| [Reverse](./reverse/)() | 이 [GraphicsPath](./)의 PathPoints 배열에 있는 점들의 순서를 반전시킵니다. |
| [set_FillMode](./set_fillmode/)(FillMode) | 현재 객체의 채우기 모드를 설정합니다. |
| [SetMarkers](./setmarkers/)() | 구현되지 않음. |
| [StartFigure](./startfigure/)() | 새 도형을 시작합니다. |
| [Transform](./transform/)(const MatrixPtr\&) | 지정된 변환 행렬을 적용하여 현재 객체가 나타내는 경로를 변환합니다. |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | 이 경로를 원래 경로를 둘러싼 외곽선으로 교체합니다. |
| [~GraphicsPath](./~graphicspath/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
