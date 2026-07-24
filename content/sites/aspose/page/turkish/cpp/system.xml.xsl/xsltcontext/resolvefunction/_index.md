---
title: "System::Xml::Xsl::XsltContext::ResolveFunction metodu"
linktitle: "ResolveFunction"
second_title: "Aspose.Page için C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction metodu. Türetilmiş bir sınıfta geçersiz kılındığında, bir işlev referansını çözer ve işlevi temsil eden bir IXsltContextFunction döndürür. IXsltContextFunction, işlevin dönüş değerini yürütme zamanında almak için kullanılır (C++)."
type: docs
weight: 400
url: /tr/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


Türetilmiş bir sınıfta geçersiz kılındığında, bir işlev referansını çözer ve işlevi temsil eden bir [IXsltContextFunction](../../ixsltcontextfunction/) döndürür. [IXsltContextFunction](../../ixsltcontextfunction/), işlevin dönüş değerini yürütme zamanında almak için kullanılır.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| prefix | String | Fonksiyonun [XPath](../../../system.xml.xpath/) ifadesinde göründüğü gibi öneki. |
| ad | String | Fonksiyonun adı. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | Çözülen işlev için argüman tiplerinin bir dizisi. Bu, aynı ada sahip yöntemler (örneğin, aşırı yüklenmiş yöntemler) arasında seçim yapmanızı sağlar. |

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
* Library [Aspose.Page for C++](../../../)
