---
title: "System::Xml::XmlSecureResolver Klasse"
linktitle: "XmlSecureResolver"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlSecureResolver Klasse. Hilft, eine andere Implementierung von XmlResolver zu sichern, indem das XmlResolver-Objekt umschlossen wird und die Ressourcen, auf die der zugrunde liegende XmlResolver in C++ Zugriff hat, eingeschränkt werden."
type: docs
weight: 3600
url: /de/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


Hilft, eine andere Implementierung von [XmlResolver](../xmlresolver/) zu sichern, indem das [XmlResolver](../xmlresolver/) Objekt umschlossen wird und die Ressourcen eingeschränkt werden, auf die der zugrunde liegende [XmlResolver](../xmlresolver/) Zugriff hat.

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Ordnet einen URI einem Objekt zu, das die eigentliche Ressource enthält. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Löst den absoluten URI aus den Basis- und relativen URIs, indem **ResolveUri** auf dem zugrunde liegenden [XmlResolver](../xmlresolver/) aufgerufen wird. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Legt die Anmeldeinformationen fest, die zur Authentifizierung von Webanfragen verwendet werden. |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | Initialisiert eine neue Instanz der Klasse [XmlSecureResolver](./) mit dem bereitgestellten [XmlResolver](../xmlresolver/) und der URL. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
