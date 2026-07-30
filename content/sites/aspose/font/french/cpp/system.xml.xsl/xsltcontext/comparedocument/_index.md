---
title: "System::Xml::Xsl::XsltContext::CompareDocument méthode"
linktitle: "CompareDocument"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Xsl::XsltContext::CompareDocument méthode. Lorsqu'elle est remplacée dans une classe dérivée, compare les identifiants uniformes de ressources (URI) de base de deux documents en fonction de l'ordre dans lequel les documents ont été chargés par le processeur XSLT (c'est‑à‑dire la classe XslTransform) en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


Lorsqu'elle est remplacée dans une classe dérivée, compare les identifiants uniformes de ressources (URI) de base de deux documents en fonction de l'ordre dans lequel les documents ont été chargés par le processeur XSLT (c'est‑à‑dire la classe [XslTransform](../../xsltransform/)).

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| baseUri | String | L'URI de base du premier document à comparer. |
| nextbaseUri | String | L'URI de base du deuxième document à comparer. |

### ReturnValue

Une valeur entière décrivant l'ordre relatif des deux URI de base : -1 si **baseUri** apparaît avant **nextbaseUri** ; 0 si les deux URI de base sont identiques ; et 1 si **baseUri** apparaît après **nextbaseUri**.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
