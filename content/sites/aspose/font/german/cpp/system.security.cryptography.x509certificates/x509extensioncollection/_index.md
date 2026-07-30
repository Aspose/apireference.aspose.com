---
title: "System::Security::Cryptography::X509Certificates::X509ExtensionCollection Klasse"
linktitle: "X509ExtensionCollection"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::X509Certificates::X509ExtensionCollection Klasse. Sammlung von Erweiterungsobjekten. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1300
url: /de/cpp/system.security.cryptography.x509certificates/x509extensioncollection/
---
## X509ExtensionCollection class


Sammlung von Erweiterungsobjekten. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class X509ExtensionCollection : public System::Collections::Generic::List<SharedPtr<X509Extension>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [idx_get](./idx_get/)(const String\&) const | Accessor. Nicht implementiert. |
| [idx_get](./idx_get/)(int) const override | RTTI-Daten. |
| [X509ExtensionCollection](./x509extensioncollection/)() | Konstruiert leere Sammlung. |
## Siehe auch

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
