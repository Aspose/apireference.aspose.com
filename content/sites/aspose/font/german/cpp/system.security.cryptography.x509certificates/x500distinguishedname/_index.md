---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName Klasse"
linktitle: "X500DistinguishedName"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName Klasse. Stellt den Distinguished Name eines X509-Zertifikats dar. Objekte dieser Klasse dürfen nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


Stellt den Distinguished Name eines X509-Zertifikats dar. Objekte dieser Klasse dürfen nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | Dekodiert den Namen mithilfe von durch Flags angegebenen Parametern. |
| [Format](./format/)(bool) const override | Formatiert den Namen für den Druck. |
| [get_Name](./get_name/)() const | Ermittelt den Distinguished Name des Zertifikats. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI-Informationen. |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | Konstruktor. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | Konstruktor. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | Kopierkonstruktor. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | Konstruktor. |
## Siehe auch

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
