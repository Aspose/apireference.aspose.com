---
title: "Classe System::Xml::Schema::ValidationEventArgs"
linktitle: "ArgumentsÉvénementValidation"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::ValidationEventArgs. Retourne des informations détaillées liées au ValidationEventHandler en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


Retourne des informations détaillées liées au [ValidationEventHandler](../validationeventhandler/).

```cpp
class ValidationEventArgs : public System::EventArgs
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Exception](./get_exception/)() | Retourne le [XmlSchemaException](../xmlschemaexception/) associé à l'événement de validation. |
| [get_Message](./get_message/)() | Retourne la description textuelle correspondant à l'événement de validation. |
| [get_Severity](./get_severity/)() | Retourne la gravité de l'événement de validation. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membre statique qui représente un pointeur partagé "vide" [EventArgs](../../system/eventargs/) (pointeur nul). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
