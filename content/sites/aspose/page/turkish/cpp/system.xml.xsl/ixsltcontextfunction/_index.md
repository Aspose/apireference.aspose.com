---
title: "System::Xml::Xsl::IXsltContextFunction class"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Page için C++"
description: "System::Xml::Xsl::IXsltContextFunction class. C++'da çalışma zamanı yürütmesi sırasında Extensible Stylesheet Language for Transformations (XSLT) stil sayfasında tanımlanan belirli bir fonksiyona bir arabirim sağlar."
type: docs
weight: 100
url: /tr/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


Çalışma zamanı yürütmesi sırasında Extensible Stylesheet Language for Transformations (XSLT) stil sayfasında tanımlı bir işlev için bir arayüz sağlar.

```cpp
class IXsltContextFunction : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | Fonksiyonun argüman listesi için sağlanan XML Path Language ([XPath](../../system.xml.xpath/)) tiplerini döndürür. Bu bilgi, fonksiyonun imzasını keşfetmek ve aşırı yüklenmiş fonksiyonlar arasında ayrım yapabilmek için kullanılabilir. |
| virtual [get_Maxargs](./get_maxargs/)() | Fonksiyon için izin verilen maksimum argüman sayısını döndürür. Bu, kullanıcının aşırı yüklenmiş fonksiyonlar arasında ayrım yapmasını sağlar. |
| virtual [get_Minargs](./get_minargs/)() | Fonksiyon için izin verilen minimum argüman sayısını döndürür. Bu, kullanıcının aşırı yüklenmiş fonksiyonlar arasında ayrım yapmasını sağlar. |
| virtual [get_ReturnType](./get_returntype/)() | Fonksiyon tarafından döndürülen [XPath](../../system.xml.xpath/) tipini temsil eden XPathResultType değerini döndürür. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Verilen bağlamda verilen argümanlarla fonksiyonu çağırmak için yöntemi sağlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
