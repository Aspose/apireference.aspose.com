---
title: "System::Xml::XmlNamespaceManager::LookupNamespace metod"
linktitle: "LookupNamespace"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlNamespaceManager::LookupNamespace metod. Returnerar namnrums‑URI för det angivna prefixet i C++."
type: docs
weight: 800
url: /sv/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


Returnerar namnrymdens URI för det angivna prefixet.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| prefix | const String\& | Prefixet vars namnrums‑URI du vill slå upp. För att matcha standardnamnrymden, skicka [String::Empty](../../../system/string/empty/). |

### ReturnValue

Namnrums‑URI för **prefix** eller **nullptr** om det inte finns någon mappad namnrymd. Den returnerade strängen är atomiserad. För mer information om atomiserade strängar, se klassen [XmlNameTable](../../xmlnametable/).

## Se även

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
