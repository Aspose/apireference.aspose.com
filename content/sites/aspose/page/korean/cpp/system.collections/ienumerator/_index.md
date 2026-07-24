---
title: "System::Collections::IEnumerator 클래스"
linktitle: "IEnumerator"
second_title: "C++용 Aspose.Page"
description: "System::Collections::IEnumerator 클래스. 일부 요소를 반복하는 데 사용할 수 있는 열거자 인터페이스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 600
url: /ko/cpp/system.collections/ienumerator/
---
## IEnumerator class


일부 요소를 반복하는 데 사용할 수 있는 열거자 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Current](./current/)() const | 현재 요소를 가져옵니다. |
| virtual [get_Current](./get_current/)() const | 현재 요소를 가져옵니다. |
| virtual [MoveNext](./movenext/)() | 열거자를 다음 요소로 이동합니다. 이전에 요소가 참조되지 않은 경우, 사용 가능한 첫 번째 요소를 참조하도록 설정합니다. 컨테이너 끝에 도달하면 아무 작업도 수행하지 않습니다. |
| virtual [Reset](./reset/)() | 열거자를 첫 번째 요소 앞 위치로 재설정합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ValueType](./valuetype/) | RTTI 정보. |

## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
