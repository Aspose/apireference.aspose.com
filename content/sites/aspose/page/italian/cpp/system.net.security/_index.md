---
title: "namespace System::Net::Security"
linktitle: "System::Net::Security"
second_title: "Aspose.Page per C++"
description: "Come utilizzare il namespace System::Net::Security in C++."
type: docs
weight: 4700
url: /it/cpp/system.net.security/
---



## Classi

| Classe | Descrizione |
| --- | --- |
| [AuthenticatedStream](./authenticatedstream/) | Contiene i metodi per passare le credenziali attraverso un flusso. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento. |
| [SslStream](./sslstream/) | Un flusso che utilizza il protocollo SSL per autenticare il server e, facoltativamente, il client. |
## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [AuthenticationLevel](./authenticationlevel/) | Flag di autenticazione specifici per WebRequest. |
| [EncryptionPolicy](./encryptionpolicy/) | Enumera le politiche di crittografia. |
| [SslPolicyErrors](./sslpolicyerrors/) | Enumera gli errori di politica di SSL. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [LocalCertificateSelectionCallback](./localcertificateselectioncallback/) | Un delegato utente utilizzato per selezionare il certificato SSL locale. |
| [RemoteCertificateValidationCallback](./remotecertificatevalidationcallback/) | Un delegato utente utilizzato per verificare il certificato SSL remoto. |
