---
title: "System::Xml::Xsl::XsltArgumentList::GetParam méthode"
linktitle: "GetParam"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Xsl::XsltArgumentList::GetParam méthode. Retourne le paramètre associé au nom qualifié par l'espace de noms en C++."
type: docs
weight: 600
url: /fr/cpp/system.xml.xsl/xsltargumentlist/getparam/
---
## XsltArgumentList::GetParam method


Renvoie le paramètre associé au nom qualifié de l'espace de noms.

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::GetParam(const String &name, const String &namespaceUri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | const String\& | Le nom du paramètre. [XsltArgumentList](../) ne vérifie pas que le nom fourni soit un nom local valide ; cependant, le nom ne peut pas être **nullptr**. |
| namespaceUri | const String\& | L'URI de l'espace de noms associé au paramètre. |

### ReturnValue

L'objet paramètre ou **nullptr** si aucun n'a été trouvé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
