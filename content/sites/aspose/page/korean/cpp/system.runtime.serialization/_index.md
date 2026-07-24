---
title: "System::Runtime::Serialization 네임스페이스"
linktitle: "System::Runtime::Serialization"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Runtime::Serialization 네임스페이스를 사용하는 방법."
type: docs
weight: 5300
url: /ko/cpp/system.runtime.serialization/
---



## 클래스

| 클래스 | 설명 |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | 다음 인터페이스의 기본 구현을 나타냅니다: [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/) |
| [IFormatterConverter](./iformatterconverter/) | 인스턴스 [System::Runtime::Serialization::SerializationInfo](./serializationinfo/)와 포맷터가 제공하는 클래스 사이의 연결을 제공하며, 해당 클래스는 [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) 내부 데이터를 구문 분석하는 데 가장 적합합니다. |
| [ISerializable](./iserializable/) | 직렬화될 수 있는 객체의 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오. |
| [SerializationInfo](./serializationinfo/) | 직렬화된 객체를 나타내는 명명된 필드 집합을 보유합니다. 구현되지 않았습니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오. |
| [StreamingContext](./streamingcontext/) | StreamingContext를 사용하는 번역된 클래스를 컴파일하기 위한 더미 클래스입니다. 이 클래스의 인스턴스를 [SmartPtr](../system/smartptr/)으로 관리하지 말고, 스택에만 할당해야 합니다. |
