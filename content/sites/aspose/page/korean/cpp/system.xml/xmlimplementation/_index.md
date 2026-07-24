---
title: "System::Xml::XmlImplementation 클래스"
linktitle: "XmlImplementation"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlImplementation 클래스. C++에서 XmlDocument 객체 집합에 대한 컨텍스트를 정의합니다."
type: docs
weight: 2000
url: /ko/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


[XmlDocument](../xmldocument/) 객체 집합에 대한 컨텍스트를 정의합니다.

```cpp
class XmlImplementation : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | 새 [XmlDocument](../xmldocument/)을 생성합니다. |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | 문서 [Object](../../system/object/) 모델(DOM) 구현이 특정 기능을 구현하는지 테스트합니다. |
| [XmlImplementation](./xmlimplementation/)() | [XmlImplementation](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | 지정된 [XmlNameTable](../xmlnametable/)을 사용하여 [XmlImplementation](./) 클래스의 새 인스턴스를 초기화합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
