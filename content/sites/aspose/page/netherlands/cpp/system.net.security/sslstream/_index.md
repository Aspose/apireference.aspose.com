---
title: "System::Net::Security::SslStream klasse"
linktitle: "SslStream"
second_title: "Aspose.Page voor C++"
description: "System::Net::Security::SslStream klasse. Een stream die het SSL‑protocol gebruikt om de server en eventueel de client te authenticeren in C++."
type: docs
weight: 200
url: /nl/cpp/system.net.security/sslstream/
---
## SslStream class


Een stream die het SSL-protocol gebruikt om de server en eventueel de client te authenticeren.

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | Authenticeert de client‑kant van de verbinding. |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | Authenticeert de client‑kant van de verbinding. |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Initieert een asynchrone leesbewerking. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Initieert een asynchrone schrijfbewerking. |
| [Close](./close/)() override | Sluit de stream. |
| [Dispose](./dispose/)(bool) override | Vrijgeeft alle resources die door het huidige object worden gebruikt en sluit de stream. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Wacht tot de opgegeven asynchrone leesbewerking is voltooid. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Beëindigt een asynchrone schrijfbewerking. Wacht tot de opgegeven asynchrone schrijfbewerking is voltooid. |
| [Flush](./flush/)() override | Leegt de buffers van deze stroom en schrijft alle gebufferde gegevens naar de onderliggende opslag. |
| [get_CanRead](./get_canread/)() const override | Bepaalt of de stream leesbaar is. |
| [get_CanSeek](./get_canseek/)() const override | Bepaalt of de stroom zoeken ondersteunt. |
| [get_CanTimeout](./get_cantimeout/)() const override | Haalt een waarde op die bepaalt of de huidige stroom kan time-out gaan. |
| [get_CanWrite](./get_canwrite/)() const override | Bepaalt of de stroom beschrijfbaar is. |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | Retourneert een waarde die aangeeft of de certificaatintrekkingslijst wordt gecontroleerd tijdens het certificaatvalidatieproces. |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | Retourneert het encryptie‑algoritme. |
| virtual [get_CipherStrength](./get_cipherstrength/)() | Retourneert de sterkte van het gebruikte encryptie‑algoritme. |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | Retourneert het hash‑algoritme. |
| virtual [get_HashStrength](./get_hashstrength/)() | Retourneert de sterkte van het gebruikte hash‑algoritme. |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | Retourneert een waarde die aangeeft of de authenticatie succesvol is verlopen. |
| [get_IsEncrypted](./get_isencrypted/)() const override | Retourneert een waarde die aangeeft of de met deze stream verzonden gegevens versleuteld zijn. |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | Retourneert een waarde die aangeeft of een server en een client geauthenticeerd zijn. |
| [get_IsServer](./get_isserver/)() const override | Retourneert een waarde die aangeeft of de lokale kant van de verbinding de server is. |
| [get_IsSigned](./get_issigned/)() const override | Retourneert een waarde die aangeeft of de met deze stream verzonden gegevens ondertekend zijn. |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | Retourneert de sterkte van het gebruikte sleuteluitwisselings‑algoritme. |
| [get_Length](./get_length/)() const override | Retourneert de lengte van de stroom in bytes. |
| virtual [get_LocalCertificate](./get_localcertificate/)() | Retourneert het certificaat dat wordt gebruikt om het lokale eindpunt te authenticeren. |
| [get_Position](./get_position/)() const override | Retourneert de huidige positie van de stroom. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Haalt een waarde op, in milliseconden, die bepaalt hoe lang de stroom zal proberen te lezen voordat er een time-out optreedt. |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | Retourneert het certificaat dat wordt gebruikt om het externe eindpunt te authenticeren. |
| virtual [get_SslProtocol](./get_sslprotocol/)() | Retourneert het SSL‑protocol. |
| [get_WriteTimeout](./get_writetimeout/)() const override | Haalt een waarde op, in milliseconden, die bepaalt hoe lang de stream zal proberen te schrijven voordat er een time‑out optreedt. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Stelt de positie in van de stream die wordt vertegenwoordigd door het huidige object. |
| [set_Position](./set_position/)(int64_t) override | Stelt de positie van de stream in. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Stelt een waarde in die bepaalt of de huidige stream kan time‑out gaan. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Stelt een waarde in, in milliseconden, die bepaalt hoe lang de stream zal proberen te lezen voordat er een time‑out optreedt. |
| [SetLength](./setlength/)(int64_t) override | Stelt de lengte in van de stream die wordt vertegenwoordigd door het huidige object. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | Construeert een nieuw exemplaar. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | Construeert een nieuw exemplaar. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | Construeert een nieuw exemplaar. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | Construeert een nieuw exemplaar. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | Construeert een nieuw exemplaar. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | Schrijft de opgegeven byte‑array naar de stream. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | Schrijft de opgegeven byte‑array naar de stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Een stream zonder onderliggende opslag. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | RTTI-informatie. |
| [StreamImplementationPtr](./streamimplementationptr/) | Type pointer naar de implementatie. |
## Zie ook

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
