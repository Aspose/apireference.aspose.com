---
title: "System::Security::Cryptography::Pkcs::SignedCms Klasse"
linktitle: "SignedCms"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::Pkcs::SignedCms Klasse. Signiert Inhalte gemäß dem CMS/PKCS #7-Standard. Nicht implementiert. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Umwickeln Sie diese Klasse immer mit dem Zeiger System::SmartPtr und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


Signiert Inhalte gemäß dem CMS/PKCS #7-Standard. Nicht implementiert. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Umwickeln Sie diese Klasse immer mit dem Zeiger [System::SmartPtr](../../system/smartptr/) und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SignedCms : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | Erstellt eine Signatur. |
| [Encode](./encode/)() | Kodiert CMS/PKCS #7-Nachricht. |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | Konstruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Font for C++](../../)
