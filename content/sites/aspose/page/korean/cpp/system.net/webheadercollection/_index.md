---
title: "System::Net::WebHeaderCollection 클래스"
linktitle: "WebHeaderCollection"
second_title: "C++용 Aspose.Page"
description: "System::Net::WebHeaderCollection 클래스. 프로토콜 헤더의 컬렉션을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 3600
url: /ko/cpp/system.net/webheadercollection/
---
## WebHeaderCollection class


프로토콜 헤더의 컬렉션을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인수로 전달할 때 이 포인터를 사용하십시오.

```cpp
class WebHeaderCollection : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(String, String) | 지정된 헤더 이름과 헤더 값을 컬렉션에 추가합니다. |
| [Add](./add/)(HttpResponseHeader, String) | 지정된 헤더와 헤더 값을 컬렉션에 추가합니다. |
| [Add](./add/)(HttpRequestHeader, String) | 지정된 헤더와 헤더 값을 컬렉션에 추가합니다. |
| [AllKeys](./allkeys/)() | 컬렉션에 저장된 헤더 이름들의 컬렉션을 반환합니다. |
| [get_Count](./get_count/)() const | 컬렉션의 요소 개수를 반환합니다. |
| [get_Keys](./get_keys/)() | 컬렉션에 저장된 헤더 이름들의 컬렉션을 반환합니다. |
| [GetKey](./getkey/)(int) | 지정된 인덱스의 키를 반환합니다. |
| [GetValues](./getvalues/)(String) | 헤더 값들의 컬렉션을 반환합니다. |
| [idx_get](./idx_get/)(HttpRequestHeader) | 지정된 요청의 헤더를 사용하여 헤더 값을 가져옵니다. |
| [idx_get](./idx_get/)(HttpResponseHeader) | 지정된 응답의 헤더를 사용하여 헤더 값을 가져옵니다. |
| [idx_get](./idx_get/)(String) | 지정된 헤더 이름을 사용하여 헤더 값을 가져옵니다. |
| [idx_set](./idx_set/)(HttpRequestHeader, String) | 지정된 헤더의 헤더 값을 설정합니다. |
| [idx_set](./idx_set/)(HttpResponseHeader, String) | 지정된 응답의 헤더를 사용하여 헤더 값을 설정합니다. |
| [idx_set](./idx_set/)(String, String) | 지정된 헤더 이름을 사용하여 헤더 값을 설정합니다. |
| static [IsRestricted](./isrestricted/)(const String\&) | 지정된 HTTP 헤더를 요청에 설정할 수 있는지 테스트합니다. |
| [Remove](./remove/)(String) | 지정된 헤더 이름으로 헤더를 제거합니다. |
| [Remove](./remove/)(HttpResponseHeader) | 지정된 응답의 헤더를 제거합니다. |
| [Remove](./remove/)(HttpRequestHeader) | 지정된 요청의 헤더를 제거합니다. |
| [Set](./set/)(String, String) | 지정된 헤더의 값을 설정합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| [WebHeaderCollection](./webheadercollection/)() | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
