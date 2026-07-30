---
title: "Espace de noms System::Xml"
linktitle: "System::Xml"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser l'espace de noms System::Xml en C++."
type: docs
weight: 7800
url: /fr/cpp/system.xml/
---



## Classes

| Classe | Description |
| --- | --- |
| [IApplicationResourceStreamResolver](./iapplicationresourcestreamresolver/) | Représente un résolveur de flux de ressources d'application. |
| [IHasXmlNode](./ihasxmlnode/) | Permet à une classe de renvoyer un [XmlNode](./xmlnode/) depuis le contexte ou la position actuelle. |
| [IXmlLineInfo](./ixmllineinfo/) | Fournit une interface permettant à une classe de renvoyer les informations de ligne et de position. |
| [IXmlNamespaceResolver](./ixmlnamespaceresolver/) | Fournit un accès en lecture seule à un ensemble de préfixes et de mappages d'espaces de noms. |
| [NameTable](./nametable/) | Implémente une [XmlNameTable](./xmlnametable/) à un seul thread. |
| [XmlAttribute](./xmlattribute/) | Représente un attribut. Les valeurs valides et par défaut de l'attribut sont définies dans une définition de type de document (DTD) ou un schéma. |
| [XmlAttributeCollection](./xmlattributecollection/) | Représente une collection d'attributs qui peuvent être accédés par nom ou index. |
| [XmlCDataSection](./xmlcdatasection/) | Représente une section CDATA. |
| [XmlCharacterData](./xmlcharacterdata/) | Fournit des méthodes de manipulation de texte utilisées par plusieurs classes. |
| [XmlCharType](./xmlchartype/) | À des fins internes. N'utilisez pas cette classe directement. |
| [XmlComment](./xmlcomment/) | Représente le contenu d'un commentaire XML. |
| [XmlConvert](./xmlconvert/) | Encode et décode les noms XML, et fournit des méthodes pour convertir entre les types d'exécution et les types du langage de définition XML [Schema](../system.xml.schema/) (XSD). Lors de la conversion des types de données, les valeurs renvoyées sont indépendantes de la locale. |
| [XmlDeclaration](./xmldeclaration/) | Représente le nœud de déclaration XML **<?xml version='1.0'...?>**. |
| [XmlDocument](./xmldocument/) | Représente un document XML. Vous pouvez utiliser cette classe pour charger, valider, modifier, ajouter et positionner le XML dans un document. |
| [XmlDocumentFragment](./xmldocumentfragment/) | Représente un objet léger utile pour les opérations d'insertion d'arbre. |
| [XmlDocumentType](./xmldocumenttype/) | Représente la déclaration de type de document. |
| [XmlElement](./xmlelement/) | Représente un élément. |
| [XmlEntity](./xmlentity/) | Représente une déclaration d'entité, telle que **<!ENTITY... >**. |
| [XmlEntityReference](./xmlentityreference/) | Représente un nœud de référence d'entité. |
| [XmlImplementation](./xmlimplementation/) | Définit le contexte pour un ensemble d'objets [XmlDocument](./xmldocument/). |
| [XmlLinkedNode](./xmllinkednode/) | Renvoie le nœud immédiatement précédent ou suivant ce nœud. |
| [XmlNamedNodeMap](./xmlnamednodemap/) | Représente une collection de nœuds qui peuvent être accédés par nom ou indice. |
| [XmlNamespaceManager](./xmlnamespacemanager/) | Résout, ajoute et supprime des espaces de noms dans une collection et assure la gestion de la portée pour ces espaces de noms. |
| [XmlNameTable](./xmlnametable/) | Tableau d'objets chaîne atomisés. |
| [XmlNode](./xmlnode/) | Représente un nœud unique dans le document XML. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/) | Fournit des données pour les événements **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** et **XmlDocument::NodeRemoving**. |
| [XmlNodeList](./xmlnodelist/) | Représente une collection ordonnée de nœuds. |
| [XmlNodeReader](./xmlnodereader/) | Représente un lecteur qui fournit un accès rapide, non mis en cache, en avant uniquement aux données XML dans un [XmlNode](./xmlnode/). |
| [XmlNotation](./xmlnotation/) | Représente une déclaration de notation, telle que **<!NOTATION... >**. |
| [XmlParserContext](./xmlparsercontext/) | Fournit toutes les informations de contexte requises par le [XmlReader](./xmlreader/) pour analyser un fragment XML. |
| [XmlProcessingInstruction](./xmlprocessinginstruction/) | Représente une instruction de traitement, que XML définit pour conserver les informations spécifiques au processeur dans le texte du document. |
| [XmlQualifiedName](./xmlqualifiedname/) | Représente un nom qualifié XML. |
| [XmlReader](./xmlreader/) | Représente un lecteur qui fournit un accès rapide, non mis en cache, en avant uniquement aux données XML. |
| [XmlReaderSettings](./xmlreadersettings/) | Spécifie un ensemble de fonctionnalités à prendre en charge sur l'objet [XmlReader](./xmlreader/) créé par la méthode [XmlReader::Create](./xmlreader/create/). |
| [XmlResolver](./xmlresolver/) | Résout les ressources XML externes nommées par un Uniform Resource Identifier (URI). |
| [XmlSecureResolver](./xmlsecureresolver/) | Aide à sécuriser une autre implémentation de [XmlResolver](./xmlresolver/) en encapsulant l'objet [XmlResolver](./xmlresolver/) et en limitant les ressources auxquelles le [XmlResolver](./xmlresolver/) sous-jacent a accès. |
| [XmlSignificantWhitespace](./xmlsignificantwhitespace/) | Représente les espaces blancs entre les balises dans un nœud à contenu mixte ou les espaces blancs à l'intérieur d'une portée **xml:space='preserve'**. Cela est également appelé espace blanc significatif. |
| [XmlText](./xmltext/) | Représente le contenu texte d'un élément ou d'un attribut. |
| [XmlTextReader](./xmltextreader/) | Représente un lecteur qui fournit un accès rapide, non mis en cache, en avant uniquement aux données XML. |
| [XmlTextWriter](./xmltextwriter/) | Représente un écrivain qui fournit une méthode rapide, non mise en cache, en avant uniquement pour générer des flux ou des fichiers contenant des données XML conformes à la spécification W3C Extensible Markup Language (XML) 1.0 et aux recommandations Namespaces in XML. |
| [XmlUrlResolver](./xmlurlresolver/) | Résout les ressources XML externes nommées par un Uniform Resource Identifier (URI). |
| [XmlValidatingReader](./xmlvalidatingreader/) | Représente un lecteur qui fournit la validation de la définition de type de document (DTD), du schéma XML-Data Reduced (XDR) et du langage de définition de schéma XML [Schema](../system.xml.schema/) (XSD). |
| [XmlWhitespace](./xmlwhitespace/) | Représente les espaces blancs dans le contenu d'un élément. |
| [XmlWriter](./xmlwriter/) | Représente un écrivain qui fournit une méthode rapide, non mise en cache et en lecture seule avant pour générer des flux ou des fichiers contenant des données XML. |
| [XmlWriterSettings](./xmlwritersettings/) | Spécifie un ensemble de fonctionnalités à prendre en charge sur l'objet [XmlWriter](./xmlwriter/) créé par la méthode [XmlWriter::Create](./xmlwriter/create/). |
## Enums

| Énumération | Description |
| --- | --- |
| [ConformanceLevel](./conformancelevel/) | Spécifie le niveau de vérification des entrées ou sorties que les objets [XmlReader](./xmlreader/) et [XmlWriter](./xmlwriter/) effectuent. |
| [DtdProcessing](./dtdprocessing/) | Spécifie les options de traitement des DTD. L'énumération [DtdProcessing](./dtdprocessing/) est utilisée par la classe [XmlReaderSettings](./xmlreadersettings/). |
| [EntityHandling](./entityhandling/) | Spécifie comment le [XmlTextReader](./xmltextreader/) ou le [XmlValidatingReader](./xmlvalidatingreader/) gèrent les entités. |
| [ExceptionType](./exceptiontype/) |  |
| [Formatting](./formatting/) | Spécifie les options de formatage pour le [XmlTextWriter](./xmltextwriter/). |
| [NamespaceHandling](./namespacehandling/) | Spécifie s'il faut supprimer les déclarations d'espaces de noms en double dans le [XmlWriter](./xmlwriter/). |
| [NewLineHandling](./newlinehandling/) | Spécifie comment gérer les sauts de ligne. |
| [ReadState](./readstate/) | Spécifie l'état du lecteur. |
| [TriState](./tristate/) |  |
| [ValidationType](./validationtype/) | Spécifie le type de validation à effectuer. |
| [WhitespaceHandling](./whitespacehandling/) | Spécifie comment les espaces blancs sont gérés. |
| [WriteState](./writestate/) | Spécifie l'état du [XmlWriter](./xmlwriter/). |
| [XmlDateTimeSerializationMode](./xmldatetimeserializationmode/) | Spécifie comment traiter la valeur temporelle lors de la conversion entre chaîne et [DateTime](../system/datetime/). |
| [XmlNamespaceScope](./xmlnamespacescope/) | Définit la portée de l'espace de noms. |
| [XmlNodeChangedAction](./xmlnodechangedaction/) | Spécifie le type de modification de nœud. |
| [XmlNodeOrder](./xmlnodeorder/) | Décrit l'ordre du document d'un nœud par rapport à un second nœud. |
| [XmlNodeType](./xmlnodetype/) | Spécifie le type de nœud. |
| [XmlOutputMethod](./xmloutputmethod/) | Spécifie la méthode utilisée pour sérialiser la sortie du [XmlWriter](./xmlwriter/). |
| [XmlSpace](./xmlspace/) | Spécifie la portée actuelle de **xml:space**. |
| [XmlStandalone](./xmlstandalone/) |  |
| [XmlTokenizedType](./xmltokenizedtype/) | Représente le type XML pour la chaîne. Cela permet de lire la chaîne comme un type XML particulier, par exemple un type de section CDATA. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [XmlException](./xmlexception/) |  |
| [XmlNodeChangedEventHandler](./xmlnodechangedeventhandler/) | Représente la méthode qui gère les événements **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** et **XmlDocument::NodeRemoving**. |
## Functions

| Fonction | Description |
| --- | --- |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
