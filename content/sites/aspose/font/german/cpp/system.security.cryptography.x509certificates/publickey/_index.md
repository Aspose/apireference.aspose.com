---
title: "System::Security::Cryptography::X509Certificates::PublicKey Klasse"
linktitle: "PublicKey"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::X509Certificates::PublicKey Klasse. Stellt die öffentlichen Schlüsselinformationen eines X509-Zertifikats dar. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 100
url: /de/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


Stellt die öffentlichen Schlüsselinformationen eines X509-Zertifikats dar. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class PublicKey : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | Liefert den ASN.1-kodierten öffentlichen Schlüsselwert. |
| [get_EncodedParameters](./get_encodedparameters/)() const | Liefert die ASN.1-kodierten öffentlichen Schlüsselparameter. |
| [get_Key](./get_key/)() const | Liefert einen [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) oder [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/). |
| [get_Oid](./get_oid/)() const | Ermittelt die Kennung (OID) des öffentlichen Schlüssels. |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | Konstruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
