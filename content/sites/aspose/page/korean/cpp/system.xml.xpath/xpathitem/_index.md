---
title: "System::Xml::XPath::XPathItem 클래스"
linktitle: "XPathItem"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathItem 클래스. C++에서 XQuery 1.0 및 XPath 2.0 데이터 모델의 항목을 나타냅니다."
type: docs
weight: 400
url: /ko/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


XQuery 1.0 및 [XPath](../) 2.0 [Data](../../system.data/) 모델의 항목을 나타냅니다.

```cpp
class XPathItem : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | 파생 클래스에서 재정의될 때, 항목이 [XPath](../) 노드인지 원자값인지 나타내는 값을 가져옵니다. |
| virtual [get_TypedValue](./get_typedvalue/)() | 파생 클래스에서 재정의될 때, 현재 항목을 스키마 유형에 따라 가장 적절한 유형의 박싱된 객체로 가져옵니다. |
| virtual [get_Value](./get_value/)() | 파생 클래스에서 재정의될 때, 항목의 **string** 값을 가져옵니다. |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | 파생 클래스에서 재정의될 때, 항목의 값을 [Boolean](../../system/boolean/) 형식으로 가져옵니다. |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | 파생 클래스에서 재정의될 때, 항목의 값을 [DateTime](../../system/datetime/) 형식으로 가져옵니다. |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | 파생 클래스에서 재정의될 때, 항목의 값을 [Double](../../system/double/) 형식으로 가져옵니다. |
| virtual [get_ValueAsInt](./get_valueasint/)() | 파생 클래스에서 재정의될 때, 항목의 값을 [Int32](../../system/int32/) 형식으로 가져옵니다. |
| virtual [get_ValueAsLong](./get_valueaslong/)() | 파생 클래스에서 재정의될 때, 항목의 값을 [Int64](../../system/int64/) 형식으로 가져옵니다. |
| virtual [get_ValueType](./get_valuetype/)() | 파생 클래스에서 재정의될 때, 항목의 유형을 가져옵니다. |
| virtual [get_XmlType](./get_xmltype/)() | 파생 클래스에서 재정의될 때, 항목에 대한 XmlSchemaType을 가져옵니다. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | 지정된 유형으로 항목의 값을 반환합니다. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | 파생 클래스에서 재정의될 경우, 네임스페이스 접두사를 해결하기 위해 지정된 [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) 객체를 사용하여 지정된 유형으로 항목의 값을 반환합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
