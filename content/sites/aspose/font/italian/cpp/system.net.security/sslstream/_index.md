---
title: "Classe System::Net::Security::SslStream"
linktitle: "SslStream"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::Security::SslStream. Uno stream che utilizza il protocollo SSL per autenticare il server e, facoltativamente, il client in C++."
type: docs
weight: 200
url: /it/cpp/system.net.security/sslstream/
---
## SslStream class


Uno stream che utilizza il protocollo SSL per autenticare il server e, facoltativamente, il client.

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | Autentica il lato client della connessione. |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | Autentica il lato client della connessione. |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Avvia un'operazione di lettura asincrona. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | Avvia un'operazione di scrittura asincrona. |
| [Close](./close/)() override | Chiude lo stream. |
| [Dispose](./dispose/)(bool) override | Rilascia tutte le risorse utilizzate dall'oggetto corrente e chiude lo stream. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | Attende finché l'operazione di lettura asincrona specificata non è completata. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | Termina un'operazione di scrittura asincrona. Attende finché l'operazione di scrittura asincrona specificata non è completata. |
| [Flush](./flush/)() override | Svuota i buffer di questo flusso e scrive tutti i dati bufferizzati nello storage sottostante. |
| [get_CanRead](./get_canread/)() const override | Determina se il flusso è leggibile. |
| [get_CanSeek](./get_canseek/)() const override | Determina se il flusso supporta il posizionamento. |
| [get_CanTimeout](./get_cantimeout/)() const override | Ottiene un valore che determina se il flusso corrente può scadere. |
| [get_CanWrite](./get_canwrite/)() const override | Determina se il flusso è scrivibile. |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | Restituisce un valore che indica se la lista di revoca dei certificati viene controllata durante il processo di convalida del certificato. |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | Restituisce l'algoritmo di crittografia. |
| virtual [get_CipherStrength](./get_cipherstrength/)() | Restituisce la forza dell'algoritmo di crittografia utilizzato. |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | Restituisce l'algoritmo di hash. |
| virtual [get_HashStrength](./get_hashstrength/)() | Restituisce la forza dell'algoritmo di hash utilizzato. |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | Restituisce un valore che indica se l'autenticazione è stata superata con successo. |
| [get_IsEncrypted](./get_isencrypted/)() const override | Restituisce un valore che indica se i dati inviati tramite questo stream sono crittografati. |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | Restituisce un valore che indica se un server e un client sono autenticati. |
| [get_IsServer](./get_isserver/)() const override | Restituisce un valore che indica se il lato locale della connessione è il server. |
| [get_IsSigned](./get_issigned/)() const override | Restituisce un valore che indica se i dati inviati tramite questo stream sono firmati. |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | Restituisce la forza dell'algoritmo di scambio chiavi utilizzato. |
| [get_Length](./get_length/)() const override | Restituisce la lunghezza del flusso in byte. |
| virtual [get_LocalCertificate](./get_localcertificate/)() | Restituisce il certificato utilizzato per autenticare il punto finale locale. |
| [get_Position](./get_position/)() const override | Restituisce la posizione corrente del flusso. |
| [get_ReadTimeout](./get_readtimeout/)() const override | Ottiene un valore, in millisecondi, che determina per quanto tempo il flusso tenterà di leggere prima di scadere. |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | Restituisce il certificato utilizzato per autenticare il punto finale remoto. |
| virtual [get_SslProtocol](./get_sslprotocol/)() | Restituisce il protocollo SSL. |
| [get_WriteTimeout](./get_writetimeout/)() const override | Ottiene un valore, in millisecondi, che determina per quanto tempo il flusso tenterà di scrivere prima di scadere. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | Imposta la posizione del flusso rappresentato dall'oggetto corrente. |
| [set_Position](./set_position/)(int64_t) override | Imposta la posizione del flusso. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | Imposta un valore che determina se il flusso corrente può scadere. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | Imposta un valore, in millisecondi, che determina per quanto tempo il flusso tenterà di leggere prima di scadere. |
| [SetLength](./setlength/)(int64_t) override | Imposta la lunghezza del flusso rappresentato dall'oggetto corrente. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | Crea una nuova istanza. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | Crea una nuova istanza. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | Crea una nuova istanza. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | Crea una nuova istanza. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | Crea una nuova istanza. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | Scrive l'array di byte specificato nello stream. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | Scrive l'array di byte specificato nello stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Null](../../system.io/stream/null/) | Un flusso senza storage sottostante. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | Informazioni RTTI. |
| [StreamImplementationPtr](./streamimplementationptr/) | Tipo di puntatore all'implementazione. |
## Vedi anche

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)
