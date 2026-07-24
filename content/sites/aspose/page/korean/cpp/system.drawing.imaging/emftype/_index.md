---
title: "System::Drawing::Imaging::EmfType enum"
linktitle: "EmfType"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::EmfType 열거형. C++에서 EMF 파일에 배치되는 레코드 유형을 지정합니다."
type: docs
weight: 1900
url: /ko/cpp/system.drawing.imaging/emftype/
---
## EmfType enum


EMF 파일에 배치되는 레코드 유형을 지정합니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
enum class EmfType
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| EmfOnly | n/a | [Windows](../../system.windows/) 향상된 메타파일. GDI 명령을 포함합니다. 이 유형의 메타파일은 EMF 파일이라고 합니다. |
| EmfPlusOnly | n/a | [Windows](../../system.windows/) 향상된 메타파일 플러스. GDI+ 명령을 포함합니다. 이 유형의 메타파일은 EMF+ 파일이라고 합니다. |
| EmfPlusDual | n/a | 듀얼 [Windows](../../system.windows/) 향상된 메타파일. 동등한 GDI 및 GDI+ 명령을 포함합니다. 이 유형의 메타파일은 EMF+ 파일이라고 합니다. |

## 또 보기

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
