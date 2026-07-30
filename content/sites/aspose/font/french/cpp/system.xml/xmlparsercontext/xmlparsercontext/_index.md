---
title: "System::Xml::XmlParserContext::XmlParserContext constructeur"
linktitle: "XmlParserContext"
second_title: "Aspose.Font pour C++"
description: "Constructeur System::Xml::XmlParserContext::XmlParserContext. Initialise une nouvelle instance de la classe XmlParserContext avec les XmlNameTable, XmlNamespaceManager, l'URI de base, xml:lang, xml:space et les valeurs du type de document spécifiés en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


Initialise une nouvelle instance de la classe [XmlParserContext](../) avec les [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), l'URI de base, **xml:lang**, **xml:space**, et les valeurs du type de document.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser pour atomiser les chaînes. Si c'est **nullptr**, la table de noms utilisée pour construire le **nsMgr** est utilisée à la place. Pour plus d'informations sur les chaînes atomisées, voir [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Le [XmlNamespaceManager](../../xmlnamespacemanager/) à utiliser pour rechercher les informations d'espace de noms, ou **nullptr**. |
| docTypeName | const String\& | Le nom de la déclaration de type de document. |
| pubId | const String\& | L'identifiant public. |
| sysId | const String\& | L'identifiant système. |
| internalSubset | const String\& | Le sous-ensemble DTD interne. Le sous-ensemble DTD est utilisé pour la résolution d'entités, pas pour la validation du document. |
| baseURI | const String\& | L'URI de base pour le fragment XML (l'emplacement à partir duquel le fragment a été chargé). |
| xmlLang | const String\& | La portée **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Une valeur [XmlSpace](../../xmlspace/) indiquant la portée **xml:space**. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Initialise une nouvelle instance de la classe [XmlParserContext](../) avec les [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), l'URI de base, **xml:lang**, **xml:space**, l'encodage et les valeurs du type de document.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser pour atomiser les chaînes. Si c'est **nullptr**, la table de noms utilisée pour construire le **nsMgr** est utilisée à la place. Pour plus d'informations sur les chaînes atomisées, voir [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Le [XmlNamespaceManager](../../xmlnamespacemanager/) à utiliser pour rechercher les informations d'espace de noms, ou **nullptr**. |
| docTypeName | const String\& | Le nom de la déclaration de type de document. |
| pubId | const String\& | L'identifiant public. |
| sysId | const String\& | L'identifiant système. |
| internalSubset | const String\& | Le sous-ensemble DTD interne. Le DTD est utilisé pour la résolution d'entités, pas pour la validation du document. |
| baseURI | const String\& | L'URI de base pour le fragment XML (l'emplacement à partir duquel le fragment a été chargé). |
| xmlLang | const String\& | La portée **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Une valeur [XmlSpace](../../xmlspace/) indiquant la portée **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Un objet Encoding indiquant le paramètre d'encodage. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


Initialise une nouvelle instance de la classe [XmlParserContext](../) avec les [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), les valeurs **xml:lang** et **xml:space**.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser pour atomiser les chaînes. Si c'est **nullptr**, la table de noms utilisée pour construire le **nsMgr** est utilisée à la place. Pour plus d'informations sur les chaînes atomisées, voir [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Le [XmlNamespaceManager](../../xmlnamespacemanager/) à utiliser pour rechercher les informations d'espace de noms, ou **nullptr**. |
| xmlLang | const String\& | La portée **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Une valeur [XmlSpace](../../xmlspace/) indiquant la portée **xml:space**. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Initialise une nouvelle instance de la classe [XmlParserContext](../) avec les [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space**, et l'encodage.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser pour atomiser les chaînes. Si c'est **nullptr**, la table de noms utilisée pour construire le **nsMgr** est utilisée à la place. Pour plus d'informations sur les chaînes atomisées, voir [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Le [XmlNamespaceManager](../../xmlnamespacemanager/) à utiliser pour rechercher les informations d'espace de noms, ou **nullptr**. |
| xmlLang | const String\& | La portée **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Une valeur [XmlSpace](../../xmlspace/) indiquant la portée **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Un objet Encoding indiquant le paramètre d'encodage. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
