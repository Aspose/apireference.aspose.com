---
title: "System::Diagnostics::Stopwatch 클래스"
linktitle: "Stopwatch"
second_title: "C++용 Aspose.Page"
description: "System::Diagnostics::Stopwatch 클래스. 시간 측정을 허용합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 700
url: /ko/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


시간 측정을 허용합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class Stopwatch : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | 현재 인스턴스에서 측정된 총 경과 시간을 가져옵니다. |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | 현재 인스턴스에서 측정된 총 경과 시간을 밀리초 단위로 가져옵니다. |
| [get_ElapsedTicks](./get_elapsedticks/)() const | 현재 인스턴스에서 측정된 총 경과 시간을 타이머 틱 단위로 가져옵니다. |
| [get_IsRunning](./get_isrunning/)() const | 스톱워치가 실행 중인지 확인합니다. |
| [Reset](./reset/)() | 시간 측정을 중지하고, 측정된 간격을 0으로 설정합니다. |
| [Restart](./restart/)() | 측정된 간격을 0으로 설정한 후, 시간 측정을 시작합니다. |
| [Start](./start/)() | 시간 측정을 시작합니다. |
| static [StartNew](./startnew/)() | 새로운 [Stopwatch](./) 객체를 생성하고 측정을 시작합니다. |
| [Stop](./stop/)() | 시간 측정을 중지합니다. |
| [Stopwatch](./stopwatch/)() | RTTI 정보. |
| virtual [~Stopwatch](./~stopwatch/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
