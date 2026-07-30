---
title: "System::Web::Services::Protocols::SoapHeaderAttribute classe"
linktitle: "SoapHeaderAttribute"
second_title: "Aspose.Font pour C++"
description: "System::Web::Services::Protocols::SoapHeaderAttribute classe. Spécifie l'en-tête SOAP que la méthode de service Web XML ou le client de service Web XML peut traiter. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 700
url: /fr/cpp/system.web.services.protocols/soapheaderattribute/
---
## SoapHeaderAttribute class


Spécifie l'en-tête SOAP que la méthode du service XML [Web](../../system.web/) ou le client du service XML [Web](../../system.web/) peut traiter. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class SoapHeaderAttribute : public System::Attribute
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Direction](./get_direction/)() | Informations RTTI. |
| [get_MemberName](./get_membername/)() | Obtient le nom d'une variable membre du service SOAP XML utilisé pour recevoir le contenu de l'en-tête SOAP. |
| [get_Required](./get_required/)() | Obtient une valeur indiquant si l'en-tête SOAP doit être compris et traité par le service XML [Web](../../system.web/) destinataire ou le client du service XML [Web](../../system.web/). |
| [set_Direction](./set_direction/)(SoapHeaderDirection) | Définit la direction de l'en-tête SOAP. |
| [set_MemberName](./set_membername/)(String) | Définit le nom d'une variable membre du service SOAP XML utilisé pour recevoir le contenu de l'en-tête SOAP. |
| [set_Required](./set_required/)(bool) | Définit une valeur qui indique si l'en-tête SOAP doit être compris et traité par le service XML [Web](../../system.web/) destinataire ou le client du service XML [Web](../../system.web/). |
| [SoapHeaderAttribute](./soapheaderattribute/)(String) | Construit une nouvelle instance. |
## Voir aussi

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
