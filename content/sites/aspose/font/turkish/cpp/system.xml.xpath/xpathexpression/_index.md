---
title: "System::Xml::XPath::XPathExpression sınıfı"
linktitle: "XPathExpression"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathExpression sınıfı. C++'ta derlenmiş bir XPath ifadesini temsil eden tiplenmiş bir sınıf sağlar."
type: docs
weight: 300
url: /tr/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


Derlenmiş bir [XPath](../) ifadesini temsil eden tiplenmiş bir sınıf sağlar.

```cpp
class XPathExpression : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen IComparer nesnesine göre [XPath](../) ifadesiyle seçilen düğümleri sıralar. |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | Türetilmiş bir sınıfta geçersiz kılındığında, sağlanan parametrelere göre [XPath](../) ifadesiyle seçilen düğümleri sıralar. |
| virtual [Clone](./clone/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bu [XPathExpression](./) nesnesinin bir kopyasını döndürür. |
| static [Compile](./compile/)(const String\&) | Belirtilen [XPath](../) ifadesini derler ve [XPath](../) ifadesini temsil eden bir [XPathExpression](./) nesnesi döndürür. |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | Belirtilen [XPath](../) ifadesini, ad alanı çözümlemesi için belirtilen [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) nesnesiyle birlikte derler ve [XPath](../) ifadesini temsil eden bir [XPathExpression](./) nesnesi döndürür. |
| virtual [get_Expression](./get_expression/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathExpression](./) nesnesinin **string** temsilini alır. |
| virtual [get_ReturnType](./get_returntype/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPath](../) ifadesinin sonuç tipini alır. |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | Türetilmiş bir sınıfta geçersiz kılındığında, ad alanı çözümlemesi için kullanılacak [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) nesnesini belirtir. |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | Türetilmiş bir sınıfta geçersiz kılındığında, ad alanı çözümlemesi için kullanılacak [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) nesnesini belirtir. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
