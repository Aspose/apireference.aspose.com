---
title: "System::Drawing::Region 클래스"
linktitle: "Region"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Region 클래스. 그래픽 형태의 내부를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2100
url: /ko/cpp/system.drawing/region/
---
## Region class


그래픽 형태의 내부를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class Region : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() const | 현재 객체의 복사본을 반환합니다. |
| [Complement](./complement/)(const RectangleF\&) | 현재 객체가 나타내는 영역을 지정된 recangle에 의해 정의된 영역 중 이 영역과 교차하지 않는 부분으로 교체합니다. |
| [Complement](./complement/)(const Rectangle\&) | 현재 객체가 나타내는 영역을 지정된 recangle에 의해 정의된 영역 중 이 영역과 교차하지 않는 부분으로 교체합니다. |
| [Complement](./complement/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 현재 객체가 나타내는 영역을 지정된 경로에 의해 정의된 영역 중 이 영역과 교차하지 않는 부분으로 교체합니다. |
| [Complement](./complement/)(const SharedPtr\<Region\>\&) | 현재 객체가 나타내는 영역을 지정된 영역 중 이 영역과 교차하지 않는 부분으로 교체합니다. |
| [Dispose](./dispose/)() | 현재 객체가 획득한 모든 운영 체제 리소스를 해제합니다. |
| [Equals](./equals/)(const SharedPtr\<Region\>\&, const SharedPtr\<Graphics\>\&) | 지정된 영역이 지정된 그리기 표면에서 현재 객체가 나타내는 영역과 동일한지 여부를 판단합니다. |
| [Exclude](./exclude/)(const RectangleF\&) | 현재 객체가 나타내는 영역을 지정된 rectange에 의해 정의된 영역을 제외한 결과로 교체합니다. |
| [Exclude](./exclude/)(const Rectangle\&) | 현재 객체가 나타내는 영역을 지정된 rectange에 의해 정의된 영역을 제외한 결과로 교체합니다. |
| [Exclude](./exclude/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 현재 객체가 나타내는 영역을 지정된 경로에 의해 정의된 영역을 제외한 결과로 교체합니다. |
| [Exclude](./exclude/)(const SharedPtr\<Region\>\&) | 현재 객체가 나타내는 영역을 지정된 영역을 제외한 결과로 교체합니다. |
| [GetBounds](./getbounds/)(const SharedPtr\<Graphics\>\&) const | [RectangleF](../rectanglef/) 구조체를 가져옵니다. 이 구조체는 [Graphics](../graphics/) 객체의 그리기 표면에서 이 [Region](./)을 둘러싸는 사각형을 나타냅니다. |
| [GetRegionData](./getregiondata/)() const | 현재 객체가 나타내는 영역을 정의하는 데이터를 포함하는 RegionData 객체를 반환합니다. |
| [GetRegionScans](./getregionscans/)(const SharedPtr\<Drawing2D::Matrix\>\&) const | 지정된 행렬 변환이 적용된 후 이 [Region](./)을 근사하는 [RectangleF](../rectanglef/) 구조체 배열을 반환합니다. |
| [Intersect](./intersect/)(const RectangleF\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 사각형으로 정의된 영역의 교차 결과로 교체합니다. |
| [Intersect](./intersect/)(const Rectangle\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 사각형으로 정의된 영역의 교차 결과로 교체합니다. |
| [Intersect](./intersect/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 경로로 정의된 영역의 교차 결과로 교체합니다. |
| [Intersect](./intersect/)(const SharedPtr\<Region\>\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 영역의 교차 결과로 교체합니다. |
| [IsEmpty](./isempty/)(const SharedPtr\<Graphics\>\&) const | 현재 객체가 나타내는 영역이 지정된 그리기 표면에서 내부가 비어 있는지 여부를 결정합니다. |
| [IsInfinite](./isinfinite/)(const SharedPtr\<Graphics\>\&) const | 현재 객체가 나타내는 영역이 지정된 그리기 표면에서 내부가 무한한지 여부를 결정합니다. |
| [IsVisible](./isvisible/)(const Point\&) const | 지정된 점이 현재 객체가 나타내는 영역에 포함되는지 여부를 결정합니다. |
| [IsVisible](./isvisible/)(const PointF\&) const | 지정된 점이 현재 객체가 나타내는 영역에 포함되는지 여부를 결정합니다. |
| [IsVisible](./isvisible/)(const Rectangle\&) | 지정된 사각형의 일부가 현재 객체가 나타내는 영역에 포함되는지 여부를 결정합니다. |
| [IsVisible](./isvisible/)(const RectangleF\&) | 지정된 사각형의 일부가 현재 객체가 나타내는 영역에 포함되는지 여부를 결정합니다. |
| [IsVisible](./isvisible/)(const Point\&, const SharedPtr\<Graphics\>\&) const | 지정된 그래픽을 사용하여 지정된 점이 현재 객체가 나타내는 영역에 포함되는지 여부를 결정합니다. |
| [IsVisible](./isvisible/)(const PointF\&, const SharedPtr\<Graphics\>\&) const | 지정된 그래픽을 사용하여 지정된 점이 현재 객체가 나타내는 영역에 포함되는지 여부를 결정합니다. |
| [IsVisible](./isvisible/)(const Rectangle\&, const SharedPtr\<Graphics\>\&) | 지정된 그래픽을 사용하여 지정된 사각형의 일부가 현재 객체가 나타내는 영역에 포함되는지 여부를 결정합니다. |
| [IsVisible](./isvisible/)(const RectangleF\&, const SharedPtr\<Graphics\>\&) | 지정된 그래픽을 사용하여 지정된 사각형의 일부가 현재 객체가 나타내는 영역에 포함되는지 여부를 결정합니다. |
| [IsVisible](./isvisible/)(float, float) const | 지정된 점이 현재 객체가 나타내는 영역에 포함되는지 여부를 결정합니다. |
| [IsVisible](./isvisible/)(float, float, const SharedPtr\<Graphics\>\&) const | 지정된 그래픽을 사용하여 지정된 점이 현재 객체가 나타내는 영역에 포함되는지 여부를 결정합니다. |
| [MakeEmpty](./makeempty/)() | 현재 객체를 빈 내부로 초기화합니다. |
| [MakeInfinite](./makeinfinite/)() | 이 영역 객체를 무한한 내부로 초기화합니다. |
| [Region](./region/)() | [Region](./) 클래스의 새 인스턴스를 생성합니다. |
| [Region](./region/)(const RectangleF\&) | 지정된 사각형으로 정의된 영역을 나타내는 [Region](./) 클래스의 새 인스턴스를 생성합니다. |
| [Region](./region/)(const Rectangle\&) | 지정된 사각형으로 정의된 영역을 나타내는 [Region](./) 클래스의 새 인스턴스를 생성합니다. |
| [Region](./region/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 지정된 경로로 정의된 영역을 나타내는 [Region](./) 클래스의 새 인스턴스를 생성합니다. |
| [Region](./region/)(const SkPath\&) |  |
| [Region](./region/)(const SharedPtr\<Drawing2D::RegionData\>\&) | 지정된 RegionData 객체로 정의된 영역을 나타내는 [Region](./) 클래스의 새 인스턴스를 생성합니다. |
| [Transform](./transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | 지정된 행렬을 사용하여 이 영역을 변환합니다. |
| [Transform](./transform/)(const SkMatrix\&) | 지정된 행렬을 사용하여 이 영역을 변환합니다. |
| [Translate](./translate/)(int, int) | 지정된 양만큼 영역의 좌표를 이동합니다. |
| [Translate](./translate/)(float, float) | 지정된 양만큼 영역의 좌표를 이동합니다. |
| [Union](./union/)(const RectangleF\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 사각형으로 정의된 영역의 합집합 연산 결과로 교체합니다. |
| [Union](./union/)(const Rectangle\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 사각형으로 정의된 영역의 합집합 결과로 교체합니다. |
| [Union](./union/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 경로로 정의된 영역의 합집합 결과로 교체합니다. |
| [Union](./union/)(const SharedPtr\<Region\>\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 영역의 합집합 결과로 교체합니다. |
| [Xor](./xor/)(const RectangleF\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 사각형으로 정의된 영역 중 교차하지 않는 부분으로 교체합니다. |
| [Xor](./xor/)(const Rectangle\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 사각형으로 정의된 영역 중 교차하지 않는 부분으로 교체합니다. |
| [Xor](./xor/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 경로로 정의된 영역 중 교차하지 않는 부분으로 교체합니다. |
| [Xor](./xor/)(const SharedPtr\<Region\>\&) | 현재 객체가 나타내는 영역을 이 영역과 지정된 영역 중 교차하지 않는 부분으로 교체합니다. |
| virtual [~Region](./~region/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
