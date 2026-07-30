---
title: "Classe System::Xml::Resolvers::XmlPreloadedResolver"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Resolvers::XmlPreloadedResolver. Représente une classe utilisée pour préremplir le cache avec des DTD ou des flux XML en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


Représente une classe utilisée pour préremplir le cache avec des DTD ou des flux XML.

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | Ajoute un tableau d'octets au magasin [XmlPreloadedResolver](./) et le mappe à une URI. Si le magasin contient déjà une correspondance pour la même URI, la correspondance existante est remplacée. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Ajoute un tableau d'octets au magasin [XmlPreloadedResolver](./) et le mappe à une URI. Si le magasin contient déjà une correspondance pour la même URI, la correspondance existante est remplacée. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | Ajoute un flux au magasin [XmlPreloadedResolver](./) et le mappe à une URI. Si le magasin contient déjà une correspondance pour la même URI, la correspondance existante est remplacée. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | Ajoute une chaîne contenant des données préchargées au magasin [XmlPreloadedResolver](./) et la mappe à une URI. Si le magasin contient déjà une correspondance pour la même URI, la correspondance existante est remplacée. |
| [get_PreloadedUris](./get_preloadeduris/)() | Renvoie une collection d'URI préchargées. |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Mappe un URI à un objet contenant la ressource réelle. |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | Supprime les données correspondant à l'URI du [XmlPreloadedResolver](./). |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Résout l'URI absolu à partir des URI de base et relatifs. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Définit les informations d'identification utilisées pour authentifier le [Net::WebRequest](../../system.net/webrequest/) sous-jacent. |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | Détermine si le résolveur prend en charge d'autres types que le simple flux. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | Initialise une nouvelle instance de la classe [XmlPreloadedResolver](./). |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | Initialise une nouvelle instance de la classe [XmlPreloadedResolver](./) avec les DTD bien connus préchargés spécifiés. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | Initialise une nouvelle instance de la classe [XmlPreloadedResolver](./) avec le résolveur de secours spécifié. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | Initialise une nouvelle instance de la classe [XmlPreloadedResolver](./) avec le résolveur de secours spécifié et les DTD bien connus préchargés. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | Initialise une nouvelle instance de la classe [XmlPreloadedResolver](./) avec le résolveur de secours spécifié, les DTD bien connus préchargés et le comparateur d'égalité d'URI. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Font for C++](../../)
