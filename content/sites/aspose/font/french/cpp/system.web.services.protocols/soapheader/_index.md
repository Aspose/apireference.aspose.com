---
title: "System::Web::Services::Protocols::SoapHeader class"
linktitle: "SoapHeader"
second_title: "Aspose.Font pour C++"
description: "System::Web::Services::Protocols::SoapHeader class. Représente le contenu de l'en-tête SOAP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


Représente le contenu de l'en-tête SOAP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class SoapHeader : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Actor](./get_actor/)() | Obtient l'URI du destinataire de l'en-tête SOAP lorsque la version SOAP 1.1 est utilisée. |
| [get_DidUnderstand](./get_didunderstand/)() | Obtient une valeur indiquant si l'en-tête SOAP est correctement traité. |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | Obtient la valeur de l'attribut 'mustUnderstand' lorsque la version SOAP 1.1 est utilisée. |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | Obtient la valeur de l'attribut 'mustUnderstand' lorsque la version SOAP 1.2 est utilisée. |
| [get_EncodedRelay](./get_encodedrelay/)() | Obtient une représentation sous forme de chaîne de la valeur de l'attribut 'relay'. |
| [get_MustUnderstand](./get_mustunderstand/)() | Obtient une valeur indiquant si l'en-tête SOAP doit être compris. |
| [get_Relay](./get_relay/)() | Obtient la valeur de l'attribut 'relay'. |
| [get_Role](./get_role/)() | Obtient l'URI du destinataire de l'en-tête SOAP lorsque la version SOAP 1.2 est utilisée. |
| [set_Actor](./set_actor/)(String) | Définit l'URI du destinataire de l'en-tête SOAP lorsque la version SOAP 1.1 est utilisée. |
| [set_DidUnderstand](./set_didunderstand/)(bool) | Définit une valeur indiquant si l'en-tête SOAP est correctement traité. |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | Définit la valeur de l'attribut 'mustUnderstand' lorsque la version SOAP 1.1 est utilisée. |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | Définit la valeur de l'attribut 'mustUnderstand' lorsque la version SOAP 1.2 est utilisée. |
| [set_EncodedRelay](./set_encodedrelay/)(String) | Définit une représentation sous forme de chaîne de la valeur de l'attribut 'relay'. |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | Définit une valeur indiquant si l'en-tête SOAP doit être compris. |
| [set_Relay](./set_relay/)(bool) | Définit la valeur de l'attribut 'relay'. |
| [set_Role](./set_role/)(String) | Définit l'URI du destinataire de l'en-tête SOAP lorsque la version SOAP 1.2 est utilisée. |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | Construit une nouvelle instance. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
