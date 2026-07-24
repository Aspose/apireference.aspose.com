---
title: "System::Drawing::Printing::PrintEventArgs class"
linktitle: "PrintEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Printing::PrintEventArgs class. BeginPrint 및 EndPrint 이벤트에 대한 데이터를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 C++에서 함수 인자로 전달하십시오."
type: docs
weight: 800
url: /ko/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


BeginPrint 및 EndPrint 이벤트에 대한 데이터를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | 현재 객체가 나타내는 인쇄 작업을 지정하는 값을 반환합니다. |
| [PrintEventArgs](./printeventargs/)() | [PrintEventArgs](./) 객체의 새 인스턴스를 생성합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 정적 멤버로, "빈" [EventArgs](../../system/eventargs/) 공유 포인터(null-pointer)를 나타냅니다. |
## 또 보기

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
