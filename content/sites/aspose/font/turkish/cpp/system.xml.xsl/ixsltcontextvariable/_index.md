---
title: "System::Xml::Xsl::IXsltContextVariable sınıfı"
linktitle: "IXsltContextVariable"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::IXsltContextVariable sınıfı. Çalışma zamanında C++ içinde stil sayfasında tanımlanan bir değişkene bir arabirim sağlar."
type: docs
weight: 200
url: /tr/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


Çalışma zamanı yürütmesi sırasında stil sayfasında tanımlı belirli bir değişkene bir arayüz sağlar.

```cpp
class IXsltContextVariable : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | Değişkeni çalışma zamanında değerlendirir ve değişkenin değerini temsil eden bir nesne döndürür. |
| virtual [get_IsLocal](./get_islocal/)() | Değişkenin yerel olup olmadığını gösteren bir değer döndürür. |
| virtual [get_IsParam](./get_isparam/)() | Değişkenin bir Extensible Stylesheet Language Transformations (XSLT) parametresi olup olmadığını gösteren bir değer döndürür. Bu, bir stil sayfası veya şablon için bir parametre olabilir. |
| virtual [get_VariableType](./get_variabletype/)() | Değişkenin XML Path Language ([XPath](../../system.xml.xpath/)) tipini temsil eden XPathResultType değerini döndürür. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
