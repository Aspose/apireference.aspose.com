---
title: "System::Xml::Xsl::XsltContext class"
linktitle: "XsltContext"
second_title: "Aspose.Page için C++"
description: "System::Xml::Xsl::XsltContext class. Extensible Stylesheet Language for Transformations (XSLT) işlemcisinin mevcut yürütme bağlamını kapsüller; bu, XML Path Language (XPath)'in C++'da XPath ifadeleri içinde fonksiyonları, parametreleri ve ad alanlarını çözmesine olanak tanır."
type: docs
weight: 500
url: /tr/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Extensible Stylesheet Language for Transformations (XSLT) işlemcisinin mevcut yürütme bağlamını kapsüller; bu, XML Path Language ([XPath](../../system.xml.xpath/))'in [XPath](../../system.xml.xpath/) ifadeleri içinde fonksiyonları, parametreleri ve ad alanlarını çözmesine olanak tanır.

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | Türetilmiş bir sınıfta geçersiz kılındığında, belgelerin XSLT işlemcisi (yani, [XslTransform](../xsltransform/) sınıfı) tarafından yüklenme sırasına göre iki belgenin temel Uniform Resource Identifier (URI) değerlerini karşılaştırır. |
| virtual [get_Whitespace](./get_whitespace/)() | Türetilmiş bir sınıfta geçersiz kılındığında, çıktıda boşluk düğümlerinin dahil edilip edilmeyeceğini gösteren bir değer alır. |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Türetilmiş bir sınıfta geçersiz kılındığında, verilen bağlam için boşluk düğümlerinin korunup korunmayacağını değerlendirir. |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | Türetilmiş bir sınıfta geçersiz kılındığında, bir fonksiyon referansını çözer ve fonksiyonu temsil eden bir [IXsltContextFunction](../ixsltcontextfunction/) döndürür. [IXsltContextFunction](../ixsltcontextfunction/), fonksiyonun dönüş değerini elde etmek için yürütme zamanında kullanılır. |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | Türetilmiş bir sınıfta geçersiz kılındığında, bir değişken referansını çözer ve değişkeni temsil eden bir [IXsltContextVariable](../ixsltcontextvariable/) döndürür. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Ayrıca Bakınız

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
