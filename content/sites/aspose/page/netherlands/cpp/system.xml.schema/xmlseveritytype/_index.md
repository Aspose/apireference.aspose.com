---
title: "System::Xml::Schema::XmlSeverityType enum"
linktitle: "XmlSeverityType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSeverityType enum. Vertegenwoordigt de ernst van het validatie‑event in C++."
type: docs
weight: 8100
url: /nl/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


Geeft de ernst van het validatie‑evenement weer.

```cpp
enum class XmlSeverityType
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Error | 0 | Geeft aan dat er een validatiefout is opgetreden bij het valideren van het instantie‑document. Dit is van toepassing op documenttype‑definities (DTD’s) en XML [Schema](../) definitietaal (XSD)-schema’s. De geldigheids‑constraints van het World Wide [Web](../../system.web/) Consortium (W3C) worden beschouwd als fouten. Als er geen validatie‑event‑handler is aangemaakt, veroorzaken fouten een uitzondering. |
| Warning | 1 | Geeft aan dat er een validatie‑event heeft plaatsgevonden dat geen fout is. Een waarschuwing wordt doorgaans uitgegeven wanneer er geen DTD of XML [Schema](../) beschikbaar is om een bepaald element of attribuut tegen te valideren. In tegenstelling tot fouten, veroorzaken waarschuwingen geen uitzondering als er geen validatie‑event‑handler is. |

## Zie ook

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
