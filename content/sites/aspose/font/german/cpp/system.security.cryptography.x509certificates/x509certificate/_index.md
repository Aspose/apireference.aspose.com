---
title: "System::Security::Cryptography::X509Certificates::X509Certificate Klasse"
linktitle: "X509Certificate"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate Klasse. X.509 v.3-Zertifikat. Verschlüsselte Zertifikate werden nicht unterstützt. Nur das Flag X509KeyStorageFlags::DefaultKeySet wird unterstützt. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 300
url: /de/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


X.509 v.3-Zertifikat. Verschlüsselte Zertifikate werden nicht unterstützt. Nur das Flag [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/) wird unterstützt. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | Erstellt ein Zertifikat aus der angegebenen PKCS7-Datei. |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | Erstellt ein Zertifikat aus der angegebenen signierten Datei. |
| [Dispose](./dispose/)() override | Tut nichts. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergleicht zwei Zertifikate. |
| virtual [Export](./export/)(X509ContentType) const | Exportiert das aktuelle Objekt in ein Byte-Array unter Verwendung des angegebenen Formats. NICHT IMPLEMENTIERT. |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | Exportiert das aktuelle Objekt in ein Byte-Array unter Verwendung des angegebenen Formats. NICHT IMPLEMENTIERT. |
| virtual [Export](./export/)(X509ContentType, const String\&) const | Exportiert das aktuelle Objekt in ein Byte-Array unter Verwendung des angegebenen Formats. NICHT IMPLEMENTIERT. |
| [get_Handle](./get_handle/)() const | Erhält einen Handle zum Microsoft Cryptographic API-Zertifikatskontext. |
| [get_Issuer](./get_issuer/)() const | Erhält den Namen der Zertifizierungsstelle, die das X-509v3-Zertifikat ausgestellt hat. |
| [get_Subject](./get_subject/)() const | Erhält den distinguished name des Subjekts aus dem Zertifikat. |
| virtual [GetCertHash](./getcerthash/)() const | Erhält den Hash des aktuellen Objekts als Byte-Array. |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | Erhält den Hash des aktuellen Objekts als Byte-Array. |
| virtual [GetCertHashString](./getcerthashstring/)() const | Erhält den [SHA1](../../system.security.cryptography/sha1/) Hash des aktuellen Objekts als hexadezimale Zeichenkette. |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | Erhält den [SHA1](../../system.security.cryptography/sha1/) Hash des aktuellen Objekts als hexadezimale Zeichenkette. |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | Erhält das Gültigkeitsdatum des aktuellen Zertifikats. |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | Liefert das Ablaufdatum des aktuellen Zertifikats. |
| virtual [GetFormat](./getformat/)() const | Liefert den Namen des Zertifikatsformats. |
| [GetHashCode](./gethashcode/)() const override | Liefert den Hashcode des Zertifikats. |
| virtual [GetIssuerName](./getissuername/)() const | Liefert den Namen der Zertifizierungsstelle, die das aktuelle Zertifikat ausgestellt hat. |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | Liefert Schlüsselinformationen für das aktuelle Zertifikat als Zeichenkette. |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | Liefert Schlüsselinformationen für das aktuelle Zertifikat als Byte-Array. |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | Liefert Schlüsselinformationen für das aktuelle Zertifikat als hexadezimale Zeichenkette. |
| virtual [GetName](./getname/)() const | Liefert den Namen des Principals, dem das aktuelle Zertifikat ausgestellt wurde. |
| virtual [GetPublicKey](./getpublickey/)() const | Liefert den öffentlichen Schlüssel aus dem Zertifikat als Byte-Array. |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | Liefert den öffentlichen Schlüssel aus dem Zertifikat als hexadezimale Zeichenkette. |
| virtual [GetRawCertData](./getrawcertdata/)() const | Liefert Rohdaten aus dem Zertifikat als Byte-Array. |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | Liefert Rohdaten aus dem Zertifikat als hexadezimale Zeichenkette. |
| virtual [GetSerialNumber](./getserialnumber/)() const | Liefert die Seriennummer aus dem Zertifikat als Byte-Array. |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | Liefert die Seriennummer aus dem Zertifikat als hexadezimale Zeichenkette. |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Importiert Informationen aus der angegebenen Zertifikatsdatei. NICHT IMPLEMENTIERT. |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | Importiert Informationen aus der angegebenen Zertifikatsdatei. NICHT IMPLEMENTIERT. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Importiert Informationen aus den angegebenen Zertifikatsdaten. NICHT IMPLEMENTIERT. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Importiert Informationen aus den angegebenen Zertifikatsdaten. NICHT IMPLEMENTIERT. |
| virtual [Import](./import/)(const String\&) | Importiert Informationen aus der angegebenen Zertifikatsdatei. NICHT IMPLEMENTIERT. |
| virtual [Import](./import/)(const ByteArrayPtr\&) | Importiert Informationen aus den angegebenen Zertifikatsdaten. NICHT IMPLEMENTIERT. |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | Setzt den Zertifikatszustand zurück. |
| virtual [ToString](./tostring/)(bool) const | Gibt die Zertifikatsinformationen im Textformat zurück. |
| [ToString](./tostring/)() const override | Gibt die Zertifikatsinformationen im Textformat zurück. |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const String\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Konstruktor. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Konstruktor. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Zeigertyp. |
## Siehe auch

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
