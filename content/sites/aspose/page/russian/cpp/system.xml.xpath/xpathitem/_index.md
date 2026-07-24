---
title: "Класс System::Xml::XPath::XPathItem"
linktitle: "XPathItem"
second_title: "Aspose.Page для C++"
description: "Класс System::Xml::XPath::XPathItem. Представляет элемент в модели данных XQuery 1.0 и XPath 2.0 в C++."
type: docs
weight: 400
url: /ru/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


Представляет элемент в XQuery 1.0 и [XPath](../) 2.0 [Data](../../system.data/) модели.

```cpp
class XPathItem : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | При переопределении в производном классе возвращает значение, указывающее, представляет ли элемент узел [XPath](../) или атомарное значение. |
| virtual [get_TypedValue](./get_typedvalue/)() | При переопределении в производном классе возвращает текущий элемент в виде упакованного объекта наиболее подходящего типа в соответствии с его типом схемы. |
| virtual [get_Value](./get_value/)() | При переопределении в производном классе возвращает **string** значение элемента. |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | При переопределении в производном классе возвращает значение элемента как [Boolean](../../system/boolean/). |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | При переопределении в производном классе возвращает значение элемента как [DateTime](../../system/datetime/). |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | При переопределении в производном классе возвращает значение элемента как [Double](../../system/double/). |
| virtual [get_ValueAsInt](./get_valueasint/)() | При переопределении в производном классе возвращает значение элемента как [Int32](../../system/int32/). |
| virtual [get_ValueAsLong](./get_valueaslong/)() | При переопределении в производном классе возвращает значение элемента как [Int64](../../system/int64/). |
| virtual [get_ValueType](./get_valuetype/)() | При переопределении в производном классе возвращает тип элемента. |
| virtual [get_XmlType](./get_xmltype/)() | При переопределении в производном классе возвращает XmlSchemaType элемента. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | Возвращает значение элемента в указанном типе. |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Когда переопределяется в производном классе, возвращает значение элемента в виде типа, указанного с помощью объекта [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/), предназначенного для разрешения префиксов пространств имён. |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
