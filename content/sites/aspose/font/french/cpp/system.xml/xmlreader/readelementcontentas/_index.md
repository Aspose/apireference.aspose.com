---
title: "Méthode System::Xml::XmlReader::ReadElementContentAs"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlReader::ReadElementContentAs. Lit le contenu de l'élément comme le type demandé en C++."
type: docs
weight: 5200
url: /fr/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Lit le contenu de l'élément en tant que type demandé.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| returnType | const TypeInfo\& | Le type de la valeur à retourner. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Un objet [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) utilisé pour résoudre les préfixes d'espace de noms liés à la conversion de type. |

### ReturnValue

Le contenu de l'élément converti en l'objet typé demandé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


Vérifie que le nom local et l'URI d'espace de noms spécifiés correspondent à ceux de l'élément actuel, puis lit le contenu de l'élément en tant que type demandé.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| returnType | const TypeInfo\& | Le type de la valeur à retourner. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Un objet [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) utilisé pour résoudre les préfixes d'espace de noms liés à la conversion de type. |
| localName | String | Le nom local de l’élément. |
| namespaceURI | String | L'URI d'espace de noms de l'élément. |

### ReturnValue

Le contenu de l'élément converti en l'objet typé demandé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
