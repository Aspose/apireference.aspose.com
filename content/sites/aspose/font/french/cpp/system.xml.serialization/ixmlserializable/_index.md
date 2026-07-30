---
title: "classe System::Xml::Serialization::IXmlSerializable"
linktitle: "IXmlSerializable"
second_title: "Aspose.Font pour C++"
description: "classe System::Xml::Serialization::IXmlSerializable. Fournit un formatage personnalisé pour la sérialisation et la désérialisation XML. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


Fournit un formatage personnalisé pour la sérialisation et la désérialisation XML. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class IXmlSerializable : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [GetSchema](./getschema/)() | Un objet XmlSchema qui décrit la représentation XML de l'objet renvoyé par la méthode [WriteXml()](./writexml/) et accepté par la méthode [ReadXml()](./readxml/). |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | Désérialise l'objet à partir de sa représentation XML. |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | Sérialise l'objet actuel en représentation XML. |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | Destructeur. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
