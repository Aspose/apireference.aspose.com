---
title: "Classe System::Xml::XmlTextReader"
linktitle: "XmlTextReader"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlTextReader. Représente un lecteur qui fournit un accès rapide, non mis en cache, en lecture avant uniquement aux données XML en C++."
type: docs
weight: 3900
url: /fr/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


Représente un lecteur qui fournit un accès rapide, non mis en cache, en avant uniquement aux données XML.

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Modifie le [XmlReader::get_ReadState](../xmlreader/get_readstate/) en **Closed**. |
| [get_AttributeCount](./get_attributecount/)() override | Renvoie le nombre d'attributs du nœud actuel. |
| [get_BaseURI](./get_baseuri/)() override | Renvoie l'URI de base du nœud actuel. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Renvoie une valeur indiquant si le [XmlTextReader](./) implémente les méthodes de lecture de contenu binaire. |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | Renvoie une valeur indiquant si le [XmlTextReader](./) implémente la méthode [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/). |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Renvoie une valeur indiquant si ce lecteur peut analyser et résoudre les entités. |
| [get_Depth](./get_depth/)() override | Renvoie la profondeur du nœud actuel dans le document XML. |
| [get_DtdProcessing](./get_dtdprocessing/)() | Renvoie l'énumération [DtdProcessing](../dtdprocessing/). |
| [get_Encoding](./get_encoding/)() | Renvoie le codage du document. |
| [get_EntityHandling](./get_entityhandling/)() | Renvoie une valeur qui spécifie comment le lecteur gère les entités. |
| [get_EOF](./get_eof/)() override | Renvoie une valeur indiquant si le lecteur est positionné à la fin du flux. |
| [get_HasValue](./get_hasvalue/)() override | Renvoie une valeur indiquant si le nœud actuel peut avoir un [XmlTextReader::get_Value](./get_value/) différent de [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | Renvoie une valeur indiquant si le nœud actuel est un attribut généré à partir de la valeur par défaut définie dans le DTD ou le schéma. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Renvoie une valeur indiquant si le nœud actuel est un élément vide (par exemple, **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Renvoie le numéro de ligne actuel. |
| [get_LinePosition](./get_lineposition/)() override | Renvoie la position de ligne actuelle. |
| [get_LocalName](./get_localname/)() override | Renvoie le nom local du nœud actuel. |
| [get_Name](./get_name/)() override | Renvoie le nom qualifié du nœud actuel. |
| [get_Namespaces](./get_namespaces/)() | Renvoie une valeur indiquant s'il faut activer la prise en charge des espaces de noms. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Renvoie l'URI de l'espace de noms (tel que défini dans la spécification W3C Namespace) du nœud sur lequel le lecteur est positionné. |
| [get_NameTable](./get_nametable/)() override | Renvoie le [XmlNameTable](../xmlnametable/) associé à cette implémentation. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud actuel. |
| [get_Normalization](./get_normalization/)() | Renvoie une valeur indiquant s'il faut normaliser les espaces blancs et les valeurs d'attribut. |
| [get_Prefix](./get_prefix/)() override | Renvoie le préfixe d'espace de noms associé au nœud actuel. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Renvoie une valeur indiquant s'il faut autoriser le traitement du DTD. |
| [get_QuoteChar](./get_quotechar/)() override | Renvoie le caractère de guillemet utilisé pour entourer la valeur d'un nœud d'attribut. |
| [get_ReadState](./get_readstate/)() override | Renvoie l'état du lecteur. |
| [get_Value](./get_value/)() override | Renvoie la valeur texte du nœud actuel. |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | Renvoie une valeur qui spécifie comment les espaces blancs sont gérés. |
| [get_XmlLang](./get_xmllang/)() override | Renvoie la portée actuelle de **xml:lang**. |
| [get_XmlSpace](./get_xmlspace/)() override | Renvoie la portée actuelle de **xml:space**. |
| [GetAttribute](./getattribute/)(String) override | Renvoie la valeur de l'attribut avec le nom spécifié. |
| [GetAttribute](./getattribute/)(String, String) override | Renvoie la valeur de l'attribut avec le nom local et l'URI d'espace de noms spécifiés. |
| [GetAttribute](./getattribute/)(int32_t) override | Renvoie la valeur de l'attribut avec l'index spécifié. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Renvoie une collection qui contient tous les espaces de noms actuellement en portée. |
| [GetRemainder](./getremainder/)() | Renvoie le reste du XML mis en mémoire tampon. |
| [HasLineInfo](./haslineinfo/)() override | Renvoie une valeur indiquant si la classe peut renvoyer des informations de ligne. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Résout un préfixe d'espace de noms dans la portée de l'élément actuel. |
| [MoveToAttribute](./movetoattribute/)(String) override | Se déplace vers l'attribut avec le nom spécifié. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Se déplace vers l'attribut avec le nom local et l'URI d'espace de noms spécifiés. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Se déplace vers l'attribut avec l'index spécifié. |
| [MoveToElement](./movetoelement/)() override | Se déplace vers l'élément qui contient le nœud d'attribut actuel. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Se déplace vers le premier attribut. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Se déplace vers l'attribut suivant. |
| [Read](./read/)() override | Lit le nœud suivant du flux. |
| [ReadAttributeValue](./readattributevalue/)() override | Analyse la valeur de l'attribut en un ou plusieurs nœuds **[Text](../../system.text/)**, **EntityReference**, ou **EndEntity**. |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Décode Base64 et renvoie les octets binaires décodés. |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Décode **BinHex** et renvoie les octets binaires décodés. |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | Lit le contenu texte d'un élément dans un tampon de caractères. Cette méthode est conçue pour lire de grands flux de texte intégré en l'appelant successivement. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Lit le contenu et renvoie les octets binaires décodés **Base64**. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Lit le contenu et renvoie les octets binaires décodés **BinHex**. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Lit l'élément et décode le contenu Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Lit l'élément et décode le contenu **BinHex**. |
| [ReadString](./readstring/)() override | Lit le contenu d'un élément ou d'un nœud texte sous forme de chaîne. |
| [ResetState](./resetstate/)() | Réinitialise l'état du lecteur à [ReadState::Initial](../readstate/). |
| [ResolveEntity](./resolveentity/)() override | Résout la référence d'entité pour les nœuds **EntityReference**. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Définit l'énumération [DtdProcessing](../dtdprocessing/). |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Définit une valeur qui spécifie comment le lecteur gère les entités. |
| [set_Namespaces](./set_namespaces/)(bool) | Définit une valeur indiquant s'il faut activer la prise en charge des espaces de noms. |
| [set_Normalization](./set_normalization/)(bool) | Définit une valeur indiquant s'il faut normaliser les espaces blancs et les valeurs d'attribut. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Définit une valeur indiquant s'il faut autoriser le traitement DTD. |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | Définit une valeur qui spécifie comment les espaces blancs sont gérés. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Définit le [XmlResolver](../xmlresolver/) utilisé pour résoudre les références DTD. |
| [Skip](./skip/)() override | Ignore les enfants du nœud actuel. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec le flux spécifié. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec l'URL et le flux spécifiés. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec le flux spécifié et le [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec l'URL, le flux et le [XmlNameTable](../xmlnametable/) spécifiés. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec le TextReader spécifié. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec l'URL et le TextReader spécifiés. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec le TextReader spécifié et le [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec l'URL, le TextReader et le [XmlNameTable](../xmlnametable/) spécifiés. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec le flux spécifié, [XmlNodeType](../xmlnodetype/), et [XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec la chaîne spécifiée, [XmlNodeType](../xmlnodetype/), et [XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec le fichier spécifié. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | Initialise une nouvelle instance de la classe [XmlTextReader](./) avec le fichier spécifié et [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Il est recommandé d'utiliser la classe [XmlReader](../xmlreader/) à la place.

Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
