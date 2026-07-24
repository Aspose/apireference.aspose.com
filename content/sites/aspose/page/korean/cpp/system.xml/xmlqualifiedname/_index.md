---
title: "System::Xml::XmlQualifiedName 클래스"
linktitle: "XmlQualifiedName"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlQualifiedName 클래스. C++에서 XML 한정 이름을 나타냅니다."
type: docs
weight: 3200
url: /ko/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


XML 한정 이름을 나타냅니다.

```cpp
class XmlQualifiedName : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 지정된 [XmlQualifiedName](./) 객체가 현재 [XmlQualifiedName](./) 객체와 같은지 여부를 결정합니다. |
| [get_IsEmpty](./get_isempty/)() const | [XmlQualifiedName](./)이 비어 있는지 여부를 나타내는 값을 반환합니다. |
| [get_Name](./get_name/)() const | [XmlQualifiedName](./)의 한정 이름에 대한 문자열 표현을 반환합니다. |
| [get_Namespace](./get_namespace/)() const | [XmlQualifiedName](./)의 네임스페이스에 대한 문자열 표현을 반환합니다. |
| [GetHashCode](./gethashcode/)() const override | [XmlQualifiedName](./)에 대한 해시 코드를 반환합니다. |
| static [ToString](./tostring/)(const String\&, const String\&) | [XmlQualifiedName](./)의 문자열 값을 반환합니다. |
| [ToString](./tostring/)() const override | [XmlQualifiedName](./)의 문자열 값을 반환합니다. |
| [XmlQualifiedName](./xmlqualifiedname/)() | [XmlQualifiedName](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | 지정된 이름으로 [XmlQualifiedName](./) 클래스의 새 인스턴스를 초기화합니다. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | 지정된 이름과 네임스페이스로 [XmlQualifiedName](./) 클래스의 새 인스턴스를 초기화합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | 빈 [XmlQualifiedName](./)을 제공합니다. |
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
