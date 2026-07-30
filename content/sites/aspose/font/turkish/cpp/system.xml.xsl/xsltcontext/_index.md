---
title: "System::Xml::Xsl::XsltContext sınıfı"
linktitle: "XsltContext"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::XsltContext sınıfı. Extensible Stylesheet Language for Transformations (XSLT) işlemcisinin mevcut yürütme bağlamını kapsüller ve XML Path Language (XPath) ifadelerinde fonksiyonları, parametreleri ve ad alanlarını çözümlemesine izin verir."
type: docs
weight: 500
url: /tr/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Extensible Stylesheet Language for Transformations (XSLT) işlemcisinin mevcut yürütme bağlamını kapsüller ve XML Path Language ([XPath](../../system.xml.xpath/)) ifadelerinde fonksiyonları, parametreleri ve ad alanlarını çözümlemesine izin verir.

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | Türetilmiş bir sınıfta geçersiz kılındığında, iki belgenin temel Uniform Resource Identifier (URI) değerlerini XSLT işlemcisi (yani, [XslTransform](../xsltransform/) sınıfı) tarafından belgelerin yüklenme sırasına göre karşılaştırır. |
| virtual [get_Whitespace](./get_whitespace/)() | Türetilmiş bir sınıfta geçersiz kılındığında, çıktıda boşluk düğümlerinin dahil edilip edilmeyeceğini gösteren bir değer alır. |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Türetilmiş bir sınıfta geçersiz kılındığında, verilen bağlam için boşluk düğümlerinin korunup korunmayacağını ya da kaldırılacağını değerlendirir. |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | Türetilmiş bir sınıfta geçersiz kılındığında, bir fonksiyon referansını çözer ve fonksiyonu temsil eden bir [IXsltContextFunction](../ixsltcontextfunction/) döndürür. [IXsltContextFunction](../ixsltcontextfunction/) yürütme zamanında fonksiyonun dönüş değerini almak için kullanılır. |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | Türetilmiş bir sınıfta geçersiz kılındığında, bir değişken referansını çözer ve değişkeni temsil eden bir [IXsltContextVariable](../ixsltcontextvariable/) döndürür. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Ayrıca Bakınız

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
