---
title: "System::Security::Cryptography::X509Certificates::X509Extension Klasse"
linktitle: "X509Extension"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::X509Certificates::X509Extension Klasse. Erweiterungsobjekt zum Speichern zusätzlicher Informationen, die mit einem X.509-Zertifikat verbunden sind. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1200
url: /de/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


Erweiterungsobjekt zum Speichern zusätzlicher Informationen, die mit einem X.509-Zertifikat verbunden sind. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Kopiert Erweiterungsdaten von einem anderen Objekt. |
| [get_Critical](./get_critical/)() const | Überprüft, ob die Erweiterung kritisch ist. |
| [set_Critical](./set_critical/)(bool) | Definiert, ob die Erweiterung kritisch ist. |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | RTTI-Informationen. |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | Konstruktor. |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | Konstruktor. |
## Siehe auch

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
