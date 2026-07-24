---
title: "System::Drawing::Drawing2D::PathData 클래스"
linktitle: "PathData"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Drawing2D::PathData 클래스. 경로를 나타내는 그래픽 데이터를 포함합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1100
url: /ko/cpp/system.drawing.drawing2d/pathdata/
---
## PathData class


경로를 나타내는 그래픽 데이터를 포함합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class PathData : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Points](./get_points/)() | 경로를 구성하는 점들을 포함하는 배열을 반환합니다. |
| [get_Types](./get_types/)() | 해당 **Points** 배열의 점 유형을 지정하는 값을 포함하는 배열을 반환합니다. |
| [PathData](./pathdata/)() | [PathData](./) 객체를 빈 상태로 생성합니다. |
| [set_Points](./set_points/)(const ArrayPtr\<PointF\>\&) | 경로를 구성하는 점들을 포함하는 배열을 설정합니다. |
| [set_Types](./set_types/)(const ArrayPtr\<uint8_t\>\&) | 해당 **Points** 배열의 점 유형을 지정하는 값을 포함하는 배열을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
