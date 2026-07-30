---
title: "Classe System::Xml::XmlNodeReader"
linktitle: "XmlNodeReader"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlNodeReader. Représente un lecteur qui fournit un accès rapide, non mis en cache, en lecture seule vers l'avant aux données XML dans un XmlNode en C++."
type: docs
weight: 2800
url: /fr/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


Représente un lecteur qui fournit un accès rapide, non mis en cache, en lecture seule vers l'avant aux données XML dans un [XmlNode](../xmlnode/).

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Modifie le [XmlNodeReader::get_ReadState](./get_readstate/) en [ReadState::Closed](../readstate/). |
| [get_AttributeCount](./get_attributecount/)() override | Renvoie le nombre d'attributs du nœud actuel. |
| [get_BaseURI](./get_baseuri/)() override | Renvoie l'URI de base du nœud actuel. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Renvoie une valeur indiquant si le [XmlNodeReader](./) implémente les méthodes de lecture de contenu binaire. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Renvoie une valeur indiquant si ce lecteur peut analyser et résoudre les entités. |
| [get_Depth](./get_depth/)() override | Renvoie la profondeur du nœud actuel dans le document XML. |
| [get_EOF](./get_eof/)() override | Renvoie une valeur indiquant si le lecteur est positionné à la fin du flux. |
| [get_HasAttributes](./get_hasattributes/)() override | Renvoie une valeur indiquant si le nœud actuel possède des attributs. |
| [get_HasValue](./get_hasvalue/)() override | Renvoie une valeur indiquant si le nœud actuel peut avoir une valeur [XmlNodeReader::get_Value](./get_value/). |
| [get_IsDefault](./get_isdefault/)() override | Renvoie une valeur indiquant si le nœud actuel est un attribut généré à partir de la valeur par défaut définie dans la définition de type de document (DTD) ou le schéma. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Renvoie une valeur indiquant si le nœud actuel est un élément vide (par exemple, **<MyElement/>**). |
| [get_LocalName](./get_localname/)() override | Renvoie le nom local du nœud actuel. |
| [get_Name](./get_name/)() override | Renvoie le nom qualifié du nœud actuel. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Renvoie l'URI de l'espace de noms (tel que défini dans la spécification W3C Namespace) du nœud sur lequel le lecteur est positionné. |
| [get_NameTable](./get_nametable/)() override | Renvoie le [XmlNameTable](../xmlnametable/) associé à cette implémentation. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud actuel. |
| [get_Prefix](./get_prefix/)() override | Renvoie le préfixe d'espace de noms associé au nœud actuel. |
| [get_ReadState](./get_readstate/)() override | Renvoie l'état du lecteur. |
| [get_SchemaInfo](./get_schemainfo/)() override | Renvoie les informations de schéma qui ont été assignées au nœud actuel. |
| [get_Value](./get_value/)() override | Renvoie la valeur texte du nœud actuel. |
| [get_XmlLang](./get_xmllang/)() override | Renvoie la portée actuelle de **xml:lang**. |
| [get_XmlSpace](./get_xmlspace/)() override | Renvoie la portée actuelle de **xml:space**. |
| [GetAttribute](./getattribute/)(String) override | Renvoie la valeur de l'attribut avec le nom spécifié. |
| [GetAttribute](./getattribute/)(String, String) override | Renvoie la valeur de l'attribut avec le nom local et l'URI d'espace de noms spécifiés. |
| [GetAttribute](./getattribute/)(int32_t) override | Renvoie la valeur de l'attribut avec l'index spécifié. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Résout un préfixe d'espace de noms dans la portée de l'élément actuel. |
| [MoveToAttribute](./movetoattribute/)(String) override | Se déplace vers l'attribut avec le nom spécifié. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Se déplace vers l'attribut avec le nom local et l'URI d'espace de noms spécifiés. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Se déplace vers l'attribut avec l'index spécifié. |
| [MoveToElement](./movetoelement/)() override | Se déplace vers l'élément qui contient le nœud d'attribut actuel. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Se déplace vers le premier attribut. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Se déplace vers l'attribut suivant. |
| [Read](./read/)() override | Lit le nœud suivant du flux. |
| [ReadAttributeValue](./readattributevalue/)() override | Analyse la valeur de l'attribut en un ou plusieurs nœuds **[Text](../../system.text/)**, **EntityReference**, ou **EndEntity**. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Lit le contenu et renvoie les octets binaires décodés en Base64. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Lit le contenu et renvoie les octets binaires décodés en BinHex. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Lit l'élément et décode le contenu Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Lit l'élément et décode le contenu BinHex. |
| [ReadString](./readstring/)() override | Lit le contenu d'un élément ou d'un nœud texte sous forme de chaîne. |
| [ResolveEntity](./resolveentity/)() override | Résout la référence d'entité pour les nœuds **EntityReference**. |
| [Skip](./skip/)() override | Ignore les enfants du nœud actuel. |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | Crée une instance de la classe [XmlNodeReader](./) en utilisant le [XmlNode](../xmlnode/) spécifié. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
