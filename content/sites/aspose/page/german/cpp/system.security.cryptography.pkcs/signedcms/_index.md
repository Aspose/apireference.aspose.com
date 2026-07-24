---
title: "System::Security::Cryptography::Pkcs::SignedCms Klasse"
linktitle: "SignedCms"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::Pkcs::SignedCms Klasse. Signiert Inhalte gemäß dem CMS/PKCS #7-Standard. Nicht implementiert. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


Signiert Inhalte gemäß dem CMS/PKCS #7-Standard. Nicht implementiert. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

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
* Library [Aspose.Page for C++](../../)
