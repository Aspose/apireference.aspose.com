---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 Klasse"
linktitle: "X509Certificate2"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 Klasse. Stellt ein X509-Zertifikat dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


Stellt ein X509-Zertifikat dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Archived](./get_archived/)() const | Gibt einen Wert zurück, der angibt, dass das Zertifikat archiviert ist. |
| [get_Extensions](./get_extensions/)() const | Gibt die Sammlung von Erweiterungsobjekten zurück, die mit dem Zertifikat verknüpft sind. |
| [get_FriendlyName](./get_friendlyname/)() const | Gibt den Anzeigenamen des Zertifikats zurück. |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | Prüft, ob das Zertifikat einen privaten Schlüssel besitzt. |
| [get_IssuerName](./get_issuername/)() const | Gibt den Namen der Partei zurück, die das Zertifikat ausgestellt hat. |
| [get_NotAfter](./get_notafter/)() const | Gibt das lokale Datum und die Uhrzeit zurück, nach denen ein Zertifikat nicht mehr gültig ist. |
| [get_NotBefore](./get_notbefore/)() const | Gibt das lokale Datum und die Uhrzeit zurück, zu denen ein Zertifikat gültig wird. |
| [get_PrivateKey](./get_privatekey/)() const | Gibt den mit dem Zertifikat verknüpften privaten Schlüssel zurück. |
| [get_PublicKey](./get_publickey/)() const | Gibt ein Zertifikat [PublicKey](../publickey/) Objekt zurück. |
| [get_RawData](./get_rawdata/)() const | Gibt die Rohdaten des Zertifikats zurück. |
| [get_SerialNumber](./get_serialnumber/)() const | Gibt die Seriennummer eines Zertifikats zurück. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | Ermittelt den Algorithmus, der zum Erstellen der Signatur eines Zertifikats verwendet wird. |
| [get_SubjectName](./get_subjectname/)() const | Ermittelt den Betreffnamen aus einem Zertifikat. |
| [get_Thumbprint](./get_thumbprint/)() const | Ermittelt den Fingerabdruck des Zertifikats. |
| [get_Version](./get_version/)() const | Ermittelt die Versionsnummer des Zertifikatsformats. |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | Ermittelt den Typ des im angegebenen Byte-Array enthaltenen Zertifikats. |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | Ermittelt den Typ des in der angegebenen Datei enthaltenen Zertifikats. |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | Ermittelt den privaten Schlüssel von [RSA](../../system.security.cryptography/rsa/); |
| [GetDSAPublicKey](./getdsapublickey/)() const | Ermittelt den öffentlichen Schlüssel von [RSA](../../system.security.cryptography/rsa/). |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | Ermittelt den privaten Schlüssel von [RSA](../../system.security.cryptography/rsa/); |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | Ermittelt den öffentlichen Schlüssel von [RSA](../../system.security.cryptography/rsa/). |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | Ermittelt den Betreff- oder Ausstellernamen aus dem Zertifikat. |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | Ermittelt den privaten Schlüssel von [RSA](../../system.security.cryptography/rsa/); |
| [GetRSAPublicKey](./getrsapublickey/)() const | Ermittelt den öffentlichen Schlüssel von [RSA](../../system.security.cryptography/rsa/). |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Importiert Informationen aus der angegebenen Zertifikatsdatei. |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | Importiert Informationen aus der angegebenen Zertifikatsdatei. |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Importiert Informationen aus den angegebenen Zertifikatsdaten. |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | Importiert Informationen aus den angegebenen Zertifikatsdaten. |
| [Import](./import/)(const String\&) override | Importiert Informationen aus der angegebenen Zertifikatsdatei. |
| [Import](./import/)(const ByteArrayPtr\&) override | Importiert Informationen aus den angegebenen Zertifikatsdaten. |
| [Reset](./reset/)() override | Setzt den Zertifikatszustand zurück. |
| [set_Archived](./set_archived/)(bool) const | Legt einen Wert fest, der angibt, dass das Zertifikat archiviert ist. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Legt den Anzeigenamen des Zertifikats fest. |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | Setzt oder löscht den privaten Schlüssel, der dem Zertifikat zugeordnet ist. |
| [ToString](./tostring/)(bool) const override | Gibt die Zertifikatsinformationen im Textformat zurück. |
| [ToString](./tostring/)() const override | Gibt die Zertifikatsinformationen im Textformat zurück. |
| [Verify](./verify/)() const | Überprüft die Zertifikatskette. |
| [X509Certificate2](./x509certificate2/)() | Erstellt ein leeres [X509Certificate2](./). |
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
* Library [Aspose.Page for C++](../../)
