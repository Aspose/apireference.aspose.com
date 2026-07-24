---
title: "Espace de noms System::Net::Security"
linktitle: "System::Net::Security"
second_title: "Aspose.Page pour C++"
description: "Comment utiliser l'espace de noms System::Net::Security en C++."
type: docs
weight: 4700
url: /fr/cpp/system.net.security/
---



## Classes

| Classe | Description |
| --- | --- |
| [AuthenticatedStream](./authenticatedstream/) | Contient les méthodes permettant de transmettre des informations d'identification à travers un flux. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des défauts d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument. |
| [SslStream](./sslstream/) | Un flux qui utilise le protocole SSL pour authentifier le serveur et éventuellement le client. |
## Enums

| Énumération | Description |
| --- | --- |
| [AuthenticationLevel](./authenticationlevel/) | Drapeaux d'authentification spécifiques à WebRequest. |
| [EncryptionPolicy](./encryptionpolicy/) | Énumère les politiques de chiffrement. |
| [SslPolicyErrors](./sslpolicyerrors/) | Énumère les erreurs de politique du SSL. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [LocalCertificateSelectionCallback](./localcertificateselectioncallback/) | Un délégué utilisateur utilisé pour sélectionner le certificat SSL local. |
| [RemoteCertificateValidationCallback](./remotecertificatevalidationcallback/) | Un délégué utilisateur utilisé pour vérifier le certificat SSL distant. |
