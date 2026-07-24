---
title: "System::Xml::XmlParserContext::XmlParserContext constructeur"
linktitle: "XmlParserContext"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XmlParserContext::XmlParserContext constructeur. Initialise une nouvelle instance de la classe XmlParserContext avec les valeurs spécifiées de XmlNameTable, XmlNamespaceManager, URI de base, xml:lang, xml:space et type de document en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


Initialise une nouvelle instance de la classe [XmlParserContext](../) avec le [XmlNameTable](../../xmlnametable/) spécifié, le [XmlNamespaceManager](../../xmlnamespacemanager/) spécifié, l'URI de base, **xml:lang**, **xml:space**, et les valeurs du type de document.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser pour atomiser les chaînes. Si cette valeur est **nullptr**, la table de noms utilisée pour construire le **nsMgr** est utilisée à la place. Pour plus d'informations sur les chaînes atomisées, voir [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Le [XmlNamespaceManager](../../xmlnamespacemanager/) à utiliser pour rechercher les informations d'espace de noms, ou **nullptr**. |
| docTypeName | const String\& | Le nom de la déclaration de type de document. |
| pubId | const String\& | L'identifiant public. |
| sysId | const String\& | L'identifiant du système. |
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
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Initialise une nouvelle instance de la classe [XmlParserContext](../) avec le [XmlNameTable](../../xmlnametable/), le [XmlNamespaceManager](../../xmlnamespacemanager/), l'URI de base, **xml:lang**, **xml:space**, l'encodage et les valeurs du type de document spécifiées.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser pour atomiser les chaînes. Si cette valeur est **nullptr**, la table de noms utilisée pour construire le **nsMgr** est utilisée à la place. Pour plus d'informations sur les chaînes atomisées, voir [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Le [XmlNamespaceManager](../../xmlnamespacemanager/) à utiliser pour rechercher les informations d'espace de noms, ou **nullptr**. |
| docTypeName | const String\& | Le nom de la déclaration de type de document. |
| pubId | const String\& | L'identifiant public. |
| sysId | const String\& | L'identifiant du système. |
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
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


Initialise une nouvelle instance de la classe [XmlParserContext](../) avec le [XmlNameTable](../../xmlnametable/), le [XmlNamespaceManager](../../xmlnamespacemanager/), les valeurs **xml:lang** et **xml:space** spécifiées.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser pour atomiser les chaînes. Si cette valeur est **nullptr**, la table de noms utilisée pour construire le **nsMgr** est utilisée à la place. Pour plus d'informations sur les chaînes atomisées, voir [XmlNameTable](../../xmlnametable/). |
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
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Initialise une nouvelle instance de la classe [XmlParserContext](../) avec le [XmlNameTable](../../xmlnametable/), le [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space** et l'encodage spécifiés.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Le [XmlNameTable](../../xmlnametable/) à utiliser pour atomiser les chaînes. Si cela est **nullptr**, la table de noms utilisée pour construire le **nsMgr** est utilisée à la place. Pour plus d'informations sur les chaînes atomisées, voir [XmlNameTable](../../xmlnametable/). |
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
* Library [Aspose.Page for C++](../../../)
