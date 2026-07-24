---
title: "System::Drawing::Imaging::ColorAdjustType enum"
linktitle: "ColorAdjustType"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::ColorAdjustType 열거형. C++에서 어떤 객체가 색 보정 정보를 사용하는지 지정합니다."
type: docs
weight: 1500
url: /ko/cpp/system.drawing.imaging/coloradjusttype/
---
## ColorAdjustType enum


어떤 객체가 색상 조정 정보를 사용하는지 지정합니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
enum class ColorAdjustType
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Default | 0 | 자신만의 색 보정 정보가 없는 모든 객체에서 사용되는 색 보정 정보를 정의합니다. |
| Bitmap | 1 | [Bitmap](../../system.drawing/bitmap/) 객체에 대한 색 보정 정보를 정의합니다. |
| Brush | 2 | [Brush](../../system.drawing/brush/) 객체에 대한 색상 조정 정보를 정의합니다. |
| Pen | 3 | [Pen](../../system.drawing/pen/) 객체에 대한 색상 조정 정보를 정의합니다. |
| Text | 4 | 텍스트에 대한 색상 조정 정보를 정의합니다. |
| Count | 5 | 지정된 유형의 수를 지정합니다. |
| 모두 | 6 | 지정된 유형의 수를 지정합니다. |

## 또 보기

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
