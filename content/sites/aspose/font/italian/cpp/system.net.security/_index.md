---
title: "System::Net::Security namespace"
linktitle: "System::Net::Security"
second_title: "Aspose.Font per C++"
description: "Come utilizzare lo spazio dei nomi System::Net::Security in C++."
type: docs
weight: 5100
url: /it/cpp/system.net.security/
---



## Classi

| Classe | Descrizione |
| --- | --- |
| [AuthenticatedStream](./authenticatedstream/) | Contiene i metodi per passare le credenziali attraverso uno stream. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../system/makeobject/) function. Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento. |
| [SslStream](./sslstream/) | Uno stream che utilizza il protocollo SSL per autenticare il server e, facoltativamente, il client. |
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
