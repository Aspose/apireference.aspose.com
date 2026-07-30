---
title: "Classe System::Xml::XmlParserContext"
linktitle: "XmlParserContext"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlParserContext. Fournit toutes les informations de contexte requises par le XmlReader pour analyser un fragment XML en C++."
type: docs
weight: 3000
url: /fr/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


Fournit toutes les informations de contexte requises par le [XmlReader](../xmlreader/) pour analyser un fragment XML.

```cpp
class XmlParserContext : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | Renvoie l’URI de base. |
| [get_DocTypeName](./get_doctypename/)() | Renvoie le nom de la déclaration de type de document. |
| [get_Encoding](./get_encoding/)() | Renvoie le type d’encodage. |
| [get_InternalSubset](./get_internalsubset/)() | Renvoie le sous-ensemble DTD interne. |
| [get_NamespaceManager](./get_namespacemanager/)() | Renvoie le [XmlNamespaceManager](../xmlnamespacemanager/). |
| [get_NameTable](./get_nametable/)() | Renvoie le [XmlNameTable](../xmlnametable/) utilisé pour atomiser les chaînes. Pour plus d’informations sur les chaînes atomisées, voir [XmlNameTable](../xmlnametable/). |
| [get_PublicId](./get_publicid/)() | Renvoie l’identifiant public. |
| [get_SystemId](./get_systemid/)() | Renvoie l’identifiant système. |
| [get_XmlLang](./get_xmllang/)() | Renvoie la portée actuelle de **xml:lang**. |
| [get_XmlSpace](./get_xmlspace/)() | Renvoie la portée actuelle de **xml:space**. |
| [set_BaseURI](./set_baseuri/)(const String\&) | Définit l’URI de base. |
| [set_DocTypeName](./set_doctypename/)(const String\&) | Définit le nom de la déclaration de type de document. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Définit le type d'encodage. |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | Définit le sous-ensemble DTD interne. |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | Définit le [XmlNamespaceManager](../xmlnamespacemanager/). |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Définit le [XmlNameTable](../xmlnametable/) utilisé pour atomiser les chaînes. Pour plus d'informations sur les chaînes atomisées, voir [XmlNameTable](../xmlnametable/). |
| [set_PublicId](./set_publicid/)(const String\&) | Définit l'identifiant public. |
| [set_SystemId](./set_systemid/)(const String\&) | Définit l'identifiant système. |
| [set_XmlLang](./set_xmllang/)(const String\&) | Définit la portée actuelle de **xml:lang**. |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | Définit la portée actuelle de **xml:space**. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | Initialise une nouvelle instance de la classe [XmlParserContext](./) avec le [XmlNameTable](../xmlnametable/) spécifié, le [XmlNamespaceManager](../xmlnamespacemanager/) spécifié, les valeurs **xml:lang** et **xml:space**. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Initialise une nouvelle instance de la classe [XmlParserContext](./) avec le [XmlNameTable](../xmlnametable/) spécifié, le [XmlNamespaceManager](../xmlnamespacemanager/) spécifié, les valeurs **xml:lang**, **xml:space**, et l'encodage. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | Initialise une nouvelle instance de la classe [XmlParserContext](./) avec le [XmlNameTable](../xmlnametable/) spécifié, le [XmlNamespaceManager](../xmlnamespacemanager/) spécifié, l'URI de base, les valeurs **xml:lang**, **xml:space**, et le type de document. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Initialise une nouvelle instance de la classe [XmlParserContext](./) avec le [XmlNameTable](../xmlnametable/) spécifié, le [XmlNamespaceManager](../xmlnamespacemanager/) spécifié, l'URI de base, les valeurs **xml:lang**, **xml:space**, l'encodage et le type de document. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
