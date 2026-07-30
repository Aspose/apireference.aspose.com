---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 Klasse"
linktitle: "X509Certificate2"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 Klasse. Stellt ein X509-Zertifikat dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


Stellt ein X509-Zertifikat dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Archived](./get_archived/)() const | Gibt einen Wert zurück, der angibt, dass das Zertifikat archiviert ist. |
| [get_Extensions](./get_extensions/)() const | Gibt die Sammlung von Erweiterungsobjekten zurück, die dem Zertifikat zugeordnet sind. |
| [get_FriendlyName](./get_friendlyname/)() const | Gibt den Anzeigenamen des Zertifikats zurück. |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | Überprüft, ob das Zertifikat einen privaten Schlüssel hat. |
| [get_IssuerName](./get_issuername/)() const | Liefert den Namen der Partei, die ein Zertifikat ausgestellt hat. |
| [get_NotAfter](./get_notafter/)() const | Liefert das lokale Datum und die Uhrzeit, nach denen ein Zertifikat nicht mehr gültig ist. |
| [get_NotBefore](./get_notbefore/)() const | Liefert das lokale Datum und die Uhrzeit, zu der ein Zertifikat gültig wird. |
| [get_PrivateKey](./get_privatekey/)() const | Liefert den privaten Schlüssel, der dem Zertifikat zugeordnet ist. |
| [get_PublicKey](./get_publickey/)() const | Liefert ein Zertifikat-Objekt [PublicKey](../publickey/). |
| [get_RawData](./get_rawdata/)() const | Liefert die Rohdaten des Zertifikats. |
| [get_SerialNumber](./get_serialnumber/)() const | Liefert die Seriennummer eines Zertifikats. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | Liefert den Algorithmus, der zur Erstellung der Signatur eines Zertifikats verwendet wird. |
| [get_SubjectName](./get_subjectname/)() const | Liefert den Betreffnamen aus einem Zertifikat. |
| [get_Thumbprint](./get_thumbprint/)() const | Liefert den Fingerabdruck des Zertifikats. |
| [get_Version](./get_version/)() const | Liefert die Versionsnummer des Zertifikatsformats. |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | Liefert den Typ des Zertifikats, das im angegebenen Byte-Array enthalten ist. |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | Liefert den Typ des Zertifikats, das in der angegebenen Datei enthalten ist. |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | Liefert den privaten Schlüssel [RSA](../../system.security.cryptography/rsa/). |
| [GetDSAPublicKey](./getdsapublickey/)() const | Liefert den öffentlichen Schlüssel [RSA](../../system.security.cryptography/rsa/). |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | Liefert den privaten Schlüssel [RSA](../../system.security.cryptography/rsa/). |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | Liefert den öffentlichen Schlüssel [RSA](../../system.security.cryptography/rsa/). |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | Liefert den Betreff- oder Ausstellernamen aus dem Zertifikat. |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | Liefert den privaten Schlüssel [RSA](../../system.security.cryptography/rsa/). |
| [GetRSAPublicKey](./getrsapublickey/)() const | Liefert den öffentlichen Schlüssel [RSA](../../system.security.cryptography/rsa/). |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Importiert Informationen aus der angegebenen Zertifikatsdatei. |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | Importiert Informationen aus der angegebenen Zertifikatsdatei. |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Importiert Informationen aus den angegebenen Zertifikatsdaten. |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | Importiert Informationen aus den angegebenen Zertifikatsdaten. |
| [Import](./import/)(const String\&) override | Importiert Informationen aus der angegebenen Zertifikatsdatei. |
| [Import](./import/)(const ByteArrayPtr\&) override | Importiert Informationen aus den angegebenen Zertifikatsdaten. |
| [Reset](./reset/)() override | Setzt den Zertifikatszustand zurück. |
| [set_Archived](./set_archived/)(bool) const | Setzt einen Wert, der angibt, dass das Zertifikat archiviert ist. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Setzt den Anzeigenamen des Zertifikats. |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | Setzt oder löscht den privaten Schlüssel, der dem Zertifikat zugeordnet ist. |
| [ToString](./tostring/)(bool) const override | Gibt die Zertifikatsinformationen im Textformat zurück. |
| [ToString](./tostring/)() const override | Gibt die Zertifikatsinformationen im Textformat zurück. |
| [Verify](./verify/)() const | Überprüft die Zertifikatskette. |
| [X509Certificate2](./x509certificate2/)() | Konstruiert ein leeres [X509Certificate2](./). |
| [X509Certificate2](./x509certificate2/)(const String\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Konstruktor. |
## Siehe auch

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
