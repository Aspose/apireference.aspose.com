---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol classe"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Font pour C++"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol classe. Les services de proxy client doivent hériter de cette classe lorsque le SOAP est utilisé. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 900
url: /fr/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


Les services de proxy client doivent hériter de cette classe lorsque le SOAP est utilisé. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Discover](./discover/)() | Lie l'instance actuelle au service XML [Web](../../system.web/). |
| [get_SoapVersion](./get_soapversion/)() | Obtient la version SOAP. |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | Initialise les champs internes. |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | Définit la version SOAP. |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | Construit une nouvelle instance. |
## Voir aussi

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
