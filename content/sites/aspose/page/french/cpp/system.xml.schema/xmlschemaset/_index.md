---
title: "classe System::Xml::Schema::XmlSchemaSet"
linktitle: "XmlSchemaSet"
second_title: "Aspose.Page pour C++"
description: "classe System::Xml::Schema::XmlSchemaSet. Contient un cache de schémas XML Schema Definition Language (XSD) en C++."
type: docs
weight: 5800
url: /fr/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


Contient un cache de schémas XML [Schema](../) langage de définition (XSD).

```cpp
class XmlSchemaSet : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(String, const String\&) | Ajoute le schéma XML [Schema](../) langage de définition (XSD) situé à l'URL spécifiée au [XmlSchemaSet](./). |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | Ajoute le schéma XML [Schema](../) langage de définition (XSD) contenu dans le [XmlReader](../../system.xml/xmlreader/) au [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | Ajoute tous les schémas XML [Schema](../) langage de définition (XSD) du [XmlSchemaSet](./) donné au [XmlSchemaSet](./). |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Ajoute le [XmlSchema](../xmlschema/) donné au [XmlSchemaSet](./). |
| [Compile](./compile/)() | Compile les schémas XML [Schema](../) langage de définition (XSD) ajoutés au [XmlSchemaSet](./) en un schéma logique. |
| [Contains](./contains/)(String) | Indique si un schéma XML [Schema](../) langage de définition (XSD) avec l'URI d'espace de noms cible spécifié se trouve dans le [XmlSchemaSet](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Indique si l'objet XML [Schema](../) langage de définition (XSD) [XmlSchema](../xmlschema/) spécifié se trouve dans le [XmlSchemaSet](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Copie tous les objets [XmlSchema](../xmlschema/) du [XmlSchemaSet](./) vers le tableau donné, en commençant à l'index indiqué. |
| [get_CompilationSettings](./get_compilationsettings/)() | Renvoie les [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) pour le [XmlSchemaSet](./). |
| [get_Count](./get_count/)() | Renvoie le nombre de schémas XML [Schema](../) de langage de définition (XSD) logiques dans le [XmlSchemaSet](./). |
| [get_GlobalAttributes](./get_globalattributes/)() | Renvoie tous les attributs globaux dans tous les schémas XML [Schema](../) de langage de définition (XSD) du [XmlSchemaSet](./). |
| [get_GlobalElements](./get_globalelements/)() | Renvoie tous les éléments globaux dans tous les schémas XML [Schema](../) de langage de définition (XSD) du [XmlSchemaSet](./). |
| [get_GlobalTypes](./get_globaltypes/)() | Renvoie tous les types simples et complexes globaux dans tous les schémas XML [Schema](../) de langage de définition (XSD) du [XmlSchemaSet](./). |
| [get_IsCompiled](./get_iscompiled/)() | Renvoie une valeur qui indique si les schémas XML [Schema](../) de langage de définition (XSD) du [XmlSchemaSet](./) ont été compilés. |
| [get_NameTable](./get_nametable/)() | Renvoie la [XmlNameTable](../../system.xml/xmlnametable/) par défaut utilisée par le [XmlSchemaSet](./) lors du chargement de nouveaux schémas XML [Schema](../) de langage de définition (XSD). |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | Supprime le schéma XML [Schema](../) de langage de définition (XSD) spécifié du [XmlSchemaSet](./). |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | Supprime le schéma XML [Schema](../) de langage de définition (XSD) spécifié ainsi que tous les schémas qu'il importe du [XmlSchemaSet](./). |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | Re-traite un schéma XML [Schema](../) de langage de définition (XSD) déjà présent dans le [XmlSchemaSet](./). |
| [Schemas](./schemas/)() | Renvoie une collection de tous les schémas XML [Schema](../) de langage de définition (XSD) du [XmlSchemaSet](./). |
| [Schemas](./schemas/)(String) | Renvoie une collection de tous les schémas XML [Schema](../) de langage de définition (XSD) du [XmlSchemaSet](./) appartenant à l'espace de noms fourni. |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | Définit les [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) pour le [XmlSchemaSet](./). |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Définit le [XmlResolver](../../system.xml/xmlresolver/) utilisé pour résoudre les espaces de noms ou les emplacements référencés dans les éléments include et import d'un schéma. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Ajoute un gestionnaire d'événements pour recevoir des informations sur les erreurs de validation du schéma XML [Schema](../) de langage de définition (XSD). |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Supprime un gestionnaire d'événements pour recevoir des informations sur les erreurs de validation du schéma XML [Schema](../) de langage de définition (XSD). |
| [XmlSchemaSet](./xmlschemaset/)() | Initialise une nouvelle instance de la classe [XmlSchemaSet](./). |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | Initialise une nouvelle instance de la classe [XmlSchemaSet](./) avec la [XmlNameTable](../../system.xml/xmlnametable/) spécifiée. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
