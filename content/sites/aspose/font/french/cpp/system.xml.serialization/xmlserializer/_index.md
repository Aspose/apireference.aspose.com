---
title: "Classe System::Xml::Serialization::XmlSerializer"
linktitle: "XmlSerializer"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Serialization::XmlSerializer. Effectue la sérialisation et la désérialisation d'objets vers et depuis des documents XML. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


Effectue la sérialisation et la désérialisation d'objets vers et depuis des documents XML. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class XmlSerializer : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | Vérifie si le lecteur spécifique est dans un état désérialisable. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | Désérialise le document XML en objet. |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | Désérialise le document XML en objet. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | Désérialise le document XML en objet. |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | Désérialise le document XML en objet. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | Sérialise le document en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | Sérialise le document en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | Sérialise le document en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Sérialise le document en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Sérialise le document en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | Sérialise le document en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | Sérialise le document en XML. |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | Sérialise le document en XML. |
## Champs

| Champ | Description |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | Nom de l'espace de noms d'encodage. |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI. |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | Nom de l'espace de noms des types WSDL. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)
