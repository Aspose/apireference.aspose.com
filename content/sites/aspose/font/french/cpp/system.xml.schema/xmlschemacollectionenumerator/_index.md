---
title: "Classe System::Xml::Schema::XmlSchemaCollectionEnumerator"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaCollectionEnumerator. Prend en charge une itération simple sur une collection. Cette classe ne peut pas être héritée en C++."
type: docs
weight: 1600
url: /fr/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


Prend en charge une itération simple sur une collection. Cette classe ne peut pas être héritée.

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clone l'itérateur actuel. |
| [Dispose](./dispose/)() override | Ne fait rien. |
| [get_Current](./get_current/)() const override | Renvoie le [XmlSchema](../xmlschema/) actuel dans la collection. |
| [MoveNext](./movenext/)() override | Fait avancer l'énumérateur vers le schéma suivant dans la collection. |
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
