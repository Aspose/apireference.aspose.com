---
title: "System::Web::Services::Protocols::SoapMessage 클래스"
linktitle: "SoapMessage"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::SoapMessage 클래스. SOAP 메시지를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


SOAP 메시지를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class SoapMessage : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | SOAP 헤더의 내부 컬렉션을 설정합니다. |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | 지정된 헤더 유형으로 헤더 매핑을 찾습니다. |
| virtual [get_Action](./get_action/)() | 'SOAPAction' 속성의 값을 반환합니다. |
| [get_ContentEncoding](./get_contentencoding/)() | 'Content-Encoding' 헤더의 값을 가져옵니다. |
| [get_ContentType](./get_contenttype/)() | 'Content-Type' 헤더의 값을 가져옵니다. |
| [get_Exception](./get_exception/)() | XML [Web](../../system.web/) 서비스 메서드에 의해 발생된 예외를 가져옵니다. |
| [get_Headers](./get_headers/)() | SOAP 헤더 컬렉션을 반환합니다. |
| [get_InParameters](./get_inparameters/)() | XML [Web](../../system.web/) 서비스 메서드에 전달되는 매개변수를 가져옵니다. |
| [get_IsSoap12](./get_issoap12/)() | SOAP 버전 1.2가 사용되는지 여부를 나타내는 값을 반환합니다. |
| [get_OutParameters](./get_outparameters/)() | XML [Web](../../system.web/) 서비스 메서드에 전달되는 출력 매개변수를 가져옵니다. |
| virtual [get_SoapVersion](./get_soapversion/)() | 사용되는 SOAP 버전을 반환합니다. |
| [get_Stage](./get_stage/)() | SOAP 메시지의 처리 단계를 가져옵니다. |
| [get_Stream](./get_stream/)() | SOAP 메시지 데이터를 포함하는 스트림을 가져옵니다. |
| virtual [get_Url](./get_url/)() | XML [Web](../../system.web/) 서비스 URL을 반환합니다. |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | 지정된 인덱스의 입력 매개변수 값을 가져옵니다. |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | 지정된 인덱스의 출력 매개변수 값을 가져옵니다. |
| [GetReturnValue](./getreturnvalue/)() | XML [Web](../../system.web/) 서비스 메서드의 반환 값을 가져옵니다. |
| [set_ContentEncoding](./set_contentencoding/)(String) | 'Content-Encoding' 헤더의 값을 설정합니다. |
| [set_ContentType](./set_contenttype/)(String) | 'Content-Type' 헤더의 값을 설정합니다. |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | XML [Web](../../system.web/) 서비스 메서드에 전달되는 매개변수를 설정합니다. |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | SOAP 메시지 데이터를 포함하는 스트림을 설정합니다. |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | XML [Web](../../system.web/) 서비스 메서드에 전달되는 출력 매개변수를 설정합니다. |
| [SetException](./setexception/)(SoapException) | XML [Web](../../system.web/) 서비스 메서드에 의해 발생된 예외를 설정합니다. |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | SOAP 헤더 컬렉션을 설정합니다. |
| [SetStage](./setstage/)(SoapMessageStage) | SOAP 메시지의 처리 단계를 설정합니다. |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | SOAP 메시지 데이터를 포함하는 스트림을 설정합니다. |
| [SoapMessage](./soapmessage/)() | 새 인스턴스를 생성합니다. |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | SOAP 헤더의 내부 컬렉션을 업데이트합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
