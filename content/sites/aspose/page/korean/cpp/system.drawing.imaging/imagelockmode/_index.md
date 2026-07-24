---
title: "System::Drawing::Imaging::ImageLockMode enum"
linktitle: "ImageLockMode"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::ImageLockMode enum. C++에서 잠금된 이미지 영역의 속성을 지정합니다."
type: docs
weight: 2300
url: /ko/cpp/system.drawing.imaging/imagelockmode/
---
## ImageLockMode enum


잠금 중인 이미지 영역의 속성을 지정합니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
enum class ImageLockMode
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| ReadOnly | 1 | 해당 영역은 읽기 전용으로 잠겨 있습니다. |
| 쓰기 전용 | 2 | 해당 영역은 쓰기 전용으로 잠겨 있습니다. |
| 읽기/쓰기 | n/a | 해당 영역은 읽기와 쓰기 모두에 대해 잠겨 있습니다. |
| 사용자 입력 버퍼 | 4 | 이미지는 사용자 입력 버퍼에 존재하며, 해당 버퍼에 대한 접근은 사용자가 제어합니다. |

## 또 보기

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
