---
title: "System::Xml::Schema::XmlSchemaAppInfo 클래스"
linktitle: "XmlSchemaAppInfo"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAppInfo 클래스. C++에서 World Wide Web Consortium (W3C) **appinfo** 요소를 나타냅니다."
type: docs
weight: 1000
url: /ko/cpp/system.xml.schema/xmlschemaappinfo/
---
## XmlSchemaAppInfo class


World Wide [Web](../../system.web/) Consortium (W3C) **appinfo** 요소를 나타냅니다.

```cpp
class XmlSchemaAppInfo : public System::Xml::Schema::XmlSchemaObject
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Markup](./get_markup/)() | **appinfo** 자식 노드를 나타내는 [XmlNode](../../system.xml/xmlnode/) 객체 배열을 반환합니다. |
| [get_Source](./get_source/)() | 응용 프로그램 정보의 소스를 반환합니다. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | **appinfo** 자식 노드를 나타내는 [XmlNode](../../system.xml/xmlnode/) 객체 배열을 설정합니다. |
| [set_Source](./set_source/)(const String\&) | 응용 프로그램 정보의 소스를 설정합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
