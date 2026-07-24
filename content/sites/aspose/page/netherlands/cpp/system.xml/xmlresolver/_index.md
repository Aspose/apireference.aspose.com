---
title: "System::Xml::XmlResolver klasse"
linktitle: "XmlResolver"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlResolver class. Lost externe XML-resources op die worden aangeduid door een Uniform Resource Identifier (URI) in C++."
type: docs
weight: 3500
url: /nl/cpp/system.xml/xmlresolver/
---
## XmlResolver class


Lost externe XML‑bronnen op die worden genoemd door een Uniform Resource Identifier (URI).

```cpp
class XmlResolver : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | Wanneer overschreven in een afgeleide klasse, mappt een URI naar een object dat de feitelijke bron bevat. |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | Wanneer overschreven in een afgeleide klasse, lost de absolute URI op vanuit de basis- en relatieve URI's. |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | Wanneer overschreven in een afgeleide klasse, stelt de inloggegevens in die worden gebruikt om webverzoeken te authenticeren. |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | Staat de resolver toe om typen anders dan Stream te retourneren. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
