---
title: "System::Xml::Xsl::XsltArgumentList::GetParam methode"
linktitle: "GetParam"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XsltArgumentList::GetParam methode. Retourneert de parameter die is gekoppeld aan de namespace-gekwalificeerde naam in C++."
type: docs
weight: 600
url: /nl/cpp/system.xml.xsl/xsltargumentlist/getparam/
---
## XsltArgumentList::GetParam method


Retourneert de parameter die is gekoppeld aan de naam met namespace‑kwalificatie.

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::GetParam(const String &name, const String &namespaceUri)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | const String\& | De naam van de parameter. [XsltArgumentList](../) controleert niet of de opgegeven naam een geldige lokale naam is; echter, de naam mag niet **nullptr** zijn. |
| namespaceUri | const String\& | De namespace-URI die aan de parameter is gekoppeld. |

### ReturnValue

Het parameterobject of **nullptr** als er geen werd gevonden.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
