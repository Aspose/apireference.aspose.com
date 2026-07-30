---
title: "System::Security::Cryptography::AsnEncodedData Klasse"
linktitle: "AsnEncodedData"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::AsnEncodedData Klasse. ASN.1-codierte Daten. Objekte dieser Klasse dürfen nur mit der System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


ASN.1-codierte Daten. Objekte dieser Klasse dürfen nur mit der [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class AsnEncodedData : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI-Informationen. |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | Konstruktor. |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | Konstruktor. |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | Konstruktor. |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | Kopiert Daten von einem anderen Objekt. |
| virtual [Format](./format/)(bool) const | Formatiert Daten in menschenlesbarer Form. |
| [get_Oid](./get_oid/)() const | Liefert die Objektkennung der codierten Daten. |
| [get_RawData](./get_rawdata/)() const | Liefert die rohen codierten Daten. |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | Setzt die Objektkennung der codierten Daten. |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | Setzt die rohen codierten Daten. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
