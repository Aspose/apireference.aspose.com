---
title: "System::Drawing::Imaging::MetafileType enum"
linktitle: "MetafileType"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::MetafileType enum. C++에서 그래픽 메타파일 유형을 나타냅니다."
type: docs
weight: 2500
url: /ko/cpp/system.drawing.imaging/metafiletype/
---
## MetafileType enum


그래픽 메타파일의 유형을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
enum class MetafileType
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| 잘못된 | 0 | 잘못된 메타파일입니다. |
| Wmf | 1 | 표준 WMF. |
| WmfPlaceable | 2 | 배치 가능한 [Metafile](../metafile/) 형식입니다. |
| Emf | 3 | EMF (EMF+ 아님). |
| EmfPlusOnly | 4 | 듀얼 및 하위 레벨 레코드가 없는 EMF+. |
| EmfPlusDual | 5 | 듀얼 및 하위 레벨 레코드가 포함된 EMF+. |

## 또 보기

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
