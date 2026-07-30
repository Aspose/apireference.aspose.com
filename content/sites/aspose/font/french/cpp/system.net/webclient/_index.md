---
title: "System::Net::WebClient classe"
linktitle: "WebClient"
second_title: "Aspose.Font pour C++"
description: "System::Net::WebClient classe. WebClient fournit des méthodes courantes pour l'envoi et la réception de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3500
url: /fr/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | Télécharge la ressource spécifiée sous forme de tableau d'octets. |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | Télécharge la ressource spécifiée sous forme de tableau d'octets. |
| [DownloadString](./downloadstring/)(const String\&) const | Télécharge la ressource spécifiée sous forme de chaîne. |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | Télécharge la ressource spécifiée sous forme de chaîne. |
| [get_Encoding](./get_encoding/)() const | Obtient l'encodage utilisé pour télécharger ou envoyer des chaînes. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | Définit l'encodage utilisé pour télécharger ou envoyer des chaînes. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | NON IMPLEMENTÉ. |
| [WebClient](./webclient/)() | Informations RTTI. |
| [~WebClient](./~webclient/)() | Détruit l'instance actuelle. |
## Voir aussi

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
