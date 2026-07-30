---
title: "System::Xml::XmlReader::ReadContentAs méthode"
linktitle: "ReadContentAs"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlReader::ReadContentAs méthode. Lit le contenu comme un objet du type spécifié en C++."
type: docs
weight: 3900
url: /fr/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


Lit le contenu comme un objet du type spécifié.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| returnType | const TypeInfo\& | Le type de la valeur à retourner. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Un objet [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) qui est utilisé pour résoudre tout préfixe d'espace de noms lié à la conversion de type. Par exemple, cela peut être utilisé lors de la conversion d'un objet [XmlQualifiedName](../../xmlqualifiedname/) en **xs:string**. Cette valeur peut être **nullptr**. |

### ReturnValue

Le contenu texte concaténé ou la valeur d'attribut converti au type demandé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
