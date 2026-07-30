---
title: "System::Xml::Xsl::XsltContext::ResolveFunction yöntemi"
linktitle: "ResolveFunction"
second_title: "Aspose.Font için C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, bir fonksiyon referansını çözer ve fonksiyonu temsil eden bir IXsltContextFunction döndürür. IXsltContextFunction, C++'ta fonksiyonun dönüş değerini elde etmek için yürütme zamanında kullanılır."
type: docs
weight: 400
url: /tr/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


Türetilmiş bir sınıfta geçersiz kılındığında, bir fonksiyon referansını çözer ve fonksiyonu temsil eden bir [IXsltContextFunction](../../ixsltcontextfunction/) döndürür. [IXsltContextFunction](../../ixsltcontextfunction/), fonksiyonun dönüş değerini elde etmek için yürütme zamanında kullanılır.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| prefix | String | Fonksiyonun [XPath](../../../system.xml.xpath/) ifadesinde göründüğü önek. |
| ad | Dize | Fonksiyonun adı. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | Çözülmekte olan işlev için argüman türlerinin bir dizisi. Bu, aynı ada sahip yöntemler arasında seçim yapmanızı sağlar (örneğin, aşırı yüklenmiş yöntemler). |

### ReturnValue

İşlevi temsil eden bir [IXsltContextFunction](../../ixsltcontextfunction/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
