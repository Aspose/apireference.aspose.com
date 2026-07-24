---
title: "System::Xml::Schema::XmlAtomicValue class"
linktitle: "XmlAtomicValue"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Schema::XmlAtomicValue class. 검증된 XML 요소 또는 속성의 형식화된 값을 나타냅니다. XmlAtomicValue 클래스는 C++에서 상속할 수 없습니다."
type: docs
weight: 300
url: /ko/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


검증된 XML 요소 또는 속성의 형식화된 값을 나타냅니다. [XmlAtomicValue](./) 클래스는 상속할 수 없습니다.

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() | 이 [XmlAtomicValue](./) 객체의 복사본을 반환합니다. |
| [get_IsNode](./get_isnode/)() override | 검증된 XML 요소 또는 속성이 [XPath](../../system.xml.xpath/) 노드인지 원자값인지 여부를 나타내는 값을 반환합니다. |
| [get_TypedValue](./get_typedvalue/)() override | 검증된 XML 요소 또는 속성을 해당 스키마 유형에 따라 가장 적절한 유형의 박싱된 객체로 반환합니다. |
| [get_Value](./get_value/)() override | 검증된 XML 요소 또는 속성의 [String](../../system/string/) 값을 반환합니다. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | 검증된 XML 요소 또는 속성의 값을 [Boolean](../../system/boolean/) 형식으로 반환합니다. |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | 검증된 XML 요소 또는 속성의 값을 [DateTime](../../system/datetime/) 형식으로 반환합니다. |
| [get_ValueAsDouble](./get_valueasdouble/)() override | 검증된 XML 요소 및 속성의 값을 [Double](../../system/double/) 형식으로 반환합니다. |
| [get_ValueAsInt](./get_valueasint/)() override | 검증된 XML 요소 및 속성의 값을 [Int32](../../system/int32/) 형식으로 반환합니다. |
| [get_ValueAsLong](./get_valueaslong/)() override | 검증된 XML 요소 및 속성의 값을 [Int64](../../system/int64/) 형식으로 반환합니다. |
| [get_ValueType](./get_valuetype/)() override | 검증된 XML 요소 또는 속성의 유형을 반환합니다. |
| [get_XmlType](./get_xmltype/)() override | 검증된 XML 요소 또는 속성에 대한 [XmlSchemaType](../xmlschematype/)을 반환합니다. |
| [ToString](./tostring/)() const override | 검증된 XML 요소 또는 속성의 [String](../../system/string/) 값을 반환합니다. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | 네임스페이스 접두사를 해결하기 위해 지정된 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 객체를 사용하여 지정된 유형으로 검증된 XML 요소 또는 속성의 값을 반환합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 비고



이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오.

## 또 보기

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
