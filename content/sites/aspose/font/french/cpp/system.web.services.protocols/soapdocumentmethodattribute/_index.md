---
title: "classe System::Web::Services::Protocols::SoapDocumentMethodAttribute"
linktitle: "SoapDocumentMethodAttribute"
second_title: "Aspose.Font pour C++"
description: "classe System::Web::Services::Protocols::SoapDocumentMethodAttribute. Spécifie que tous les messages SOAP transmis ou renvoyés par la méthode utilisent le format Document. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


Spécifie que tous les messages SOAP transmis ou renvoyés par la méthode utilisent le format Document. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu'argument.

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Action](./get_action/)() | Informations RTTI. |
| [get_Binding](./get_binding/)() | Obtient la liaison pour laquelle une méthode de service Web XML implémente une opération. |
| [get_OneWay](./get_oneway/)() | Obtient une valeur indiquant si le client n'attend pas que le serveur termine le traitement d'une méthode. |
| [get_ParameterStyle](./get_parameterstyle/)() | Obtient une valeur indiquant si les paramètres sont encapsulés dans un seul élément XML sous l'élément 'Body'. |
| [get_RequestElementName](./get_requestelementname/)() | Obtient le nom de l'élément XML associé à la requête SOAP, qui est défini dans une description de service comme une opération. |
| [get_RequestNamespace](./get_requestnamespace/)() | Obtient l'espace de noms associé à la requête SOAP. |
| [get_ResponseElementName](./get_responseelementname/)() | Obtient le nom de l'élément XML associé à la réponse SOAP. |
| [get_ResponseNamespace](./get_responsenamespace/)() | Obtient l'espace de noms associé à la réponse SOAP. |
| [get_Use](./get_use/)() | Obtient une valeur qui détermine la méthode d'encodage du message. |
| [set_Action](./set_action/)(String) | Définit une valeur de l'attribut 'SOAPAction'. |
| [set_Binding](./set_binding/)(String) | Définit la liaison pour laquelle une méthode de service Web XML implémente une opération. |
| [set_OneWay](./set_oneway/)(bool) | Définit une valeur indiquant si le client n'attend pas que le serveur termine le traitement d'une méthode. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Définit une valeur indiquant si les paramètres sont encapsulés dans un seul élément XML sous l'élément 'Body'. |
| [set_RequestElementName](./set_requestelementname/)(String) | Définit le nom de l'élément XML associé à la requête SOAP, qui est défini dans une description de service comme une opération. |
| [set_RequestNamespace](./set_requestnamespace/)(String) | Définit l'espace de noms associé à la requête SOAP. |
| [set_ResponseElementName](./set_responseelementname/)(String) | Définit le nom de l'élément XML associé à la réponse SOAP. |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | Définit l'espace de noms associé à la réponse SOAP. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Définit une valeur qui détermine la méthode d'encodage du message. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | Construit une nouvelle instance. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | Construit une nouvelle instance. |
## Voir aussi

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
