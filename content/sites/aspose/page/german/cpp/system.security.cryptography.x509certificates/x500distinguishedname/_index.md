---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName Klasse"
linktitle: "X500DistinguishedName"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName Klasse. Stellt den Distinguished Name eines X509-Zertifikats dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


Stellt den Distinguished Name eines X509-Zertifikats dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | Dekodiert den Namen mithilfe der durch Flags angegebenen Parameter. |
| [Format](./format/)(bool) const override | Formatiert den Namen für den Druck. |
| [get_Name](./get_name/)() const | Liefert den Distinguished Name des Zertifikats. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI-Informationen. |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | Konstruktor. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | Konstruktor. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | Kopierkonstruktor. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | Konstruktor. |
## Siehe auch

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
