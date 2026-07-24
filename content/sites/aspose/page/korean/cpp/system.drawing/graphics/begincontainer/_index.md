---
title: "System::Drawing::Graphics::BeginContainer 메서드"
linktitle: "BeginContainer"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Graphics::BeginContainer 메서드. 이 객체의 현재 상태를 저장한 컨테이너를 저장하고, 새 컨테이너를 열어 사용한 뒤 C++에서 저장된 컨테이너를 반환합니다."
type: docs
weight: 600
url: /ko/cpp/system.drawing/graphics/begincontainer/
---
## Graphics::BeginContainer() method


현재 객체의 상태를 포함하는 컨테이너를 저장하고, 새 컨테이너를 열어 사용한 뒤 저장된 컨테이너를 반환합니다.

```cpp
SharedPtr<Drawing2D::GraphicsContainer> System::Drawing::Graphics::BeginContainer()
```

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsContainer](../../../system.drawing.drawing2d/graphicscontainer/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::BeginContainer(Rectangle, Rectangle, GraphicsUnit) method


현재 객체의 상태를 포함하는 컨테이너를 저장하고, 새 컨테이너를 열어 사용한 뒤 저장된 컨테이너를 반환합니다.

```cpp
SharedPtr<Drawing2D::GraphicsContainer> System::Drawing::Graphics::BeginContainer(Rectangle dstrect, Rectangle srcrect, GraphicsUnit unit)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dstrect | Rectangle | 새 컨테이너의 스케일 변환을 지정하는 사각형입니다. **srcrect**와 함께 사용됩니다. |
| srcrect | Rectangle | 새 컨테이너의 스케일 변환을 지정하는 사각형입니다. **dstrect**와 함께 사용됩니다. |
| 단위 | GraphicsUnit | 새 컨테이너의 측정 단위를 지정하는 값 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsContainer](../../../system.drawing.drawing2d/graphicscontainer/)
* Class [Rectangle](../../rectangle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::BeginContainer(RectangleF, RectangleF, GraphicsUnit) method


현재 객체의 상태를 포함하는 컨테이너를 저장하고, 새 컨테이너를 열어 사용한 뒤 저장된 컨테이너를 반환합니다.

```cpp
SharedPtr<Drawing2D::GraphicsContainer> System::Drawing::Graphics::BeginContainer(RectangleF dstrect, RectangleF srcrect, GraphicsUnit unit)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dstrect | RectangleF | 새 컨테이너의 스케일 변환을 지정하는 사각형입니다. **srcrect**와 함께 사용됩니다. |
| srcrect | RectangleF | 새 컨테이너의 스케일 변환을 지정하는 사각형입니다. **dstrect**와 함께 사용됩니다. |
| 단위 | GraphicsUnit | 새 컨테이너의 측정 단위를 지정하는 값 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsContainer](../../../system.drawing.drawing2d/graphicscontainer/)
* Class [RectangleF](../../rectanglef/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
