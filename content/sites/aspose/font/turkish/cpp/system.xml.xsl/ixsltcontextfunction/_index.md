---
title: "System::Xml::Xsl::IXsltContextFunction sınıfı"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::IXsltContextFunction sınıfı. Çalışma zamanında C++ içinde Extensible Stylesheet Language for Transformations (XSLT) stil sayfasında tanımlanan bir fonksiyona bir arabirim sağlar."
type: docs
weight: 100
url: /tr/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


Çalışma zamanı yürütmesi sırasında Extensible Stylesheet Language for Transformations (XSLT) stil sayfasında tanımlı belirli bir işleve bir arayüz sağlar.

```cpp
class IXsltContextFunction : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | Fonksiyonun argüman listesi için sağlanan XML Path Language ([XPath](../../system.xml.xpath/)) tiplerini döndürür. Bu bilgi, fonksiyonun imzasını keşfetmek için kullanılabilir ve aşırı yüklenmiş fonksiyonlar arasında ayrım yapmanızı sağlar. |
| virtual [get_Maxargs](./get_maxargs/)() | Fonksiyon için izin verilen azami argüman sayısını döndürür. Bu, kullanıcının aşırı yüklenmiş fonksiyonlar arasında ayrım yapmasını sağlar. |
| virtual [get_Minargs](./get_minargs/)() | Fonksiyon için izin verilen asgari argüman sayısını döndürür. Bu, kullanıcının aşırı yüklenmiş fonksiyonlar arasında ayrım yapmasını sağlar. |
| virtual [get_ReturnType](./get_returntype/)() | Fonksiyon tarafından döndürülen [XPath](../../system.xml.xpath/) türünü temsil eden XPathResultType değerini döndürür. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Verilen bağlamda verilen argümanlarla fonksiyonu çağırmak için yöntemi sağlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
