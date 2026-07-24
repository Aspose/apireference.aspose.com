---
title: "Aspose::Page::EPS::Util::ThreadLocal 클래스"
linktitle: "ThreadLocal"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::Util::ThreadLocal 클래스. .NET Framework 4.0 및 4.5의 System.Threading.ThreadLocal 래퍼 타입이 제공하는 기능을 복제하기 위해 사용되는 클래스입니다. 이는 스레드 로컬인 인스턴스 및 정적 타입을 구현하며, 스레드마다 다른 인스턴스를 참조하지만 실제 인스턴스 타입은 C++에서 동일할 수 있습니다."
type: docs
weight: 100
url: /ko/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


.NET Framework 4.0 및 4.5의 System.Threading.ThreadLocal 래퍼 타입이 제공하는 기능을 복제하기 위해 사용되는 클래스입니다. 이 클래스는 스레드 로컬인 인스턴스 및 정적 타입을 구현하며, 스레드마다 다른 인스턴스를 참조하도록 합니다. 실제로 클래스가 집합하는 인스턴스 타입이 동일할 수 있더라도 말입니다.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| 매개변수 | 설명 |
| --- | --- |
| T | 스레드 선택 로직에서 래핑할 변수 유형 |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Dispose](./dispose/)() override | 아무 작업도 수행하지 않습니다. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n번째 템플릿 인수를 약한 포인터(공유 포인터가 아니라)로 설정합니다. 컨테이너에서 포인터를 약한 모드로 전환할 수 있습니다. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Factory](./factory/) |  |

## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
