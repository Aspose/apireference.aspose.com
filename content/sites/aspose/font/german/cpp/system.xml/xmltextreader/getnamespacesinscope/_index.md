---
title: "System::Xml::XmlTextReader::GetNamespacesInScope Methode"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlTextReader::GetNamespacesInScope Methode. Gibt eine Sammlung zurück, die alle derzeit im Gültigkeitsbereich liegenden Namespaces in C++ enthält."
type: docs
weight: 3400
url: /de/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


Gibt eine Sammlung zurück, die alle derzeit im Gültigkeitsbereich befindlichen Namespaces enthält.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scope | XmlNamespaceScope | Ein [XmlNamespaceScope](../../xmlnamespacescope/) Wert, der den Typ der zurückzugebenden Namespace‑Knoten angibt. |

### ReturnValue

Ein IDictionary‑Objekt, das alle aktuell im Gültigkeitsbereich liegenden Namespaces enthält. Wenn der Reader nicht auf einem Element positioniert ist, wird ein leeres Wörterbuch (keine Namespaces) zurückgegeben.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
