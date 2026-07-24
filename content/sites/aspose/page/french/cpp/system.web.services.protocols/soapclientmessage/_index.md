---
title: "Classe System::Web::Services::Protocols::SoapClientMessage"
linktitle: "SoapClientMessage"
second_title: "Aspose.Page pour C++"
description: "Classe System::Web::Services::Protocols::SoapClientMessage. Représente les données d'une requête SOAP envoyée ou d'une réponse SOAP reçue. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


Représente les données d'une requête SOAP envoyée ou d'une réponse SOAP reçue. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Action](./get_action/)() override | Renvoie une valeur de l'attribut 'SOAPAction'. |
| [get_Client](./get_client/)() | Renvoie une instance de la classe proxy du client. |
| virtual [get_OneWay](./get_oneway/)() | Renvoie une valeur indiquant si le client n'attend pas que le serveur termine le traitement d'une méthode. |
| [get_SoapVersion](./get_soapversion/)() override | Renvoie la version de SOAP utilisée. |
| [get_Url](./get_url/)() override | Renvoie l'URL du service XML [Web](../../system.web/). |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Construit une nouvelle instance. |
## Voir aussi

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
