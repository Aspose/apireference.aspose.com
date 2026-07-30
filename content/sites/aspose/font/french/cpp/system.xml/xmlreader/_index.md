---
title: "System::Xml::XmlReader classe"
linktitle: "Lecteur XML"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlReader classe. Représente un lecteur qui fournit un accès rapide, non mis en cache et en lecture seule avant vers les données XML en C++."
type: docs
weight: 3300
url: /fr/cpp/system.xml/xmlreader/
---
## XmlReader class


Représente un lecteur qui fournit un accès rapide, non mis en cache, en avant uniquement aux données XML.

```cpp
class XmlReader : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Close](./close/)() | Lorsqu'il est remplacé dans une classe dérivée, modifie le [XmlReader::get_ReadState](./get_readstate/) en [ReadState::Closed](../readstate/). |
| static [Create](./create/)(const String\&) | Crée une nouvelle instance de [XmlReader](./) avec l'URI spécifié. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | Crée une nouvelle instance de [XmlReader](./) en utilisant l'URI et les paramètres spécifiés. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Crée une nouvelle instance de [XmlReader](./) en utilisant l'URI, les paramètres et les informations de contexte spécifiés pour l'analyse. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Crée une nouvelle instance de [XmlReader](./) en utilisant le flux spécifié avec les paramètres par défaut. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Crée une nouvelle instance de [XmlReader](./) avec le flux et les paramètres spécifiés. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Crée une nouvelle instance de [XmlReader](./) en utilisant le flux spécifié, l'URI de base et les paramètres. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Crée une nouvelle instance de [XmlReader](./) en utilisant le flux spécifié, les paramètres et les informations de contexte pour l'analyse. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | Crée une nouvelle instance de [XmlReader](./) en utilisant le lecteur de texte spécifié. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Crée une nouvelle instance de [XmlReader](./) en utilisant le lecteur de texte et les paramètres spécifiés. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Crée une nouvelle instance de [XmlReader](./) en utilisant le lecteur de texte, les paramètres et l'URI de base spécifiés. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Crée une nouvelle instance de [XmlReader](./) en utilisant le lecteur de texte, les paramètres et les informations de contexte pour l'analyse. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | Crée une nouvelle instance de [XmlReader](./) en utilisant le lecteur XML et les paramètres spécifiés. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par l'instance actuelle de la classe [XmlReader](./). |
| virtual [get_AttributeCount](./get_attributecount/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le nombre d'attributs du nœud actuel. |
| virtual [get_BaseURI](./get_baseuri/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient l'URI de base du nœud actuel. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | Renvoie une valeur indiquant si le [XmlReader](./) implémente les méthodes de lecture de contenu binaire. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | Renvoie une valeur indiquant si le [XmlReader](./) implémente la méthode [XmlReader::ReadValueChunk](./readvaluechunk/). |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | Renvoie une valeur indiquant si ce lecteur peut analyser et résoudre les entités. |
| virtual [get_Depth](./get_depth/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient la profondeur du nœud actuel dans le document XML. |
| virtual [get_EOF](./get_eof/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient une valeur indiquant si le lecteur est positionné à la fin du flux. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Renvoie une valeur indiquant si le nœud actuel possède des attributs. |
| virtual [get_HasValue](./get_hasvalue/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient une valeur indiquant si le nœud actuel peut avoir une valeur [XmlReader::get_Value](./get_value/). |
| virtual [get_IsDefault](./get_isdefault/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient une valeur indiquant si le nœud actuel est un attribut généré à partir de la valeur par défaut définie dans la DTD ou le schéma. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient une valeur indiquant si le nœud actuel est un élément vide (par exemple, **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le nom local du nœud actuel. |
| virtual [get_Name](./get_name/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le nom qualifié du nœud actuel. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient l'URI d'espace de noms (tel que défini dans la spécification d'espace de noms du W3C) du nœud sur lequel le lecteur est positionné. |
| virtual [get_NameTable](./get_nametable/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le [XmlNameTable](../xmlnametable/) associé à cette implémentation. |
| virtual [get_NodeType](./get_nodetype/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le type du nœud actuel. |
| virtual [get_Prefix](./get_prefix/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le préfixe d'espace de noms associé au nœud actuel. |
| virtual [get_QuoteChar](./get_quotechar/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient le caractère de guillemet utilisé pour encadrer la valeur d'un nœud d'attribut. |
| virtual [get_ReadState](./get_readstate/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient l'état du lecteur. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Renvoie les informations de schéma qui ont été assignées au nœud actuel à la suite de la validation du schéma. |
| virtual [get_Settings](./get_settings/)() | Renvoie l'objet [XmlReaderSettings](../xmlreadersettings/) utilisé pour créer cette instance de [XmlReader](./). |
| virtual [get_Value](./get_value/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur texte du nœud actuel. |
| virtual [get_ValueType](./get_valuetype/)() | Renvoie le type du nœud actuel. |
| virtual [get_XmlLang](./get_xmllang/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient la portée actuelle **xml:lang**. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient la portée actuelle **xml:space**. |
| virtual [GetAttribute](./getattribute/)(String) | Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'attribut avec la valeur [XmlReader::get_Name](./get_name/) spécifiée. |
| virtual [GetAttribute](./getattribute/)(String, String) | Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'attribut avec les valeurs [XmlReader::get_LocalName](./get_localname/) et [XmlReader::get_NamespaceURI](./get_namespaceuri/) spécifiées. |
| virtual [GetAttribute](./getattribute/)(int32_t) | Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'attribut avec l'index spécifié. |
| virtual [idx_get](./idx_get/)(int32_t) | Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'attribut avec l'index spécifié. |
| virtual [idx_get](./idx_get/)(String) | Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'attribut avec la valeur [XmlReader::get_Name](./get_name/) spécifiée. |
| virtual [idx_get](./idx_get/)(String, String) | Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur de l'attribut avec les valeurs [XmlReader::get_LocalName](./get_localname/) et [XmlReader::get_NamespaceURI](./get_namespaceuri/) spécifiées. |
| static [IsName](./isname/)(const String\&) | Renvoie une valeur indiquant si l'argument de chaîne est un nom XML valide. |
| static [IsNameToken](./isnametoken/)(const String\&) | Renvoie une valeur indiquant si l'argument de chaîne est ou non un jeton de nom XML valide. |
| virtual [IsStartElement](./isstartelement/)() | Appelle [XmlReader::MoveToContent](./movetocontent/) et teste si le nœud de contenu actuel est une balise d'ouverture ou une balise d'élément vide. |
| virtual [IsStartElement](./isstartelement/)(String) | Appelle [XmlReader::MoveToContent](./movetocontent/) et teste si le nœud de contenu actuel est une balise d'ouverture ou une balise d'élément vide et si la valeur [XmlReader::get_Name](./get_name/) de l'élément trouvé correspond à l'argument fourni. |
| virtual [IsStartElement](./isstartelement/)(String, String) | Appelle [XmlReader::MoveToContent](./movetocontent/) et teste si le nœud de contenu actuel est une balise d'ouverture ou une balise d'élément vide et si les valeurs [XmlReader::get_LocalName](./get_localname/) et [XmlReader::get_NamespaceURI](./get_namespaceuri/) de l'élément trouvé correspondent aux chaînes fournies. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Lorsqu'elle est remplacée dans une classe dérivée, résout un préfixe d'espace de noms dans la portée de l'élément actuel. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | Lorsqu'elle est remplacée dans une classe dérivée, se déplace vers l'attribut dont la valeur [XmlReader::get_Name](./get_name/) est spécifiée. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Lorsqu'elle est remplacée dans une classe dérivée, se déplace vers l'attribut dont les valeurs [XmlReader::get_LocalName](./get_localname/) et [XmlReader::get_NamespaceURI](./get_namespaceuri/) sont spécifiées. |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | Lorsqu'elle est remplacée dans une classe dérivée, se déplace vers l'attribut à l'index spécifié. |
| virtual [MoveToContent](./movetocontent/)() | Vérifie si le nœud actuel est un nœud de contenu (texte non blanc, **CDATA**, **Element**, **EndElement**, **EntityReference** ou **EndEntity**). Si le nœud n'est pas un nœud de contenu, le lecteur saute au nœud de contenu suivant ou à la fin du fichier. Il ignore les nœuds des types suivants : **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** ou **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | Lorsqu'elle est remplacée dans une classe dérivée, se déplace vers l'élément qui contient le nœud d'attribut actuel. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Lorsqu'elle est remplacée dans une classe dérivée, se déplace vers le premier attribut. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Lorsqu'elle est remplacée dans une classe dérivée, se déplace vers l'attribut suivant. |
| virtual [Read](./read/)() | Lorsqu'elle est remplacée dans une classe dérivée, lit le nœud suivant du flux. |
| virtual [ReadAttributeValue](./readattributevalue/)() | Lorsqu'elle est remplacée dans une classe dérivée, analyse la valeur de l'attribut en un ou plusieurs nœuds **[Text](../../system.text/)**, **EntityReference** ou **EndEntity**. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Lit le contenu comme un objet du type spécifié. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Lit le contenu et renvoie les octets binaires décodés en Base64. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Lit le contenu et renvoie les octets binaires décodés **BinHex**. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | Lit le contenu texte à la position actuelle comme un [Boolean](../../system/boolean/). |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | Lit le contenu texte à la position actuelle comme un objet [DateTime](../../system/datetime/). |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | Lit le contenu texte à la position actuelle comme un objet [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | Lit le contenu texte à la position actuelle comme un objet [Decimal](../../system/decimal/). |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | Lit le contenu texte à la position actuelle comme un nombre à virgule flottante double précision. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | Lit le contenu texte à la position actuelle comme un nombre à virgule flottante simple précision. |
| virtual [ReadContentAsInt](./readcontentasint/)() | Lit le contenu texte à la position actuelle comme un entier signé de 32 bits. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | Lit le contenu texte à la position actuelle comme un entier signé de 64 bits. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | Lit le contenu texte à la position actuelle comme un [Object](../../system/object/). |
| virtual [ReadContentAsString](./readcontentasstring/)() | Lit le contenu texte à la position actuelle en tant qu'objet [String](../../system/string/). |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Lit le contenu de l'élément en tant que type demandé. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit le contenu de l'élément en tant que type demandé. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Lit l'élément et décode le contenu **Base64**. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Lit l'élément et décode le contenu **BinHex**. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | Lit l'élément actuel et renvoie le contenu sous forme d'objet [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit l'élément actuel et renvoie le contenu sous forme d'objet [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | Lit l'élément actuel et renvoie le contenu sous forme d'objet [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit l'élément actuel et renvoie le contenu sous forme d'objet [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | Lit l'élément actuel et renvoie le contenu sous forme d'objet [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit l'élément actuel et renvoie le contenu sous forme d'objet [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | Lit l'élément actuel et renvoie le contenu sous forme d'un nombre à virgule flottante double précision. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit l'élément actuel et renvoie le contenu sous forme d'un nombre à virgule flottante double précision. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | Lit l'élément actuel et renvoie le contenu sous forme d'un nombre à virgule flottante simple précision. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit l'élément actuel et renvoie le contenu sous forme d'un nombre à virgule flottante simple précision. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | Lit l'élément actuel et renvoie le contenu sous forme d'un entier signé de 32 bits. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit l'élément actuel et renvoie le contenu sous forme d'un entier signé de 32 bits. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | Lit l'élément actuel et renvoie le contenu sous forme d'un entier signé de 64 bits. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit l'élément actuel et renvoie le contenu sous forme d'un entier signé de 64 bits. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | Lit l'élément actuel et renvoie le contenu sous forme d'[Object](../../system/object/). |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit l'élément actuel et renvoie le contenu sous forme d'[Object](../../system/object/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | Lit l'élément actuel et renvoie le contenu sous forme d'objet [String](../../system/string/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit l'élément actuel et renvoie le contenu sous forme d'objet [String](../../system/string/). |
| virtual [ReadElementString](./readelementstring/)() | Lit un élément contenant uniquement du texte. Cependant, il est recommandé d'utiliser la méthode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) à la place, car elle offre une façon plus simple de gérer cette opération. |
| virtual [ReadElementString](./readelementstring/)(String) | Vérifie que la valeur [XmlReader::get_Name](./get_name/) de l'élément trouvé correspond à la chaîne fournie avant de lire un élément contenant uniquement du texte. Cependant, il est recommandé d'utiliser la méthode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) à la place, car elle offre une façon plus simple de gérer cette opération. |
| virtual [ReadElementString](./readelementstring/)(String, String) | Vérifie que les valeurs [XmlReader::get_LocalName](./get_localname/) et [XmlReader::get_NamespaceURI](./get_namespaceuri/) de l'élément trouvé correspondent aux chaînes fournies avant de lire un élément contenant uniquement du texte. Cependant, il est recommandé d'utiliser la méthode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) à la place, car elle offre une façon plus simple de gérer cette opération. |
| virtual [ReadEndElement](./readendelement/)() | Vérifie que le nœud de contenu actuel est une balise de fin et avance le lecteur au nœud suivant. |
| virtual [ReadInnerXml](./readinnerxml/)() | Lorsqu'elle est remplacée dans une classe dérivée, lit tout le contenu, y compris le balisage, sous forme de chaîne. |
| virtual [ReadOuterXml](./readouterxml/)() | Lorsqu'elle est remplacée dans une classe dérivée, lit le contenu, y compris le balisage, représentant ce nœud et tous ses enfants. |
| virtual [ReadStartElement](./readstartelement/)() | Vérifie que le nœud actuel est un élément et avance le lecteur au nœud suivant. |
| virtual [ReadStartElement](./readstartelement/)(String) | Vérifie que le nœud de contenu actuel est un élément avec la valeur [XmlReader::get_Name](./get_name/) donnée et avance le lecteur au nœud suivant. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | Vérifie que le nœud de contenu actuel est un élément avec les valeurs [XmlReader::get_LocalName](./get_localname/) et [XmlReader::get_NamespaceURI](./get_namespaceuri/) données et avance le lecteur au nœud suivant. |
| virtual [ReadString](./readstring/)() | Lorsqu'elle est remplacée dans une classe dérivée, lit le contenu d'un élément ou d'un nœud texte sous forme de chaîne. Cependant, il est recommandé d'utiliser la méthode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) à la place, car elle offre une façon plus simple de gérer cette opération. |
| virtual [ReadSubtree](./readsubtree/)() | Renvoie une nouvelle instance de [XmlReader](./) qui peut être utilisée pour lire le nœud actuel et tous ses descendants. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | Fait avancer le [XmlReader](./) vers le prochain élément descendant avec le nom qualifié spécifié. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | Fait avancer le [XmlReader](./) vers le prochain élément descendant avec le nom local et l'URI d'espace de noms spécifiés. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | Lit jusqu'à ce qu'un élément avec le nom qualifié spécifié soit trouvé. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | Lit jusqu'à ce qu'un élément avec le nom local et l'URI d'espace de noms spécifiés soit trouvé. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | Fait avancer le [XmlReader](./) vers le prochain élément frère avec le nom qualifié spécifié. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | Fait avancer le [XmlReader](./) vers le prochain élément frère avec le nom local et l'URI d'espace de noms spécifiés. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Lit de grands flux de texte intégrés dans un document XML. |
| virtual [ResolveEntity](./resolveentity/)() | Lorsqu'elle est remplacée dans une classe dérivée, résout la référence d'entité pour les nœuds **EntityReference**. |
| virtual [Skip](./skip/)() | Ignore les enfants du nœud actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
