---
title: "System::Xml::XmlResolver Klasse"
linktitle: "XmlResolver"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlResolver Klasse. Löst externe XML-Ressourcen auf, die durch einen Uniform Resource Identifier (URI) in C++ benannt sind."
type: docs
weight: 3500
url: /de/cpp/system.xml/xmlresolver/
---
## XmlResolver class


Löst externe XML-Ressourcen auf, die durch einen Uniform Resource Identifier (URI) benannt sind.

```cpp
class XmlResolver : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | Wenn in einer abgeleiteten Klasse überschrieben, ordnet es einen URI einem Objekt zu, das die eigentliche Ressource enthält. |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | Wenn in einer abgeleiteten Klasse überschrieben, löst es den absoluten URI aus dem Basis- und relativen URI auf. |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | Wenn in einer abgeleiteten Klasse überschrieben, setzt es die Anmeldeinformationen, die für die Authentifizierung von Webanfragen verwendet werden. |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | Ermöglicht dem Resolver, Typen zurückzugeben, die nicht Stream sind. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
