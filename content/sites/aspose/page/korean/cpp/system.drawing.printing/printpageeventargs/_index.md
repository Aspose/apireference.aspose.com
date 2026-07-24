---
title: "System::Drawing::Printing::PrintPageEventArgs 클래스"
linktitle: "PrintPageEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Printing::PrintPageEventArgs 클래스. PrintPage 이벤트에 대한 데이터를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 900
url: /ko/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


PrintPage 이벤트에 대한 데이터를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Graphics](./get_graphics/)() | 구현되지 않음. |
| [get_HasMorePages](./get_hasmorepages/)() | 구현되지 않음. |
| [get_PageSettings](./get_pagesettings/)() | 구현되지 않음. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | [PrintPageEventArgs](./) 클래스의 새 인스턴스를 생성합니다. |
| [set_HasMorePages](./set_hasmorepages/)(bool) | 구현되지 않음. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 정적 멤버로, "빈" [EventArgs](../../system/eventargs/) 공유 포인터(null-pointer)를 나타냅니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
