---
title: "System::Xml::XmlNamespaceManager::LookupNamespace Methode"
linktitle: "LookupNamespace"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNamespaceManager::LookupNamespace-Methode. Gibt die Namespace-URI für das angegebene Präfix in C++ zurück."
type: docs
weight: 800
url: /de/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


Gibt die Namespace‑URI für das angegebene Präfix zurück.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| prefix | const String\& | Das Präfix, dessen Namespace-URI Sie auflösen möchten. Um den Standard‑Namespace zu verwenden, übergeben Sie [String::Empty](../../../system/string/empty/). |

### ReturnValue

Die Namespace-URI für **prefix** oder **nullptr**, falls kein zugeordneter Namespace vorhanden ist. Der zurückgegebene String ist atomisiert. Weitere Informationen zu atomisierten Strings finden Sie in der Klasse [XmlNameTable](../../xmlnametable/).

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
