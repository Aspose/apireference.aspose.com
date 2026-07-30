---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader constructeur"
linktitle: "Lecteur de validation XML"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader constructeur. Initialise une nouvelle instance de la classe XmlValidatingReader avec les valeurs spécifiées en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialise une nouvelle instance de la classe [XmlValidatingReader](../) avec les valeurs spécifiées.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Le flux contenant le fragment XML à analyser. |
| fragType | XmlNodeType | Le [XmlNodeType](../../xmlnodetype/) du fragment XML. Cela détermine ce que le fragment peut contenir (voir le tableau ci‑dessus). |
| context | const SharedPtr\<XmlParserContext\>\& | Le [XmlParserContext](../../xmlparsercontext/) dans lequel le fragment XML doit être analysé. Cela inclut le [XmlNameTable](../../xmlnametable/) à utiliser, l'encodage, la portée de l'espace de noms, le **xml:lang** actuel et la portée **xml:space**. |
## Remarques



Le tableau suivant répertorie les valeurs valides pour **fragType** et la façon dont le lecteur analyse chacun des différents types de nœuds. |||
|-|-|
| XmlNodeType | Le fragment peut contenir |
| Élément | Tout contenu d'élément valide (par exemple, toute combinaison d'éléments, de commentaires, d'instructions de traitement, de CDATA, de texte et de références d'entité). |
| Attribut | La valeur d'un attribut (la partie à l'intérieur des guillemets). |
| Document | Le contenu d'un document XML complet ; cela impose les règles au niveau du document. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


Initialise une nouvelle instance de la classe [XmlValidatingReader](../) qui valide le contenu renvoyé par le [XmlReader](../../xmlreader/) fourni.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | Le [XmlReader](../../xmlreader/) à lire pendant la validation. L'implémentation actuelle ne prend en charge que le [XmlTextReader](../../xmltextreader/). |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialise une nouvelle instance de la classe [XmlValidatingReader](../) avec les valeurs spécifiées.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| xmlFragment | const String\& | La chaîne contenant le fragment XML à analyser. |
| fragType | XmlNodeType | Le [XmlNodeType](../../xmlnodetype/) du fragment XML. Cela détermine également ce que la chaîne du fragment peut contenir (voir le tableau ci-dessous). |
| context | const SharedPtr\<XmlParserContext\>\& | Le [XmlParserContext](../../xmlparsercontext/) dans lequel le fragment XML doit être analysé. Cela inclut le [NameTable](../../nametable/) à utiliser, l'encodage, la portée des espaces de noms, le **xml:lang** actuel et la portée du **xml:space**. |
## Remarques



Le tableau suivant répertorie les valeurs valides pour **fragType** et la façon dont le lecteur analyse chacun des différents types de nœuds. |||
|-|-|
| XmlNodeType | Le fragment peut contenir |
| Élément | Tout contenu d'élément valide (par exemple, toute combinaison d'éléments, de commentaires, d'instructions de traitement, de CDATA, de texte et de références d'entité). |
| Attribut | La valeur d'un attribut (la partie à l'intérieur des guillemets). |
| Document | Le contenu d'un document XML complet ; cela impose les règles au niveau du document. |

## Voir aussi

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
