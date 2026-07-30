---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace méthode"
linktitle: "PreserveWhitespace"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace méthode. Lorsqu'elle est substituée dans une classe dérivée, elle évalue s'il faut conserver les nœuds d'espaces blancs ou les supprimer pour le contexte donné en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


Lorsqu'elle est remplacée dans une classe dérivée, évalue s'il faut préserver les nœuds d'espaces blancs ou les supprimer pour le contexte donné.

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nœud | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Le nœud d'espaces blancs qui doit être conservé ou supprimé dans le contexte actuel. |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
