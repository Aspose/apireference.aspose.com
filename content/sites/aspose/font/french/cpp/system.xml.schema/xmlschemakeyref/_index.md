---
title: "System::Xml::Schema::XmlSchemaKeyref classe"
linktitle: "XmlSchemaKeyref"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaKeyref class. Cette classe représente l'élément keyref du XMLSchema tel que spécifié par le World Wide Web Consortium (W3C) en C++."
type: docs
weight: 4000
url: /fr/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


Cette classe représente l'élément **keyref** du XMLSchema tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Refer](./get_refer/)() | Renvoie le nom de la clé à laquelle cette contrainte fait référence dans un autre type simple ou complexe. |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom de la clé à laquelle cette contrainte fait référence dans un autre type simple ou complexe. |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | Initialise une nouvelle instance de la classe [XmlSchemaKeyref](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
