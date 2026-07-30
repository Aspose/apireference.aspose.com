---
title: "Classe System::Xml::Schema::XmlSchemaObjectEnumerator"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaObjectEnumerator. Représente l'énumérateur pour le XmlSchemaObjectCollection en C++."
type: docs
weight: 5200
url: /fr/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


Représente l'énumérateur pour le [XmlSchemaObjectCollection](../xmlschemaobjectcollection/).

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clone l'itérateur actuel. |
| [Dispose](./dispose/)() override | Ne fait rien. |
| [get_Current](./get_current/)() const override | Renvoie le [XmlSchemaObject](../xmlschemaobject/) actuel dans la collection. |
| [MoveNext](./movenext/)() override | Passe à l'élément suivant dans la collection. |
| [Reset](./reset/)() override | Réinitialise l'énumérateur au début de la collection. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
