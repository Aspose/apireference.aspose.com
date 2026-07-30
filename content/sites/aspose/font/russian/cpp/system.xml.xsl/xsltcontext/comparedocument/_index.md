---
title: "System::Xml::Xsl::XsltContext::CompareDocument метод"
linktitle: "CompareDocument"
second_title: "Aspose.Font для C++"
description: "System::Xml::Xsl::XsltContext::CompareDocument метод. При переопределении в производном классе сравнивает базовые Uniform Resource Identifiers (URI) двух документов в зависимости от порядка, в котором документы были загружены XSLT‑процессором (то есть классом XslTransform) в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


При переопределении в производном классе сравнивает базовые Uniform Resource Identifiers (URI) двух документов в зависимости от порядка, в котором документы были загружены XSLT‑процессором (то есть класс [XslTransform](../../xsltransform/)).

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| baseUri | String | Базовый URI первого документа для сравнения. |
| nextbaseUri | String | Базовый URI второго документа для сравнения. |

### ReturnValue

Целочисленное значение, описывающее относительный порядок двух базовых URI: -1, если **baseUri** находится перед **nextbaseUri**; 0, если два базовых URI идентичны; и 1, если **baseUri** находится после **nextbaseUri**.

## См. также

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
