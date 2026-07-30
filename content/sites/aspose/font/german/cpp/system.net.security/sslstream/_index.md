---
title: "System::Net::Security::SslStream Klasse"
linktitle: "SslStream"
second_title: "Aspose.Font für C++"
description: "System::Net::Security::SslStream Klasse. Ein Stream, der das SSL-Protokoll verwendet, um den Server und optional den Client in C++ zu authentifizieren."
type: docs
weight: 200
url: /de/cpp/system.net.security/sslstream/
---
## SslStream class


Ein Stream, der das SSL‑Protokoll verwendet, um den Server und optional den Client zu authentifizieren.

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | Authentifiziert die Client‑Seite der Verbindung. |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | Authentifiziert die Client‑Seite der Verbindung. |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Startet einen asynchronen Lesevorgang. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Startet einen asynchronen Schreibvorgang. |
| [Close](./close/)() override | Schließt den Stream. |
| [Dispose](./dispose/)(bool) override | Gibt alle vom aktuellen Objekt verwendeten Ressourcen frei und schließt den Stream. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Wartet, bis die angegebene asynchrone Leseoperation abgeschlossen ist. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Beendet eine asynchrone Schreiboperation. Wartet, bis die angegebene asynchrone Schreiboperation abgeschlossen ist. |
| [Flush](./flush/)() override | Leert die Puffer dieses Streams und schreibt alle gepufferten Daten in den zugrunde liegenden Speicher. |
| [get_CanRead](./get_canread/)() const override | Bestimmt, ob der Stream lesbar ist. |
| [get_CanSeek](./get_canseek/)() const override | Bestimmt, ob der Stream das Suchen unterstützt. |
| [get_CanTimeout](./get_cantimeout/)() const override | Ermittelt einen Wert, der bestimmt, ob der aktuelle Stream eine Zeitüberschreitung zulässt. |
| [get_CanWrite](./get_canwrite/)() const override | Bestimmt, ob der Stream beschreibbar ist. |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | Gibt einen Wert zurück, der angibt, ob die Zertifikatswiderrufsliste während des Zertifikatsvalidierungsprozesses geprüft wird. |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | Gibt den Verschlüsselungsalgorithmus zurück. |
| virtual [get_CipherStrength](./get_cipherstrength/)() | Gibt die Stärke des verwendeten Verschlüsselungsalgorithmus zurück. |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | Gibt den Hash‑Algorithmus zurück. |
| virtual [get_HashStrength](./get_hashstrength/)() | Gibt die Stärke des verwendeten Hash‑Algorithmus zurück. |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | Gibt einen Wert zurück, der angibt, ob die Authentifizierung erfolgreich durchgeführt wurde. |
| [get_IsEncrypted](./get_isencrypted/)() const override | Gibt einen Wert zurück, der angibt, ob die mit diesem Stream gesendeten Daten verschlüsselt sind. |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | Gibt einen Wert zurück, der angibt, ob ein Server und ein Client authentifiziert sind. |
| [get_IsServer](./get_isserver/)() const override | Gibt einen Wert zurück, der angibt, ob die lokale Seite der Verbindung der Server ist. |
| [get_IsSigned](./get_issigned/)() const override | Gibt einen Wert zurück, der angibt, ob die mit diesem Stream gesendeten Daten signiert sind. |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | Gibt die Stärke des verwendeten Schlüsselaustausch‑Algorithmus zurück. |
| [get_Length](./get_length/)() const override | Gibt die Länge des Streams in Bytes zurück. |
| virtual [get_LocalCertificate](./get_localcertificate/)() | Gibt das Zertifikat zurück, das zur Authentifizierung des lokalen Endpunkts verwendet wird. |
| [get_Position](./get_position/)() const override | Gibt die aktuelle Position des Streams zurück. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Ermittelt einen Wert in Millisekunden, der bestimmt, wie lange der Stream versucht zu lesen, bevor er eine Zeitüberschreitung erfährt. |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | Gibt das Zertifikat zurück, das zur Authentifizierung des entfernten Endpunkts verwendet wird. |
| virtual [get_SslProtocol](./get_sslprotocol/)() | Gibt das SSL‑Protokoll zurück. |
| [get_WriteTimeout](./get_writetimeout/)() const override | Ermittelt einen Wert in Millisekunden, der bestimmt, wie lange der Stream versucht zu schreiben, bevor er eine Zeitüberschreitung erfährt. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Setzt die Position des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| [set_Position](./set_position/)(int64_t) override | Setzt die Position des Streams. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Setzt einen Wert, der bestimmt, ob der aktuelle Stream eine Zeitüberschreitung zulässt. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Setzt einen Wert in Millisekunden, der bestimmt, wie lange der Stream versucht zu lesen, bevor er eine Zeitüberschreitung erfährt. |
| [SetLength](./setlength/)(int64_t) override | Setzt die Länge des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | Erstellt eine neue Instanz. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | Erstellt eine neue Instanz. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | Erstellt eine neue Instanz. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | Erstellt eine neue Instanz. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | Erstellt eine neue Instanz. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | Schreibt das angegebene Byte‑Array in den Stream. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | Schreibt das angegebene Byte‑Array in den Stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | RTTI-Informationen. |
| [StreamImplementationPtr](./streamimplementationptr/) | Typ des Zeigers auf die Implementierung. |
## Siehe auch

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
