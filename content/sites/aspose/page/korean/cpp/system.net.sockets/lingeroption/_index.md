---
title: "System::Net::Sockets::LingerOption 클래스"
linktitle: "LingerOption"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::LingerOption 클래스. 소켓이 Close() 또는 Close() 메서드 호출 후에도 연결된 상태를 유지할지 여부를 지정합니다. 또한 데이터 전송이 계속될 경우 소켓이 연결된 상태를 유지하는 기간을 지정합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 200
url: /ko/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


소켓이 Close() 또는 Close() 메서드 호출 후에도 연결된 상태를 유지할지 여부를 지정합니다. 또한 데이터 전송이 계속될 경우 소켓이 연결된 상태를 유지하는 기간을 지정합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class LingerOption : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Enabled](./get_enabled/)() | RTTI 정보. |
| [get_LingerTime](./get_lingertime/)() | 지연 시간 제한을 초 단위로 가져옵니다. |
| [LingerOption](./lingeroption/)(bool, int32_t) | 새 인스턴스를 생성합니다. |
| [set_Enabled](./set_enabled/)(bool) | 소켓이 모든 보류 중인 데이터를 전송하려고 닫기를 지연시킬지 여부를 나타내는 값을 설정합니다. |
| [set_LingerTime](./set_lingertime/)(int32_t) | 지연 시간 제한을 초 단위로 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
