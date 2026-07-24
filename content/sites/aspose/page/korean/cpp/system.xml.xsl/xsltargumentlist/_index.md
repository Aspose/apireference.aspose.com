---
title: "System::Xml::Xsl::XsltArgumentList 클래스"
linktitle: "XsltArgumentList"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XsltArgumentList 클래스. C++에서 XSLT 매개변수 또는 확장 객체인 가변 개수의 인수를 포함합니다."
type: docs
weight: 400
url: /ko/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


XSLT 매개변수 또는 확장 객체 중 하나인 가변 개수의 인수를 포함합니다.

```cpp
class XsltArgumentList : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | [XsltArgumentList](./)에 새 객체를 추가하고 네임스페이스 URI와 연결합니다. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | [XsltArgumentList](./)에 매개변수를 추가하고 네임스페이스 한정 이름과 연결합니다. |
| [Clear](./clear/)() | [XsltArgumentList](./)에서 모든 매개변수와 확장 객체를 제거합니다. |
| [GetExtensionObject](./getextensionobject/)(const String\&) | 주어진 네임스페이스와 연결된 객체를 반환합니다. |
| [GetParam](./getparam/)(const String\&, const String\&) | 네임스페이스 한정 이름과 연결된 매개변수를 반환합니다. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | 네임스페이스 URI를 가진 객체를 [XsltArgumentList](./)에서 제거합니다. |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | 파라미터를 [XsltArgumentList](./)에서 제거합니다. |
| [XsltArgumentList](./xsltargumentlist/)() | 새 인스턴스인 [XsltArgumentList](./)를 구현합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
