---
title: "classe System::Xml::XmlValidatingReader"
linktitle: "Lecteur de validation XML"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlValidatingReader class. Représente un lecteur qui fournit la validation de la définition de type de document (DTD), du schéma XML-Data Reduced (XDR) et du langage de définition de schéma XML (XSD) en C++."
type: docs
weight: 4200
url: /fr/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


Représente un lecteur qui fournit la validation de la définition de type de document (DTD), du schéma XML-Data Reduced (XDR) et du langage de définition de schéma XML [Schema](../../system.xml.schema/) (XSD).

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Modifie le [XmlReader::get_ReadState](../xmlreader/get_readstate/) en Closed. |
| [get_AttributeCount](./get_attributecount/)() override | Renvoie le nombre d'attributs du nœud actuel. |
| [get_BaseURI](./get_baseuri/)() override | Renvoie l'URI de base du nœud actuel. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Renvoie une valeur indiquant si le [XmlValidatingReader](./) implémente les méthodes de lecture de contenu binaire. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Renvoie une valeur indiquant si ce lecteur peut analyser et résoudre les entités. |
| [get_Depth](./get_depth/)() override | Renvoie la profondeur du nœud actuel dans le document XML. |
| [get_Encoding](./get_encoding/)() | Renvoie l'attribut d'encodage du document. |
| [get_EntityHandling](./get_entityhandling/)() | Renvoie une valeur qui spécifie comment le lecteur gère les entités. |
| [get_EOF](./get_eof/)() override | Renvoie une valeur indiquant si le lecteur est positionné à la fin du flux. |
| [get_HasValue](./get_hasvalue/)() override | Renvoie une valeur indiquant si le nœud actuel peut avoir un [XmlValidatingReader::get_Value](./get_value/) autre que [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | Renvoie une valeur indiquant si le nœud actuel est un attribut généré à partir de la valeur par défaut définie dans la définition de type de document (DTD) ou le schéma. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Renvoie une valeur indiquant si le nœud actuel est un élément vide (par exemple, **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Renvoie le numéro de ligne actuel. |
| [get_LinePosition](./get_lineposition/)() override | Renvoie la position de ligne actuelle. |
| [get_LocalName](./get_localname/)() override | Renvoie le nom local du nœud actuel. |
| [get_Name](./get_name/)() override | Renvoie le nom qualifié du nœud actuel. |
| [get_Namespaces](./get_namespaces/)() | Renvoie une valeur indiquant s'il faut activer la prise en charge des espaces de noms. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Renvoie l'identifiant uniforme de ressource (URI) de l'espace de noms (tel que défini dans la spécification d'espace de noms du World Wide [Web](../../system.web/) Consortium (W3C)) du nœud sur lequel le lecteur est positionné. |
| [get_NameTable](./get_nametable/)() override | Renvoie le [XmlNameTable](../xmlnametable/) associé à cette implémentation. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud actuel. |
| [get_Prefix](./get_prefix/)() override | Renvoie le préfixe d'espace de noms associé au nœud actuel. |
| [get_QuoteChar](./get_quotechar/)() override | Renvoie le caractère de guillemet utilisé pour entourer la valeur d'un nœud d'attribut. |
| [get_Reader](./get_reader/)() | Renvoie le [XmlReader](../xmlreader/) utilisé pour construire ce [XmlValidatingReader](./). |
| [get_ReadState](./get_readstate/)() override | Renvoie l'état du lecteur. |
| [get_Schemas](./get_schemas/)() | Renvoie une XmlSchemaCollection à utiliser pour la validation. |
| [get_SchemaType](./get_schematype/)() | Renvoie un objet de type de schéma. |
| [get_ValidationType](./get_validationtype/)() | Renvoie une valeur indiquant le type de validation à effectuer. |
| [get_Value](./get_value/)() override | Renvoie la valeur texte du nœud actuel. |
| [get_XmlLang](./get_xmllang/)() override | Renvoie la portée actuelle de **xml:lang**. |
| [get_XmlSpace](./get_xmlspace/)() override | Renvoie la portée actuelle de **xml:space**. |
| [GetAttribute](./getattribute/)(String) override | Renvoie la valeur de l'attribut avec le nom spécifié. |
| [GetAttribute](./getattribute/)(String, String) override | Renvoie la valeur de l'attribut avec le nom local spécifié et l'identifiant uniforme de ressource (URI) de l'espace de noms. |
| [GetAttribute](./getattribute/)(int32_t) override | Renvoie la valeur de l'attribut avec l'index spécifié. |
| [HasLineInfo](./haslineinfo/)() override | Renvoie une valeur indiquant si la classe peut renvoyer des informations de ligne. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Résout un préfixe d'espace de noms dans la portée de l'élément actuel. |
| [MoveToAttribute](./movetoattribute/)(String) override | Se déplace vers l'attribut avec le nom spécifié. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Se déplace vers l'attribut avec le nom local spécifié et l'identifiant uniforme de ressource (URI) de l'espace de noms. |
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
| [ReadTypedValue](./readtypedvalue/)() | Renvoie le type d'exécution pour le type de langage de définition XML [Schema](../../system.xml.schema/) (XSD) spécifié. |
| [ResolveEntity](./resolveentity/)() override | Résout la référence d'entité pour les nœuds **EntityReference**. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Définit une valeur qui spécifie comment le lecteur gère les entités. |
| [set_Namespaces](./set_namespaces/)(bool) | Définit une valeur indiquant s'il faut activer la prise en charge des espaces de noms. |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Définit une valeur indiquant le type de validation à effectuer. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Définit le [XmlResolver](../xmlresolver/) utilisé pour résoudre les références externes de définition de type de document (DTD) et d'emplacement de schéma. Le [XmlResolver](../xmlresolver/) est également utilisé pour gérer tout élément import ou include trouvé dans les schémas XML [Schema](../../system.xml.schema/) (XSD). |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Ajoute un gestionnaire d'événement pour recevoir des informations sur les erreurs de validation de définition de type de document (DTD), de schéma XML-Data Reduced (XDR) et de schéma XML [Schema](../../system.xml.schema/) (XSD). |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Supprime un gestionnaire d'événement pour recevoir des informations sur les erreurs de validation de définition de type de document (DTD), de schéma XML-Data Reduced (XDR) et de schéma XML [Schema](../../system.xml.schema/) (XSD). |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | Initialise une nouvelle instance de la classe [XmlValidatingReader](./) qui valide le contenu renvoyé par le [XmlReader](../xmlreader/) fourni. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialise une nouvelle instance de la classe [XmlValidatingReader](./) avec les valeurs spécifiées. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialise une nouvelle instance de la classe [XmlValidatingReader](./) avec les valeurs spécifiées. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques


## Deprecated
Cette classe est obsolète. Il est recommandé d'utiliser la classe XmlReaderSettings et la méthode XmlReader::Create pour créer un lecteur XML de validation.

Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
