---
title: "System::Xml::Schema::XmlSchemaAppInfo classe"
linktitle: "InfoApplicationXmlSchema"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaAppInfo classe. Représente l'élément appinfo du World Wide Web Consortium (W3C) en C++."
type: docs
weight: 1000
url: /fr/cpp/system.xml.schema/xmlschemaappinfo/
---
## XmlSchemaAppInfo class


Représente l'élément **appinfo** du World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaAppInfo : public System::Xml::Schema::XmlSchemaObject
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Markup](./get_markup/)() | Renvoie un tableau d'objets [XmlNode](../../system.xml/xmlnode/) qui représentent les nœuds enfants **appinfo**. |
| [get_Source](./get_source/)() | Renvoie la source des informations d'application. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | Définit un tableau d'objets [XmlNode](../../system.xml/xmlnode/) qui représentent les nœuds enfants **appinfo**. |
| [set_Source](./set_source/)(const String\&) | Définit la source des informations d'application. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
