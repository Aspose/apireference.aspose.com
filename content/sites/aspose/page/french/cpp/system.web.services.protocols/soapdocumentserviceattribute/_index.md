---
title: "Classe System::Web::Services::Protocols::SoapDocumentServiceAttribute"
linktitle: "SoapDocumentServiceAttribute"
second_title: "Aspose.Page pour C++"
description: "Classe System::Web::Services::Protocols::SoapDocumentServiceAttribute. Définit le format par défaut pour les requêtes et réponses SOAP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 500
url: /fr/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


Définit le format par défaut pour les requêtes et réponses SOAP. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | Informations RTTI. |
| [get_RoutingStyle](./get_routingstyle/)() | Obtient une valeur indiquant comment les messages SOAP sont acheminés vers le service. |
| [get_Use](./get_use/)() | Obtient le formatage des paramètres. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Définit une valeur qui indique si les paramètres sont encapsulés dans un seul élément XML sous l'élément 'Body'. |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | Définit une valeur indiquant comment les messages SOAP sont acheminés vers le service. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Définit le formatage des paramètres. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | Construit une nouvelle instance. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | Construit une nouvelle instance. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | Construit une nouvelle instance. |
## Voir aussi

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
